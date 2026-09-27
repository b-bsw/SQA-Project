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
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        int int6 = node3.getSideEffectFlags();
        boolean boolean7 = node3.isVoid();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj13 = node11.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj19 = node17.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node20 = node11.clonePropsFrom(node17);
        boolean boolean21 = node11.isNew();
        boolean boolean22 = node11.isNew();
        int int23 = node11.getType();
        boolean boolean24 = node11.mayMutateArguments();
        boolean boolean25 = node11.isBlock();
        boolean boolean26 = node3.isEquivalentToTyped(node11);
        // The following exception was thrown during execution in test generation
        try {
            node11.setQuotedString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not a StringNode");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        int int6 = node3.getChangeTime();
        java.lang.String str7 = node3.getSourceFileName();
        java.lang.Object obj9 = node3.getProp((int) (short) 100);
        java.util.Set<java.lang.String> strSet10 = node3.getDirectives();
        boolean boolean11 = node3.isAssign();
        int int12 = node3.getSourceOffset();
        boolean boolean13 = node3.isRegExp();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isOr();
        boolean boolean7 = node3.hasOneChild();
        node3.setChangeTime(31);
        java.lang.String str10 = node3.getQualifiedName();
        boolean boolean11 = node3.isLabelName();
        com.google.javascript.rhino.Node node12 = node3.cloneTree();
        boolean boolean13 = node3.isNew();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node3.isNew();
        com.google.javascript.rhino.Node node14 = node3.removeChildren();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (byte) 10, 54, 31);
        boolean boolean19 = node18.isDec();
        com.google.javascript.rhino.Node node20 = node3.copyInformationFrom(node18);
        node3.setLength((-1));
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean27 = node26.isLabelName();
        com.google.javascript.rhino.Node node28 = node26.getLastChild();
        boolean boolean29 = node26.isOr();
        boolean boolean30 = node26.hasOneChild();
        node26.setChangeTime(31);
        node26.putIntProp(57, 57);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        node26.setJSType(jSType36);
        boolean boolean38 = node26.wasEmptyNode();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean43 = node42.isLabelName();
        com.google.javascript.rhino.Node node44 = node42.getLastChild();
        boolean boolean45 = node42.isOr();
        boolean boolean46 = node42.isThis();
        boolean boolean47 = node42.isDebugger();
        node42.setOptionalArg(true);
        java.lang.Object obj51 = node42.getProp(29);
        boolean boolean52 = node42.isScript();
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean58 = node57.isLabelName();
        com.google.javascript.rhino.Node node59 = node57.getLastChild();
        boolean boolean60 = node57.isOr();
        boolean boolean61 = node57.isThis();
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj67 = node65.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj73 = node71.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node74 = node65.clonePropsFrom(node71);
        boolean boolean75 = node74.isNull();
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj81 = node79.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node84 = new com.google.javascript.rhino.Node(10, node57, node74, node79, (int) 'a', 54);
        boolean boolean85 = node74.isExprResult();
        com.google.javascript.rhino.Node node89 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj91 = node89.getProp((int) (short) -1);
        int int92 = node89.getSideEffectFlags();
        boolean boolean93 = node89.isLocalResultCall();
        boolean boolean94 = node74.hasChild(node89);
        com.google.javascript.rhino.Node node95 = node42.copyInformationFrom(node74);
        com.google.javascript.rhino.Node node96 = node26.useSourceInfoIfMissingFrom(node95);
        com.google.javascript.rhino.Node node97 = node3.copyInformationFromForTree(node26);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(node95);
        org.junit.Assert.assertNotNull(node96);
        org.junit.Assert.assertNotNull(node97);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = null;
        node3.setStaticSourceFile(staticSourceFile5);
        boolean boolean7 = node3.isSwitch();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean13 = node12.isLabelName();
        com.google.javascript.rhino.Node node14 = node12.getLastChild();
        boolean boolean15 = node12.isOr();
        boolean boolean16 = node12.isThis();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj22 = node20.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj28 = node26.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node29 = node20.clonePropsFrom(node26);
        boolean boolean30 = node29.isNull();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj36 = node34.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(10, node12, node29, node34, (int) 'a', 54);
        com.google.javascript.rhino.Node node40 = node3.useSourceInfoFromForTree(node39);
        boolean boolean41 = node3.isDefaultCase();
        com.google.javascript.rhino.Node node42 = node3.removeChildren();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        boolean boolean6 = node3.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node3.siblings();
        boolean boolean8 = node3.isLabelName();
        node3.detachChildren();
        com.google.javascript.rhino.Node node11 = node3.getChildAtIndex(0);
        com.google.javascript.rhino.Node node12 = node3.getNext();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean5 = node4.isLabelName();
        com.google.javascript.rhino.Node node6 = node4.getLastChild();
        boolean boolean7 = node4.isOr();
        boolean boolean8 = node4.isThis();
        java.lang.Object obj10 = node4.getProp(0);
        int int11 = node4.getSourcePosition();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj17 = node15.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean22 = node21.isLabelName();
        com.google.javascript.rhino.Node node23 = node21.getLastChild();
        boolean boolean24 = node15.hasChild(node21);
        boolean boolean25 = node15.hasChildren();
        int int26 = node15.getChildCount();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(0, node4, node15);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node3.isNew();
        boolean boolean14 = node3.isNew();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj20 = node18.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj26 = node24.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node27 = node18.clonePropsFrom(node24);
        boolean boolean28 = node18.isNew();
        boolean boolean29 = node3.isEquivalentToShallow(node18);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder30 = node18.new FileLevelJsDocBuilder();
        java.lang.Class<?> wildcardClass31 = fileLevelJsDocBuilder30.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean6 = node5.isLabelName();
        com.google.javascript.rhino.Node node7 = node5.getLastChild();
        boolean boolean8 = node5.isOr();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean13 = node12.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile14 = null;
        node12.setStaticSourceFile(staticSourceFile14);
        boolean boolean16 = node12.isSwitch();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean21 = node20.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile22 = null;
        node20.setStaticSourceFile(staticSourceFile22);
        boolean boolean24 = node20.isSwitch();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj30 = node28.getProp((int) (short) -1);
        int int31 = node28.getChangeTime();
        java.lang.String str32 = node28.getSourceFileName();
        com.google.javascript.rhino.Node[] nodeArray33 = new com.google.javascript.rhino.Node[] { node5, node12, node20, node28 };
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) ' ', nodeArray33, (int) '#', 4);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean42 = node41.isLabelName();
        com.google.javascript.rhino.Node node43 = node41.getLastChild();
        boolean boolean44 = node41.isOr();
        boolean boolean45 = node41.isThis();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj51 = node49.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj57 = node55.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node58 = node49.clonePropsFrom(node55);
        boolean boolean59 = node58.isNull();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj65 = node63.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(10, node41, node58, node63, (int) 'a', 54);
        com.google.javascript.rhino.Node node69 = node36.useSourceInfoIfMissingFromForTree(node58);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean74 = node73.isLabelName();
        com.google.javascript.rhino.Node node75 = node73.getLastChild();
        boolean boolean76 = node73.isOr();
        boolean boolean77 = node36.isEquivalentToTyped(node73);
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj83 = node81.getProp((int) (short) -1);
        boolean boolean84 = node81.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable85 = node81.siblings();
        boolean boolean86 = node81.isFromExterns();
        com.google.javascript.rhino.Node node87 = node81.cloneTree();
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node((int) (byte) 0, node36, node87);
        boolean boolean89 = node87.isRegExp();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable90 = node87.children();
        int int91 = node87.getLineno();
        boolean boolean92 = node87.isWith();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(nodeArray33);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(nodeIterable85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(nodeIterable90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(8, (int) (short) 10, (int) (short) 0);
        boolean boolean4 = node3.hasOneChild();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.JSType jSType2 = node1.getJSType();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder3 = node1.new FileLevelJsDocBuilder();
        boolean boolean4 = node1.isVar();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(jSType2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = sideEffectFlags0.setMutatesGlobalState();
        int int2 = sideEffectFlags0.valueOf();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags3 = sideEffectFlags0.setMutatesArguments();
        org.junit.Assert.assertNotNull(sideEffectFlags1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sideEffectFlags3);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj7 = node5.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj13 = node11.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node14 = node5.clonePropsFrom(node11);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj20 = node18.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj26 = node24.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node27 = node18.clonePropsFrom(node24);
        com.google.javascript.rhino.Node node28 = node11.clonePropsFrom(node18);
        com.google.javascript.rhino.Node[] nodeArray29 = new com.google.javascript.rhino.Node[] { node11 };
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (short) 10, nodeArray29, 32, 50);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) (short) 10, nodeArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(nodeArray29);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder13 = node3.getJsDocBuilderForNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = node3.getJSDocInfo();
        boolean boolean15 = node3.isHook();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj21 = node19.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj27 = node25.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node28 = node19.clonePropsFrom(node25);
        boolean boolean29 = node19.isNew();
        boolean boolean30 = node19.isNew();
        int int31 = node19.getType();
        boolean boolean32 = node19.mayMutateArguments();
        boolean boolean33 = node19.isBlock();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean39 = node38.isLabelName();
        com.google.javascript.rhino.Node node40 = node38.getLastChild();
        boolean boolean41 = node38.isOr();
        boolean boolean42 = node38.isThis();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj48 = node46.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj54 = node52.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node55 = node46.clonePropsFrom(node52);
        boolean boolean56 = node55.isNull();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj62 = node60.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(10, node38, node55, node60, (int) 'a', 54);
        boolean boolean66 = node65.isLocalResultCall();
        node19.addChildToBack(node65);
        int int68 = node3.getIndexOfChild(node19);
        boolean boolean69 = node19.isCall();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder13);
        org.junit.Assert.assertNull(jSDocInfo14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        boolean boolean5 = node3.isOptionalArg();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        boolean boolean12 = node9.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable13 = node9.siblings();
        boolean boolean14 = node9.isLabelName();
        com.google.javascript.rhino.Node node15 = node3.useSourceInfoFrom(node9);
        com.google.javascript.rhino.Node node17 = node15.getAncestor(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean6 = node5.isLabelName();
        com.google.javascript.rhino.Node node7 = node5.getLastChild();
        boolean boolean8 = node5.isOr();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean13 = node12.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile14 = null;
        node12.setStaticSourceFile(staticSourceFile14);
        boolean boolean16 = node12.isSwitch();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean21 = node20.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile22 = null;
        node20.setStaticSourceFile(staticSourceFile22);
        boolean boolean24 = node20.isSwitch();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj30 = node28.getProp((int) (short) -1);
        int int31 = node28.getChangeTime();
        java.lang.String str32 = node28.getSourceFileName();
        com.google.javascript.rhino.Node[] nodeArray33 = new com.google.javascript.rhino.Node[] { node5, node12, node20, node28 };
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) ' ', nodeArray33, (int) '#', 4);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean42 = node41.isLabelName();
        com.google.javascript.rhino.Node node43 = node41.getLastChild();
        boolean boolean44 = node41.isOr();
        boolean boolean45 = node41.isThis();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj51 = node49.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj57 = node55.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node58 = node49.clonePropsFrom(node55);
        boolean boolean59 = node58.isNull();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj65 = node63.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(10, node41, node58, node63, (int) 'a', 54);
        com.google.javascript.rhino.Node node69 = node36.useSourceInfoIfMissingFromForTree(node58);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean74 = node73.isLabelName();
        com.google.javascript.rhino.Node node75 = node73.getLastChild();
        boolean boolean76 = node73.isOr();
        boolean boolean77 = node36.isEquivalentToTyped(node73);
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj83 = node81.getProp((int) (short) -1);
        boolean boolean84 = node81.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable85 = node81.siblings();
        boolean boolean86 = node81.isFromExterns();
        com.google.javascript.rhino.Node node87 = node81.cloneTree();
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node((int) (byte) 0, node36, node87);
        boolean boolean89 = node36.isDelProp();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder90 = node36.new FileLevelJsDocBuilder();
        boolean boolean91 = node36.isIn();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(nodeArray33);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(nodeIterable85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean5 = node4.isLabelName();
        com.google.javascript.rhino.Node node6 = node4.getLastChild();
        boolean boolean7 = node4.isOr();
        boolean boolean8 = node4.isThis();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj14 = node12.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj20 = node18.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node21 = node12.clonePropsFrom(node18);
        boolean boolean22 = node21.isNull();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj28 = node26.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(10, node4, node21, node26, (int) 'a', 54);
        boolean boolean32 = node31.isLocalResultCall();
        node31.setLineno(31);
        boolean boolean35 = node31.isWhile();
        boolean boolean36 = node31.isFunction();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder13 = node3.getJsDocBuilderForNode();
        boolean boolean14 = node3.isHook();
        boolean boolean15 = node3.isArrayLit();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean22 = node21.isLabelName();
        com.google.javascript.rhino.Node node23 = node21.getLastChild();
        boolean boolean24 = node21.isOr();
        boolean boolean25 = node21.isThis();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj31 = node29.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj37 = node35.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node38 = node29.clonePropsFrom(node35);
        boolean boolean39 = node38.isNull();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj45 = node43.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node21, node38, node43, (int) 'a', 54);
        node3.putProp((int) (byte) -1, (java.lang.Object) node21);
        boolean boolean50 = node3.isInc();
        boolean boolean51 = node3.isOr();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        int int5 = node3.getCharno();
        boolean boolean6 = node3.isBlock();
        com.google.javascript.rhino.Node node7 = node3.removeChildren();
        boolean boolean8 = node3.isTry();
        boolean boolean9 = node3.isCast();
        boolean boolean10 = node3.isCase();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable11 = node3.getAncestors();
        com.google.javascript.rhino.Node node12 = node3.getParent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = node12.hasOneChild();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(ancestorIterable11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean6 = node5.isLabelName();
        com.google.javascript.rhino.Node node7 = node5.getLastChild();
        boolean boolean8 = node5.isOr();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean13 = node12.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile14 = null;
        node12.setStaticSourceFile(staticSourceFile14);
        boolean boolean16 = node12.isSwitch();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean21 = node20.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile22 = null;
        node20.setStaticSourceFile(staticSourceFile22);
        boolean boolean24 = node20.isSwitch();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj30 = node28.getProp((int) (short) -1);
        int int31 = node28.getChangeTime();
        java.lang.String str32 = node28.getSourceFileName();
        com.google.javascript.rhino.Node[] nodeArray33 = new com.google.javascript.rhino.Node[] { node5, node12, node20, node28 };
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) ' ', nodeArray33, (int) '#', 4);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean42 = node41.isLabelName();
        com.google.javascript.rhino.Node node43 = node41.getLastChild();
        boolean boolean44 = node41.isOr();
        boolean boolean45 = node41.isThis();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj51 = node49.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj57 = node55.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node58 = node49.clonePropsFrom(node55);
        boolean boolean59 = node58.isNull();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj65 = node63.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(10, node41, node58, node63, (int) 'a', 54);
        com.google.javascript.rhino.Node node69 = node36.useSourceInfoIfMissingFromForTree(node58);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean74 = node73.isLabelName();
        com.google.javascript.rhino.Node node75 = node73.getLastChild();
        boolean boolean76 = node73.isOr();
        boolean boolean77 = node36.isEquivalentToTyped(node73);
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj83 = node81.getProp((int) (short) -1);
        boolean boolean84 = node81.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable85 = node81.siblings();
        boolean boolean86 = node81.isFromExterns();
        com.google.javascript.rhino.Node node87 = node81.cloneTree();
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node((int) (byte) 0, node36, node87);
        java.lang.String str89 = node87.toStringTree();
        java.lang.String str90 = node87.toStringTree();
        com.google.javascript.rhino.Node node91 = node87.cloneNode();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile92 = node87.getStaticSourceFile();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(nodeArray33);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(nodeIterable85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "BITXOR\n" + "'", str89, "BITXOR\n");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "BITXOR\n" + "'", str90, "BITXOR\n");
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertNull(staticSourceFile92);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isDec();
        node3.detachChildren();
        boolean boolean8 = node3.isFromExterns();
        int int9 = node3.getSideEffectFlags();
        boolean boolean10 = node3.isOr();
        boolean boolean11 = node3.isIn();
        boolean boolean12 = node3.isThrow();
        boolean boolean13 = node3.isReturn();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = sideEffectFlags0.setMutatesArguments();
        int int2 = sideEffectFlags0.valueOf();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags3 = sideEffectFlags0.setMutatesGlobalState();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags4 = sideEffectFlags3.setThrows();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags5 = sideEffectFlags4.setMutatesGlobalState();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags6 = sideEffectFlags4.setMutatesGlobalState();
        org.junit.Assert.assertNotNull(sideEffectFlags1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sideEffectFlags3);
        org.junit.Assert.assertNotNull(sideEffectFlags4);
        org.junit.Assert.assertNotNull(sideEffectFlags5);
        org.junit.Assert.assertNotNull(sideEffectFlags6);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node3.isNew();
        boolean boolean14 = node3.isNew();
        int int15 = node3.getType();
        boolean boolean16 = node3.mayMutateArguments();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder17 = node3.getJsDocBuilderForNode();
        com.google.javascript.rhino.InputId inputId18 = null;
        node3.setInputId(inputId18);
        com.google.javascript.rhino.Node node20 = node3.cloneTree();
        boolean boolean21 = node20.isObjectLit();
        node20.setSourceEncodedPosition((int) (byte) 100);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = null;
        node3.setStaticSourceFile(staticSourceFile5);
        boolean boolean7 = node3.isSwitch();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean13 = node12.isLabelName();
        com.google.javascript.rhino.Node node14 = node12.getLastChild();
        boolean boolean15 = node12.isOr();
        boolean boolean16 = node12.isThis();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj22 = node20.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj28 = node26.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node29 = node20.clonePropsFrom(node26);
        boolean boolean30 = node29.isNull();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj36 = node34.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(10, node12, node29, node34, (int) 'a', 54);
        com.google.javascript.rhino.Node node40 = node3.useSourceInfoFromForTree(node39);
        boolean boolean41 = node39.wasEmptyNode();
        com.google.javascript.rhino.Node node42 = node39.cloneNode();
        boolean boolean43 = node42.isObjectLit();
        boolean boolean44 = node42.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node45 = node42.getFirstChild();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(node45);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isOr();
        boolean boolean7 = node3.isThis();
        boolean boolean8 = node3.isDebugger();
        boolean boolean9 = node3.isGetProp();
        boolean boolean10 = node3.isDefaultCase();
        boolean boolean11 = node3.isNE();
        boolean boolean12 = node3.isOr();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 2, (int) (byte) 1, 52);
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 10, 54, 31);
        com.google.javascript.rhino.Node node4 = node3.getLastChild();
        boolean boolean5 = node3.isName();
        boolean boolean6 = node3.isGetterDef();
        boolean boolean7 = node3.wasEmptyNode();
        boolean boolean8 = node3.isLabelName();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(97, "hi!");
        boolean boolean12 = node11.isWith();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = null;
        node11.setStaticSourceFile(staticSourceFile13);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("BITXOR [change_time: 31]");
        // The following exception was thrown during execution in test generation
        try {
            node3.replaceChildAfter(node11, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("BITXOR [change_time: 31]\n");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("GETELEM 4\n    STRING hi! 39\n    BITXOR\n", 8, 36);
        node5.removeProp(31);
        boolean boolean8 = node5.isDebugger();
        boolean boolean9 = node5.isNull();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj15 = node13.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj21 = node19.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node22 = node13.clonePropsFrom(node19);
        boolean boolean23 = node13.isNew();
        boolean boolean24 = node13.isNew();
        int int25 = node13.getType();
        boolean boolean26 = node13.mayMutateArguments();
        node13.setLength(2);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj34 = node32.getProp((int) (short) -1);
        boolean boolean35 = node32.isWith();
        boolean boolean36 = node32.isHook();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder37 = node32.getJsDocBuilderForNode();
        boolean boolean38 = node13.isEquivalentToTyped(node32);
        boolean boolean39 = node5.isEquivalentToShallow(node32);
        boolean boolean40 = node1.isEquivalentTo(node32);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder13 = node3.getJsDocBuilderForNode();
        boolean boolean14 = node3.isLabelName();
        boolean boolean15 = node3.isGetElem();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable16 = node3.getAncestors();
        boolean boolean17 = node3.isFalse();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean23 = node22.isLabelName();
        com.google.javascript.rhino.Node node24 = node22.getLastChild();
        boolean boolean25 = node22.isOr();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean30 = node29.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile31 = null;
        node29.setStaticSourceFile(staticSourceFile31);
        boolean boolean33 = node29.isSwitch();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean38 = node37.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile39 = null;
        node37.setStaticSourceFile(staticSourceFile39);
        boolean boolean41 = node37.isSwitch();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj47 = node45.getProp((int) (short) -1);
        int int48 = node45.getChangeTime();
        java.lang.String str49 = node45.getSourceFileName();
        com.google.javascript.rhino.Node[] nodeArray50 = new com.google.javascript.rhino.Node[] { node22, node29, node37, node45 };
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) ' ', nodeArray50, (int) '#', 4);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean59 = node58.isLabelName();
        com.google.javascript.rhino.Node node60 = node58.getLastChild();
        boolean boolean61 = node58.isOr();
        boolean boolean62 = node58.isThis();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj68 = node66.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj74 = node72.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node75 = node66.clonePropsFrom(node72);
        boolean boolean76 = node75.isNull();
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj82 = node80.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node(10, node58, node75, node80, (int) 'a', 54);
        com.google.javascript.rhino.Node node86 = node53.useSourceInfoIfMissingFromForTree(node75);
        com.google.javascript.rhino.Node node87 = node75.detachFromParent();
        com.google.javascript.rhino.Node node88 = node3.useSourceInfoIfMissingFrom(node87);
        node87.detachChildren();
        boolean boolean90 = node87.mayMutateArguments();
        node87.setType((int) (short) 10);
        com.google.javascript.rhino.Node node93 = node87.getFirstChild();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(ancestorIterable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(nodeArray50);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNull(node93);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node12.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj19 = node17.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean24 = node23.isLabelName();
        com.google.javascript.rhino.Node node25 = node23.getLastChild();
        boolean boolean26 = node17.hasChild(node23);
        boolean boolean27 = node17.hasChildren();
        int int28 = node17.getChildCount();
        java.lang.String str29 = node17.toStringTree();
        boolean boolean30 = node17.isCase();
        int int31 = node17.getSourcePosition();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node32 = node12.removeChildAfter(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "BITXOR\n" + "'", str29, "BITXOR\n");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = sideEffectFlags0.setMutatesArguments();
        int int2 = sideEffectFlags0.valueOf();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags3 = sideEffectFlags0.setAllFlags();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags4 = sideEffectFlags3.setReturnsTainted();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags5 = sideEffectFlags3.setAllFlags();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags6 = sideEffectFlags5.setThrows();
        org.junit.Assert.assertNotNull(sideEffectFlags1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sideEffectFlags3);
        org.junit.Assert.assertNotNull(sideEffectFlags4);
        org.junit.Assert.assertNotNull(sideEffectFlags5);
        org.junit.Assert.assertNotNull(sideEffectFlags6);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        boolean boolean6 = node3.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node3.siblings();
        boolean boolean8 = node3.isFromExterns();
        com.google.javascript.rhino.Node node9 = node3.cloneTree();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean14 = node13.isLabelName();
        com.google.javascript.rhino.Node node15 = node13.getLastChild();
        boolean boolean16 = node13.isOr();
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        node13.setJSType(jSType17);
        boolean boolean19 = node9.hasChild(node13);
        boolean boolean21 = node13.getBooleanProp(43);
        boolean boolean22 = node13.isWhile();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(36);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(12, "BITXOR [change_time: 31]");
        node2.setCharno(49);
        java.lang.String str8 = node2.toString(true, false, false);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EQ BITXOR [change_time: 31]" + "'", str8, "EQ BITXOR [change_time: 31]");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 10, 54, 31);
        boolean boolean4 = node3.isArrayLit();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean9 = node8.isLabelName();
        com.google.javascript.rhino.Node node10 = node8.getLastChild();
        boolean boolean11 = node8.isOr();
        boolean boolean12 = node8.isThis();
        boolean boolean13 = node8.isDebugger();
        boolean boolean14 = node8.isGetProp();
        java.lang.String[] strArray23 = new java.lang.String[] { "BITXOR [change_time: 31]", "goog.scope", "BITXOR [change_time: 31]", "", "hi!", "Node tree inequality:\nTree1:\nBITXOR\n\n\nTree2:\nSTRING \n\n\nSubtree1: BITXOR\n\n\nSubtree2: STRING \n", "BITXOR [change_time: 31]", "goog.scope" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        node8.setDirectives((java.util.Set<java.lang.String>) strSet24);
        boolean boolean27 = node8.isNE();
        com.google.javascript.rhino.Node node28 = node3.clonePropsFrom(node8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "BITXOR [change_time: 31]", "goog.scope", "BITXOR [change_time: 31]", "", "hi!", "Node tree inequality:\nTree1:\nBITXOR\n\n\nTree2:\nSTRING \n\n\nSubtree1: BITXOR\n\n\nSubtree2: STRING \n", "BITXOR [change_time: 31]", "goog.scope" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 10, 54, 31);
        com.google.javascript.rhino.Node node4 = node3.getLastChild();
        boolean boolean5 = node3.isName();
        com.google.javascript.rhino.Node node6 = node3.getNext();
        boolean boolean7 = node3.isGetElem();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj18 = node16.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj24 = node22.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node25 = node16.clonePropsFrom(node22);
        com.google.javascript.rhino.Node node26 = node9.clonePropsFrom(node16);
        boolean boolean27 = node26.isThrow();
        boolean boolean28 = node26.isComma();
        com.google.javascript.rhino.Node node29 = node26.cloneTree();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node3.isNew();
        boolean boolean14 = node3.isNew();
        boolean boolean15 = node3.isThis();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = null;
        com.google.javascript.rhino.Node node17 = node3.setJSDocInfo(jSDocInfo16);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean22 = node21.isLabelName();
        com.google.javascript.rhino.Node node23 = node21.getLastChild();
        boolean boolean24 = node21.isOr();
        boolean boolean25 = node21.hasOneChild();
        node21.setChangeTime(31);
        java.lang.String str28 = node21.getQualifiedName();
        java.lang.String str29 = node21.getQualifiedName();
        com.google.javascript.rhino.Node node30 = node17.copyInformationFrom(node21);
        boolean boolean31 = node21.isEmpty();
        int int32 = node21.getType();
        boolean boolean33 = node21.isGetterDef();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj6 = node4.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean11 = node10.isLabelName();
        com.google.javascript.rhino.Node node12 = node10.getLastChild();
        boolean boolean13 = node4.hasChild(node10);
        boolean boolean14 = node4.hasChildren();
        int int15 = node4.getChildCount();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(54, node4, 10, (int) '4');
        boolean boolean19 = node4.isAssign();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj25 = node23.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj31 = node29.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node32 = node23.clonePropsFrom(node29);
        boolean boolean33 = node23.isNew();
        boolean boolean34 = node23.isNew();
        boolean boolean35 = node23.isThis();
        com.google.javascript.rhino.JSDocInfo jSDocInfo36 = null;
        com.google.javascript.rhino.Node node37 = node23.setJSDocInfo(jSDocInfo36);
        com.google.javascript.rhino.Node node38 = node4.copyInformationFromForTree(node37);
        boolean boolean39 = node37.isContinue();
        com.google.javascript.rhino.InputId inputId40 = node37.getInputId();
        int int41 = node37.getSideEffectFlags();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(inputId40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        int int6 = node3.getSideEffectFlags();
        boolean boolean7 = node3.isVoid();
        boolean boolean8 = node3.isNull();
        node3.setIsSyntheticBlock(true);
        java.lang.String str14 = node3.toString(true, false, false);
        int int15 = node3.getType();
        node3.setOptionalArg(true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "BITXOR" + "'", str14, "BITXOR");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node3.isNew();
        boolean boolean14 = node3.isNew();
        int int15 = node3.getType();
        boolean boolean16 = node3.isThis();
        boolean boolean17 = node3.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.JSType jSType20 = node19.getJSType();
        com.google.javascript.rhino.Node node21 = node19.getNext();
        java.lang.String str22 = node3.checkTreeEquals(node19);
        boolean boolean23 = node3.isOnlyModifiesThisCall();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Node tree inequality:\nTree1:\nBITXOR\n\n\nTree2:\nSTRING \n\n\nSubtree1: BITXOR\n\n\nSubtree2: STRING \n" + "'", str22, "Node tree inequality:\nTree1:\nBITXOR\n\n\nTree2:\nSTRING \n\n\nSubtree1: BITXOR\n\n\nSubtree2: STRING \n");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        int int6 = node3.getSideEffectFlags();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj12 = node10.getProp((int) (short) -1);
        int int13 = node10.getSideEffectFlags();
        boolean boolean14 = node10.isVoid();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj20 = node18.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj26 = node24.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node27 = node18.clonePropsFrom(node24);
        boolean boolean28 = node18.isNew();
        boolean boolean29 = node18.isNew();
        int int30 = node18.getType();
        boolean boolean31 = node18.mayMutateArguments();
        boolean boolean32 = node18.isBlock();
        boolean boolean33 = node10.isEquivalentToTyped(node18);
        node10.removeProp(2);
        boolean boolean36 = node3.isEquivalentTo(node10);
        node10.setSourceEncodedPositionForTree(29);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString((int) '#', "", (int) (short) 0, 57);
        com.google.javascript.rhino.Node node44 = node10.useSourceInfoFromForTree(node43);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags45 = new com.google.javascript.rhino.Node.SideEffectFlags();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags46 = sideEffectFlags45.setReturnsTainted();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags47 = sideEffectFlags45.clearAllFlags();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags48 = sideEffectFlags47.setMutatesArguments();
        // The following exception was thrown during execution in test generation
        try {
            node10.setSideEffectFlags(sideEffectFlags48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got BITXOR");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(sideEffectFlags46);
        org.junit.Assert.assertNotNull(sideEffectFlags47);
        org.junit.Assert.assertNotNull(sideEffectFlags48);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder13 = node3.getJsDocBuilderForNode();
        boolean boolean14 = node3.isLabelName();
        boolean boolean15 = node3.isGetElem();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable16 = node3.getAncestors();
        boolean boolean17 = node3.isFalse();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean23 = node22.isLabelName();
        com.google.javascript.rhino.Node node24 = node22.getLastChild();
        boolean boolean25 = node22.isOr();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean30 = node29.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile31 = null;
        node29.setStaticSourceFile(staticSourceFile31);
        boolean boolean33 = node29.isSwitch();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean38 = node37.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile39 = null;
        node37.setStaticSourceFile(staticSourceFile39);
        boolean boolean41 = node37.isSwitch();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj47 = node45.getProp((int) (short) -1);
        int int48 = node45.getChangeTime();
        java.lang.String str49 = node45.getSourceFileName();
        com.google.javascript.rhino.Node[] nodeArray50 = new com.google.javascript.rhino.Node[] { node22, node29, node37, node45 };
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) ' ', nodeArray50, (int) '#', 4);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean59 = node58.isLabelName();
        com.google.javascript.rhino.Node node60 = node58.getLastChild();
        boolean boolean61 = node58.isOr();
        boolean boolean62 = node58.isThis();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj68 = node66.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj74 = node72.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node75 = node66.clonePropsFrom(node72);
        boolean boolean76 = node75.isNull();
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj82 = node80.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node(10, node58, node75, node80, (int) 'a', 54);
        com.google.javascript.rhino.Node node86 = node53.useSourceInfoIfMissingFromForTree(node75);
        com.google.javascript.rhino.Node node87 = node75.detachFromParent();
        com.google.javascript.rhino.Node node88 = node3.useSourceInfoIfMissingFrom(node87);
        node87.detachChildren();
        boolean boolean90 = node87.isVar();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(ancestorIterable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(nodeArray50);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node3.isNew();
        boolean boolean14 = node3.isNew();
        int int15 = node3.getType();
        boolean boolean16 = node3.mayMutateArguments();
        node3.setLength(2);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj24 = node22.getProp((int) (short) -1);
        boolean boolean25 = node22.isWith();
        boolean boolean26 = node22.isHook();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder27 = node22.getJsDocBuilderForNode();
        boolean boolean28 = node3.isEquivalentToTyped(node22);
        node3.setOptionalArg(false);
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = null;
        com.google.javascript.rhino.Node node32 = node3.setJSDocInfo(jSDocInfo31);
        boolean boolean33 = node32.isSetterDef();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean10 = node9.isLabelName();
        com.google.javascript.rhino.Node node11 = node9.getLastChild();
        boolean boolean12 = node3.hasChild(node9);
        boolean boolean13 = node3.hasChildren();
        java.lang.String str14 = node3.toStringTree();
        boolean boolean15 = node3.isLabel();
        com.google.javascript.rhino.Node node16 = node3.getLastChild();
        boolean boolean17 = node3.isDebugger();
        boolean boolean18 = node3.isGetElem();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj24 = node22.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj30 = node28.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node31 = node22.clonePropsFrom(node28);
        boolean boolean32 = node22.isNew();
        boolean boolean33 = node22.isNew();
        boolean boolean34 = node22.isThis();
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = null;
        com.google.javascript.rhino.Node node36 = node22.setJSDocInfo(jSDocInfo35);
        boolean boolean37 = node22.isStringKey();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj43 = node41.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj49 = node47.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node50 = node41.clonePropsFrom(node47);
        boolean boolean51 = node41.isNew();
        boolean boolean52 = node41.isNew();
        int int53 = node41.getType();
        boolean boolean54 = node41.mayMutateArguments();
        node41.setLength(2);
        boolean boolean57 = node22.hasChild(node41);
        com.google.javascript.rhino.Node node58 = node3.copyInformationFrom(node41);
        node3.setType(29);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "BITXOR\n" + "'", str14, "BITXOR\n");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node58);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder13 = node3.getJsDocBuilderForNode();
        boolean boolean14 = node3.isHook();
        int int15 = node3.getSideEffectFlags();
        boolean boolean16 = node3.isFromExterns();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean21 = node20.isLabelName();
        com.google.javascript.rhino.Node node22 = node20.getLastChild();
        boolean boolean23 = node20.isOr();
        boolean boolean24 = node20.isThis();
        boolean boolean25 = node20.isDebugger();
        boolean boolean26 = node20.isGetProp();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj33 = node31.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj39 = node37.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node40 = node31.clonePropsFrom(node37);
        boolean boolean41 = node37.isEmpty();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable42 = node37.siblings();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj48 = node46.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean53 = node52.isLabelName();
        com.google.javascript.rhino.Node node54 = node52.getLastChild();
        boolean boolean55 = node46.hasChild(node52);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean60 = node59.isLabelName();
        int int61 = node59.getCharno();
        boolean boolean62 = node59.isOr();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj68 = node66.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj74 = node72.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node75 = node66.clonePropsFrom(node72);
        boolean boolean76 = node66.isNew();
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node(8, node37, node52, node59, node66, 1, 100);
        boolean boolean80 = node79.isUnscopedQualifiedName();
        node79.detachChildren();
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newNumber((double) 1);
        com.google.javascript.rhino.Node node84 = node79.useSourceInfoFrom(node83);
        com.google.javascript.rhino.Node node85 = node20.copyInformationFrom(node79);
        com.google.javascript.rhino.Node node86 = node3.srcrefTree(node20);
        java.lang.Object obj88 = node3.getProp(38);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(nodeIterable42);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertNull(obj88);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(52, 29, 100);
        boolean boolean4 = node3.hasChildren();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj10 = node8.getProp((int) (short) -1);
        int int11 = node8.getSideEffectFlags();
        boolean boolean12 = node8.isLocalResultCall();
        boolean boolean13 = node8.isIn();
        node8.setSourceFileForTesting("");
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj21 = node19.getProp((int) (short) -1);
        int int22 = node19.getSideEffectFlags();
        boolean boolean23 = node19.isLocalResultCall();
        boolean boolean24 = node19.isIn();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean29 = node28.isLabelName();
        com.google.javascript.rhino.Node node30 = node28.getLastChild();
        boolean boolean31 = node28.isOr();
        boolean boolean32 = node28.hasOneChild();
        node28.setChangeTime(31);
        boolean boolean35 = node28.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj41 = node39.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean46 = node45.isLabelName();
        com.google.javascript.rhino.Node node47 = node45.getLastChild();
        boolean boolean48 = node39.hasChild(node45);
        boolean boolean49 = node39.hasChildren();
        com.google.javascript.rhino.Node node50 = node28.useSourceInfoFromForTree(node39);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile51 = null;
        node39.setStaticSourceFile(staticSourceFile51);
        com.google.javascript.rhino.Node node53 = node19.clonePropsFrom(node39);
        boolean boolean54 = node53.isObjectLit();
        node8.addChildToBack(node53);
        boolean boolean56 = node3.isEquivalentTo(node53);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean10 = node9.isLabelName();
        com.google.javascript.rhino.Node node11 = node9.getLastChild();
        boolean boolean12 = node3.hasChild(node9);
        boolean boolean13 = node3.hasChildren();
        int int14 = node3.getChildCount();
        boolean boolean15 = node3.isFromExterns();
        boolean boolean16 = node3.isNot();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean21 = node20.isLabelName();
        com.google.javascript.rhino.Node node22 = node20.getLastChild();
        boolean boolean23 = node20.isOr();
        boolean boolean24 = node20.isThis();
        boolean boolean25 = node20.isDebugger();
        node20.setOptionalArg(true);
        java.lang.Object obj29 = node20.getProp(29);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj36 = node34.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj42 = node40.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node43 = node34.clonePropsFrom(node40);
        boolean boolean44 = node40.isEmpty();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable45 = node40.siblings();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj51 = node49.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean56 = node55.isLabelName();
        com.google.javascript.rhino.Node node57 = node55.getLastChild();
        boolean boolean58 = node49.hasChild(node55);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean63 = node62.isLabelName();
        int int64 = node62.getCharno();
        boolean boolean65 = node62.isOr();
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj71 = node69.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj77 = node75.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node78 = node69.clonePropsFrom(node75);
        boolean boolean79 = node69.isNew();
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node(8, node40, node55, node62, node69, 1, 100);
        boolean boolean83 = node82.isWith();
        boolean boolean84 = node20.hasChild(node82);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        boolean boolean86 = node82.isComma();
        com.google.javascript.rhino.Node node87 = node82.getFirstChild();
        node82.setVarArgs(false);
        boolean boolean90 = node3.isEquivalentTo(node82);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(nodeIterable45);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj6 = node4.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj12 = node10.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node13 = node4.clonePropsFrom(node10);
        boolean boolean14 = node4.isNew();
        com.google.javascript.rhino.Node node15 = node4.removeChildren();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj21 = node19.getProp((int) (short) -1);
        boolean boolean22 = node19.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node19.siblings();
        boolean boolean24 = node19.isFromExterns();
        int int25 = node19.getLineno();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj31 = node29.getProp((int) (short) -1);
        boolean boolean32 = node29.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable33 = node29.siblings();
        boolean boolean34 = node29.isFromExterns();
        boolean boolean35 = node29.isNew();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(43, node4, node19, node29);
        boolean boolean37 = node36.isNew();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj43 = node41.getProp((int) (short) -1);
        boolean boolean44 = node41.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable45 = node41.siblings();
        boolean boolean46 = node41.isFromExterns();
        com.google.javascript.rhino.Node node47 = node41.cloneTree();
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean52 = node51.isLabelName();
        com.google.javascript.rhino.Node node53 = node51.getLastChild();
        boolean boolean54 = node51.isOr();
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        node51.setJSType(jSType55);
        boolean boolean57 = node47.hasChild(node51);
        boolean boolean58 = node47.isAnd();
        node47.setType(4095);
        com.google.javascript.rhino.Node node61 = node47.removeFirstChild();
        com.google.javascript.rhino.Node node62 = node36.srcref(node47);
        boolean boolean63 = node62.isTry();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(nodeIterable33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(nodeIterable45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("BITXOR [change_time: 31]");
        com.google.javascript.rhino.Node node2 = node1.getParent();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj8 = node6.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj14 = node12.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node15 = node6.clonePropsFrom(node12);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj21 = node19.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj27 = node25.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node28 = node19.clonePropsFrom(node25);
        com.google.javascript.rhino.Node node29 = node12.clonePropsFrom(node19);
        boolean boolean30 = node29.isThrow();
        boolean boolean31 = node29.isComma();
        boolean boolean32 = node29.isInc();
        node1.addChildrenToFront(node29);
        boolean boolean34 = node29.isCase();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable35 = node29.getAncestors();
        java.util.Iterator<com.google.javascript.rhino.Node> nodeItor36 = ancestorIterable35.iterator();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator37 = ancestorIterable35.spliterator();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator38 = ancestorIterable35.spliterator();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(ancestorIterable35);
        org.junit.Assert.assertNotNull(nodeItor36);
        org.junit.Assert.assertNotNull(nodeSpliterator37);
        org.junit.Assert.assertNotNull(nodeSpliterator38);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node3.isNew();
        boolean boolean14 = node3.isNew();
        boolean boolean15 = node3.isThis();
        node3.setSourceEncodedPosition(8);
        boolean boolean18 = node3.isUnscopedQualifiedName();
        boolean boolean19 = node3.isRegExp();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean5 = node4.isLabelName();
        com.google.javascript.rhino.Node node6 = node4.getLastChild();
        boolean boolean7 = node4.isOr();
        boolean boolean8 = node4.isThis();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj14 = node12.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj20 = node18.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node21 = node12.clonePropsFrom(node18);
        boolean boolean22 = node21.isNull();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj28 = node26.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(10, node4, node21, node26, (int) 'a', 54);
        boolean boolean32 = node21.isExprResult();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj38 = node36.getProp((int) (short) -1);
        int int39 = node36.getSideEffectFlags();
        boolean boolean40 = node36.isLocalResultCall();
        boolean boolean41 = node21.hasChild(node36);
        boolean boolean42 = node21.isAssign();
        boolean boolean43 = node21.isSetterDef();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable44 = node21.children();
        int int45 = node21.getChangeTime();
        boolean boolean46 = node21.isFunction();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(nodeIterable44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj6 = node4.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj12 = node10.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node13 = node4.clonePropsFrom(node10);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder14 = node4.getJsDocBuilderForNode();
        boolean boolean15 = node4.isLabelName();
        boolean boolean16 = node4.isGetElem();
        boolean boolean17 = node4.isNew();
        boolean boolean18 = node4.isGetElem();
        boolean boolean19 = node4.isBreak();
        node4.removeProp(0);
        boolean boolean22 = node4.isLabelName();
        boolean boolean23 = node4.isFunction();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj29 = node27.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj35 = node33.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node36 = node27.clonePropsFrom(node33);
        boolean boolean37 = node27.isNew();
        com.google.javascript.rhino.Node node38 = node27.removeChildren();
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = null;
        com.google.javascript.rhino.Node node40 = node27.setJSDocInfo(jSDocInfo39);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean45 = node44.isLabelName();
        com.google.javascript.rhino.Node node46 = node44.getLastChild();
        boolean boolean47 = node44.isOr();
        boolean boolean48 = node44.isThis();
        boolean boolean49 = node44.isDebugger();
        node44.setOptionalArg(true);
        java.lang.Object obj53 = node44.getProp(29);
        boolean boolean54 = node44.isScript();
        boolean boolean55 = node44.isDec();
        boolean boolean56 = node44.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString(2, "NUMBER 47.0 4", 55, 4196);
        boolean boolean62 = node61.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((int) (byte) 10, node4, node40, node44, node61, 53, 49);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isOr();
        boolean boolean7 = node3.isThis();
        java.lang.Object obj9 = node3.getProp(0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node3.siblings();
        com.google.javascript.rhino.Node node11 = node3.removeFirstChild();
        boolean boolean12 = node3.isFor();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        int int5 = node3.getCharno();
        boolean boolean6 = node3.isBlock();
        com.google.javascript.rhino.Node node7 = node3.removeChildren();
        boolean boolean8 = node3.isTry();
        boolean boolean9 = node3.isCast();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj15 = node13.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj21 = node19.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node22 = node13.clonePropsFrom(node19);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj28 = node26.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj34 = node32.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node35 = node26.clonePropsFrom(node32);
        com.google.javascript.rhino.Node node36 = node19.clonePropsFrom(node26);
        boolean boolean37 = node19.isAdd();
        boolean boolean38 = node19.isLabel();
        int int39 = node19.getSourcePosition();
        com.google.javascript.rhino.Node node40 = node3.copyInformationFrom(node19);
        node19.setSourceEncodedPositionForTree((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(node40);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj6 = node4.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj12 = node10.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node13 = node4.clonePropsFrom(node10);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj19 = node17.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj25 = node23.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node26 = node17.clonePropsFrom(node23);
        com.google.javascript.rhino.Node node27 = node10.clonePropsFrom(node17);
        int int28 = node10.getSourceOffset();
        boolean boolean30 = node10.getBooleanProp(15);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(51, node10, 55, 4196);
        boolean boolean34 = node10.isScript();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isOr();
        boolean boolean7 = node3.isThis();
        boolean boolean8 = node3.isDebugger();
        node3.setOptionalArg(true);
        boolean boolean11 = node3.isOptionalArg();
        boolean boolean12 = node3.hasChildren();
        boolean boolean13 = node3.isBlock();
        int int14 = node3.getSourcePosition();
        boolean boolean15 = node3.isGetProp();
        node3.putBooleanProp(15, true);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj24 = node22.getProp((int) (short) -1);
        int int25 = node22.getSideEffectFlags();
        boolean boolean26 = node22.isLocalResultCall();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable27 = node22.getAncestors();
        node22.setWasEmptyNode(false);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        node22.setJSType(jSType30);
        node22.removeProp((int) '4');
        com.google.javascript.rhino.Node node34 = node3.copyInformationFrom(node22);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(ancestorIterable27);
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        int int6 = node3.getSideEffectFlags();
        boolean boolean7 = node3.hasMoreThanOneChild();
        boolean boolean8 = node3.isOptionalArg();
        boolean boolean9 = node3.isNumber();
        java.util.Set<java.lang.String> strSet10 = node3.getDirectives();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strSet10);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 10, 54, 31);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean8 = node7.isLabelName();
        com.google.javascript.rhino.Node node9 = node7.getLastChild();
        boolean boolean10 = node7.isOr();
        boolean boolean11 = node7.isThis();
        boolean boolean12 = node7.isDebugger();
        boolean boolean13 = node7.isGetProp();
        boolean boolean14 = node7.isDefaultCase();
        boolean boolean15 = node7.isNE();
        java.lang.String str16 = node3.checkTreeEquals(node7);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean22 = node21.isLabelName();
        com.google.javascript.rhino.Node node23 = node21.getLastChild();
        boolean boolean24 = node21.isOr();
        boolean boolean25 = node21.isThis();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj31 = node29.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj37 = node35.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node38 = node29.clonePropsFrom(node35);
        boolean boolean39 = node38.isNull();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj45 = node43.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node21, node38, node43, (int) 'a', 54);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean53 = node52.isLabelName();
        com.google.javascript.rhino.Node node54 = node52.getLastChild();
        boolean boolean55 = node52.isOr();
        boolean boolean56 = node52.hasOneChild();
        node52.setChangeTime(31);
        boolean boolean59 = node52.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj65 = node63.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean70 = node69.isLabelName();
        com.google.javascript.rhino.Node node71 = node69.getLastChild();
        boolean boolean72 = node63.hasChild(node69);
        boolean boolean73 = node63.hasChildren();
        com.google.javascript.rhino.Node node74 = node52.useSourceInfoFromForTree(node63);
        node63.setChangeTime(16);
        com.google.javascript.rhino.Node node77 = node21.srcrefTree(node63);
        com.google.javascript.rhino.Node node78 = node3.clonePropsFrom(node77);
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj84 = node82.getProp((int) (short) -1);
        int int85 = node82.getSideEffectFlags();
        boolean boolean86 = node82.isLocalResultCall();
        boolean boolean87 = node82.isIn();
        node82.setSourceFileForTesting("");
        boolean boolean90 = node82.isInc();
        com.google.javascript.rhino.Node node91 = node77.srcref(node82);
        boolean boolean92 = node77.isExprResult();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean10 = node9.isLabelName();
        com.google.javascript.rhino.Node node11 = node9.getLastChild();
        boolean boolean12 = node3.hasChild(node9);
        boolean boolean13 = node3.hasChildren();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj19 = node17.getProp((int) (short) -1);
        boolean boolean20 = node17.isWith();
        com.google.javascript.rhino.Node node21 = node17.removeFirstChild();
        com.google.javascript.rhino.Node node22 = node3.srcref(node17);
        boolean boolean23 = node22.isGetProp();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 15);
        boolean boolean4 = node3.isCast();
        boolean boolean5 = node3.isThis();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(29);
        com.google.javascript.rhino.Node node9 = node8.getFirstChild();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj16 = node14.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj22 = node20.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node23 = node14.clonePropsFrom(node20);
        boolean boolean24 = node14.isNew();
        com.google.javascript.rhino.Node node25 = node14.removeChildren();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj31 = node29.getProp((int) (short) -1);
        boolean boolean32 = node29.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable33 = node29.siblings();
        boolean boolean34 = node29.isFromExterns();
        int int35 = node29.getLineno();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj41 = node39.getProp((int) (short) -1);
        boolean boolean42 = node39.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable43 = node39.siblings();
        boolean boolean44 = node39.isFromExterns();
        boolean boolean45 = node39.isNew();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(43, node14, node29, node39);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(15, node8, node46, (int) 'a', 49);
        boolean boolean50 = node3.isEquivalentToTyped(node8);
        boolean boolean51 = node8.isDefaultCase();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(nodeIterable33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(nodeIterable43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        int int6 = node3.getSideEffectFlags();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj12 = node10.getProp((int) (short) -1);
        int int13 = node10.getSideEffectFlags();
        boolean boolean14 = node10.isVoid();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj20 = node18.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj26 = node24.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node27 = node18.clonePropsFrom(node24);
        boolean boolean28 = node18.isNew();
        boolean boolean29 = node18.isNew();
        int int30 = node18.getType();
        boolean boolean31 = node18.mayMutateArguments();
        boolean boolean32 = node18.isBlock();
        boolean boolean33 = node10.isEquivalentToTyped(node18);
        node10.removeProp(2);
        boolean boolean36 = node3.isEquivalentTo(node10);
        node10.setSourceEncodedPositionForTree(29);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString((int) '#', "", (int) (short) 0, 57);
        com.google.javascript.rhino.Node node44 = node10.useSourceInfoFromForTree(node43);
        boolean boolean45 = node43.isOr();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean6 = node5.isLabelName();
        com.google.javascript.rhino.Node node7 = node5.getLastChild();
        boolean boolean8 = node5.isOr();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean13 = node12.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile14 = null;
        node12.setStaticSourceFile(staticSourceFile14);
        boolean boolean16 = node12.isSwitch();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean21 = node20.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile22 = null;
        node20.setStaticSourceFile(staticSourceFile22);
        boolean boolean24 = node20.isSwitch();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj30 = node28.getProp((int) (short) -1);
        int int31 = node28.getChangeTime();
        java.lang.String str32 = node28.getSourceFileName();
        com.google.javascript.rhino.Node[] nodeArray33 = new com.google.javascript.rhino.Node[] { node5, node12, node20, node28 };
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) ' ', nodeArray33, (int) '#', 4);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (short) 10, nodeArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: duplicate child");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(nodeArray33);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj18 = node16.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj24 = node22.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node25 = node16.clonePropsFrom(node22);
        com.google.javascript.rhino.Node node26 = node9.clonePropsFrom(node16);
        boolean boolean27 = node26.isNumber();
        boolean boolean28 = node26.isExprResult();
        boolean boolean29 = node26.isDec();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(53);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj37 = node35.getProp((int) (short) -1);
        boolean boolean38 = node35.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable39 = node35.siblings();
        boolean boolean40 = node35.isFromExterns();
        boolean boolean41 = node35.isAssignAdd();
        com.google.javascript.rhino.Node node42 = node31.srcref(node35);
        boolean boolean43 = node26.isEquivalentToShallow(node42);
        boolean boolean44 = node42.isReturn();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(nodeIterable39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj18 = node16.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj24 = node22.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node25 = node16.clonePropsFrom(node22);
        com.google.javascript.rhino.Node node26 = node9.clonePropsFrom(node16);
        boolean boolean27 = node26.isThrow();
        boolean boolean28 = node26.isNot();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node3.isNew();
        boolean boolean14 = node3.isNew();
        int int15 = node3.getType();
        boolean boolean16 = node3.mayMutateArguments();
        boolean boolean17 = node3.isBlock();
        int int19 = node3.getIntProp((int) (byte) 1);
        boolean boolean20 = node3.isReturn();
        boolean boolean21 = node3.isAssignAdd();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj27 = node25.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj33 = node31.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node34 = node25.clonePropsFrom(node31);
        boolean boolean35 = node25.isNew();
        com.google.javascript.rhino.Node node36 = node25.removeChildren();
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj42 = node40.getProp((int) (short) -1);
        int int43 = node40.getChangeTime();
        boolean boolean44 = node40.isScript();
        node25.addChildToBack(node40);
        com.google.javascript.rhino.Node node46 = node3.srcrefTree(node25);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        node3.setJSType(jSType47);
        boolean boolean49 = node3.isTrue();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", (int) ' ', 36);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isSwitch();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) '#', "BITXOR\n    BITXOR\n");
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        boolean boolean6 = node3.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node3.siblings();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj13 = node11.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean18 = node17.isLabelName();
        com.google.javascript.rhino.Node node19 = node17.getLastChild();
        boolean boolean20 = node11.hasChild(node17);
        boolean boolean21 = node11.isAssignAdd();
        com.google.javascript.rhino.Node node22 = node11.cloneTree();
        com.google.javascript.rhino.Node node23 = node3.srcref(node11);
        node3.setSourceEncodedPosition(47);
        boolean boolean26 = node3.isBreak();
        com.google.javascript.rhino.Node node27 = node3.removeFirstChild();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean10 = node9.isLabelName();
        com.google.javascript.rhino.Node node11 = node9.getLastChild();
        boolean boolean12 = node3.hasChild(node9);
        java.lang.String str13 = node3.getQualifiedName();
        com.google.javascript.rhino.Node node15 = node3.getAncestor(37);
        boolean boolean16 = node3.isRegExp();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean21 = node20.isLabelName();
        com.google.javascript.rhino.Node node22 = node20.getLastChild();
        boolean boolean23 = node20.isOr();
        boolean boolean24 = node20.hasOneChild();
        int int25 = node3.getIndexOfChild(node20);
        boolean boolean26 = node20.isCase();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile27 = node20.getStaticSourceFile();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(staticSourceFile27);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = sideEffectFlags0.setMutatesGlobalState();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags2 = sideEffectFlags1.setMutatesThis();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags3 = sideEffectFlags1.setReturnsTainted();
        sideEffectFlags1.clearSideEffectFlags();
        org.junit.Assert.assertNotNull(sideEffectFlags1);
        org.junit.Assert.assertNotNull(sideEffectFlags2);
        org.junit.Assert.assertNotNull(sideEffectFlags3);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj18 = node16.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj24 = node22.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node25 = node16.clonePropsFrom(node22);
        com.google.javascript.rhino.Node node26 = node9.clonePropsFrom(node16);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean31 = node30.isLabelName();
        boolean boolean32 = node30.isOptionalArg();
        com.google.javascript.rhino.Node node33 = node26.useSourceInfoIfMissingFrom(node30);
        boolean boolean34 = node30.isWith();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isOr();
        boolean boolean7 = node3.hasOneChild();
        node3.setChangeTime(31);
        java.lang.String str10 = node3.getQualifiedName();
        boolean boolean11 = node3.isLabelName();
        com.google.javascript.rhino.Node node12 = node3.cloneTree();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean17 = node16.isLabelName();
        com.google.javascript.rhino.Node node18 = node16.getLastChild();
        boolean boolean19 = node16.isOr();
        boolean boolean20 = node16.isThis();
        boolean boolean21 = node16.isDebugger();
        node16.setOptionalArg(true);
        boolean boolean24 = node16.isOptionalArg();
        boolean boolean25 = node16.isFunction();
        java.lang.Object obj27 = node16.getProp(43);
        com.google.javascript.rhino.Node node28 = node12.useSourceInfoIfMissingFrom(node16);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        node12.setJSType(jSType29);
        boolean boolean31 = node12.isParamList();
        boolean boolean32 = node12.isParamList();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node3.isNew();
        com.google.javascript.rhino.Node node14 = node3.removeChildren();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj20 = node18.getProp((int) (short) -1);
        int int21 = node18.getChangeTime();
        boolean boolean22 = node18.isScript();
        node3.addChildToBack(node18);
        boolean boolean24 = node18.isSyntheticBlock();
        boolean boolean25 = node18.isNew();
        boolean boolean26 = node18.isBlock();
        boolean boolean27 = node18.isEmpty();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        int int5 = node3.getCharno();
        boolean boolean6 = node3.isUnscopedQualifiedName();
        boolean boolean7 = node3.isCast();
        boolean boolean8 = node3.wasEmptyNode();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean14 = node13.isLabelName();
        com.google.javascript.rhino.Node node15 = node13.getLastChild();
        boolean boolean16 = node13.isOr();
        boolean boolean17 = node13.isThis();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj23 = node21.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj29 = node27.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node30 = node21.clonePropsFrom(node27);
        boolean boolean31 = node30.isNull();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj37 = node35.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(10, node13, node30, node35, (int) 'a', 54);
        boolean boolean41 = node30.isExprResult();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj47 = node45.getProp((int) (short) -1);
        int int48 = node45.getSideEffectFlags();
        boolean boolean49 = node45.isLocalResultCall();
        boolean boolean50 = node30.hasChild(node45);
        boolean boolean51 = node45.isOptionalArg();
        boolean boolean52 = node45.isGetElem();
        boolean boolean53 = node3.isEquivalentTo(node45);
        boolean boolean54 = node45.isInstanceOf();
        com.google.javascript.rhino.Node node55 = node45.getLastSibling();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node55);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        int int6 = node3.getChangeTime();
        node3.setLength((int) 'a');
        java.lang.String str9 = node3.getSourceFileName();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 10, 54, 31);
        boolean boolean4 = node3.isArrayLit();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable5 = node3.getAncestors();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(ancestorIterable5);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        boolean boolean6 = node3.isWith();
        boolean boolean7 = node3.isHook();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder8 = node3.getJsDocBuilderForNode();
        boolean boolean9 = node3.isBreak();
        java.util.Set<java.lang.String> strSet10 = node3.getDirectives();
        boolean boolean11 = node3.isSetterDef();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj6 = node4.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj12 = node10.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node13 = node4.clonePropsFrom(node10);
        boolean boolean14 = node10.isEmpty();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node10.siblings();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj21 = node19.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean26 = node25.isLabelName();
        com.google.javascript.rhino.Node node27 = node25.getLastChild();
        boolean boolean28 = node19.hasChild(node25);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean33 = node32.isLabelName();
        int int34 = node32.getCharno();
        boolean boolean35 = node32.isOr();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj41 = node39.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj47 = node45.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node48 = node39.clonePropsFrom(node45);
        boolean boolean49 = node39.isNew();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(8, node10, node25, node32, node39, 1, 100);
        boolean boolean53 = node52.isUnscopedQualifiedName();
        boolean boolean54 = node52.isNoSideEffectsCall();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj6 = node4.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj12 = node10.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node13 = node4.clonePropsFrom(node10);
        boolean boolean14 = node10.isEmpty();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node10.siblings();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj21 = node19.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean26 = node25.isLabelName();
        com.google.javascript.rhino.Node node27 = node25.getLastChild();
        boolean boolean28 = node19.hasChild(node25);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean33 = node32.isLabelName();
        int int34 = node32.getCharno();
        boolean boolean35 = node32.isOr();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj41 = node39.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj47 = node45.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node48 = node39.clonePropsFrom(node45);
        boolean boolean49 = node39.isNew();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(8, node10, node25, node32, node39, 1, 100);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean57 = node56.isLabelName();
        int int58 = node56.getCharno();
        boolean boolean59 = node56.isBlock();
        boolean boolean60 = node56.isBreak();
        com.google.javascript.rhino.Node node61 = node52.srcref(node56);
        boolean boolean62 = node56.isTypeOf();
        node56.setWasEmptyNode(true);
        boolean boolean65 = node56.isVarArgs();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj18 = node16.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj24 = node22.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node25 = node16.clonePropsFrom(node22);
        com.google.javascript.rhino.Node node26 = node9.clonePropsFrom(node16);
        boolean boolean27 = node26.isNumber();
        // The following exception was thrown during execution in test generation
        try {
            int int29 = node26.getExistingIntProp(46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 46");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        boolean boolean6 = node3.isWith();
        boolean boolean7 = node3.isDec();
        boolean boolean8 = node3.wasEmptyNode();
        node3.setWasEmptyNode(true);
        boolean boolean11 = node3.isUnscopedQualifiedName();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 40, 38);
        com.google.javascript.rhino.jstype.JSType jSType4 = node3.getJSType();
        boolean boolean5 = node3.isDelProp();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean5 = node4.isLabelName();
        com.google.javascript.rhino.Node node6 = node4.getLastChild();
        boolean boolean7 = node4.isOr();
        boolean boolean8 = node4.isThis();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj14 = node12.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj20 = node18.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node21 = node12.clonePropsFrom(node18);
        boolean boolean22 = node21.isNull();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj28 = node26.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(10, node4, node21, node26, (int) 'a', 54);
        boolean boolean32 = node4.isUnscopedQualifiedName();
        node4.setOptionalArg(false);
        com.google.javascript.rhino.Node node35 = node4.cloneNode();
        boolean boolean36 = node4.isTypeOf();
        boolean boolean37 = node4.isParamList();
        boolean boolean38 = node4.isFunction();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isOr();
        boolean boolean7 = node3.hasOneChild();
        node3.setChangeTime(31);
        node3.putIntProp(57, 57);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        node3.setJSType(jSType13);
        boolean boolean15 = node3.wasEmptyNode();
        com.google.javascript.rhino.Node node17 = node3.getAncestor(4196);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node3.isNew();
        boolean boolean14 = node3.isNew();
        int int15 = node3.getType();
        boolean boolean16 = node3.mayMutateArguments();
        boolean boolean17 = node3.isBlock();
        int int19 = node3.getIntProp((int) (byte) 1);
        boolean boolean20 = node3.isReturn();
        boolean boolean21 = node3.isAssignAdd();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj27 = node25.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj33 = node31.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node34 = node25.clonePropsFrom(node31);
        boolean boolean35 = node25.isNew();
        com.google.javascript.rhino.Node node36 = node25.removeChildren();
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj42 = node40.getProp((int) (short) -1);
        int int43 = node40.getChangeTime();
        boolean boolean44 = node40.isScript();
        node25.addChildToBack(node40);
        com.google.javascript.rhino.Node node46 = node3.srcrefTree(node25);
        boolean boolean47 = node46.isInc();
        int int48 = node46.getSourcePosition();
        java.lang.String str49 = node46.getSourceFileName();
        boolean boolean50 = node46.isVar();
        boolean boolean51 = node46.isFromExterns();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = null;
        node3.setStaticSourceFile(staticSourceFile5);
        boolean boolean7 = node3.isSwitch();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean13 = node12.isLabelName();
        com.google.javascript.rhino.Node node14 = node12.getLastChild();
        boolean boolean15 = node12.isOr();
        boolean boolean16 = node12.isThis();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj22 = node20.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj28 = node26.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node29 = node20.clonePropsFrom(node26);
        boolean boolean30 = node29.isNull();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj36 = node34.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(10, node12, node29, node34, (int) 'a', 54);
        com.google.javascript.rhino.Node node40 = node3.useSourceInfoFromForTree(node39);
        com.google.javascript.rhino.Node node42 = node40.getAncestor(42);
        int int43 = node40.getLineno();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 97 + "'", int43 == 97);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node3.isNew();
        boolean boolean14 = node3.isNew();
        int int15 = node3.getType();
        boolean boolean16 = node3.mayMutateArguments();
        node3.setLength(2);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj24 = node22.getProp((int) (short) -1);
        boolean boolean25 = node22.isWith();
        boolean boolean26 = node22.isHook();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder27 = node22.getJsDocBuilderForNode();
        boolean boolean28 = node3.isEquivalentToTyped(node22);
        boolean boolean29 = node3.isFunction();
        boolean boolean30 = node3.isDebugger();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean35 = node34.isLabelName();
        boolean boolean36 = node34.hasOneChild();
        java.lang.String str37 = node34.toStringTree();
        com.google.javascript.rhino.Node node38 = node3.useSourceInfoFrom(node34);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 1);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString(12, "BITXOR [change_time: 31]");
        // The following exception was thrown during execution in test generation
        try {
            node38.addChildAfter(node40, node43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "BITXOR\n" + "'", str37, "BITXOR\n");
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node43);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node3.isNew();
        com.google.javascript.rhino.Node node14 = node3.removeChildren();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (byte) 10, 54, 31);
        boolean boolean19 = node18.isDec();
        com.google.javascript.rhino.Node node20 = node3.copyInformationFrom(node18);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean25 = node24.isLabelName();
        com.google.javascript.rhino.Node node26 = node24.getLastChild();
        boolean boolean27 = node24.isDec();
        boolean boolean28 = node24.isFalse();
        node3.addChildToFront(node24);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean34 = node33.isLabelName();
        boolean boolean35 = node33.isOptionalArg();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj41 = node39.getProp((int) (short) -1);
        boolean boolean42 = node39.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable43 = node39.siblings();
        boolean boolean44 = node39.isLabelName();
        com.google.javascript.rhino.Node node45 = node33.useSourceInfoFrom(node39);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile46 = node39.getStaticSourceFile();
        java.lang.String str50 = node39.toString(true, true, false);
        com.google.javascript.rhino.Node node51 = node24.srcref(node39);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags52 = new com.google.javascript.rhino.Node.SideEffectFlags();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags53 = sideEffectFlags52.setReturnsTainted();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags54 = sideEffectFlags53.setMutatesThis();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags55 = sideEffectFlags54.setAllFlags();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags56 = sideEffectFlags55.setMutatesGlobalState();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags57 = sideEffectFlags56.setThrows();
        // The following exception was thrown during execution in test generation
        try {
            node51.setSideEffectFlags(sideEffectFlags56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got BITXOR");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(nodeIterable43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNull(staticSourceFile46);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "BITXOR" + "'", str50, "BITXOR");
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(sideEffectFlags53);
        org.junit.Assert.assertNotNull(sideEffectFlags54);
        org.junit.Assert.assertNotNull(sideEffectFlags55);
        org.junit.Assert.assertNotNull(sideEffectFlags56);
        org.junit.Assert.assertNotNull(sideEffectFlags57);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj6 = node4.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj12 = node10.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node13 = node4.clonePropsFrom(node10);
        boolean boolean14 = node10.isEmpty();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node10.siblings();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj21 = node19.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean26 = node25.isLabelName();
        com.google.javascript.rhino.Node node27 = node25.getLastChild();
        boolean boolean28 = node19.hasChild(node25);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean33 = node32.isLabelName();
        int int34 = node32.getCharno();
        boolean boolean35 = node32.isOr();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj41 = node39.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj47 = node45.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node48 = node39.clonePropsFrom(node45);
        boolean boolean49 = node39.isNew();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(8, node10, node25, node32, node39, 1, 100);
        boolean boolean53 = node52.isUnscopedQualifiedName();
        boolean boolean54 = node52.isIf();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) '#');
        int int2 = node1.getChangeTime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        int int5 = node3.getCharno();
        boolean boolean6 = node3.isQualifiedName();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj12 = node10.getProp((int) (short) -1);
        int int13 = node10.getSideEffectFlags();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj19 = node17.getProp((int) (short) -1);
        int int20 = node17.getSideEffectFlags();
        boolean boolean21 = node17.isVoid();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj27 = node25.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj33 = node31.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node34 = node25.clonePropsFrom(node31);
        boolean boolean35 = node25.isNew();
        boolean boolean36 = node25.isNew();
        int int37 = node25.getType();
        boolean boolean38 = node25.mayMutateArguments();
        boolean boolean39 = node25.isBlock();
        boolean boolean40 = node17.isEquivalentToTyped(node25);
        node17.removeProp(2);
        boolean boolean43 = node10.isEquivalentTo(node17);
        com.google.javascript.rhino.Node node44 = node3.useSourceInfoIfMissingFromForTree(node10);
        node3.setOptionalArg(true);
        // The following exception was thrown during execution in test generation
        try {
            node3.setDouble((double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: BITXOR [opt_arg: 1] is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(node44);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isOr();
        boolean boolean7 = node3.isThis();
        boolean boolean8 = node3.isDebugger();
        node3.setOptionalArg(true);
        boolean boolean11 = node3.isOptionalArg();
        boolean boolean12 = node3.hasChildren();
        boolean boolean13 = node3.isBlock();
        int int14 = node3.getSourcePosition();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean19 = node18.mayMutateArguments();
        com.google.javascript.rhino.Node node20 = node3.copyInformationFrom(node18);
        com.google.javascript.rhino.jstype.JSType jSType21 = node20.getJSType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(jSType21);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj6 = node4.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj12 = node10.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node13 = node4.clonePropsFrom(node10);
        boolean boolean14 = node13.isNull();
        com.google.javascript.rhino.Node node15 = node13.getNext();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(30, node15, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj6 = node4.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean11 = node10.isLabelName();
        com.google.javascript.rhino.Node node12 = node10.getLastChild();
        boolean boolean13 = node4.hasChild(node10);
        boolean boolean14 = node4.hasChildren();
        int int15 = node4.getChildCount();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(54, node4, 10, (int) '4');
        boolean boolean19 = node4.isDebugger();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean25 = node24.isLabelName();
        com.google.javascript.rhino.Node node26 = node24.getLastChild();
        boolean boolean27 = node24.isOr();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean32 = node31.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile33 = null;
        node31.setStaticSourceFile(staticSourceFile33);
        boolean boolean35 = node31.isSwitch();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean40 = node39.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile41 = null;
        node39.setStaticSourceFile(staticSourceFile41);
        boolean boolean43 = node39.isSwitch();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj49 = node47.getProp((int) (short) -1);
        int int50 = node47.getChangeTime();
        java.lang.String str51 = node47.getSourceFileName();
        com.google.javascript.rhino.Node[] nodeArray52 = new com.google.javascript.rhino.Node[] { node24, node31, node39, node47 };
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) ' ', nodeArray52, (int) '#', 4);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean61 = node60.isLabelName();
        com.google.javascript.rhino.Node node62 = node60.getLastChild();
        boolean boolean63 = node60.isOr();
        boolean boolean64 = node60.isThis();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj70 = node68.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj76 = node74.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node77 = node68.clonePropsFrom(node74);
        boolean boolean78 = node77.isNull();
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj84 = node82.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node87 = new com.google.javascript.rhino.Node(10, node60, node77, node82, (int) 'a', 54);
        com.google.javascript.rhino.Node node88 = node55.useSourceInfoIfMissingFromForTree(node77);
        com.google.javascript.rhino.Node node89 = node77.detachFromParent();
        node4.addChildrenToFront(node89);
        boolean boolean91 = node89.isNoSideEffectsCall();
        java.lang.String str92 = node89.toString();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(nodeArray52);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "BITXOR" + "'", str92, "BITXOR");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("TYPEOF 10\n");
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node3.isNew();
        boolean boolean14 = node3.isNew();
        boolean boolean15 = node3.isThis();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = null;
        com.google.javascript.rhino.Node node17 = node3.setJSDocInfo(jSDocInfo16);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean22 = node21.isLabelName();
        com.google.javascript.rhino.Node node23 = node21.getLastChild();
        boolean boolean24 = node21.isOr();
        boolean boolean25 = node21.hasOneChild();
        node21.setChangeTime(31);
        java.lang.String str28 = node21.getQualifiedName();
        java.lang.String str29 = node21.getQualifiedName();
        com.google.javascript.rhino.Node node30 = node17.copyInformationFrom(node21);
        boolean boolean31 = node30.isFor();
        int int32 = node30.getLength();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isOr();
        boolean boolean7 = node3.isThis();
        boolean boolean8 = node3.isDebugger();
        node3.setOptionalArg(true);
        java.lang.Object obj12 = node3.getProp(29);
        boolean boolean13 = node3.isScript();
        boolean boolean14 = node3.isDec();
        boolean boolean15 = node3.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean21 = node20.isLabelName();
        com.google.javascript.rhino.Node node22 = node20.getLastChild();
        boolean boolean23 = node20.isOr();
        boolean boolean24 = node20.isThis();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj30 = node28.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj36 = node34.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node37 = node28.clonePropsFrom(node34);
        boolean boolean38 = node37.isNull();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj44 = node42.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(10, node20, node37, node42, (int) 'a', 54);
        boolean boolean48 = node20.isUnscopedQualifiedName();
        node20.setOptionalArg(false);
        boolean boolean51 = node3.isEquivalentToShallow(node20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        boolean boolean6 = node3.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node3.siblings();
        boolean boolean8 = node3.isFromExterns();
        com.google.javascript.rhino.Node node9 = node3.cloneTree();
        boolean boolean10 = node9.isDefaultCase();
        node9.setWasEmptyNode(true);
        boolean boolean13 = node9.isVarArgs();
        node9.setSourceFileForTesting("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder13 = node3.getJsDocBuilderForNode();
        boolean boolean14 = node3.isLabelName();
        boolean boolean15 = node3.mayMutateGlobalStateOrThrow();
        node3.setType(50);
        java.lang.String str18 = node3.getQualifiedName();
        int int19 = node3.getChildCount();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = node3.getExistingIntProp(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj6 = node4.getProp((int) (short) -1);
        int int7 = node4.getSideEffectFlags();
        boolean boolean8 = node4.isLocalResultCall();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable9 = node4.getAncestors();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(39, node4);
        java.lang.Object obj12 = node10.getProp((int) (byte) 0);
        node10.setVarArgs(true);
        int int15 = node10.getLength();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj21 = node19.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj27 = node25.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node28 = node19.clonePropsFrom(node25);
        boolean boolean29 = node19.isNew();
        boolean boolean30 = node19.isNew();
        boolean boolean31 = node19.isThis();
        node19.setSourceEncodedPosition(8);
        boolean boolean34 = node19.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node35 = node19.cloneNode();
        com.google.javascript.rhino.Node node36 = node10.srcref(node35);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(ancestorIterable9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder13 = node3.getJsDocBuilderForNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = node3.getJSDocInfo();
        boolean boolean15 = node3.isHook();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj21 = node19.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj27 = node25.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node28 = node19.clonePropsFrom(node25);
        boolean boolean29 = node19.isNew();
        boolean boolean30 = node19.isNew();
        int int31 = node19.getType();
        boolean boolean32 = node19.mayMutateArguments();
        boolean boolean33 = node19.isBlock();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean39 = node38.isLabelName();
        com.google.javascript.rhino.Node node40 = node38.getLastChild();
        boolean boolean41 = node38.isOr();
        boolean boolean42 = node38.isThis();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj48 = node46.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj54 = node52.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node55 = node46.clonePropsFrom(node52);
        boolean boolean56 = node55.isNull();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj62 = node60.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(10, node38, node55, node60, (int) 'a', 54);
        boolean boolean66 = node65.isLocalResultCall();
        node19.addChildToBack(node65);
        int int68 = node3.getIndexOfChild(node19);
        boolean boolean69 = node3.isLabel();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder13);
        org.junit.Assert.assertNull(jSDocInfo14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder13 = node3.getJsDocBuilderForNode();
        boolean boolean14 = node3.isOptionalArg();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj20 = node18.getProp((int) (short) -1);
        int int21 = node18.getSideEffectFlags();
        boolean boolean22 = node18.isLocalResultCall();
        boolean boolean23 = node18.isIn();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean28 = node27.isLabelName();
        com.google.javascript.rhino.Node node29 = node27.getLastChild();
        boolean boolean30 = node27.isOr();
        boolean boolean31 = node27.hasOneChild();
        node27.setChangeTime(31);
        boolean boolean34 = node27.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj40 = node38.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean45 = node44.isLabelName();
        com.google.javascript.rhino.Node node46 = node44.getLastChild();
        boolean boolean47 = node38.hasChild(node44);
        boolean boolean48 = node38.hasChildren();
        com.google.javascript.rhino.Node node49 = node27.useSourceInfoFromForTree(node38);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile50 = null;
        node38.setStaticSourceFile(staticSourceFile50);
        com.google.javascript.rhino.Node node52 = node18.clonePropsFrom(node38);
        boolean boolean53 = node18.isDefaultCase();
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj59 = node57.getProp((int) (short) -1);
        int int60 = node57.getChangeTime();
        boolean boolean61 = node57.isNew();
        boolean boolean62 = node57.isNE();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj68 = node66.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj74 = node72.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node75 = node66.clonePropsFrom(node72);
        boolean boolean76 = node66.isNew();
        boolean boolean77 = node66.isNew();
        int int78 = node66.getType();
        com.google.javascript.rhino.Node node79 = node57.useSourceInfoFromForTree(node66);
        node18.addChildToFront(node66);
        boolean boolean81 = node18.isLabel();
        com.google.javascript.rhino.Node node82 = node3.useSourceInfoFrom(node18);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 10 + "'", int78 == 10);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(node82);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isOr();
        boolean boolean7 = node3.isThis();
        java.lang.Object obj9 = node3.getProp(0);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean14 = node13.isLabelName();
        com.google.javascript.rhino.Node node15 = node13.getLastChild();
        boolean boolean16 = node13.isOr();
        boolean boolean17 = node13.isThis();
        java.lang.Object obj19 = node13.getProp(0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node13.siblings();
        com.google.javascript.rhino.Node node21 = node13.removeFirstChild();
        com.google.javascript.rhino.InputId inputId22 = null;
        node13.setInputId(inputId22);
        node13.setCharno((int) '4');
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFromForTree(node13);
        // The following exception was thrown during execution in test generation
        try {
            double double27 = node13.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: BITXOR is not a number node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(54);
        node1.setChangeTime(40);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean6 = node5.isLabelName();
        com.google.javascript.rhino.Node node7 = node5.getLastChild();
        boolean boolean8 = node5.isOr();
        boolean boolean9 = node5.isThis();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj15 = node13.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj21 = node19.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node22 = node13.clonePropsFrom(node19);
        boolean boolean23 = node22.isNull();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj29 = node27.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(10, node5, node22, node27, (int) 'a', 54);
        boolean boolean33 = node32.isLocalResultCall();
        boolean boolean34 = node32.isQuotedString();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 10, node32, 32, (int) (short) 0);
        boolean boolean38 = node37.isWith();
        int int39 = node37.getCharno();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 10, 54, 31);
        boolean boolean4 = node3.isAssignAdd();
        boolean boolean5 = node3.isQuotedString();
        int int6 = node3.getSourceOffset();
        node3.setVarArgs(false);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj14 = node12.getProp((int) (short) -1);
        int int15 = node12.getChangeTime();
        java.lang.String str16 = node12.getSourceFileName();
        int int17 = node3.getIndexOfChild(node12);
        boolean boolean18 = node3.isName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isOr();
        boolean boolean7 = node3.hasOneChild();
        node3.setChangeTime(31);
        boolean boolean10 = node3.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj16 = node14.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean21 = node20.isLabelName();
        com.google.javascript.rhino.Node node22 = node20.getLastChild();
        boolean boolean23 = node14.hasChild(node20);
        boolean boolean24 = node14.hasChildren();
        com.google.javascript.rhino.Node node25 = node3.useSourceInfoFromForTree(node14);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile26 = null;
        node14.setStaticSourceFile(staticSourceFile26);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj33 = node31.getProp((int) (short) -1);
        int int34 = node31.getSideEffectFlags();
        boolean boolean35 = node31.hasMoreThanOneChild();
        node14.addChildrenToBack(node31);
        boolean boolean37 = node14.isParamList();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean42 = node41.isLabelName();
        com.google.javascript.rhino.Node node43 = node41.getLastChild();
        boolean boolean44 = node41.isOr();
        boolean boolean45 = node41.isThis();
        boolean boolean46 = node41.isDebugger();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean51 = node50.isLabelName();
        com.google.javascript.rhino.Node node52 = node50.getLastChild();
        boolean boolean53 = node50.isOr();
        boolean boolean54 = node50.isThis();
        boolean boolean55 = node50.isDebugger();
        boolean boolean56 = node50.isGetProp();
        boolean boolean57 = node50.isDefaultCase();
        boolean boolean58 = node50.isNE();
        int int59 = node41.getIndexOfChild(node50);
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) 1);
        node41.addChildrenToFront(node61);
        com.google.javascript.rhino.Node node63 = node14.srcref(node41);
        boolean boolean64 = node63.isIn();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node3.isNew();
        boolean boolean14 = node3.isNew();
        int int15 = node3.getType();
        boolean boolean16 = node3.mayMutateArguments();
        node3.setLength(2);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj24 = node22.getProp((int) (short) -1);
        boolean boolean25 = node22.isWith();
        boolean boolean26 = node22.isHook();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder27 = node22.getJsDocBuilderForNode();
        boolean boolean28 = node3.isEquivalentToTyped(node22);
        boolean boolean29 = node3.isFunction();
        boolean boolean30 = node3.isDebugger();
        boolean boolean31 = node3.isOr();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (short) 0);
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean5 = node4.isLabelName();
        com.google.javascript.rhino.Node node6 = node4.getLastChild();
        boolean boolean7 = node4.isOr();
        boolean boolean8 = node4.isThis();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj14 = node12.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj20 = node18.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node21 = node12.clonePropsFrom(node18);
        boolean boolean22 = node21.isNull();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj28 = node26.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(10, node4, node21, node26, (int) 'a', 54);
        boolean boolean32 = node26.isSwitch();
        boolean boolean33 = node26.isThrow();
        boolean boolean34 = node26.isGetProp();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isOr();
        boolean boolean7 = node3.isThis();
        boolean boolean8 = node3.isDebugger();
        node3.setOptionalArg(true);
        boolean boolean11 = node3.isOptionalArg();
        boolean boolean12 = node3.hasChildren();
        boolean boolean13 = node3.isBlock();
        boolean boolean14 = node3.isFalse();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 4);
        boolean boolean2 = node1.isOnlyModifiesArgumentsCall();
        boolean boolean3 = node1.isGetProp();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj6 = node4.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean11 = node10.isLabelName();
        com.google.javascript.rhino.Node node12 = node10.getLastChild();
        boolean boolean13 = node4.hasChild(node10);
        boolean boolean14 = node4.hasChildren();
        int int15 = node4.getChildCount();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(54, node4, 10, (int) '4');
        com.google.javascript.rhino.Node node19 = node4.getParent();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean24 = node23.isLabelName();
        com.google.javascript.rhino.Node node25 = node23.getLastChild();
        boolean boolean26 = node23.isOr();
        boolean boolean27 = node23.isThis();
        boolean boolean28 = node23.isDebugger();
        boolean boolean29 = node23.isGetProp();
        java.lang.String[] strArray38 = new java.lang.String[] { "BITXOR [change_time: 31]", "goog.scope", "BITXOR [change_time: 31]", "", "hi!", "Node tree inequality:\nTree1:\nBITXOR\n\n\nTree2:\nSTRING \n\n\nSubtree1: BITXOR\n\n\nSubtree2: STRING \n", "BITXOR [change_time: 31]", "goog.scope" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        node23.setDirectives((java.util.Set<java.lang.String>) strSet39);
        node4.addChildToFront(node23);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "BITXOR [change_time: 31]", "goog.scope", "BITXOR [change_time: 31]", "", "hi!", "Node tree inequality:\nTree1:\nBITXOR\n\n\nTree2:\nSTRING \n\n\nSubtree1: BITXOR\n\n\nSubtree2: STRING \n", "BITXOR [change_time: 31]", "goog.scope" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj6 = node4.getProp((int) (short) -1);
        int int7 = node4.getSideEffectFlags();
        boolean boolean8 = node4.isLocalResultCall();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable9 = node4.getAncestors();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(39, node4);
        com.google.javascript.rhino.Node node11 = node10.cloneNode();
        boolean boolean12 = node11.isThrow();
        boolean boolean13 = node11.isGetterDef();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(ancestorIterable9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("BITXOR\n");
        boolean boolean2 = node1.isVarArgs();
        boolean boolean3 = node1.isVoid();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean10 = node9.isLabelName();
        com.google.javascript.rhino.Node node11 = node9.getLastChild();
        boolean boolean12 = node3.hasChild(node9);
        boolean boolean13 = node3.isAssignAdd();
        com.google.javascript.rhino.Node node14 = node3.cloneTree();
        boolean boolean15 = node3.isParamList();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean20 = node19.isLabelName();
        com.google.javascript.rhino.Node node21 = node19.getLastChild();
        boolean boolean22 = node19.isOr();
        boolean boolean23 = node19.hasOneChild();
        node19.setChangeTime(31);
        boolean boolean26 = node19.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj32 = node30.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean37 = node36.isLabelName();
        com.google.javascript.rhino.Node node38 = node36.getLastChild();
        boolean boolean39 = node30.hasChild(node36);
        boolean boolean40 = node30.hasChildren();
        com.google.javascript.rhino.Node node41 = node19.useSourceInfoFromForTree(node30);
        java.lang.String str42 = node19.toString();
        com.google.javascript.rhino.Node node43 = node3.useSourceInfoIfMissingFrom(node19);
        boolean boolean44 = node19.isTrue();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "BITXOR [change_time: 31]" + "'", str42, "BITXOR [change_time: 31]");
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isOr();
        boolean boolean7 = node3.hasOneChild();
        node3.setChangeTime(31);
        boolean boolean10 = node3.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj16 = node14.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean21 = node20.isLabelName();
        com.google.javascript.rhino.Node node22 = node20.getLastChild();
        boolean boolean23 = node14.hasChild(node20);
        boolean boolean24 = node14.hasChildren();
        com.google.javascript.rhino.Node node25 = node3.useSourceInfoFromForTree(node14);
        java.lang.String str26 = node3.toString();
        boolean boolean27 = node3.isThis();
        boolean boolean28 = node3.isInc();
        java.lang.Appendable appendable29 = null;
        // The following exception was thrown during execution in test generation
        try {
            node3.appendStringTree(appendable29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "BITXOR [change_time: 31]" + "'", str26, "BITXOR [change_time: 31]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(49, 29, (int) (short) 100);
        com.google.javascript.rhino.InputId inputId4 = node3.getInputId();
        org.junit.Assert.assertNull(inputId4);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("BITXOR\n");
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean6 = node5.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile7 = null;
        node5.setStaticSourceFile(staticSourceFile7);
        boolean boolean9 = node5.isSwitch();
        boolean boolean10 = node5.isDec();
        // The following exception was thrown during execution in test generation
        try {
            node1.removeChild(node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = sideEffectFlags0.setReturnsTainted();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags2 = sideEffectFlags0.clearAllFlags();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags3 = sideEffectFlags0.setMutatesArguments();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags4 = sideEffectFlags0.setReturnsTainted();
        boolean boolean5 = sideEffectFlags0.areAllFlagsSet();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags6 = sideEffectFlags0.clearAllFlags();
        boolean boolean7 = sideEffectFlags0.areAllFlagsSet();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags8 = sideEffectFlags0.clearAllFlags();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags9 = sideEffectFlags0.setAllFlags();
        org.junit.Assert.assertNotNull(sideEffectFlags1);
        org.junit.Assert.assertNotNull(sideEffectFlags2);
        org.junit.Assert.assertNotNull(sideEffectFlags3);
        org.junit.Assert.assertNotNull(sideEffectFlags4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sideEffectFlags6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(sideEffectFlags8);
        org.junit.Assert.assertNotNull(sideEffectFlags9);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj18 = node16.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj24 = node22.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node25 = node16.clonePropsFrom(node22);
        com.google.javascript.rhino.Node node26 = node9.clonePropsFrom(node16);
        boolean boolean27 = node26.isThrow();
        boolean boolean28 = node26.isComma();
        boolean boolean29 = node26.isOnlyModifiesThisCall();
        boolean boolean30 = node26.isAdd();
        boolean boolean32 = node26.getBooleanProp((int) '4');
        boolean boolean33 = node26.isFor();
        boolean boolean34 = node26.isNot();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj40 = node38.getProp((int) (short) -1);
        boolean boolean41 = node38.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable42 = node38.siblings();
        boolean boolean43 = node38.isFromExterns();
        boolean boolean44 = node38.isNew();
        boolean boolean45 = node38.isWith();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean51 = node50.isLabelName();
        com.google.javascript.rhino.Node node52 = node50.getLastChild();
        boolean boolean53 = node50.isOr();
        boolean boolean54 = node50.isThis();
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj60 = node58.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj66 = node64.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node67 = node58.clonePropsFrom(node64);
        boolean boolean68 = node67.isNull();
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj74 = node72.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(10, node50, node67, node72, (int) 'a', 54);
        boolean boolean78 = node67.isExprResult();
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj84 = node82.getProp((int) (short) -1);
        int int85 = node82.getSideEffectFlags();
        boolean boolean86 = node82.isLocalResultCall();
        boolean boolean87 = node67.hasChild(node82);
        boolean boolean88 = node82.isLabelName();
        int int89 = node82.getCharno();
        // The following exception was thrown during execution in test generation
        try {
            node26.addChildBefore(node38, node82);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(nodeIterable42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        int int6 = node3.getSideEffectFlags();
        boolean boolean7 = node3.isLocalResultCall();
        boolean boolean8 = node3.isIn();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean13 = node12.isLabelName();
        com.google.javascript.rhino.Node node14 = node12.getLastChild();
        boolean boolean15 = node12.isOr();
        boolean boolean16 = node12.hasOneChild();
        node12.setChangeTime(31);
        boolean boolean19 = node12.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj25 = node23.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean30 = node29.isLabelName();
        com.google.javascript.rhino.Node node31 = node29.getLastChild();
        boolean boolean32 = node23.hasChild(node29);
        boolean boolean33 = node23.hasChildren();
        com.google.javascript.rhino.Node node34 = node12.useSourceInfoFromForTree(node23);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile35 = null;
        node23.setStaticSourceFile(staticSourceFile35);
        com.google.javascript.rhino.Node node37 = node3.clonePropsFrom(node23);
        boolean boolean38 = node3.isDefaultCase();
        boolean boolean39 = node3.isDebugger();
        boolean boolean40 = node3.isNE();
        com.google.javascript.rhino.Node node41 = node3.cloneNode();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean5 = node4.isLabelName();
        com.google.javascript.rhino.Node node6 = node4.getLastChild();
        boolean boolean7 = node4.isOr();
        boolean boolean8 = node4.hasOneChild();
        node4.setChangeTime(31);
        boolean boolean11 = node4.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj17 = node15.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean22 = node21.isLabelName();
        com.google.javascript.rhino.Node node23 = node21.getLastChild();
        boolean boolean24 = node15.hasChild(node21);
        boolean boolean25 = node15.hasChildren();
        com.google.javascript.rhino.Node node26 = node4.useSourceInfoFromForTree(node15);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(10, node4);
        boolean boolean28 = node4.isObjectLit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 10, 54, 31);
        boolean boolean4 = node3.isAssignAdd();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable5 = node3.children();
        boolean boolean6 = node3.isContinue();
        int int7 = node3.getCharno();
        boolean boolean8 = node3.isFalse();
        boolean boolean9 = node3.wasEmptyNode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean5 = node4.isLabelName();
        com.google.javascript.rhino.Node node6 = node4.getLastChild();
        boolean boolean7 = node4.isOr();
        boolean boolean8 = node4.isThis();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj14 = node12.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj20 = node18.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node21 = node12.clonePropsFrom(node18);
        boolean boolean22 = node21.isNull();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj28 = node26.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(10, node4, node21, node26, (int) 'a', 54);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj39 = node37.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj45 = node43.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node46 = node37.clonePropsFrom(node43);
        boolean boolean47 = node43.isEmpty();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable48 = node43.siblings();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj54 = node52.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean59 = node58.isLabelName();
        com.google.javascript.rhino.Node node60 = node58.getLastChild();
        boolean boolean61 = node52.hasChild(node58);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean66 = node65.isLabelName();
        int int67 = node65.getCharno();
        boolean boolean68 = node65.isOr();
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj74 = node72.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj80 = node78.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node81 = node72.clonePropsFrom(node78);
        boolean boolean82 = node72.isNew();
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node(8, node43, node58, node65, node72, 1, 100);
        boolean boolean86 = node85.isUnscopedQualifiedName();
        node85.detachChildren();
        com.google.javascript.rhino.Node node88 = node85.removeFirstChild();
        node21.putProp((int) (short) 10, (java.lang.Object) node85);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable90 = node85.children();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(nodeIterable48);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNull(node88);
        org.junit.Assert.assertNotNull(nodeIterable90);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean5 = node4.isLabelName();
        com.google.javascript.rhino.Node node6 = node4.getLastChild();
        boolean boolean7 = node4.isOr();
        boolean boolean8 = node4.isThis();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj14 = node12.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj20 = node18.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node21 = node12.clonePropsFrom(node18);
        boolean boolean22 = node21.isNull();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj28 = node26.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(10, node4, node21, node26, (int) 'a', 54);
        boolean boolean32 = node21.isExprResult();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj38 = node36.getProp((int) (short) -1);
        int int39 = node36.getSideEffectFlags();
        boolean boolean40 = node36.isLocalResultCall();
        boolean boolean41 = node21.hasChild(node36);
        boolean boolean42 = node21.isAssign();
        boolean boolean43 = node21.isBreak();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        int int6 = node3.getChangeTime();
        boolean boolean7 = node3.isNew();
        int int8 = node3.getSourcePosition();
        boolean boolean9 = node3.isBlock();
        node3.setLineno(0);
        node3.setSourceEncodedPositionForTree(30);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        int int6 = node3.getSideEffectFlags();
        boolean boolean7 = node3.isLocalResultCall();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable8 = node3.getAncestors();
        node3.setWasEmptyNode(false);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean15 = node14.isLabelName();
        com.google.javascript.rhino.Node node16 = node14.getLastChild();
        boolean boolean17 = node14.isOr();
        boolean boolean18 = node14.hasOneChild();
        node14.setChangeTime(31);
        boolean boolean21 = node14.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj27 = node25.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean32 = node31.isLabelName();
        com.google.javascript.rhino.Node node33 = node31.getLastChild();
        boolean boolean34 = node25.hasChild(node31);
        boolean boolean35 = node25.hasChildren();
        com.google.javascript.rhino.Node node36 = node14.useSourceInfoFromForTree(node25);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile37 = null;
        node25.setStaticSourceFile(staticSourceFile37);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj44 = node42.getProp((int) (short) -1);
        int int45 = node42.getSideEffectFlags();
        boolean boolean46 = node42.hasMoreThanOneChild();
        node25.addChildrenToBack(node42);
        com.google.javascript.rhino.Node node48 = node3.copyInformationFromForTree(node42);
        boolean boolean49 = node3.isExprResult();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj55 = node53.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj61 = node59.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node62 = node53.clonePropsFrom(node59);
        boolean boolean63 = node59.isNot();
        boolean boolean64 = node59.isNE();
        boolean boolean65 = node59.hasOneChild();
        com.google.javascript.rhino.Node node66 = node3.useSourceInfoFromForTree(node59);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable67 = node66.children();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(ancestorIterable8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(nodeIterable67);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj18 = node16.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj24 = node22.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node25 = node16.clonePropsFrom(node22);
        com.google.javascript.rhino.Node node26 = node9.clonePropsFrom(node16);
        int int27 = node9.getSourceOffset();
        boolean boolean28 = node9.isThis();
        boolean boolean29 = node9.isGetElem();
        boolean boolean30 = node9.isExprResult();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node9.isEmpty();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable14 = node9.siblings();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj20 = node18.getProp((int) (short) -1);
        boolean boolean21 = node18.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node18.siblings();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj28 = node26.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj34 = node32.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node35 = node26.clonePropsFrom(node32);
        node18.addChildrenToBack(node32);
        node9.addChildrenToBack(node18);
        com.google.javascript.rhino.Node node39 = node9.getAncestor(29);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = node39.isArrayLit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeIterable14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node39);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("GETELEM 4\n    STRING hi! 39\n    BITXOR\n", 10, (int) (short) 1);
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        int int6 = node3.getSideEffectFlags();
        boolean boolean7 = node3.isOnlyModifiesArgumentsCall();
        boolean boolean8 = node3.isCase();
        // The following exception was thrown during execution in test generation
        try {
            node3.setString("goog.scope");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: BITXOR is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 10, 54, 31);
        com.google.javascript.rhino.Node node4 = node3.getLastChild();
        boolean boolean5 = node3.isName();
        node3.removeProp(16);
        boolean boolean8 = node3.isCase();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean5 = node4.isLabelName();
        int int6 = node4.getCharno();
        boolean boolean7 = node4.isUnscopedQualifiedName();
        boolean boolean8 = node4.isCast();
        boolean boolean9 = node4.wasEmptyNode();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean15 = node14.isLabelName();
        com.google.javascript.rhino.Node node16 = node14.getLastChild();
        boolean boolean17 = node14.isOr();
        boolean boolean18 = node14.isThis();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj24 = node22.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj30 = node28.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node31 = node22.clonePropsFrom(node28);
        boolean boolean32 = node31.isNull();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj38 = node36.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(10, node14, node31, node36, (int) 'a', 54);
        boolean boolean42 = node31.isExprResult();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj48 = node46.getProp((int) (short) -1);
        int int49 = node46.getSideEffectFlags();
        boolean boolean50 = node46.isLocalResultCall();
        boolean boolean51 = node31.hasChild(node46);
        boolean boolean52 = node46.isOptionalArg();
        boolean boolean53 = node46.isGetElem();
        boolean boolean54 = node4.isEquivalentTo(node46);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) 'a', node4);
        com.google.javascript.rhino.jstype.JSType jSType56 = node55.getJSType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(jSType56);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 10, 54, 31);
        com.google.javascript.rhino.Node node4 = node3.getLastChild();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj10 = node8.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean15 = node14.isLabelName();
        com.google.javascript.rhino.Node node16 = node14.getLastChild();
        boolean boolean17 = node8.hasChild(node14);
        boolean boolean18 = node8.hasChildren();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj24 = node22.getProp((int) (short) -1);
        boolean boolean25 = node22.isWith();
        com.google.javascript.rhino.Node node26 = node22.removeFirstChild();
        com.google.javascript.rhino.Node node27 = node8.srcref(node22);
        com.google.javascript.rhino.Node node28 = node3.copyInformationFromForTree(node8);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj34 = node32.getProp((int) (short) -1);
        int int35 = node32.getChangeTime();
        boolean boolean36 = node32.isNew();
        int int37 = node32.getSourcePosition();
        boolean boolean38 = node32.isBlock();
        node32.setLineno(0);
        boolean boolean41 = node32.isNot();
        java.lang.String str42 = node3.checkTreeEquals(node32);
        boolean boolean43 = node32.isNew();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        int int6 = node3.getChangeTime();
        boolean boolean7 = node3.isNew();
        boolean boolean8 = node3.isNE();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj14 = node12.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj20 = node18.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node21 = node12.clonePropsFrom(node18);
        boolean boolean22 = node12.isNew();
        boolean boolean23 = node12.isNew();
        int int24 = node12.getType();
        com.google.javascript.rhino.Node node25 = node3.useSourceInfoFromForTree(node12);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean30 = node29.isLabelName();
        com.google.javascript.rhino.Node node31 = node29.getLastChild();
        boolean boolean32 = node29.isOr();
        boolean boolean33 = node29.hasOneChild();
        node29.setChangeTime(31);
        boolean boolean36 = node29.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj42 = node40.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean47 = node46.isLabelName();
        com.google.javascript.rhino.Node node48 = node46.getLastChild();
        boolean boolean49 = node40.hasChild(node46);
        boolean boolean50 = node40.hasChildren();
        com.google.javascript.rhino.Node node51 = node29.useSourceInfoFromForTree(node40);
        node40.setChangeTime(16);
        node3.addChildToFront(node40);
        node40.setCharno((-1));
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable57 = node40.children();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean62 = node61.isLabelName();
        com.google.javascript.rhino.Node node63 = node61.getLastChild();
        boolean boolean64 = node61.isDec();
        node61.detachChildren();
        boolean boolean66 = node61.isEmpty();
        boolean boolean67 = node61.isAssignAdd();
        node40.addChildrenToBack(node61);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(nodeIterable57);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean5 = node4.isLabelName();
        com.google.javascript.rhino.Node node6 = node4.getLastChild();
        boolean boolean7 = node4.isOr();
        boolean boolean8 = node4.isThis();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj14 = node12.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj20 = node18.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node21 = node12.clonePropsFrom(node18);
        boolean boolean22 = node21.isNull();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj28 = node26.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(10, node4, node21, node26, (int) 'a', 54);
        boolean boolean32 = node21.isExprResult();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj38 = node36.getProp((int) (short) -1);
        int int39 = node36.getSideEffectFlags();
        boolean boolean40 = node36.isLocalResultCall();
        boolean boolean41 = node21.hasChild(node36);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(97, "hi!");
        node44.detachChildren();
        com.google.javascript.rhino.Node node46 = node36.copyInformationFromForTree(node44);
        boolean boolean47 = node44.isIf();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        int int5 = node3.getCharno();
        boolean boolean6 = node3.isQualifiedName();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj12 = node10.getProp((int) (short) -1);
        int int13 = node10.getSideEffectFlags();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj19 = node17.getProp((int) (short) -1);
        int int20 = node17.getSideEffectFlags();
        boolean boolean21 = node17.isVoid();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj27 = node25.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj33 = node31.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node34 = node25.clonePropsFrom(node31);
        boolean boolean35 = node25.isNew();
        boolean boolean36 = node25.isNew();
        int int37 = node25.getType();
        boolean boolean38 = node25.mayMutateArguments();
        boolean boolean39 = node25.isBlock();
        boolean boolean40 = node17.isEquivalentToTyped(node25);
        node17.removeProp(2);
        boolean boolean43 = node10.isEquivalentTo(node17);
        com.google.javascript.rhino.Node node44 = node3.useSourceInfoIfMissingFromForTree(node10);
        boolean boolean45 = node3.isDo();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj51 = node49.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj57 = node55.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node58 = node49.clonePropsFrom(node55);
        boolean boolean59 = node49.isNew();
        com.google.javascript.rhino.Node node60 = node49.removeChildren();
        com.google.javascript.rhino.JSDocInfo jSDocInfo61 = null;
        com.google.javascript.rhino.Node node62 = node49.setJSDocInfo(jSDocInfo61);
        java.util.Set<java.lang.String> strSet63 = node62.getDirectives();
        node3.addChildrenToFront(node62);
        boolean boolean65 = node3.isNE();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNull(strSet63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean6 = node5.isLabelName();
        com.google.javascript.rhino.Node node7 = node5.getLastChild();
        boolean boolean8 = node5.isOr();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean13 = node12.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile14 = null;
        node12.setStaticSourceFile(staticSourceFile14);
        boolean boolean16 = node12.isSwitch();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean21 = node20.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile22 = null;
        node20.setStaticSourceFile(staticSourceFile22);
        boolean boolean24 = node20.isSwitch();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj30 = node28.getProp((int) (short) -1);
        int int31 = node28.getChangeTime();
        java.lang.String str32 = node28.getSourceFileName();
        com.google.javascript.rhino.Node[] nodeArray33 = new com.google.javascript.rhino.Node[] { node5, node12, node20, node28 };
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) ' ', nodeArray33, (int) '#', 4);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean42 = node41.isLabelName();
        com.google.javascript.rhino.Node node43 = node41.getLastChild();
        boolean boolean44 = node41.isOr();
        boolean boolean45 = node41.isThis();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj51 = node49.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj57 = node55.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node58 = node49.clonePropsFrom(node55);
        boolean boolean59 = node58.isNull();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj65 = node63.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(10, node41, node58, node63, (int) 'a', 54);
        com.google.javascript.rhino.Node node69 = node36.useSourceInfoIfMissingFromForTree(node58);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean74 = node73.isLabelName();
        com.google.javascript.rhino.Node node75 = node73.getLastChild();
        boolean boolean76 = node73.isOr();
        boolean boolean77 = node36.isEquivalentToTyped(node73);
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj83 = node81.getProp((int) (short) -1);
        boolean boolean84 = node81.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable85 = node81.siblings();
        boolean boolean86 = node81.isFromExterns();
        com.google.javascript.rhino.Node node87 = node81.cloneTree();
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node((int) (byte) 0, node36, node87);
        boolean boolean89 = node88.isNull();
        boolean boolean91 = node88.getBooleanProp(4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(nodeArray33);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(nodeIterable85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean10 = node9.isLabelName();
        com.google.javascript.rhino.Node node11 = node9.getLastChild();
        boolean boolean12 = node3.hasChild(node9);
        boolean boolean13 = node3.hasChildren();
        int int14 = node3.getChildCount();
        java.lang.String str15 = node3.toStringTree();
        boolean boolean16 = node3.isCase();
        boolean boolean17 = node3.isQuotedString();
        com.google.javascript.rhino.InputId inputId18 = node3.getInputId();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "BITXOR\n" + "'", str15, "BITXOR\n");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(inputId18);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = sideEffectFlags0.setMutatesArguments();
        int int2 = sideEffectFlags0.valueOf();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags3 = sideEffectFlags0.setReturnsTainted();
        int int4 = sideEffectFlags0.valueOf();
        int int5 = sideEffectFlags0.valueOf();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags6 = sideEffectFlags0.setMutatesGlobalState();
        org.junit.Assert.assertNotNull(sideEffectFlags1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sideEffectFlags3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(sideEffectFlags6);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node3.isNew();
        com.google.javascript.rhino.Node node14 = node3.removeChildren();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (byte) 10, 54, 31);
        boolean boolean19 = node18.isDec();
        com.google.javascript.rhino.Node node20 = node3.copyInformationFrom(node18);
        boolean boolean21 = node18.isWith();
        boolean boolean22 = node18.hasChildren();
        node18.setOptionalArg(true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = sideEffectFlags0.setMutatesArguments();
        int int2 = sideEffectFlags0.valueOf();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags3 = sideEffectFlags0.setReturnsTainted();
        int int4 = sideEffectFlags0.valueOf();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags5 = sideEffectFlags0.setThrows();
        org.junit.Assert.assertNotNull(sideEffectFlags1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(sideEffectFlags3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(sideEffectFlags5);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean5 = node4.isLabelName();
        com.google.javascript.rhino.Node node6 = node4.getLastChild();
        boolean boolean7 = node4.isOr();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean12 = node11.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = null;
        node11.setStaticSourceFile(staticSourceFile13);
        boolean boolean15 = node11.isSwitch();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean20 = node19.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile21 = null;
        node19.setStaticSourceFile(staticSourceFile21);
        boolean boolean23 = node19.isSwitch();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj29 = node27.getProp((int) (short) -1);
        int int30 = node27.getChangeTime();
        java.lang.String str31 = node27.getSourceFileName();
        com.google.javascript.rhino.Node[] nodeArray32 = new com.google.javascript.rhino.Node[] { node4, node11, node19, node27 };
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) ' ', nodeArray32, (int) '#', 4);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean41 = node40.isLabelName();
        com.google.javascript.rhino.Node node42 = node40.getLastChild();
        boolean boolean43 = node40.isOr();
        boolean boolean44 = node40.isThis();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj50 = node48.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj56 = node54.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node57 = node48.clonePropsFrom(node54);
        boolean boolean58 = node57.isNull();
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj64 = node62.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node(10, node40, node57, node62, (int) 'a', 54);
        com.google.javascript.rhino.Node node68 = node35.useSourceInfoIfMissingFromForTree(node57);
        com.google.javascript.rhino.Node node69 = node57.detachFromParent();
        boolean boolean70 = node57.isString();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node71 = node57.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(nodeArray32);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node3.isNew();
        boolean boolean14 = node3.isNew();
        int int15 = node3.getType();
        boolean boolean16 = node3.mayMutateArguments();
        node3.setLength(2);
        boolean boolean19 = node3.isFalse();
        java.lang.String[] strArray24 = new java.lang.String[] { "BITXOR [change_time: 31]", "hi!", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        node3.setDirectives((java.util.Set<java.lang.String>) strSet25);
        boolean boolean28 = node3.isFor();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "BITXOR [change_time: 31]", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node3.isNew();
        boolean boolean14 = node3.isNew();
        int int15 = node3.getType();
        boolean boolean16 = node3.mayMutateArguments();
        boolean boolean17 = node3.isBlock();
        int int19 = node3.getIntProp((int) (byte) 1);
        boolean boolean20 = node3.isReturn();
        boolean boolean21 = node3.isAssignAdd();
        node3.putIntProp(55, 2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node12.isNull();
        boolean boolean14 = node12.isName();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj21 = node19.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj27 = node25.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node28 = node19.clonePropsFrom(node25);
        boolean boolean29 = node25.isEmpty();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable30 = node25.siblings();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj36 = node34.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean41 = node40.isLabelName();
        com.google.javascript.rhino.Node node42 = node40.getLastChild();
        boolean boolean43 = node34.hasChild(node40);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean48 = node47.isLabelName();
        int int49 = node47.getCharno();
        boolean boolean50 = node47.isOr();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj56 = node54.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj62 = node60.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node63 = node54.clonePropsFrom(node60);
        boolean boolean64 = node54.isNew();
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node(8, node25, node40, node47, node54, 1, 100);
        boolean boolean68 = node67.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node69 = node12.copyInformationFrom(node67);
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newString((int) '#', "", (int) (short) 0, 57);
        node12.addChildToFront(node74);
        node74.setSourceEncodedPositionForTree((int) (short) -1);
        boolean boolean78 = node74.isScript();
        boolean boolean79 = node74.isIn();
        com.google.javascript.rhino.Node node80 = node74.getNext();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(nodeIterable30);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(node80);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node12.isUnscopedQualifiedName();
        boolean boolean14 = node12.isRegExp();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isOr();
        boolean boolean7 = node3.hasOneChild();
        node3.setChangeTime(31);
        boolean boolean10 = node3.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj16 = node14.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean21 = node20.isLabelName();
        com.google.javascript.rhino.Node node22 = node20.getLastChild();
        boolean boolean23 = node14.hasChild(node20);
        boolean boolean24 = node14.hasChildren();
        com.google.javascript.rhino.Node node25 = node3.useSourceInfoFromForTree(node14);
        java.lang.String str26 = node3.toString();
        boolean boolean27 = node3.isTypeOf();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj33 = node31.getProp((int) (short) -1);
        boolean boolean34 = node31.isWith();
        boolean boolean35 = node31.isDec();
        boolean boolean36 = node31.isLabel();
        boolean boolean37 = node31.isThis();
        com.google.javascript.rhino.Node node38 = node3.copyInformationFromForTree(node31);
        node38.setSourceFileForTesting("Node tree inequality:\nTree1:\nBITXOR\n\n\nTree2:\nREGEXP hi! 39\n\n\nSubtree1: BITXOR\n\n\nSubtree2: REGEXP hi! 39\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "BITXOR [change_time: 31]" + "'", str26, "BITXOR [change_time: 31]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean10 = node9.isLabelName();
        com.google.javascript.rhino.Node node11 = node9.getLastChild();
        boolean boolean12 = node3.hasChild(node9);
        boolean boolean13 = node3.hasChildren();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj19 = node17.getProp((int) (short) -1);
        boolean boolean20 = node17.isWith();
        com.google.javascript.rhino.Node node21 = node17.removeFirstChild();
        com.google.javascript.rhino.Node node22 = node3.srcref(node17);
        boolean boolean23 = node22.isExprResult();
        int int24 = node22.getSourceOffset();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean5 = node4.isLabelName();
        com.google.javascript.rhino.Node node6 = node4.getLastChild();
        boolean boolean7 = node4.isOr();
        boolean boolean8 = node4.isThis();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj14 = node12.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj20 = node18.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node21 = node12.clonePropsFrom(node18);
        boolean boolean22 = node21.isNull();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj28 = node26.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(10, node4, node21, node26, (int) 'a', 54);
        boolean boolean32 = node21.isExprResult();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj38 = node36.getProp((int) (short) -1);
        int int39 = node36.getSideEffectFlags();
        boolean boolean40 = node36.isLocalResultCall();
        boolean boolean41 = node21.hasChild(node36);
        boolean boolean42 = node21.isAssign();
        boolean boolean43 = node21.isFalse();
        boolean boolean44 = node21.isDefaultCase();
        boolean boolean45 = node21.isTrue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(15, "BITXOR 0", (int) ' ', 16);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean11 = node10.isLabelName();
        com.google.javascript.rhino.Node node12 = node10.getLastChild();
        boolean boolean13 = node10.isOr();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean18 = node17.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile19 = null;
        node17.setStaticSourceFile(staticSourceFile19);
        boolean boolean21 = node17.isSwitch();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean26 = node25.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile27 = null;
        node25.setStaticSourceFile(staticSourceFile27);
        boolean boolean29 = node25.isSwitch();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj35 = node33.getProp((int) (short) -1);
        int int36 = node33.getChangeTime();
        java.lang.String str37 = node33.getSourceFileName();
        com.google.javascript.rhino.Node[] nodeArray38 = new com.google.javascript.rhino.Node[] { node10, node17, node25, node33 };
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) ' ', nodeArray38, (int) '#', 4);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean47 = node46.isLabelName();
        com.google.javascript.rhino.Node node48 = node46.getLastChild();
        boolean boolean49 = node46.isOr();
        boolean boolean50 = node46.isThis();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj56 = node54.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj62 = node60.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node63 = node54.clonePropsFrom(node60);
        boolean boolean64 = node63.isNull();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj70 = node68.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node(10, node46, node63, node68, (int) 'a', 54);
        com.google.javascript.rhino.Node node74 = node41.useSourceInfoIfMissingFromForTree(node63);
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean79 = node78.isLabelName();
        com.google.javascript.rhino.Node node80 = node78.getLastChild();
        boolean boolean81 = node78.isOr();
        boolean boolean82 = node41.isEquivalentToTyped(node78);
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj88 = node86.getProp((int) (short) -1);
        int int89 = node86.getChangeTime();
        java.lang.String str90 = node86.getSourceFileName();
        java.lang.Object obj92 = node86.getProp((int) (short) 100);
        boolean boolean93 = node86.hasOneChild();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable94 = node86.getAncestors();
        com.google.javascript.rhino.Node node95 = new com.google.javascript.rhino.Node((int) (short) 10, node41, node86);
        com.google.javascript.rhino.Node node96 = node4.useSourceInfoFromForTree(node95);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(nodeArray38);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(node80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNull(str90);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(ancestorIterable94);
        org.junit.Assert.assertNotNull(node96);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (byte) 0);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj7 = node5.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj13 = node11.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node14 = node5.clonePropsFrom(node11);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder15 = node5.getJsDocBuilderForNode();
        boolean boolean16 = node5.isLabelName();
        boolean boolean17 = node5.isGetElem();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable18 = node5.getAncestors();
        boolean boolean19 = node5.isFalse();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean25 = node24.isLabelName();
        com.google.javascript.rhino.Node node26 = node24.getLastChild();
        boolean boolean27 = node24.isOr();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean32 = node31.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile33 = null;
        node31.setStaticSourceFile(staticSourceFile33);
        boolean boolean35 = node31.isSwitch();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean40 = node39.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile41 = null;
        node39.setStaticSourceFile(staticSourceFile41);
        boolean boolean43 = node39.isSwitch();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj49 = node47.getProp((int) (short) -1);
        int int50 = node47.getChangeTime();
        java.lang.String str51 = node47.getSourceFileName();
        com.google.javascript.rhino.Node[] nodeArray52 = new com.google.javascript.rhino.Node[] { node24, node31, node39, node47 };
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) ' ', nodeArray52, (int) '#', 4);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean61 = node60.isLabelName();
        com.google.javascript.rhino.Node node62 = node60.getLastChild();
        boolean boolean63 = node60.isOr();
        boolean boolean64 = node60.isThis();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj70 = node68.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj76 = node74.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node77 = node68.clonePropsFrom(node74);
        boolean boolean78 = node77.isNull();
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj84 = node82.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node87 = new com.google.javascript.rhino.Node(10, node60, node77, node82, (int) 'a', 54);
        com.google.javascript.rhino.Node node88 = node55.useSourceInfoIfMissingFromForTree(node77);
        com.google.javascript.rhino.Node node89 = node77.detachFromParent();
        com.google.javascript.rhino.Node node90 = node5.useSourceInfoIfMissingFrom(node89);
        node89.detachChildren();
        boolean boolean92 = node89.mayMutateArguments();
        // The following exception was thrown during execution in test generation
        try {
            node1.removeChild(node89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(ancestorIterable18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(nodeArray52);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        int int5 = node3.getCharno();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("hi!", 39, 31);
        boolean boolean11 = node10.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj17 = node15.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj23 = node21.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node24 = node15.clonePropsFrom(node21);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder25 = node15.getJsDocBuilderForNode();
        boolean boolean26 = node15.isLabelName();
        boolean boolean27 = node15.isGetElem();
        boolean boolean28 = node15.isNew();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) '#', node10, node15, 4, (int) (short) 100);
        node3.addChildrenToBack(node31);
        boolean boolean33 = node3.isComma();
        boolean boolean34 = node3.hasOneChild();
        boolean boolean35 = node3.isTry();
        boolean boolean36 = node3.isLocalResultCall();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 15);
        boolean boolean4 = node3.isCast();
        boolean boolean5 = node3.isThis();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(29);
        com.google.javascript.rhino.Node node9 = node8.getFirstChild();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj16 = node14.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj22 = node20.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node23 = node14.clonePropsFrom(node20);
        boolean boolean24 = node14.isNew();
        com.google.javascript.rhino.Node node25 = node14.removeChildren();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj31 = node29.getProp((int) (short) -1);
        boolean boolean32 = node29.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable33 = node29.siblings();
        boolean boolean34 = node29.isFromExterns();
        int int35 = node29.getLineno();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj41 = node39.getProp((int) (short) -1);
        boolean boolean42 = node39.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable43 = node39.siblings();
        boolean boolean44 = node39.isFromExterns();
        boolean boolean45 = node39.isNew();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(43, node14, node29, node39);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(15, node8, node46, (int) 'a', 49);
        boolean boolean50 = node3.isEquivalentToTyped(node8);
        boolean boolean51 = node8.isVar();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(nodeIterable33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(nodeIterable43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        boolean boolean6 = node3.isWith();
        boolean boolean7 = node3.isDec();
        boolean boolean8 = node3.isQualifiedName();
        boolean boolean9 = node3.isBreak();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(0.0d, (int) (byte) 0, (int) '4');
        com.google.javascript.rhino.Node node14 = node3.clonePropsFrom(node13);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = node3.getExistingIntProp((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("NAME", 37, 10);
        node3.setLineno((int) (short) 10);
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean10 = node9.isLabelName();
        com.google.javascript.rhino.Node node11 = node9.getLastChild();
        boolean boolean12 = node3.hasChild(node9);
        boolean boolean13 = node3.hasChildren();
        java.lang.String str14 = node3.toStringTree();
        boolean boolean15 = node3.isLabel();
        com.google.javascript.rhino.Node node16 = node3.getLastChild();
        boolean boolean17 = node3.isDebugger();
        boolean boolean18 = node3.isGetElem();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj24 = node22.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj30 = node28.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node31 = node22.clonePropsFrom(node28);
        boolean boolean32 = node22.isNew();
        boolean boolean33 = node22.isNew();
        boolean boolean34 = node22.isThis();
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = null;
        com.google.javascript.rhino.Node node36 = node22.setJSDocInfo(jSDocInfo35);
        boolean boolean37 = node22.isStringKey();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj43 = node41.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj49 = node47.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node50 = node41.clonePropsFrom(node47);
        boolean boolean51 = node41.isNew();
        boolean boolean52 = node41.isNew();
        int int53 = node41.getType();
        boolean boolean54 = node41.mayMutateArguments();
        node41.setLength(2);
        boolean boolean57 = node22.hasChild(node41);
        com.google.javascript.rhino.Node node58 = node3.copyInformationFrom(node41);
        node58.setSourceFileForTesting("Node tree inequality:\nTree1:\nLE 97\n    NEG\n    FALSE\n        BITXOR\n        BITXOR\n        BITXOR\n\n\nTree2:\nBITXOR\n\n\nSubtree1: LE 97\n    NEG\n    FALSE\n        BITXOR\n        BITXOR\n        BITXOR\n\n\nSubtree2: BITXOR\n");
        boolean boolean61 = node58.isArrayLit();
        boolean boolean62 = node58.isLabelName();
        boolean boolean63 = node58.isAssign();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "BITXOR\n" + "'", str14, "BITXOR\n");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 1, 10, (int) (short) 1);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj6 = node4.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj12 = node10.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node13 = node4.clonePropsFrom(node10);
        boolean boolean14 = node4.isNew();
        com.google.javascript.rhino.Node node15 = node4.removeChildren();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj21 = node19.getProp((int) (short) -1);
        boolean boolean22 = node19.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node19.siblings();
        boolean boolean24 = node19.isFromExterns();
        int int25 = node19.getLineno();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj31 = node29.getProp((int) (short) -1);
        boolean boolean32 = node29.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable33 = node29.siblings();
        boolean boolean34 = node29.isFromExterns();
        boolean boolean35 = node29.isNew();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(43, node4, node19, node29);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj42 = node40.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj48 = node46.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node49 = node40.clonePropsFrom(node46);
        boolean boolean50 = node40.isNew();
        boolean boolean51 = node40.isNew();
        int int52 = node40.getType();
        boolean boolean53 = node40.mayMutateArguments();
        node40.setLength(2);
        boolean boolean56 = node40.isFalse();
        java.lang.String[] strArray61 = new java.lang.String[] { "BITXOR [change_time: 31]", "hi!", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet62 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet62, strArray61);
        node40.setDirectives((java.util.Set<java.lang.String>) strSet62);
        node29.setDirectives((java.util.Set<java.lang.String>) strSet62);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean70 = node69.isLabelName();
        com.google.javascript.rhino.Node node71 = node69.getLastChild();
        boolean boolean72 = node69.isOr();
        boolean boolean73 = node69.isThis();
        boolean boolean74 = node69.isDebugger();
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean79 = node78.isLabelName();
        com.google.javascript.rhino.Node node80 = node78.getLastChild();
        boolean boolean81 = node78.isOr();
        boolean boolean82 = node78.isThis();
        boolean boolean83 = node78.isDebugger();
        boolean boolean84 = node78.isGetProp();
        boolean boolean85 = node78.isDefaultCase();
        boolean boolean86 = node78.isNE();
        int int87 = node69.getIndexOfChild(node78);
        boolean boolean88 = node69.mayMutateArguments();
        com.google.javascript.rhino.Node node89 = node29.useSourceInfoIfMissingFromForTree(node69);
        com.google.javascript.rhino.Node node91 = com.google.javascript.rhino.Node.newNumber((double) 53);
        boolean boolean92 = node91.isDec();
        boolean boolean93 = node89.isEquivalentToTyped(node91);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(nodeIterable33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "BITXOR [change_time: 31]", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(node80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isOr();
        boolean boolean7 = node3.hasOneChild();
        node3.setChangeTime(31);
        java.lang.String str10 = node3.getQualifiedName();
        boolean boolean11 = node3.isLabelName();
        com.google.javascript.rhino.Node node12 = node3.cloneTree();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean17 = node16.isLabelName();
        com.google.javascript.rhino.Node node18 = node16.getLastChild();
        boolean boolean19 = node16.isOr();
        boolean boolean20 = node16.isThis();
        boolean boolean21 = node16.isDebugger();
        node16.setOptionalArg(true);
        boolean boolean24 = node16.isOptionalArg();
        boolean boolean25 = node16.isFunction();
        java.lang.Object obj27 = node16.getProp(43);
        com.google.javascript.rhino.Node node28 = node12.useSourceInfoIfMissingFrom(node16);
        com.google.javascript.rhino.Node node29 = node16.getLastChild();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isOr();
        boolean boolean7 = node3.isThis();
        java.lang.Object obj9 = node3.getProp(0);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean14 = node13.isLabelName();
        com.google.javascript.rhino.Node node15 = node13.getLastChild();
        boolean boolean16 = node13.isOr();
        boolean boolean17 = node13.isThis();
        java.lang.Object obj19 = node13.getProp(0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node13.siblings();
        com.google.javascript.rhino.Node node21 = node13.removeFirstChild();
        com.google.javascript.rhino.InputId inputId22 = null;
        node13.setInputId(inputId22);
        node13.setCharno((int) '4');
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFromForTree(node13);
        int int27 = node3.getLineno();
        boolean boolean28 = node3.isDelProp();
        int int29 = node3.getLength();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj6 = node4.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean11 = node10.isLabelName();
        com.google.javascript.rhino.Node node12 = node10.getLastChild();
        boolean boolean13 = node4.hasChild(node10);
        boolean boolean14 = node4.hasChildren();
        boolean boolean15 = node4.wasEmptyNode();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj21 = node19.getProp((int) (short) -1);
        int int22 = node19.getSideEffectFlags();
        boolean boolean23 = node19.isLocalResultCall();
        boolean boolean24 = node19.isIn();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean29 = node28.isLabelName();
        com.google.javascript.rhino.Node node30 = node28.getLastChild();
        boolean boolean31 = node28.isOr();
        boolean boolean32 = node28.hasOneChild();
        node28.setChangeTime(31);
        boolean boolean35 = node28.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj41 = node39.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean46 = node45.isLabelName();
        com.google.javascript.rhino.Node node47 = node45.getLastChild();
        boolean boolean48 = node39.hasChild(node45);
        boolean boolean49 = node39.hasChildren();
        com.google.javascript.rhino.Node node50 = node28.useSourceInfoFromForTree(node39);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile51 = null;
        node39.setStaticSourceFile(staticSourceFile51);
        com.google.javascript.rhino.Node node53 = node19.clonePropsFrom(node39);
        boolean boolean54 = node53.isExprResult();
        boolean boolean55 = node53.mayMutateGlobalStateOrThrow();
        boolean boolean56 = node53.isCatch();
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(2, node4, node53);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(53);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj7 = node5.getProp((int) (short) -1);
        boolean boolean8 = node5.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node5.siblings();
        boolean boolean10 = node5.isFromExterns();
        boolean boolean11 = node5.isAssignAdd();
        com.google.javascript.rhino.Node node12 = node1.srcref(node5);
        boolean boolean13 = node12.isBreak();
        boolean boolean14 = node12.mayMutateArguments();
        boolean boolean15 = node12.isGetProp();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        int int5 = node3.getCharno();
        int int6 = node3.getLength();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj12 = node10.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj18 = node16.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node19 = node10.clonePropsFrom(node16);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj25 = node23.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj31 = node29.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node32 = node23.clonePropsFrom(node29);
        com.google.javascript.rhino.Node node33 = node16.clonePropsFrom(node23);
        boolean boolean34 = node33.isThrow();
        boolean boolean35 = node33.isComma();
        boolean boolean36 = node33.isOnlyModifiesThisCall();
        boolean boolean37 = node33.isAdd();
        boolean boolean38 = node33.isStringKey();
        com.google.javascript.rhino.Node node39 = node3.copyInformationFrom(node33);
        boolean boolean40 = node33.isIf();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(48, "Node tree inequality:\nTree1:\nBITXOR\n\n\nTree2:\nNUMBER hi!\n\n\nSubtree1: BITXOR\n\n\nSubtree2: NUMBER hi!\n", 29, (int) ' ');
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("BITXOR [change_time: 31]");
        com.google.javascript.rhino.Node node3 = node2.getParent();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj9 = node7.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj15 = node13.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node16 = node7.clonePropsFrom(node13);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj22 = node20.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj28 = node26.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node29 = node20.clonePropsFrom(node26);
        com.google.javascript.rhino.Node node30 = node13.clonePropsFrom(node20);
        boolean boolean31 = node30.isThrow();
        boolean boolean32 = node30.isComma();
        boolean boolean33 = node30.isInc();
        node2.addChildrenToFront(node30);
        node30.setChangeTime(40);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj42 = node40.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj48 = node46.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node49 = node40.clonePropsFrom(node46);
        boolean boolean50 = node40.isNew();
        boolean boolean51 = node40.isNew();
        int int52 = node40.getType();
        boolean boolean53 = node40.mayMutateArguments();
        node40.setLength(2);
        com.google.javascript.rhino.Node node56 = node40.cloneNode();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean62 = node61.isLabelName();
        com.google.javascript.rhino.Node node63 = node61.getLastChild();
        boolean boolean64 = node61.isOr();
        boolean boolean65 = node61.isThis();
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj71 = node69.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj77 = node75.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node78 = node69.clonePropsFrom(node75);
        boolean boolean79 = node78.isNull();
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj85 = node83.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node(10, node61, node78, node83, (int) 'a', 54);
        node88.setSourceEncodedPositionForTree(4);
        com.google.javascript.rhino.Node node91 = node40.srcrefTree(node88);
        com.google.javascript.rhino.JSDocInfo jSDocInfo92 = node88.getJSDocInfo();
        node30.addChildToBack(node88);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node96 = new com.google.javascript.rhino.Node((int) 'a', node30, 42, 4095);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertNull(jSDocInfo92);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        int int5 = node3.getCharno();
        boolean boolean6 = node3.isBlock();
        com.google.javascript.rhino.Node node7 = node3.removeChildren();
        boolean boolean8 = node3.isTry();
        boolean boolean9 = node3.isCast();
        boolean boolean10 = node3.isCase();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable11 = node3.getAncestors();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator12 = ancestorIterable11.spliterator();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(ancestorIterable11);
        org.junit.Assert.assertNotNull(nodeSpliterator12);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean5 = node4.isLabelName();
        com.google.javascript.rhino.Node node6 = node4.getLastChild();
        boolean boolean7 = node4.isOr();
        boolean boolean8 = node4.isThis();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj14 = node12.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj20 = node18.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node21 = node12.clonePropsFrom(node18);
        boolean boolean22 = node21.isNull();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj28 = node26.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(10, node4, node21, node26, (int) 'a', 54);
        boolean boolean32 = node31.isLocalResultCall();
        node31.setLineno(31);
        boolean boolean35 = node31.isWhile();
        java.lang.String str36 = node31.toStringTree();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "BITXOR 31\n    BITXOR\n    BITXOR\n    BITXOR\n" + "'", str36, "BITXOR 31\n    BITXOR\n    BITXOR\n    BITXOR\n");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj6 = node4.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj12 = node10.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node13 = node4.clonePropsFrom(node10);
        boolean boolean14 = node10.isEmpty();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node10.siblings();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj21 = node19.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean26 = node25.isLabelName();
        com.google.javascript.rhino.Node node27 = node25.getLastChild();
        boolean boolean28 = node19.hasChild(node25);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean33 = node32.isLabelName();
        int int34 = node32.getCharno();
        boolean boolean35 = node32.isOr();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj41 = node39.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj47 = node45.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node48 = node39.clonePropsFrom(node45);
        boolean boolean49 = node39.isNew();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(8, node10, node25, node32, node39, 1, 100);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean57 = node56.isLabelName();
        int int58 = node56.getCharno();
        boolean boolean59 = node56.isBlock();
        boolean boolean60 = node56.isBreak();
        com.google.javascript.rhino.Node node61 = node52.srcref(node56);
        boolean boolean62 = node61.hasOneChild();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = sideEffectFlags0.setReturnsTainted();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags2 = sideEffectFlags1.setMutatesThis();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags3 = sideEffectFlags2.setMutatesArguments();
        int int4 = sideEffectFlags2.valueOf();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags5 = sideEffectFlags2.setReturnsTainted();
        boolean boolean6 = sideEffectFlags5.areAllFlagsSet();
        boolean boolean7 = sideEffectFlags5.areAllFlagsSet();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags8 = sideEffectFlags5.setMutatesGlobalState();
        org.junit.Assert.assertNotNull(sideEffectFlags1);
        org.junit.Assert.assertNotNull(sideEffectFlags2);
        org.junit.Assert.assertNotNull(sideEffectFlags3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(sideEffectFlags5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(sideEffectFlags8);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) 1);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean7 = node6.isLabelName();
        com.google.javascript.rhino.Node node8 = node6.getLastChild();
        boolean boolean9 = node6.isOr();
        boolean boolean10 = node6.hasOneChild();
        node6.setChangeTime(31);
        boolean boolean13 = node6.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj19 = node17.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean24 = node23.isLabelName();
        com.google.javascript.rhino.Node node25 = node23.getLastChild();
        boolean boolean26 = node17.hasChild(node23);
        boolean boolean27 = node17.hasChildren();
        com.google.javascript.rhino.Node node28 = node6.useSourceInfoFromForTree(node17);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile29 = null;
        node17.setStaticSourceFile(staticSourceFile29);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj36 = node34.getProp((int) (short) -1);
        int int37 = node34.getSideEffectFlags();
        boolean boolean38 = node34.hasMoreThanOneChild();
        node17.addChildrenToBack(node34);
        boolean boolean40 = node17.isParamList();
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean45 = node44.isLabelName();
        com.google.javascript.rhino.Node node46 = node44.getLastChild();
        boolean boolean47 = node44.isOr();
        boolean boolean48 = node44.isThis();
        boolean boolean49 = node44.isDebugger();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean54 = node53.isLabelName();
        com.google.javascript.rhino.Node node55 = node53.getLastChild();
        boolean boolean56 = node53.isOr();
        boolean boolean57 = node53.isThis();
        boolean boolean58 = node53.isDebugger();
        boolean boolean59 = node53.isGetProp();
        boolean boolean60 = node53.isDefaultCase();
        boolean boolean61 = node53.isNE();
        int int62 = node44.getIndexOfChild(node53);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newNumber((double) 1);
        node44.addChildrenToFront(node64);
        com.google.javascript.rhino.Node node66 = node17.srcref(node44);
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj72 = node70.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj78 = node76.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node79 = node70.clonePropsFrom(node76);
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj85 = node83.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node89 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj91 = node89.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node92 = node83.clonePropsFrom(node89);
        com.google.javascript.rhino.Node node93 = node76.clonePropsFrom(node83);
        boolean boolean94 = node76.isTry();
        com.google.javascript.rhino.Node node95 = new com.google.javascript.rhino.Node(15, node2, node44, node76);
        node95.removeProp(37);
        boolean boolean98 = node95.isOr();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertNotNull(node93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 100);
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 30, (int) (byte) -1);
        int int4 = node3.getCharno();
        node3.setSourceEncodedPositionForTree(100);
        int int8 = node3.getIntProp(52);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj6 = node4.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean11 = node10.isLabelName();
        com.google.javascript.rhino.Node node12 = node10.getLastChild();
        boolean boolean13 = node4.hasChild(node10);
        boolean boolean14 = node4.hasChildren();
        int int15 = node4.getChildCount();
        java.lang.String str16 = node4.toStringTree();
        boolean boolean17 = node4.isCase();
        java.lang.Object obj19 = node4.getProp(8);
        boolean boolean20 = node4.isNew();
        boolean boolean21 = node4.isOnlyModifiesArgumentsCall();
        boolean boolean22 = node4.isCase();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(57, "GETELEM 4\n    STRING hi! 39\n    BITXOR\n");
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj31 = node29.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj37 = node35.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node38 = node29.clonePropsFrom(node35);
        boolean boolean39 = node29.isNew();
        boolean boolean40 = node29.isNew();
        int int41 = node29.getType();
        boolean boolean42 = node29.mayMutateArguments();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder43 = node29.getJsDocBuilderForNode();
        boolean boolean44 = node29.isNoSideEffectsCall();
        boolean boolean45 = node29.isGetterDef();
        boolean boolean46 = node29.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean51 = node50.isLabelName();
        com.google.javascript.rhino.Node node52 = node50.getLastChild();
        boolean boolean53 = node50.isOr();
        boolean boolean54 = node50.hasOneChild();
        node50.setChangeTime(31);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(57, node4, node25, node29, node50, 47, 49);
        boolean boolean60 = node25.isEmpty();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "BITXOR\n" + "'", str16, "BITXOR\n");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node3.isNew();
        boolean boolean14 = node3.isNew();
        int int15 = node3.getType();
        boolean boolean16 = node3.mayMutateArguments();
        boolean boolean17 = node3.isBlock();
        int int19 = node3.getIntProp((int) (byte) 1);
        boolean boolean20 = node3.isReturn();
        boolean boolean21 = node3.isAssignAdd();
        java.lang.String str25 = node3.toString(false, true, false);
        boolean boolean26 = node3.isThrow();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 43, 10, (int) (byte) -1);
        boolean boolean32 = node31.isAnd();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean38 = node37.isLabelName();
        com.google.javascript.rhino.Node node39 = node37.getLastChild();
        boolean boolean40 = node37.isOr();
        boolean boolean41 = node37.isThis();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj47 = node45.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj53 = node51.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node54 = node45.clonePropsFrom(node51);
        boolean boolean55 = node54.isNull();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj61 = node59.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(10, node37, node54, node59, (int) 'a', 54);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean69 = node68.isLabelName();
        com.google.javascript.rhino.Node node70 = node68.getLastChild();
        boolean boolean71 = node68.isOr();
        boolean boolean72 = node68.hasOneChild();
        node68.setChangeTime(31);
        boolean boolean75 = node68.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj81 = node79.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean86 = node85.isLabelName();
        com.google.javascript.rhino.Node node87 = node85.getLastChild();
        boolean boolean88 = node79.hasChild(node85);
        boolean boolean89 = node79.hasChildren();
        com.google.javascript.rhino.Node node90 = node68.useSourceInfoFromForTree(node79);
        node79.setChangeTime(16);
        com.google.javascript.rhino.Node node93 = node37.srcrefTree(node79);
        com.google.javascript.rhino.Node node94 = node31.useSourceInfoFrom(node37);
        node3.putProp(4095, (java.lang.Object) node37);
        node3.setCharno(48);
        java.lang.Class<?> wildcardClass98 = node3.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "BITXOR" + "'", str25, "BITXOR");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNull(node87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertNotNull(node93);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 10, 54, 31);
        boolean boolean4 = node3.isAssignAdd();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable5 = node3.children();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        node3.setJSType(jSType6);
        node3.setOptionalArg(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeIterable5);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean5 = node4.isLabelName();
        com.google.javascript.rhino.Node node6 = node4.getLastChild();
        boolean boolean7 = node4.isOr();
        boolean boolean8 = node4.isThis();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj14 = node12.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj20 = node18.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node21 = node12.clonePropsFrom(node18);
        boolean boolean22 = node21.isNull();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj28 = node26.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(10, node4, node21, node26, (int) 'a', 54);
        boolean boolean32 = node21.isExprResult();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj38 = node36.getProp((int) (short) -1);
        int int39 = node36.getSideEffectFlags();
        boolean boolean40 = node36.isLocalResultCall();
        boolean boolean41 = node21.hasChild(node36);
        boolean boolean42 = node21.isAssign();
        int int43 = node21.getSourceOffset();
        java.lang.Object obj45 = node21.getProp(57);
        node21.setLength(32);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean5 = node4.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        node4.setStaticSourceFile(staticSourceFile6);
        boolean boolean8 = node4.isSwitch();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean14 = node13.isLabelName();
        com.google.javascript.rhino.Node node15 = node13.getLastChild();
        boolean boolean16 = node13.isOr();
        boolean boolean17 = node13.isThis();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj23 = node21.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj29 = node27.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node30 = node21.clonePropsFrom(node27);
        boolean boolean31 = node30.isNull();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj37 = node35.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(10, node13, node30, node35, (int) 'a', 54);
        com.google.javascript.rhino.Node node41 = node4.useSourceInfoFromForTree(node40);
        int int42 = node4.getLength();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj49 = node47.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj55 = node53.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node56 = node47.clonePropsFrom(node53);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder57 = node47.getJsDocBuilderForNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = node47.getJSDocInfo();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(50, node47);
        boolean boolean60 = node59.isFunction();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(100, node4, node59);
        boolean boolean62 = node59.isAssignAdd();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder57);
        org.junit.Assert.assertNull(jSDocInfo58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node3.isNew();
        boolean boolean14 = node3.isNew();
        int int15 = node3.getType();
        boolean boolean16 = node3.mayMutateArguments();
        boolean boolean17 = node3.isThis();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj23 = node21.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj29 = node27.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node30 = node21.clonePropsFrom(node27);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj36 = node34.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj42 = node40.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node43 = node34.clonePropsFrom(node40);
        com.google.javascript.rhino.Node node44 = node27.clonePropsFrom(node34);
        boolean boolean45 = node44.isThrow();
        boolean boolean46 = node44.isComma();
        boolean boolean47 = node44.isOnlyModifiesThisCall();
        boolean boolean48 = node44.isAdd();
        boolean boolean50 = node44.getBooleanProp((int) '4');
        boolean boolean51 = node44.isFor();
        boolean boolean52 = node44.isNot();
        com.google.javascript.rhino.Node node53 = node3.srcref(node44);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node53);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj7 = node5.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj13 = node11.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node14 = node5.clonePropsFrom(node11);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj20 = node18.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj26 = node24.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node27 = node18.clonePropsFrom(node24);
        com.google.javascript.rhino.Node node28 = node11.clonePropsFrom(node18);
        com.google.javascript.rhino.Node[] nodeArray29 = new com.google.javascript.rhino.Node[] { node11 };
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (short) 10, nodeArray29, 32, 50);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(100, nodeArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(nodeArray29);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isOr();
        boolean boolean7 = node3.hasOneChild();
        java.lang.Object obj9 = node3.getProp((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean6 = node5.isLabelName();
        com.google.javascript.rhino.Node node7 = node5.getLastChild();
        boolean boolean8 = node5.isOr();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean13 = node12.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile14 = null;
        node12.setStaticSourceFile(staticSourceFile14);
        boolean boolean16 = node12.isSwitch();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean21 = node20.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile22 = null;
        node20.setStaticSourceFile(staticSourceFile22);
        boolean boolean24 = node20.isSwitch();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj30 = node28.getProp((int) (short) -1);
        int int31 = node28.getChangeTime();
        java.lang.String str32 = node28.getSourceFileName();
        com.google.javascript.rhino.Node[] nodeArray33 = new com.google.javascript.rhino.Node[] { node5, node12, node20, node28 };
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) ' ', nodeArray33, (int) '#', 4);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (byte) 10, nodeArray33, 42, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: duplicate child");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(nodeArray33);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("ERROR\n    BITXOR [change_time: 31]\n", (int) (byte) 0, 4);
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.mayMutateArguments();
        boolean boolean5 = node3.isName();
        node3.setIsSyntheticBlock(true);
        int int8 = node3.getType();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj15 = node13.getProp((int) (short) -1);
        int int16 = node13.getSideEffectFlags();
        boolean boolean17 = node13.isLocalResultCall();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable18 = node13.getAncestors();
        boolean boolean19 = node13.isDefaultCase();
        com.google.javascript.rhino.jstype.JSType jSType20 = node13.getJSType();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(4095, node13);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node22 = node3.removeChildAfter(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(ancestorIterable18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(jSType20);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(40, "hi!", (int) (byte) -1, 0);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean9 = node8.isLabelName();
        com.google.javascript.rhino.Node node10 = node8.getLastChild();
        boolean boolean11 = node8.isOr();
        boolean boolean12 = node8.isThis();
        boolean boolean13 = node8.isDebugger();
        node8.setOptionalArg(true);
        java.lang.Object obj17 = node8.getProp(29);
        boolean boolean18 = node8.isScript();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean24 = node23.isLabelName();
        com.google.javascript.rhino.Node node25 = node23.getLastChild();
        boolean boolean26 = node23.isOr();
        boolean boolean27 = node23.isThis();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj33 = node31.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj39 = node37.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node40 = node31.clonePropsFrom(node37);
        boolean boolean41 = node40.isNull();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj47 = node45.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(10, node23, node40, node45, (int) 'a', 54);
        boolean boolean51 = node40.isExprResult();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj57 = node55.getProp((int) (short) -1);
        int int58 = node55.getSideEffectFlags();
        boolean boolean59 = node55.isLocalResultCall();
        boolean boolean60 = node40.hasChild(node55);
        com.google.javascript.rhino.Node node61 = node8.copyInformationFrom(node40);
        com.google.javascript.rhino.Node node62 = node4.copyInformationFromForTree(node61);
        boolean boolean63 = node4.isInstanceOf();
        node4.setOptionalArg(false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder13 = node3.getJsDocBuilderForNode();
        boolean boolean14 = node3.isHook();
        boolean boolean15 = node3.isFunction();
        node3.setType(0);
        com.google.javascript.rhino.jstype.JSType jSType18 = node3.getJSType();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jSType18);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean10 = node9.isLabelName();
        com.google.javascript.rhino.Node node11 = node9.getLastChild();
        boolean boolean12 = node3.hasChild(node9);
        boolean boolean13 = node3.hasChildren();
        int int14 = node3.getChildCount();
        java.lang.String str15 = node3.toStringTree();
        boolean boolean16 = node3.isCase();
        java.lang.Object obj18 = node3.getProp(8);
        boolean boolean19 = node3.isNE();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = null;
        com.google.javascript.rhino.Node node21 = node3.setJSDocInfo(jSDocInfo20);
        boolean boolean22 = node21.isNew();
        boolean boolean23 = node21.isFalse();
        boolean boolean24 = node21.isUnscopedQualifiedName();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "BITXOR\n" + "'", str15, "BITXOR\n");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(38, 23, 12);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        boolean boolean6 = node3.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node3.siblings();
        boolean boolean8 = node3.isLabelName();
        node3.detachChildren();
        boolean boolean10 = node3.isDec();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = node3.getStaticSourceFile();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(staticSourceFile11);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(39, "hi!");
        int int3 = node2.getChildCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = node2.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isOr();
        boolean boolean7 = node3.hasOneChild();
        node3.setChangeTime(31);
        boolean boolean10 = node3.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj16 = node14.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean21 = node20.isLabelName();
        com.google.javascript.rhino.Node node22 = node20.getLastChild();
        boolean boolean23 = node14.hasChild(node20);
        boolean boolean24 = node14.hasChildren();
        com.google.javascript.rhino.Node node25 = node3.useSourceInfoFromForTree(node14);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj31 = node29.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj37 = node35.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node38 = node29.clonePropsFrom(node35);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder39 = node29.getJsDocBuilderForNode();
        boolean boolean40 = node29.isHook();
        node3.addChildToBack(node29);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable42 = node29.getAncestors();
        boolean boolean43 = node29.isTry();
        boolean boolean44 = node29.isLabel();
        boolean boolean45 = node29.isVarArgs();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(ancestorIterable42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.PreprocessorSymbolTable preprocessorSymbolTable1 = null;
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler2 = null;
        com.google.javascript.jscomp.ScopedAliases scopedAliases3 = new com.google.javascript.jscomp.ScopedAliases(abstractCompiler0, preprocessorSymbolTable1, aliasTransformationHandler2);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj9 = node7.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean14 = node13.isLabelName();
        com.google.javascript.rhino.Node node15 = node13.getLastChild();
        boolean boolean16 = node7.hasChild(node13);
        boolean boolean17 = node7.hasChildren();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj23 = node21.getProp((int) (short) -1);
        boolean boolean24 = node21.isWith();
        com.google.javascript.rhino.Node node25 = node21.removeFirstChild();
        com.google.javascript.rhino.Node node26 = node7.srcref(node21);
        boolean boolean27 = node26.isIn();
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            scopedAliases3.hotSwapScript(node26, node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj6 = node4.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj12 = node10.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node13 = node4.clonePropsFrom(node10);
        boolean boolean14 = node10.isEmpty();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node10.siblings();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj21 = node19.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean26 = node25.isLabelName();
        com.google.javascript.rhino.Node node27 = node25.getLastChild();
        boolean boolean28 = node19.hasChild(node25);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean33 = node32.isLabelName();
        int int34 = node32.getCharno();
        boolean boolean35 = node32.isOr();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj41 = node39.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj47 = node45.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node48 = node39.clonePropsFrom(node45);
        boolean boolean49 = node39.isNew();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(8, node10, node25, node32, node39, 1, 100);
        boolean boolean53 = node32.isEmpty();
        node32.addSuppression("Node tree inequality:\nTree1:\nLE 97\n    NEG\n    FALSE\n        BITXOR\n        BITXOR\n        BITXOR\n\n\nTree2:\nBITXOR\n\n\nSubtree1: LE 97\n    NEG\n    FALSE\n        BITXOR\n        BITXOR\n        BITXOR\n\n\nSubtree2: BITXOR\n");
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        node32.setJSType(jSType56);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        int int13 = node9.getSourcePosition();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj19 = node17.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj25 = node23.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node26 = node17.clonePropsFrom(node23);
        boolean boolean27 = node17.isNew();
        com.google.javascript.rhino.Node node28 = node17.removeChildren();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = null;
        com.google.javascript.rhino.Node node30 = node17.setJSDocInfo(jSDocInfo29);
        com.google.javascript.rhino.Node node31 = node9.srcrefTree(node30);
        boolean boolean32 = node31.isName();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean5 = node4.isLabelName();
        com.google.javascript.rhino.Node node6 = node4.getLastChild();
        boolean boolean7 = node4.isOr();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean12 = node11.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = null;
        node11.setStaticSourceFile(staticSourceFile13);
        boolean boolean15 = node11.isSwitch();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean20 = node19.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile21 = null;
        node19.setStaticSourceFile(staticSourceFile21);
        boolean boolean23 = node19.isSwitch();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj29 = node27.getProp((int) (short) -1);
        int int30 = node27.getChangeTime();
        java.lang.String str31 = node27.getSourceFileName();
        com.google.javascript.rhino.Node[] nodeArray32 = new com.google.javascript.rhino.Node[] { node4, node11, node19, node27 };
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) ' ', nodeArray32, (int) '#', 4);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean41 = node40.isLabelName();
        com.google.javascript.rhino.Node node42 = node40.getLastChild();
        boolean boolean43 = node40.isOr();
        boolean boolean44 = node40.isThis();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj50 = node48.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj56 = node54.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node57 = node48.clonePropsFrom(node54);
        boolean boolean58 = node57.isNull();
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj64 = node62.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node(10, node40, node57, node62, (int) 'a', 54);
        com.google.javascript.rhino.Node node68 = node35.useSourceInfoIfMissingFromForTree(node57);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean73 = node72.isLabelName();
        node57.addChildrenToFront(node72);
        boolean boolean75 = node72.mayMutateArguments();
        boolean boolean76 = node72.isSetterDef();
        boolean boolean77 = node72.isGetProp();
        boolean boolean78 = node72.isTry();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(nodeArray32);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node3.isNew();
        boolean boolean14 = node3.isNew();
        int int15 = node3.getType();
        boolean boolean16 = node3.mayMutateArguments();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder17 = node3.getJsDocBuilderForNode();
        boolean boolean18 = node3.isWith();
        com.google.javascript.rhino.Node node20 = node3.getChildAtIndex(0);
        boolean boolean21 = node3.isAssignAdd();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean26 = node25.isLabelName();
        com.google.javascript.rhino.Node node27 = node25.getLastChild();
        boolean boolean28 = node25.isOr();
        boolean boolean29 = node25.isThis();
        boolean boolean30 = node25.isDebugger();
        node25.setOptionalArg(true);
        boolean boolean33 = node25.isOptionalArg();
        boolean boolean34 = node25.hasChildren();
        boolean boolean35 = node25.isBlock();
        int int36 = node25.getSourcePosition();
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean41 = node40.mayMutateArguments();
        com.google.javascript.rhino.Node node42 = node25.copyInformationFrom(node40);
        boolean boolean43 = node42.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node44 = null;
        node3.addChildAfter(node42, node44);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node12.isString();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean18 = node17.isLabelName();
        com.google.javascript.rhino.Node node19 = node17.getLastChild();
        boolean boolean20 = node17.isOr();
        boolean boolean21 = node17.isThis();
        java.lang.Object obj23 = node17.getProp(0);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile24 = null;
        node17.setStaticSourceFile(staticSourceFile24);
        boolean boolean26 = node17.isVoid();
        boolean boolean27 = node12.isEquivalentToTyped(node17);
        boolean boolean28 = node12.isDefaultCase();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj6 = node4.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj12 = node10.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node13 = node4.clonePropsFrom(node10);
        boolean boolean14 = node4.isNew();
        boolean boolean15 = node4.isNew();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean20 = node19.isLabelName();
        com.google.javascript.rhino.Node node21 = node19.getLastChild();
        boolean boolean22 = node19.isDec();
        node19.detachChildren();
        boolean boolean24 = node19.isFromExterns();
        int int25 = node19.getSideEffectFlags();
        com.google.javascript.rhino.Node node26 = node4.srcref(node19);
        node26.setOptionalArg(true);
        boolean boolean29 = node26.isIf();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 0, node26);
        boolean boolean31 = node26.isTrue();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj18 = node16.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj24 = node22.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node25 = node16.clonePropsFrom(node22);
        com.google.javascript.rhino.Node node26 = node9.clonePropsFrom(node16);
        boolean boolean27 = node26.isThrow();
        boolean boolean28 = node26.isComma();
        boolean boolean29 = node26.isGetElem();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean35 = node34.isLabelName();
        com.google.javascript.rhino.Node node36 = node34.getLastChild();
        boolean boolean37 = node34.isOr();
        boolean boolean38 = node34.isThis();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj44 = node42.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj50 = node48.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node51 = node42.clonePropsFrom(node48);
        boolean boolean52 = node51.isNull();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj58 = node56.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(10, node34, node51, node56, (int) 'a', 54);
        boolean boolean62 = node26.isEquivalentToShallow(node56);
        java.lang.String str63 = node26.toStringTree();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "BITXOR\n" + "'", str63, "BITXOR\n");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node12.isNull();
        boolean boolean14 = node12.isName();
        com.google.javascript.rhino.Node node15 = node12.getLastChild();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean5 = node4.isLabelName();
        com.google.javascript.rhino.Node node6 = node4.getLastChild();
        boolean boolean7 = node4.isOr();
        boolean boolean8 = node4.isThis();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj14 = node12.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj20 = node18.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node21 = node12.clonePropsFrom(node18);
        boolean boolean22 = node21.isNull();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj28 = node26.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(10, node4, node21, node26, (int) 'a', 54);
        boolean boolean32 = node21.isExprResult();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj38 = node36.getProp((int) (short) -1);
        int int39 = node36.getSideEffectFlags();
        boolean boolean40 = node36.isLocalResultCall();
        boolean boolean41 = node21.hasChild(node36);
        boolean boolean42 = node36.isLabelName();
        boolean boolean43 = node36.isFromExterns();
        boolean boolean44 = node36.isNE();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node9.isEmpty();
        boolean boolean14 = node9.isComma();
        boolean boolean15 = node9.hasMoreThanOneChild();
        boolean boolean16 = node9.isExprResult();
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = node9.isEquivalentToShallow(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        int int6 = node3.getSideEffectFlags();
        boolean boolean7 = node3.isVoid();
        boolean boolean8 = node3.isNull();
        node3.setIsSyntheticBlock(true);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable11 = node3.getAncestors();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(ancestorIterable11);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean5 = node4.isLabelName();
        com.google.javascript.rhino.Node node6 = node4.getLastChild();
        boolean boolean7 = node4.isOr();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean12 = node11.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = null;
        node11.setStaticSourceFile(staticSourceFile13);
        boolean boolean15 = node11.isSwitch();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean20 = node19.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile21 = null;
        node19.setStaticSourceFile(staticSourceFile21);
        boolean boolean23 = node19.isSwitch();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj29 = node27.getProp((int) (short) -1);
        int int30 = node27.getChangeTime();
        java.lang.String str31 = node27.getSourceFileName();
        com.google.javascript.rhino.Node[] nodeArray32 = new com.google.javascript.rhino.Node[] { node4, node11, node19, node27 };
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) ' ', nodeArray32, (int) '#', 4);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean41 = node40.isLabelName();
        com.google.javascript.rhino.Node node42 = node40.getLastChild();
        boolean boolean43 = node40.isOr();
        boolean boolean44 = node40.isThis();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj50 = node48.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj56 = node54.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node57 = node48.clonePropsFrom(node54);
        boolean boolean58 = node57.isNull();
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj64 = node62.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node(10, node40, node57, node62, (int) 'a', 54);
        com.google.javascript.rhino.Node node68 = node35.useSourceInfoIfMissingFromForTree(node57);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean73 = node72.isLabelName();
        com.google.javascript.rhino.Node node74 = node72.getLastChild();
        boolean boolean75 = node72.isOr();
        boolean boolean76 = node35.isEquivalentToTyped(node72);
        boolean boolean77 = node35.isScript();
        boolean boolean78 = node35.isParamList();
        com.google.javascript.rhino.InputId inputId79 = null;
        node35.setInputId(inputId79);
        boolean boolean81 = node35.isOr();
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj87 = node85.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node88 = node35.srcrefTree(node85);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(nodeArray32);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNotNull(node88);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder13 = node3.getJsDocBuilderForNode();
        boolean boolean14 = node3.isCall();
        boolean boolean16 = node3.getBooleanProp((int) '#');
        boolean boolean17 = node3.isInstanceOf();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node3.isNew();
        boolean boolean14 = node3.isNew();
        int int15 = node3.getType();
        boolean boolean16 = node3.mayMutateArguments();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder17 = node3.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node18 = node3.getNext();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj6 = node4.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj12 = node10.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node13 = node4.clonePropsFrom(node10);
        boolean boolean14 = node4.isNew();
        com.google.javascript.rhino.Node node15 = node4.removeChildren();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = null;
        com.google.javascript.rhino.Node node17 = node4.setJSDocInfo(jSDocInfo16);
        java.util.Set<java.lang.String> strSet18 = node17.getDirectives();
        node17.setVarArgs(false);
        com.google.javascript.rhino.jstype.JSType jSType21 = node17.getJSType();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) 'a', 38, 36);
        com.google.javascript.rhino.Node node26 = node17.srcrefTree(node25);
        int int27 = node25.getSourceOffset();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder28 = node25.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(23, node25);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder28);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean10 = node9.isLabelName();
        com.google.javascript.rhino.Node node11 = node9.getLastChild();
        boolean boolean12 = node3.hasChild(node9);
        boolean boolean13 = node3.hasChildren();
        int int14 = node3.getChildCount();
        java.lang.String str15 = node3.toStringTree();
        boolean boolean16 = node3.isCase();
        java.lang.Object obj18 = node3.getProp(8);
        boolean boolean19 = node3.isNew();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj25 = node23.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj31 = node29.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node32 = node23.clonePropsFrom(node29);
        int int33 = node29.getSourcePosition();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj39 = node37.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj45 = node43.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node46 = node37.clonePropsFrom(node43);
        boolean boolean47 = node37.isNew();
        com.google.javascript.rhino.Node node48 = node37.removeChildren();
        com.google.javascript.rhino.JSDocInfo jSDocInfo49 = null;
        com.google.javascript.rhino.Node node50 = node37.setJSDocInfo(jSDocInfo49);
        com.google.javascript.rhino.Node node51 = node29.srcrefTree(node50);
        com.google.javascript.rhino.Node node52 = node3.useSourceInfoFromForTree(node51);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean57 = node56.isLabelName();
        com.google.javascript.rhino.Node node58 = node56.getLastChild();
        boolean boolean59 = node56.isOr();
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        node56.setJSType(jSType60);
        boolean boolean62 = node56.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node63 = node52.copyInformationFrom(node56);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "BITXOR\n" + "'", str15, "BITXOR\n");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node63);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isOr();
        boolean boolean7 = node3.hasOneChild();
        node3.setChangeTime(31);
        java.lang.String str10 = node3.getQualifiedName();
        boolean boolean11 = node3.isLabelName();
        com.google.javascript.rhino.Node node12 = node3.cloneTree();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean17 = node16.isLabelName();
        com.google.javascript.rhino.Node node18 = node16.getLastChild();
        boolean boolean19 = node16.isOr();
        boolean boolean20 = node16.isThis();
        boolean boolean21 = node16.isDebugger();
        node16.setOptionalArg(true);
        boolean boolean24 = node16.isOptionalArg();
        boolean boolean25 = node16.isFunction();
        java.lang.Object obj27 = node16.getProp(43);
        com.google.javascript.rhino.Node node28 = node12.useSourceInfoIfMissingFrom(node16);
        boolean boolean29 = node12.isDebugger();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isOr();
        boolean boolean7 = node3.hasOneChild();
        node3.setChangeTime(31);
        boolean boolean10 = node3.isOnlyModifiesThisCall();
        node3.setChangeTime(40);
        node3.detachChildren();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean18 = node17.isLabelName();
        com.google.javascript.rhino.Node node19 = node17.getLastChild();
        boolean boolean20 = node17.isDec();
        boolean boolean21 = node17.isFalse();
        com.google.javascript.rhino.InputId inputId22 = null;
        node17.setInputId(inputId22);
        java.lang.String str24 = node3.checkTreeEquals(node17);
        boolean boolean25 = node17.isNumber();
        boolean boolean26 = node17.isDec();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(39, 46, (int) (byte) 1);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 15);
        boolean boolean4 = node3.isAssign();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 4);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj12 = node10.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj18 = node16.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node19 = node10.clonePropsFrom(node16);
        boolean boolean20 = node10.isNew();
        boolean boolean21 = node10.isNew();
        boolean boolean22 = node10.isThis();
        com.google.javascript.rhino.Node node23 = node6.copyInformationFromForTree(node10);
        int int24 = node3.getIndexOfChild(node10);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean10 = node9.isLabelName();
        com.google.javascript.rhino.Node node11 = node9.getLastChild();
        boolean boolean12 = node3.hasChild(node9);
        boolean boolean13 = node3.isBreak();
        com.google.javascript.rhino.Node node14 = node3.cloneNode();
        boolean boolean15 = node3.isDefaultCase();
        boolean boolean16 = node3.isNull();
        node3.setSourceEncodedPosition((int) (byte) 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        int int6 = node3.getChangeTime();
        boolean boolean7 = node3.isNew();
        boolean boolean8 = node3.isNE();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj14 = node12.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj20 = node18.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node21 = node12.clonePropsFrom(node18);
        boolean boolean22 = node12.isNew();
        boolean boolean23 = node12.isNew();
        int int24 = node12.getType();
        com.google.javascript.rhino.Node node25 = node3.useSourceInfoFromForTree(node12);
        node3.removeProp(54);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean5 = node4.isLabelName();
        com.google.javascript.rhino.Node node6 = node4.getLastChild();
        boolean boolean7 = node4.isOr();
        boolean boolean8 = node4.isThis();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj14 = node12.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj20 = node18.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node21 = node12.clonePropsFrom(node18);
        boolean boolean22 = node21.isNull();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj28 = node26.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(10, node4, node21, node26, (int) 'a', 54);
        boolean boolean32 = node4.isUnscopedQualifiedName();
        java.lang.String str33 = node4.getSourceFileName();
        boolean boolean34 = node4.isDefaultCase();
        node4.setLength(43);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        node4.setJSType(jSType37);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean43 = node42.isLabelName();
        boolean boolean44 = node42.isOptionalArg();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj50 = node48.getProp((int) (short) -1);
        boolean boolean51 = node48.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable52 = node48.siblings();
        boolean boolean53 = node48.isLabelName();
        com.google.javascript.rhino.Node node54 = node42.useSourceInfoFrom(node48);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile55 = node48.getStaticSourceFile();
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(53);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj63 = node61.getProp((int) (short) -1);
        boolean boolean64 = node61.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable65 = node61.siblings();
        boolean boolean66 = node61.isFromExterns();
        boolean boolean67 = node61.isAssignAdd();
        com.google.javascript.rhino.Node node68 = node57.srcref(node61);
        int int69 = node48.getIndexOfChild(node61);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node70 = node4.removeChildAfter(node61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(nodeIterable52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNull(staticSourceFile55);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(nodeIterable65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean5 = node4.isLabelName();
        com.google.javascript.rhino.Node node6 = node4.getLastChild();
        boolean boolean7 = node4.isOr();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean12 = node11.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = null;
        node11.setStaticSourceFile(staticSourceFile13);
        boolean boolean15 = node11.isSwitch();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean20 = node19.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile21 = null;
        node19.setStaticSourceFile(staticSourceFile21);
        boolean boolean23 = node19.isSwitch();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj29 = node27.getProp((int) (short) -1);
        int int30 = node27.getChangeTime();
        java.lang.String str31 = node27.getSourceFileName();
        com.google.javascript.rhino.Node[] nodeArray32 = new com.google.javascript.rhino.Node[] { node4, node11, node19, node27 };
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) ' ', nodeArray32, (int) '#', 4);
        boolean boolean36 = node35.isQuotedString();
        java.lang.String str40 = node35.toString(false, true, false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(nodeArray32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "TYPEOF" + "'", str40, "TYPEOF");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        int int6 = node3.getChangeTime();
        boolean boolean7 = node3.isNew();
        boolean boolean8 = node3.isNE();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj14 = node12.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj20 = node18.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node21 = node12.clonePropsFrom(node18);
        boolean boolean22 = node12.isNew();
        boolean boolean23 = node12.isNew();
        int int24 = node12.getType();
        com.google.javascript.rhino.Node node25 = node3.useSourceInfoFromForTree(node12);
        int int26 = node12.getSourcePosition();
        boolean boolean27 = node12.isLabel();
        boolean boolean28 = node12.isQualifiedName();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node3.isNew();
        boolean boolean14 = node3.isNew();
        boolean boolean15 = node3.isThis();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = null;
        com.google.javascript.rhino.Node node17 = node3.setJSDocInfo(jSDocInfo16);
        boolean boolean18 = node3.isStringKey();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj24 = node22.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj30 = node28.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node31 = node22.clonePropsFrom(node28);
        boolean boolean32 = node22.isNew();
        boolean boolean33 = node22.isNew();
        int int34 = node22.getType();
        boolean boolean35 = node22.mayMutateArguments();
        node22.setLength(2);
        boolean boolean38 = node3.hasChild(node22);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("", 0, 15);
        boolean boolean43 = node42.isCast();
        boolean boolean44 = node42.isThis();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(29);
        com.google.javascript.rhino.Node node48 = node47.getFirstChild();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj55 = node53.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj61 = node59.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node62 = node53.clonePropsFrom(node59);
        boolean boolean63 = node53.isNew();
        com.google.javascript.rhino.Node node64 = node53.removeChildren();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj70 = node68.getProp((int) (short) -1);
        boolean boolean71 = node68.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable72 = node68.siblings();
        boolean boolean73 = node68.isFromExterns();
        int int74 = node68.getLineno();
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj80 = node78.getProp((int) (short) -1);
        boolean boolean81 = node78.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable82 = node78.siblings();
        boolean boolean83 = node78.isFromExterns();
        boolean boolean84 = node78.isNew();
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node(43, node53, node68, node78);
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node(15, node47, node85, (int) 'a', 49);
        boolean boolean89 = node42.isEquivalentToTyped(node47);
        com.google.javascript.rhino.Node node90 = node22.copyInformationFromForTree(node42);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(nodeIterable72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(nodeIterable82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(node90);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) ' ');
        boolean boolean2 = node1.isAdd();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj18 = node16.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj24 = node22.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node25 = node16.clonePropsFrom(node22);
        com.google.javascript.rhino.Node node26 = node9.clonePropsFrom(node16);
        int int28 = node26.getIntProp(0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj18 = node16.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj24 = node22.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node25 = node16.clonePropsFrom(node22);
        com.google.javascript.rhino.Node node26 = node9.clonePropsFrom(node16);
        boolean boolean27 = node26.isThrow();
        boolean boolean28 = node26.isComma();
        boolean boolean29 = node26.isScript();
        boolean boolean30 = node26.isNE();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean6 = node5.isLabelName();
        com.google.javascript.rhino.Node node7 = node5.getLastChild();
        boolean boolean8 = node5.isOr();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean13 = node12.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile14 = null;
        node12.setStaticSourceFile(staticSourceFile14);
        boolean boolean16 = node12.isSwitch();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean21 = node20.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile22 = null;
        node20.setStaticSourceFile(staticSourceFile22);
        boolean boolean24 = node20.isSwitch();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj30 = node28.getProp((int) (short) -1);
        int int31 = node28.getChangeTime();
        java.lang.String str32 = node28.getSourceFileName();
        com.google.javascript.rhino.Node[] nodeArray33 = new com.google.javascript.rhino.Node[] { node5, node12, node20, node28 };
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) ' ', nodeArray33, (int) '#', 4);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(32, nodeArray33, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: duplicate child");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(nodeArray33);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 15);
        boolean boolean4 = node3.isCast();
        node3.putBooleanProp(39, true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node8 = node3.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder13 = node3.getJsDocBuilderForNode();
        boolean boolean14 = node3.isHook();
        boolean boolean15 = node3.isArrayLit();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean22 = node21.isLabelName();
        com.google.javascript.rhino.Node node23 = node21.getLastChild();
        boolean boolean24 = node21.isOr();
        boolean boolean25 = node21.isThis();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj31 = node29.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj37 = node35.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node38 = node29.clonePropsFrom(node35);
        boolean boolean39 = node38.isNull();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj45 = node43.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node21, node38, node43, (int) 'a', 54);
        node3.putProp((int) (byte) -1, (java.lang.Object) node21);
        boolean boolean50 = node3.isInc();
        com.google.javascript.rhino.Node node52 = node3.getChildAtIndex(0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(node52);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder13 = node3.getJsDocBuilderForNode();
        boolean boolean14 = node3.isHook();
        boolean boolean15 = node3.isDefaultCase();
        java.lang.String str19 = node3.toString(false, false, false);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder20 = node3.new FileLevelJsDocBuilder();
        int int22 = node3.getIntProp((int) (byte) 10);
        boolean boolean23 = node3.isAssign();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = node3.getExistingIntProp(54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 54");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "BITXOR" + "'", str19, "BITXOR");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean6 = node5.isLabelName();
        com.google.javascript.rhino.Node node7 = node5.getLastChild();
        boolean boolean8 = node5.isOr();
        boolean boolean9 = node5.isThis();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj15 = node13.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj21 = node19.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node22 = node13.clonePropsFrom(node19);
        boolean boolean23 = node22.isNull();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj29 = node27.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(10, node5, node22, node27, (int) 'a', 54);
        boolean boolean33 = node32.isLocalResultCall();
        boolean boolean34 = node32.isQuotedString();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 10, node32, 32, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            node37.setString("Node tree inequality:\nTree1:\nGETELEM 4\n    STRING hi! 39\n    BITXOR\n\n\nTree2:\nBITXOR\n\n\nSubtree1: GETELEM 4\n    STRING hi! 39\n    BITXOR\n\n\nSubtree2: BITXOR\n");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: BITXOR 32 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        boolean boolean6 = node3.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node3.siblings();
        boolean boolean8 = node3.isFromExterns();
        com.google.javascript.rhino.Node node9 = node3.cloneTree();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean14 = node13.isLabelName();
        com.google.javascript.rhino.Node node15 = node13.getLastChild();
        boolean boolean16 = node13.isOr();
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        node13.setJSType(jSType17);
        boolean boolean19 = node9.hasChild(node13);
        boolean boolean20 = node13.isCast();
        boolean boolean21 = node13.hasOneChild();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isOr();
        boolean boolean7 = node3.isThis();
        boolean boolean8 = node3.isDebugger();
        node3.setOptionalArg(true);
        boolean boolean11 = node3.isOptionalArg();
        boolean boolean12 = node3.hasChildren();
        boolean boolean13 = node3.isBlock();
        boolean boolean14 = node3.isCall();
        boolean boolean15 = node3.isUnscopedQualifiedName();
        boolean boolean16 = node3.isOptionalArg();
        boolean boolean17 = node3.isTypeOf();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        int int6 = node3.getSideEffectFlags();
        boolean boolean7 = node3.isVoid();
        boolean boolean8 = node3.isNull();
        node3.setIsSyntheticBlock(true);
        java.lang.String str14 = node3.toString(true, false, false);
        int int15 = node3.getType();
        boolean boolean16 = node3.isStringKey();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "BITXOR" + "'", str14, "BITXOR");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj18 = node16.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj24 = node22.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node25 = node16.clonePropsFrom(node22);
        com.google.javascript.rhino.Node node26 = node9.clonePropsFrom(node16);
        node26.setSourceFileForTesting("BITXOR");
        boolean boolean29 = node26.isParamList();
        boolean boolean30 = node26.isWith();
        boolean boolean31 = node26.mayMutateGlobalStateOrThrow();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags32 = new com.google.javascript.rhino.Node.SideEffectFlags();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags33 = sideEffectFlags32.setMutatesArguments();
        int int34 = sideEffectFlags32.valueOf();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags35 = sideEffectFlags32.setAllFlags();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags36 = sideEffectFlags35.setReturnsTainted();
        int int37 = sideEffectFlags36.valueOf();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags38 = sideEffectFlags36.clearAllFlags();
        // The following exception was thrown during execution in test generation
        try {
            node26.setSideEffectFlags(sideEffectFlags36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got BITXOR");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(sideEffectFlags33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(sideEffectFlags35);
        org.junit.Assert.assertNotNull(sideEffectFlags36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(sideEffectFlags38);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        int int6 = node3.getSideEffectFlags();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj12 = node10.getProp((int) (short) -1);
        int int13 = node10.getSideEffectFlags();
        boolean boolean14 = node10.isVoid();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj20 = node18.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj26 = node24.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node27 = node18.clonePropsFrom(node24);
        boolean boolean28 = node18.isNew();
        boolean boolean29 = node18.isNew();
        int int30 = node18.getType();
        boolean boolean31 = node18.mayMutateArguments();
        boolean boolean32 = node18.isBlock();
        boolean boolean33 = node10.isEquivalentToTyped(node18);
        node10.removeProp(2);
        boolean boolean36 = node3.isEquivalentTo(node10);
        node10.setSourceEncodedPositionForTree(29);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString((int) '#', "", (int) (short) 0, 57);
        com.google.javascript.rhino.Node node44 = node10.useSourceInfoFromForTree(node43);
        com.google.javascript.rhino.Node node46 = node10.getAncestor(4095);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(node46);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 10, 54, 31);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean8 = node7.isLabelName();
        com.google.javascript.rhino.Node node9 = node7.getLastChild();
        boolean boolean10 = node7.isOr();
        boolean boolean11 = node7.isThis();
        boolean boolean12 = node7.isDebugger();
        boolean boolean13 = node7.isGetProp();
        boolean boolean14 = node7.isDefaultCase();
        boolean boolean15 = node7.isNE();
        java.lang.String str16 = node3.checkTreeEquals(node7);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean22 = node21.isLabelName();
        com.google.javascript.rhino.Node node23 = node21.getLastChild();
        boolean boolean24 = node21.isOr();
        boolean boolean25 = node21.isThis();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj31 = node29.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj37 = node35.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node38 = node29.clonePropsFrom(node35);
        boolean boolean39 = node38.isNull();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj45 = node43.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node21, node38, node43, (int) 'a', 54);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean53 = node52.isLabelName();
        com.google.javascript.rhino.Node node54 = node52.getLastChild();
        boolean boolean55 = node52.isOr();
        boolean boolean56 = node52.hasOneChild();
        node52.setChangeTime(31);
        boolean boolean59 = node52.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj65 = node63.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean70 = node69.isLabelName();
        com.google.javascript.rhino.Node node71 = node69.getLastChild();
        boolean boolean72 = node63.hasChild(node69);
        boolean boolean73 = node63.hasChildren();
        com.google.javascript.rhino.Node node74 = node52.useSourceInfoFromForTree(node63);
        node63.setChangeTime(16);
        com.google.javascript.rhino.Node node77 = node21.srcrefTree(node63);
        com.google.javascript.rhino.Node node78 = node3.clonePropsFrom(node77);
        boolean boolean79 = node3.isObjectLit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = null;
        node3.setStaticSourceFile(staticSourceFile5);
        boolean boolean7 = node3.isSwitch();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean13 = node12.isLabelName();
        com.google.javascript.rhino.Node node14 = node12.getLastChild();
        boolean boolean15 = node12.isOr();
        boolean boolean16 = node12.isThis();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj22 = node20.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj28 = node26.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node29 = node20.clonePropsFrom(node26);
        boolean boolean30 = node29.isNull();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj36 = node34.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(10, node12, node29, node34, (int) 'a', 54);
        com.google.javascript.rhino.Node node40 = node3.useSourceInfoFromForTree(node39);
        boolean boolean41 = node39.wasEmptyNode();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean46 = node45.isLabelName();
        com.google.javascript.rhino.Node node47 = node45.getLastChild();
        boolean boolean48 = node45.isDec();
        node45.detachChildren();
        boolean boolean50 = node45.isFromExterns();
        int int51 = node45.getSideEffectFlags();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean56 = node55.isLabelName();
        com.google.javascript.rhino.Node node57 = node55.getLastChild();
        boolean boolean58 = node55.isOr();
        boolean boolean59 = node55.hasOneChild();
        node55.setChangeTime(31);
        boolean boolean62 = node55.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj68 = node66.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean73 = node72.isLabelName();
        com.google.javascript.rhino.Node node74 = node72.getLastChild();
        boolean boolean75 = node66.hasChild(node72);
        boolean boolean76 = node66.hasChildren();
        com.google.javascript.rhino.Node node77 = node55.useSourceInfoFromForTree(node66);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile78 = null;
        node66.setStaticSourceFile(staticSourceFile78);
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj85 = node83.getProp((int) (short) -1);
        int int86 = node83.getSideEffectFlags();
        boolean boolean87 = node83.hasMoreThanOneChild();
        node66.addChildrenToBack(node83);
        boolean boolean89 = node45.hasChild(node83);
        boolean boolean90 = node39.isEquivalentToTyped(node45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str91 = node39.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: BITXOR 97 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean10 = node9.isLabelName();
        com.google.javascript.rhino.Node node11 = node9.getLastChild();
        boolean boolean12 = node3.hasChild(node9);
        boolean boolean13 = node3.isAssignAdd();
        com.google.javascript.rhino.Node node14 = node3.cloneTree();
        boolean boolean15 = node3.isParamList();
        node3.putIntProp(37, 37);
        boolean boolean19 = node3.isExprResult();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        int int5 = node3.getCharno();
        boolean boolean6 = node3.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node7 = node3.getLastSibling();
        node7.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node10 = node7.getLastSibling();
        boolean boolean11 = node7.isContinue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        boolean boolean6 = node3.isWith();
        boolean boolean7 = node3.isHook();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder8 = node3.getJsDocBuilderForNode();
        boolean boolean9 = node3.isBreak();
        java.util.Set<java.lang.String> strSet10 = node3.getDirectives();
        java.lang.String str11 = node3.toString();
        boolean boolean12 = node3.isArrayLit();
        boolean boolean13 = node3.isOnlyModifiesThisCall();
        int int14 = node3.getSourcePosition();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "BITXOR" + "'", str11, "BITXOR");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean5 = node4.isLabelName();
        com.google.javascript.rhino.Node node6 = node4.getLastChild();
        boolean boolean7 = node4.isOr();
        boolean boolean8 = node4.isThis();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj14 = node12.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj20 = node18.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node21 = node12.clonePropsFrom(node18);
        boolean boolean22 = node21.isNull();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj28 = node26.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(10, node4, node21, node26, (int) 'a', 54);
        boolean boolean32 = node21.isExprResult();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj38 = node36.getProp((int) (short) -1);
        int int39 = node36.getSideEffectFlags();
        boolean boolean40 = node36.isLocalResultCall();
        boolean boolean41 = node21.hasChild(node36);
        boolean boolean42 = node21.isAssign();
        boolean boolean43 = node21.isSetterDef();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable44 = node21.children();
        node21.setVarArgs(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(nodeIterable44);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean10 = node9.isLabelName();
        com.google.javascript.rhino.Node node11 = node9.getLastChild();
        boolean boolean12 = node3.hasChild(node9);
        boolean boolean13 = node3.hasChildren();
        boolean boolean14 = node3.wasEmptyNode();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 16, (int) (short) 0, 48);
        java.lang.String str19 = node3.checkTreeEquals(node18);
        com.google.javascript.rhino.InputId inputId20 = null;
        node3.setInputId(inputId20);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Node tree inequality:\nTree1:\nBITXOR\n\n\nTree2:\nNUMBER 16.0 0\n\n\nSubtree1: BITXOR\n\n\nSubtree2: NUMBER 16.0 0\n" + "'", str19, "Node tree inequality:\nTree1:\nBITXOR\n\n\nTree2:\nNUMBER 16.0 0\n\n\nSubtree1: BITXOR\n\n\nSubtree2: NUMBER 16.0 0\n");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(12);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean10 = node9.isLabelName();
        com.google.javascript.rhino.Node node11 = node9.getLastChild();
        boolean boolean12 = node3.hasChild(node9);
        boolean boolean13 = node3.hasChildren();
        int int14 = node3.getChildCount();
        java.lang.String str15 = node3.toStringTree();
        boolean boolean16 = node3.isCase();
        java.lang.Object obj18 = node3.getProp(8);
        boolean boolean19 = node3.isNE();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = null;
        com.google.javascript.rhino.Node node21 = node3.setJSDocInfo(jSDocInfo20);
        boolean boolean22 = node21.isNew();
        boolean boolean23 = node21.isFalse();
        boolean boolean24 = node21.isTypeOf();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "BITXOR\n" + "'", str15, "BITXOR\n");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean6 = node5.isLabelName();
        com.google.javascript.rhino.Node node7 = node5.getLastChild();
        boolean boolean8 = node5.isOr();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean13 = node12.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile14 = null;
        node12.setStaticSourceFile(staticSourceFile14);
        boolean boolean16 = node12.isSwitch();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean21 = node20.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile22 = null;
        node20.setStaticSourceFile(staticSourceFile22);
        boolean boolean24 = node20.isSwitch();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj30 = node28.getProp((int) (short) -1);
        int int31 = node28.getChangeTime();
        java.lang.String str32 = node28.getSourceFileName();
        com.google.javascript.rhino.Node[] nodeArray33 = new com.google.javascript.rhino.Node[] { node5, node12, node20, node28 };
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) ' ', nodeArray33, (int) '#', 4);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean42 = node41.isLabelName();
        com.google.javascript.rhino.Node node43 = node41.getLastChild();
        boolean boolean44 = node41.isOr();
        boolean boolean45 = node41.isThis();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj51 = node49.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj57 = node55.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node58 = node49.clonePropsFrom(node55);
        boolean boolean59 = node58.isNull();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj65 = node63.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(10, node41, node58, node63, (int) 'a', 54);
        com.google.javascript.rhino.Node node69 = node36.useSourceInfoIfMissingFromForTree(node58);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean74 = node73.isLabelName();
        com.google.javascript.rhino.Node node75 = node73.getLastChild();
        boolean boolean76 = node73.isOr();
        boolean boolean77 = node36.isEquivalentToTyped(node73);
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj83 = node81.getProp((int) (short) -1);
        boolean boolean84 = node81.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable85 = node81.siblings();
        boolean boolean86 = node81.isFromExterns();
        com.google.javascript.rhino.Node node87 = node81.cloneTree();
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node((int) (byte) 0, node36, node87);
        boolean boolean89 = node88.isAnd();
        boolean boolean90 = node88.isHook();
        boolean boolean91 = node88.isThis();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str92 = node88.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(nodeArray33);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(nodeIterable85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean5 = node4.isLabelName();
        com.google.javascript.rhino.Node node6 = node4.getLastChild();
        boolean boolean7 = node4.isOr();
        boolean boolean8 = node4.isThis();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj14 = node12.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj20 = node18.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node21 = node12.clonePropsFrom(node18);
        boolean boolean22 = node21.isNull();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj28 = node26.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(10, node4, node21, node26, (int) 'a', 54);
        boolean boolean32 = node21.isExprResult();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj38 = node36.getProp((int) (short) -1);
        int int39 = node36.getSideEffectFlags();
        boolean boolean40 = node36.isLocalResultCall();
        boolean boolean41 = node21.hasChild(node36);
        java.lang.String str42 = node21.toStringTree();
        int int43 = node21.getLineno();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj50 = node48.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj56 = node54.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node57 = node48.clonePropsFrom(node54);
        boolean boolean58 = node54.isEmpty();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable59 = node54.siblings();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj65 = node63.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean70 = node69.isLabelName();
        com.google.javascript.rhino.Node node71 = node69.getLastChild();
        boolean boolean72 = node63.hasChild(node69);
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean77 = node76.isLabelName();
        int int78 = node76.getCharno();
        boolean boolean79 = node76.isOr();
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj85 = node83.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node89 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj91 = node89.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node92 = node83.clonePropsFrom(node89);
        boolean boolean93 = node83.isNew();
        com.google.javascript.rhino.Node node96 = new com.google.javascript.rhino.Node(8, node54, node69, node76, node83, 1, 100);
        int int97 = node69.getSideEffectFlags();
        com.google.javascript.rhino.Node node98 = node21.copyInformationFromForTree(node69);
        boolean boolean99 = node69.isVar();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "BITXOR\n" + "'", str42, "BITXOR\n");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(nodeIterable59);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertNotNull(node98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 10, 54, 31);
        boolean boolean4 = node3.isAssignAdd();
        com.google.javascript.rhino.Node node5 = node3.cloneNode();
        boolean boolean6 = node5.isCase();
        boolean boolean7 = node5.isOnlyModifiesArgumentsCall();
        boolean boolean8 = node5.isDebugger();
        boolean boolean9 = node5.isQuotedString();
        node5.putBooleanProp(51, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 16, (int) (short) 0, 48);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder4 = node3.getJsDocBuilderForNode();
        fileLevelJsDocBuilder4.append("GETELEM 4\n    STRING hi! 39\n    BITXOR\n");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder4);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node12.isNull();
        boolean boolean14 = node12.isName();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj21 = node19.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj27 = node25.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node28 = node19.clonePropsFrom(node25);
        boolean boolean29 = node25.isEmpty();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable30 = node25.siblings();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj36 = node34.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean41 = node40.isLabelName();
        com.google.javascript.rhino.Node node42 = node40.getLastChild();
        boolean boolean43 = node34.hasChild(node40);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean48 = node47.isLabelName();
        int int49 = node47.getCharno();
        boolean boolean50 = node47.isOr();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj56 = node54.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj62 = node60.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node63 = node54.clonePropsFrom(node60);
        boolean boolean64 = node54.isNew();
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node(8, node25, node40, node47, node54, 1, 100);
        boolean boolean68 = node67.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node69 = node12.copyInformationFrom(node67);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj75 = node73.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean80 = node79.isLabelName();
        com.google.javascript.rhino.Node node81 = node79.getLastChild();
        boolean boolean82 = node73.hasChild(node79);
        int int83 = node67.getIndexOfChild(node79);
        int int84 = node67.getChangeTime();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(nodeIterable30);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        boolean boolean5 = node3.isOptionalArg();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        boolean boolean12 = node9.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable13 = node9.siblings();
        boolean boolean14 = node9.isLabelName();
        com.google.javascript.rhino.Node node15 = node3.useSourceInfoFrom(node9);
        node15.setType((int) (byte) 100);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean23 = node22.isLabelName();
        com.google.javascript.rhino.Node node24 = node22.getLastChild();
        boolean boolean25 = node22.isOr();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean30 = node29.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile31 = null;
        node29.setStaticSourceFile(staticSourceFile31);
        boolean boolean33 = node29.isSwitch();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean38 = node37.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile39 = null;
        node37.setStaticSourceFile(staticSourceFile39);
        boolean boolean41 = node37.isSwitch();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj47 = node45.getProp((int) (short) -1);
        int int48 = node45.getChangeTime();
        java.lang.String str49 = node45.getSourceFileName();
        com.google.javascript.rhino.Node[] nodeArray50 = new com.google.javascript.rhino.Node[] { node22, node29, node37, node45 };
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) ' ', nodeArray50, (int) '#', 4);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean59 = node58.isLabelName();
        com.google.javascript.rhino.Node node60 = node58.getLastChild();
        boolean boolean61 = node58.isOr();
        boolean boolean62 = node58.isThis();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj68 = node66.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj74 = node72.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node75 = node66.clonePropsFrom(node72);
        boolean boolean76 = node75.isNull();
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj82 = node80.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node(10, node58, node75, node80, (int) 'a', 54);
        com.google.javascript.rhino.Node node86 = node53.useSourceInfoIfMissingFromForTree(node75);
        com.google.javascript.rhino.Node node90 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean91 = node90.isLabelName();
        node75.addChildrenToFront(node90);
        boolean boolean93 = node90.mayMutateArguments();
        java.lang.String str94 = node15.checkTreeEquals(node90);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(nodeArray50);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "Node tree inequality:\nTree1:\nOR\n\n\nTree2:\nBITXOR\n\n\nSubtree1: OR\n\n\nSubtree2: BITXOR\n" + "'", str94, "Node tree inequality:\nTree1:\nOR\n\n\nTree2:\nBITXOR\n\n\nSubtree1: OR\n\n\nSubtree2: BITXOR\n");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj7 = node5.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj13 = node11.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node14 = node5.clonePropsFrom(node11);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj20 = node18.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj26 = node24.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node27 = node18.clonePropsFrom(node24);
        com.google.javascript.rhino.Node node28 = node11.clonePropsFrom(node18);
        com.google.javascript.rhino.Node[] nodeArray29 = new com.google.javascript.rhino.Node[] { node11 };
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (short) 10, nodeArray29, 32, 50);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(32, nodeArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(nodeArray29);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean5 = node4.isLabelName();
        com.google.javascript.rhino.Node node6 = node4.getLastChild();
        boolean boolean7 = node4.isOr();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean12 = node11.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = null;
        node11.setStaticSourceFile(staticSourceFile13);
        boolean boolean15 = node11.isSwitch();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean20 = node19.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile21 = null;
        node19.setStaticSourceFile(staticSourceFile21);
        boolean boolean23 = node19.isSwitch();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj29 = node27.getProp((int) (short) -1);
        int int30 = node27.getChangeTime();
        java.lang.String str31 = node27.getSourceFileName();
        com.google.javascript.rhino.Node[] nodeArray32 = new com.google.javascript.rhino.Node[] { node4, node11, node19, node27 };
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) ' ', nodeArray32, (int) '#', 4);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean41 = node40.isLabelName();
        com.google.javascript.rhino.Node node42 = node40.getLastChild();
        boolean boolean43 = node40.isOr();
        boolean boolean44 = node40.isThis();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj50 = node48.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj56 = node54.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node57 = node48.clonePropsFrom(node54);
        boolean boolean58 = node57.isNull();
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj64 = node62.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node(10, node40, node57, node62, (int) 'a', 54);
        com.google.javascript.rhino.Node node68 = node35.useSourceInfoIfMissingFromForTree(node57);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean73 = node72.isLabelName();
        com.google.javascript.rhino.Node node74 = node72.getLastChild();
        boolean boolean75 = node72.isOr();
        boolean boolean76 = node35.isEquivalentToTyped(node72);
        boolean boolean77 = node35.isScript();
        boolean boolean78 = node35.isParamList();
        com.google.javascript.rhino.InputId inputId79 = null;
        node35.setInputId(inputId79);
        int int81 = node35.getCharno();
        java.lang.Appendable appendable82 = null;
        // The following exception was thrown during execution in test generation
        try {
            node35.appendStringTree(appendable82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(nodeArray32);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isOr();
        boolean boolean7 = node3.hasOneChild();
        node3.setChangeTime(31);
        boolean boolean10 = node3.isOnlyModifiesThisCall();
        node3.setChangeTime(40);
        boolean boolean13 = node3.isNull();
        java.lang.Object obj15 = node3.getProp((int) 'a');
        java.lang.String str16 = node3.getQualifiedName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isOr();
        boolean boolean7 = node3.isThis();
        boolean boolean8 = node3.isDebugger();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean13 = node12.isLabelName();
        com.google.javascript.rhino.Node node14 = node12.getLastChild();
        boolean boolean15 = node12.isOr();
        boolean boolean16 = node12.isThis();
        boolean boolean17 = node12.isDebugger();
        boolean boolean18 = node12.isGetProp();
        boolean boolean19 = node12.isDefaultCase();
        boolean boolean20 = node12.isNE();
        int int21 = node3.getIndexOfChild(node12);
        boolean boolean22 = node3.isOnlyModifiesArgumentsCall();
        java.lang.String str23 = node3.getSourceFileName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean10 = node9.isLabelName();
        com.google.javascript.rhino.Node node11 = node9.getLastChild();
        boolean boolean12 = node3.hasChild(node9);
        boolean boolean13 = node3.hasChildren();
        int int14 = node3.getChildCount();
        java.lang.String str15 = node3.toStringTree();
        boolean boolean16 = node3.isIn();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "BITXOR\n" + "'", str15, "BITXOR\n");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node3.isNew();
        boolean boolean14 = node3.isNew();
        boolean boolean15 = node3.isThis();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = null;
        com.google.javascript.rhino.Node node17 = node3.setJSDocInfo(jSDocInfo16);
        int int18 = node17.getLineno();
        boolean boolean19 = node17.isTrue();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder13 = node3.getJsDocBuilderForNode();
        boolean boolean14 = node3.isLabelName();
        boolean boolean15 = node3.mayMutateGlobalStateOrThrow();
        node3.setType(50);
        java.lang.String str18 = node3.getQualifiedName();
        com.google.javascript.rhino.Node node19 = node3.cloneNode();
        boolean boolean20 = node3.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.Node node21 = node3.cloneTree();
        boolean boolean23 = node21.getBooleanProp(97);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isDec();
        node3.detachChildren();
        boolean boolean8 = node3.isFromExterns();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean13 = node12.isLabelName();
        com.google.javascript.rhino.Node node14 = node12.getLastChild();
        boolean boolean15 = node12.isOr();
        boolean boolean16 = node12.isThis();
        boolean boolean17 = node12.isDebugger();
        boolean boolean18 = node12.isGetProp();
        com.google.javascript.rhino.Node node19 = node3.clonePropsFrom(node12);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj25 = node23.getProp((int) (short) -1);
        int int26 = node23.getSideEffectFlags();
        boolean boolean27 = node23.isLocalResultCall();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable28 = node23.getAncestors();
        boolean boolean29 = node23.isDefaultCase();
        com.google.javascript.rhino.jstype.JSType jSType30 = node23.getJSType();
        com.google.javascript.rhino.Node node31 = node3.clonePropsFrom(node23);
        boolean boolean32 = node31.isLabel();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(ancestorIterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(jSType30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj6 = node4.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj12 = node10.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node13 = node4.clonePropsFrom(node10);
        boolean boolean14 = node10.isEmpty();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node10.siblings();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj21 = node19.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean26 = node25.isLabelName();
        com.google.javascript.rhino.Node node27 = node25.getLastChild();
        boolean boolean28 = node19.hasChild(node25);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean33 = node32.isLabelName();
        int int34 = node32.getCharno();
        boolean boolean35 = node32.isOr();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj41 = node39.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj47 = node45.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node48 = node39.clonePropsFrom(node45);
        boolean boolean49 = node39.isNew();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(8, node10, node25, node32, node39, 1, 100);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean57 = node56.isLabelName();
        int int58 = node56.getCharno();
        boolean boolean59 = node56.isBlock();
        boolean boolean60 = node56.isBreak();
        com.google.javascript.rhino.Node node61 = node52.srcref(node56);
        boolean boolean62 = node56.isTypeOf();
        node56.setWasEmptyNode(true);
        com.google.javascript.rhino.jstype.JSType jSType65 = node56.getJSType();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(jSType65);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isOr();
        boolean boolean7 = node3.hasOneChild();
        node3.setChangeTime(31);
        boolean boolean10 = node3.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj16 = node14.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean21 = node20.isLabelName();
        com.google.javascript.rhino.Node node22 = node20.getLastChild();
        boolean boolean23 = node14.hasChild(node20);
        boolean boolean24 = node14.hasChildren();
        com.google.javascript.rhino.Node node25 = node3.useSourceInfoFromForTree(node14);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile26 = null;
        node14.setStaticSourceFile(staticSourceFile26);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj33 = node31.getProp((int) (short) -1);
        int int34 = node31.getSideEffectFlags();
        boolean boolean35 = node31.hasMoreThanOneChild();
        node14.addChildrenToBack(node31);
        boolean boolean37 = node14.isParamList();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean42 = node41.isLabelName();
        com.google.javascript.rhino.Node node43 = node41.getLastChild();
        boolean boolean44 = node41.isOr();
        boolean boolean45 = node41.isThis();
        boolean boolean46 = node41.isDebugger();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean51 = node50.isLabelName();
        com.google.javascript.rhino.Node node52 = node50.getLastChild();
        boolean boolean53 = node50.isOr();
        boolean boolean54 = node50.isThis();
        boolean boolean55 = node50.isDebugger();
        boolean boolean56 = node50.isGetProp();
        boolean boolean57 = node50.isDefaultCase();
        boolean boolean58 = node50.isNE();
        int int59 = node41.getIndexOfChild(node50);
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) 1);
        node41.addChildrenToFront(node61);
        com.google.javascript.rhino.Node node63 = node14.srcref(node41);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable64 = node41.siblings();
        boolean boolean65 = node41.isScript();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(nodeIterable64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isOr();
        boolean boolean7 = node3.isThis();
        boolean boolean8 = node3.isDebugger();
        node3.setOptionalArg(true);
        java.lang.Object obj12 = node3.getProp(29);
        boolean boolean13 = node3.isScript();
        boolean boolean14 = node3.isDec();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = node3.getJSDocInfo();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSDocInfo15);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean5 = node4.isLabelName();
        com.google.javascript.rhino.Node node6 = node4.getLastChild();
        boolean boolean7 = node4.isOr();
        boolean boolean8 = node4.isThis();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj14 = node12.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj20 = node18.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node21 = node12.clonePropsFrom(node18);
        boolean boolean22 = node21.isNull();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj28 = node26.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(10, node4, node21, node26, (int) 'a', 54);
        boolean boolean32 = node21.isExprResult();
        node21.removeProp(42);
        // The following exception was thrown during execution in test generation
        try {
            node21.setString("Node tree inequality:\nTree1:\nBITXOR\n\n\nTree2:\nNUMBER hi!\n\n\nSubtree1: BITXOR\n\n\nSubtree2: NUMBER hi!\n");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: BITXOR is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean5 = node4.isLabelName();
        com.google.javascript.rhino.Node node6 = node4.getLastChild();
        boolean boolean7 = node4.isOr();
        boolean boolean8 = node4.isThis();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj14 = node12.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj20 = node18.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node21 = node12.clonePropsFrom(node18);
        boolean boolean22 = node21.isNull();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj28 = node26.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(10, node4, node21, node26, (int) 'a', 54);
        boolean boolean32 = node21.isExprResult();
        node21.removeProp(42);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean39 = node38.isLabelName();
        com.google.javascript.rhino.Node node40 = node38.getLastChild();
        boolean boolean41 = node38.isOr();
        boolean boolean42 = node38.hasOneChild();
        node38.setChangeTime(31);
        boolean boolean45 = node38.isOnlyModifiesThisCall();
        node38.setChangeTime(40);
        node38.detachChildren();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean53 = node52.isLabelName();
        com.google.javascript.rhino.Node node54 = node52.getLastChild();
        boolean boolean55 = node52.isDec();
        boolean boolean56 = node52.isFalse();
        com.google.javascript.rhino.InputId inputId57 = null;
        node52.setInputId(inputId57);
        java.lang.String str59 = node38.checkTreeEquals(node52);
        node21.addChildrenToFront(node52);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(str59);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        int int6 = node3.getChangeTime();
        java.lang.String str7 = node3.getSourceFileName();
        java.lang.Object obj9 = node3.getProp((int) (short) 100);
        java.util.Set<java.lang.String> strSet10 = node3.getDirectives();
        node3.setSourceEncodedPosition(42);
        boolean boolean13 = node3.isNoSideEffectsCall();
        java.lang.String str14 = node3.getQualifiedName();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node3.isNew();
        boolean boolean14 = node3.isNew();
        int int15 = node3.getType();
        boolean boolean16 = node3.mayMutateArguments();
        node3.setLength(2);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj24 = node22.getProp((int) (short) -1);
        boolean boolean25 = node22.isWith();
        boolean boolean26 = node22.isHook();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder27 = node22.getJsDocBuilderForNode();
        boolean boolean28 = node3.isEquivalentToTyped(node22);
        boolean boolean29 = node3.isFunction();
        boolean boolean30 = node3.isDebugger();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable31 = node3.siblings();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable32 = node3.siblings();
        boolean boolean33 = node3.isNull();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("", (int) (byte) 1, (int) ' ');
        com.google.javascript.rhino.Node node38 = node37.removeChildren();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node39 = node3.srcref(node38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(nodeIterable31);
        org.junit.Assert.assertNotNull(nodeIterable32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(node38);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj6 = node4.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean11 = node10.isLabelName();
        com.google.javascript.rhino.Node node12 = node10.getLastChild();
        boolean boolean13 = node4.hasChild(node10);
        boolean boolean14 = node4.hasChildren();
        int int15 = node4.getChildCount();
        java.lang.String str16 = node4.toStringTree();
        boolean boolean17 = node4.isCase();
        java.lang.Object obj19 = node4.getProp(8);
        boolean boolean20 = node4.isNew();
        boolean boolean21 = node4.isOnlyModifiesArgumentsCall();
        boolean boolean22 = node4.isCase();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(57, "GETELEM 4\n    STRING hi! 39\n    BITXOR\n");
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj31 = node29.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj37 = node35.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node38 = node29.clonePropsFrom(node35);
        boolean boolean39 = node29.isNew();
        boolean boolean40 = node29.isNew();
        int int41 = node29.getType();
        boolean boolean42 = node29.mayMutateArguments();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder43 = node29.getJsDocBuilderForNode();
        boolean boolean44 = node29.isNoSideEffectsCall();
        boolean boolean45 = node29.isGetterDef();
        boolean boolean46 = node29.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean51 = node50.isLabelName();
        com.google.javascript.rhino.Node node52 = node50.getLastChild();
        boolean boolean53 = node50.isOr();
        boolean boolean54 = node50.hasOneChild();
        node50.setChangeTime(31);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(57, node4, node25, node29, node50, 47, 49);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj65 = node63.getProp((int) (short) -1);
        boolean boolean66 = node63.isWith();
        boolean boolean67 = node63.isDec();
        boolean boolean68 = node63.isLabel();
        boolean boolean69 = node63.isThis();
        boolean boolean70 = node63.isNot();
        boolean boolean71 = node63.isSetterDef();
        com.google.javascript.rhino.JSDocInfo jSDocInfo72 = null;
        com.google.javascript.rhino.Node node73 = node63.setJSDocInfo(jSDocInfo72);
        int int75 = node63.getIntProp((int) (short) 10);
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean80 = node79.isLabelName();
        com.google.javascript.rhino.Node node81 = node79.getLastChild();
        boolean boolean82 = node79.isDec();
        node79.detachChildren();
        boolean boolean84 = node79.isFromExterns();
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean89 = node88.isLabelName();
        com.google.javascript.rhino.Node node90 = node88.getLastChild();
        boolean boolean91 = node88.isOr();
        boolean boolean92 = node88.isThis();
        boolean boolean93 = node88.isDebugger();
        boolean boolean94 = node88.isGetProp();
        com.google.javascript.rhino.Node node95 = node79.clonePropsFrom(node88);
        boolean boolean96 = node79.isAssign();
        com.google.javascript.rhino.Node node97 = node63.srcref(node79);
        com.google.javascript.rhino.Node node98 = node50.srcref(node63);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str99 = node63.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: BITXOR is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "BITXOR\n" + "'", str16, "BITXOR\n");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNull(node90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(node95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(node97);
        org.junit.Assert.assertNotNull(node98);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isDec();
        node3.detachChildren();
        boolean boolean8 = node3.isFromExterns();
        int int9 = node3.getSideEffectFlags();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean14 = node13.isLabelName();
        com.google.javascript.rhino.Node node15 = node13.getLastChild();
        boolean boolean16 = node13.isOr();
        boolean boolean17 = node13.hasOneChild();
        node13.setChangeTime(31);
        boolean boolean20 = node13.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj26 = node24.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean31 = node30.isLabelName();
        com.google.javascript.rhino.Node node32 = node30.getLastChild();
        boolean boolean33 = node24.hasChild(node30);
        boolean boolean34 = node24.hasChildren();
        com.google.javascript.rhino.Node node35 = node13.useSourceInfoFromForTree(node24);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile36 = null;
        node24.setStaticSourceFile(staticSourceFile36);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj43 = node41.getProp((int) (short) -1);
        int int44 = node41.getSideEffectFlags();
        boolean boolean45 = node41.hasMoreThanOneChild();
        node24.addChildrenToBack(node41);
        boolean boolean47 = node3.hasChild(node41);
        boolean boolean48 = node3.isVarArgs();
        int int49 = node3.getCharno();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node3.isNew();
        boolean boolean14 = node3.isNew();
        int int15 = node3.getType();
        boolean boolean16 = node3.mayMutateArguments();
        boolean boolean17 = node3.isBlock();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean23 = node22.isLabelName();
        com.google.javascript.rhino.Node node24 = node22.getLastChild();
        boolean boolean25 = node22.isOr();
        boolean boolean26 = node22.isThis();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj32 = node30.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj38 = node36.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node39 = node30.clonePropsFrom(node36);
        boolean boolean40 = node39.isNull();
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj46 = node44.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(10, node22, node39, node44, (int) 'a', 54);
        boolean boolean50 = node49.isLocalResultCall();
        node3.addChildToBack(node49);
        node3.removeProp((int) (short) 1);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj59 = node57.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj65 = node63.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node66 = node57.clonePropsFrom(node63);
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj72 = node70.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj78 = node76.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node79 = node70.clonePropsFrom(node76);
        com.google.javascript.rhino.Node node80 = node63.clonePropsFrom(node70);
        boolean boolean81 = node70.isHook();
        com.google.javascript.rhino.Node node82 = node3.srcrefTree(node70);
        boolean boolean83 = node3.isSyntheticBlock();
        boolean boolean84 = node3.isName();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        boolean boolean6 = node3.isWith();
        boolean boolean7 = node3.isHook();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder8 = node3.getJsDocBuilderForNode();
        boolean boolean9 = node3.isWith();
        boolean boolean10 = node3.isCast();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isOr();
        boolean boolean7 = node3.hasOneChild();
        node3.setChangeTime(31);
        boolean boolean10 = node3.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj16 = node14.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean21 = node20.isLabelName();
        com.google.javascript.rhino.Node node22 = node20.getLastChild();
        boolean boolean23 = node14.hasChild(node20);
        boolean boolean24 = node14.hasChildren();
        com.google.javascript.rhino.Node node25 = node3.useSourceInfoFromForTree(node14);
        java.lang.String str26 = node3.toString();
        boolean boolean27 = node3.isTypeOf();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj33 = node31.getProp((int) (short) -1);
        boolean boolean34 = node31.isWith();
        boolean boolean35 = node31.isDec();
        boolean boolean36 = node31.isLabel();
        boolean boolean37 = node31.isThis();
        com.google.javascript.rhino.Node node38 = node3.copyInformationFromForTree(node31);
        node3.setLineno(100);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable41 = node3.siblings();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator42 = nodeIterable41.spliterator();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "BITXOR [change_time: 31]" + "'", str26, "BITXOR [change_time: 31]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(nodeIterable41);
        org.junit.Assert.assertNotNull(nodeSpliterator42);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean10 = node9.isLabelName();
        com.google.javascript.rhino.Node node11 = node9.getLastChild();
        boolean boolean12 = node3.hasChild(node9);
        boolean boolean13 = node3.hasChildren();
        int int14 = node3.getChildCount();
        java.lang.String str15 = node3.toStringTree();
        boolean boolean16 = node3.isCase();
        java.lang.Object obj18 = node3.getProp(8);
        boolean boolean19 = node3.isNE();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = null;
        com.google.javascript.rhino.Node node21 = node3.setJSDocInfo(jSDocInfo20);
        com.google.javascript.rhino.InputId inputId22 = null;
        node21.setInputId(inputId22);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "BITXOR\n" + "'", str15, "BITXOR\n");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 10, 54, 31);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean8 = node7.isLabelName();
        com.google.javascript.rhino.Node node9 = node7.getLastChild();
        boolean boolean10 = node7.isOr();
        boolean boolean11 = node7.isThis();
        boolean boolean12 = node7.isDebugger();
        boolean boolean13 = node7.isGetProp();
        boolean boolean14 = node7.isDefaultCase();
        boolean boolean15 = node7.isNE();
        java.lang.String str16 = node3.checkTreeEquals(node7);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean22 = node21.isLabelName();
        com.google.javascript.rhino.Node node23 = node21.getLastChild();
        boolean boolean24 = node21.isOr();
        boolean boolean25 = node21.isThis();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj31 = node29.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj37 = node35.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node38 = node29.clonePropsFrom(node35);
        boolean boolean39 = node38.isNull();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj45 = node43.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node21, node38, node43, (int) 'a', 54);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean53 = node52.isLabelName();
        com.google.javascript.rhino.Node node54 = node52.getLastChild();
        boolean boolean55 = node52.isOr();
        boolean boolean56 = node52.hasOneChild();
        node52.setChangeTime(31);
        boolean boolean59 = node52.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj65 = node63.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean70 = node69.isLabelName();
        com.google.javascript.rhino.Node node71 = node69.getLastChild();
        boolean boolean72 = node63.hasChild(node69);
        boolean boolean73 = node63.hasChildren();
        com.google.javascript.rhino.Node node74 = node52.useSourceInfoFromForTree(node63);
        node63.setChangeTime(16);
        com.google.javascript.rhino.Node node77 = node21.srcrefTree(node63);
        com.google.javascript.rhino.Node node78 = node3.clonePropsFrom(node77);
        // The following exception was thrown during execution in test generation
        try {
            node3.setString("Node tree inequality:\nTree1:\nBITXOR\n\n\nTree2:\nREGEXP hi! 39\n\n\nSubtree1: BITXOR\n\n\nSubtree2: REGEXP hi! 39\n");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: BITXOR 54 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(node78);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = sideEffectFlags0.setMutatesArguments();
        int int2 = sideEffectFlags0.valueOf();
        boolean boolean3 = sideEffectFlags0.areAllFlagsSet();
        sideEffectFlags0.clearSideEffectFlags();
        org.junit.Assert.assertNotNull(sideEffectFlags1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node3.isNew();
        boolean boolean14 = node3.isNew();
        int int15 = node3.getType();
        boolean boolean16 = node3.mayMutateArguments();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder17 = node3.getJsDocBuilderForNode();
        com.google.javascript.rhino.InputId inputId18 = null;
        node3.setInputId(inputId18);
        com.google.javascript.rhino.Node node20 = node3.cloneTree();
        boolean boolean21 = node20.isSetterDef();
        node20.setChangeTime((int) (short) 0);
        boolean boolean24 = node20.isEmpty();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = null;
        node3.setStaticSourceFile(staticSourceFile5);
        boolean boolean7 = node3.isSwitch();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean13 = node12.isLabelName();
        com.google.javascript.rhino.Node node14 = node12.getLastChild();
        boolean boolean15 = node12.isOr();
        boolean boolean16 = node12.isThis();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj22 = node20.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj28 = node26.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node29 = node20.clonePropsFrom(node26);
        boolean boolean30 = node29.isNull();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj36 = node34.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(10, node12, node29, node34, (int) 'a', 54);
        com.google.javascript.rhino.Node node40 = node3.useSourceInfoFromForTree(node39);
        boolean boolean41 = node39.wasEmptyNode();
        com.google.javascript.rhino.Node node42 = node39.cloneNode();
        boolean boolean43 = node39.isIf();
        boolean boolean44 = node39.isFor();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node12.isNull();
        boolean boolean14 = node12.isName();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj21 = node19.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj27 = node25.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node28 = node19.clonePropsFrom(node25);
        boolean boolean29 = node25.isEmpty();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable30 = node25.siblings();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj36 = node34.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean41 = node40.isLabelName();
        com.google.javascript.rhino.Node node42 = node40.getLastChild();
        boolean boolean43 = node34.hasChild(node40);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean48 = node47.isLabelName();
        int int49 = node47.getCharno();
        boolean boolean50 = node47.isOr();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj56 = node54.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj62 = node60.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node63 = node54.clonePropsFrom(node60);
        boolean boolean64 = node54.isNew();
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node(8, node25, node40, node47, node54, 1, 100);
        boolean boolean68 = node67.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node69 = node12.copyInformationFrom(node67);
        com.google.javascript.rhino.InputId inputId70 = node67.getInputId();
        boolean boolean71 = node67.isAdd();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(nodeIterable30);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNull(inputId70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder13 = node3.getJsDocBuilderForNode();
        boolean boolean14 = node3.isLabelName();
        boolean boolean15 = node3.mayMutateGlobalStateOrThrow();
        int int16 = node3.getLineno();
        boolean boolean17 = node3.isQuotedString();
        node3.setSourceEncodedPositionForTree(43);
        boolean boolean20 = node3.isCase();
        boolean boolean21 = node3.isThis();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean5 = node4.isLabelName();
        com.google.javascript.rhino.Node node6 = node4.getLastChild();
        boolean boolean7 = node4.isOr();
        boolean boolean8 = node4.isThis();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj14 = node12.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj20 = node18.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node21 = node12.clonePropsFrom(node18);
        boolean boolean22 = node21.isNull();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj28 = node26.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(10, node4, node21, node26, (int) 'a', 54);
        boolean boolean32 = node21.isExprResult();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj38 = node36.getProp((int) (short) -1);
        int int39 = node36.getSideEffectFlags();
        boolean boolean40 = node36.isLocalResultCall();
        boolean boolean41 = node21.hasChild(node36);
        java.lang.String str42 = node21.toStringTree();
        int int43 = node21.getLineno();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj50 = node48.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj56 = node54.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node57 = node48.clonePropsFrom(node54);
        boolean boolean58 = node54.isEmpty();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable59 = node54.siblings();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj65 = node63.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean70 = node69.isLabelName();
        com.google.javascript.rhino.Node node71 = node69.getLastChild();
        boolean boolean72 = node63.hasChild(node69);
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean77 = node76.isLabelName();
        int int78 = node76.getCharno();
        boolean boolean79 = node76.isOr();
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj85 = node83.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node89 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj91 = node89.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node92 = node83.clonePropsFrom(node89);
        boolean boolean93 = node83.isNew();
        com.google.javascript.rhino.Node node96 = new com.google.javascript.rhino.Node(8, node54, node69, node76, node83, 1, 100);
        int int97 = node69.getSideEffectFlags();
        com.google.javascript.rhino.Node node98 = node21.copyInformationFromForTree(node69);
        boolean boolean99 = node21.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "BITXOR\n" + "'", str42, "BITXOR\n");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(nodeIterable59);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertNotNull(node98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder13 = node3.getJsDocBuilderForNode();
        boolean boolean14 = node3.isLabelName();
        boolean boolean15 = node3.isGetElem();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable16 = node3.children();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodeIterable16);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isOr();
        boolean boolean7 = node3.isThis();
        boolean boolean8 = node3.isDebugger();
        node3.setOptionalArg(true);
        boolean boolean11 = node3.isOptionalArg();
        boolean boolean12 = node3.hasChildren();
        boolean boolean13 = node3.isBlock();
        int int14 = node3.getSourcePosition();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean19 = node18.mayMutateArguments();
        com.google.javascript.rhino.Node node20 = node3.copyInformationFrom(node18);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) 10, 54, 31);
        boolean boolean25 = node24.isAssignAdd();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node24.children();
        boolean boolean27 = node24.isContinue();
        com.google.javascript.rhino.Node node28 = node18.useSourceInfoFrom(node24);
        node18.setWasEmptyNode(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(nodeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isOr();
        boolean boolean7 = node3.hasOneChild();
        node3.setChangeTime(31);
        boolean boolean10 = node3.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj16 = node14.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean21 = node20.isLabelName();
        com.google.javascript.rhino.Node node22 = node20.getLastChild();
        boolean boolean23 = node14.hasChild(node20);
        boolean boolean24 = node14.hasChildren();
        com.google.javascript.rhino.Node node25 = node3.useSourceInfoFromForTree(node14);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile26 = null;
        node14.setStaticSourceFile(staticSourceFile26);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj33 = node31.getProp((int) (short) -1);
        int int34 = node31.getSideEffectFlags();
        boolean boolean35 = node31.hasMoreThanOneChild();
        node14.addChildrenToBack(node31);
        com.google.javascript.rhino.Node node37 = node14.removeFirstChild();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node37);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isOr();
        boolean boolean7 = node3.hasOneChild();
        node3.setChangeTime(31);
        boolean boolean10 = node3.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj16 = node14.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean21 = node20.isLabelName();
        com.google.javascript.rhino.Node node22 = node20.getLastChild();
        boolean boolean23 = node14.hasChild(node20);
        boolean boolean24 = node14.hasChildren();
        com.google.javascript.rhino.Node node25 = node3.useSourceInfoFromForTree(node14);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj31 = node29.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj37 = node35.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node38 = node29.clonePropsFrom(node35);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder39 = node29.getJsDocBuilderForNode();
        boolean boolean40 = node29.isHook();
        node3.addChildToBack(node29);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable42 = node29.getAncestors();
        boolean boolean43 = node29.isTry();
        node29.putIntProp((-1), (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(ancestorIterable42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj18 = node16.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj24 = node22.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node25 = node16.clonePropsFrom(node22);
        com.google.javascript.rhino.Node node26 = node9.clonePropsFrom(node16);
        boolean boolean27 = node26.isThrow();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable28 = node26.getAncestors();
        com.google.javascript.rhino.Node node29 = node26.cloneNode();
        boolean boolean30 = node26.isFromExterns();
        boolean boolean31 = node26.isOptionalArg();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(ancestorIterable28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isOr();
        boolean boolean7 = node3.hasOneChild();
        node3.setChangeTime(31);
        java.lang.String str10 = node3.getQualifiedName();
        boolean boolean11 = node3.isLabelName();
        com.google.javascript.rhino.Node node12 = node3.cloneTree();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean17 = node16.isLabelName();
        com.google.javascript.rhino.Node node18 = node16.getLastChild();
        boolean boolean19 = node16.isOr();
        boolean boolean20 = node16.isThis();
        boolean boolean21 = node16.isDebugger();
        node16.setOptionalArg(true);
        boolean boolean24 = node16.isOptionalArg();
        boolean boolean25 = node16.isFunction();
        java.lang.Object obj27 = node16.getProp(43);
        com.google.javascript.rhino.Node node28 = node12.useSourceInfoIfMissingFrom(node16);
        node16.setCharno(39);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = null;
        node3.setStaticSourceFile(staticSourceFile5);
        boolean boolean7 = node3.isSwitch();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean13 = node12.isLabelName();
        com.google.javascript.rhino.Node node14 = node12.getLastChild();
        boolean boolean15 = node12.isOr();
        boolean boolean16 = node12.isThis();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj22 = node20.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj28 = node26.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node29 = node20.clonePropsFrom(node26);
        boolean boolean30 = node29.isNull();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj36 = node34.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(10, node12, node29, node34, (int) 'a', 54);
        com.google.javascript.rhino.Node node40 = node3.useSourceInfoFromForTree(node39);
        boolean boolean41 = node3.isOnlyModifiesThisCall();
        node3.setSourceEncodedPositionForTree((int) '4');
        com.google.javascript.rhino.Node node44 = node3.removeFirstChild();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node44);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (short) 100);
        boolean boolean2 = node1.isTypeOf();
        boolean boolean3 = node1.isDec();
        boolean boolean4 = node1.isString();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("BITXOR\n");
        boolean boolean2 = node1.isVarArgs();
        boolean boolean3 = node1.isCase();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean5 = node4.isLabelName();
        com.google.javascript.rhino.Node node6 = node4.getLastChild();
        boolean boolean7 = node4.isOr();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean12 = node11.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = null;
        node11.setStaticSourceFile(staticSourceFile13);
        boolean boolean15 = node11.isSwitch();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean20 = node19.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile21 = null;
        node19.setStaticSourceFile(staticSourceFile21);
        boolean boolean23 = node19.isSwitch();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj29 = node27.getProp((int) (short) -1);
        int int30 = node27.getChangeTime();
        java.lang.String str31 = node27.getSourceFileName();
        com.google.javascript.rhino.Node[] nodeArray32 = new com.google.javascript.rhino.Node[] { node4, node11, node19, node27 };
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) ' ', nodeArray32, (int) '#', 4);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean41 = node40.isLabelName();
        com.google.javascript.rhino.Node node42 = node40.getLastChild();
        boolean boolean43 = node40.isOr();
        boolean boolean44 = node40.isThis();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj50 = node48.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj56 = node54.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node57 = node48.clonePropsFrom(node54);
        boolean boolean58 = node57.isNull();
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj64 = node62.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node(10, node40, node57, node62, (int) 'a', 54);
        com.google.javascript.rhino.Node node68 = node35.useSourceInfoIfMissingFromForTree(node57);
        com.google.javascript.rhino.Node node69 = node57.detachFromParent();
        com.google.javascript.rhino.InputId inputId70 = null;
        node57.setInputId(inputId70);
        boolean boolean72 = node57.isNoSideEffectsCall();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(nodeArray32);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean10 = node9.isLabelName();
        com.google.javascript.rhino.Node node11 = node9.getLastChild();
        boolean boolean12 = node3.hasChild(node9);
        boolean boolean13 = node3.hasChildren();
        boolean boolean14 = node3.wasEmptyNode();
        boolean boolean15 = node3.isGetterDef();
        node3.setSourceEncodedPositionForTree((int) (short) 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(51, (int) (short) 100, 97);
        boolean boolean4 = node3.isScript();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean6 = node5.isLabelName();
        com.google.javascript.rhino.Node node7 = node5.getLastChild();
        boolean boolean8 = node5.isOr();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean13 = node12.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile14 = null;
        node12.setStaticSourceFile(staticSourceFile14);
        boolean boolean16 = node12.isSwitch();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean21 = node20.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile22 = null;
        node20.setStaticSourceFile(staticSourceFile22);
        boolean boolean24 = node20.isSwitch();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj30 = node28.getProp((int) (short) -1);
        int int31 = node28.getChangeTime();
        java.lang.String str32 = node28.getSourceFileName();
        com.google.javascript.rhino.Node[] nodeArray33 = new com.google.javascript.rhino.Node[] { node5, node12, node20, node28 };
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) ' ', nodeArray33, (int) '#', 4);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean42 = node41.isLabelName();
        com.google.javascript.rhino.Node node43 = node41.getLastChild();
        boolean boolean44 = node41.isOr();
        boolean boolean45 = node41.isThis();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj51 = node49.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj57 = node55.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node58 = node49.clonePropsFrom(node55);
        boolean boolean59 = node58.isNull();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj65 = node63.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(10, node41, node58, node63, (int) 'a', 54);
        com.google.javascript.rhino.Node node69 = node36.useSourceInfoIfMissingFromForTree(node58);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean74 = node73.isLabelName();
        com.google.javascript.rhino.Node node75 = node73.getLastChild();
        boolean boolean76 = node73.isOr();
        boolean boolean77 = node36.isEquivalentToTyped(node73);
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj83 = node81.getProp((int) (short) -1);
        boolean boolean84 = node81.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable85 = node81.siblings();
        boolean boolean86 = node81.isFromExterns();
        com.google.javascript.rhino.Node node87 = node81.cloneTree();
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node((int) (byte) 0, node36, node87);
        boolean boolean89 = node88.isAnd();
        boolean boolean90 = node88.isHook();
        boolean boolean91 = node88.isThis();
        com.google.javascript.rhino.JSDocInfo jSDocInfo92 = node88.getJSDocInfo();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(nodeArray33);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(nodeIterable85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(jSDocInfo92);
    }
}

