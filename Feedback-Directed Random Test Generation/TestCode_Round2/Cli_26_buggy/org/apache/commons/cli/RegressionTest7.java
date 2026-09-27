package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) 'a');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 'a');
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 'a');
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass5 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass5);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder12 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        java.lang.Class<?> wildcardClass13 = optionBuilder7.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertNotNull(optionBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withValueSeparator('#');
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        java.lang.Class<?> wildcardClass10 = optionBuilder8.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass10);
        org.apache.commons.cli.OptionBuilder optionBuilder12 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass10);
        org.apache.commons.cli.OptionBuilder optionBuilder13 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder12);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertNotNull(optionBuilder12);
        org.junit.Assert.assertNotNull(optionBuilder13);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.isRequired(true);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 'a');
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        java.lang.Class<?> wildcardClass10 = optionBuilder9.getClass();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.isRequired();
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder0);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withValueSeparator('#');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass5 = optionBuilder3.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("hi!");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) (byte) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass5 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        java.lang.Class<?> wildcardClass8 = optionBuilder7.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = optionBuilder9.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass10);
        org.apache.commons.cli.OptionBuilder optionBuilder12 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass10);
        org.apache.commons.cli.OptionBuilder optionBuilder13 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder12);
        java.lang.Class<?> wildcardClass14 = optionBuilder13.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder15 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass14);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertNotNull(optionBuilder12);
        org.junit.Assert.assertNotNull(optionBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(optionBuilder15);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) true);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs(100);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        java.lang.Class<?> wildcardClass9 = optionBuilder6.getClass();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('4');
        java.lang.Class<?> wildcardClass2 = option1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass7 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = optionBuilder8.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) (byte) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass7 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass9 = optionBuilder5.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 10L);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        java.lang.Class<?> wildcardClass9 = optionBuilder8.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) (short) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (short) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (short) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.isRequired(true);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass7 = optionBuilder4.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 100.0d);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.isRequired();
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder0);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs(0);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass4 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs(100);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        java.lang.Class<?> wildcardClass8 = optionBuilder6.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) option1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass5 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.isRequired(false);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass8 = optionBuilder5.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.isRequired(true);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass7 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.isRequired();
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass7 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass9 = optionBuilder4.getClass();
        org.junit.Assert.assertNotNull(optionBuilder0);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass7 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        java.lang.Class<?> wildcardClass10 = optionBuilder8.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        java.lang.Class<?> wildcardClass12 = optionBuilder11.getClass();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) '#');
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        java.lang.Class<?> wildcardClass9 = optionBuilder7.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        java.lang.Class<?> wildcardClass9 = optionBuilder8.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs();
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass6 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass10 = optionBuilder9.getClass();
        org.junit.Assert.assertNotNull(optionBuilder0);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) option1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass9 = optionBuilder8.getClass();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withDescription("hi!");
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass7 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withLongOpt("hi!");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) "hi!");
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass4 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 0.0d);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        java.lang.Class<?> wildcardClass9 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass9);
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder10);
        org.apache.commons.cli.OptionBuilder optionBuilder12 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder11);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertNotNull(optionBuilder12);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.hasArgs();
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass6 = optionBuilder3.getClass();
        org.junit.Assert.assertNotNull(optionBuilder0);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) (short) 1);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass8 = optionBuilder7.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("hi!");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        java.lang.Class<?> wildcardClass9 = optionBuilder7.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withValueSeparator('4');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) '4');
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) '4');
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass5 = optionBuilder4.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        java.lang.Object obj0 = null;
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType(obj0);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass5 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        java.lang.Class<?> wildcardClass9 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = optionBuilder10.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) true);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass4 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) true);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) ' ');
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withValueSeparator('#');
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass6 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("hi!");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        java.lang.Class<?> wildcardClass8 = optionBuilder6.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) ' ');
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        java.lang.Class<?> wildcardClass9 = optionBuilder8.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        java.lang.Class<?> wildcardClass11 = optionBuilder8.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArg(false);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) false);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass5);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        java.lang.Class<?> wildcardClass12 = optionBuilder11.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder13 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder11);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(optionBuilder13);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("hi!");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass5 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("hi!");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        java.lang.Class<?> wildcardClass8 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass8);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        java.lang.Class<?> wildcardClass11 = optionBuilder9.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) (short) -1);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass6 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass8 = optionBuilder7.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        java.lang.Class<?> wildcardClass10 = optionBuilder9.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) option1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass9 = optionBuilder8.getClass();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withLongOpt("");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass5 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = optionBuilder8.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.isRequired(true);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = optionBuilder8.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs(0);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) (short) 1);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs(100);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass8 = optionBuilder7.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) (short) 1);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        java.lang.Class<?> wildcardClass9 = optionBuilder8.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) true);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass5 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        java.lang.Class<?> wildcardClass10 = optionBuilder9.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        java.lang.Class<?> wildcardClass12 = optionBuilder9.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder13 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass12);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(optionBuilder13);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder1.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs(100);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        java.lang.Class<?> wildcardClass10 = optionBuilder8.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) '4');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) '4');
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass4 = optionBuilder2.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs(0);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass7 = optionBuilder5.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('4');
        java.lang.Class<?> wildcardClass2 = option1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) (short) 1);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) (short) -1);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass5 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs();
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.junit.Assert.assertNotNull(optionBuilder0);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((-1));
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass8 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = optionBuilder9.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = optionBuilder11.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.isRequired(true);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass5 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("hi!");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass9 = optionBuilder4.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withValueSeparator('#');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass7 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        java.lang.Class<?> wildcardClass10 = optionBuilder9.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) (short) 0);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (short) 0);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass6 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs(100);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass5 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        java.lang.Class<?> wildcardClass9 = optionBuilder8.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 1);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass5 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) (short) 0);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder1.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs(0);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass9 = optionBuilder8.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) true);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass6 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) (short) 0);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass9 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder10);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(optionBuilder11);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs(100);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass8 = optionBuilder5.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) (short) 0);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass8 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass8);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) option1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) (byte) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass5 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass8 = optionBuilder7.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.isRequired(true);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        java.lang.Class<?> wildcardClass9 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass9);
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass9);
        org.apache.commons.cli.OptionBuilder optionBuilder12 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder11);
        org.apache.commons.cli.OptionBuilder optionBuilder13 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder11);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertNotNull(optionBuilder12);
        org.junit.Assert.assertNotNull(optionBuilder13);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass7 = optionBuilder5.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs(10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass6 = optionBuilder2.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) ' ');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder1.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (-1.0d));
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (-1.0d));
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass5 = optionBuilder3.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((-1));
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass4 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.isRequired();
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder0);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withLongOpt("");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass5 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (short) -1);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (short) -1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('4');
        java.lang.Class<?> wildcardClass2 = option1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass5 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = optionBuilder8.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        java.lang.Class<?> wildcardClass11 = optionBuilder8.getClass();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (short) -1);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (short) -1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass8 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass8);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        java.lang.Class<?> wildcardClass11 = optionBuilder9.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (short) 0);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (short) 0);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (short) 0);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("hi!");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        java.lang.Class<?> wildcardClass9 = optionBuilder8.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) 'a');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.isRequired(true);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = optionBuilder8.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) (short) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (short) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (short) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass5 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass7 = optionBuilder4.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withDescription("hi!");
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass7 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) (byte) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass6 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder10);
        org.apache.commons.cli.OptionBuilder optionBuilder12 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder11);
        org.apache.commons.cli.OptionBuilder optionBuilder13 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder11);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertNotNull(optionBuilder12);
        org.junit.Assert.assertNotNull(optionBuilder13);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) 'a');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 'a');
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 'a');
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass5 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) (short) 1);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass8 = optionBuilder4.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass7 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) true);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass4 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass7 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass7 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("hi!");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass8 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        org.apache.commons.cli.OptionBuilder optionBuilder12 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder11);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertNotNull(optionBuilder12);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.hasArg();
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.junit.Assert.assertNotNull(optionBuilder0);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withValueSeparator('a');
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) ' ');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        java.lang.Class<?> wildcardClass9 = optionBuilder7.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass9);
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder10);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(optionBuilder11);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("hi!");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass4 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('4');
        java.lang.Class<?> wildcardClass2 = option1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder10);
        java.lang.Class<?> wildcardClass12 = optionBuilder10.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder13 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = optionBuilder13.getClass();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(optionBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) '4');
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("hi!");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass7 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder10);
        org.apache.commons.cli.OptionBuilder optionBuilder12 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder10);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertNotNull(optionBuilder12);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs(100);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass5 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        java.lang.Class<?> wildcardClass8 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = optionBuilder9.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) (byte) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.withValueSeparator();
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        java.lang.Class<?> wildcardClass5 = optionBuilder0.getClass();
        org.junit.Assert.assertNotNull(optionBuilder0);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((-1));
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((-1));
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass7 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) (byte) 100);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (byte) 100);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass5 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withValueSeparator('#');
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass5 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs(100);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        java.lang.Class<?> wildcardClass9 = optionBuilder6.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((-1));
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = optionBuilder4.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass5 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        java.lang.Class<?> wildcardClass10 = optionBuilder8.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass10);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(optionBuilder11);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (-1.0d));
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        java.lang.Class<?> wildcardClass8 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        java.lang.Class<?> wildcardClass10 = optionBuilder9.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(optionBuilder11);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("hi!");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass8 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = optionBuilder9.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) ' ');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(optionBuilder11);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 'a');
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass4 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        java.lang.Class<?> wildcardClass10 = optionBuilder8.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass10);
        org.apache.commons.cli.OptionBuilder optionBuilder12 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass10);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertNotNull(optionBuilder12);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) (short) 0);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass5 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        java.lang.Class<?> wildcardClass9 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) ' ');
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder10);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(optionBuilder11);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 10L);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) (short) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (short) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (short) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) (short) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("hi!");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass9 = optionBuilder8.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("hi!");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        java.lang.Class<?> wildcardClass11 = optionBuilder10.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs(100);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withDescription("hi!");
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) ' ');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass6 = optionBuilder4.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) (byte) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) ' ');
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) ' ');
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) (byte) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass5 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) (byte) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass5 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        java.lang.Class<?> wildcardClass8 = optionBuilder7.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = optionBuilder9.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass10);
        org.apache.commons.cli.OptionBuilder optionBuilder12 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass10);
        org.apache.commons.cli.OptionBuilder optionBuilder13 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder12);
        org.apache.commons.cli.OptionBuilder optionBuilder14 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder12);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertNotNull(optionBuilder12);
        org.junit.Assert.assertNotNull(optionBuilder13);
        org.junit.Assert.assertNotNull(optionBuilder14);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs(10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs(100);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = optionBuilder7.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) (short) -1);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.hasArgs();
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass7 = optionBuilder2.getClass();
        org.junit.Assert.assertNotNull(optionBuilder0);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass5);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass5);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        java.lang.Class<?> wildcardClass12 = optionBuilder11.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder13 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = optionBuilder13.getClass();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(optionBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.isRequired(true);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass5 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass8 = optionBuilder7.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.withValueSeparator();
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder0);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("hi!");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass5 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass8 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withValueSeparator('#');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) true);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        java.lang.Class<?> wildcardClass12 = optionBuilder9.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        java.lang.Class<?> wildcardClass9 = optionBuilder8.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder10);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(optionBuilder11);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("hi!");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass4 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 10L);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = optionBuilder8.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs();
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        java.lang.Class<?> wildcardClass3 = optionBuilder0.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        java.lang.Class<?> wildcardClass5 = optionBuilder0.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder0);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) option1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("hi!");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass9 = optionBuilder5.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withValueSeparator('#');
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.isRequired(true);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass5 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass9 = optionBuilder8.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass9);
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass9);
        org.apache.commons.cli.OptionBuilder optionBuilder12 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder11);
        java.lang.Class<?> wildcardClass13 = optionBuilder12.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertNotNull(optionBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) ' ');
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) ' ');
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass7 = optionBuilder4.getClass();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 0.0d);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withDescription("hi!");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) "hi!");
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) "hi!");
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) '4');
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass6 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) (short) -1);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) '#');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) '#');
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs(1);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder1.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs();
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder0);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) (byte) 1);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass5 = optionBuilder2.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs(10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        java.lang.Class<?> wildcardClass9 = optionBuilder8.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((-1));
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass5 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass6 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass8 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass8);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        java.lang.Class<?> wildcardClass11 = optionBuilder9.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder12 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass13 = optionBuilder12.getClass();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(optionBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) 'a');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        java.lang.Class<?> wildcardClass9 = optionBuilder7.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(optionBuilder11);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) (short) 0);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (short) 0);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (short) 0);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) (short) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass5 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs();
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        java.lang.Class<?> wildcardClass5 = optionBuilder4.getClass();
        org.junit.Assert.assertNotNull(optionBuilder0);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) (byte) 0);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) "hi!");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withDescription("hi!");
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        java.lang.Class<?> wildcardClass8 = optionBuilder7.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.isRequired();
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder0);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs(100);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass8 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass8);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder10);
        java.lang.Class<?> wildcardClass12 = optionBuilder10.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder13 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder10);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(optionBuilder13);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) (byte) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass5 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        java.lang.Class<?> wildcardClass8 = optionBuilder7.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) (short) -1);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass4 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass7 = optionBuilder2.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) (short) 1);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass7 = optionBuilder5.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (short) -1);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (short) -1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass8 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        java.lang.Class<?> wildcardClass11 = optionBuilder9.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withValueSeparator('#');
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = optionBuilder7.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = optionBuilder9.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        org.apache.commons.cli.OptionBuilder optionBuilder12 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder11);
        org.apache.commons.cli.OptionBuilder optionBuilder13 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder12);
        org.apache.commons.cli.OptionBuilder optionBuilder14 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder12);
        java.lang.Class<?> wildcardClass15 = optionBuilder14.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertNotNull(optionBuilder12);
        org.junit.Assert.assertNotNull(optionBuilder13);
        org.junit.Assert.assertNotNull(optionBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs();
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass7 = optionBuilder4.getClass();
        org.junit.Assert.assertNotNull(optionBuilder0);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('4');
        java.lang.Class<?> wildcardClass2 = option1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder10);
        java.lang.Class<?> wildcardClass12 = optionBuilder10.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder13 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass12);
        org.apache.commons.cli.OptionBuilder optionBuilder14 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder13);
        java.lang.Class<?> wildcardClass15 = optionBuilder13.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder16 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder13);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(optionBuilder13);
        org.junit.Assert.assertNotNull(optionBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(optionBuilder16);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (-1.0f));
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        java.lang.Class<?> wildcardClass9 = optionBuilder8.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withLongOpt("hi!");
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        java.lang.Class<?> wildcardClass10 = optionBuilder9.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withValueSeparator('#');
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (-1));
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass5 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArg(false);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) false);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass7 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        java.lang.Class<?> wildcardClass8 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        java.lang.Class<?> wildcardClass10 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder12 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder11);
        java.lang.Class<?> wildcardClass13 = optionBuilder11.getClass();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertNotNull(optionBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.isRequired(true);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        java.lang.Class<?> wildcardClass9 = optionBuilder8.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.hasArg();
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass5 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.junit.Assert.assertNotNull(optionBuilder0);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) true);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass4 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = optionBuilder7.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.isRequired(true);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) (byte) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.isRequired();
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass4 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass8 = optionBuilder7.getClass();
        org.junit.Assert.assertNotNull(optionBuilder0);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) (byte) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass6 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        java.lang.Class<?> wildcardClass12 = optionBuilder11.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass5 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) (byte) 100);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        java.lang.Class<?> wildcardClass8 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        java.lang.Class<?> wildcardClass10 = optionBuilder6.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) ' ');
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass8 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass10 = optionBuilder9.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.isRequired(true);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder10);
        java.lang.Class<?> wildcardClass12 = optionBuilder11.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) true);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass6 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass8 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass8);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) '#');
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass8 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 0.0d);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass7 = optionBuilder1.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.isRequired(true);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withDescription("hi!");
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        java.lang.Class<?> wildcardClass8 = optionBuilder7.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass8);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass11 = optionBuilder10.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder12 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass11);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(optionBuilder12);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) (byte) 100);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        java.lang.Class<?> wildcardClass8 = optionBuilder7.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) option1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass4 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.isRequired();
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        java.lang.Class<?> wildcardClass9 = optionBuilder7.getClass();
        org.junit.Assert.assertNotNull(optionBuilder0);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        java.lang.Class<?> wildcardClass10 = optionBuilder9.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) (short) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) (byte) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        java.lang.Class<?> wildcardClass9 = optionBuilder8.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) (byte) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass5 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass5);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass5);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder10);
        org.apache.commons.cli.OptionBuilder optionBuilder12 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder11);
        java.lang.Class<?> wildcardClass13 = optionBuilder12.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertNotNull(optionBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArg(false);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) false);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        java.lang.Class<?> wildcardClass10 = optionBuilder8.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withDescription("hi!");
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass5 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs(100);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) ' ');
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass8 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass11 = optionBuilder10.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder12 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass11);
        org.apache.commons.cli.OptionBuilder optionBuilder13 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder12);
        java.lang.Class<?> wildcardClass14 = optionBuilder13.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(optionBuilder12);
        org.junit.Assert.assertNotNull(optionBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.isRequired(true);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        java.lang.Class<?> wildcardClass9 = optionBuilder7.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (short) 0);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass5 = optionBuilder3.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs(10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass6 = optionBuilder4.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.isRequired(true);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass5 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass9 = optionBuilder8.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass9);
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass9);
        org.apache.commons.cli.OptionBuilder optionBuilder12 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertNotNull(optionBuilder12);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 0.0d);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass7 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass9 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withValueSeparator('a');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 'a');
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass5 = optionBuilder2.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (short) -1);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (short) -1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withDescription("hi!");
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass8 = optionBuilder7.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArg(false);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) false);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass4 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (short) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (short) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.isRequired();
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        java.lang.Class<?> wildcardClass8 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = optionBuilder9.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass10);
        org.junit.Assert.assertNotNull(optionBuilder0);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(optionBuilder11);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) (short) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (short) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (short) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 0.0d);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) option1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs(0);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass10 = optionBuilder9.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass10);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(optionBuilder11);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 'a');
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass5 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 0.0d);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass7 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass10 = optionBuilder9.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        org.apache.commons.cli.OptionBuilder optionBuilder12 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertNotNull(optionBuilder12);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs(10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.isRequired(true);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass8 = optionBuilder7.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withValueSeparator('#');
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass5 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs();
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass6 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass9 = optionBuilder8.getClass();
        org.junit.Assert.assertNotNull(optionBuilder0);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.hasOptionalArg();
        java.lang.Class<?> wildcardClass1 = optionBuilder0.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass1);
        org.junit.Assert.assertNotNull(optionBuilder0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(optionBuilder2);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass8 = optionBuilder7.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = optionBuilder9.getClass();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        java.lang.Class<?> wildcardClass9 = optionBuilder8.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('a');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 'a');
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass6 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs(10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) true);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('4');
        java.lang.Class<?> wildcardClass2 = option1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        java.lang.Class<?> wildcardClass10 = optionBuilder9.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass10);
        org.apache.commons.cli.OptionBuilder optionBuilder12 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass10);
        org.apache.commons.cli.OptionBuilder optionBuilder13 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder12);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertNotNull(optionBuilder12);
        org.junit.Assert.assertNotNull(optionBuilder13);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withLongOpt("");
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass5 = optionBuilder1.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create('4');
        java.lang.Class<?> wildcardClass2 = option1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        java.lang.Class<?> wildcardClass10 = optionBuilder9.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = optionBuilder11.getClass();
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) (byte) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs(10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass5 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) (short) -1);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass6 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = optionBuilder7.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass8 = optionBuilder7.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = optionBuilder9.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(optionBuilder11);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (-1.0f));
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withDescription("hi!");
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        java.lang.Class<?> wildcardClass10 = optionBuilder7.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass10);
        org.apache.commons.cli.OptionBuilder optionBuilder12 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass10);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertNotNull(optionBuilder12);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) '#');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass6 = optionBuilder4.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass4 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create(' ');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass7 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        java.lang.Class<?> wildcardClass10 = optionBuilder8.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass10);
        org.apache.commons.cli.OptionBuilder optionBuilder12 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder11);
        org.apache.commons.cli.OptionBuilder optionBuilder13 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder12);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertNotNull(optionBuilder12);
        org.junit.Assert.assertNotNull(optionBuilder13);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) ' ');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder1.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass4 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs(0);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass7 = optionBuilder5.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("hi!");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder10);
        java.lang.Class<?> wildcardClass12 = optionBuilder11.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder13 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass12);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(optionBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(optionBuilder13);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) '#');
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) (byte) 100);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) (byte) 100);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        java.lang.Class<?> wildcardClass8 = optionBuilder7.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        java.lang.Class<?> wildcardClass10 = optionBuilder9.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder11 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass10);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(optionBuilder11);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) (short) 1);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        java.lang.Class<?> wildcardClass10 = optionBuilder8.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withValueSeparator('4');
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass5 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withValueSeparator('#');
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 100.0d);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        java.lang.Class<?> wildcardClass9 = optionBuilder8.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("hi!");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        java.lang.Class<?> wildcardClass10 = optionBuilder8.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 0.0d);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder9);
        java.lang.Class<?> wildcardClass11 = optionBuilder9.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.isRequired(false);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = optionBuilder8.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((-1));
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = optionBuilder7.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) (short) 0);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) (short) 0);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        java.lang.Class<?> wildcardClass8 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = optionBuilder9.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((-1));
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        java.lang.Class<?> wildcardClass9 = optionBuilder8.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs(100);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 100);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass5 = optionBuilder3.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass1);
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass6 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withValueSeparator('#');
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass8 = optionBuilder5.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) ' ');
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs(10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.isRequired(true);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass7 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = optionBuilder8.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs();
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass5 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder0);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 10.0d);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 10.0d);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs((int) (short) -1);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.hasOptionalArgs();
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder0);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) (byte) 10);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withLongOpt("");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass3 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass5 = optionBuilder4.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = optionBuilder6.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder8);
        java.lang.Class<?> wildcardClass10 = optionBuilder8.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withArgName("hi!");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(optionBuilder8);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.isRequired(false);
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass5 = optionBuilder2.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        java.lang.Class<?> wildcardClass8 = optionBuilder2.getClass();
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        org.apache.commons.cli.Option option1 = org.apache.commons.cli.OptionBuilder.create("");
        org.apache.commons.cli.OptionBuilder optionBuilder2 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) option1);
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder4);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder6);
        java.lang.Class<?> wildcardClass8 = optionBuilder7.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder7);
        org.junit.Assert.assertNotNull(option1);
        org.junit.Assert.assertNotNull(optionBuilder2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(optionBuilder9);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        org.apache.commons.cli.OptionBuilder optionBuilder0 = org.apache.commons.cli.OptionBuilder.isRequired();
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder0);
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        java.lang.Class<?> wildcardClass4 = optionBuilder3.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder0);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(optionBuilder7);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.withValueSeparator('#');
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder1);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder3);
        org.apache.commons.cli.OptionBuilder optionBuilder6 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        java.lang.Class<?> wildcardClass7 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder8 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        org.apache.commons.cli.OptionBuilder optionBuilder9 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        org.apache.commons.cli.OptionBuilder optionBuilder10 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(optionBuilder8);
        org.junit.Assert.assertNotNull(optionBuilder9);
        org.junit.Assert.assertNotNull(optionBuilder10);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        org.apache.commons.cli.OptionBuilder optionBuilder1 = org.apache.commons.cli.OptionBuilder.hasArgs((int) '4');
        java.lang.Class<?> wildcardClass2 = optionBuilder1.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder3 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder4 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        org.apache.commons.cli.OptionBuilder optionBuilder5 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) wildcardClass2);
        java.lang.Class<?> wildcardClass6 = optionBuilder5.getClass();
        org.apache.commons.cli.OptionBuilder optionBuilder7 = org.apache.commons.cli.OptionBuilder.withType((java.lang.Object) optionBuilder5);
        org.junit.Assert.assertNotNull(optionBuilder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(optionBuilder3);
        org.junit.Assert.assertNotNull(optionBuilder4);
        org.junit.Assert.assertNotNull(optionBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(optionBuilder7);
    }
}

