package org.apache.commons.jxpath.ri;

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
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
        java.util.HashMap hashMap1 = namespaceResolver0.reverseMap;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = namespaceResolver0.getPrefix("");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
        java.lang.Object obj1 = namespaceResolver0.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = namespaceResolver0.getPrefix("hi!");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer1 = namespaceResolver0.pointer;
        boolean boolean2 = namespaceResolver0.isSealed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = namespaceResolver0.getPrefix("id('')/@null");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
        java.lang.String str2 = namespaceResolver0.getNamespaceURI("http://www.w3.org/XML/1998/namespace");
        namespaceResolver0.registerNamespace("id('http://www.w3.org/XML/1998/namespace')", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = namespaceResolver0.getPrefix("id('')/@null");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer1 = namespaceResolver0.pointer;
        boolean boolean2 = namespaceResolver0.isSealed();
        namespaceResolver0.registerNamespace("-1", "id('http://www.w3.org/XML/1998/namespace')");
        java.lang.String str7 = namespaceResolver0.getNamespaceURI("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = namespaceResolver0.getPrefix("id('')");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
        java.lang.String str2 = namespaceResolver0.getNamespaceURI("http://www.w3.org/XML/1998/namespace");
        boolean boolean3 = namespaceResolver0.isSealed();
        java.lang.String str5 = namespaceResolver0.getNamespaceURI("-1");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = namespaceResolver0.getPrefix("id('')/@null");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
        java.lang.Object obj1 = namespaceResolver0.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer2 = namespaceResolver0.pointer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = namespaceResolver0.getPrefix("<<unknown namespace>>");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer1 = namespaceResolver0.pointer;
        java.lang.Object obj2 = namespaceResolver0.clone();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver3 = namespaceResolver0.parent;
        java.util.HashMap hashMap4 = namespaceResolver0.reverseMap;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = namespaceResolver0.pointer;
        boolean boolean6 = namespaceResolver0.isSealed();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver7 = namespaceResolver0.parent;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = namespaceResolver0.getPrefix("http://www.w3.org/XML/1998/namespace");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer1 = namespaceResolver0.pointer;
        java.lang.Object obj2 = namespaceResolver0.clone();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver3 = namespaceResolver0.parent;
        java.util.HashMap hashMap4 = namespaceResolver0.reverseMap;
        org.apache.commons.jxpath.Pointer pointer5 = namespaceResolver0.getNamespaceContextPointer();
        org.apache.commons.jxpath.Pointer pointer6 = namespaceResolver0.getNamespaceContextPointer();
        org.apache.commons.jxpath.Pointer pointer7 = namespaceResolver0.getNamespaceContextPointer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = namespaceResolver0.getPrefix("/");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer1 = namespaceResolver0.pointer;
        java.lang.Object obj2 = namespaceResolver0.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = namespaceResolver0.pointer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = namespaceResolver0.getPrefix("hi!");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer1 = namespaceResolver0.pointer;
        java.lang.Object obj2 = namespaceResolver0.clone();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver3 = namespaceResolver0.parent;
        java.util.HashMap hashMap4 = namespaceResolver0.reverseMap;
        org.apache.commons.jxpath.Pointer pointer5 = namespaceResolver0.getNamespaceContextPointer();
        org.apache.commons.jxpath.Pointer pointer6 = namespaceResolver0.getNamespaceContextPointer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = namespaceResolver0.getPrefix("id('hi!')");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
        java.util.HashMap hashMap1 = namespaceResolver0.reverseMap;
        boolean boolean2 = namespaceResolver0.isSealed();
        org.apache.commons.jxpath.Pointer pointer3 = namespaceResolver0.getNamespaceContextPointer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = new org.apache.commons.jxpath.ri.NamespaceResolver(namespaceResolver0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = namespaceResolver0.getPrefix("id('')");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer1 = namespaceResolver0.pointer;
        java.lang.Object obj2 = namespaceResolver0.clone();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver3 = namespaceResolver0.parent;
        java.util.HashMap hashMap4 = namespaceResolver0.reverseMap;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = namespaceResolver0.pointer;
        boolean boolean6 = namespaceResolver0.isSealed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = namespaceResolver0.getPrefix("id('<<unknown namespace>>')");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
        java.util.HashMap hashMap1 = namespaceResolver0.reverseMap;
        boolean boolean2 = namespaceResolver0.isSealed();
        org.apache.commons.jxpath.Pointer pointer3 = namespaceResolver0.getNamespaceContextPointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = namespaceResolver0.pointer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = namespaceResolver0.getPrefix("id('http://www.w3.org/XML/1998/namespace')");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
        java.util.HashMap hashMap1 = namespaceResolver0.reverseMap;
        boolean boolean2 = namespaceResolver0.isSealed();
        org.apache.commons.jxpath.Pointer pointer3 = namespaceResolver0.getNamespaceContextPointer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = new org.apache.commons.jxpath.ri.NamespaceResolver(namespaceResolver0);
        org.apache.commons.jxpath.Pointer pointer5 = namespaceResolver0.getNamespaceContextPointer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = namespaceResolver0.getPrefix("null()/null");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer1 = namespaceResolver0.pointer;
        java.lang.Object obj2 = namespaceResolver0.clone();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver3 = namespaceResolver0.parent;
        java.util.HashMap hashMap4 = namespaceResolver0.reverseMap;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = namespaceResolver0.pointer;
        org.apache.commons.jxpath.Pointer pointer6 = namespaceResolver0.getNamespaceContextPointer();
        org.apache.commons.jxpath.Pointer pointer7 = namespaceResolver0.getNamespaceContextPointer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = namespaceResolver0.getPrefix("http://www.w3.org/XML/1998/namespace");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
        java.util.HashMap hashMap1 = namespaceResolver0.reverseMap;
        boolean boolean2 = namespaceResolver0.isSealed();
        boolean boolean3 = namespaceResolver0.isSealed();
        java.lang.Object obj4 = namespaceResolver0.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = namespaceResolver0.getPrefix("id('<<unknown namespace>>')");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver0 = new org.apache.commons.jxpath.ri.NamespaceResolver();
        java.util.HashMap hashMap1 = namespaceResolver0.reverseMap;
        namespaceResolver0.seal();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver3 = new org.apache.commons.jxpath.ri.NamespaceResolver(namespaceResolver0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = namespaceResolver0.getPrefix("id('<<unknown namespace>>')");
    }
}

