package org.mockito.internal.matchers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
            System.out.format("%n%s%n", "RegressionTest0.test01");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        java.lang.Object obj3 = null;
        org.hamcrest.Description description4 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch(obj3, description4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass4 = same1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) "");
        org.hamcrest.Description description3 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) 0L, description3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) "");
        org.hamcrest.Description description2 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        java.lang.Object obj7 = null;
        org.hamcrest.Description description8 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch(obj7, description8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description5 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str2 = same1.toString();
        java.lang.String str3 = same1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "same(-1)" + "'", str3, "same(-1)");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.String str2 = same1.toString();
        org.hamcrest.Description description3 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(0)" + "'", str2, "same(0)");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        org.hamcrest.Description description2 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str6 = same5.toString();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean9 = same5.matches((java.lang.Object) (-1L));
        org.hamcrest.Description description10 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) boolean9, description10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(-1)" + "'", str6, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.String str2 = same1.toString();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean6 = same4.matches((java.lang.Object) 1.0f);
        same4._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass8 = same4.getClass();
        org.hamcrest.Description description9 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) wildcardClass8, description9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(0)" + "'", str2, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        org.hamcrest.Description description2 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        java.lang.String str4 = same1.toString();
        java.lang.String str5 = same1.toString();
        org.hamcrest.Description description7 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) '4', description7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(0)" + "'", str5, "same(0)");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) "");
        boolean boolean3 = same1.matches((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str8 = same1.toString();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass11 = same10.getClass();
        org.hamcrest.Description description12 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) same10, description12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(0)" + "'", str8, "same(0)");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass2 = same1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1.0f));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean9 = same7.matches((java.lang.Object) 1.0f);
        java.lang.String str10 = same7.toString();
        java.lang.String str11 = same7.toString();
        boolean boolean12 = same5.matches((java.lang.Object) str11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(0)" + "'", str10, "same(0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(0)" + "'", str11, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.String str2 = same1.toString();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.String str5 = same4.toString();
        same4._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Object obj7 = null;
        boolean boolean8 = same4.matches(obj7);
        org.hamcrest.Description description9 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) same4, description9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(0)" + "'", str2, "same(0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(-1)" + "'", str5, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean10 = same8.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean14 = same12.matches((java.lang.Object) 1.0f);
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean17 = same12.matches((java.lang.Object) "same(-1)");
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean19 = same8.matches((java.lang.Object) same12);
        boolean boolean20 = same1.matches((java.lang.Object) boolean19);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description9 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) 10L, description9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.String str2 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(0)" + "'", str2, "same(0)");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        org.hamcrest.Description description4 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) (-1L), description4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        java.lang.String str4 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass2 = same1.getClass();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass2);
        org.hamcrest.Description description4 = null;
        // The following exception was thrown during execution in test generation
        try {
            same3.describeTo(description4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        java.lang.String str4 = same1.toString();
        java.lang.String str5 = same1.toString();
        java.lang.String str6 = same1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(0)" + "'", str5, "same(0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(0)" + "'", str6, "same(0)");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str5 = same1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(0)" + "'", str5, "same(0)");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean7 = same5.matches((java.lang.Object) 1.0f);
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean10 = same5.matches((java.lang.Object) "same(-1)");
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean12 = same1.matches((java.lang.Object) same5);
        java.lang.Class<?> wildcardClass13 = same5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        org.mockito.internal.matchers.Same same2 = new org.mockito.internal.matchers.Same(obj0);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) 1.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean6 = same1.matches((java.lang.Object) "same(-1)");
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.Object obj8 = new java.lang.Object();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same(obj8);
        boolean boolean10 = same7.matches(obj8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }
}

