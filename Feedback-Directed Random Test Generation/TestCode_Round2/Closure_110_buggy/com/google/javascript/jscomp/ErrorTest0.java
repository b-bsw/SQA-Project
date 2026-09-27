package com.google.javascript.jscomp;

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
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isOr();
        boolean boolean7 = node3.isThis();
        boolean boolean8 = node3.isDebugger();
        boolean boolean9 = node3.isGetProp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node11 = node3.getChildAtIndex(16);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 10, 54, 31);
        com.google.javascript.rhino.Node node4 = node3.getLastChild();
        boolean boolean5 = node3.isName();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        boolean boolean12 = node9.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable13 = node9.siblings();
        boolean boolean14 = node9.isFromExterns();
        boolean boolean15 = node9.isNew();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node16 = node3.getChildBefore(node9);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
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
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj37 = node35.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj43 = node41.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node44 = node35.clonePropsFrom(node41);
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj50 = node48.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj56 = node54.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node57 = node48.clonePropsFrom(node54);
        com.google.javascript.rhino.Node node58 = node41.clonePropsFrom(node48);
        int int59 = node41.getSourceOffset();
        boolean boolean60 = node41.isThis();
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj66 = node64.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj72 = node70.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node73 = node64.clonePropsFrom(node70);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder74 = node64.getJsDocBuilderForNode();
        boolean boolean75 = node64.isLabelName();
        boolean boolean76 = node64.mayMutateGlobalStateOrThrow();
        node64.setType(50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node21.replaceChild(node41, node64);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isOr();
        boolean boolean7 = node3.hasOneChild();
        node3.setChangeTime(31);
        node3.putIntProp(57, 57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node14 = node3.getChildAtIndex(38);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
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
        boolean boolean42 = node21.isSwitch();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean47 = node46.isLabelName();
        com.google.javascript.rhino.Node node48 = node46.getLastChild();
        boolean boolean49 = node46.isDec();
        node46.detachChildren();
        boolean boolean51 = node46.isFromExterns();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj57 = node55.getProp((int) (short) -1);
        int int58 = node55.getSideEffectFlags();
        boolean boolean59 = node55.hasMoreThanOneChild();
        boolean boolean60 = node55.isOptionalArg();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node21.replaceChild(node46, node55);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
        boolean boolean32 = node29.isWith();
        boolean boolean33 = node29.isDec();
        boolean boolean34 = node29.isQualifiedName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node25.removeChild(node29);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node3.isNew();
        boolean boolean14 = node3.isNew();
        boolean boolean15 = node3.isThis();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean20 = node19.isLabelName();
        node19.setOptionalArg(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node19);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isOr();
        boolean boolean7 = node3.isThis();
        boolean boolean8 = node3.isDebugger();
        boolean boolean9 = node3.isGetProp();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj15 = node13.getProp((int) (short) -1);
        int int16 = node13.getSideEffectFlags();
        boolean boolean17 = node13.isLocalResultCall();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable18 = node13.getAncestors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node19 = node3.getChildBefore(node13);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        boolean boolean13 = node9.isNot();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj19 = node17.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj25 = node23.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node26 = node17.clonePropsFrom(node23);
        boolean boolean27 = node17.isNew();
        boolean boolean28 = node17.isNew();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node9.removeChild(node17);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder13 = node3.getJsDocBuilderForNode();
        boolean boolean14 = node3.isHook();
        boolean boolean15 = node3.isArrayLit();
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
        boolean boolean48 = node37.isExprResult();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj54 = node52.getProp((int) (short) -1);
        int int55 = node52.getSideEffectFlags();
        boolean boolean56 = node52.isLocalResultCall();
        boolean boolean57 = node37.hasChild(node52);
        boolean boolean58 = node52.isLabelName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node59 = node3.getChildBefore(node52);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj18 = node16.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean23 = node22.isLabelName();
        com.google.javascript.rhino.Node node24 = node22.getLastChild();
        boolean boolean25 = node16.hasChild(node22);
        boolean boolean26 = node16.hasChildren();
        boolean boolean27 = node16.wasEmptyNode();
        boolean boolean28 = node16.isIn();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean34 = node33.isLabelName();
        com.google.javascript.rhino.Node node35 = node33.getLastChild();
        boolean boolean36 = node33.isOr();
        boolean boolean37 = node33.isThis();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj43 = node41.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj49 = node47.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node50 = node41.clonePropsFrom(node47);
        boolean boolean51 = node50.isNull();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj57 = node55.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(10, node33, node50, node55, (int) 'a', 54);
        boolean boolean61 = node50.isExprResult();
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj67 = node65.getProp((int) (short) -1);
        int int68 = node65.getSideEffectFlags();
        boolean boolean69 = node65.isLocalResultCall();
        boolean boolean70 = node50.hasChild(node65);
        boolean boolean71 = node65.isLabelName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node9.replaceChild(node16, node65);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(53);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj7 = node5.getProp((int) (short) -1);
        boolean boolean8 = node5.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node5.siblings();
        boolean boolean10 = node5.isFromExterns();
        boolean boolean11 = node5.isAssignAdd();
        com.google.javascript.rhino.Node node12 = node1.srcref(node5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node14 = node1.getChildAtIndex((int) ' ');
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.JSType jSType2 = node1.getJSType();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj8 = node6.getProp((int) (short) -1);
        int int9 = node6.getChangeTime();
        boolean boolean10 = node6.isNew();
        int int11 = node6.getSourcePosition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node6);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node20 = node3.getChildAtIndex((int) 'a');
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        boolean boolean6 = node3.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node3.siblings();
        boolean boolean8 = node3.isFromExterns();
        boolean boolean9 = node3.isNew();
        boolean boolean10 = node3.isWith();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj16 = node14.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj22 = node20.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node23 = node14.clonePropsFrom(node20);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj29 = node27.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj35 = node33.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node36 = node27.clonePropsFrom(node33);
        com.google.javascript.rhino.Node node37 = node20.clonePropsFrom(node27);
        boolean boolean38 = node37.isThrow();
        boolean boolean39 = node37.isComma();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder40 = node37.getJsDocBuilderForNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node41 = node3.getChildBefore(node37);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj6 = node4.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean11 = node10.isLabelName();
        com.google.javascript.rhino.Node node12 = node10.getLastChild();
        boolean boolean13 = node4.hasChild(node10);
        boolean boolean14 = node4.hasChildren();
        int int15 = node4.getChildCount();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(54, node4, 10, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node20 = node4.getChildAtIndex(4);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        boolean boolean6 = node3.isWith();
        boolean boolean7 = node3.isHook();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder8 = node3.getJsDocBuilderForNode();
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
        boolean boolean41 = node35.isInc();
        boolean boolean42 = node35.isAssignAdd();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj48 = node46.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj54 = node52.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node55 = node46.clonePropsFrom(node52);
        boolean boolean56 = node52.isEmpty();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable57 = node52.siblings();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj63 = node61.getProp((int) (short) -1);
        boolean boolean64 = node61.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable65 = node61.siblings();
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj71 = node69.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj77 = node75.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node78 = node69.clonePropsFrom(node75);
        node61.addChildrenToBack(node75);
        node52.addChildrenToBack(node61);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node35, node52);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder13 = node3.getJsDocBuilderForNode();
        boolean boolean14 = node3.isHook();
        boolean boolean15 = node3.isArrayLit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node17 = node3.getChildAtIndex((int) '#');
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
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
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("BITXOR\n");
        com.google.javascript.rhino.Node node18 = node3.copyInformationFromForTree(node17);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 4);
        boolean boolean21 = node20.isOnlyModifiesArgumentsCall();
        node20.setCharno(57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node24 = node3.getChildBefore(node20);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean10 = node9.isLabelName();
        com.google.javascript.rhino.Node node11 = node9.getLastChild();
        boolean boolean12 = node3.hasChild(node9);
        boolean boolean13 = node3.isBreak();
        com.google.javascript.rhino.Node node14 = node3.cloneNode();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean19 = node18.isLabelName();
        int int20 = node18.getCharno();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("hi!", 39, 31);
        boolean boolean26 = node25.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj32 = node30.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj38 = node36.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node39 = node30.clonePropsFrom(node36);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder40 = node30.getJsDocBuilderForNode();
        boolean boolean41 = node30.isLabelName();
        boolean boolean42 = node30.isGetElem();
        boolean boolean43 = node30.isNew();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) '#', node25, node30, 4, (int) (short) 100);
        node18.addChildrenToBack(node46);
        boolean boolean48 = node18.isComma();
        boolean boolean49 = node18.hasOneChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node18);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
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
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean31 = node30.isLabelName();
        int int32 = node30.getCharno();
        boolean boolean33 = node30.isBlock();
        com.google.javascript.rhino.Node node34 = node30.removeChildren();
        boolean boolean35 = node30.isTry();
        boolean boolean36 = node30.isCast();
        boolean boolean37 = node30.isCase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node38 = node12.getChildBefore(node30);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
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
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj74 = node72.getProp((int) (short) -1);
        int int75 = node72.getSideEffectFlags();
        boolean boolean76 = node72.hasMoreThanOneChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node72);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
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
        boolean boolean18 = node3.isString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node20 = node3.getChildAtIndex((int) (byte) 100);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
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
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean38 = node37.isLabelName();
        com.google.javascript.rhino.Node node39 = node37.getLastChild();
        boolean boolean40 = node37.isDec();
        node37.detachChildren();
        boolean boolean42 = node37.isEmpty();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj48 = node46.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj54 = node52.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node55 = node46.clonePropsFrom(node52);
        boolean boolean56 = node46.isNew();
        boolean boolean57 = node46.isNew();
        int int58 = node46.getType();
        boolean boolean59 = node46.mayMutateArguments();
        node46.setLength(2);
        com.google.javascript.rhino.Node node62 = node46.cloneNode();
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean68 = node67.isLabelName();
        com.google.javascript.rhino.Node node69 = node67.getLastChild();
        boolean boolean70 = node67.isOr();
        boolean boolean71 = node67.isThis();
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj77 = node75.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj83 = node81.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node84 = node75.clonePropsFrom(node81);
        boolean boolean85 = node84.isNull();
        com.google.javascript.rhino.Node node89 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj91 = node89.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node94 = new com.google.javascript.rhino.Node(10, node67, node84, node89, (int) 'a', 54);
        node94.setSourceEncodedPositionForTree(4);
        com.google.javascript.rhino.Node node97 = node46.srcrefTree(node94);
        com.google.javascript.rhino.JSDocInfo jSDocInfo98 = node94.getJSDocInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node33.replaceChild(node37, node94);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node3.getChildAtIndex(36);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean10 = node9.isLabelName();
        com.google.javascript.rhino.Node node11 = node9.getLastChild();
        boolean boolean12 = node3.hasChild(node9);
        boolean boolean13 = node3.isBreak();
        com.google.javascript.rhino.Node node14 = node3.cloneNode();
        boolean boolean15 = node14.isTrue();
        boolean boolean16 = node14.isFor();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean21 = node20.isLabelName();
        com.google.javascript.rhino.Node node22 = node20.getLastChild();
        boolean boolean23 = node20.isOr();
        boolean boolean24 = node20.hasOneChild();
        node20.setChangeTime(31);
        boolean boolean27 = node20.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj33 = node31.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean38 = node37.isLabelName();
        com.google.javascript.rhino.Node node39 = node37.getLastChild();
        boolean boolean40 = node31.hasChild(node37);
        boolean boolean41 = node31.hasChildren();
        com.google.javascript.rhino.Node node42 = node20.useSourceInfoFromForTree(node31);
        boolean boolean43 = node42.hasMoreThanOneChild();
        boolean boolean44 = node42.isGetterDef();
        boolean boolean45 = node42.isNE();
        boolean boolean46 = node42.isStringKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node47 = node14.getChildBefore(node42);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node9);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder13 = node3.getJsDocBuilderForNode();
        boolean boolean14 = node3.isHook();
        boolean boolean15 = node3.isFunction();
        boolean boolean16 = node3.isNot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node18 = node3.getChildAtIndex(12);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 10, 54, 31);
        boolean boolean4 = node3.isAssignAdd();
        com.google.javascript.rhino.Node node5 = node3.cloneNode();
        boolean boolean6 = node3.isArrayLit();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj13 = node11.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean18 = node17.isLabelName();
        com.google.javascript.rhino.Node node19 = node17.getLastChild();
        boolean boolean20 = node11.hasChild(node17);
        boolean boolean21 = node11.hasChildren();
        int int22 = node11.getChildCount();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(54, node11, 10, (int) '4');
        com.google.javascript.rhino.Node node26 = node11.getParent();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj32 = node30.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj38 = node36.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node39 = node30.clonePropsFrom(node36);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj45 = node43.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj51 = node49.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node52 = node43.clonePropsFrom(node49);
        com.google.javascript.rhino.Node node53 = node36.clonePropsFrom(node43);
        int int54 = node36.getSourceOffset();
        int int55 = node11.getIndexOfChild(node36);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj61 = node59.getProp((int) (short) -1);
        int int62 = node59.getSideEffectFlags();
        boolean boolean63 = node59.isVoid();
        int int64 = node36.getIndexOfChild(node59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node65 = node3.getChildBefore(node36);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
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
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj49 = node47.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean54 = node53.isLabelName();
        com.google.javascript.rhino.Node node55 = node53.getLastChild();
        boolean boolean56 = node47.hasChild(node53);
        boolean boolean57 = node47.hasChildren();
        boolean boolean58 = node47.wasEmptyNode();
        boolean boolean59 = node47.isGetterDef();
        node21.addChildrenToFront(node47);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj67 = node65.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj73 = node71.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node74 = node65.clonePropsFrom(node71);
        boolean boolean75 = node65.isNew();
        com.google.javascript.rhino.Node node76 = node65.removeChildren();
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj82 = node80.getProp((int) (short) -1);
        boolean boolean83 = node80.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable84 = node80.siblings();
        boolean boolean85 = node80.isFromExterns();
        int int86 = node80.getLineno();
        com.google.javascript.rhino.Node node90 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj92 = node90.getProp((int) (short) -1);
        boolean boolean93 = node90.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable94 = node90.siblings();
        boolean boolean95 = node90.isFromExterns();
        boolean boolean96 = node90.isNew();
        com.google.javascript.rhino.Node node97 = new com.google.javascript.rhino.Node(43, node65, node80, node90);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node47.removeChild(node65);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean10 = node9.isLabelName();
        com.google.javascript.rhino.Node node11 = node9.getLastChild();
        boolean boolean12 = node3.hasChild(node9);
        boolean boolean13 = node3.hasChildren();
        boolean boolean14 = node3.wasEmptyNode();
        boolean boolean15 = node3.isIf();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj21 = node19.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj27 = node25.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node28 = node19.clonePropsFrom(node25);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder29 = node19.getJsDocBuilderForNode();
        boolean boolean30 = node19.isLabelName();
        boolean boolean31 = node19.isGetElem();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable32 = node19.getAncestors();
        boolean boolean33 = node19.isFalse();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable34 = node19.siblings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node35 = node3.getChildBefore(node19);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj5 = node3.getProp((int) (short) -1);
        boolean boolean6 = node3.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node3.siblings();
        boolean boolean8 = node3.isFromExterns();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 52, 30, 15);
        boolean boolean13 = node12.isGetterDef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node12);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
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
        boolean boolean30 = node26.isAssignAdd();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj36 = node34.getProp((int) (short) -1);
        int int37 = node34.getSideEffectFlags();
        boolean boolean38 = node34.isVoid();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj44 = node42.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj50 = node48.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node51 = node42.clonePropsFrom(node48);
        boolean boolean52 = node42.isNew();
        boolean boolean53 = node42.isNew();
        int int54 = node42.getType();
        boolean boolean55 = node42.mayMutateArguments();
        boolean boolean56 = node42.isBlock();
        boolean boolean57 = node34.isEquivalentToTyped(node42);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj63 = node61.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj69 = node67.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node70 = node61.clonePropsFrom(node67);
        int int71 = node67.getSourcePosition();
        int int72 = node67.getLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node26.replaceChild(node34, node67);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node42 = node3.getChildAtIndex(8);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 10, 54, 31);
        boolean boolean4 = node3.isAssignAdd();
        boolean boolean5 = node3.isQuotedString();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        java.lang.Object obj11 = node9.getProp((int) (short) -1);
        boolean boolean12 = node9.isWith();
        boolean boolean13 = node9.isDec();
        boolean boolean14 = node9.isParamList();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node9);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 10, 39, (int) (byte) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isDec();
        boolean boolean7 = node3.isCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node9 = node3.getChildAtIndex(56);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node46 = node10.getChildAtIndex(30);
    }
}

