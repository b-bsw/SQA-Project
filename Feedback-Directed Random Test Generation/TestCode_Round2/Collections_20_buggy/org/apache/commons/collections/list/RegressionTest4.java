package org.apache.commons.collections.list;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList7 = strItor5.parent;
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor13 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList10, (int) '4');
        int int15 = strList10.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList18 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor21 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList18, (int) '4');
        int int23 = strList18.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean24 = strList10.contains((java.lang.Object) int23);
        java.lang.String str25 = strList10.toString();
        boolean boolean26 = strList7.removeAll((java.util.Collection<java.lang.String>) strList10);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList29 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor32 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList29, (int) '4');
        int int34 = strList29.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        boolean boolean40 = strList29.containsAll((java.util.Collection<java.lang.String>) strList38);
        java.util.Spliterator<java.lang.String> strSpliterator41 = strList29.spliterator();
        java.lang.String str42 = strList29.toString();
        boolean boolean43 = strList10.remove((java.lang.Object) str42);
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList46 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor49 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList46, (int) '4');
        int int51 = strList46.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray53 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList54 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor57 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList54, (int) '4');
        boolean boolean58 = strList46.retainAll((java.util.Collection<java.lang.String>) strList54);
        boolean boolean59 = strList46.isEmpty();
        java.util.ListIterator<java.lang.String> strItor61 = strList46.listIterator(0);
        java.util.Spliterator<java.lang.String> strSpliterator62 = strList46.spliterator();
        boolean boolean63 = strList10.retainAll((java.util.Collection<java.lang.String>) strList46);
        java.lang.String[] strArray65 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList66 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor69 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList66, (int) '4');
        java.lang.Object obj70 = new java.lang.Object();
        int int71 = strList66.indexOf(obj70);
        boolean boolean73 = strList66.equals((java.lang.Object) "[hi!]");
        java.util.stream.Stream<java.lang.String> strStream74 = strList66.parallelStream();
        boolean boolean75 = strList10.addAll((java.util.Collection<java.lang.String>) strList66);
        java.util.Iterator<java.lang.String> strItor76 = strList66.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strSpliterator41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[]" + "'", str42, "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strItor61);
        org.junit.Assert.assertNotNull(strSpliterator62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(strStream74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(strItor76);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode9 = null;
        strItor5.next = strAVLNode9;
        strItor5.nextIndex = 1;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList13 = strItor5.parent;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList14 = strItor5.parent;
        strList14.add((int) (byte) 0, "[]");
        // The following exception was thrown during execution in test generation
        try {
            strList14.add(34, "AVLNode(0,false,hi!,false, faedelung true )");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:34, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.collections.list.TreeList<java.util.AbstractCollection<java.lang.String>> strCollectionList0 = new org.apache.commons.collections.list.TreeList<java.util.AbstractCollection<java.lang.String>>();
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList19 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor22 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList19, (int) '4');
        int int24 = strList19.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList27 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor30 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList27, (int) '4');
        boolean boolean31 = strList19.retainAll((java.util.Collection<java.lang.String>) strList27);
        strList27.clear();
        boolean boolean33 = strList27.isEmpty();
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList36 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor39 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList36, (int) '4');
        int int41 = strList36.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        boolean boolean47 = strList36.containsAll((java.util.Collection<java.lang.String>) strList45);
        java.util.Spliterator<java.lang.String> strSpliterator48 = strList36.spliterator();
        boolean boolean49 = strList27.removeAll((java.util.Collection<java.lang.String>) strList36);
        java.util.Iterator<java.lang.String> strItor50 = strList36.iterator();
        strList36.add((int) (short) 1, "hi!");
        java.lang.String[] strArray55 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList56 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor59 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList56, (int) '4');
        int int60 = strItor59.nextIndex();
        strItor59.nextIndex = '#';
        org.apache.commons.collections.list.TreeList<java.lang.String> strList63 = strItor59.parent;
        java.lang.String[] strArray65 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList66 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor69 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList66, (int) '4');
        int int71 = strList66.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray73 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList74 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor77 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList74, (int) '4');
        boolean boolean78 = strList66.retainAll((java.util.Collection<java.lang.String>) strList74);
        java.lang.String[] strArray80 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList81 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor84 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList81, (int) '4');
        int int86 = strList81.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray89 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList90 = new java.util.ArrayList<java.lang.String>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList90, strArray89);
        boolean boolean92 = strList81.containsAll((java.util.Collection<java.lang.String>) strList90);
        java.util.Spliterator<java.lang.String> strSpliterator93 = strList81.spliterator();
        boolean boolean94 = strList66.equals((java.lang.Object) strSpliterator93);
        boolean boolean95 = strList63.containsAll((java.util.Collection<java.lang.String>) strList66);
        java.util.stream.Stream<java.lang.String> strStream96 = strList63.parallelStream();
        java.lang.Object[] objArray97 = strList63.toArray();
        java.lang.Object[] objArray98 = strList36.toArray(objArray97);
        boolean boolean99 = strList2.equals((java.lang.Object) objArray97);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strSpliterator48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strItor50);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 52 + "'", int60 == 52);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(strSpliterator93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(strStream96);
        org.junit.Assert.assertNotNull(objArray97);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray97), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray97), "[]");
        org.junit.Assert.assertNotNull(objArray98);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray98), "[, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray98), "[, hi!]");
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        int int19 = strItor16.expectedModCount;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode20 = strItor16.current;
        strItor16.expectedModCount = 10;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(strAVLNode20);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.checkModCount();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode7 = strItor5.current;
        boolean boolean8 = strItor5.hasNext();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList9 = strItor5.parent;
        strItor5.expectedModCount = 0;
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList14 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor17 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList14, (int) '4');
        int int18 = strItor17.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList19 = strItor17.parent;
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList22 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor25 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList22, (int) '4');
        int int26 = strItor25.nextIndex();
        strItor25.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode29 = null;
        strItor25.next = strAVLNode29;
        strItor25.nextIndex = 1;
        int int33 = strList19.indexOf((java.lang.Object) strItor25);
        java.lang.String str34 = strItor25.previous();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode35 = strItor25.next;
        java.lang.String str36 = strAVLNode35.getValue();
        strItor5.next = strAVLNode35;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode38 = strAVLNode35.previous();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode41 = strAVLNode35.insert((int) (byte) 0, "[]");
        java.lang.String str42 = strAVLNode35.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(strAVLNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strAVLNode35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(strAVLNode38);
        org.junit.Assert.assertNotNull(strAVLNode41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "AVLNode(1,true,,false, faedelung true )" + "'", str42, "AVLNode(1,true,,false, faedelung true )");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.checkModCount();
        strItor5.currentIndex = (-1);
        strItor5.nextIndex = 100;
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        strList19.clear();
        strList19.clear();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList29 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor32 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList29, (int) '4');
        strItor32.checkModCount();
        strItor32.currentIndex = 1;
        strItor32.expectedModCount = 35;
        int int38 = strItor32.previousIndex();
        int int39 = strList19.lastIndexOf((java.lang.Object) int38);
        java.util.Spliterator<java.lang.String> strSpliterator40 = strList19.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.lang.String> strItor42 = strList19.listIterator((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 51 + "'", int38 == 51);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(strSpliterator40);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.checkModCount();
        strItor5.checkModCount();
        int int8 = strItor5.expectedModCount;
        strItor5.checkModCount();
        strItor5.currentIndex = (byte) 10;
        int int12 = strItor5.nextIndex;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode13 = null;
        strItor5.current = strAVLNode13;
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList17 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor20 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList17, (int) '4');
        int int22 = strList17.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        boolean boolean28 = strList17.containsAll((java.util.Collection<java.lang.String>) strList26);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor30 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList17, (int) (byte) 1);
        java.lang.String str31 = strItor30.previous();
        strItor30.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode34 = strItor30.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode37 = strAVLNode34.insert((int) (byte) 0, "hi!");
        strItor5.next = strAVLNode34;
        java.lang.String str39 = strAVLNode34.getValue();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode40 = strAVLNode34.previous();
        java.lang.String str41 = strAVLNode40.getValue();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode43 = strAVLNode40.get((int) (short) -1);
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode46 = strAVLNode40.insert(35, "AVLNode(0,false,hi!,false, faedelung true )");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(strAVLNode34);
        org.junit.Assert.assertNotNull(strAVLNode37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(strAVLNode40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(strAVLNode43);
        org.junit.Assert.assertNotNull(strAVLNode46);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
        int int16 = strList2.size();
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor18 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) (short) 10);
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode19 = null;
        strItor18.next = strAVLNode19;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList21 = strItor18.parent;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode22 = strItor18.current;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList23 = strItor18.parent;
        strItor18.currentIndex = 97;
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNull(strAVLNode22);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor13 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList10, (int) '4');
        int int15 = strList10.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean16 = strList2.contains((java.lang.Object) int15);
        strList2.clear();
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList20 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor23 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList20, (int) '4');
        strItor23.checkModCount();
        strItor23.checkModCount();
        int int26 = strItor23.expectedModCount;
        strItor23.checkModCount();
        strItor23.currentIndex = (byte) 10;
        int int30 = strItor23.nextIndex;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode31 = null;
        strItor23.current = strAVLNode31;
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList35 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor38 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList35, (int) '4');
        int int40 = strList35.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray43 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        boolean boolean46 = strList35.containsAll((java.util.Collection<java.lang.String>) strList44);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor48 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList35, (int) (byte) 1);
        java.lang.String str49 = strItor48.previous();
        strItor48.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode52 = strItor48.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode55 = strAVLNode52.insert((int) (byte) 0, "hi!");
        strItor23.next = strAVLNode52;
        java.lang.String str57 = strAVLNode52.getValue();
        boolean boolean58 = strList2.remove((java.lang.Object) strAVLNode52);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(strAVLNode52);
        org.junit.Assert.assertNotNull(strAVLNode55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        java.lang.Object obj31 = new java.lang.Object();
        int int32 = strList27.indexOf(obj31);
        int int33 = strList27.size();
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList36 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor39 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList36, (int) '4');
        int int41 = strList36.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        boolean boolean47 = strList36.containsAll((java.util.Collection<java.lang.String>) strList45);
        java.util.Spliterator<java.lang.String> strSpliterator48 = strList36.spliterator();
        java.lang.String str49 = strList36.toString();
        boolean boolean51 = strList36.add("[]");
        java.util.stream.Stream<java.lang.String> strStream52 = strList36.stream();
        boolean boolean53 = strList27.addAll((java.util.Collection<java.lang.String>) strList36);
        java.util.stream.Stream<java.lang.String> strStream54 = strList36.parallelStream();
        java.util.Spliterator<java.lang.String> strSpliterator55 = strList36.spliterator();
        java.lang.Object[] objArray56 = strList36.toArray();
        strAVLNode24.toArray(objArray56, 0);
        strAVLNode24.setValue("[, hi!]");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode61 = strAVLNode24.next();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strAVLNode19);
        org.junit.Assert.assertNotNull(strAVLNode22);
        org.junit.Assert.assertNotNull(strAVLNode24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strSpliterator48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[]" + "'", str49, "[]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strStream52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strStream54);
        org.junit.Assert.assertNotNull(strSpliterator55);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[hi!, []]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[hi!, []]");
        org.junit.Assert.assertNull(strAVLNode61);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        int int16 = strList2.size();
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor18 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) (short) 10);
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode19 = null;
        strItor18.next = strAVLNode19;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList21 = strItor18.parent;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode22 = strItor18.current;
        int int23 = strItor18.previousIndex();
        strItor18.checkModCount();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNull(strAVLNode22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList7 = strItor5.parent;
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor13 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList10, (int) '4');
        int int14 = strItor13.nextIndex();
        strItor13.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode17 = null;
        strItor13.next = strAVLNode17;
        strItor13.nextIndex = 1;
        int int21 = strList7.indexOf((java.lang.Object) strItor13);
        boolean boolean23 = strList7.add("[hi!]");
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList26 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor29 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList26, (int) '4');
        java.lang.Object obj30 = new java.lang.Object();
        int int31 = strList26.indexOf(obj30);
        int int32 = strList26.size();
        strList26.clear();
        java.util.Iterator<java.lang.String> strItor34 = strList26.iterator();
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList37 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor40 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList37, (int) '4');
        int int41 = strItor40.nextIndex;
        int int42 = strItor40.previousIndex();
        int int43 = strItor40.nextIndex;
        int int44 = strItor40.nextIndex;
        boolean boolean45 = strList26.contains((java.lang.Object) strItor40);
        boolean boolean46 = strList7.addAll((java.util.Collection<java.lang.String>) strList26);
        // The following exception was thrown during execution in test generation
        try {
            strList7.add((int) (short) 100, "[, []]");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(strItor34);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 52 + "'", int41 == 52);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 51 + "'", int42 == 51);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 52 + "'", int43 == 52);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 52 + "'", int44 == 52);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList8 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor11 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList8, (int) '4');
        int int13 = strList8.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList16 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor19 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList16, (int) '4');
        int int21 = strList16.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean22 = strList8.contains((java.lang.Object) int21);
        java.lang.String str23 = strList8.toString();
        boolean boolean24 = strList2.containsAll((java.util.Collection<java.lang.String>) strList8);
        java.lang.Object[] objArray25 = strList2.toArray();
        java.util.ListIterator<java.lang.String> strItor27 = strList2.listIterator((int) (byte) 1);
        org.apache.commons.collections.list.TreeList<java.lang.String> strList28 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean29 = strList2.contains((java.lang.Object) strList28);
        java.util.stream.Stream<java.lang.String> strStream30 = strList2.stream();
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList33 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor36 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList33, (int) '4');
        int int37 = strItor36.nextIndex();
        strItor36.nextIndex = '#';
        int int40 = strItor36.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList41 = strItor36.parent;
        java.lang.String str43 = strList41.get((int) (short) 0);
        strList41.clear();
        boolean boolean45 = strList2.containsAll((java.util.Collection<java.lang.String>) strList41);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(strItor27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strStream30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 52 + "'", int37 == 52);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.nextIndex = (-1);
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode8 = strItor5.next;
        int int9 = strItor5.previousIndex();
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList12 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor15 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList12, (int) '4');
        int int17 = strList12.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        boolean boolean23 = strList12.containsAll((java.util.Collection<java.lang.String>) strList21);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor25 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList12, (int) (byte) 1);
        int int26 = strList12.size();
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor28 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList12, (int) (short) 10);
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode29 = null;
        strItor28.next = strAVLNode29;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList31 = strItor28.parent;
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList34 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor37 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList34, (int) '4');
        int int39 = strList34.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        boolean boolean45 = strList34.containsAll((java.util.Collection<java.lang.String>) strList43);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor47 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList34, (int) (byte) 1);
        java.lang.String str48 = strItor47.previous();
        strItor47.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode51 = strItor47.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode54 = strAVLNode51.insert((int) (byte) 0, "hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode56 = strAVLNode54.remove((int) (byte) 0);
        java.lang.String[] strArray58 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList59 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor62 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList59, (int) '4');
        int int63 = strItor62.nextIndex();
        strItor62.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode66 = null;
        strItor62.next = strAVLNode66;
        strItor62.nextIndex = 1;
        strItor62.add("[]");
        int int73 = strAVLNode56.indexOf((java.lang.Object) "[]", 3);
        java.lang.String str74 = strAVLNode56.getValue();
        strItor28.next = strAVLNode56;
        strItor5.next = strAVLNode56;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode79 = strAVLNode56.insert(35, "");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode81 = strAVLNode79.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(strAVLNode8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(strAVLNode51);
        org.junit.Assert.assertNotNull(strAVLNode54);
        org.junit.Assert.assertNotNull(strAVLNode56);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 52 + "'", int63 == 52);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertNotNull(strAVLNode79);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        int int49 = strList28.indexOf((java.lang.Object) (short) -1);
        strList28.clear();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "[]" + "'", str43, "[]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(strStream46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode9 = null;
        strItor5.next = strAVLNode9;
        strItor5.nextIndex = 1;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList13 = strItor5.parent;
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList16 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor19 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList16, (int) '4');
        int int20 = strItor19.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList21 = strItor19.parent;
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList24 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor27 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList24, (int) '4');
        int int29 = strList24.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList32 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor35 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList32, (int) '4');
        int int37 = strList32.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean38 = strList24.contains((java.lang.Object) int37);
        java.lang.String str39 = strList24.toString();
        boolean boolean40 = strList21.removeAll((java.util.Collection<java.lang.String>) strList24);
        java.lang.String str41 = strList24.toString();
        boolean boolean42 = strList13.remove((java.lang.Object) str41);
        boolean boolean44 = strList13.add("");
        java.util.stream.Stream<java.lang.String> strStream45 = strList13.stream();
        java.lang.String[] strArray48 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList49 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor52 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList49, (int) '4');
        int int54 = strList49.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String str55 = strList49.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean56 = strList13.addAll(34, (java.util.Collection<java.lang.String>) strList49);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 34, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[]" + "'", str41, "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strStream45);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "[]" + "'", str55, "[]");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode9 = null;
        strItor5.next = strAVLNode9;
        int int11 = strItor5.nextIndex;
        int int12 = strItor5.expectedModCount;
        strItor5.nextIndex = (byte) 1;
        int int15 = strItor5.currentIndex;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode16 = strItor5.current;
        int int17 = strItor5.currentIndex;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode18 = null;
        strItor5.next = strAVLNode18;
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList22 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor25 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList22, (int) '4');
        int int27 = strList22.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        boolean boolean33 = strList22.containsAll((java.util.Collection<java.lang.String>) strList31);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor35 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList22, (int) (byte) 1);
        java.lang.String str36 = strItor35.previous();
        strItor35.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode39 = strItor35.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode42 = strAVLNode39.insert((int) (byte) 0, "hi!");
        strAVLNode39.setValue("[]");
        strItor5.current = strAVLNode39;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode46 = strAVLNode39.previous();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode49 = strAVLNode39.insert(10, "[hi!]");
        strAVLNode39.setValue("[hi!]");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode52 = strAVLNode39.previous();
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList55 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor58 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList55, (int) '4');
        int int59 = strItor58.nextIndex();
        strItor58.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode62 = null;
        strItor58.next = strAVLNode62;
        strItor58.nextIndex = 1;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList66 = strItor58.parent;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList67 = new org.apache.commons.collections.list.TreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList66);
        java.util.stream.Stream<java.lang.String> strStream68 = strList66.parallelStream();
        int int70 = strAVLNode52.indexOf((java.lang.Object) strStream68, 52);
        java.lang.String[] strArray72 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList73 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList73, strArray72);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor76 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList73, (int) '4');
        strItor76.checkModCount();
        strItor76.checkModCount();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode79 = strItor76.current;
        int int80 = strItor76.expectedModCount;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode81 = null;
        strItor76.next = strAVLNode81;
        int int83 = strItor76.currentIndex;
        int int85 = strAVLNode52.indexOf((java.lang.Object) strItor76, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(strAVLNode16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(strAVLNode39);
        org.junit.Assert.assertNotNull(strAVLNode42);
        org.junit.Assert.assertNotNull(strAVLNode46);
        org.junit.Assert.assertNotNull(strAVLNode49);
        org.junit.Assert.assertNotNull(strAVLNode52);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 52 + "'", int59 == 52);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(strStream68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNull(strAVLNode79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode9 = null;
        strItor5.next = strAVLNode9;
        int int11 = strItor5.nextIndex;
        int int12 = strItor5.nextIndex();
        boolean boolean13 = strItor5.hasPrevious();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        org.apache.commons.collections.list.TreeList<java.lang.String> strList32 = strItor5.parent;
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strAVLNode30);
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
        int int16 = strList2.size();
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor18 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) (short) 10);
        strItor18.nextIndex = (short) 1;
        boolean boolean21 = strItor18.hasPrevious();
        int int22 = strItor18.previousIndex();
        int int23 = strItor18.previousIndex();
        int int24 = strItor18.currentIndex;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode25 = strItor18.current;
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(strAVLNode25);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        strItor25.checkModCount();
        strItor25.checkModCount();
        int int28 = strItor25.expectedModCount;
        strItor25.checkModCount();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode30 = strItor25.current;
        int int31 = strItor25.nextIndex();
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList34 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor37 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList34, (int) '4');
        int int39 = strList34.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        boolean boolean45 = strList34.containsAll((java.util.Collection<java.lang.String>) strList43);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor47 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList34, (int) (byte) 1);
        java.lang.String str48 = strItor47.previous();
        strItor47.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode51 = strItor47.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode54 = strAVLNode51.insert((int) (byte) 0, "hi!");
        java.lang.String str55 = strAVLNode54.getValue();
        java.lang.String str56 = strAVLNode54.getValue();
        java.lang.String str57 = strAVLNode54.toString();
        strItor25.next = strAVLNode54;
        int int59 = strList2.indexOf((java.lang.Object) strItor25);
        strList2.add(2, "AVLNode(0,false,,false, faedelung true )");
        boolean boolean64 = strList2.add("[, ]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(strAVLNode30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(strAVLNode51);
        org.junit.Assert.assertNotNull(strAVLNode54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "AVLNode(1,true,hi!,false, faedelung true )" + "'", str57, "AVLNode(1,true,hi!,false, faedelung true )");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode9 = null;
        strItor5.next = strAVLNode9;
        strItor5.nextIndex = 1;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList13 = strItor5.parent;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList14 = strItor5.parent;
        int int15 = strList14.size();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!", "[hi!]", "", "", "" };
        java.lang.String[] strArray23 = strList14.toArray(strArray22);
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList27 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor30 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList27, (int) '4');
        int int32 = strList27.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        boolean boolean38 = strList27.containsAll((java.util.Collection<java.lang.String>) strList36);
        boolean boolean40 = strList27.equals((java.lang.Object) 10.0f);
        java.lang.Object obj41 = null;
        int int42 = strList27.indexOf(obj41);
        boolean boolean43 = strList14.addAll((int) (short) 0, (java.util.Collection<java.lang.String>) strList27);
        java.lang.Object obj44 = null;
        int int45 = strList27.indexOf(obj44);
        strList27.clear();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", null, "[hi!]", "", "", "" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", null, "[hi!]", "", "", "" });
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        boolean boolean16 = strList10.isEmpty();
        java.util.Iterator<java.lang.String> strItor17 = strList10.iterator();
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
        int int36 = strList31.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        boolean boolean42 = strList31.containsAll((java.util.Collection<java.lang.String>) strList40);
        boolean boolean44 = strList31.equals((java.lang.Object) 10.0f);
        boolean boolean45 = strList18.addAll((java.util.Collection<java.lang.String>) strList31);
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList48 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor51 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList48, (int) '4');
        java.lang.Object obj52 = new java.lang.Object();
        int int53 = strList48.indexOf(obj52);
        boolean boolean55 = strList48.equals((java.lang.Object) "[hi!]");
        java.util.stream.Stream<java.lang.String> strStream56 = strList48.parallelStream();
        java.lang.String[] strArray58 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList59 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor62 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList59, (int) '4');
        strItor62.checkModCount();
        strItor62.checkModCount();
        int int65 = strItor62.expectedModCount;
        strItor62.checkModCount();
        strItor62.currentIndex = (byte) 10;
        int int69 = strList48.indexOf((java.lang.Object) (byte) 10);
        boolean boolean70 = strList31.retainAll((java.util.Collection<java.lang.String>) strList48);
        java.lang.String[] strArray72 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList73 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList73, strArray72);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor76 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList73, (int) '4');
        strItor76.checkModCount();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode78 = strItor76.current;
        boolean boolean79 = strItor76.hasNext();
        strItor76.currentIndex = (byte) 10;
        strItor76.currentIndex = 'a';
        strItor76.expectedModCount = (short) 0;
        int int86 = strItor76.expectedModCount;
        int int87 = strItor76.nextIndex;
        boolean boolean88 = strList31.contains((java.lang.Object) strItor76);
        org.apache.commons.collections.list.TreeList<java.lang.String> strList89 = strItor76.parent;
        boolean boolean90 = strList10.retainAll((java.util.Collection<java.lang.String>) strList89);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor92 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList89, 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strStream56);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNull(strAVLNode78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 52 + "'", int87 == 52);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(strList89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode9 = null;
        strItor5.next = strAVLNode9;
        int int11 = strItor5.nextIndex;
        strItor5.nextIndex = (short) 10;
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList16 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor19 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList16, (int) '4');
        strItor19.checkModCount();
        strItor19.checkModCount();
        int int22 = strItor19.expectedModCount;
        strItor19.checkModCount();
        strItor19.currentIndex = (byte) 10;
        int int26 = strItor19.nextIndex;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode27 = null;
        strItor19.current = strAVLNode27;
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList31 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor34 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList31, (int) '4');
        int int36 = strList31.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        boolean boolean42 = strList31.containsAll((java.util.Collection<java.lang.String>) strList40);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor44 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList31, (int) (byte) 1);
        java.lang.String str45 = strItor44.previous();
        strItor44.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode48 = strItor44.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode51 = strAVLNode48.insert((int) (byte) 0, "hi!");
        strItor19.next = strAVLNode48;
        java.lang.String str53 = strAVLNode48.getValue();
        strItor5.current = strAVLNode48;
        int int55 = strItor5.expectedModCount;
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(strAVLNode48);
        org.junit.Assert.assertNotNull(strAVLNode51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList7 = strItor5.parent;
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor13 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList10, (int) '4');
        int int15 = strList10.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList18 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor21 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList18, (int) '4');
        int int23 = strList18.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean24 = strList10.contains((java.lang.Object) int23);
        java.lang.String str25 = strList10.toString();
        boolean boolean26 = strList7.removeAll((java.util.Collection<java.lang.String>) strList10);
        boolean boolean28 = strList7.add("[]");
        java.lang.String str30 = strList7.get((int) (short) 0);
        java.util.stream.Stream<java.lang.String> strStream31 = strList7.stream();
        java.util.Iterator<java.lang.String> strItor32 = strList7.iterator();
        int int33 = strList7.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertNotNull(strStream31);
        org.junit.Assert.assertNotNull(strItor32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.checkModCount();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode7 = strItor5.current;
        boolean boolean8 = strItor5.hasNext();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList9 = strItor5.parent;
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList12 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor15 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList12, (int) '4');
        int int17 = strList12.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        boolean boolean23 = strList12.containsAll((java.util.Collection<java.lang.String>) strList21);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor25 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList12, (int) (byte) 1);
        java.lang.String str26 = strItor25.previous();
        strItor25.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode29 = strItor25.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode32 = strAVLNode29.insert((int) (byte) 0, "hi!");
        strAVLNode29.setValue("[]");
        java.lang.String str35 = strAVLNode29.toString();
        strItor5.next = strAVLNode29;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode37 = strAVLNode29.previous();
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList40 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor43 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList40, (int) '4');
        int int44 = strItor43.nextIndex();
        strItor43.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode47 = null;
        strItor43.next = strAVLNode47;
        int int49 = strItor43.nextIndex;
        int int50 = strItor43.expectedModCount;
        strItor43.nextIndex = (byte) 1;
        int int53 = strItor43.currentIndex;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode54 = strItor43.current;
        int int55 = strItor43.currentIndex;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode56 = null;
        strItor43.next = strAVLNode56;
        java.lang.String[] strArray59 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList60 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor63 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList60, (int) '4');
        int int65 = strList60.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray68 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        boolean boolean71 = strList60.containsAll((java.util.Collection<java.lang.String>) strList69);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor73 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList60, (int) (byte) 1);
        java.lang.String str74 = strItor73.previous();
        strItor73.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode77 = strItor73.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode80 = strAVLNode77.insert((int) (byte) 0, "hi!");
        strAVLNode77.setValue("[]");
        strItor43.current = strAVLNode77;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode84 = strAVLNode77.previous();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode86 = strAVLNode77.remove(0);
        int int88 = strAVLNode29.indexOf((java.lang.Object) strAVLNode77, 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(strAVLNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strAVLNode29);
        org.junit.Assert.assertNotNull(strAVLNode32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "AVLNode(1,true,[],false, faedelung true )" + "'", str35, "AVLNode(1,true,[],false, faedelung true )");
        org.junit.Assert.assertNotNull(strAVLNode37);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 52 + "'", int44 == 52);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 35 + "'", int49 == 35);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNull(strAVLNode54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(strAVLNode77);
        org.junit.Assert.assertNotNull(strAVLNode80);
        org.junit.Assert.assertNotNull(strAVLNode84);
        org.junit.Assert.assertNotNull(strAVLNode86);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode34 = strAVLNode30.insert(2, "AVLNode(0,false,AVLNode(0,false,,false, faedelung true ),false, faedelung true )");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode37 = strAVLNode34.insert(0, "AVLNode(0,false,hi!,true, faedelung false )");
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList40 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor43 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList40, (int) '4');
        int int44 = strItor43.nextIndex();
        strItor43.nextIndex = '#';
        org.apache.commons.collections.list.TreeList<java.lang.String> strList47 = strItor43.parent;
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList50 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor53 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList50, (int) '4');
        int int55 = strList50.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList58 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor61 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList58, (int) '4');
        boolean boolean62 = strList50.retainAll((java.util.Collection<java.lang.String>) strList58);
        java.lang.String[] strArray64 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList65 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor68 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList65, (int) '4');
        int int70 = strList65.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray73 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        boolean boolean76 = strList65.containsAll((java.util.Collection<java.lang.String>) strList74);
        java.util.Spliterator<java.lang.String> strSpliterator77 = strList65.spliterator();
        boolean boolean78 = strList50.equals((java.lang.Object) strSpliterator77);
        boolean boolean79 = strList47.containsAll((java.util.Collection<java.lang.String>) strList50);
        java.util.stream.Stream<java.lang.String> strStream80 = strList47.parallelStream();
        java.lang.Object[] objArray81 = strList47.toArray();
        // The following exception was thrown during execution in test generation
        try {
            strAVLNode37.toArray(objArray81, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strAVLNode30);
        org.junit.Assert.assertNotNull(strAVLNode34);
        org.junit.Assert.assertNotNull(strAVLNode37);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 52 + "'", int44 == 52);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(strSpliterator77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(strStream80);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray81), "[]");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode9 = null;
        strItor5.next = strAVLNode9;
        strItor5.nextIndex = 1;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList13 = strItor5.parent;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList14 = strItor5.parent;
        int int15 = strList14.size();
        java.lang.Object[] objArray16 = strList14.toArray();
        boolean boolean18 = strList14.add("");
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList21 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor24 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList21, (int) '4');
        int int26 = strList21.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList29 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor32 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList29, (int) '4');
        boolean boolean33 = strList21.retainAll((java.util.Collection<java.lang.String>) strList29);
        strList29.clear();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList35 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList36 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        java.lang.String str37 = strList36.toString();
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList40 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor43 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList40, (int) '4');
        int int45 = strList40.lastIndexOf((java.lang.Object) (byte) -1);
        org.apache.commons.collections.list.TreeList[] treeListArray47 = new org.apache.commons.collections.list.TreeList[2];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections.list.TreeList<java.lang.String>[] strListArray48 = (org.apache.commons.collections.list.TreeList<java.lang.String>[]) treeListArray47;
        strListArray48[0] = strList36;
        strListArray48[1] = strList40;
        org.apache.commons.collections.list.TreeList<java.lang.String>[] strListArray53 = strList35.toArray(strListArray48);
        boolean boolean54 = strList29.contains((java.lang.Object) strList35);
        boolean boolean55 = strList14.retainAll((java.util.Collection<java.lang.String>) strList35);
        java.util.ListIterator<java.lang.String> strItor56 = strList35.listIterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[]" + "'", str37, "[]");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(treeListArray47);
        org.junit.Assert.assertNotNull(strListArray48);
        org.junit.Assert.assertNotNull(strListArray53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(strItor56);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        int int9 = strItor5.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = strItor5.parent;
        java.lang.String str12 = strList10.get((int) (short) 0);
        strList10.clear();
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList16 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor19 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList16, (int) '4');
        strItor19.checkModCount();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode21 = strItor19.current;
        boolean boolean22 = strItor19.hasNext();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode23 = strItor19.next;
        int int24 = strList10.lastIndexOf((java.lang.Object) strAVLNode23);
        java.util.Spliterator<java.lang.String> strSpliterator25 = strList10.spliterator();
        java.lang.Object[] objArray26 = strList10.toArray();
        java.lang.String str27 = strList10.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(strAVLNode21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(strAVLNode23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strSpliterator25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertArrayEquals(objArray26, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex;
        int int7 = strItor5.previousIndex();
        int int8 = strItor5.nextIndex;
        int int9 = strItor5.nextIndex;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode10 = strItor5.current;
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList13 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor16 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList13, (int) '4');
        int int17 = strItor16.nextIndex();
        strItor16.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode20 = null;
        strItor16.next = strAVLNode20;
        int int22 = strItor16.nextIndex;
        int int23 = strItor16.expectedModCount;
        strItor16.nextIndex = (byte) 1;
        int int26 = strItor16.currentIndex;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode27 = strItor16.current;
        int int28 = strItor16.currentIndex;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode29 = null;
        strItor16.next = strAVLNode29;
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList33 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor36 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList33, (int) '4');
        int int38 = strList33.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray41 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        boolean boolean44 = strList33.containsAll((java.util.Collection<java.lang.String>) strList42);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor46 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList33, (int) (byte) 1);
        java.lang.String str47 = strItor46.previous();
        strItor46.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode50 = strItor46.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode53 = strAVLNode50.insert((int) (byte) 0, "hi!");
        strAVLNode50.setValue("[]");
        strItor16.current = strAVLNode50;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode57 = strAVLNode50.previous();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode60 = strAVLNode50.insert(10, "[hi!]");
        strItor5.current = strAVLNode50;
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNull(strAVLNode10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(strAVLNode27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(strAVLNode50);
        org.junit.Assert.assertNotNull(strAVLNode53);
        org.junit.Assert.assertNotNull(strAVLNode57);
        org.junit.Assert.assertNotNull(strAVLNode60);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList7 = strItor5.parent;
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor13 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList10, (int) '4');
        int int15 = strList10.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList18 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor21 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList18, (int) '4');
        int int23 = strList18.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean24 = strList10.contains((java.lang.Object) int23);
        java.lang.String str25 = strList10.toString();
        boolean boolean26 = strList7.removeAll((java.util.Collection<java.lang.String>) strList10);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList29 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor32 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList29, (int) '4');
        int int34 = strList29.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        boolean boolean40 = strList29.containsAll((java.util.Collection<java.lang.String>) strList38);
        java.util.Spliterator<java.lang.String> strSpliterator41 = strList29.spliterator();
        java.lang.String str42 = strList29.toString();
        boolean boolean44 = strList29.add("[]");
        java.util.stream.Stream<java.lang.String> strStream45 = strList29.stream();
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList48 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor51 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList48, (int) '4');
        int int53 = strList48.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray56 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        boolean boolean59 = strList48.containsAll((java.util.Collection<java.lang.String>) strList57);
        java.util.Spliterator<java.lang.String> strSpliterator60 = strList48.spliterator();
        java.lang.String str61 = strList48.toString();
        boolean boolean63 = strList48.add("[]");
        java.util.stream.Stream<java.lang.String> strStream64 = strList48.stream();
        java.util.stream.BaseStream[] baseStreamArray66 = new java.util.stream.BaseStream[2];
        @SuppressWarnings("unchecked")
        java.util.stream.BaseStream<java.lang.String, java.util.stream.Stream<java.lang.String>>[] strBaseStreamArray67 = (java.util.stream.BaseStream<java.lang.String, java.util.stream.Stream<java.lang.String>>[]) baseStreamArray66;
        strBaseStreamArray67[0] = strStream45;
        strBaseStreamArray67[1] = strStream64;
        java.util.stream.BaseStream<java.lang.String, java.util.stream.Stream<java.lang.String>>[] strBaseStreamArray72 = strList7.toArray(strBaseStreamArray67);
        boolean boolean74 = strList7.add("hi!");
        java.lang.String str75 = strList7.toString();
        java.lang.String[] strArray77 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList78 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList78, strArray77);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor81 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList78, (int) '4');
        strItor81.checkModCount();
        strItor81.checkModCount();
        boolean boolean84 = strItor81.hasPrevious();
        strItor81.currentIndex = (short) -1;
        strItor81.expectedModCount = (short) -1;
        boolean boolean89 = strItor81.hasPrevious();
        int int90 = strItor81.nextIndex;
        int int91 = strItor81.previousIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList92 = strItor81.parent;
        strList92.add((int) (byte) 0, "[, []]");
        boolean boolean96 = strList7.containsAll((java.util.Collection<java.lang.String>) strList92);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strSpliterator41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[]" + "'", str42, "[]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strStream45);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strSpliterator60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "[]" + "'", str61, "[]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strStream64);
        org.junit.Assert.assertNotNull(baseStreamArray66);
        org.junit.Assert.assertNotNull(strBaseStreamArray67);
        org.junit.Assert.assertNotNull(strBaseStreamArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "[hi!]" + "'", str75, "[hi!]");
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 52 + "'", int90 == 52);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 51 + "'", int91 == 51);
        org.junit.Assert.assertNotNull(strList92);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.checkModCount();
        // The following exception was thrown during execution in test generation
        try {
            strItor5.set("[hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode9 = null;
        strItor5.next = strAVLNode9;
        int int11 = strItor5.nextIndex;
        int int12 = strItor5.expectedModCount;
        int int13 = strItor5.previousIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList14 = strItor5.parent;
        java.util.stream.Stream<java.lang.String> strStream15 = strList14.parallelStream();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 34 + "'", int13 == 34);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strStream15);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode36 = null;
        strItor35.current = strAVLNode36;
        int int38 = strItor35.expectedModCount;
        int int39 = strItor35.currentIndex;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList40 = strItor35.parent;
        boolean boolean41 = strList40.isEmpty();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList7 = strItor5.parent;
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor13 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList10, (int) '4');
        int int14 = strItor13.nextIndex();
        strItor13.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode17 = null;
        strItor13.next = strAVLNode17;
        strItor13.nextIndex = 1;
        int int21 = strList7.indexOf((java.lang.Object) strItor13);
        boolean boolean23 = strList7.add("[hi!]");
        java.util.Iterator<java.lang.String> strItor24 = strList7.iterator();
        java.lang.String str25 = strList7.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[, [hi!]]" + "'", str25, "[, [hi!]]");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.apache.commons.collections.list.TreeList<java.lang.String> strList0 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        strList0.clear();
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        boolean boolean12 = strList5.addAll((int) (byte) 1, (java.util.Collection<java.lang.String>) strList10);
        java.util.stream.Stream<java.lang.String> strStream13 = strList5.stream();
        int int14 = strList0.indexOf((java.lang.Object) strStream13);
        java.lang.String str15 = strList0.toString();
        strList0.clear();
        java.util.Collection<java.lang.String> strCollection17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = strList0.retainAll(strCollection17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strStream13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        int int16 = strList2.size();
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor18 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) (short) 10);
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode19 = null;
        strItor18.next = strAVLNode19;
        int int21 = strItor18.nextIndex;
        boolean boolean22 = strItor18.hasNext();
        boolean boolean23 = strItor18.hasNext();
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList26 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor29 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList26, (int) '4');
        int int31 = strList26.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        boolean boolean37 = strList26.containsAll((java.util.Collection<java.lang.String>) strList35);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor39 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList26, (int) (byte) 1);
        java.lang.String str40 = strItor39.previous();
        strItor39.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode43 = strItor39.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode46 = strAVLNode43.insert((int) (byte) 0, "hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode48 = strAVLNode46.remove((int) (byte) 0);
        java.lang.String[] strArray50 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList51 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor54 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList51, (int) '4');
        java.lang.String[] strArray56 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList57 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor60 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList57, (int) '4');
        int int62 = strList57.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray64 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList65 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor68 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList65, (int) '4');
        int int70 = strList65.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean71 = strList57.contains((java.lang.Object) int70);
        java.lang.String str72 = strList57.toString();
        boolean boolean73 = strList51.containsAll((java.util.Collection<java.lang.String>) strList57);
        java.util.stream.Stream<java.lang.String> strStream74 = strList57.parallelStream();
        int int76 = strAVLNode46.indexOf((java.lang.Object) strStream74, 0);
        java.lang.String str77 = strAVLNode46.getValue();
        strItor18.current = strAVLNode46;
        // The following exception was thrown during execution in test generation
        try {
            strItor18.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(strAVLNode43);
        org.junit.Assert.assertNotNull(strAVLNode46);
        org.junit.Assert.assertNotNull(strAVLNode48);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "[]" + "'", str72, "[]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(strStream74);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList8 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor11 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList8, (int) '4');
        int int13 = strList8.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList16 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor19 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList16, (int) '4');
        int int21 = strList16.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean22 = strList8.contains((java.lang.Object) int21);
        java.lang.String str23 = strList8.toString();
        boolean boolean24 = strList2.containsAll((java.util.Collection<java.lang.String>) strList8);
        java.lang.Object[] objArray25 = strList2.toArray();
        java.util.ListIterator<java.lang.String> strItor27 = strList2.listIterator((int) (byte) 1);
        org.apache.commons.collections.list.TreeList<java.lang.String> strList28 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean29 = strList2.contains((java.lang.Object) strList28);
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList32 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor35 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList32, (int) '4');
        int int37 = strList32.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList40 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor43 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList40, (int) '4');
        boolean boolean44 = strList32.retainAll((java.util.Collection<java.lang.String>) strList40);
        strList40.clear();
        java.util.ListIterator<java.lang.String> strItor46 = strList40.listIterator();
        java.lang.String[] strArray48 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList49 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor52 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList49, (int) '4');
        java.lang.Object obj53 = new java.lang.Object();
        int int54 = strList49.indexOf(obj53);
        boolean boolean55 = strList40.removeAll((java.util.Collection<java.lang.String>) strList49);
        int int57 = strList49.lastIndexOf((java.lang.Object) (short) 0);
        java.lang.String[] strArray59 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList60 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor63 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList60, (int) '4');
        int int64 = strItor63.nextIndex();
        strItor63.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode67 = null;
        strItor63.next = strAVLNode67;
        strItor63.nextIndex = 1;
        java.lang.Class<?> wildcardClass71 = strItor63.getClass();
        boolean boolean72 = strList49.equals((java.lang.Object) strItor63);
        boolean boolean73 = strList49.isEmpty();
        boolean boolean74 = strList2.contains((java.lang.Object) boolean73);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(strItor27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strItor46);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 52 + "'", int64 == 52);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList36 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor39 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList36, (int) '4');
        int int41 = strList36.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        boolean boolean47 = strList36.containsAll((java.util.Collection<java.lang.String>) strList45);
        java.util.Spliterator<java.lang.String> strSpliterator48 = strList36.spliterator();
        java.lang.String str49 = strList36.toString();
        boolean boolean51 = strList36.add("[]");
        int int52 = strList36.size();
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList55 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor58 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList55, (int) '4');
        strItor58.checkModCount();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode60 = strItor58.current;
        boolean boolean61 = strItor58.hasNext();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList62 = strItor58.parent;
        java.util.Iterator<java.lang.String> strItor63 = strList62.iterator();
        int int64 = strList36.lastIndexOf((java.lang.Object) strList62);
        boolean boolean65 = strList8.addAll((java.util.Collection<java.lang.String>) strList62);
        java.util.stream.Stream<java.lang.String> strStream66 = strList8.stream();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[hi!]" + "'", str22, "[hi!]");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strSpliterator48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[]" + "'", str49, "[]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(strAVLNode60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertNotNull(strItor63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strStream66);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        boolean boolean7 = strItor5.hasNext();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList8 = strItor5.parent;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strList8.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode9 = null;
        strItor5.next = strAVLNode9;
        int int11 = strItor5.nextIndex;
        int int12 = strItor5.expectedModCount;
        strItor5.nextIndex = (byte) 1;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode15 = strItor5.current;
        strItor5.currentIndex = (-2);
        strItor5.nextIndex = (byte) 0;
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(strAVLNode15);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode9 = null;
        strItor5.next = strAVLNode9;
        strItor5.nextIndex = 1;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList13 = strItor5.parent;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList14 = strItor5.parent;
        int int15 = strList14.size();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList18 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor21 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList18, (int) '4');
        int int23 = strList18.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList26 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor29 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList26, (int) '4');
        boolean boolean30 = strList18.retainAll((java.util.Collection<java.lang.String>) strList26);
        strList26.clear();
        strList26.clear();
        boolean boolean33 = strList14.addAll((java.util.Collection<java.lang.String>) strList26);
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList36 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor39 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList36, (int) '4');
        int int40 = strItor39.nextIndex();
        strItor39.nextIndex = '#';
        int int43 = strItor39.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList44 = strItor39.parent;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode45 = strItor39.next;
        strItor39.expectedModCount = (short) -1;
        strItor39.nextIndex = (short) 0;
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList52 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor55 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList52, (int) '4');
        int int57 = strList52.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray60 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        boolean boolean63 = strList52.containsAll((java.util.Collection<java.lang.String>) strList61);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor65 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList52, (int) (byte) 1);
        java.lang.String str66 = strItor65.previous();
        strItor65.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode69 = strItor65.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode72 = strAVLNode69.insert((int) (byte) 0, "hi!");
        strAVLNode69.setValue("[]");
        strItor39.next = strAVLNode69;
        strItor39.expectedModCount = (byte) 1;
        boolean boolean78 = strList14.remove((java.lang.Object) strItor39);
        // The following exception was thrown during execution in test generation
        try {
            strItor39.set("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 35 + "'", int43 == 35);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNull(strAVLNode45);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(strAVLNode69);
        org.junit.Assert.assertNotNull(strAVLNode72);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode9 = null;
        strItor5.next = strAVLNode9;
        int int11 = strItor5.nextIndex;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode12 = null;
        strItor5.next = strAVLNode12;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode14 = null;
        strItor5.current = strAVLNode14;
        int int16 = strItor5.previousIndex();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode17 = strItor5.current;
        int int18 = strItor5.nextIndex;
        strItor5.currentIndex = (short) 1;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList21 = strItor5.parent;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode22 = strItor5.next;
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList25 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor28 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList25, (int) '4');
        int int30 = strList25.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        boolean boolean36 = strList25.containsAll((java.util.Collection<java.lang.String>) strList34);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor38 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList25, (int) (byte) 1);
        java.lang.String str39 = strItor38.previous();
        strItor38.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode42 = strItor38.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode45 = strAVLNode42.insert((int) (byte) 0, "hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode47 = strAVLNode45.remove((int) (byte) 0);
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList50 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor53 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList50, (int) '4');
        int int54 = strItor53.nextIndex();
        strItor53.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode57 = null;
        strItor53.next = strAVLNode57;
        strItor53.nextIndex = 1;
        strItor53.add("[]");
        int int64 = strAVLNode47.indexOf((java.lang.Object) "[]", 3);
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode67 = strAVLNode47.insert((int) (byte) 0, "hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode68 = strAVLNode67.previous();
        strItor5.next = strAVLNode68;
        int int70 = strItor5.previousIndex();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
        org.junit.Assert.assertNull(strAVLNode17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNull(strAVLNode22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(strAVLNode42);
        org.junit.Assert.assertNotNull(strAVLNode45);
        org.junit.Assert.assertNotNull(strAVLNode47);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 52 + "'", int54 == 52);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(strAVLNode67);
        org.junit.Assert.assertNotNull(strAVLNode68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 34 + "'", int70 == 34);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.checkModCount();
        strItor5.checkModCount();
        int int8 = strItor5.expectedModCount;
        strItor5.checkModCount();
        strItor5.currentIndex = (byte) 10;
        int int12 = strItor5.nextIndex;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode13 = null;
        strItor5.current = strAVLNode13;
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList17 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor20 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList17, (int) '4');
        int int22 = strList17.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        boolean boolean28 = strList17.containsAll((java.util.Collection<java.lang.String>) strList26);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor30 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList17, (int) (byte) 1);
        java.lang.String str31 = strItor30.previous();
        strItor30.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode34 = strItor30.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode37 = strAVLNode34.insert((int) (byte) 0, "hi!");
        strItor5.next = strAVLNode34;
        strAVLNode34.setValue("[, [, [, hi!]]]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(strAVLNode34);
        org.junit.Assert.assertNotNull(strAVLNode37);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.nextIndex = (-1);
        int int8 = strItor5.previousIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList9 = strItor5.parent;
        int int10 = strItor5.previousIndex();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode11 = strItor5.next;
        int int12 = strItor5.currentIndex;
        int int13 = strItor5.expectedModCount;
        boolean boolean14 = strItor5.hasPrevious();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertNull(strAVLNode11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
        int int18 = strList2.size();
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList21 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor24 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList21, (int) '4');
        strItor24.checkModCount();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode26 = strItor24.current;
        boolean boolean27 = strItor24.hasNext();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList28 = strItor24.parent;
        java.util.Iterator<java.lang.String> strItor29 = strList28.iterator();
        int int30 = strList2.lastIndexOf((java.lang.Object) strList28);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        boolean boolean41 = strList34.addAll((int) (byte) 1, (java.util.Collection<java.lang.String>) strList39);
        java.lang.String str42 = strList39.toString();
        java.util.Spliterator<java.lang.String> strSpliterator43 = strList39.spliterator();
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList46 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor49 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList46, (int) '4');
        strItor49.nextIndex = (-1);
        int int52 = strItor49.previousIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList53 = strItor49.parent;
        strList53.clear();
        java.lang.String[] strArray56 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList57 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor60 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList57, (int) '4');
        int int62 = strList57.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray65 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        boolean boolean68 = strList57.containsAll((java.util.Collection<java.lang.String>) strList66);
        java.util.Spliterator<java.lang.String> strSpliterator69 = strList57.spliterator();
        java.lang.String str70 = strList57.toString();
        boolean boolean72 = strList57.add("[]");
        java.util.stream.Stream<java.lang.String> strStream73 = strList57.stream();
        boolean boolean74 = strList57.isEmpty();
        java.lang.String str77 = strList57.set(1, "[, [, hi!]]");
        java.lang.String str79 = strList57.get((int) (short) 1);
        boolean boolean80 = strList53.retainAll((java.util.Collection<java.lang.String>) strList57);
        java.util.Spliterator<java.lang.String> strSpliterator81 = strList53.spliterator();
        boolean boolean82 = strList39.equals((java.lang.Object) strSpliterator81);
        boolean boolean83 = strList2.remove((java.lang.Object) strSpliterator81);
        boolean boolean85 = strList2.add("AVLNode(0,false,hi!,false, faedelung true )");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(strAVLNode26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(strItor29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[hi!]" + "'", str42, "[hi!]");
        org.junit.Assert.assertNotNull(strSpliterator43);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-2) + "'", int52 == (-2));
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strSpliterator69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "[]" + "'", str70, "[]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(strStream73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "[]" + "'", str77, "[]");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "[, [, hi!]]" + "'", str79, "[, [, hi!]]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(strSpliterator81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
        java.lang.String str28 = strAVLNode27.getValue();
        java.lang.String str29 = strAVLNode27.getValue();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strAVLNode19);
        org.junit.Assert.assertNotNull(strAVLNode22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(strAVLNode24);
        org.junit.Assert.assertNotNull(strAVLNode27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList7 = strItor5.parent;
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor13 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList10, (int) '4');
        int int15 = strList10.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList18 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor21 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList18, (int) '4');
        int int23 = strList18.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean24 = strList10.contains((java.lang.Object) int23);
        java.lang.String str25 = strList10.toString();
        boolean boolean26 = strList7.removeAll((java.util.Collection<java.lang.String>) strList10);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList30 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor33 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList30, (int) '4');
        int int35 = strList30.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList38 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor41 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList38, (int) '4');
        int int43 = strList38.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean44 = strList30.contains((java.lang.Object) int43);
        java.lang.String str45 = strList30.toString();
        boolean boolean47 = strList30.equals((java.lang.Object) (byte) 100);
        java.util.stream.Stream<java.lang.String> strStream48 = strList30.parallelStream();
        java.util.stream.Stream<java.lang.String> strStream49 = strList30.stream();
        boolean boolean50 = strList7.addAll((int) (byte) 0, (java.util.Collection<java.lang.String>) strList30);
        java.lang.String[] strArray52 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList53 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor56 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList53, (int) '4');
        int int58 = strList53.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray61 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        boolean boolean64 = strList53.containsAll((java.util.Collection<java.lang.String>) strList62);
        boolean boolean66 = strList53.equals((java.lang.Object) 10.0f);
        java.lang.Object obj67 = null;
        int int68 = strList53.indexOf(obj67);
        int int70 = strList53.indexOf((java.lang.Object) 1.0d);
        java.lang.String[] strArray72 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList73 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList73, strArray72);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor76 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList73, (int) '4');
        int int77 = strItor76.nextIndex();
        strItor76.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode80 = null;
        strItor76.next = strAVLNode80;
        strItor76.nextIndex = 1;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList84 = strItor76.parent;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList85 = new org.apache.commons.collections.list.TreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList84);
        boolean boolean86 = strList53.containsAll((java.util.Collection<java.lang.String>) strList85);
        java.util.ListIterator<java.lang.String> strItor87 = strList85.listIterator();
        int int88 = strList85.size();
        boolean boolean89 = strList30.addAll((java.util.Collection<java.lang.String>) strList85);
        // The following exception was thrown during execution in test generation
        try {
            strList85.add((int) '#', "AVLNode(1,true,AVLNode(0,false,,false, faedelung true ),false, faedelung true )");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:35, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[]" + "'", str45, "[]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strStream48);
        org.junit.Assert.assertNotNull(strStream49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 52 + "'", int77 == 52);
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(strItor87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        java.lang.Object obj6 = new java.lang.Object();
        int int7 = strList2.indexOf(obj6);
        boolean boolean9 = strList2.equals((java.lang.Object) "[hi!]");
        java.lang.Object obj10 = null;
        int int11 = strList2.indexOf(obj10);
        java.lang.String str12 = strList2.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.checkModCount();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList7 = strItor5.parent;
        java.lang.Object[] objArray8 = strList7.toArray();
        boolean boolean9 = strList7.isEmpty();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList28 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor31 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList28, (int) '4');
        int int32 = strItor31.nextIndex();
        strItor31.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode35 = null;
        strItor31.next = strAVLNode35;
        strItor31.nextIndex = 1;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList39 = strItor31.parent;
        boolean boolean40 = strList19.removeAll((java.util.Collection<java.lang.String>) strList39);
        boolean boolean42 = strList19.add("[]");
        java.lang.Object[] objArray43 = strList19.toArray();
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList46 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor49 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList46, (int) '4');
        int int51 = strList46.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        boolean boolean57 = strList46.containsAll((java.util.Collection<java.lang.String>) strList55);
        boolean boolean59 = strList46.equals((java.lang.Object) 10.0f);
        java.lang.Object obj60 = null;
        int int61 = strList46.indexOf(obj60);
        int int63 = strList46.indexOf((java.lang.Object) 1.0d);
        java.lang.String[] strArray65 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList66 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor69 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList66, (int) '4');
        int int70 = strItor69.nextIndex();
        strItor69.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode73 = null;
        strItor69.next = strAVLNode73;
        strItor69.nextIndex = 1;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList77 = strItor69.parent;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList78 = new org.apache.commons.collections.list.TreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList77);
        boolean boolean79 = strList46.containsAll((java.util.Collection<java.lang.String>) strList78);
        java.lang.String str81 = strList78.remove(0);
        int int82 = strList19.indexOf((java.lang.Object) strList78);
        java.util.Iterator<java.lang.String> strItor83 = strList78.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator84 = strList78.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[[]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[[]]");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 52 + "'", int70 == 52);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(strItor83);
        org.junit.Assert.assertNotNull(strSpliterator84);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.checkModCount();
        strItor5.currentIndex = 1;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode9 = strItor5.next;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode10 = strItor5.current;
        int int11 = strItor5.expectedModCount;
        boolean boolean12 = strItor5.hasPrevious();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList13 = strItor5.parent;
        java.util.function.UnaryOperator<java.lang.String> strUnaryOperator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            strList13.replaceAll(strUnaryOperator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(strAVLNode9);
        org.junit.Assert.assertNull(strAVLNode10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode27 = strAVLNode24.insert(52, "[, [, [, hi!]]]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strAVLNode19);
        org.junit.Assert.assertNotNull(strAVLNode22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(strAVLNode24);
        org.junit.Assert.assertNotNull(strAVLNode27);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode28 = strAVLNode22.next();
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList31 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor34 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList31, (int) '4');
        int int36 = strList31.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        boolean boolean42 = strList31.containsAll((java.util.Collection<java.lang.String>) strList40);
        java.util.Spliterator<java.lang.String> strSpliterator43 = strList31.spliterator();
        java.lang.String str44 = strList31.toString();
        boolean boolean46 = strList31.add("[]");
        java.util.stream.Stream<java.lang.String> strStream47 = strList31.stream();
        boolean boolean48 = strList31.isEmpty();
        java.lang.String str51 = strList31.set(1, "[, [, hi!]]");
        org.apache.commons.collections.list.TreeList<java.lang.String> strList52 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList53 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        java.lang.String str54 = strList53.toString();
        java.lang.String[] strArray56 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList57 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor60 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList57, (int) '4');
        int int62 = strList57.lastIndexOf((java.lang.Object) (byte) -1);
        org.apache.commons.collections.list.TreeList[] treeListArray64 = new org.apache.commons.collections.list.TreeList[2];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections.list.TreeList<java.lang.String>[] strListArray65 = (org.apache.commons.collections.list.TreeList<java.lang.String>[]) treeListArray64;
        strListArray65[0] = strList53;
        strListArray65[1] = strList57;
        org.apache.commons.collections.list.TreeList<java.lang.String>[] strListArray70 = strList52.toArray(strListArray65);
        java.lang.String[] strArray72 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList73 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList73, strArray72);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor76 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList73, (int) '4');
        int int78 = strList73.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray80 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList81 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor84 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList81, (int) '4');
        boolean boolean85 = strList73.retainAll((java.util.Collection<java.lang.String>) strList81);
        strList81.clear();
        boolean boolean87 = strList81.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream88 = strList81.stream();
        java.util.Iterator<java.lang.String> strItor89 = strList81.iterator();
        java.lang.String str90 = strList81.toString();
        boolean boolean91 = strList52.addAll((java.util.Collection<java.lang.String>) strList81);
        java.lang.Object[] objArray92 = strList52.toArray();
        boolean boolean93 = strList31.remove((java.lang.Object) strList52);
        int int95 = strAVLNode28.indexOf((java.lang.Object) strList52, (-1));
        java.lang.Object[] objArray96 = strList52.toArray();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strAVLNode19);
        org.junit.Assert.assertNotNull(strAVLNode22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(strAVLNode24);
        org.junit.Assert.assertNotNull(strAVLNode27);
        org.junit.Assert.assertNotNull(strAVLNode28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strSpliterator43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strStream47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[]" + "'", str51, "[]");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "[]" + "'", str54, "[]");
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(treeListArray64);
        org.junit.Assert.assertNotNull(strListArray65);
        org.junit.Assert.assertNotNull(strListArray70);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(strStream88);
        org.junit.Assert.assertNotNull(strItor89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "[]" + "'", str90, "[]");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertArrayEquals(objArray92, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertNotNull(objArray96);
        org.junit.Assert.assertArrayEquals(objArray96, new java.lang.Object[] {});
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.nextIndex = (-1);
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode8 = strItor5.next;
        int int9 = strItor5.previousIndex();
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList12 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor15 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList12, (int) '4');
        int int17 = strList12.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        boolean boolean23 = strList12.containsAll((java.util.Collection<java.lang.String>) strList21);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor25 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList12, (int) (byte) 1);
        int int26 = strList12.size();
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor28 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList12, (int) (short) 10);
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode29 = null;
        strItor28.next = strAVLNode29;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList31 = strItor28.parent;
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList34 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor37 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList34, (int) '4');
        int int39 = strList34.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        boolean boolean45 = strList34.containsAll((java.util.Collection<java.lang.String>) strList43);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor47 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList34, (int) (byte) 1);
        java.lang.String str48 = strItor47.previous();
        strItor47.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode51 = strItor47.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode54 = strAVLNode51.insert((int) (byte) 0, "hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode56 = strAVLNode54.remove((int) (byte) 0);
        java.lang.String[] strArray58 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList59 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor62 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList59, (int) '4');
        int int63 = strItor62.nextIndex();
        strItor62.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode66 = null;
        strItor62.next = strAVLNode66;
        strItor62.nextIndex = 1;
        strItor62.add("[]");
        int int73 = strAVLNode56.indexOf((java.lang.Object) "[]", 3);
        java.lang.String str74 = strAVLNode56.getValue();
        strItor28.next = strAVLNode56;
        strItor5.next = strAVLNode56;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode79 = strAVLNode56.insert(35, "");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode80 = strAVLNode56.previous();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(strAVLNode8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(strAVLNode51);
        org.junit.Assert.assertNotNull(strAVLNode54);
        org.junit.Assert.assertNotNull(strAVLNode56);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 52 + "'", int63 == 52);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertNotNull(strAVLNode79);
        org.junit.Assert.assertNull(strAVLNode80);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        boolean boolean16 = strList10.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream17 = strList10.stream();
        java.util.ListIterator<java.lang.String> strItor18 = strList10.listIterator();
        java.util.function.UnaryOperator<java.lang.String> strUnaryOperator19 = null;
        // The following exception was thrown during execution in test generation
        try {
            strList10.replaceAll(strUnaryOperator19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strStream17);
        org.junit.Assert.assertNotNull(strItor18);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
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
        strItor49.checkModCount();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList53 = strItor49.parent;
        strItor49.currentIndex = 9;
        boolean boolean56 = strItor49.hasNext();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "[]" + "'", str43, "[]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(strStream46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(strAVLNode50);
        org.junit.Assert.assertNull(strAVLNode51);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode9 = null;
        strItor5.next = strAVLNode9;
        strItor5.nextIndex = 1;
        strItor5.add("[]");
        int int15 = strItor5.previousIndex();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode16 = strItor5.next;
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList19 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor22 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList19, (int) '4');
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList25 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor28 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList25, (int) '4');
        int int29 = strItor28.nextIndex();
        strItor28.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode32 = null;
        strItor28.next = strAVLNode32;
        int int34 = strItor28.nextIndex;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode35 = null;
        strItor28.next = strAVLNode35;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList37 = strItor28.parent;
        int int38 = strList19.indexOf((java.lang.Object) strItor28);
        strItor28.expectedModCount = 0;
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList43 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor46 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList43, (int) '4');
        strItor46.checkModCount();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode48 = strItor46.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode49 = null;
        strItor46.next = strAVLNode49;
        int int51 = strItor46.expectedModCount;
        boolean boolean52 = strItor46.hasNext();
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList55 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor58 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList55, (int) '4');
        int int60 = strList55.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray63 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        boolean boolean66 = strList55.containsAll((java.util.Collection<java.lang.String>) strList64);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor68 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList55, (int) (byte) 1);
        java.lang.String str69 = strItor68.previous();
        strItor68.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode72 = strItor68.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode75 = strAVLNode72.insert((int) (byte) 0, "hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode77 = strAVLNode75.remove((int) (byte) 0);
        strItor46.current = strAVLNode77;
        java.lang.Object obj79 = null;
        int int81 = strAVLNode77.indexOf(obj79, 0);
        strItor28.current = strAVLNode77;
        strItor5.next = strAVLNode77;
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(strAVLNode16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(strAVLNode48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(strAVLNode72);
        org.junit.Assert.assertNotNull(strAVLNode75);
        org.junit.Assert.assertNotNull(strAVLNode77);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        boolean boolean7 = strItor5.hasNext();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList8 = strItor5.parent;
        int int9 = strItor5.previousIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strItor5.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No element at index 52.");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.nextIndex = (-1);
        int int8 = strItor5.previousIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList9 = strItor5.parent;
        strItor5.expectedModCount = 0;
        boolean boolean12 = strItor5.hasPrevious();
        strItor5.currentIndex = 4;
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList7 = strItor5.parent;
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor13 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList10, (int) '4');
        int int14 = strItor13.nextIndex();
        strItor13.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode17 = null;
        strItor13.next = strAVLNode17;
        strItor13.nextIndex = 1;
        int int21 = strList7.indexOf((java.lang.Object) strItor13);
        java.lang.String str22 = strItor13.previous();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode23 = strItor13.next;
        int int24 = strItor13.expectedModCount;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList25 = strItor13.parent;
        int int26 = strItor13.nextIndex();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strAVLNode23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList28 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor31 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList28, (int) '4');
        int int32 = strItor31.nextIndex();
        strItor31.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode35 = null;
        strItor31.next = strAVLNode35;
        strItor31.nextIndex = 1;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList39 = strItor31.parent;
        boolean boolean40 = strList19.removeAll((java.util.Collection<java.lang.String>) strList39);
        boolean boolean42 = strList19.add("[]");
        java.lang.Object[] objArray43 = strList19.toArray();
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList46 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor49 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList46, (int) '4');
        int int51 = strList46.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        boolean boolean57 = strList46.containsAll((java.util.Collection<java.lang.String>) strList55);
        boolean boolean59 = strList46.equals((java.lang.Object) 10.0f);
        java.lang.Object obj60 = null;
        int int61 = strList46.indexOf(obj60);
        int int63 = strList46.indexOf((java.lang.Object) 1.0d);
        java.lang.String[] strArray65 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList66 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor69 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList66, (int) '4');
        int int70 = strItor69.nextIndex();
        strItor69.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode73 = null;
        strItor69.next = strAVLNode73;
        strItor69.nextIndex = 1;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList77 = strItor69.parent;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList78 = new org.apache.commons.collections.list.TreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList77);
        boolean boolean79 = strList46.containsAll((java.util.Collection<java.lang.String>) strList78);
        java.lang.String str81 = strList78.remove(0);
        int int82 = strList19.indexOf((java.lang.Object) strList78);
        boolean boolean84 = strList19.add("AVLNode(1,true,[, [, [, hi!]]],false, faedelung true )");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[[]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[[]]");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 52 + "'", int70 == 52);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        java.lang.String str22 = strList2.set(1, "[, [, hi!]]");
        org.apache.commons.collections.list.TreeList<java.lang.String> strList23 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList24 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        java.lang.String str25 = strList24.toString();
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList28 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor31 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList28, (int) '4');
        int int33 = strList28.lastIndexOf((java.lang.Object) (byte) -1);
        org.apache.commons.collections.list.TreeList[] treeListArray35 = new org.apache.commons.collections.list.TreeList[2];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections.list.TreeList<java.lang.String>[] strListArray36 = (org.apache.commons.collections.list.TreeList<java.lang.String>[]) treeListArray35;
        strListArray36[0] = strList24;
        strListArray36[1] = strList28;
        org.apache.commons.collections.list.TreeList<java.lang.String>[] strListArray41 = strList23.toArray(strListArray36);
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList44 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor47 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList44, (int) '4');
        int int49 = strList44.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList52 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor55 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList52, (int) '4');
        boolean boolean56 = strList44.retainAll((java.util.Collection<java.lang.String>) strList52);
        strList52.clear();
        boolean boolean58 = strList52.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream59 = strList52.stream();
        java.util.Iterator<java.lang.String> strItor60 = strList52.iterator();
        java.lang.String str61 = strList52.toString();
        boolean boolean62 = strList23.addAll((java.util.Collection<java.lang.String>) strList52);
        java.lang.Object[] objArray63 = strList23.toArray();
        boolean boolean64 = strList2.remove((java.lang.Object) strList23);
        java.util.Spliterator<java.lang.String> strSpliterator65 = strList23.spliterator();
        java.lang.String[] strArray67 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList68 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor71 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList68, (int) '4');
        int int72 = strItor71.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList73 = strItor71.parent;
        java.lang.String[] strArray75 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList76 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList76, strArray75);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor79 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList76, (int) '4');
        int int81 = strList76.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray83 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList84 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList84, strArray83);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor87 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList84, (int) '4');
        int int89 = strList84.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean90 = strList76.contains((java.lang.Object) int89);
        java.lang.String str91 = strList76.toString();
        boolean boolean92 = strList73.removeAll((java.util.Collection<java.lang.String>) strList76);
        boolean boolean94 = strList73.add("[]");
        java.lang.String str96 = strList73.remove(0);
        boolean boolean97 = strList23.retainAll((java.util.Collection<java.lang.String>) strList73);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(treeListArray35);
        org.junit.Assert.assertNotNull(strListArray36);
        org.junit.Assert.assertNotNull(strListArray41);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(strStream59);
        org.junit.Assert.assertNotNull(strItor60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "[]" + "'", str61, "[]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertArrayEquals(objArray63, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strSpliterator65);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 52 + "'", int72 == 52);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "[]" + "'", str91, "[]");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "[]" + "'", str96, "[]");
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
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
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList22 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor25 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList22, (int) '4');
        int int27 = strList22.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList30 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor33 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList30, (int) '4');
        boolean boolean34 = strList22.retainAll((java.util.Collection<java.lang.String>) strList30);
        strList30.clear();
        java.util.ListIterator<java.lang.String> strItor36 = strList30.listIterator();
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList39 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor42 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList39, (int) '4');
        java.lang.Object obj43 = new java.lang.Object();
        int int44 = strList39.indexOf(obj43);
        boolean boolean45 = strList30.removeAll((java.util.Collection<java.lang.String>) strList39);
        boolean boolean46 = strList39.isEmpty();
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor48 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList39, 51);
        org.apache.commons.collections.list.TreeList<java.lang.String> strList49 = new org.apache.commons.collections.list.TreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList39);
        java.util.Iterator<java.lang.String> strItor50 = strList39.iterator();
        boolean boolean52 = strList39.add("[, hi!]");
        boolean boolean53 = strList17.containsAll((java.util.Collection<java.lang.String>) strList39);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor55 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList17, 34);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSpliterator16);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strItor36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strItor50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList7 = strItor5.parent;
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor13 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList10, (int) '4');
        int int14 = strItor13.nextIndex();
        strItor13.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode17 = null;
        strItor13.next = strAVLNode17;
        strItor13.nextIndex = 1;
        int int21 = strList7.indexOf((java.lang.Object) strItor13);
        java.lang.String str22 = strItor13.previous();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode23 = strItor13.next;
        int int24 = strItor13.currentIndex;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = strItor13.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Already at start of list.");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strAVLNode23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode9 = null;
        strItor5.next = strAVLNode9;
        strItor5.nextIndex = 1;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList13 = strItor5.parent;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList14 = strItor5.parent;
        int int15 = strList14.size();
        java.lang.Object[] objArray16 = strList14.toArray();
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor18 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList14, (int) (short) 100);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList21 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor24 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList21, (int) '4');
        int int26 = strList21.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList29 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor32 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList29, (int) '4');
        boolean boolean33 = strList21.retainAll((java.util.Collection<java.lang.String>) strList29);
        strList29.clear();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList35 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList36 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        java.lang.String str37 = strList36.toString();
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList40 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor43 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList40, (int) '4');
        int int45 = strList40.lastIndexOf((java.lang.Object) (byte) -1);
        org.apache.commons.collections.list.TreeList[] treeListArray47 = new org.apache.commons.collections.list.TreeList[2];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections.list.TreeList<java.lang.String>[] strListArray48 = (org.apache.commons.collections.list.TreeList<java.lang.String>[]) treeListArray47;
        strListArray48[0] = strList36;
        strListArray48[1] = strList40;
        org.apache.commons.collections.list.TreeList<java.lang.String>[] strListArray53 = strList35.toArray(strListArray48);
        boolean boolean54 = strList29.contains((java.lang.Object) strList35);
        boolean boolean55 = strList14.removeAll((java.util.Collection<java.lang.String>) strList35);
        org.apache.commons.collections.list.TreeList<java.lang.String> strList56 = new org.apache.commons.collections.list.TreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList35);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[]" + "'", str37, "[]");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(treeListArray47);
        org.junit.Assert.assertNotNull(strListArray48);
        org.junit.Assert.assertNotNull(strListArray53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode36 = null;
        strItor35.current = strAVLNode36;
        int int38 = strItor35.expectedModCount;
        boolean boolean39 = strItor35.hasPrevious();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode40 = null;
        strItor35.current = strAVLNode40;
        // The following exception was thrown during execution in test generation
        try {
            strItor35.add("AVLNode(1,true,[hi!],false, faedelung true )");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        int int9 = strItor5.nextIndex();
        int int10 = strItor5.expectedModCount;
        strItor5.checkModCount();
        strItor5.checkModCount();
        int int13 = strItor5.expectedModCount;
        boolean boolean14 = strItor5.hasNext();
        strItor5.checkModCount();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        boolean boolean7 = strItor5.hasNext();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList8 = strItor5.parent;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode9 = strItor5.next;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = strItor5.parent;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = strList10.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNull(strAVLNode9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList7 = strItor5.parent;
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor13 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList10, (int) '4');
        int int15 = strList10.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList18 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor21 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList18, (int) '4');
        int int23 = strList18.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean24 = strList10.contains((java.lang.Object) int23);
        java.lang.String str25 = strList10.toString();
        boolean boolean26 = strList7.removeAll((java.util.Collection<java.lang.String>) strList10);
        java.lang.String str27 = strList10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator28 = strList10.spliterator();
        java.lang.String str30 = strList10.remove((int) (short) 0);
        boolean boolean32 = strList10.add("");
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList35 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor38 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList35, (int) '4');
        int int39 = strItor38.nextIndex();
        strItor38.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode42 = null;
        strItor38.next = strAVLNode42;
        strItor38.nextIndex = 1;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList46 = strItor38.parent;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList47 = strItor38.parent;
        boolean boolean48 = strList10.addAll((java.util.Collection<java.lang.String>) strList47);
        java.util.ListIterator<java.lang.String> strItor49 = strList10.listIterator();
        boolean boolean51 = strList10.add("AVLNode(0,false,,true, faedelung false )");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList54 = strList10.subList(34, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 51");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertNotNull(strSpliterator28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strItor49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList7 = strItor5.parent;
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor13 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList10, (int) '4');
        int int15 = strList10.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList18 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor21 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList18, (int) '4');
        int int23 = strList18.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean24 = strList10.contains((java.lang.Object) int23);
        java.lang.String str25 = strList10.toString();
        boolean boolean26 = strList7.removeAll((java.util.Collection<java.lang.String>) strList10);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList29 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor32 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList29, (int) '4');
        int int34 = strList29.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        boolean boolean40 = strList29.containsAll((java.util.Collection<java.lang.String>) strList38);
        java.util.Spliterator<java.lang.String> strSpliterator41 = strList29.spliterator();
        java.lang.String str42 = strList29.toString();
        boolean boolean43 = strList10.remove((java.lang.Object) str42);
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList46 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor49 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList46, (int) '4');
        int int51 = strList46.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray53 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList54 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor57 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList54, (int) '4');
        boolean boolean58 = strList46.retainAll((java.util.Collection<java.lang.String>) strList54);
        boolean boolean59 = strList46.isEmpty();
        java.util.ListIterator<java.lang.String> strItor61 = strList46.listIterator(0);
        java.util.Spliterator<java.lang.String> strSpliterator62 = strList46.spliterator();
        boolean boolean63 = strList10.retainAll((java.util.Collection<java.lang.String>) strList46);
        org.apache.commons.collections.list.TreeList<java.lang.String> strList64 = new org.apache.commons.collections.list.TreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList10);
        java.util.Spliterator<java.lang.String> strSpliterator65 = strList64.spliterator();
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor67 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList64, (int) 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strSpliterator41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[]" + "'", str42, "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strItor61);
        org.junit.Assert.assertNotNull(strSpliterator62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strSpliterator65);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor13 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList10, (int) '4');
        int int15 = strList10.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean16 = strList2.contains((java.lang.Object) int15);
        java.lang.String str17 = strList2.toString();
        int int19 = strList2.lastIndexOf((java.lang.Object) true);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList22 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor25 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList22, (int) '4');
        int int27 = strList22.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList30 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor33 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList30, (int) '4');
        boolean boolean34 = strList22.retainAll((java.util.Collection<java.lang.String>) strList30);
        boolean boolean35 = strList22.isEmpty();
        java.util.Spliterator<java.lang.String> strSpliterator36 = strList22.spliterator();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList37 = new org.apache.commons.collections.list.TreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList22);
        boolean boolean38 = strList2.containsAll((java.util.Collection<java.lang.String>) strList37);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strSpliterator36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode15 = null;
        strItor11.next = strAVLNode15;
        int int17 = strItor11.nextIndex;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode18 = null;
        strItor11.next = strAVLNode18;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList20 = strItor11.parent;
        int int21 = strList2.indexOf((java.lang.Object) strItor11);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor23 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) (byte) 10);
        java.util.Iterator<java.lang.String> strItor24 = strList2.iterator();
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList27 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor30 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList27, (int) '4');
        int int32 = strList27.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList35 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor38 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList35, (int) '4');
        boolean boolean39 = strList27.retainAll((java.util.Collection<java.lang.String>) strList35);
        strList35.clear();
        java.util.ListIterator<java.lang.String> strItor41 = strList35.listIterator();
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList44 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor47 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList44, (int) '4');
        java.lang.Object obj48 = new java.lang.Object();
        int int49 = strList44.indexOf(obj48);
        boolean boolean50 = strList35.removeAll((java.util.Collection<java.lang.String>) strList44);
        java.lang.String[] strArray52 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList53 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor56 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList53, (int) '4');
        int int57 = strItor56.nextIndex();
        strItor56.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode60 = null;
        strItor56.next = strAVLNode60;
        strItor56.nextIndex = 1;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList64 = strItor56.parent;
        boolean boolean65 = strList44.removeAll((java.util.Collection<java.lang.String>) strList64);
        int int66 = strList64.size();
        java.util.Spliterator<java.lang.String> strSpliterator67 = strList64.spliterator();
        java.lang.String[] strArray69 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList70 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor73 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList70, (int) '4');
        strItor73.nextIndex = (-1);
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode76 = null;
        strItor73.next = strAVLNode76;
        boolean boolean78 = strItor73.hasPrevious();
        boolean boolean79 = strList64.remove((java.lang.Object) strItor73);
        boolean boolean80 = strList2.containsAll((java.util.Collection<java.lang.String>) strList64);
        strList64.add(0, "");
        // The following exception was thrown during execution in test generation
        try {
            strList64.add((int) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strItor24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strItor41);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 52 + "'", int57 == 52);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(strSpliterator67);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode9 = null;
        strItor5.next = strAVLNode9;
        strItor5.nextIndex = 1;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList13 = strItor5.parent;
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList16 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor19 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList16, (int) '4');
        int int20 = strItor19.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList21 = strItor19.parent;
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList24 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor27 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList24, (int) '4');
        int int29 = strList24.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList32 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor35 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList32, (int) '4');
        int int37 = strList32.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean38 = strList24.contains((java.lang.Object) int37);
        java.lang.String str39 = strList24.toString();
        boolean boolean40 = strList21.removeAll((java.util.Collection<java.lang.String>) strList24);
        java.lang.String str41 = strList24.toString();
        boolean boolean42 = strList13.remove((java.lang.Object) str41);
        boolean boolean44 = strList13.add("");
        strList13.add((int) (short) 0, "[]");
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList50 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor53 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList50, (int) '4');
        int int55 = strList50.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList58 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor61 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList58, (int) '4');
        int int63 = strList58.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean64 = strList50.contains((java.lang.Object) int63);
        java.lang.String str65 = strList50.toString();
        boolean boolean67 = strList50.equals((java.lang.Object) (byte) 100);
        boolean boolean68 = strList13.retainAll((java.util.Collection<java.lang.String>) strList50);
        java.lang.Object[] objArray69 = strList13.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str72 = strList13.set((int) (byte) 10, "AVLNode(0,false,hi!,false, faedelung true )");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[]" + "'", str41, "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "[]" + "'", str65, "[]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[, ]");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode9 = null;
        strItor5.next = strAVLNode9;
        int int11 = strItor5.nextIndex;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode12 = null;
        strItor5.next = strAVLNode12;
        int int14 = strItor5.nextIndex();
        int int15 = strItor5.expectedModCount;
        strItor5.currentIndex = (short) 10;
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.nextIndex = (-1);
        boolean boolean8 = strItor5.hasPrevious();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode9 = strItor5.next;
        int int10 = strItor5.currentIndex;
        boolean boolean11 = strItor5.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            strItor5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strAVLNode9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
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
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode44 = strAVLNode41.insert((-1), "AVLNode(1,true,hi!,false, faedelung true )");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode47 = strAVLNode41.insert((int) '#', "");
        java.lang.String str48 = strAVLNode41.getValue();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strAVLNode37);
        org.junit.Assert.assertNotNull(strAVLNode41);
        org.junit.Assert.assertNotNull(strAVLNode44);
        org.junit.Assert.assertNotNull(strAVLNode47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.apache.commons.collections.list.TreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new org.apache.commons.collections.list.TreeList<java.lang.Comparable<java.lang.String>>();
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.Comparable<java.lang.String>>(strComparableList0, (int) (byte) 10);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
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
        int int18 = strList13.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        boolean boolean24 = strList13.containsAll((java.util.Collection<java.lang.String>) strList22);
        boolean boolean26 = strList13.equals((java.lang.Object) 10.0f);
        boolean boolean27 = strList0.addAll((java.util.Collection<java.lang.String>) strList13);
        java.util.stream.Stream<java.lang.String> strStream28 = strList13.stream();
        int int29 = strList13.size();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList32 = strList13.subList((-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: fromIndex = -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strStream28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex;
        int int7 = strItor5.previousIndex();
        int int8 = strItor5.nextIndex;
        strItor5.checkModCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strItor5.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No element at index 52.");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        int int18 = strList13.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        boolean boolean24 = strList13.containsAll((java.util.Collection<java.lang.String>) strList22);
        boolean boolean26 = strList13.equals((java.lang.Object) 10.0f);
        boolean boolean27 = strList0.addAll((java.util.Collection<java.lang.String>) strList13);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList30 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor33 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList30, (int) '4');
        java.lang.Object obj34 = new java.lang.Object();
        int int35 = strList30.indexOf(obj34);
        boolean boolean37 = strList30.equals((java.lang.Object) "[hi!]");
        java.util.stream.Stream<java.lang.String> strStream38 = strList30.parallelStream();
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList41 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor44 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList41, (int) '4');
        strItor44.checkModCount();
        strItor44.checkModCount();
        int int47 = strItor44.expectedModCount;
        strItor44.checkModCount();
        strItor44.currentIndex = (byte) 10;
        int int51 = strList30.indexOf((java.lang.Object) (byte) 10);
        boolean boolean52 = strList13.retainAll((java.util.Collection<java.lang.String>) strList30);
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList55 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor58 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList55, (int) '4');
        strItor58.checkModCount();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode60 = strItor58.current;
        boolean boolean61 = strItor58.hasNext();
        strItor58.currentIndex = (byte) 10;
        strItor58.currentIndex = 'a';
        strItor58.expectedModCount = (short) 0;
        int int68 = strItor58.expectedModCount;
        int int69 = strItor58.nextIndex;
        boolean boolean70 = strList13.contains((java.lang.Object) strItor58);
        org.apache.commons.collections.list.TreeList<java.lang.String> strList71 = strItor58.parent;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList72 = new org.apache.commons.collections.list.TreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList71);
        java.util.function.UnaryOperator<java.lang.String> strUnaryOperator73 = null;
        // The following exception was thrown during execution in test generation
        try {
            strList71.replaceAll(strUnaryOperator73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strStream38);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(strAVLNode60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 52 + "'", int69 == 52);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strList71);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode9 = null;
        strItor5.next = strAVLNode9;
        strItor5.nextIndex = 1;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList13 = strItor5.parent;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList14 = strItor5.parent;
        int int15 = strList14.size();
        java.lang.Object[] objArray16 = strList14.toArray();
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor18 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList14, (int) (short) 100);
        boolean boolean19 = strItor18.hasPrevious();
        boolean boolean20 = strItor18.hasPrevious();
        boolean boolean21 = strItor18.hasNext();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode9 = null;
        strItor5.next = strAVLNode9;
        int int11 = strItor5.nextIndex;
        strItor5.nextIndex = (short) 10;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode14 = null;
        strItor5.next = strAVLNode14;
        strItor5.currentIndex = ' ';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode18 = strItor5.current;
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNull(strAVLNode18);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList34 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor37 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList34, (int) '4');
        java.lang.Object obj38 = new java.lang.Object();
        int int39 = strList34.indexOf(obj38);
        int int41 = strAVLNode30.indexOf((java.lang.Object) int39, 0);
        java.lang.String str42 = strAVLNode30.toString();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode45 = strAVLNode30.insert((int) (byte) 10, "AVLNode(0,false,hi!,true, faedelung false )");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode47 = strAVLNode30.get(51);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strAVLNode30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "AVLNode(0,false,hi!,false, faedelung true )" + "'", str42, "AVLNode(0,false,hi!,false, faedelung true )");
        org.junit.Assert.assertNotNull(strAVLNode45);
        org.junit.Assert.assertNull(strAVLNode47);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.checkModCount();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList7 = strItor5.parent;
        strList7.clear();
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList11 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor14 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList11, (int) '4');
        int int15 = strItor14.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList16 = strItor14.parent;
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList19 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor22 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList19, (int) '4');
        int int24 = strList19.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList27 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor30 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList27, (int) '4');
        int int32 = strList27.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean33 = strList19.contains((java.lang.Object) int32);
        java.lang.String str34 = strList19.toString();
        boolean boolean35 = strList16.removeAll((java.util.Collection<java.lang.String>) strList19);
        java.lang.String str36 = strList19.toString();
        java.util.Spliterator<java.lang.String> strSpliterator37 = strList19.spliterator();
        java.lang.String str39 = strList19.remove((int) (short) 0);
        boolean boolean40 = strList19.isEmpty();
        boolean boolean41 = strList7.addAll((java.util.Collection<java.lang.String>) strList19);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor43 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList19, (-2));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[]" + "'", str36, "[]");
        org.junit.Assert.assertNotNull(strSpliterator37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
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
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList44 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor47 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList44, (int) '4');
        int int49 = strList44.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray52 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        boolean boolean55 = strList44.containsAll((java.util.Collection<java.lang.String>) strList53);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor57 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList44, (int) (byte) 1);
        int int58 = strList44.size();
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor60 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList44, (int) (short) 10);
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode61 = null;
        strItor60.next = strAVLNode61;
        int int63 = strItor60.nextIndex;
        int int65 = strAVLNode37.indexOf((java.lang.Object) int63, (int) (short) 100);
        strAVLNode37.setValue("AVLNode(1,true,hi!,false, faedelung true )");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode69 = strAVLNode37.get((int) (byte) 1);
        strAVLNode69.setValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strAVLNode37);
        org.junit.Assert.assertNotNull(strAVLNode41);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(strAVLNode69);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
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
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList36 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor39 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList36, (int) '4');
        int int40 = strItor39.nextIndex();
        strItor39.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode43 = null;
        strItor39.next = strAVLNode43;
        strItor39.nextIndex = 1;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList47 = strItor39.parent;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList48 = new org.apache.commons.collections.list.TreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList47);
        int int49 = strList26.lastIndexOf((java.lang.Object) strList47);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str51 = strList47.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[hi!]" + "'", str22, "[hi!]");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.checkModCount();
        strItor5.checkModCount();
        boolean boolean8 = strItor5.hasPrevious();
        strItor5.currentIndex = (short) -1;
        strItor5.expectedModCount = (short) -1;
        boolean boolean13 = strItor5.hasPrevious();
        int int14 = strItor5.nextIndex;
        int int15 = strItor5.previousIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList16 = strItor5.parent;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = strList16.set((-2), "AVLNode(0,false,AVLNode(0,false,,false, faedelung true ),false, faedelung true )");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-2, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        strAVLNode50.setValue("AVLNode(0,false,,true, faedelung false )");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNull(strAVLNode11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strAVLNode35);
        org.junit.Assert.assertNotNull(strAVLNode38);
        org.junit.Assert.assertNull(strAVLNode47);
        org.junit.Assert.assertNotNull(strAVLNode50);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList7 = strItor5.parent;
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor13 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList10, (int) '4');
        int int15 = strList10.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList18 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor21 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList18, (int) '4');
        int int23 = strList18.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean24 = strList10.contains((java.lang.Object) int23);
        java.lang.String str25 = strList10.toString();
        boolean boolean26 = strList7.removeAll((java.util.Collection<java.lang.String>) strList10);
        java.lang.String str27 = strList10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator28 = strList10.spliterator();
        boolean boolean29 = strList10.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream30 = strList10.stream();
        java.util.stream.Stream<java.lang.String> strStream31 = strList10.stream();
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList34 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor37 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList34, (int) '4');
        int int39 = strList34.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray41 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList42 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor45 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList42, (int) '4');
        boolean boolean46 = strList34.retainAll((java.util.Collection<java.lang.String>) strList42);
        boolean boolean47 = strList34.isEmpty();
        java.util.Spliterator<java.lang.String> strSpliterator48 = strList34.spliterator();
        boolean boolean49 = strList10.remove((java.lang.Object) strSpliterator48);
        boolean boolean51 = strList10.add("AVLNode(1,true,hi!,false, faedelung true )");
        java.lang.String[] strArray53 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList54 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor57 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList54, (int) '4');
        strItor57.checkModCount();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode59 = strItor57.current;
        boolean boolean60 = strItor57.hasPrevious();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode61 = strItor57.current;
        int int62 = strList10.lastIndexOf((java.lang.Object) strAVLNode61);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertNotNull(strSpliterator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strStream30);
        org.junit.Assert.assertNotNull(strStream31);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strSpliterator48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(strAVLNode59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNull(strAVLNode61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
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
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode36 = null;
        strItor35.current = strAVLNode36;
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList40 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor43 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList40, (int) '4');
        int int45 = strList40.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        boolean boolean51 = strList40.containsAll((java.util.Collection<java.lang.String>) strList49);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor53 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList40, (int) (byte) 1);
        java.lang.String str54 = strItor53.previous();
        strItor53.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode57 = strItor53.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode60 = strAVLNode57.insert((int) (byte) 0, "hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode62 = strAVLNode60.remove((int) (byte) 0);
        java.lang.String[] strArray64 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList65 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor68 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList65, (int) '4');
        java.lang.String[] strArray70 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList71 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor74 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList71, (int) '4');
        int int76 = strList71.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray78 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList79 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList79, strArray78);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor82 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList79, (int) '4');
        int int84 = strList79.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean85 = strList71.contains((java.lang.Object) int84);
        java.lang.String str86 = strList71.toString();
        boolean boolean87 = strList65.containsAll((java.util.Collection<java.lang.String>) strList71);
        java.util.stream.Stream<java.lang.String> strStream88 = strList71.parallelStream();
        int int90 = strAVLNode60.indexOf((java.lang.Object) strStream88, 0);
        strItor35.current = strAVLNode60;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList92 = strItor35.parent;
        boolean boolean93 = strList92.isEmpty();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(strAVLNode57);
        org.junit.Assert.assertNotNull(strAVLNode60);
        org.junit.Assert.assertNotNull(strAVLNode62);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "[]" + "'", str86, "[]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(strStream88);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(strList92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
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
        int int16 = strList11.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        boolean boolean22 = strList11.containsAll((java.util.Collection<java.lang.String>) strList20);
        java.util.Spliterator<java.lang.String> strSpliterator23 = strList11.spliterator();
        java.lang.String str24 = strList11.toString();
        boolean boolean26 = strList11.add("[]");
        java.util.stream.Stream<java.lang.String> strStream27 = strList11.stream();
        boolean boolean28 = strList2.addAll((java.util.Collection<java.lang.String>) strList11);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList31 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor34 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList31, (int) '4');
        strItor34.checkModCount();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode36 = strItor34.current;
        boolean boolean37 = strItor34.hasNext();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList38 = strItor34.parent;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList39 = strItor34.parent;
        java.util.Iterator<java.lang.String> strItor40 = strList39.iterator();
        java.util.stream.Stream<java.lang.String> strStream41 = strList39.parallelStream();
        boolean boolean42 = strList11.removeAll((java.util.Collection<java.lang.String>) strList39);
        java.util.Spliterator<java.lang.String> strSpliterator43 = strList39.spliterator();
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList46 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor49 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList46, (int) '4');
        int int50 = strItor49.nextIndex();
        strItor49.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode53 = null;
        strItor49.next = strAVLNode53;
        strItor49.nextIndex = 1;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList57 = strItor49.parent;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList58 = strItor49.parent;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode59 = null;
        strItor49.next = strAVLNode59;
        strItor49.add("[hi!]");
        int int63 = strItor49.previousIndex();
        boolean boolean64 = strList39.remove((java.lang.Object) int63);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strSpliterator23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strStream27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(strAVLNode36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(strItor40);
        org.junit.Assert.assertNotNull(strStream41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strSpliterator43);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 52 + "'", int50 == 52);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.checkModCount();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode7 = strItor5.current;
        boolean boolean8 = strItor5.hasPrevious();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode9 = strItor5.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode10 = strItor5.next;
        boolean boolean11 = strItor5.hasPrevious();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode12 = strItor5.next;
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(strAVLNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(strAVLNode9);
        org.junit.Assert.assertNull(strAVLNode10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(strAVLNode12);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int7 = strList2.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor13 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList10, (int) '4');
        int int15 = strList10.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean16 = strList2.contains((java.lang.Object) int15);
        java.lang.String str17 = strList2.toString();
        boolean boolean19 = strList2.equals((java.lang.Object) (byte) 100);
        java.util.stream.Stream<java.lang.String> strStream20 = strList2.parallelStream();
        strList2.clear();
        boolean boolean22 = strList2.isEmpty();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strStream20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
        org.apache.commons.collections.list.TreeList<java.lang.String> strList16 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList17 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        java.lang.String str18 = strList17.toString();
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList21 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor24 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList21, (int) '4');
        int int26 = strList21.lastIndexOf((java.lang.Object) (byte) -1);
        org.apache.commons.collections.list.TreeList[] treeListArray28 = new org.apache.commons.collections.list.TreeList[2];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections.list.TreeList<java.lang.String>[] strListArray29 = (org.apache.commons.collections.list.TreeList<java.lang.String>[]) treeListArray28;
        strListArray29[0] = strList17;
        strListArray29[1] = strList21;
        org.apache.commons.collections.list.TreeList<java.lang.String>[] strListArray34 = strList16.toArray(strListArray29);
        boolean boolean35 = strList10.contains((java.lang.Object) strList16);
        java.util.ListIterator<java.lang.String> strItor36 = strList16.listIterator();
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList39 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor42 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList39, (int) '4');
        int int44 = strList39.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        boolean boolean50 = strList39.containsAll((java.util.Collection<java.lang.String>) strList48);
        boolean boolean52 = strList39.equals((java.lang.Object) 10.0f);
        java.lang.Object obj53 = null;
        int int54 = strList39.indexOf(obj53);
        int int56 = strList39.indexOf((java.lang.Object) 1.0d);
        java.lang.String[] strArray58 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList59 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor62 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList59, (int) '4');
        int int63 = strItor62.nextIndex();
        strItor62.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode66 = null;
        strItor62.next = strAVLNode66;
        strItor62.nextIndex = 1;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList70 = strItor62.parent;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList71 = new org.apache.commons.collections.list.TreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList70);
        boolean boolean72 = strList39.containsAll((java.util.Collection<java.lang.String>) strList71);
        java.util.ListIterator<java.lang.String> strItor73 = strList71.listIterator();
        int int74 = strList71.size();
        int int75 = strList16.lastIndexOf((java.lang.Object) int74);
        java.lang.Object[] objArray76 = strList16.toArray();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList77 = new org.apache.commons.collections.list.TreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str79 = strList77.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(treeListArray28);
        org.junit.Assert.assertNotNull(strListArray29);
        org.junit.Assert.assertNotNull(strListArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strItor36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 52 + "'", int63 == 52);
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(strItor73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertArrayEquals(objArray76, new java.lang.Object[] {});
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.apache.commons.collections.list.TreeList<java.lang.String> strList0 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        strList0.clear();
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList4 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor7 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList4, (int) '4');
        int int9 = strList4.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList12 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor15 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList12, (int) '4');
        boolean boolean16 = strList4.retainAll((java.util.Collection<java.lang.String>) strList12);
        boolean boolean17 = strList4.isEmpty();
        java.util.ListIterator<java.lang.String> strItor19 = strList4.listIterator(0);
        int int20 = strList0.lastIndexOf((java.lang.Object) strItor19);
        java.util.stream.Stream<java.lang.String> strStream21 = strList0.stream();
        java.lang.Object[] objArray22 = strList0.toArray();
        strList0.clear();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strStream21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[] {});
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.checkModCount();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList7 = strItor5.parent;
        strItor5.nextIndex = 51;
        boolean boolean10 = strItor5.hasPrevious();
        int int11 = strItor5.currentIndex;
        // The following exception was thrown during execution in test generation
        try {
            strItor5.set("AVLNode(0,false,,true, faedelung false )");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode55 = strAVLNode54.next();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode57 = strAVLNode54.get((-2));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strAVLNode19);
        org.junit.Assert.assertNotNull(strAVLNode22);
        org.junit.Assert.assertNotNull(strAVLNode24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[]" + "'", str48, "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strStream50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(strAVLNode54);
        org.junit.Assert.assertNull(strAVLNode55);
        org.junit.Assert.assertNull(strAVLNode57);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode9 = null;
        strItor5.next = strAVLNode9;
        strItor5.nextIndex = 1;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList13 = strItor5.parent;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList14 = strItor5.parent;
        int int15 = strItor5.expectedModCount;
        int int16 = strItor5.nextIndex;
        boolean boolean17 = strItor5.hasNext();
        strItor5.add("[, [, hi!]]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode9 = null;
        strItor5.next = strAVLNode9;
        int int11 = strItor5.nextIndex;
        int int12 = strItor5.expectedModCount;
        int int13 = strItor5.previousIndex();
        strItor5.nextIndex = '4';
        org.apache.commons.collections.list.TreeList<java.lang.String> strList16 = strItor5.parent;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode17 = strItor5.next;
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList20 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor23 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList20, (int) '4');
        int int25 = strList20.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        boolean boolean31 = strList20.containsAll((java.util.Collection<java.lang.String>) strList29);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor33 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList20, (int) (byte) 1);
        java.lang.String str34 = strItor33.previous();
        strItor33.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode37 = strItor33.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode40 = strAVLNode37.insert((int) (byte) 0, "hi!");
        strAVLNode37.setValue("[]");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode44 = strAVLNode37.get((int) (byte) 10);
        strItor5.next = strAVLNode37;
        int int46 = strItor5.previousIndex();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 34 + "'", int13 == 34);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNull(strAVLNode17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strAVLNode37);
        org.junit.Assert.assertNotNull(strAVLNode40);
        org.junit.Assert.assertNull(strAVLNode44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 51 + "'", int46 == 51);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
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
        java.util.ListIterator<java.lang.String> strItor17 = strList2.listIterator(0);
        java.util.Spliterator<java.lang.String> strSpliterator18 = strList2.spliterator();
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList21 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor24 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList21, (int) '4');
        java.lang.Object obj25 = new java.lang.Object();
        int int26 = strList21.indexOf(obj25);
        boolean boolean28 = strList21.equals((java.lang.Object) "[hi!]");
        java.util.stream.Stream<java.lang.String> strStream29 = strList21.parallelStream();
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList32 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor35 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList32, (int) '4');
        int int37 = strList32.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        boolean boolean43 = strList32.containsAll((java.util.Collection<java.lang.String>) strList41);
        java.util.Spliterator<java.lang.String> strSpliterator44 = strList32.spliterator();
        java.lang.String str45 = strList32.toString();
        boolean boolean47 = strList32.add("[]");
        java.util.stream.Stream<java.lang.String> strStream48 = strList32.stream();
        boolean boolean49 = strList32.isEmpty();
        boolean boolean51 = strList32.add("[hi!]");
        int int52 = strList21.lastIndexOf((java.lang.Object) boolean51);
        java.lang.Class<?> wildcardClass53 = strList21.getClass();
        int int54 = strList2.lastIndexOf((java.lang.Object) wildcardClass53);
        boolean boolean56 = strList2.add("AVLNode(1,true,hi!,true, faedelung false )");
        java.util.Spliterator<java.lang.String> strSpliterator57 = strList2.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strStream29);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strSpliterator44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[]" + "'", str45, "[]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strStream48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strSpliterator57);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList7 = strItor5.parent;
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor13 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList10, (int) '4');
        int int14 = strItor13.nextIndex();
        strItor13.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode17 = null;
        strItor13.next = strAVLNode17;
        strItor13.nextIndex = 1;
        int int21 = strList7.indexOf((java.lang.Object) strItor13);
        boolean boolean23 = strList7.add("[hi!]");
        java.util.ListIterator<java.lang.String> strItor24 = strList7.listIterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strItor24);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList7 = strItor5.parent;
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor13 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList10, (int) '4');
        int int15 = strList10.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList18 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor21 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList18, (int) '4');
        int int23 = strList18.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean24 = strList10.contains((java.lang.Object) int23);
        java.lang.String str25 = strList10.toString();
        boolean boolean26 = strList7.removeAll((java.util.Collection<java.lang.String>) strList10);
        java.lang.String str27 = strList10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator28 = strList10.spliterator();
        java.lang.String str30 = strList10.remove((int) (short) 0);
        boolean boolean32 = strList10.add("");
        boolean boolean33 = strList10.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream34 = strList10.stream();
        java.util.Spliterator<java.lang.String> strSpliterator35 = strList10.spliterator();
        java.lang.Class<?> wildcardClass36 = strSpliterator35.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertNotNull(strSpliterator28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strStream34);
        org.junit.Assert.assertNotNull(strSpliterator35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.checkModCount();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode7 = strItor5.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode8 = null;
        strItor5.next = strAVLNode8;
        int int10 = strItor5.expectedModCount;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode11 = strItor5.next;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode12 = strItor5.next;
        int int13 = strItor5.previousIndex();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(strAVLNode7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(strAVLNode11);
        org.junit.Assert.assertNull(strAVLNode12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.apache.commons.collections.list.TreeList<java.lang.String> strList0 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        strList0.clear();
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList4 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor7 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList4, (int) '4');
        int int9 = strList4.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList12 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor15 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList12, (int) '4');
        boolean boolean16 = strList4.retainAll((java.util.Collection<java.lang.String>) strList12);
        boolean boolean17 = strList4.isEmpty();
        java.util.ListIterator<java.lang.String> strItor19 = strList4.listIterator(0);
        int int20 = strList0.lastIndexOf((java.lang.Object) strItor19);
        java.util.stream.Stream<java.lang.String> strStream21 = strList0.stream();
        boolean boolean22 = strList0.isEmpty();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList7 = strItor5.parent;
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor13 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList10, (int) '4');
        int int15 = strList10.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList18 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor21 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList18, (int) '4');
        int int23 = strList18.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean24 = strList10.contains((java.lang.Object) int23);
        java.lang.String str25 = strList10.toString();
        boolean boolean26 = strList7.removeAll((java.util.Collection<java.lang.String>) strList10);
        java.lang.String str27 = strList10.toString();
        java.util.Spliterator<java.lang.String> strSpliterator28 = strList10.spliterator();
        java.lang.String str30 = strList10.remove((int) (short) 0);
        int int31 = strList10.size();
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList34 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor37 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList34, (int) '4');
        int int38 = strItor37.nextIndex();
        strItor37.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode41 = null;
        strItor37.next = strAVLNode41;
        strItor37.nextIndex = 1;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList45 = strItor37.parent;
        java.util.stream.Stream<java.lang.String> strStream46 = strList45.stream();
        boolean boolean47 = strList10.containsAll((java.util.Collection<java.lang.String>) strList45);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertNotNull(strSpliterator28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(strStream46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
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
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList44 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor47 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList44, (int) '4');
        int int49 = strList44.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray52 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        boolean boolean55 = strList44.containsAll((java.util.Collection<java.lang.String>) strList53);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor57 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList44, (int) (byte) 1);
        int int58 = strList44.size();
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor60 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList44, (int) (short) 10);
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode61 = null;
        strItor60.next = strAVLNode61;
        int int63 = strItor60.nextIndex;
        int int65 = strAVLNode37.indexOf((java.lang.Object) int63, (int) (short) 100);
        strAVLNode37.setValue("AVLNode(1,true,hi!,false, faedelung true )");
        java.lang.String str68 = strAVLNode37.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strAVLNode37);
        org.junit.Assert.assertNotNull(strAVLNode41);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "AVLNode(0,false,AVLNode(1,true,hi!,false, faedelung true ),true, faedelung false )" + "'", str68, "AVLNode(0,false,AVLNode(1,true,hi!,false, faedelung true ),true, faedelung false )");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
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
        boolean boolean20 = strItor15.hasNext();
        strItor15.set("AVLNode(1,true,[],false, faedelung true )");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode23 = strItor15.next;
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strAVLNode19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strAVLNode23);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
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
        boolean boolean21 = strList2.add("[hi!]");
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        boolean boolean32 = strList25.addAll((int) (byte) 1, (java.util.Collection<java.lang.String>) strList30);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        boolean boolean43 = strList36.addAll((int) (byte) 1, (java.util.Collection<java.lang.String>) strList41);
        java.lang.String str44 = strList41.toString();
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList48 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor51 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList48, (int) '4');
        java.lang.Object obj52 = new java.lang.Object();
        int int53 = strList48.indexOf(obj52);
        boolean boolean54 = strList41.addAll((int) (short) 1, (java.util.Collection<java.lang.String>) strList48);
        boolean boolean55 = strList30.equals((java.lang.Object) strList48);
        java.util.ListIterator<java.lang.String> strItor56 = strList48.listIterator();
        boolean boolean57 = strList2.containsAll((java.util.Collection<java.lang.String>) strList48);
        int int58 = strList2.size();
        java.util.stream.Stream<java.lang.String> strStream59 = strList2.parallelStream();
        java.lang.String[] strArray62 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList63 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor66 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList63, (int) '4');
        int int67 = strItor66.nextIndex();
        strItor66.nextIndex = '#';
        int int70 = strItor66.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList71 = strItor66.parent;
        java.lang.String str73 = strList71.get((int) (short) 0);
        strList71.clear();
        boolean boolean75 = strList2.addAll(3, (java.util.Collection<java.lang.String>) strList71);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor77 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList71, 1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[hi!]" + "'", str44, "[hi!]");
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strItor56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 3 + "'", int58 == 3);
        org.junit.Assert.assertNotNull(strStream59);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 52 + "'", int67 == 52);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 35 + "'", int70 == 35);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex;
        int int7 = strItor5.previousIndex();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode8 = strItor5.next;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode9 = null;
        strItor5.current = strAVLNode9;
        strItor5.expectedModCount = (short) 100;
        int int13 = strItor5.nextIndex;
        strItor5.nextIndex = 34;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode16 = strItor5.next;
        int int17 = strItor5.nextIndex;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList18 = strItor5.parent;
        boolean boolean20 = strList18.add("AVLNode(1,true,[hi!],false, faedelung true )");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertNull(strAVLNode8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNull(strAVLNode16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 34 + "'", int17 == 34);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode9 = null;
        strItor5.next = strAVLNode9;
        strItor5.nextIndex = 1;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList13 = strItor5.parent;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList14 = strItor5.parent;
        strItor5.checkModCount();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode16 = strItor5.next;
        strItor5.expectedModCount = 52;
        int int19 = strItor5.expectedModCount;
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNull(strAVLNode16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        boolean boolean44 = strList37.addAll((int) (byte) 1, (java.util.Collection<java.lang.String>) strList42);
        java.lang.String str45 = strList42.toString();
        java.lang.String[] strArray48 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList49 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor52 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList49, (int) '4');
        java.lang.Object obj53 = new java.lang.Object();
        int int54 = strList49.indexOf(obj53);
        boolean boolean55 = strList42.addAll((int) (short) 1, (java.util.Collection<java.lang.String>) strList49);
        int int56 = strList16.indexOf((java.lang.Object) strList49);
        boolean boolean58 = strList16.add("[]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str60 = strList16.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[hi!]" + "'", str45, "[hi!]");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList7 = strItor5.parent;
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor13 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList10, (int) '4');
        int int14 = strItor13.nextIndex();
        strItor13.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode17 = null;
        strItor13.next = strAVLNode17;
        strItor13.nextIndex = 1;
        int int21 = strList7.indexOf((java.lang.Object) strItor13);
        java.lang.String str22 = strItor13.previous();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode23 = strItor13.next;
        int int24 = strItor13.expectedModCount;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode25 = strItor13.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode28 = strAVLNode25.insert(35, "AVLNode(1,true,hi!,false, faedelung true )");
        java.lang.String str29 = strAVLNode28.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strAVLNode23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(strAVLNode25);
        org.junit.Assert.assertNotNull(strAVLNode28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AVLNode(0,false,,true, faedelung false )" + "'", str29, "AVLNode(0,false,,true, faedelung false )");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
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
        strItor28.expectedModCount = 2;
        int int31 = strItor28.previousIndex();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 50 + "'", int31 == 50);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
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
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList17 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor20 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList17, (int) '4');
        int int22 = strList17.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        boolean boolean28 = strList17.containsAll((java.util.Collection<java.lang.String>) strList26);
        java.util.Spliterator<java.lang.String> strSpliterator29 = strList17.spliterator();
        boolean boolean30 = strList2.equals((java.lang.Object) strSpliterator29);
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList33 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor36 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList33, (int) '4');
        int int38 = strList33.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList41 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor44 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList41, (int) '4');
        boolean boolean45 = strList33.retainAll((java.util.Collection<java.lang.String>) strList41);
        boolean boolean46 = strList33.isEmpty();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList47 = new org.apache.commons.collections.list.TreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList33);
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList50 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor53 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList50, (int) '4');
        int int55 = strList50.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray58 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        boolean boolean61 = strList50.containsAll((java.util.Collection<java.lang.String>) strList59);
        java.util.Spliterator<java.lang.String> strSpliterator62 = strList50.spliterator();
        boolean boolean64 = strList50.remove((java.lang.Object) 1.0d);
        java.util.Iterator<java.lang.String> strItor65 = strList50.iterator();
        boolean boolean66 = strList47.contains((java.lang.Object) strList50);
        boolean boolean67 = strList2.remove((java.lang.Object) boolean66);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strSpliterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(strSpliterator62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strItor65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
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
        int int32 = strList27.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        boolean boolean38 = strList27.containsAll((java.util.Collection<java.lang.String>) strList36);
        java.util.Spliterator<java.lang.String> strSpliterator39 = strList27.spliterator();
        java.lang.String str40 = strList27.toString();
        boolean boolean42 = strList27.add("[]");
        java.lang.String[] strArray44 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList45 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor48 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList45, (int) '4');
        int int49 = strItor48.nextIndex();
        strItor48.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode52 = null;
        strItor48.next = strAVLNode52;
        strItor48.nextIndex = 1;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList56 = strItor48.parent;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList57 = strItor48.parent;
        int int58 = strList57.size();
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!", "hi!", "[hi!]", "", "", "" };
        java.lang.String[] strArray66 = strList57.toArray(strArray65);
        java.lang.Comparable<java.lang.String>[] strComparableArray67 = strList27.toArray((java.lang.Comparable<java.lang.String>[]) strArray65);
        // The following exception was thrown during execution in test generation
        try {
            strAVLNode24.toArray((java.lang.Object[]) strArray65, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strAVLNode19);
        org.junit.Assert.assertNotNull(strAVLNode22);
        org.junit.Assert.assertNotNull(strAVLNode24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strSpliterator39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[]" + "'", str40, "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 52 + "'", int49 == 52);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "", "[]", null, "", "", "" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "", "[]", null, "", "", "" });
        org.junit.Assert.assertNotNull(strComparableArray67);
        org.junit.Assert.assertArrayEquals(strComparableArray67, new java.lang.String[] { "", "[]", null, "", "", "" });
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
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
        strItor15.set("[, [, hi!]]");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode19 = strItor15.next;
        strAVLNode19.setValue("AVLNode(0,false,hi!,true, faedelung false )");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strAVLNode19);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        int int9 = strItor5.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = strItor5.parent;
        java.lang.String str12 = strList10.get((int) (short) 0);
        strList10.clear();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList14 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean15 = strList10.containsAll((java.util.Collection<java.lang.String>) strList14);
        java.util.Collection<java.lang.String> strCollection17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = strList10.addAll((int) (byte) 100, strCollection17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
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
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode15 = null;
        strItor11.next = strAVLNode15;
        int int17 = strItor11.nextIndex;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode18 = null;
        strItor11.next = strAVLNode18;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList20 = strItor11.parent;
        int int21 = strList2.indexOf((java.lang.Object) strItor11);
        strItor11.expectedModCount = 0;
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList26 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor29 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList26, (int) '4');
        int int30 = strItor29.nextIndex();
        strItor29.nextIndex = '#';
        int int33 = strItor29.nextIndex();
        strItor29.nextIndex = (short) -1;
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList38 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor41 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList38, (int) '4');
        int int43 = strList38.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray46 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        boolean boolean49 = strList38.containsAll((java.util.Collection<java.lang.String>) strList47);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor51 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList38, (int) (byte) 1);
        java.lang.String str52 = strItor51.previous();
        strItor51.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode55 = strItor51.current;
        strItor29.next = strAVLNode55;
        strItor11.next = strAVLNode55;
        java.lang.String[] strArray59 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList60 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor63 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList60, (int) '4');
        int int65 = strList60.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray68 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        boolean boolean71 = strList60.containsAll((java.util.Collection<java.lang.String>) strList69);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor73 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList60, (int) (byte) 1);
        java.lang.String str74 = strItor73.previous();
        strItor73.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode77 = strItor73.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode80 = strAVLNode77.insert((int) (byte) 0, "hi!");
        java.lang.String str81 = strAVLNode80.getValue();
        java.lang.String str82 = strAVLNode80.getValue();
        int int85 = strAVLNode80.indexOf((java.lang.Object) "[, hi!]", 3);
        strItor11.next = strAVLNode80;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode88 = strAVLNode80.get(0);
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode91 = strAVLNode88.insert((int) (byte) 0, "[]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode93 = strAVLNode91.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(strAVLNode55);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(strAVLNode77);
        org.junit.Assert.assertNotNull(strAVLNode80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNotNull(strAVLNode88);
        org.junit.Assert.assertNotNull(strAVLNode91);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex;
        int int7 = strItor5.previousIndex();
        int int8 = strItor5.nextIndex;
        int int9 = strItor5.nextIndex;
        int int10 = strItor5.currentIndex;
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
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
        int int16 = strList11.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        boolean boolean22 = strList11.containsAll((java.util.Collection<java.lang.String>) strList20);
        java.util.Spliterator<java.lang.String> strSpliterator23 = strList11.spliterator();
        java.lang.String str24 = strList11.toString();
        boolean boolean26 = strList11.add("[]");
        java.util.stream.Stream<java.lang.String> strStream27 = strList11.stream();
        boolean boolean28 = strList2.addAll((java.util.Collection<java.lang.String>) strList11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = strList11.set(3, "AVLNode(0,false,[],false, faedelung true )");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:3, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strSpliterator23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strStream27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.nextIndex = (-1);
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode8 = strItor5.next;
        int int9 = strItor5.previousIndex();
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList12 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor15 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList12, (int) '4');
        int int17 = strList12.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        boolean boolean23 = strList12.containsAll((java.util.Collection<java.lang.String>) strList21);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor25 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList12, (int) (byte) 1);
        int int26 = strList12.size();
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor28 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList12, (int) (short) 10);
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode29 = null;
        strItor28.next = strAVLNode29;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList31 = strItor28.parent;
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList34 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor37 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList34, (int) '4');
        int int39 = strList34.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        boolean boolean45 = strList34.containsAll((java.util.Collection<java.lang.String>) strList43);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor47 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList34, (int) (byte) 1);
        java.lang.String str48 = strItor47.previous();
        strItor47.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode51 = strItor47.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode54 = strAVLNode51.insert((int) (byte) 0, "hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode56 = strAVLNode54.remove((int) (byte) 0);
        java.lang.String[] strArray58 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList59 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor62 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList59, (int) '4');
        int int63 = strItor62.nextIndex();
        strItor62.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode66 = null;
        strItor62.next = strAVLNode66;
        strItor62.nextIndex = 1;
        strItor62.add("[]");
        int int73 = strAVLNode56.indexOf((java.lang.Object) "[]", 3);
        java.lang.String str74 = strAVLNode56.getValue();
        strItor28.next = strAVLNode56;
        strItor5.next = strAVLNode56;
        int int77 = strItor5.currentIndex;
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(strAVLNode8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(strAVLNode51);
        org.junit.Assert.assertNotNull(strAVLNode54);
        org.junit.Assert.assertNotNull(strAVLNode56);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 52 + "'", int63 == 52);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        java.lang.Object obj6 = new java.lang.Object();
        int int7 = strList2.indexOf(obj6);
        int int8 = strList2.size();
        boolean boolean10 = strList2.add("");
        java.util.Iterator<java.lang.String> strItor11 = strList2.iterator();
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList14 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor17 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList14, (int) '4');
        int int19 = strList14.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList22 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor25 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList22, (int) '4');
        boolean boolean26 = strList14.retainAll((java.util.Collection<java.lang.String>) strList22);
        strList22.clear();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList28 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList29 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        java.lang.String str30 = strList29.toString();
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList33 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor36 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList33, (int) '4');
        int int38 = strList33.lastIndexOf((java.lang.Object) (byte) -1);
        org.apache.commons.collections.list.TreeList[] treeListArray40 = new org.apache.commons.collections.list.TreeList[2];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections.list.TreeList<java.lang.String>[] strListArray41 = (org.apache.commons.collections.list.TreeList<java.lang.String>[]) treeListArray40;
        strListArray41[0] = strList29;
        strListArray41[1] = strList33;
        org.apache.commons.collections.list.TreeList<java.lang.String>[] strListArray46 = strList28.toArray(strListArray41);
        boolean boolean47 = strList22.retainAll((java.util.Collection<java.lang.String>) strList28);
        java.util.stream.BaseStream[][] baseStreamArray49 = new java.util.stream.BaseStream[0][];
        @SuppressWarnings("unchecked")
        java.util.stream.BaseStream<java.lang.String, java.util.stream.Stream<java.lang.String>>[][] strBaseStreamArray50 = (java.util.stream.BaseStream<java.lang.String, java.util.stream.Stream<java.lang.String>>[][]) baseStreamArray49;
        java.util.stream.BaseStream<java.lang.String, java.util.stream.Stream<java.lang.String>>[][] strBaseStreamArray51 = strList22.toArray(strBaseStreamArray50);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable[] serializableArray52 = strList2.toArray((java.io.Serializable[]) strBaseStreamArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(treeListArray40);
        org.junit.Assert.assertNotNull(strListArray41);
        org.junit.Assert.assertNotNull(strListArray46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(baseStreamArray49);
        org.junit.Assert.assertArrayEquals(baseStreamArray49, new java.util.stream.BaseStream[][] {});
        org.junit.Assert.assertNotNull(strBaseStreamArray50);
        org.junit.Assert.assertArrayEquals(strBaseStreamArray50, new java.util.stream.BaseStream[][] {});
        org.junit.Assert.assertNotNull(strBaseStreamArray51);
        org.junit.Assert.assertArrayEquals(strBaseStreamArray51, new java.util.stream.BaseStream[][] {});
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.checkModCount();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode7 = strItor5.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode8 = null;
        strItor5.next = strAVLNode8;
        int int10 = strItor5.currentIndex;
        strItor5.expectedModCount = 1;
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList15 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor18 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList15, (int) '4');
        int int20 = strList15.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        boolean boolean26 = strList15.containsAll((java.util.Collection<java.lang.String>) strList24);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor28 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList15, (int) (byte) 1);
        java.lang.String str29 = strItor28.previous();
        strItor28.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode32 = strItor28.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode35 = strAVLNode32.insert((int) (byte) 0, "hi!");
        java.lang.String str36 = strAVLNode35.getValue();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode37 = strAVLNode35.previous();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode40 = strAVLNode35.insert(100, "[, hi!]");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode41 = strAVLNode35.next();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode43 = strAVLNode35.remove(0);
        strItor5.next = strAVLNode43;
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList47 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor50 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList47, (int) '4');
        int int52 = strList47.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray55 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        boolean boolean58 = strList47.containsAll((java.util.Collection<java.lang.String>) strList56);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor60 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList47, (int) (byte) 1);
        java.lang.String str61 = strItor60.previous();
        strItor60.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode64 = strItor60.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode67 = strAVLNode64.insert((int) (byte) 0, "hi!");
        java.lang.String str68 = strAVLNode67.getValue();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode69 = strAVLNode67.previous();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode72 = strAVLNode67.insert(100, "[, hi!]");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode73 = strAVLNode67.next();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode74 = strAVLNode73.next();
        strItor5.next = strAVLNode73;
        strItor5.expectedModCount = 0;
        int int78 = strItor5.currentIndex;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList79 = strItor5.parent;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str81 = strList79.remove(50);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:50, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(strAVLNode7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strAVLNode32);
        org.junit.Assert.assertNotNull(strAVLNode35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(strAVLNode37);
        org.junit.Assert.assertNotNull(strAVLNode40);
        org.junit.Assert.assertNotNull(strAVLNode41);
        org.junit.Assert.assertNotNull(strAVLNode43);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(strAVLNode64);
        org.junit.Assert.assertNotNull(strAVLNode67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(strAVLNode69);
        org.junit.Assert.assertNotNull(strAVLNode72);
        org.junit.Assert.assertNotNull(strAVLNode73);
        org.junit.Assert.assertNull(strAVLNode74);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(strList79);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList7 = strItor5.parent;
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor13 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList10, (int) '4');
        int int14 = strItor13.nextIndex();
        strItor13.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode17 = null;
        strItor13.next = strAVLNode17;
        strItor13.nextIndex = 1;
        int int21 = strList7.indexOf((java.lang.Object) strItor13);
        java.lang.String str22 = strItor13.previous();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode23 = strItor13.next;
        int int24 = strItor13.expectedModCount;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList25 = strItor13.parent;
        boolean boolean27 = strList25.add("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strAVLNode23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        strItor5.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode9 = null;
        strItor5.next = strAVLNode9;
        strItor5.nextIndex = 1;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList13 = strItor5.parent;
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList16 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor19 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList16, (int) '4');
        int int20 = strItor19.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList21 = strItor19.parent;
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList24 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor27 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList24, (int) '4');
        int int29 = strList24.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList32 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor35 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList32, (int) '4');
        int int37 = strList32.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean38 = strList24.contains((java.lang.Object) int37);
        java.lang.String str39 = strList24.toString();
        boolean boolean40 = strList21.removeAll((java.util.Collection<java.lang.String>) strList24);
        java.lang.String str41 = strList24.toString();
        boolean boolean42 = strList13.remove((java.lang.Object) str41);
        boolean boolean44 = strList13.add("");
        strList13.add((int) (short) 0, "[]");
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList50 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor53 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList50, (int) '4');
        int int55 = strList50.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList58 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor61 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList58, (int) '4');
        boolean boolean62 = strList50.retainAll((java.util.Collection<java.lang.String>) strList58);
        boolean boolean63 = strList50.isEmpty();
        boolean boolean64 = strList13.removeAll((java.util.Collection<java.lang.String>) strList50);
        java.util.ListIterator<java.lang.String> strItor65 = strList13.listIterator();
        java.util.stream.Stream<java.lang.String> strStream66 = strList13.stream();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[]" + "'", str41, "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(strItor65);
        org.junit.Assert.assertNotNull(strStream66);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
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
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode34 = strAVLNode30.insert(2, "AVLNode(0,false,AVLNode(0,false,,false, faedelung true ),false, faedelung true )");
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
        org.apache.commons.collections.list.TreeList<java.lang.String> strList52 = strItor50.parent;
        int int54 = strAVLNode30.indexOf((java.lang.Object) strItor50, 34);
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode56 = strAVLNode30.get(3);
        java.lang.String[] strArray58 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList59 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor62 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList59, (int) '4');
        int int63 = strItor62.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList64 = strItor62.parent;
        java.lang.String[] strArray66 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList67 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor70 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList67, (int) '4');
        int int72 = strList67.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray74 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList75 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor78 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList75, (int) '4');
        int int80 = strList75.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean81 = strList67.contains((java.lang.Object) int80);
        java.lang.String str82 = strList67.toString();
        boolean boolean83 = strList64.removeAll((java.util.Collection<java.lang.String>) strList67);
        java.lang.String str84 = strList67.toString();
        java.util.stream.Stream<java.lang.String> strStream85 = strList67.stream();
        int int87 = strAVLNode30.indexOf((java.lang.Object) strStream85, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strAVLNode30);
        org.junit.Assert.assertNotNull(strAVLNode34);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNull(strAVLNode56);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 52 + "'", int63 == 52);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertArrayEquals(strArray74, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "[]" + "'", str82, "[]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "[]" + "'", str84, "[]");
        org.junit.Assert.assertNotNull(strStream85);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
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
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList26 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor29 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList26, (int) '4');
        int int31 = strList26.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        boolean boolean37 = strList26.containsAll((java.util.Collection<java.lang.String>) strList35);
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList40 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor43 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList40, (int) '4');
        int int45 = strList40.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList48 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor51 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList48, (int) '4');
        int int53 = strList48.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean54 = strList40.contains((java.lang.Object) int53);
        java.lang.String str55 = strList40.toString();
        strList40.clear();
        boolean boolean57 = strList35.addAll((java.util.Collection<java.lang.String>) strList40);
        java.lang.String[] strArray60 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        boolean boolean68 = strList61.addAll((int) (byte) 1, (java.util.Collection<java.lang.String>) strList66);
        java.lang.String str69 = strList66.toString();
        java.lang.String[] strArray72 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList73 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList73, strArray72);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor76 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList73, (int) '4');
        java.lang.Object obj77 = new java.lang.Object();
        int int78 = strList73.indexOf(obj77);
        boolean boolean79 = strList66.addAll((int) (short) 1, (java.util.Collection<java.lang.String>) strList73);
        int int80 = strList40.indexOf((java.lang.Object) strList73);
        boolean boolean82 = strList40.add("[]");
        strList40.clear();
        boolean boolean84 = strList2.addAll((java.util.Collection<java.lang.String>) strList40);
        java.util.Iterator<java.lang.String> strItor85 = strList40.iterator();
        java.lang.Object[] objArray86 = strList40.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.lang.String> strItor88 = strList40.listIterator(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:2, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strStream18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "[]" + "'", str55, "[]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "[hi!]" + "'", str69, "[hi!]");
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(strItor85);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertArrayEquals(objArray86, new java.lang.Object[] {});
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        int int6 = strItor5.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList7 = strItor5.parent;
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList10 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor13 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList10, (int) '4');
        int int14 = strItor13.nextIndex();
        strItor13.nextIndex = '#';
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode17 = null;
        strItor13.next = strAVLNode17;
        strItor13.nextIndex = 1;
        int int21 = strList7.indexOf((java.lang.Object) strItor13);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList24 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor27 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList24, (int) '4');
        int int29 = strList24.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        boolean boolean35 = strList24.containsAll((java.util.Collection<java.lang.String>) strList33);
        java.util.stream.Stream<java.lang.String> strStream36 = strList24.stream();
        boolean boolean37 = strList7.contains((java.lang.Object) strStream36);
        int int38 = strList7.size();
        java.lang.String[] strArray41 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList42 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor45 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList42, (int) '4');
        int int46 = strItor45.nextIndex();
        org.apache.commons.collections.list.TreeList<java.lang.String> strList47 = strItor45.parent;
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList50 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor53 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList50, (int) '4');
        int int55 = strList50.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList58 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor61 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList58, (int) '4');
        int int63 = strList58.lastIndexOf((java.lang.Object) (byte) -1);
        boolean boolean64 = strList50.contains((java.lang.Object) int63);
        java.lang.String str65 = strList50.toString();
        boolean boolean66 = strList47.removeAll((java.util.Collection<java.lang.String>) strList50);
        java.lang.String str67 = strList50.toString();
        java.util.Spliterator<java.lang.String> strSpliterator68 = strList50.spliterator();
        boolean boolean69 = strList7.addAll(0, (java.util.Collection<java.lang.String>) strList50);
        java.lang.String str70 = strList50.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strStream36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 52 + "'", int46 == 52);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "[]" + "'", str65, "[]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "[]" + "'", str67, "[]");
        org.junit.Assert.assertNotNull(strSpliterator68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "[]" + "'", str70, "[]");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.checkModCount();
        strItor5.checkModCount();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode8 = strItor5.current;
        int int9 = strItor5.expectedModCount;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode10 = null;
        strItor5.next = strAVLNode10;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode12 = strItor5.next;
        org.apache.commons.collections.list.TreeList<java.lang.String> strList13 = strItor5.parent;
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(strAVLNode8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(strAVLNode12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.checkModCount();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode7 = strItor5.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode8 = null;
        strItor5.next = strAVLNode8;
        int int10 = strItor5.currentIndex;
        strItor5.expectedModCount = 1;
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList15 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor18 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList15, (int) '4');
        int int20 = strList15.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        boolean boolean26 = strList15.containsAll((java.util.Collection<java.lang.String>) strList24);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor28 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList15, (int) (byte) 1);
        java.lang.String str29 = strItor28.previous();
        strItor28.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode32 = strItor28.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode35 = strAVLNode32.insert((int) (byte) 0, "hi!");
        java.lang.String str36 = strAVLNode35.getValue();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode37 = strAVLNode35.previous();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode40 = strAVLNode35.insert(100, "[, hi!]");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode41 = strAVLNode35.next();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode43 = strAVLNode35.remove(0);
        strItor5.next = strAVLNode43;
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList47 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor50 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList47, (int) '4');
        int int52 = strList47.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray55 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        boolean boolean58 = strList47.containsAll((java.util.Collection<java.lang.String>) strList56);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor60 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList47, (int) (byte) 1);
        java.lang.String str61 = strItor60.previous();
        strItor60.set("hi!");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode64 = strItor60.current;
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode67 = strAVLNode64.insert((int) (byte) 0, "hi!");
        java.lang.String str68 = strAVLNode67.getValue();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode69 = strAVLNode67.previous();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode72 = strAVLNode67.insert(100, "[, hi!]");
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode73 = strAVLNode67.next();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode74 = strAVLNode73.next();
        strItor5.next = strAVLNode73;
        strItor5.expectedModCount = 0;
        int int78 = strItor5.currentIndex;
        strItor5.nextIndex = (byte) 10;
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(strAVLNode7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strAVLNode32);
        org.junit.Assert.assertNotNull(strAVLNode35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(strAVLNode37);
        org.junit.Assert.assertNotNull(strAVLNode40);
        org.junit.Assert.assertNotNull(strAVLNode41);
        org.junit.Assert.assertNotNull(strAVLNode43);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(strAVLNode64);
        org.junit.Assert.assertNotNull(strAVLNode67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(strAVLNode69);
        org.junit.Assert.assertNotNull(strAVLNode72);
        org.junit.Assert.assertNotNull(strAVLNode73);
        org.junit.Assert.assertNull(strAVLNode74);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList2 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor5 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList2, (int) '4');
        strItor5.nextIndex = (-1);
        boolean boolean8 = strItor5.hasPrevious();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode9 = strItor5.next;
        int int10 = strItor5.currentIndex;
        strItor5.nextIndex = (-1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strAVLNode9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
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
        int int18 = strList13.lastIndexOf((java.lang.Object) (byte) -1);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        boolean boolean24 = strList13.containsAll((java.util.Collection<java.lang.String>) strList22);
        boolean boolean26 = strList13.equals((java.lang.Object) 10.0f);
        boolean boolean27 = strList0.addAll((java.util.Collection<java.lang.String>) strList13);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList30 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor33 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList30, (int) '4');
        java.lang.Object obj34 = new java.lang.Object();
        int int35 = strList30.indexOf(obj34);
        boolean boolean37 = strList30.equals((java.lang.Object) "[hi!]");
        java.util.stream.Stream<java.lang.String> strStream38 = strList30.parallelStream();
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList41 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor44 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList41, (int) '4');
        strItor44.checkModCount();
        strItor44.checkModCount();
        int int47 = strItor44.expectedModCount;
        strItor44.checkModCount();
        strItor44.currentIndex = (byte) 10;
        int int51 = strList30.indexOf((java.lang.Object) (byte) 10);
        boolean boolean52 = strList13.retainAll((java.util.Collection<java.lang.String>) strList30);
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        org.apache.commons.collections.list.TreeList<java.lang.String> strList55 = new org.apache.commons.collections.list.TreeList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String> strItor58 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.lang.String>(strList55, (int) '4');
        strItor58.checkModCount();
        org.apache.commons.collections.list.TreeList.AVLNode<java.lang.String> strAVLNode60 = strItor58.current;
        boolean boolean61 = strItor58.hasNext();
        strItor58.currentIndex = (byte) 10;
        strItor58.currentIndex = 'a';
        strItor58.expectedModCount = (short) 0;
        int int68 = strItor58.expectedModCount;
        int int69 = strItor58.nextIndex;
        boolean boolean70 = strList13.contains((java.lang.Object) strItor58);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str73 = strList13.set((int) '#', "AVLNode(1,true,[],true, faedelung false )");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:35, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strStream38);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(strAVLNode60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 52 + "'", int69 == 52);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }
}

