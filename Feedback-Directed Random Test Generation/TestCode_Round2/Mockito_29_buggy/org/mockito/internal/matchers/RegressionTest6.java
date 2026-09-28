package org.mockito.internal.matchers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        java.lang.Object obj2 = new java.lang.Object();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same(obj2);
        boolean boolean5 = same3.matches((java.lang.Object) 100);
        boolean boolean6 = same1.matches((java.lang.Object) 100);
        java.lang.String str7 = same1.toString();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) str7);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean12 = same10.matches((java.lang.Object) ' ');
        boolean boolean14 = same10.matches((java.lang.Object) 10.0f);
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str16 = same10.toString();
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean20 = same18.matches((java.lang.Object) ' ');
        boolean boolean22 = same18.matches((java.lang.Object) 10.0f);
        same18._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean24 = same10.matches((java.lang.Object) same18);
        java.lang.Class<?> wildcardClass25 = same18.getClass();
        boolean boolean26 = same8.matches((java.lang.Object) wildcardClass25);
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) same8);
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        same29._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same32._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str36 = same35.toString();
        boolean boolean38 = same35.matches((java.lang.Object) (byte) -1);
        boolean boolean39 = same32.matches((java.lang.Object) boolean38);
        java.lang.Class<?> wildcardClass40 = same32.getClass();
        org.mockito.internal.matchers.Same same41 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass40);
        java.lang.String str42 = same41.toString();
        same41._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same44 = new org.mockito.internal.matchers.Same((java.lang.Object) same41);
        org.mockito.internal.matchers.Same same45 = new org.mockito.internal.matchers.Same((java.lang.Object) same44);
        boolean boolean46 = same29.matches((java.lang.Object) same45);
        boolean boolean47 = same27.matches((java.lang.Object) same29);
        org.mockito.internal.matchers.Same same48 = new org.mockito.internal.matchers.Same((java.lang.Object) same29);
        org.mockito.internal.matchers.Same same50 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str51 = same50.toString();
        boolean boolean53 = same50.matches((java.lang.Object) (byte) -1);
        boolean boolean55 = same50.matches((java.lang.Object) (short) 10);
        java.lang.Object obj56 = new java.lang.Object();
        org.mockito.internal.matchers.Same same57 = new org.mockito.internal.matchers.Same(obj56);
        org.mockito.internal.matchers.Same same59 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean61 = same59.matches((java.lang.Object) ' ');
        java.lang.String str62 = same59.toString();
        java.lang.Class<?> wildcardClass63 = same59.getClass();
        boolean boolean64 = same57.matches((java.lang.Object) wildcardClass63);
        boolean boolean65 = same50.matches((java.lang.Object) wildcardClass63);
        java.lang.String str66 = same50.toString();
        org.mockito.internal.matchers.Same same68 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        same68._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean71 = same68.matches((java.lang.Object) (short) 100);
        java.lang.Object obj72 = new java.lang.Object();
        org.mockito.internal.matchers.Same same73 = new org.mockito.internal.matchers.Same(obj72);
        boolean boolean74 = same68.matches((java.lang.Object) same73);
        same73._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same77 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same77._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same80 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        boolean boolean81 = same77.matches((java.lang.Object) (short) -1);
        same77._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean83 = same73.matches((java.lang.Object) same77);
        boolean boolean84 = same50.matches((java.lang.Object) same73);
        same73._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean86 = same48.matches((java.lang.Object) same73);
        same48._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(0)" + "'", str7, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "same(' ')" + "'", str16, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "same(' ')" + "'", str36, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str42, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "same(' ')" + "'", str51, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "same(' ')" + "'", str62, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "same(' ')" + "'", str66, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0d));
        java.lang.String str4 = same1.toString();
        boolean boolean6 = same1.matches((java.lang.Object) "same(1)");
        java.lang.String str7 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Object obj9 = null;
        boolean boolean10 = same1.matches(obj9);
        java.lang.String str11 = same1.toString();
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean15 = same13.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str18 = same17.toString();
        boolean boolean20 = same17.matches((java.lang.Object) (byte) -1);
        boolean boolean21 = same13.matches((java.lang.Object) (byte) -1);
        same13._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean23 = same1.matches((java.lang.Object) same13);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(0)" + "'", str7, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(0)" + "'", str11, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "same(' ')" + "'", str18, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean6 = same1.matches((java.lang.Object) same5);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean9 = same1.matches((java.lang.Object) "same(100)");
        java.lang.String str10 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(' ')" + "'", str10, "same(' ')");
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str2 = same1.toString();
        boolean boolean4 = same1.matches((java.lang.Object) (byte) -1);
        boolean boolean6 = same1.matches((java.lang.Object) (short) 10);
        java.lang.Object obj7 = new java.lang.Object();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same(obj7);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean12 = same10.matches((java.lang.Object) ' ');
        java.lang.String str13 = same10.toString();
        java.lang.Class<?> wildcardClass14 = same10.getClass();
        boolean boolean15 = same8.matches((java.lang.Object) wildcardClass14);
        boolean boolean16 = same1.matches((java.lang.Object) wildcardClass14);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass14);
        java.lang.String str18 = same17.toString();
        boolean boolean20 = same17.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean24 = same22.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean28 = same26.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean31 = same26.matches((java.lang.Object) same30);
        boolean boolean33 = same30.matches((java.lang.Object) 1);
        boolean boolean35 = same30.matches((java.lang.Object) 10.0f);
        java.lang.String str36 = same30.toString();
        java.lang.Class<?> wildcardClass37 = same30.getClass();
        boolean boolean38 = same22.matches((java.lang.Object) same30);
        org.mockito.internal.matchers.Same same40 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean42 = same40.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same44 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str45 = same44.toString();
        boolean boolean47 = same44.matches((java.lang.Object) (byte) -1);
        boolean boolean48 = same40.matches((java.lang.Object) (byte) -1);
        same40._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same40._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same51 = new org.mockito.internal.matchers.Same((java.lang.Object) same40);
        java.lang.String str52 = same40.toString();
        org.mockito.internal.matchers.Same same54 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        org.mockito.internal.matchers.Same same55 = new org.mockito.internal.matchers.Same((java.lang.Object) same54);
        org.mockito.internal.matchers.Same same56 = new org.mockito.internal.matchers.Same((java.lang.Object) same55);
        boolean boolean57 = same40.matches((java.lang.Object) same56);
        same40._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same60 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same62 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean64 = same62.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same66 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean67 = same62.matches((java.lang.Object) same66);
        boolean boolean69 = same66.matches((java.lang.Object) 1);
        boolean boolean71 = same66.matches((java.lang.Object) 10.0f);
        org.mockito.internal.matchers.Same same73 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str74 = same73.toString();
        boolean boolean76 = same73.matches((java.lang.Object) 1L);
        boolean boolean77 = same66.matches((java.lang.Object) boolean76);
        java.lang.String str78 = same66.toString();
        boolean boolean79 = same60.matches((java.lang.Object) str78);
        java.lang.String str80 = same60.toString();
        boolean boolean81 = same40.matches((java.lang.Object) same60);
        java.lang.String str82 = same40.toString();
        boolean boolean83 = same30.matches((java.lang.Object) same40);
        org.mockito.internal.matchers.Same same84 = new org.mockito.internal.matchers.Same((java.lang.Object) same40);
        java.lang.Class<?> wildcardClass85 = same84.getClass();
        org.hamcrest.Description description86 = null;
        // The following exception was thrown during execution in test generation
        try {
            same17.describeMismatch((java.lang.Object) wildcardClass85, description86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(' ')" + "'", str2, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(' ')" + "'", str13, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str18, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "same(' ')" + "'", str36, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "same(' ')" + "'", str45, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "same(' ')" + "'", str52, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "same(' ')" + "'", str74, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "same(' ')" + "'", str78, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "same(' ')" + "'", str80, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "same(' ')" + "'", str82, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        java.lang.String str4 = same1.toString();
        java.lang.String str5 = same1.toString();
        java.lang.String str6 = same1.toString();
        java.lang.String str7 = same1.toString();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) 0.0f);
        boolean boolean10 = same1.matches((java.lang.Object) same9);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean14 = same12.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean17 = same12.matches((java.lang.Object) same16);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same12);
        java.lang.String str19 = same18.toString();
        java.lang.String str20 = same18.toString();
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) same18);
        boolean boolean22 = same9.matches((java.lang.Object) same21);
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean22);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "same(same(' '))" + "'", str19, "same(same(' '))");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "same(same(' '))" + "'", str20, "same(same(' '))");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean6 = same1.matches((java.lang.Object) same5);
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str9 = same8.toString();
        boolean boolean11 = same8.matches((java.lang.Object) (byte) -1);
        boolean boolean13 = same8.matches((java.lang.Object) (short) 10);
        boolean boolean14 = same1.matches((java.lang.Object) same8);
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) same8);
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same16);
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        java.lang.Object obj21 = new java.lang.Object();
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same(obj21);
        boolean boolean24 = same22.matches((java.lang.Object) 100);
        boolean boolean25 = same20.matches((java.lang.Object) 100);
        java.lang.String str26 = same20.toString();
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) str26);
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean31 = same29.matches((java.lang.Object) ' ');
        boolean boolean33 = same29.matches((java.lang.Object) 10.0f);
        same29._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str35 = same29.toString();
        org.mockito.internal.matchers.Same same37 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean39 = same37.matches((java.lang.Object) ' ');
        boolean boolean41 = same37.matches((java.lang.Object) 10.0f);
        same37._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean43 = same29.matches((java.lang.Object) same37);
        java.lang.Class<?> wildcardClass44 = same37.getClass();
        boolean boolean45 = same27.matches((java.lang.Object) wildcardClass44);
        org.mockito.internal.matchers.Same same46 = new org.mockito.internal.matchers.Same((java.lang.Object) same27);
        org.mockito.internal.matchers.Same same48 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        same48._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same51 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same51._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same54 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str55 = same54.toString();
        boolean boolean57 = same54.matches((java.lang.Object) (byte) -1);
        boolean boolean58 = same51.matches((java.lang.Object) boolean57);
        java.lang.Class<?> wildcardClass59 = same51.getClass();
        org.mockito.internal.matchers.Same same60 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass59);
        java.lang.String str61 = same60.toString();
        same60._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same63 = new org.mockito.internal.matchers.Same((java.lang.Object) same60);
        org.mockito.internal.matchers.Same same64 = new org.mockito.internal.matchers.Same((java.lang.Object) same63);
        boolean boolean65 = same48.matches((java.lang.Object) same64);
        boolean boolean66 = same46.matches((java.lang.Object) same48);
        java.lang.String str67 = same48.toString();
        boolean boolean68 = same18.matches((java.lang.Object) str67);
        java.lang.String str69 = same18.toString();
        org.mockito.internal.matchers.Same same70 = new org.mockito.internal.matchers.Same((java.lang.Object) same18);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(' ')" + "'", str9, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "same(0)" + "'", str26, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "same(' ')" + "'", str35, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "same(' ')" + "'", str55, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str61, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "same(10)" + "'", str67, "same(10)");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "same(same(same(' ')))" + "'", str69, "same(same(same(' ')))");
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.String str2 = same1.toString();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean6 = same4.matches((java.lang.Object) ' ');
        boolean boolean8 = same4.matches((java.lang.Object) 10.0f);
        same4._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str10 = same4.toString();
        boolean boolean11 = same1.matches((java.lang.Object) same4);
        java.lang.Class<?> wildcardClass12 = same1.getClass();
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str14 = same13.toString();
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str20 = same19.toString();
        boolean boolean22 = same19.matches((java.lang.Object) (byte) -1);
        boolean boolean23 = same16.matches((java.lang.Object) boolean22);
        java.lang.Object obj24 = new java.lang.Object();
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same(obj24);
        boolean boolean26 = same16.matches(obj24);
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) same16);
        boolean boolean30 = same13.matches((java.lang.Object) same16);
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same32._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str36 = same35.toString();
        boolean boolean38 = same35.matches((java.lang.Object) (byte) -1);
        boolean boolean39 = same32.matches((java.lang.Object) boolean38);
        org.mockito.internal.matchers.Same same40 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean39);
        java.lang.String str41 = same40.toString();
        same40._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass43 = same40.getClass();
        boolean boolean44 = same16.matches((java.lang.Object) same40);
        java.lang.Object obj45 = new java.lang.Object();
        org.mockito.internal.matchers.Same same46 = new org.mockito.internal.matchers.Same(obj45);
        org.mockito.internal.matchers.Same same48 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean50 = same48.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same52 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str53 = same52.toString();
        boolean boolean55 = same52.matches((java.lang.Object) (byte) -1);
        boolean boolean56 = same48.matches((java.lang.Object) (byte) -1);
        same48._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same48._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same59 = new org.mockito.internal.matchers.Same((java.lang.Object) same48);
        java.lang.Class<?> wildcardClass60 = same48.getClass();
        boolean boolean61 = same46.matches((java.lang.Object) same48);
        boolean boolean62 = same16.matches((java.lang.Object) boolean61);
        java.lang.Class<?> wildcardClass63 = same16.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(0)" + "'", str2, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(' ')" + "'", str10, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(same(0))" + "'", str14, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "same(' ')" + "'", str20, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "same(' ')" + "'", str36, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "same(false)" + "'", str41, "same(false)");
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "same(' ')" + "'", str53, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same2 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str3 = same2.toString();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) same2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "same(same(-1.0))" + "'", str3, "same(same(-1.0))");
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean6 = same1.matches((java.lang.Object) same5);
        boolean boolean8 = same5.matches((java.lang.Object) 1);
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean8);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean8);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean8);
        java.lang.String str12 = same11.toString();
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) str12);
        org.hamcrest.Description description14 = null;
        // The following exception was thrown during execution in test generation
        try {
            same13.describeTo(description14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "same(false)" + "'", str12, "same(false)");
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        java.lang.String str4 = same1.toString();
        java.lang.String str5 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) same8);
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass14 = same12.getClass();
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) same12);
        boolean boolean16 = same8.matches((java.lang.Object) same12);
        java.lang.String str17 = same8.toString();
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same8);
        org.hamcrest.Description description19 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) same18, description19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(' ')" + "'", str4, "same(' ')");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(' ')" + "'", str5, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "same(1.0)" + "'", str17, "same(1.0)");
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        boolean boolean3 = same1.matches((java.lang.Object) (byte) 100);
        java.lang.String str4 = same1.toString();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str6 = same5.toString();
        java.lang.String str7 = same5.toString();
        java.lang.String str8 = same5.toString();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean12 = same10.matches((java.lang.Object) (short) -1);
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        boolean boolean15 = same5.matches((java.lang.Object) same14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(-1)" + "'", str4, "same(-1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(same(-1))" + "'", str6, "same(same(-1))");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(same(-1))" + "'", str7, "same(same(-1))");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(same(-1))" + "'", str8, "same(same(-1))");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        boolean boolean3 = same1.matches((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass4 = same1.getClass();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean10 = same8.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str13 = same12.toString();
        boolean boolean15 = same12.matches((java.lang.Object) (byte) -1);
        boolean boolean16 = same8.matches((java.lang.Object) (byte) -1);
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) same8);
        java.lang.String str20 = same8.toString();
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) same22);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) same23);
        boolean boolean25 = same8.matches((java.lang.Object) same24);
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean32 = same30.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean35 = same30.matches((java.lang.Object) same34);
        boolean boolean37 = same34.matches((java.lang.Object) 1);
        boolean boolean39 = same34.matches((java.lang.Object) 10.0f);
        org.mockito.internal.matchers.Same same41 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str42 = same41.toString();
        boolean boolean44 = same41.matches((java.lang.Object) 1L);
        boolean boolean45 = same34.matches((java.lang.Object) boolean44);
        java.lang.String str46 = same34.toString();
        boolean boolean47 = same28.matches((java.lang.Object) str46);
        java.lang.String str48 = same28.toString();
        boolean boolean49 = same8.matches((java.lang.Object) same28);
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean52 = same6.matches((java.lang.Object) same8);
        org.hamcrest.Description description53 = null;
        // The following exception was thrown during execution in test generation
        try {
            same8.describeTo(description53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(' ')" + "'", str13, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "same(' ')" + "'", str20, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "same(' ')" + "'", str42, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "same(' ')" + "'", str46, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "same(' ')" + "'", str48, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean6 = same1.matches((java.lang.Object) same5);
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str9 = same8.toString();
        boolean boolean11 = same8.matches((java.lang.Object) (byte) -1);
        boolean boolean13 = same8.matches((java.lang.Object) (short) 10);
        boolean boolean14 = same1.matches((java.lang.Object) same8);
        java.lang.String str15 = same1.toString();
        java.lang.Class<?> wildcardClass16 = same1.getClass();
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass16);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same17);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) same17);
        same17._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(' ')" + "'", str9, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(' ')" + "'", str15, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str9 = same8.toString();
        boolean boolean11 = same8.matches((java.lang.Object) (byte) -1);
        boolean boolean12 = same5.matches((java.lang.Object) boolean11);
        java.lang.Class<?> wildcardClass13 = same5.getClass();
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass13);
        java.lang.String str15 = same14.toString();
        java.lang.String str16 = same14.toString();
        java.lang.Class<?> wildcardClass17 = same14.getClass();
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass17);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) same18);
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) same19);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) same20);
        same21._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean23 = same1.matches((java.lang.Object) same21);
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean27 = same25.matches((java.lang.Object) ' ');
        boolean boolean29 = same25.matches((java.lang.Object) 10.0f);
        same25._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str31 = same25.toString();
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean35 = same33.matches((java.lang.Object) ' ');
        boolean boolean37 = same33.matches((java.lang.Object) 10.0f);
        same33._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean39 = same25.matches((java.lang.Object) same33);
        java.lang.String str40 = same25.toString();
        same25._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str42 = same25.toString();
        boolean boolean43 = same1.matches((java.lang.Object) str42);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(' ')" + "'", str9, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str15, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str16, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "same(' ')" + "'", str31, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "same(' ')" + "'", str40, "same(' ')");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "same(' ')" + "'", str42, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) (short) -1);
        java.lang.String str4 = same1.toString();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str8 = same7.toString();
        boolean boolean10 = same7.matches((java.lang.Object) (byte) -1);
        boolean boolean12 = same7.matches((java.lang.Object) (short) 10);
        java.lang.Object obj13 = new java.lang.Object();
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same(obj13);
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean18 = same16.matches((java.lang.Object) ' ');
        java.lang.String str19 = same16.toString();
        java.lang.Class<?> wildcardClass20 = same16.getClass();
        boolean boolean21 = same14.matches((java.lang.Object) wildcardClass20);
        boolean boolean22 = same7.matches((java.lang.Object) wildcardClass20);
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass20);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) same23);
        boolean boolean26 = same24.matches((java.lang.Object) (short) 1);
        same24._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) same24);
        java.lang.Class<?> wildcardClass29 = same28.getClass();
        org.hamcrest.Description description30 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) same28, description30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(' ')" + "'", str8, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "same(' ')" + "'", str19, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean5 = same3.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean8 = same3.matches((java.lang.Object) same7);
        boolean boolean10 = same7.matches((java.lang.Object) 1);
        boolean boolean12 = same7.matches((java.lang.Object) 10.0f);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str15 = same14.toString();
        boolean boolean17 = same14.matches((java.lang.Object) 1L);
        boolean boolean18 = same7.matches((java.lang.Object) boolean17);
        java.lang.String str19 = same7.toString();
        boolean boolean20 = same1.matches((java.lang.Object) str19);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str25 = same24.toString();
        boolean boolean27 = same24.matches((java.lang.Object) (byte) -1);
        boolean boolean29 = same24.matches((java.lang.Object) (short) 10);
        java.lang.Object obj30 = new java.lang.Object();
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same(obj30);
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean35 = same33.matches((java.lang.Object) ' ');
        java.lang.String str36 = same33.toString();
        java.lang.Class<?> wildcardClass37 = same33.getClass();
        boolean boolean38 = same31.matches((java.lang.Object) wildcardClass37);
        boolean boolean39 = same24.matches((java.lang.Object) wildcardClass37);
        org.mockito.internal.matchers.Same same40 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass37);
        org.mockito.internal.matchers.Same same41 = new org.mockito.internal.matchers.Same((java.lang.Object) same40);
        boolean boolean42 = same1.matches((java.lang.Object) same40);
        org.mockito.internal.matchers.Same same44 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean46 = same44.matches((java.lang.Object) ' ');
        boolean boolean48 = same44.matches((java.lang.Object) 10.0f);
        same44._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str50 = same44.toString();
        org.mockito.internal.matchers.Same same52 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        org.mockito.internal.matchers.Same same53 = new org.mockito.internal.matchers.Same((java.lang.Object) same52);
        org.mockito.internal.matchers.Same same55 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean57 = same55.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same59 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean60 = same55.matches((java.lang.Object) same59);
        boolean boolean62 = same59.matches((java.lang.Object) 1);
        boolean boolean64 = same59.matches((java.lang.Object) 10.0f);
        boolean boolean66 = same59.matches((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass67 = same59.getClass();
        boolean boolean68 = same53.matches((java.lang.Object) wildcardClass67);
        boolean boolean69 = same44.matches((java.lang.Object) wildcardClass67);
        boolean boolean70 = same40.matches((java.lang.Object) wildcardClass67);
        org.mockito.internal.matchers.Same same71 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass67);
        org.mockito.internal.matchers.Same same72 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass67);
        org.mockito.internal.matchers.Same same73 = new org.mockito.internal.matchers.Same((java.lang.Object) same72);
        org.mockito.internal.matchers.Same same75 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean77 = same75.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same79 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean80 = same75.matches((java.lang.Object) same79);
        boolean boolean82 = same79.matches((java.lang.Object) 1);
        boolean boolean84 = same79.matches((java.lang.Object) 10.0f);
        java.lang.String str85 = same79.toString();
        org.mockito.internal.matchers.Same same86 = new org.mockito.internal.matchers.Same((java.lang.Object) str85);
        boolean boolean87 = same73.matches((java.lang.Object) same86);
        java.lang.String str88 = same73.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(' ')" + "'", str15, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "same(' ')" + "'", str19, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "same(' ')" + "'", str25, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "same(' ')" + "'", str36, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "same(' ')" + "'", str50, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "same(' ')" + "'", str85, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "same(same(class org.mockito.internal.matchers.Same))" + "'", str88, "same(same(class org.mockito.internal.matchers.Same))");
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str5 = same4.toString();
        boolean boolean7 = same4.matches((java.lang.Object) (byte) -1);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        java.lang.Class<?> wildcardClass9 = same1.getClass();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass9);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        boolean boolean14 = same12.matches((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass15 = same12.getClass();
        boolean boolean16 = same10.matches((java.lang.Object) same12);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) same12);
        java.lang.Object obj18 = null;
        boolean boolean19 = same17.matches(obj18);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) same21);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean26 = same24.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean29 = same24.matches((java.lang.Object) same28);
        boolean boolean31 = same28.matches((java.lang.Object) 1);
        boolean boolean33 = same28.matches((java.lang.Object) 10.0f);
        boolean boolean35 = same28.matches((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass36 = same28.getClass();
        boolean boolean37 = same22.matches((java.lang.Object) wildcardClass36);
        org.mockito.internal.matchers.Same same38 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass36);
        boolean boolean39 = same17.matches((java.lang.Object) same38);
        org.mockito.internal.matchers.Same same40 = new org.mockito.internal.matchers.Same((java.lang.Object) same17);
        org.mockito.internal.matchers.Same same42 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean44 = same42.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same46 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str47 = same46.toString();
        boolean boolean49 = same46.matches((java.lang.Object) (byte) -1);
        boolean boolean50 = same42.matches((java.lang.Object) (byte) -1);
        same42._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same42._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same53 = new org.mockito.internal.matchers.Same((java.lang.Object) same42);
        org.mockito.internal.matchers.Same same54 = new org.mockito.internal.matchers.Same((java.lang.Object) same42);
        org.mockito.internal.matchers.Same same56 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        same56._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str58 = same56.toString();
        same56._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same56._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean61 = same42.matches((java.lang.Object) same56);
        org.mockito.internal.matchers.Same same63 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        same63._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean66 = same63.matches((java.lang.Object) (short) 100);
        java.lang.Object obj67 = new java.lang.Object();
        org.mockito.internal.matchers.Same same68 = new org.mockito.internal.matchers.Same(obj67);
        boolean boolean69 = same63.matches((java.lang.Object) same68);
        same68._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass71 = same68.getClass();
        org.mockito.internal.matchers.Same same72 = new org.mockito.internal.matchers.Same((java.lang.Object) same68);
        boolean boolean73 = same56.matches((java.lang.Object) same68);
        same56._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass75 = same56.getClass();
        boolean boolean76 = same40.matches((java.lang.Object) wildcardClass75);
        same40._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(' ')" + "'", str5, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "same(' ')" + "'", str47, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "same(1.0)" + "'", str58, "same(1.0)");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str5 = same4.toString();
        boolean boolean7 = same4.matches((java.lang.Object) (byte) -1);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        java.lang.Class<?> wildcardClass9 = same1.getClass();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass9);
        java.lang.String str11 = same10.toString();
        java.lang.String str12 = same10.toString();
        java.lang.Class<?> wildcardClass13 = same10.getClass();
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass13);
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) same14);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean19 = same17.matches((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass20 = same17.getClass();
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass20);
        boolean boolean22 = same15.matches((java.lang.Object) same21);
        java.lang.String str23 = same21.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(' ')" + "'", str5, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str11, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str12, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str23, "same(class org.mockito.internal.matchers.Same)");
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean6 = same1.matches((java.lang.Object) same5);
        boolean boolean8 = same5.matches((java.lang.Object) 1);
        boolean boolean10 = same5.matches((java.lang.Object) 10.0f);
        boolean boolean12 = same5.matches((java.lang.Object) 10);
        java.lang.String str13 = same5.toString();
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean17 = same15.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean20 = same15.matches((java.lang.Object) same19);
        boolean boolean22 = same19.matches((java.lang.Object) 1);
        boolean boolean24 = same19.matches((java.lang.Object) 10.0f);
        boolean boolean26 = same19.matches((java.lang.Object) 10);
        boolean boolean27 = same5.matches((java.lang.Object) boolean26);
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) same5);
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) same29);
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) same30);
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) same30);
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) same30);
        same30._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(' ')" + "'", str13, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        java.lang.String str4 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description6 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean6 = same1.matches((java.lang.Object) same5);
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str9 = same8.toString();
        boolean boolean11 = same8.matches((java.lang.Object) (byte) -1);
        boolean boolean13 = same8.matches((java.lang.Object) (short) 10);
        boolean boolean14 = same1.matches((java.lang.Object) same8);
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) same8);
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same16);
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean23 = same21.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean26 = same21.matches((java.lang.Object) same25);
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str29 = same28.toString();
        boolean boolean31 = same28.matches((java.lang.Object) (byte) -1);
        boolean boolean33 = same28.matches((java.lang.Object) (short) 10);
        boolean boolean34 = same21.matches((java.lang.Object) same28);
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same((java.lang.Object) same21);
        boolean boolean36 = same16.matches((java.lang.Object) same21);
        java.lang.String str37 = same21.toString();
        same21._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same21._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same40 = new org.mockito.internal.matchers.Same((java.lang.Object) same21);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(' ')" + "'", str9, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "same(' ')" + "'", str29, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "same(' ')" + "'", str37, "same(' ')");
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean6 = same1.matches((java.lang.Object) same5);
        boolean boolean8 = same5.matches((java.lang.Object) 1);
        boolean boolean10 = same5.matches((java.lang.Object) 10.0f);
        boolean boolean12 = same5.matches((java.lang.Object) 10);
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) same5);
        java.lang.String str15 = same5.toString();
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) str15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(' ')" + "'", str15, "same(' ')");
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) (short) -1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str5 = same1.toString();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean9 = same7.matches((java.lang.Object) (-1.0d));
        java.lang.String str10 = same7.toString();
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        java.lang.Object obj13 = new java.lang.Object();
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same(obj13);
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean18 = same16.matches((java.lang.Object) ' ');
        java.lang.String str19 = same16.toString();
        java.lang.Class<?> wildcardClass20 = same16.getClass();
        boolean boolean21 = same14.matches((java.lang.Object) wildcardClass20);
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean21);
        boolean boolean23 = same7.matches((java.lang.Object) boolean21);
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same25._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str29 = same28.toString();
        boolean boolean31 = same28.matches((java.lang.Object) (byte) -1);
        boolean boolean32 = same25.matches((java.lang.Object) boolean31);
        java.lang.Class<?> wildcardClass33 = same25.getClass();
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass33);
        java.lang.String str35 = same34.toString();
        same34._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same37 = new org.mockito.internal.matchers.Same((java.lang.Object) same34);
        org.mockito.internal.matchers.Same same38 = new org.mockito.internal.matchers.Same((java.lang.Object) same37);
        boolean boolean39 = same7.matches((java.lang.Object) same37);
        org.mockito.internal.matchers.Same same40 = new org.mockito.internal.matchers.Same((java.lang.Object) same37);
        java.lang.String str41 = same37.toString();
        boolean boolean42 = same1.matches((java.lang.Object) str41);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(0)" + "'", str5, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(0)" + "'", str10, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "same(' ')" + "'", str19, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "same(' ')" + "'", str29, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str35, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "same(same(class org.mockito.internal.matchers.Same))" + "'", str41, "same(same(class org.mockito.internal.matchers.Same))");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str5 = same4.toString();
        boolean boolean7 = same4.matches((java.lang.Object) (byte) -1);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        java.lang.Class<?> wildcardClass9 = same1.getClass();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass9);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str14 = same13.toString();
        boolean boolean16 = same13.matches((java.lang.Object) (byte) -1);
        boolean boolean18 = same13.matches((java.lang.Object) (short) 10);
        java.lang.Object obj19 = new java.lang.Object();
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same(obj19);
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean24 = same22.matches((java.lang.Object) ' ');
        java.lang.String str25 = same22.toString();
        java.lang.Class<?> wildcardClass26 = same22.getClass();
        boolean boolean27 = same20.matches((java.lang.Object) wildcardClass26);
        boolean boolean28 = same13.matches((java.lang.Object) wildcardClass26);
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass26);
        boolean boolean30 = same11.matches((java.lang.Object) same29);
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) same29);
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) same31);
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) same32);
        java.lang.Class<?> wildcardClass34 = same32.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(' ')" + "'", str5, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(' ')" + "'", str14, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "same(' ')" + "'", str25, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean7 = same5.matches((java.lang.Object) ' ');
        boolean boolean9 = same5.matches((java.lang.Object) 10.0f);
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str11 = same5.toString();
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean15 = same13.matches((java.lang.Object) ' ');
        boolean boolean17 = same13.matches((java.lang.Object) 10.0f);
        same13._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean19 = same5.matches((java.lang.Object) same13);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean22 = same13.matches((java.lang.Object) same21);
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) same21);
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean27 = same25.matches((java.lang.Object) (-1.0d));
        java.lang.String str28 = same25.toString();
        same25._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) same25);
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean34 = same32.matches((java.lang.Object) (-1.0d));
        java.lang.String str35 = same32.toString();
        same32._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same37 = new org.mockito.internal.matchers.Same((java.lang.Object) same32);
        org.mockito.internal.matchers.Same same38 = new org.mockito.internal.matchers.Same((java.lang.Object) same32);
        boolean boolean39 = same30.matches((java.lang.Object) same32);
        org.mockito.internal.matchers.Same same41 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean43 = same41.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same45 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str46 = same45.toString();
        boolean boolean48 = same45.matches((java.lang.Object) (byte) -1);
        boolean boolean49 = same41.matches((java.lang.Object) (byte) -1);
        same41._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same41._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same52 = new org.mockito.internal.matchers.Same((java.lang.Object) same41);
        java.lang.String str53 = same41.toString();
        org.mockito.internal.matchers.Same same55 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        org.mockito.internal.matchers.Same same56 = new org.mockito.internal.matchers.Same((java.lang.Object) same55);
        org.mockito.internal.matchers.Same same57 = new org.mockito.internal.matchers.Same((java.lang.Object) same56);
        boolean boolean58 = same41.matches((java.lang.Object) same57);
        same41._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean60 = same30.matches((java.lang.Object) same41);
        boolean boolean61 = same23.matches((java.lang.Object) same30);
        org.mockito.internal.matchers.Same same62 = new org.mockito.internal.matchers.Same((java.lang.Object) same30);
        same30._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str64 = same30.toString();
        org.hamcrest.Description description65 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) same30, description65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(' ')" + "'", str11, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "same(0)" + "'", str28, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "same(0)" + "'", str35, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "same(' ')" + "'", str46, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "same(' ')" + "'", str53, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "same(same(0))" + "'", str64, "same(same(0))");
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        java.lang.String str4 = same1.toString();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        same6._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean9 = same6.matches((java.lang.Object) (short) 100);
        java.lang.Object obj10 = new java.lang.Object();
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same(obj10);
        boolean boolean12 = same6.matches((java.lang.Object) same11);
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean15 = same1.matches((java.lang.Object) same11);
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean20 = same18.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean23 = same18.matches((java.lang.Object) same22);
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str26 = same25.toString();
        boolean boolean28 = same25.matches((java.lang.Object) (byte) -1);
        boolean boolean30 = same25.matches((java.lang.Object) (short) 10);
        boolean boolean31 = same18.matches((java.lang.Object) same25);
        java.lang.String str32 = same25.toString();
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean36 = same34.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same38 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean39 = same34.matches((java.lang.Object) same38);
        boolean boolean41 = same38.matches((java.lang.Object) 1);
        boolean boolean43 = same38.matches((java.lang.Object) 10.0f);
        boolean boolean45 = same38.matches((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass46 = same38.getClass();
        boolean boolean47 = same25.matches((java.lang.Object) wildcardClass46);
        org.mockito.internal.matchers.Same same49 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean51 = same49.matches((java.lang.Object) (-1.0d));
        java.lang.String str52 = same49.toString();
        same49._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same54 = new org.mockito.internal.matchers.Same((java.lang.Object) same49);
        java.lang.Object obj55 = new java.lang.Object();
        org.mockito.internal.matchers.Same same56 = new org.mockito.internal.matchers.Same(obj55);
        org.mockito.internal.matchers.Same same58 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean60 = same58.matches((java.lang.Object) ' ');
        java.lang.String str61 = same58.toString();
        java.lang.Class<?> wildcardClass62 = same58.getClass();
        boolean boolean63 = same56.matches((java.lang.Object) wildcardClass62);
        org.mockito.internal.matchers.Same same64 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean63);
        boolean boolean65 = same49.matches((java.lang.Object) boolean63);
        same49._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same67 = new org.mockito.internal.matchers.Same((java.lang.Object) same49);
        org.mockito.internal.matchers.Same same68 = new org.mockito.internal.matchers.Same((java.lang.Object) same67);
        org.mockito.internal.matchers.Same same69 = new org.mockito.internal.matchers.Same((java.lang.Object) same67);
        boolean boolean70 = same25.matches((java.lang.Object) same67);
        boolean boolean71 = same11.matches((java.lang.Object) same67);
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description73 = null;
        // The following exception was thrown during execution in test generation
        try {
            same11.describeTo(description73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(' ')" + "'", str4, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "same(' ')" + "'", str26, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "same(' ')" + "'", str32, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "same(0)" + "'", str52, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "same(' ')" + "'", str61, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same4._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str8 = same7.toString();
        boolean boolean10 = same7.matches((java.lang.Object) (byte) -1);
        boolean boolean11 = same4.matches((java.lang.Object) boolean10);
        java.lang.Class<?> wildcardClass12 = same4.getClass();
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass12);
        java.lang.String str14 = same13.toString();
        same13._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) same13);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) same16);
        boolean boolean18 = same1.matches((java.lang.Object) same17);
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        boolean boolean22 = same20.matches((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass23 = same20.getClass();
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) same20);
        java.lang.Class<?> wildcardClass25 = same24.getClass();
        org.hamcrest.Description description26 = null;
        // The following exception was thrown during execution in test generation
        try {
            same17.describeMismatch((java.lang.Object) same24, description26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(' ')" + "'", str8, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str14, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str6 = same5.toString();
        boolean boolean8 = same5.matches((java.lang.Object) (byte) -1);
        boolean boolean9 = same1.matches((java.lang.Object) (byte) -1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) 1L);
        java.lang.String str16 = same15.toString();
        boolean boolean17 = same13.matches((java.lang.Object) same15);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same19._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str23 = same22.toString();
        boolean boolean25 = same22.matches((java.lang.Object) (byte) -1);
        boolean boolean26 = same19.matches((java.lang.Object) boolean25);
        java.lang.Class<?> wildcardClass27 = same19.getClass();
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass27);
        same28._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean30 = same15.matches((java.lang.Object) same28);
        org.hamcrest.Description description31 = null;
        // The following exception was thrown during execution in test generation
        try {
            same15.describeTo(description31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(' ')" + "'", str6, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "same(1)" + "'", str16, "same(1)");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "same(' ')" + "'", str23, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        java.lang.String str4 = same1.toString();
        java.lang.String str5 = same1.toString();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean9 = same7.matches((java.lang.Object) (-1.0d));
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str12 = same11.toString();
        boolean boolean14 = same11.matches((java.lang.Object) (byte) -1);
        boolean boolean16 = same11.matches((java.lang.Object) (short) 10);
        java.lang.Object obj17 = new java.lang.Object();
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same(obj17);
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean22 = same20.matches((java.lang.Object) ' ');
        java.lang.String str23 = same20.toString();
        java.lang.Class<?> wildcardClass24 = same20.getClass();
        boolean boolean25 = same18.matches((java.lang.Object) wildcardClass24);
        boolean boolean26 = same11.matches((java.lang.Object) wildcardClass24);
        boolean boolean27 = same7.matches((java.lang.Object) boolean26);
        java.lang.String str28 = same7.toString();
        boolean boolean30 = same7.matches((java.lang.Object) (short) 0);
        boolean boolean31 = same1.matches((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same32._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass34 = same32.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "same(' ')" + "'", str12, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "same(' ')" + "'", str23, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "same(0)" + "'", str28, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str6 = same5.toString();
        boolean boolean8 = same5.matches((java.lang.Object) (byte) -1);
        boolean boolean9 = same1.matches((java.lang.Object) (byte) -1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.Object obj12 = new java.lang.Object();
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same(obj12);
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean17 = same15.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str20 = same19.toString();
        boolean boolean22 = same19.matches((java.lang.Object) (byte) -1);
        boolean boolean23 = same15.matches((java.lang.Object) (byte) -1);
        same15._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same15._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) same15);
        java.lang.Class<?> wildcardClass27 = same15.getClass();
        boolean boolean28 = same13.matches((java.lang.Object) same15);
        java.lang.String str29 = same13.toString();
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same31._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str35 = same34.toString();
        boolean boolean37 = same34.matches((java.lang.Object) (byte) -1);
        boolean boolean38 = same31.matches((java.lang.Object) boolean37);
        java.lang.Class<?> wildcardClass39 = same31.getClass();
        org.mockito.internal.matchers.Same same40 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass39);
        java.lang.String str41 = same40.toString();
        same40._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same44 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str45 = same44.toString();
        boolean boolean46 = same40.matches((java.lang.Object) str45);
        org.mockito.internal.matchers.Same same48 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean50 = same48.matches((java.lang.Object) (-1.0d));
        java.lang.String str51 = same48.toString();
        boolean boolean52 = same40.matches((java.lang.Object) same48);
        java.lang.Class<?> wildcardClass53 = same40.getClass();
        boolean boolean54 = same13.matches((java.lang.Object) same40);
        org.mockito.internal.matchers.Same same55 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean54);
        java.lang.String str56 = same55.toString();
        boolean boolean57 = same11.matches((java.lang.Object) same55);
        org.mockito.internal.matchers.Same same58 = new org.mockito.internal.matchers.Same((java.lang.Object) same11);
        java.lang.String str59 = same58.toString();
        org.hamcrest.Description description60 = null;
        // The following exception was thrown during execution in test generation
        try {
            same58.describeTo(description60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(' ')" + "'", str6, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "same(' ')" + "'", str20, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "same(' ')" + "'", str35, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str41, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "same(' ')" + "'", str45, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "same(0)" + "'", str51, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "same(false)" + "'", str56, "same(false)");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "same(same(same(' ')))" + "'", str59, "same(same(same(' ')))");
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str6 = same5.toString();
        boolean boolean8 = same5.matches((java.lang.Object) (byte) -1);
        boolean boolean9 = same1.matches((java.lang.Object) (byte) -1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str14 = same13.toString();
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) str14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(' ')" + "'", str6, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(same(' '))" + "'", str14, "same(same(' '))");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean5 = same3.matches((java.lang.Object) (-1.0d));
        java.lang.String str6 = same3.toString();
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean8 = same1.matches((java.lang.Object) same3);
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean8);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str11 = same9.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(0)" + "'", str6, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(false)" + "'", str11, "same(false)");
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0d));
        java.lang.String str4 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.Object obj7 = new java.lang.Object();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same(obj7);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean12 = same10.matches((java.lang.Object) ' ');
        java.lang.String str13 = same10.toString();
        java.lang.Class<?> wildcardClass14 = same10.getClass();
        boolean boolean15 = same8.matches((java.lang.Object) wildcardClass14);
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean15);
        boolean boolean17 = same1.matches((java.lang.Object) boolean15);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same19._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str23 = same22.toString();
        boolean boolean25 = same22.matches((java.lang.Object) (byte) -1);
        boolean boolean26 = same19.matches((java.lang.Object) boolean25);
        java.lang.Class<?> wildcardClass27 = same19.getClass();
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass27);
        java.lang.String str29 = same28.toString();
        same28._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) same28);
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) same31);
        boolean boolean33 = same1.matches((java.lang.Object) same31);
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) same31);
        java.lang.String str35 = same34.toString();
        java.lang.String str36 = same34.toString();
        java.lang.Object obj37 = null;
        boolean boolean38 = same34.matches(obj37);
        org.mockito.internal.matchers.Same same40 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        java.lang.Object obj41 = new java.lang.Object();
        boolean boolean42 = same40.matches(obj41);
        same40._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same44 = new org.mockito.internal.matchers.Same((java.lang.Object) same40);
        java.lang.String str45 = same44.toString();
        org.mockito.internal.matchers.Same same47 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean49 = same47.matches((java.lang.Object) ' ');
        java.lang.String str50 = same47.toString();
        java.lang.Class<?> wildcardClass51 = same47.getClass();
        org.mockito.internal.matchers.Same same52 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass51);
        org.mockito.internal.matchers.Same same54 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean56 = same54.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same58 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str59 = same58.toString();
        boolean boolean61 = same58.matches((java.lang.Object) (byte) -1);
        boolean boolean62 = same54.matches((java.lang.Object) (byte) -1);
        same54._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same54._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same65 = new org.mockito.internal.matchers.Same((java.lang.Object) same54);
        java.lang.String str66 = same54.toString();
        org.mockito.internal.matchers.Same same68 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        org.mockito.internal.matchers.Same same69 = new org.mockito.internal.matchers.Same((java.lang.Object) same68);
        org.mockito.internal.matchers.Same same70 = new org.mockito.internal.matchers.Same((java.lang.Object) same69);
        boolean boolean71 = same54.matches((java.lang.Object) same70);
        java.lang.String str72 = same54.toString();
        java.lang.Class<?> wildcardClass73 = same54.getClass();
        org.mockito.internal.matchers.Same same74 = new org.mockito.internal.matchers.Same((java.lang.Object) same54);
        boolean boolean75 = same52.matches((java.lang.Object) same74);
        java.lang.String str76 = same74.toString();
        org.mockito.internal.matchers.Same same78 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 1);
        org.mockito.internal.matchers.Same same80 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same80._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same83 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str84 = same83.toString();
        boolean boolean86 = same83.matches((java.lang.Object) (byte) -1);
        boolean boolean87 = same80.matches((java.lang.Object) boolean86);
        java.lang.Class<?> wildcardClass88 = same80.getClass();
        org.mockito.internal.matchers.Same same89 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass88);
        java.lang.String str90 = same89.toString();
        java.lang.String str91 = same89.toString();
        java.lang.Class<?> wildcardClass92 = same89.getClass();
        boolean boolean93 = same78.matches((java.lang.Object) wildcardClass92);
        org.mockito.internal.matchers.Same same94 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean93);
        boolean boolean95 = same74.matches((java.lang.Object) same94);
        boolean boolean96 = same44.matches((java.lang.Object) same74);
        boolean boolean97 = same34.matches((java.lang.Object) boolean96);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(' ')" + "'", str13, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "same(' ')" + "'", str23, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str29, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "same(same(same(class org.mockito.internal.matchers.Same)))" + "'", str35, "same(same(same(class org.mockito.internal.matchers.Same)))");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "same(same(same(class org.mockito.internal.matchers.Same)))" + "'", str36, "same(same(same(class org.mockito.internal.matchers.Same)))");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "same(same(-1))" + "'", str45, "same(same(-1))");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "same(' ')" + "'", str50, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "same(' ')" + "'", str59, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "same(' ')" + "'", str66, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "same(' ')" + "'", str72, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "same(same(' '))" + "'", str76, "same(same(' '))");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "same(' ')" + "'", str84, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(wildcardClass88);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str90, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str91, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertNotNull(wildcardClass92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str5 = same4.toString();
        boolean boolean7 = same4.matches((java.lang.Object) (byte) -1);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        java.lang.Class<?> wildcardClass9 = same1.getClass();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass9);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean14 = same12.matches((java.lang.Object) ' ');
        boolean boolean16 = same12.matches((java.lang.Object) 10.0f);
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str18 = same12.toString();
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean22 = same20.matches((java.lang.Object) ' ');
        boolean boolean24 = same20.matches((java.lang.Object) 10.0f);
        same20._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean26 = same12.matches((java.lang.Object) same20);
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean29 = same20.matches((java.lang.Object) same28);
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) same28);
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean34 = same32.matches((java.lang.Object) (-1.0d));
        java.lang.String str35 = same32.toString();
        same32._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same37 = new org.mockito.internal.matchers.Same((java.lang.Object) same32);
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean41 = same39.matches((java.lang.Object) (-1.0d));
        java.lang.String str42 = same39.toString();
        same39._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same44 = new org.mockito.internal.matchers.Same((java.lang.Object) same39);
        org.mockito.internal.matchers.Same same45 = new org.mockito.internal.matchers.Same((java.lang.Object) same39);
        boolean boolean46 = same37.matches((java.lang.Object) same39);
        org.mockito.internal.matchers.Same same48 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean50 = same48.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same52 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str53 = same52.toString();
        boolean boolean55 = same52.matches((java.lang.Object) (byte) -1);
        boolean boolean56 = same48.matches((java.lang.Object) (byte) -1);
        same48._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same48._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same59 = new org.mockito.internal.matchers.Same((java.lang.Object) same48);
        java.lang.String str60 = same48.toString();
        org.mockito.internal.matchers.Same same62 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        org.mockito.internal.matchers.Same same63 = new org.mockito.internal.matchers.Same((java.lang.Object) same62);
        org.mockito.internal.matchers.Same same64 = new org.mockito.internal.matchers.Same((java.lang.Object) same63);
        boolean boolean65 = same48.matches((java.lang.Object) same64);
        same48._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean67 = same37.matches((java.lang.Object) same48);
        boolean boolean68 = same30.matches((java.lang.Object) same37);
        java.lang.String str69 = same37.toString();
        boolean boolean70 = same10.matches((java.lang.Object) same37);
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(' ')" + "'", str5, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "same(' ')" + "'", str18, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "same(0)" + "'", str35, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "same(0)" + "'", str42, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "same(' ')" + "'", str53, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "same(' ')" + "'", str60, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "same(same(0))" + "'", str69, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        boolean boolean3 = same1.matches((java.lang.Object) (byte) 100);
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean3);
        java.lang.String str5 = same4.toString();
        java.lang.String str6 = same4.toString();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) str6);
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean11 = same9.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str14 = same13.toString();
        boolean boolean16 = same13.matches((java.lang.Object) (byte) -1);
        boolean boolean17 = same9.matches((java.lang.Object) (byte) -1);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) same9);
        boolean boolean21 = same7.matches((java.lang.Object) same20);
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str24 = same23.toString();
        boolean boolean26 = same23.matches((java.lang.Object) (byte) -1);
        boolean boolean28 = same23.matches((java.lang.Object) (short) 10);
        java.lang.Object obj29 = new java.lang.Object();
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same(obj29);
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean34 = same32.matches((java.lang.Object) ' ');
        java.lang.String str35 = same32.toString();
        java.lang.Class<?> wildcardClass36 = same32.getClass();
        boolean boolean37 = same30.matches((java.lang.Object) wildcardClass36);
        boolean boolean38 = same23.matches((java.lang.Object) wildcardClass36);
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass36);
        org.mockito.internal.matchers.Same same40 = new org.mockito.internal.matchers.Same((java.lang.Object) same39);
        java.lang.String str41 = same40.toString();
        org.mockito.internal.matchers.Same same43 = new org.mockito.internal.matchers.Same((java.lang.Object) 100);
        java.lang.String str44 = same43.toString();
        boolean boolean45 = same40.matches((java.lang.Object) str44);
        java.lang.String str46 = same40.toString();
        same40._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same49 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same51 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean53 = same51.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same55 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean56 = same51.matches((java.lang.Object) same55);
        boolean boolean58 = same55.matches((java.lang.Object) 1);
        boolean boolean60 = same55.matches((java.lang.Object) 10.0f);
        org.mockito.internal.matchers.Same same62 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str63 = same62.toString();
        boolean boolean65 = same62.matches((java.lang.Object) 1L);
        boolean boolean66 = same55.matches((java.lang.Object) boolean65);
        java.lang.String str67 = same55.toString();
        boolean boolean68 = same49.matches((java.lang.Object) str67);
        same49._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same49._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str71 = same49.toString();
        boolean boolean72 = same40.matches((java.lang.Object) str71);
        org.mockito.internal.matchers.Same same73 = new org.mockito.internal.matchers.Same((java.lang.Object) same40);
        org.mockito.internal.matchers.Same same74 = new org.mockito.internal.matchers.Same((java.lang.Object) same40);
        java.lang.String str75 = same74.toString();
        org.mockito.internal.matchers.Same same77 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean79 = same77.matches((java.lang.Object) (-1.0d));
        org.mockito.internal.matchers.Same same81 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same81._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same84 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str85 = same84.toString();
        boolean boolean87 = same84.matches((java.lang.Object) (byte) -1);
        boolean boolean88 = same81.matches((java.lang.Object) boolean87);
        java.lang.Object obj89 = new java.lang.Object();
        org.mockito.internal.matchers.Same same90 = new org.mockito.internal.matchers.Same(obj89);
        boolean boolean91 = same81.matches(obj89);
        boolean boolean92 = same77.matches(obj89);
        boolean boolean93 = same74.matches((java.lang.Object) boolean92);
        java.lang.Class<?> wildcardClass94 = same74.getClass();
        org.hamcrest.Description description95 = null;
        // The following exception was thrown during execution in test generation
        try {
            same20.describeMismatch((java.lang.Object) wildcardClass94, description95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(false)" + "'", str5, "same(false)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(false)" + "'", str6, "same(false)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(' ')" + "'", str14, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "same(' ')" + "'", str24, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "same(' ')" + "'", str35, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "same(same(class org.mockito.internal.matchers.Same))" + "'", str41, "same(same(class org.mockito.internal.matchers.Same))");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "same(100)" + "'", str44, "same(100)");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "same(same(class org.mockito.internal.matchers.Same))" + "'", str46, "same(same(class org.mockito.internal.matchers.Same))");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "same(' ')" + "'", str63, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "same(' ')" + "'", str67, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "same(' ')" + "'", str71, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "same(same(same(class org.mockito.internal.matchers.Same)))" + "'", str75, "same(same(same(class org.mockito.internal.matchers.Same)))");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "same(' ')" + "'", str85, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean5 = same3.matches((java.lang.Object) ' ');
        java.lang.String str6 = same3.toString();
        java.lang.Class<?> wildcardClass7 = same3.getClass();
        boolean boolean8 = same1.matches((java.lang.Object) wildcardClass7);
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean8);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) same9);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str13 = same12.toString();
        boolean boolean15 = same12.matches((java.lang.Object) (byte) -1);
        boolean boolean17 = same12.matches((java.lang.Object) (short) 10);
        java.lang.Object obj18 = new java.lang.Object();
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same(obj18);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean23 = same21.matches((java.lang.Object) ' ');
        java.lang.String str24 = same21.toString();
        java.lang.Class<?> wildcardClass25 = same21.getClass();
        boolean boolean26 = same19.matches((java.lang.Object) wildcardClass25);
        boolean boolean27 = same12.matches((java.lang.Object) wildcardClass25);
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass25);
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) same28);
        boolean boolean30 = same10.matches((java.lang.Object) same29);
        java.lang.String str31 = same10.toString();
        java.lang.String str32 = same10.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(' ')" + "'", str6, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(' ')" + "'", str13, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "same(' ')" + "'", str24, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "same(same(false))" + "'", str31, "same(same(false))");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "same(same(false))" + "'", str32, "same(same(false))");
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str2 = same1.toString();
        boolean boolean4 = same1.matches((java.lang.Object) (byte) -1);
        boolean boolean6 = same1.matches((java.lang.Object) (short) 10);
        java.lang.Object obj7 = new java.lang.Object();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same(obj7);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean12 = same10.matches((java.lang.Object) ' ');
        java.lang.String str13 = same10.toString();
        java.lang.Class<?> wildcardClass14 = same10.getClass();
        boolean boolean15 = same8.matches((java.lang.Object) wildcardClass14);
        boolean boolean16 = same1.matches((java.lang.Object) wildcardClass14);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass14);
        java.lang.String str18 = same17.toString();
        same17._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same17._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) same17);
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) same17);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str25 = same24.toString();
        boolean boolean27 = same24.matches((java.lang.Object) (byte) -1);
        boolean boolean29 = same24.matches((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass30 = same24.getClass();
        boolean boolean31 = same22.matches((java.lang.Object) wildcardClass30);
        same22._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str33 = same22.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(' ')" + "'", str2, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(' ')" + "'", str13, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str18, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "same(' ')" + "'", str25, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "same(same(class org.mockito.internal.matchers.Same))" + "'", str33, "same(same(class org.mockito.internal.matchers.Same))");
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) "same(same(-1))");
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) "same(same(same(-1)))");
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean5 = same3.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean8 = same3.matches((java.lang.Object) same7);
        boolean boolean10 = same7.matches((java.lang.Object) 1);
        boolean boolean12 = same7.matches((java.lang.Object) 10.0f);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str15 = same14.toString();
        boolean boolean17 = same14.matches((java.lang.Object) 1L);
        boolean boolean18 = same7.matches((java.lang.Object) boolean17);
        java.lang.String str19 = same7.toString();
        boolean boolean20 = same1.matches((java.lang.Object) str19);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str23 = same1.toString();
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) same25);
        boolean boolean27 = same1.matches((java.lang.Object) same25);
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) same25);
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) same28);
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str32 = same31.toString();
        boolean boolean34 = same31.matches((java.lang.Object) (byte) -1);
        boolean boolean36 = same31.matches((java.lang.Object) (short) 10);
        java.lang.Object obj37 = new java.lang.Object();
        org.mockito.internal.matchers.Same same38 = new org.mockito.internal.matchers.Same(obj37);
        org.mockito.internal.matchers.Same same40 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean42 = same40.matches((java.lang.Object) ' ');
        java.lang.String str43 = same40.toString();
        java.lang.Class<?> wildcardClass44 = same40.getClass();
        boolean boolean45 = same38.matches((java.lang.Object) wildcardClass44);
        boolean boolean46 = same31.matches((java.lang.Object) wildcardClass44);
        org.mockito.internal.matchers.Same same47 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass44);
        java.lang.String str48 = same47.toString();
        same47._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same51 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same51._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same54 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str55 = same54.toString();
        boolean boolean57 = same54.matches((java.lang.Object) (byte) -1);
        boolean boolean58 = same51.matches((java.lang.Object) boolean57);
        java.lang.Class<?> wildcardClass59 = same51.getClass();
        org.mockito.internal.matchers.Same same60 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass59);
        same60._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean62 = same47.matches((java.lang.Object) same60);
        java.lang.String str63 = same47.toString();
        boolean boolean64 = same29.matches((java.lang.Object) str63);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(' ')" + "'", str15, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "same(' ')" + "'", str19, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "same(' ')" + "'", str23, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "same(' ')" + "'", str32, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "same(' ')" + "'", str43, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str48, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "same(' ')" + "'", str55, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str63, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str5 = same4.toString();
        boolean boolean7 = same4.matches((java.lang.Object) (byte) -1);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        java.lang.Class<?> wildcardClass9 = same1.getClass();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass9);
        java.lang.String str11 = same10.toString();
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same17._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str21 = same20.toString();
        boolean boolean23 = same20.matches((java.lang.Object) (byte) -1);
        boolean boolean24 = same17.matches((java.lang.Object) boolean23);
        java.lang.Class<?> wildcardClass25 = same17.getClass();
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass25);
        java.lang.String str27 = same26.toString();
        java.lang.String str28 = same26.toString();
        java.lang.Class<?> wildcardClass29 = same26.getClass();
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass29);
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) same30);
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean35 = same33.matches((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass36 = same33.getClass();
        org.mockito.internal.matchers.Same same37 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass36);
        boolean boolean38 = same31.matches((java.lang.Object) same37);
        java.lang.Object obj39 = null;
        boolean boolean40 = same31.matches(obj39);
        org.hamcrest.Description description41 = null;
        // The following exception was thrown during execution in test generation
        try {
            same10.describeMismatch(obj39, description41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(' ')" + "'", str5, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str11, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "same(' ')" + "'", str21, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str27, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str28, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str5 = same4.toString();
        boolean boolean7 = same4.matches((java.lang.Object) (byte) -1);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean8);
        java.lang.String str10 = same9.toString();
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same9);
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(' ')" + "'", str5, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(false)" + "'", str10, "same(false)");
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean6 = same1.matches((java.lang.Object) same5);
        boolean boolean8 = same5.matches((java.lang.Object) 1);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean12 = same10.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean15 = same10.matches((java.lang.Object) same14);
        boolean boolean17 = same14.matches((java.lang.Object) 1);
        boolean boolean19 = same14.matches((java.lang.Object) 10.0f);
        boolean boolean21 = same14.matches((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass22 = same14.getClass();
        boolean boolean23 = same5.matches((java.lang.Object) wildcardClass22);
        boolean boolean25 = same5.matches((java.lang.Object) '4');
        java.lang.Object obj26 = new java.lang.Object();
        boolean boolean27 = same5.matches(obj26);
        java.lang.Class<?> wildcardClass28 = obj26.getClass();
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass28);
        java.lang.Object obj30 = new java.lang.Object();
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same(obj30);
        boolean boolean33 = same31.matches((java.lang.Object) 100);
        java.lang.String str34 = same31.toString();
        java.lang.String str35 = same31.toString();
        org.mockito.internal.matchers.Same same37 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        org.mockito.internal.matchers.Same same38 = new org.mockito.internal.matchers.Same((java.lang.Object) same37);
        same38._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean40 = same31.matches((java.lang.Object) same38);
        org.mockito.internal.matchers.Same same41 = new org.mockito.internal.matchers.Same((java.lang.Object) same31);
        same41._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same41._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same44 = new org.mockito.internal.matchers.Same((java.lang.Object) same41);
        org.mockito.internal.matchers.Same same46 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean48 = same46.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same50 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        boolean boolean51 = same46.matches((java.lang.Object) same50);
        same46._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same53 = new org.mockito.internal.matchers.Same((java.lang.Object) same46);
        org.mockito.internal.matchers.Same same54 = new org.mockito.internal.matchers.Same((java.lang.Object) same53);
        java.lang.String str55 = same53.toString();
        boolean boolean56 = same44.matches((java.lang.Object) same53);
        org.mockito.internal.matchers.Same same57 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean56);
        org.hamcrest.Description description58 = null;
        // The following exception was thrown during execution in test generation
        try {
            same29.describeMismatch((java.lang.Object) boolean56, description58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "same(same(' '))" + "'", str55, "same(same(' '))");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str6 = same5.toString();
        boolean boolean8 = same5.matches((java.lang.Object) (byte) -1);
        boolean boolean9 = same1.matches((java.lang.Object) (byte) -1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str12 = same11.toString();
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) str12);
        org.hamcrest.Description description14 = null;
        // The following exception was thrown during execution in test generation
        try {
            same13.describeTo(description14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(' ')" + "'", str6, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "same(same(' '))" + "'", str12, "same(same(' '))");
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same2 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same2._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str4 = same2.toString();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str7 = same6.toString();
        boolean boolean9 = same6.matches((java.lang.Object) (byte) -1);
        boolean boolean11 = same6.matches((java.lang.Object) (short) 10);
        java.lang.Object obj12 = new java.lang.Object();
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same(obj12);
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean17 = same15.matches((java.lang.Object) ' ');
        java.lang.String str18 = same15.toString();
        java.lang.Class<?> wildcardClass19 = same15.getClass();
        boolean boolean20 = same13.matches((java.lang.Object) wildcardClass19);
        boolean boolean21 = same6.matches((java.lang.Object) wildcardClass19);
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass19);
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) same22);
        boolean boolean25 = same23.matches((java.lang.Object) (short) 1);
        same23._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        java.lang.Object obj29 = new java.lang.Object();
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same(obj29);
        boolean boolean32 = same30.matches((java.lang.Object) 100);
        boolean boolean33 = same28.matches((java.lang.Object) 100);
        java.lang.String str34 = same28.toString();
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same((java.lang.Object) str34);
        org.mockito.internal.matchers.Same same37 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean39 = same37.matches((java.lang.Object) ' ');
        boolean boolean41 = same37.matches((java.lang.Object) 10.0f);
        same37._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str43 = same37.toString();
        org.mockito.internal.matchers.Same same45 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean47 = same45.matches((java.lang.Object) ' ');
        boolean boolean49 = same45.matches((java.lang.Object) 10.0f);
        same45._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean51 = same37.matches((java.lang.Object) same45);
        java.lang.Class<?> wildcardClass52 = same45.getClass();
        boolean boolean53 = same35.matches((java.lang.Object) wildcardClass52);
        org.mockito.internal.matchers.Same same55 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean57 = same55.matches((java.lang.Object) (-1.0d));
        org.mockito.internal.matchers.Same same59 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str60 = same59.toString();
        boolean boolean62 = same59.matches((java.lang.Object) (byte) -1);
        boolean boolean64 = same59.matches((java.lang.Object) (short) 10);
        java.lang.Object obj65 = new java.lang.Object();
        org.mockito.internal.matchers.Same same66 = new org.mockito.internal.matchers.Same(obj65);
        org.mockito.internal.matchers.Same same68 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean70 = same68.matches((java.lang.Object) ' ');
        java.lang.String str71 = same68.toString();
        java.lang.Class<?> wildcardClass72 = same68.getClass();
        boolean boolean73 = same66.matches((java.lang.Object) wildcardClass72);
        boolean boolean74 = same59.matches((java.lang.Object) wildcardClass72);
        boolean boolean75 = same55.matches((java.lang.Object) boolean74);
        java.lang.Class<?> wildcardClass76 = same55.getClass();
        boolean boolean77 = same35.matches((java.lang.Object) wildcardClass76);
        boolean boolean78 = same23.matches((java.lang.Object) boolean77);
        org.mockito.internal.matchers.Same same80 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean82 = same80.matches((java.lang.Object) (-1.0d));
        java.lang.String str83 = same80.toString();
        same80._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same85 = new org.mockito.internal.matchers.Same((java.lang.Object) same80);
        org.mockito.internal.matchers.Same same86 = new org.mockito.internal.matchers.Same((java.lang.Object) same85);
        org.mockito.internal.matchers.Same same87 = new org.mockito.internal.matchers.Same((java.lang.Object) same85);
        same87._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same89 = new org.mockito.internal.matchers.Same((java.lang.Object) same87);
        same87._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean91 = same23.matches((java.lang.Object) same87);
        boolean boolean92 = same2.matches((java.lang.Object) same87);
        org.hamcrest.Description description93 = null;
        // The following exception was thrown during execution in test generation
        try {
            same87.describeTo(description93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(same(0))" + "'", str4, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(' ')" + "'", str7, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "same(' ')" + "'", str18, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "same(0)" + "'", str34, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "same(' ')" + "'", str43, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "same(' ')" + "'", str60, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "same(' ')" + "'", str71, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "same(0)" + "'", str83, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        boolean boolean6 = same1.matches((java.lang.Object) same5);
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) same8);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        boolean boolean15 = same11.matches((java.lang.Object) (short) -1);
        java.lang.String str16 = same11.toString();
        java.lang.Class<?> wildcardClass17 = same11.getClass();
        boolean boolean18 = same9.matches((java.lang.Object) wildcardClass17);
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean22 = same20.matches((java.lang.Object) ' ');
        boolean boolean23 = same9.matches((java.lang.Object) same20);
        java.lang.Class<?> wildcardClass24 = same20.getClass();
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass24);
        same25._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description27 = null;
        // The following exception was thrown during execution in test generation
        try {
            same5.describeMismatch((java.lang.Object) same25, description27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "same(' ')" + "'", str16, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        boolean boolean5 = same1.matches((java.lang.Object) (short) -1);
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        java.lang.String str7 = same6.toString();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) str7);
        org.hamcrest.Description description9 = null;
        // The following exception was thrown during execution in test generation
        try {
            same8.describeTo(description9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(-1)" + "'", str7, "same(-1)");
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 1L);
        java.lang.String str2 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean10 = same7.matches((java.lang.Object) (short) 100);
        java.lang.Object obj11 = new java.lang.Object();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same(obj11);
        boolean boolean13 = same7.matches((java.lang.Object) same12);
        boolean boolean14 = same1.matches((java.lang.Object) same12);
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) same12);
        same15._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(1)" + "'", str2, "same(1)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str5 = same4.toString();
        boolean boolean7 = same4.matches((java.lang.Object) (byte) -1);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        java.lang.Object obj9 = new java.lang.Object();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same(obj9);
        boolean boolean11 = same1.matches(obj9);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean17 = same15.matches((java.lang.Object) (-1.0d));
        java.lang.String str18 = same15.toString();
        same15._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) same15);
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean24 = same22.matches((java.lang.Object) (-1.0d));
        java.lang.String str25 = same22.toString();
        same22._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) same22);
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) same22);
        boolean boolean29 = same20.matches((java.lang.Object) same22);
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean33 = same31.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str36 = same35.toString();
        boolean boolean38 = same35.matches((java.lang.Object) (byte) -1);
        boolean boolean39 = same31.matches((java.lang.Object) (byte) -1);
        same31._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same31._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same42 = new org.mockito.internal.matchers.Same((java.lang.Object) same31);
        java.lang.String str43 = same31.toString();
        org.mockito.internal.matchers.Same same45 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        org.mockito.internal.matchers.Same same46 = new org.mockito.internal.matchers.Same((java.lang.Object) same45);
        org.mockito.internal.matchers.Same same47 = new org.mockito.internal.matchers.Same((java.lang.Object) same46);
        boolean boolean48 = same31.matches((java.lang.Object) same47);
        same31._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean50 = same20.matches((java.lang.Object) same31);
        boolean boolean51 = same1.matches((java.lang.Object) same31);
        org.mockito.internal.matchers.Same same52 = new org.mockito.internal.matchers.Same((java.lang.Object) same31);
        org.mockito.internal.matchers.Same same53 = new org.mockito.internal.matchers.Same((java.lang.Object) same52);
        java.lang.Class<?> wildcardClass54 = same53.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(' ')" + "'", str5, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "same(0)" + "'", str18, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "same(0)" + "'", str25, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "same(' ')" + "'", str36, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "same(' ')" + "'", str43, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        java.lang.Object obj2 = new java.lang.Object();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same(obj2);
        boolean boolean5 = same3.matches((java.lang.Object) 100);
        boolean boolean6 = same1.matches((java.lang.Object) 100);
        java.lang.String str7 = same1.toString();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) str7);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean12 = same10.matches((java.lang.Object) ' ');
        boolean boolean14 = same10.matches((java.lang.Object) 10.0f);
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str16 = same10.toString();
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean20 = same18.matches((java.lang.Object) ' ');
        boolean boolean22 = same18.matches((java.lang.Object) 10.0f);
        same18._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean24 = same10.matches((java.lang.Object) same18);
        java.lang.Class<?> wildcardClass25 = same18.getClass();
        boolean boolean26 = same8.matches((java.lang.Object) wildcardClass25);
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean30 = same28.matches((java.lang.Object) (-1.0d));
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str33 = same32.toString();
        boolean boolean35 = same32.matches((java.lang.Object) (byte) -1);
        boolean boolean37 = same32.matches((java.lang.Object) (short) 10);
        java.lang.Object obj38 = new java.lang.Object();
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same(obj38);
        org.mockito.internal.matchers.Same same41 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean43 = same41.matches((java.lang.Object) ' ');
        java.lang.String str44 = same41.toString();
        java.lang.Class<?> wildcardClass45 = same41.getClass();
        boolean boolean46 = same39.matches((java.lang.Object) wildcardClass45);
        boolean boolean47 = same32.matches((java.lang.Object) wildcardClass45);
        boolean boolean48 = same28.matches((java.lang.Object) boolean47);
        java.lang.Class<?> wildcardClass49 = same28.getClass();
        boolean boolean50 = same8.matches((java.lang.Object) wildcardClass49);
        org.mockito.internal.matchers.Same same51 = new org.mockito.internal.matchers.Same((java.lang.Object) same8);
        java.lang.String str52 = same8.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(0)" + "'", str7, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "same(' ')" + "'", str16, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "same(' ')" + "'", str33, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "same(' ')" + "'", str44, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "same(\"same(0)\")" + "'", str52, "same(\"same(0)\")");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        java.lang.Object obj2 = new java.lang.Object();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same(obj2);
        boolean boolean5 = same3.matches((java.lang.Object) 100);
        boolean boolean6 = same1.matches((java.lang.Object) 100);
        java.lang.String str7 = same1.toString();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) str7);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean12 = same10.matches((java.lang.Object) ' ');
        boolean boolean14 = same10.matches((java.lang.Object) 10.0f);
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str16 = same10.toString();
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean20 = same18.matches((java.lang.Object) ' ');
        boolean boolean22 = same18.matches((java.lang.Object) 10.0f);
        same18._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean24 = same10.matches((java.lang.Object) same18);
        java.lang.Class<?> wildcardClass25 = same18.getClass();
        boolean boolean26 = same8.matches((java.lang.Object) wildcardClass25);
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) 100);
        java.lang.String str29 = same28.toString();
        boolean boolean30 = same8.matches((java.lang.Object) str29);
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str33 = same32.toString();
        boolean boolean35 = same32.matches((java.lang.Object) (byte) -1);
        boolean boolean37 = same32.matches((java.lang.Object) (short) 10);
        java.lang.Object obj38 = new java.lang.Object();
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same(obj38);
        org.mockito.internal.matchers.Same same41 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean43 = same41.matches((java.lang.Object) ' ');
        java.lang.String str44 = same41.toString();
        java.lang.Class<?> wildcardClass45 = same41.getClass();
        boolean boolean46 = same39.matches((java.lang.Object) wildcardClass45);
        boolean boolean47 = same32.matches((java.lang.Object) wildcardClass45);
        org.mockito.internal.matchers.Same same48 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass45);
        java.lang.String str49 = same48.toString();
        boolean boolean51 = same48.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same52 = new org.mockito.internal.matchers.Same((java.lang.Object) same48);
        org.mockito.internal.matchers.Same same54 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same56 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean58 = same56.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same60 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean61 = same56.matches((java.lang.Object) same60);
        boolean boolean63 = same60.matches((java.lang.Object) 1);
        boolean boolean65 = same60.matches((java.lang.Object) 10.0f);
        org.mockito.internal.matchers.Same same67 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str68 = same67.toString();
        boolean boolean70 = same67.matches((java.lang.Object) 1L);
        boolean boolean71 = same60.matches((java.lang.Object) boolean70);
        java.lang.String str72 = same60.toString();
        boolean boolean73 = same54.matches((java.lang.Object) str72);
        same54._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean75 = same52.matches((java.lang.Object) same54);
        org.mockito.internal.matchers.Same same76 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean75);
        org.mockito.internal.matchers.Same same78 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        java.lang.String str79 = same78.toString();
        boolean boolean80 = same76.matches((java.lang.Object) same78);
        java.lang.Class<?> wildcardClass81 = same76.getClass();
        boolean boolean82 = same8.matches((java.lang.Object) wildcardClass81);
        java.lang.String str83 = same8.toString();
        org.mockito.internal.matchers.Same same85 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same85._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same88 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        boolean boolean89 = same85.matches((java.lang.Object) (short) -1);
        java.lang.String str90 = same85.toString();
        java.lang.String str91 = same85.toString();
        java.lang.String str92 = same85.toString();
        same85._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str94 = same85.toString();
        java.lang.String str95 = same85.toString();
        org.hamcrest.Description description96 = null;
        // The following exception was thrown during execution in test generation
        try {
            same8.describeMismatch((java.lang.Object) str95, description96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(0)" + "'", str7, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "same(' ')" + "'", str16, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "same(100)" + "'", str29, "same(100)");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "same(' ')" + "'", str33, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "same(' ')" + "'", str44, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str49, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "same(' ')" + "'", str68, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "same(' ')" + "'", str72, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "same(10)" + "'", str79, "same(10)");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "same(\"same(0)\")" + "'", str83, "same(\"same(0)\")");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "same(' ')" + "'", str90, "same(' ')");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "same(' ')" + "'", str91, "same(' ')");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "same(' ')" + "'", str92, "same(' ')");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "same(' ')" + "'", str94, "same(' ')");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "same(' ')" + "'", str95, "same(' ')");
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.String str2 = same1.toString();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean6 = same4.matches((java.lang.Object) ' ');
        boolean boolean8 = same4.matches((java.lang.Object) 10.0f);
        same4._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str10 = same4.toString();
        boolean boolean11 = same1.matches((java.lang.Object) same4);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean15 = same13.matches((java.lang.Object) ' ');
        boolean boolean17 = same13.matches((java.lang.Object) 10.0f);
        same13._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same13._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str20 = same13.toString();
        java.lang.Class<?> wildcardClass21 = same13.getClass();
        boolean boolean22 = same4.matches((java.lang.Object) same13);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean26 = same24.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean29 = same24.matches((java.lang.Object) same28);
        same24._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean31 = same13.matches((java.lang.Object) same24);
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean31);
        same32._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(0)" + "'", str2, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(' ')" + "'", str10, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "same(' ')" + "'", str20, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean6 = same1.matches((java.lang.Object) same5);
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str9 = same8.toString();
        boolean boolean11 = same8.matches((java.lang.Object) (byte) -1);
        boolean boolean13 = same8.matches((java.lang.Object) (short) 10);
        boolean boolean14 = same1.matches((java.lang.Object) same8);
        java.lang.String str15 = same1.toString();
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean19 = same17.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean22 = same17.matches((java.lang.Object) same21);
        boolean boolean24 = same21.matches((java.lang.Object) 1);
        boolean boolean26 = same21.matches((java.lang.Object) 10.0f);
        java.lang.String str27 = same21.toString();
        same21._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean29 = same1.matches((java.lang.Object) same21);
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str33 = same32.toString();
        boolean boolean35 = same32.matches((java.lang.Object) (byte) -1);
        boolean boolean37 = same32.matches((java.lang.Object) (short) 10);
        java.lang.Object obj38 = new java.lang.Object();
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same(obj38);
        org.mockito.internal.matchers.Same same41 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean43 = same41.matches((java.lang.Object) ' ');
        java.lang.String str44 = same41.toString();
        java.lang.Class<?> wildcardClass45 = same41.getClass();
        boolean boolean46 = same39.matches((java.lang.Object) wildcardClass45);
        boolean boolean47 = same32.matches((java.lang.Object) wildcardClass45);
        org.mockito.internal.matchers.Same same48 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass45);
        org.mockito.internal.matchers.Same same49 = new org.mockito.internal.matchers.Same((java.lang.Object) same48);
        boolean boolean50 = same1.matches((java.lang.Object) same49);
        java.lang.String str51 = same1.toString();
        org.mockito.internal.matchers.Same same52 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str53 = same1.toString();
        java.lang.String str54 = same1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(' ')" + "'", str9, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(' ')" + "'", str15, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "same(' ')" + "'", str27, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "same(' ')" + "'", str33, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "same(' ')" + "'", str44, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "same(' ')" + "'", str51, "same(' ')");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "same(' ')" + "'", str53, "same(' ')");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "same(' ')" + "'", str54, "same(' ')");
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        boolean boolean5 = same1.matches((java.lang.Object) 10.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str7 = same1.toString();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean11 = same9.matches((java.lang.Object) ' ');
        boolean boolean13 = same9.matches((java.lang.Object) 10.0f);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean15 = same1.matches((java.lang.Object) same9);
        java.lang.String str16 = same9.toString();
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) 100L);
        same18._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean20 = same9.matches((java.lang.Object) same18);
        same18._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description22 = null;
        // The following exception was thrown during execution in test generation
        try {
            same18.describeTo(description22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(' ')" + "'", str7, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "same(' ')" + "'", str16, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean5 = same3.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean8 = same3.matches((java.lang.Object) same7);
        boolean boolean10 = same7.matches((java.lang.Object) 1);
        boolean boolean12 = same7.matches((java.lang.Object) 10.0f);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str15 = same14.toString();
        boolean boolean17 = same14.matches((java.lang.Object) 1L);
        boolean boolean18 = same7.matches((java.lang.Object) boolean17);
        java.lang.String str19 = same7.toString();
        boolean boolean20 = same1.matches((java.lang.Object) str19);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean27 = same25.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean30 = same25.matches((java.lang.Object) same29);
        boolean boolean32 = same29.matches((java.lang.Object) 1);
        boolean boolean34 = same29.matches((java.lang.Object) 10.0f);
        org.mockito.internal.matchers.Same same36 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str37 = same36.toString();
        boolean boolean39 = same36.matches((java.lang.Object) 1L);
        boolean boolean40 = same29.matches((java.lang.Object) boolean39);
        java.lang.String str41 = same29.toString();
        boolean boolean42 = same23.matches((java.lang.Object) str41);
        same23._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same23._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str45 = same23.toString();
        org.mockito.internal.matchers.Same same47 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        org.mockito.internal.matchers.Same same48 = new org.mockito.internal.matchers.Same((java.lang.Object) same47);
        boolean boolean49 = same23.matches((java.lang.Object) same47);
        org.mockito.internal.matchers.Same same50 = new org.mockito.internal.matchers.Same((java.lang.Object) same47);
        java.lang.String str51 = same50.toString();
        org.hamcrest.Description description52 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) same50, description52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(' ')" + "'", str15, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "same(' ')" + "'", str19, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "same(' ')" + "'", str37, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "same(' ')" + "'", str41, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "same(' ')" + "'", str45, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "same(same(-1))" + "'", str51, "same(same(-1))");
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 1L);
        java.lang.String str2 = same1.toString();
        java.lang.String str3 = same1.toString();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str9 = same8.toString();
        boolean boolean11 = same8.matches((java.lang.Object) (byte) -1);
        boolean boolean12 = same5.matches((java.lang.Object) boolean11);
        java.lang.Class<?> wildcardClass13 = same5.getClass();
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass13);
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) same14);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str18 = same17.toString();
        boolean boolean20 = same17.matches((java.lang.Object) (byte) -1);
        boolean boolean22 = same17.matches((java.lang.Object) (short) 10);
        java.lang.Object obj23 = new java.lang.Object();
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same(obj23);
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean28 = same26.matches((java.lang.Object) ' ');
        java.lang.String str29 = same26.toString();
        java.lang.Class<?> wildcardClass30 = same26.getClass();
        boolean boolean31 = same24.matches((java.lang.Object) wildcardClass30);
        boolean boolean32 = same17.matches((java.lang.Object) wildcardClass30);
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass30);
        boolean boolean34 = same15.matches((java.lang.Object) same33);
        same33._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same36 = new org.mockito.internal.matchers.Same((java.lang.Object) same33);
        boolean boolean37 = same1.matches((java.lang.Object) same36);
        java.lang.Class<?> wildcardClass38 = same1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(1)" + "'", str2, "same(1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "same(1)" + "'", str3, "same(1)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(' ')" + "'", str9, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "same(' ')" + "'", str18, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "same(' ')" + "'", str29, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str6 = same5.toString();
        boolean boolean8 = same5.matches((java.lang.Object) (byte) -1);
        boolean boolean9 = same1.matches((java.lang.Object) (byte) -1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str13 = same1.toString();
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) same15);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) same16);
        boolean boolean18 = same1.matches((java.lang.Object) same17);
        java.lang.String str19 = same1.toString();
        java.lang.Class<?> wildcardClass20 = same1.getClass();
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean28 = same26.matches((java.lang.Object) (-1.0d));
        java.lang.String str29 = same26.toString();
        same26._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean31 = same24.matches((java.lang.Object) same26);
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean34 = same26.matches((java.lang.Object) 0);
        org.mockito.internal.matchers.Same same36 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean38 = same36.matches((java.lang.Object) (-1.0d));
        org.mockito.internal.matchers.Same same40 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str41 = same40.toString();
        boolean boolean43 = same40.matches((java.lang.Object) (byte) -1);
        boolean boolean45 = same40.matches((java.lang.Object) (short) 10);
        java.lang.Object obj46 = new java.lang.Object();
        org.mockito.internal.matchers.Same same47 = new org.mockito.internal.matchers.Same(obj46);
        org.mockito.internal.matchers.Same same49 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean51 = same49.matches((java.lang.Object) ' ');
        java.lang.String str52 = same49.toString();
        java.lang.Class<?> wildcardClass53 = same49.getClass();
        boolean boolean54 = same47.matches((java.lang.Object) wildcardClass53);
        boolean boolean55 = same40.matches((java.lang.Object) wildcardClass53);
        boolean boolean56 = same36.matches((java.lang.Object) boolean55);
        java.lang.String str57 = same36.toString();
        boolean boolean59 = same36.matches((java.lang.Object) (short) 0);
        same36._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean61 = same26.matches((java.lang.Object) same36);
        org.mockito.internal.matchers.Same same62 = new org.mockito.internal.matchers.Same((java.lang.Object) same26);
        java.lang.String str63 = same62.toString();
        java.lang.String str64 = same62.toString();
        org.mockito.internal.matchers.Same same65 = new org.mockito.internal.matchers.Same((java.lang.Object) same62);
        boolean boolean66 = same22.matches((java.lang.Object) same65);
        org.hamcrest.Description description67 = null;
        // The following exception was thrown during execution in test generation
        try {
            same65.describeTo(description67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(' ')" + "'", str6, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(' ')" + "'", str13, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "same(' ')" + "'", str19, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "same(0)" + "'", str29, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "same(' ')" + "'", str41, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "same(' ')" + "'", str52, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "same(0)" + "'", str57, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "same(same(0))" + "'", str63, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "same(same(0))" + "'", str64, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) false);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean5 = same3.matches((java.lang.Object) (-1.0d));
        java.lang.String str6 = same3.toString();
        boolean boolean7 = same1.matches((java.lang.Object) str6);
        java.lang.String str8 = same1.toString();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(0)" + "'", str6, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(false)" + "'", str8, "same(false)");
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str5 = same4.toString();
        boolean boolean7 = same4.matches((java.lang.Object) (byte) -1);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        java.lang.Class<?> wildcardClass9 = same1.getClass();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass9);
        java.lang.String str11 = same10.toString();
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        java.lang.Object obj22 = new java.lang.Object();
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same(obj22);
        boolean boolean25 = same23.matches((java.lang.Object) 100);
        boolean boolean26 = same21.matches((java.lang.Object) 100);
        java.lang.String str27 = same21.toString();
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) str27);
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean32 = same30.matches((java.lang.Object) ' ');
        boolean boolean34 = same30.matches((java.lang.Object) 10.0f);
        same30._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str36 = same30.toString();
        org.mockito.internal.matchers.Same same38 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean40 = same38.matches((java.lang.Object) ' ');
        boolean boolean42 = same38.matches((java.lang.Object) 10.0f);
        same38._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean44 = same30.matches((java.lang.Object) same38);
        java.lang.Class<?> wildcardClass45 = same38.getClass();
        boolean boolean46 = same28.matches((java.lang.Object) wildcardClass45);
        org.mockito.internal.matchers.Same same48 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean50 = same48.matches((java.lang.Object) (-1.0d));
        org.mockito.internal.matchers.Same same52 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str53 = same52.toString();
        boolean boolean55 = same52.matches((java.lang.Object) (byte) -1);
        boolean boolean57 = same52.matches((java.lang.Object) (short) 10);
        java.lang.Object obj58 = new java.lang.Object();
        org.mockito.internal.matchers.Same same59 = new org.mockito.internal.matchers.Same(obj58);
        org.mockito.internal.matchers.Same same61 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean63 = same61.matches((java.lang.Object) ' ');
        java.lang.String str64 = same61.toString();
        java.lang.Class<?> wildcardClass65 = same61.getClass();
        boolean boolean66 = same59.matches((java.lang.Object) wildcardClass65);
        boolean boolean67 = same52.matches((java.lang.Object) wildcardClass65);
        boolean boolean68 = same48.matches((java.lang.Object) boolean67);
        java.lang.Class<?> wildcardClass69 = same48.getClass();
        boolean boolean70 = same28.matches((java.lang.Object) wildcardClass69);
        org.mockito.internal.matchers.Same same71 = new org.mockito.internal.matchers.Same((java.lang.Object) same28);
        java.lang.String str72 = same71.toString();
        org.mockito.internal.matchers.Same same74 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        same74._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean77 = same74.matches((java.lang.Object) (short) 100);
        java.lang.Object obj78 = new java.lang.Object();
        org.mockito.internal.matchers.Same same79 = new org.mockito.internal.matchers.Same(obj78);
        boolean boolean80 = same74.matches((java.lang.Object) same79);
        boolean boolean81 = same71.matches((java.lang.Object) same74);
        org.hamcrest.Description description82 = null;
        // The following exception was thrown during execution in test generation
        try {
            same10.describeMismatch((java.lang.Object) boolean81, description82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(' ')" + "'", str5, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str11, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "same(0)" + "'", str27, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "same(' ')" + "'", str36, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "same(' ')" + "'", str53, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "same(' ')" + "'", str64, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "same(same(\"same(0)\"))" + "'", str72, "same(same(\"same(0)\"))");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str6 = same5.toString();
        boolean boolean8 = same5.matches((java.lang.Object) (byte) -1);
        boolean boolean9 = same1.matches((java.lang.Object) (byte) -1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str16 = same15.toString();
        boolean boolean18 = same15.matches((java.lang.Object) (byte) -1);
        boolean boolean20 = same15.matches((java.lang.Object) (short) 10);
        java.lang.Object obj21 = new java.lang.Object();
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same(obj21);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean26 = same24.matches((java.lang.Object) ' ');
        java.lang.String str27 = same24.toString();
        java.lang.Class<?> wildcardClass28 = same24.getClass();
        boolean boolean29 = same22.matches((java.lang.Object) wildcardClass28);
        boolean boolean30 = same15.matches((java.lang.Object) wildcardClass28);
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass28);
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) same31);
        java.lang.String str33 = same32.toString();
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same((java.lang.Object) 100);
        java.lang.String str36 = same35.toString();
        boolean boolean37 = same32.matches((java.lang.Object) str36);
        java.lang.String str38 = same32.toString();
        same32._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same41 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        java.lang.Object obj42 = new java.lang.Object();
        org.mockito.internal.matchers.Same same43 = new org.mockito.internal.matchers.Same(obj42);
        boolean boolean45 = same43.matches((java.lang.Object) 100);
        boolean boolean46 = same41.matches((java.lang.Object) 100);
        java.lang.String str47 = same41.toString();
        boolean boolean48 = same32.matches((java.lang.Object) str47);
        java.lang.String str49 = same32.toString();
        java.lang.String str50 = same32.toString();
        org.mockito.internal.matchers.Same same52 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        java.lang.Object obj53 = new java.lang.Object();
        org.mockito.internal.matchers.Same same54 = new org.mockito.internal.matchers.Same(obj53);
        boolean boolean56 = same54.matches((java.lang.Object) 100);
        boolean boolean57 = same52.matches((java.lang.Object) 100);
        java.lang.String str58 = same52.toString();
        org.mockito.internal.matchers.Same same59 = new org.mockito.internal.matchers.Same((java.lang.Object) str58);
        org.mockito.internal.matchers.Same same61 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean63 = same61.matches((java.lang.Object) ' ');
        boolean boolean65 = same61.matches((java.lang.Object) 10.0f);
        same61._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str67 = same61.toString();
        org.mockito.internal.matchers.Same same69 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean71 = same69.matches((java.lang.Object) ' ');
        boolean boolean73 = same69.matches((java.lang.Object) 10.0f);
        same69._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean75 = same61.matches((java.lang.Object) same69);
        java.lang.Class<?> wildcardClass76 = same69.getClass();
        boolean boolean77 = same59.matches((java.lang.Object) wildcardClass76);
        boolean boolean78 = same32.matches((java.lang.Object) same59);
        org.hamcrest.Description description79 = null;
        // The following exception was thrown during execution in test generation
        try {
            same12.describeMismatch((java.lang.Object) boolean78, description79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(' ')" + "'", str6, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "same(' ')" + "'", str16, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "same(' ')" + "'", str27, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "same(same(class org.mockito.internal.matchers.Same))" + "'", str33, "same(same(class org.mockito.internal.matchers.Same))");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "same(100)" + "'", str36, "same(100)");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "same(same(class org.mockito.internal.matchers.Same))" + "'", str38, "same(same(class org.mockito.internal.matchers.Same))");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "same(0)" + "'", str47, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "same(same(class org.mockito.internal.matchers.Same))" + "'", str49, "same(same(class org.mockito.internal.matchers.Same))");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "same(same(class org.mockito.internal.matchers.Same))" + "'", str50, "same(same(class org.mockito.internal.matchers.Same))");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "same(0)" + "'", str58, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "same(' ')" + "'", str67, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean6 = same1.matches((java.lang.Object) same5);
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str9 = same8.toString();
        boolean boolean11 = same8.matches((java.lang.Object) (byte) -1);
        boolean boolean13 = same8.matches((java.lang.Object) (short) 10);
        boolean boolean14 = same1.matches((java.lang.Object) same8);
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str16 = same15.toString();
        java.lang.Object obj17 = null;
        boolean boolean18 = same15.matches(obj17);
        java.lang.String str19 = same15.toString();
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str22 = same21.toString();
        boolean boolean24 = same21.matches((java.lang.Object) (byte) -1);
        boolean boolean26 = same21.matches((java.lang.Object) (short) 10);
        java.lang.Object obj27 = new java.lang.Object();
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same(obj27);
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean32 = same30.matches((java.lang.Object) ' ');
        java.lang.String str33 = same30.toString();
        java.lang.Class<?> wildcardClass34 = same30.getClass();
        boolean boolean35 = same28.matches((java.lang.Object) wildcardClass34);
        boolean boolean36 = same21.matches((java.lang.Object) wildcardClass34);
        org.mockito.internal.matchers.Same same37 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass34);
        same37._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean39 = same15.matches((java.lang.Object) same37);
        java.lang.String str40 = same37.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(' ')" + "'", str9, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "same(same(' '))" + "'", str16, "same(same(' '))");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "same(same(' '))" + "'", str19, "same(same(' '))");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "same(' ')" + "'", str22, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "same(' ')" + "'", str33, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str40, "same(class org.mockito.internal.matchers.Same)");
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        boolean boolean5 = same1.matches((java.lang.Object) (short) -1);
        java.lang.String str6 = same1.toString();
        java.lang.String str7 = same1.toString();
        java.lang.String str8 = same1.toString();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.String str12 = same11.toString();
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean16 = same14.matches((java.lang.Object) ' ');
        boolean boolean18 = same14.matches((java.lang.Object) 10.0f);
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str20 = same14.toString();
        boolean boolean21 = same11.matches((java.lang.Object) same14);
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean25 = same23.matches((java.lang.Object) ' ');
        boolean boolean27 = same23.matches((java.lang.Object) 10.0f);
        same23._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same23._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str30 = same23.toString();
        java.lang.Class<?> wildcardClass31 = same23.getClass();
        boolean boolean32 = same14.matches((java.lang.Object) same23);
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean36 = same34.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same38 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean39 = same34.matches((java.lang.Object) same38);
        same34._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean42 = same34.matches((java.lang.Object) "same(100)");
        org.mockito.internal.matchers.Same same44 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same44._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same47 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        boolean boolean48 = same44.matches((java.lang.Object) (short) -1);
        java.lang.String str49 = same44.toString();
        org.mockito.internal.matchers.Same same51 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean53 = same51.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same55 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean56 = same51.matches((java.lang.Object) same55);
        boolean boolean58 = same55.matches((java.lang.Object) 1);
        org.mockito.internal.matchers.Same same60 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean62 = same60.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same64 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean65 = same60.matches((java.lang.Object) same64);
        boolean boolean67 = same64.matches((java.lang.Object) 1);
        boolean boolean69 = same64.matches((java.lang.Object) 10.0f);
        boolean boolean71 = same64.matches((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass72 = same64.getClass();
        boolean boolean73 = same55.matches((java.lang.Object) wildcardClass72);
        boolean boolean75 = same55.matches((java.lang.Object) '4');
        boolean boolean76 = same44.matches((java.lang.Object) boolean75);
        org.mockito.internal.matchers.Same same77 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean75);
        org.mockito.internal.matchers.Same same79 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str80 = same79.toString();
        boolean boolean82 = same79.matches((java.lang.Object) (byte) -1);
        boolean boolean84 = same79.matches((java.lang.Object) (short) 10);
        java.lang.String str85 = same79.toString();
        boolean boolean86 = same77.matches((java.lang.Object) str85);
        boolean boolean87 = same34.matches((java.lang.Object) same77);
        org.mockito.internal.matchers.Same same88 = new org.mockito.internal.matchers.Same((java.lang.Object) same77);
        boolean boolean89 = same14.matches((java.lang.Object) same88);
        boolean boolean90 = same9.matches((java.lang.Object) same88);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(' ')" + "'", str6, "same(' ')");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(' ')" + "'", str7, "same(' ')");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(' ')" + "'", str8, "same(' ')");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "same(0)" + "'", str12, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "same(' ')" + "'", str20, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "same(' ')" + "'", str30, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "same(' ')" + "'", str49, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "same(' ')" + "'", str80, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "same(' ')" + "'", str85, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        org.mockito.internal.matchers.Same same2 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) "same(100)");
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same4);
        java.lang.String str6 = same4.toString();
        boolean boolean7 = same2.matches((java.lang.Object) same4);
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) same2);
        java.lang.String str9 = same2.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(\"same(100)\")" + "'", str6, "same(\"same(100)\")");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(same(-1))" + "'", str9, "same(same(-1))");
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0d));
        java.lang.String str4 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same6);
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) same6);
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str11 = same8.toString();
        java.lang.String str12 = same8.toString();
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(same(same(0)))" + "'", str11, "same(same(same(0)))");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "same(same(same(0)))" + "'", str12, "same(same(same(0)))");
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean5 = same3.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean8 = same3.matches((java.lang.Object) same7);
        boolean boolean10 = same7.matches((java.lang.Object) 1);
        boolean boolean12 = same7.matches((java.lang.Object) 10.0f);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str15 = same14.toString();
        boolean boolean17 = same14.matches((java.lang.Object) 1L);
        boolean boolean18 = same7.matches((java.lang.Object) boolean17);
        java.lang.String str19 = same7.toString();
        boolean boolean20 = same1.matches((java.lang.Object) str19);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str23 = same1.toString();
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) same25);
        boolean boolean27 = same1.matches((java.lang.Object) same25);
        java.lang.Object obj28 = new java.lang.Object();
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same(obj28);
        java.lang.String str30 = same29.toString();
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) same29);
        boolean boolean32 = same25.matches((java.lang.Object) same31);
        same25._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description34 = null;
        // The following exception was thrown during execution in test generation
        try {
            same25.describeTo(description34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(' ')" + "'", str15, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "same(' ')" + "'", str19, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "same(' ')" + "'", str23, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        boolean boolean5 = same1.matches((java.lang.Object) 10.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str7 = same1.toString();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean11 = same9.matches((java.lang.Object) ' ');
        boolean boolean13 = same9.matches((java.lang.Object) 10.0f);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean15 = same1.matches((java.lang.Object) same9);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean18 = same9.matches((java.lang.Object) same17);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean18);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) 'a');
        boolean boolean22 = same19.matches((java.lang.Object) same21);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean26 = same24.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean29 = same24.matches((java.lang.Object) same28);
        boolean boolean31 = same28.matches((java.lang.Object) 1);
        boolean boolean33 = same28.matches((java.lang.Object) 10.0f);
        boolean boolean35 = same28.matches((java.lang.Object) 10);
        java.lang.String str36 = same28.toString();
        java.lang.Object obj37 = null;
        boolean boolean38 = same28.matches(obj37);
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same(obj37);
        java.lang.Class<?> wildcardClass40 = same39.getClass();
        boolean boolean41 = same19.matches((java.lang.Object) wildcardClass40);
        java.lang.Class<?> wildcardClass42 = same19.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(' ')" + "'", str7, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "same(' ')" + "'", str36, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean6 = same1.matches((java.lang.Object) same5);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean9 = same1.matches((java.lang.Object) "same(100)");
        java.lang.String str10 = same1.toString();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean14 = same12.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean17 = same12.matches((java.lang.Object) same16);
        boolean boolean19 = same16.matches((java.lang.Object) 1);
        boolean boolean21 = same16.matches((java.lang.Object) '4');
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) '4');
        java.lang.String str23 = same22.toString();
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) str23);
        java.lang.Class<?> wildcardClass25 = same24.getClass();
        boolean boolean26 = same1.matches((java.lang.Object) same24);
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(' ')" + "'", str10, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "same('4')" + "'", str23, "same('4')");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str5 = same4.toString();
        boolean boolean7 = same4.matches((java.lang.Object) (byte) -1);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        java.lang.Class<?> wildcardClass9 = same1.getClass();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass9);
        java.lang.String str11 = same10.toString();
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.String str20 = same19.toString();
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean24 = same22.matches((java.lang.Object) ' ');
        boolean boolean26 = same22.matches((java.lang.Object) 10.0f);
        same22._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str28 = same22.toString();
        boolean boolean29 = same19.matches((java.lang.Object) same22);
        same22._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean31 = same10.matches((java.lang.Object) same22);
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean35 = same33.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same37 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str38 = same37.toString();
        boolean boolean40 = same37.matches((java.lang.Object) (byte) -1);
        boolean boolean41 = same33.matches((java.lang.Object) (byte) -1);
        same33._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same33._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same44 = new org.mockito.internal.matchers.Same((java.lang.Object) same33);
        java.lang.String str45 = same33.toString();
        org.mockito.internal.matchers.Same same47 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        org.mockito.internal.matchers.Same same48 = new org.mockito.internal.matchers.Same((java.lang.Object) same47);
        org.mockito.internal.matchers.Same same49 = new org.mockito.internal.matchers.Same((java.lang.Object) same48);
        boolean boolean50 = same33.matches((java.lang.Object) same49);
        same33._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same53 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same55 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean57 = same55.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same59 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean60 = same55.matches((java.lang.Object) same59);
        boolean boolean62 = same59.matches((java.lang.Object) 1);
        boolean boolean64 = same59.matches((java.lang.Object) 10.0f);
        org.mockito.internal.matchers.Same same66 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str67 = same66.toString();
        boolean boolean69 = same66.matches((java.lang.Object) 1L);
        boolean boolean70 = same59.matches((java.lang.Object) boolean69);
        java.lang.String str71 = same59.toString();
        boolean boolean72 = same53.matches((java.lang.Object) str71);
        java.lang.String str73 = same53.toString();
        boolean boolean74 = same33.matches((java.lang.Object) same53);
        same53._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same77 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        org.mockito.internal.matchers.Same same78 = new org.mockito.internal.matchers.Same((java.lang.Object) same77);
        org.mockito.internal.matchers.Same same79 = new org.mockito.internal.matchers.Same((java.lang.Object) same78);
        java.lang.String str80 = same78.toString();
        org.mockito.internal.matchers.Same same81 = new org.mockito.internal.matchers.Same((java.lang.Object) same78);
        boolean boolean82 = same53.matches((java.lang.Object) same81);
        boolean boolean83 = same10.matches((java.lang.Object) same81);
        java.lang.Class<?> wildcardClass84 = same81.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(' ')" + "'", str5, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str11, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "same(0)" + "'", str20, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "same(' ')" + "'", str28, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "same(' ')" + "'", str38, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "same(' ')" + "'", str45, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "same(' ')" + "'", str67, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "same(' ')" + "'", str71, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "same(' ')" + "'", str73, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "same(same(1.0))" + "'", str80, "same(same(1.0))");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str2 = same1.toString();
        boolean boolean4 = same1.matches((java.lang.Object) (byte) -1);
        boolean boolean6 = same1.matches((java.lang.Object) (short) 10);
        java.lang.Object obj7 = new java.lang.Object();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same(obj7);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean12 = same10.matches((java.lang.Object) ' ');
        java.lang.String str13 = same10.toString();
        java.lang.Class<?> wildcardClass14 = same10.getClass();
        boolean boolean15 = same8.matches((java.lang.Object) wildcardClass14);
        boolean boolean16 = same1.matches((java.lang.Object) wildcardClass14);
        java.lang.String str17 = same1.toString();
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        same19._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean22 = same19.matches((java.lang.Object) (short) 100);
        java.lang.Object obj23 = new java.lang.Object();
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same(obj23);
        boolean boolean25 = same19.matches((java.lang.Object) same24);
        same24._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same28._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        boolean boolean32 = same28.matches((java.lang.Object) (short) -1);
        same28._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean34 = same24.matches((java.lang.Object) same28);
        boolean boolean35 = same1.matches((java.lang.Object) same24);
        same24._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str37 = same24.toString();
        same24._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(' ')" + "'", str2, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(' ')" + "'", str13, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "same(' ')" + "'", str17, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str5 = same4.toString();
        boolean boolean7 = same4.matches((java.lang.Object) (byte) -1);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        java.lang.Class<?> wildcardClass9 = same1.getClass();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass9);
        java.lang.String str11 = same10.toString();
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        java.lang.String str16 = same15.toString();
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) same18);
        same18._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean21 = same15.matches((java.lang.Object) same18);
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) same15);
        java.lang.Class<?> wildcardClass23 = same15.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(' ')" + "'", str5, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str11, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "same(same(class org.mockito.internal.matchers.Same))" + "'", str16, "same(same(class org.mockito.internal.matchers.Same))");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) (short) -1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str5 = same1.toString();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        boolean boolean10 = same1.matches((java.lang.Object) same9);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.String str13 = same12.toString();
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean17 = same15.matches((java.lang.Object) ' ');
        boolean boolean19 = same15.matches((java.lang.Object) 10.0f);
        same15._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str21 = same15.toString();
        boolean boolean22 = same12.matches((java.lang.Object) same15);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean26 = same24.matches((java.lang.Object) ' ');
        boolean boolean28 = same24.matches((java.lang.Object) 10.0f);
        same24._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same24._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str31 = same24.toString();
        java.lang.Class<?> wildcardClass32 = same24.getClass();
        boolean boolean33 = same15.matches((java.lang.Object) same24);
        same15._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same36 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean38 = same36.matches((java.lang.Object) (-1.0d));
        java.lang.String str39 = same36.toString();
        same36._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same41 = new org.mockito.internal.matchers.Same((java.lang.Object) same36);
        org.mockito.internal.matchers.Same same43 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean45 = same43.matches((java.lang.Object) (-1.0d));
        java.lang.String str46 = same43.toString();
        same43._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same48 = new org.mockito.internal.matchers.Same((java.lang.Object) same43);
        org.mockito.internal.matchers.Same same49 = new org.mockito.internal.matchers.Same((java.lang.Object) same43);
        boolean boolean50 = same41.matches((java.lang.Object) same43);
        org.mockito.internal.matchers.Same same52 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean54 = same52.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same56 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str57 = same56.toString();
        boolean boolean59 = same56.matches((java.lang.Object) (byte) -1);
        boolean boolean60 = same52.matches((java.lang.Object) (byte) -1);
        same52._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same52._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same63 = new org.mockito.internal.matchers.Same((java.lang.Object) same52);
        java.lang.String str64 = same52.toString();
        org.mockito.internal.matchers.Same same66 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        org.mockito.internal.matchers.Same same67 = new org.mockito.internal.matchers.Same((java.lang.Object) same66);
        org.mockito.internal.matchers.Same same68 = new org.mockito.internal.matchers.Same((java.lang.Object) same67);
        boolean boolean69 = same52.matches((java.lang.Object) same68);
        same52._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean71 = same41.matches((java.lang.Object) same52);
        same52._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean73 = same15.matches((java.lang.Object) same52);
        org.mockito.internal.matchers.Same same74 = new org.mockito.internal.matchers.Same((java.lang.Object) same52);
        org.hamcrest.Description description75 = null;
        // The following exception was thrown during execution in test generation
        try {
            same9.describeMismatch((java.lang.Object) same74, description75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(0)" + "'", str5, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(0)" + "'", str13, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "same(' ')" + "'", str21, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "same(' ')" + "'", str31, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "same(0)" + "'", str39, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "same(0)" + "'", str46, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "same(' ')" + "'", str57, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "same(' ')" + "'", str64, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str5 = same4.toString();
        boolean boolean7 = same4.matches((java.lang.Object) (byte) -1);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        java.lang.Class<?> wildcardClass9 = same1.getClass();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass9);
        java.lang.String str11 = same10.toString();
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass13 = same10.getClass();
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        java.lang.Class<?> wildcardClass15 = same10.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(' ')" + "'", str5, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str11, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0d));
        java.lang.String str4 = same1.toString();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean8 = same6.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean11 = same6.matches((java.lang.Object) same10);
        boolean boolean12 = same1.matches((java.lang.Object) boolean11);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean12);
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean17 = same15.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str20 = same19.toString();
        boolean boolean22 = same19.matches((java.lang.Object) (byte) -1);
        boolean boolean23 = same15.matches((java.lang.Object) (byte) -1);
        same15._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same15._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) same15);
        java.lang.String str27 = same15.toString();
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) same29);
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) same30);
        boolean boolean32 = same15.matches((java.lang.Object) same31);
        org.hamcrest.Description description33 = null;
        // The following exception was thrown during execution in test generation
        try {
            same13.describeMismatch((java.lang.Object) boolean32, description33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "same(' ')" + "'", str20, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "same(' ')" + "'", str27, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str6 = same5.toString();
        boolean boolean8 = same5.matches((java.lang.Object) (byte) -1);
        boolean boolean9 = same1.matches((java.lang.Object) (byte) -1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.Class<?> wildcardClass15 = same14.getClass();
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass15);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean20 = same18.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean23 = same18.matches((java.lang.Object) same22);
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str26 = same25.toString();
        boolean boolean28 = same25.matches((java.lang.Object) (byte) -1);
        boolean boolean30 = same25.matches((java.lang.Object) (short) 10);
        boolean boolean31 = same18.matches((java.lang.Object) same25);
        java.lang.String str32 = same25.toString();
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean36 = same34.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same38 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean39 = same34.matches((java.lang.Object) same38);
        boolean boolean41 = same38.matches((java.lang.Object) 1);
        boolean boolean43 = same38.matches((java.lang.Object) 10.0f);
        boolean boolean45 = same38.matches((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass46 = same38.getClass();
        boolean boolean47 = same25.matches((java.lang.Object) wildcardClass46);
        org.mockito.internal.matchers.Same same49 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean51 = same49.matches((java.lang.Object) (-1.0d));
        java.lang.String str52 = same49.toString();
        same49._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same54 = new org.mockito.internal.matchers.Same((java.lang.Object) same49);
        java.lang.Object obj55 = new java.lang.Object();
        org.mockito.internal.matchers.Same same56 = new org.mockito.internal.matchers.Same(obj55);
        org.mockito.internal.matchers.Same same58 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean60 = same58.matches((java.lang.Object) ' ');
        java.lang.String str61 = same58.toString();
        java.lang.Class<?> wildcardClass62 = same58.getClass();
        boolean boolean63 = same56.matches((java.lang.Object) wildcardClass62);
        org.mockito.internal.matchers.Same same64 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean63);
        boolean boolean65 = same49.matches((java.lang.Object) boolean63);
        same49._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same67 = new org.mockito.internal.matchers.Same((java.lang.Object) same49);
        org.mockito.internal.matchers.Same same68 = new org.mockito.internal.matchers.Same((java.lang.Object) same67);
        org.mockito.internal.matchers.Same same69 = new org.mockito.internal.matchers.Same((java.lang.Object) same67);
        boolean boolean70 = same25.matches((java.lang.Object) same67);
        java.lang.String str71 = same25.toString();
        boolean boolean72 = same16.matches((java.lang.Object) str71);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(' ')" + "'", str6, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "same(' ')" + "'", str26, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "same(' ')" + "'", str32, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "same(0)" + "'", str52, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "same(' ')" + "'", str61, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "same(' ')" + "'", str71, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str2 = same1.toString();
        boolean boolean4 = same1.matches((java.lang.Object) (byte) -1);
        boolean boolean6 = same1.matches((java.lang.Object) (short) 10);
        java.lang.Object obj7 = new java.lang.Object();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same(obj7);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean12 = same10.matches((java.lang.Object) ' ');
        java.lang.String str13 = same10.toString();
        java.lang.Class<?> wildcardClass14 = same10.getClass();
        boolean boolean15 = same8.matches((java.lang.Object) wildcardClass14);
        boolean boolean16 = same1.matches((java.lang.Object) wildcardClass14);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass14);
        java.lang.String str18 = same17.toString();
        same17._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same17._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) same17);
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) same17);
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) same22);
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean27 = same25.matches((java.lang.Object) (-1.0d));
        java.lang.String str28 = same25.toString();
        same25._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) same25);
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) same30);
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) same30);
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same36 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean38 = same36.matches((java.lang.Object) (-1.0d));
        java.lang.String str39 = same36.toString();
        same36._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean41 = same34.matches((java.lang.Object) same36);
        org.mockito.internal.matchers.Same same42 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean41);
        boolean boolean43 = same32.matches((java.lang.Object) same42);
        same32._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean45 = same23.matches((java.lang.Object) same32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(' ')" + "'", str2, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(' ')" + "'", str13, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str18, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "same(0)" + "'", str28, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "same(0)" + "'", str39, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str2 = same1.toString();
        boolean boolean4 = same1.matches((java.lang.Object) (byte) -1);
        boolean boolean6 = same1.matches((java.lang.Object) (short) 10);
        java.lang.Object obj7 = new java.lang.Object();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same(obj7);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean12 = same10.matches((java.lang.Object) ' ');
        java.lang.String str13 = same10.toString();
        java.lang.Class<?> wildcardClass14 = same10.getClass();
        boolean boolean15 = same8.matches((java.lang.Object) wildcardClass14);
        boolean boolean16 = same1.matches((java.lang.Object) wildcardClass14);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass14);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean21 = same19.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str24 = same23.toString();
        boolean boolean26 = same23.matches((java.lang.Object) (byte) -1);
        boolean boolean27 = same19.matches((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass28 = same19.getClass();
        boolean boolean29 = same17.matches((java.lang.Object) same19);
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean33 = same31.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean36 = same31.matches((java.lang.Object) same35);
        org.mockito.internal.matchers.Same same38 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str39 = same38.toString();
        boolean boolean41 = same38.matches((java.lang.Object) (byte) -1);
        boolean boolean43 = same38.matches((java.lang.Object) (short) 10);
        boolean boolean44 = same31.matches((java.lang.Object) same38);
        java.lang.String str45 = same31.toString();
        org.mockito.internal.matchers.Same same47 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean49 = same47.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same51 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean52 = same47.matches((java.lang.Object) same51);
        boolean boolean54 = same51.matches((java.lang.Object) 1);
        boolean boolean56 = same51.matches((java.lang.Object) 10.0f);
        java.lang.String str57 = same51.toString();
        same51._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean59 = same31.matches((java.lang.Object) same51);
        org.mockito.internal.matchers.Same same60 = new org.mockito.internal.matchers.Same((java.lang.Object) same31);
        boolean boolean61 = same17.matches((java.lang.Object) same31);
        java.lang.Class<?> wildcardClass62 = same31.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(' ')" + "'", str2, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(' ')" + "'", str13, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "same(' ')" + "'", str24, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "same(' ')" + "'", str39, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "same(' ')" + "'", str45, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "same(' ')" + "'", str57, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0d));
        java.lang.String str4 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.Object obj7 = new java.lang.Object();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same(obj7);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean12 = same10.matches((java.lang.Object) ' ');
        java.lang.String str13 = same10.toString();
        java.lang.Class<?> wildcardClass14 = same10.getClass();
        boolean boolean15 = same8.matches((java.lang.Object) wildcardClass14);
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean15);
        boolean boolean17 = same1.matches((java.lang.Object) boolean15);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) same19);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) same19);
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean25 = same23.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean28 = same23.matches((java.lang.Object) same27);
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str31 = same30.toString();
        boolean boolean33 = same30.matches((java.lang.Object) (byte) -1);
        boolean boolean35 = same30.matches((java.lang.Object) (short) 10);
        boolean boolean36 = same23.matches((java.lang.Object) same30);
        java.lang.String str37 = same30.toString();
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean41 = same39.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same43 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean44 = same39.matches((java.lang.Object) same43);
        boolean boolean46 = same43.matches((java.lang.Object) 1);
        boolean boolean48 = same43.matches((java.lang.Object) 10.0f);
        boolean boolean50 = same43.matches((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass51 = same43.getClass();
        boolean boolean52 = same30.matches((java.lang.Object) wildcardClass51);
        org.mockito.internal.matchers.Same same54 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str55 = same54.toString();
        boolean boolean57 = same54.matches((java.lang.Object) (byte) -1);
        boolean boolean59 = same54.matches((java.lang.Object) (short) 10);
        java.lang.Object obj60 = new java.lang.Object();
        org.mockito.internal.matchers.Same same61 = new org.mockito.internal.matchers.Same(obj60);
        org.mockito.internal.matchers.Same same63 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean65 = same63.matches((java.lang.Object) ' ');
        java.lang.String str66 = same63.toString();
        java.lang.Class<?> wildcardClass67 = same63.getClass();
        boolean boolean68 = same61.matches((java.lang.Object) wildcardClass67);
        boolean boolean69 = same54.matches((java.lang.Object) wildcardClass67);
        java.lang.String str70 = same54.toString();
        boolean boolean72 = same54.matches((java.lang.Object) "same(same(class org.mockito.internal.matchers.Same))");
        java.lang.String str73 = same54.toString();
        boolean boolean74 = same30.matches((java.lang.Object) str73);
        org.hamcrest.Description description75 = null;
        // The following exception was thrown during execution in test generation
        try {
            same19.describeMismatch((java.lang.Object) same30, description75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(' ')" + "'", str13, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "same(' ')" + "'", str31, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "same(' ')" + "'", str37, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "same(' ')" + "'", str55, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "same(' ')" + "'", str66, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "same(' ')" + "'", str70, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "same(' ')" + "'", str73, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean6 = same1.matches((java.lang.Object) same5);
        boolean boolean8 = same5.matches((java.lang.Object) 1);
        boolean boolean10 = same5.matches((java.lang.Object) 10.0f);
        boolean boolean12 = same5.matches((java.lang.Object) 10);
        java.lang.String str13 = same5.toString();
        java.lang.String str14 = same5.toString();
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass16 = same5.getClass();
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass16);
        java.lang.String str18 = same17.toString();
        same17._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) same17);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) same17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(' ')" + "'", str13, "same(' ')");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(' ')" + "'", str14, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str18, "same(class org.mockito.internal.matchers.Same)");
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        boolean boolean5 = same1.matches((java.lang.Object) (short) -1);
        java.lang.String str6 = same1.toString();
        java.lang.String str7 = same1.toString();
        java.lang.String str8 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str10 = same1.toString();
        boolean boolean12 = same1.matches((java.lang.Object) (short) 1);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(' ')" + "'", str6, "same(' ')");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(' ')" + "'", str7, "same(' ')");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(' ')" + "'", str8, "same(' ')");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(' ')" + "'", str10, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        java.lang.String str4 = same1.toString();
        java.lang.String str5 = same1.toString();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean10 = same1.matches((java.lang.Object) same8);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str12 = same1.toString();
        java.lang.String str13 = same1.toString();
        org.hamcrest.Description description14 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0d));
        java.lang.String str4 = same1.toString();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean8 = same6.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean11 = same6.matches((java.lang.Object) same10);
        boolean boolean12 = same1.matches((java.lang.Object) boolean11);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean11);
        java.lang.String str14 = same13.toString();
        java.lang.Class<?> wildcardClass15 = same13.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(false)" + "'", str14, "same(false)");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean6 = same1.matches((java.lang.Object) same5);
        boolean boolean8 = same5.matches((java.lang.Object) 1);
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean8);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean8);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean8);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean15 = same13.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str18 = same17.toString();
        boolean boolean20 = same17.matches((java.lang.Object) (byte) -1);
        boolean boolean21 = same13.matches((java.lang.Object) (byte) -1);
        same13._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same13._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) same13);
        java.lang.Class<?> wildcardClass25 = same13.getClass();
        boolean boolean26 = same11.matches((java.lang.Object) wildcardClass25);
        java.lang.String str27 = same11.toString();
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str31 = same11.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "same(' ')" + "'", str18, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "same(false)" + "'", str27, "same(false)");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "same(false)" + "'", str31, "same(false)");
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        org.mockito.internal.matchers.Same same2 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same4._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        boolean boolean8 = same4.matches((java.lang.Object) (short) -1);
        java.lang.String str9 = same4.toString();
        java.lang.Class<?> wildcardClass10 = same4.getClass();
        boolean boolean11 = same2.matches((java.lang.Object) wildcardClass10);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean15 = same13.matches((java.lang.Object) ' ');
        boolean boolean16 = same2.matches((java.lang.Object) same13);
        java.lang.Class<?> wildcardClass17 = same13.getClass();
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass17);
        java.lang.String str19 = same18.toString();
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) str19);
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        boolean boolean24 = same22.matches((java.lang.Object) (byte) 100);
        java.lang.String str25 = same22.toString();
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) same22);
        java.lang.String str27 = same26.toString();
        java.lang.String str28 = same26.toString();
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same30._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        boolean boolean34 = same30.matches((java.lang.Object) (short) -1);
        java.lang.String str35 = same30.toString();
        java.lang.String str36 = same30.toString();
        java.lang.String str37 = same30.toString();
        java.lang.String str38 = same30.toString();
        boolean boolean39 = same26.matches((java.lang.Object) same30);
        org.hamcrest.Description description40 = null;
        // The following exception was thrown during execution in test generation
        try {
            same20.describeMismatch((java.lang.Object) same30, description40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(' ')" + "'", str9, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str19, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "same(-1)" + "'", str25, "same(-1)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "same(same(-1))" + "'", str27, "same(same(-1))");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "same(same(-1))" + "'", str28, "same(same(-1))");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "same(' ')" + "'", str35, "same(' ')");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "same(' ')" + "'", str36, "same(' ')");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "same(' ')" + "'", str37, "same(' ')");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "same(' ')" + "'", str38, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0d));
        java.lang.String str4 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean10 = same8.matches((java.lang.Object) (-1.0d));
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str13 = same12.toString();
        boolean boolean15 = same12.matches((java.lang.Object) (byte) -1);
        boolean boolean17 = same12.matches((java.lang.Object) (short) 10);
        java.lang.Object obj18 = new java.lang.Object();
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same(obj18);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean23 = same21.matches((java.lang.Object) ' ');
        java.lang.String str24 = same21.toString();
        java.lang.Class<?> wildcardClass25 = same21.getClass();
        boolean boolean26 = same19.matches((java.lang.Object) wildcardClass25);
        boolean boolean27 = same12.matches((java.lang.Object) wildcardClass25);
        boolean boolean28 = same8.matches((java.lang.Object) boolean27);
        java.lang.String str29 = same8.toString();
        boolean boolean30 = same1.matches((java.lang.Object) str29);
        java.lang.Class<?> wildcardClass31 = same1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(' ')" + "'", str13, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "same(' ')" + "'", str24, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "same(0)" + "'", str29, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str6 = same5.toString();
        boolean boolean8 = same5.matches((java.lang.Object) (byte) -1);
        boolean boolean9 = same1.matches((java.lang.Object) (byte) -1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) same11);
        java.lang.Object obj14 = new java.lang.Object();
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same(obj14);
        boolean boolean17 = same15.matches((java.lang.Object) 100);
        java.lang.String str18 = same15.toString();
        java.lang.String str19 = same15.toString();
        same15._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) same15);
        boolean boolean22 = same13.matches((java.lang.Object) same15);
        org.hamcrest.Description description23 = null;
        // The following exception was thrown during execution in test generation
        try {
            same15.describeTo(description23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(' ')" + "'", str6, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        boolean boolean5 = same1.matches((java.lang.Object) 10.0f);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 100.0f);
        java.lang.String str8 = same7.toString();
        boolean boolean9 = same1.matches((java.lang.Object) str8);
        java.lang.String str10 = same1.toString();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean16 = same1.matches((java.lang.Object) same12);
        java.lang.Object obj17 = null;
        boolean boolean18 = same1.matches(obj17);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(100.0)" + "'", str8, "same(100.0)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(' ')" + "'", str10, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean6 = same1.matches((java.lang.Object) same5);
        boolean boolean8 = same5.matches((java.lang.Object) 1);
        boolean boolean10 = same5.matches((java.lang.Object) '4');
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) '4');
        java.lang.String str12 = same11.toString();
        boolean boolean14 = same11.matches((java.lang.Object) '#');
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean18 = same16.matches((java.lang.Object) (-1.0d));
        java.lang.String str19 = same16.toString();
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) same16);
        java.lang.Object obj22 = new java.lang.Object();
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same(obj22);
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean27 = same25.matches((java.lang.Object) ' ');
        java.lang.String str28 = same25.toString();
        java.lang.Class<?> wildcardClass29 = same25.getClass();
        boolean boolean30 = same23.matches((java.lang.Object) wildcardClass29);
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean30);
        boolean boolean32 = same16.matches((java.lang.Object) boolean30);
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same34._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same37 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str38 = same37.toString();
        boolean boolean40 = same37.matches((java.lang.Object) (byte) -1);
        boolean boolean41 = same34.matches((java.lang.Object) boolean40);
        java.lang.Class<?> wildcardClass42 = same34.getClass();
        org.mockito.internal.matchers.Same same43 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass42);
        java.lang.String str44 = same43.toString();
        same43._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same46 = new org.mockito.internal.matchers.Same((java.lang.Object) same43);
        org.mockito.internal.matchers.Same same47 = new org.mockito.internal.matchers.Same((java.lang.Object) same46);
        boolean boolean48 = same16.matches((java.lang.Object) same46);
        org.mockito.internal.matchers.Same same49 = new org.mockito.internal.matchers.Same((java.lang.Object) same46);
        org.mockito.internal.matchers.Same same50 = new org.mockito.internal.matchers.Same((java.lang.Object) same46);
        boolean boolean51 = same11.matches((java.lang.Object) same50);
        java.lang.String str52 = same50.toString();
        org.mockito.internal.matchers.Same same53 = new org.mockito.internal.matchers.Same((java.lang.Object) same50);
        java.lang.String str54 = same50.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "same('4')" + "'", str12, "same('4')");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "same(0)" + "'", str19, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "same(' ')" + "'", str28, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "same(' ')" + "'", str38, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str44, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "same(same(same(class org.mockito.internal.matchers.Same)))" + "'", str52, "same(same(same(class org.mockito.internal.matchers.Same)))");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "same(same(same(class org.mockito.internal.matchers.Same)))" + "'", str54, "same(same(same(class org.mockito.internal.matchers.Same)))");
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str5 = same4.toString();
        boolean boolean7 = same4.matches((java.lang.Object) (byte) -1);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        java.lang.Class<?> wildcardClass9 = same1.getClass();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass9);
        java.lang.String str11 = same10.toString();
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) same15);
        org.hamcrest.Description description17 = null;
        // The following exception was thrown during execution in test generation
        try {
            same16.describeTo(description17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(' ')" + "'", str5, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str11, "same(class org.mockito.internal.matchers.Same)");
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        boolean boolean5 = same1.matches((java.lang.Object) 10.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str7 = same1.toString();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean11 = same9.matches((java.lang.Object) ' ');
        boolean boolean13 = same9.matches((java.lang.Object) 10.0f);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean15 = same1.matches((java.lang.Object) same9);
        java.lang.String str16 = same1.toString();
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean20 = same18.matches((java.lang.Object) (-1.0d));
        java.lang.String str21 = same18.toString();
        same18._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) same18);
        boolean boolean24 = same1.matches((java.lang.Object) same23);
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str26 = same25.toString();
        java.lang.String str27 = same25.toString();
        org.hamcrest.Description description28 = null;
        // The following exception was thrown during execution in test generation
        try {
            same25.describeTo(description28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(' ')" + "'", str7, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "same(' ')" + "'", str16, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "same(0)" + "'", str21, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "same(same(' '))" + "'", str26, "same(same(' '))");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "same(same(' '))" + "'", str27, "same(same(' '))");
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        java.lang.String str4 = same1.toString();
        java.lang.String str5 = same1.toString();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean10 = same1.matches((java.lang.Object) same8);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) same11);
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean18 = same16.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        boolean boolean21 = same16.matches((java.lang.Object) same20);
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) same16);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) same23);
        java.lang.String str25 = same23.toString();
        boolean boolean26 = same14.matches((java.lang.Object) same23);
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same28._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str32 = same31.toString();
        boolean boolean34 = same31.matches((java.lang.Object) (byte) -1);
        boolean boolean35 = same28.matches((java.lang.Object) boolean34);
        java.lang.Class<?> wildcardClass36 = same28.getClass();
        org.mockito.internal.matchers.Same same37 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass36);
        java.lang.String str38 = same37.toString();
        java.lang.String str39 = same37.toString();
        java.lang.Class<?> wildcardClass40 = same37.getClass();
        org.mockito.internal.matchers.Same same41 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass40);
        org.mockito.internal.matchers.Same same42 = new org.mockito.internal.matchers.Same((java.lang.Object) same41);
        org.mockito.internal.matchers.Same same43 = new org.mockito.internal.matchers.Same((java.lang.Object) same42);
        org.mockito.internal.matchers.Same same44 = new org.mockito.internal.matchers.Same((java.lang.Object) same43);
        org.mockito.internal.matchers.Same same46 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str47 = same46.toString();
        java.lang.Class<?> wildcardClass48 = same46.getClass();
        boolean boolean49 = same43.matches((java.lang.Object) same46);
        org.hamcrest.Description description50 = null;
        // The following exception was thrown during execution in test generation
        try {
            same23.describeMismatch((java.lang.Object) boolean49, description50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "same(same(' '))" + "'", str25, "same(same(' '))");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "same(' ')" + "'", str32, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str38, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str39, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "same(' ')" + "'", str47, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0d));
        java.lang.String str4 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str7 = same6.toString();
        boolean boolean9 = same6.matches((java.lang.Object) (short) -1);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str18 = same17.toString();
        boolean boolean20 = same17.matches((java.lang.Object) (byte) -1);
        boolean boolean21 = same14.matches((java.lang.Object) boolean20);
        java.lang.Class<?> wildcardClass22 = same14.getClass();
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass22);
        java.lang.String str24 = same23.toString();
        same23._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) same23);
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) same26);
        boolean boolean28 = same11.matches((java.lang.Object) same27);
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        boolean boolean31 = same11.matches((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass32 = same11.getClass();
        org.hamcrest.Description description33 = null;
        // The following exception was thrown during execution in test generation
        try {
            same6.describeMismatch((java.lang.Object) same11, description33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(same(0))" + "'", str7, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "same(' ')" + "'", str18, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str24, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str5 = same4.toString();
        boolean boolean7 = same4.matches((java.lang.Object) (byte) -1);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        java.lang.Class<?> wildcardClass9 = same1.getClass();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass9);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str14 = same13.toString();
        boolean boolean16 = same13.matches((java.lang.Object) (byte) -1);
        boolean boolean18 = same13.matches((java.lang.Object) (short) 10);
        java.lang.Object obj19 = new java.lang.Object();
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same(obj19);
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean24 = same22.matches((java.lang.Object) ' ');
        java.lang.String str25 = same22.toString();
        java.lang.Class<?> wildcardClass26 = same22.getClass();
        boolean boolean27 = same20.matches((java.lang.Object) wildcardClass26);
        boolean boolean28 = same13.matches((java.lang.Object) wildcardClass26);
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass26);
        boolean boolean30 = same11.matches((java.lang.Object) same29);
        same29._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same29._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) same29);
        java.lang.Object obj34 = null;
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same(obj34);
        org.mockito.internal.matchers.Same same36 = new org.mockito.internal.matchers.Same(obj34);
        boolean boolean37 = same29.matches(obj34);
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean41 = same39.matches((java.lang.Object) ' ');
        boolean boolean43 = same39.matches((java.lang.Object) 10.0f);
        same39._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str45 = same39.toString();
        org.mockito.internal.matchers.Same same47 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean49 = same47.matches((java.lang.Object) ' ');
        boolean boolean51 = same47.matches((java.lang.Object) 10.0f);
        same47._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean53 = same39.matches((java.lang.Object) same47);
        org.mockito.internal.matchers.Same same54 = new org.mockito.internal.matchers.Same((java.lang.Object) same47);
        java.lang.Class<?> wildcardClass55 = same47.getClass();
        boolean boolean56 = same29.matches((java.lang.Object) same47);
        java.lang.Object obj57 = new java.lang.Object();
        org.mockito.internal.matchers.Same same58 = new org.mockito.internal.matchers.Same(obj57);
        boolean boolean60 = same58.matches((java.lang.Object) 100);
        java.lang.String str61 = same58.toString();
        java.lang.String str62 = same58.toString();
        org.mockito.internal.matchers.Same same64 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        org.mockito.internal.matchers.Same same65 = new org.mockito.internal.matchers.Same((java.lang.Object) same64);
        same65._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean67 = same58.matches((java.lang.Object) same65);
        org.mockito.internal.matchers.Same same68 = new org.mockito.internal.matchers.Same((java.lang.Object) same58);
        same68._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same68._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same71 = new org.mockito.internal.matchers.Same((java.lang.Object) same68);
        java.lang.Class<?> wildcardClass72 = same68.getClass();
        boolean boolean73 = same47.matches((java.lang.Object) wildcardClass72);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(' ')" + "'", str5, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(' ')" + "'", str14, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "same(' ')" + "'", str25, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "same(' ')" + "'", str45, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        java.lang.String str4 = same1.toString();
        java.lang.String str5 = same1.toString();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean9 = same7.matches((java.lang.Object) (-1.0d));
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str12 = same11.toString();
        boolean boolean14 = same11.matches((java.lang.Object) (byte) -1);
        boolean boolean16 = same11.matches((java.lang.Object) (short) 10);
        java.lang.Object obj17 = new java.lang.Object();
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same(obj17);
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean22 = same20.matches((java.lang.Object) ' ');
        java.lang.String str23 = same20.toString();
        java.lang.Class<?> wildcardClass24 = same20.getClass();
        boolean boolean25 = same18.matches((java.lang.Object) wildcardClass24);
        boolean boolean26 = same11.matches((java.lang.Object) wildcardClass24);
        boolean boolean27 = same7.matches((java.lang.Object) boolean26);
        java.lang.String str28 = same7.toString();
        boolean boolean30 = same7.matches((java.lang.Object) (short) 0);
        boolean boolean31 = same1.matches((java.lang.Object) same7);
        java.lang.String str32 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str34 = same1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "same(' ')" + "'", str12, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "same(' ')" + "'", str23, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "same(0)" + "'", str28, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        java.lang.String str4 = same1.toString();
        java.lang.String str5 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        boolean boolean13 = same9.matches((java.lang.Object) (short) -1);
        java.lang.String str14 = same9.toString();
        java.lang.String str15 = same9.toString();
        java.lang.String str16 = same9.toString();
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) same9);
        java.lang.String str18 = same9.toString();
        boolean boolean19 = same7.matches((java.lang.Object) str18);
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean19);
        org.hamcrest.Description description21 = null;
        // The following exception was thrown during execution in test generation
        try {
            same20.describeTo(description21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(' ')" + "'", str14, "same(' ')");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(' ')" + "'", str15, "same(' ')");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "same(' ')" + "'", str16, "same(' ')");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "same(' ')" + "'", str18, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str5 = same4.toString();
        boolean boolean7 = same4.matches((java.lang.Object) (byte) -1);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        java.lang.Class<?> wildcardClass9 = same1.getClass();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass9);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        java.lang.String str12 = same11.toString();
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean17 = same15.matches((java.lang.Object) (-1.0d));
        java.lang.String str18 = same15.toString();
        same15._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) same15);
        java.lang.Object obj21 = new java.lang.Object();
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same(obj21);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean26 = same24.matches((java.lang.Object) ' ');
        java.lang.String str27 = same24.toString();
        java.lang.Class<?> wildcardClass28 = same24.getClass();
        boolean boolean29 = same22.matches((java.lang.Object) wildcardClass28);
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean29);
        boolean boolean31 = same15.matches((java.lang.Object) boolean29);
        same15._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) same15);
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) same33);
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same((java.lang.Object) same33);
        boolean boolean36 = same11.matches((java.lang.Object) same35);
        java.lang.String str37 = same35.toString();
        same35._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass39 = same35.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(' ')" + "'", str5, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "same(same(class org.mockito.internal.matchers.Same))" + "'", str12, "same(same(class org.mockito.internal.matchers.Same))");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "same(0)" + "'", str18, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "same(' ')" + "'", str27, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "same(same(same(0)))" + "'", str37, "same(same(same(0)))");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean6 = same1.matches((java.lang.Object) same5);
        boolean boolean8 = same5.matches((java.lang.Object) 1);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean12 = same10.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean15 = same10.matches((java.lang.Object) same14);
        boolean boolean17 = same14.matches((java.lang.Object) 1);
        boolean boolean19 = same14.matches((java.lang.Object) 10.0f);
        boolean boolean21 = same14.matches((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass22 = same14.getClass();
        boolean boolean23 = same5.matches((java.lang.Object) wildcardClass22);
        java.lang.String str24 = same5.toString();
        java.lang.String str25 = same5.toString();
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) str25);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "same(' ')" + "'", str24, "same(' ')");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "same(' ')" + "'", str25, "same(' ')");
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean5 = same3.matches((java.lang.Object) (-1.0d));
        java.lang.String str6 = same3.toString();
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean8 = same1.matches((java.lang.Object) same3);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean11 = same3.matches((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass12 = same3.getClass();
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = same13.getClass();
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(0)" + "'", str6, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        boolean boolean6 = same1.matches((java.lang.Object) same5);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str8 = same1.toString();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.Class<?> wildcardClass10 = same1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(' ')" + "'", str8, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str5 = same4.toString();
        boolean boolean7 = same4.matches((java.lang.Object) (byte) -1);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean13 = same11.matches((java.lang.Object) (-1.0d));
        java.lang.String str14 = same11.toString();
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) same11);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) same16);
        java.lang.String str18 = same16.toString();
        boolean boolean19 = same1.matches((java.lang.Object) same16);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(' ')" + "'", str5, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(0)" + "'", str14, "same(0)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "same(same(0))" + "'", str18, "same(same(0))");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str6 = same5.toString();
        boolean boolean8 = same5.matches((java.lang.Object) (byte) -1);
        boolean boolean9 = same1.matches((java.lang.Object) (byte) -1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str13 = same1.toString();
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) same14);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean19 = same17.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean22 = same17.matches((java.lang.Object) same21);
        java.lang.String str23 = same17.toString();
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) same17);
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same26._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str30 = same29.toString();
        boolean boolean32 = same29.matches((java.lang.Object) (byte) -1);
        boolean boolean33 = same26.matches((java.lang.Object) boolean32);
        java.lang.Class<?> wildcardClass34 = same26.getClass();
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass34);
        java.lang.String str36 = same35.toString();
        java.lang.String str37 = same35.toString();
        boolean boolean38 = same17.matches((java.lang.Object) same35);
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean38);
        boolean boolean40 = same14.matches((java.lang.Object) boolean38);
        same14._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same43 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean45 = same43.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same47 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean48 = same43.matches((java.lang.Object) same47);
        org.mockito.internal.matchers.Same same50 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str51 = same50.toString();
        boolean boolean53 = same50.matches((java.lang.Object) (byte) -1);
        boolean boolean55 = same50.matches((java.lang.Object) (short) 10);
        boolean boolean56 = same43.matches((java.lang.Object) same50);
        same50._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same58 = new org.mockito.internal.matchers.Same((java.lang.Object) same50);
        same58._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same60 = new org.mockito.internal.matchers.Same((java.lang.Object) same58);
        same58._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description62 = null;
        // The following exception was thrown during execution in test generation
        try {
            same14.describeMismatch((java.lang.Object) same58, description62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(' ')" + "'", str6, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(' ')" + "'", str13, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "same(' ')" + "'", str23, "same(' ')");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "same(' ')" + "'", str30, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str36, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str37, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "same(' ')" + "'", str51, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        org.mockito.internal.matchers.Same same2 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same4._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        boolean boolean8 = same4.matches((java.lang.Object) (short) -1);
        java.lang.String str9 = same4.toString();
        java.lang.Class<?> wildcardClass10 = same4.getClass();
        boolean boolean11 = same2.matches((java.lang.Object) wildcardClass10);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean15 = same13.matches((java.lang.Object) ' ');
        boolean boolean16 = same2.matches((java.lang.Object) same13);
        java.lang.Class<?> wildcardClass17 = same13.getClass();
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass17);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) same18);
        boolean boolean21 = same19.matches((java.lang.Object) "same(\"same(same(0))\")");
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str24 = same23.toString();
        boolean boolean26 = same23.matches((java.lang.Object) (byte) -1);
        boolean boolean28 = same23.matches((java.lang.Object) (short) 10);
        java.lang.Object obj29 = new java.lang.Object();
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same(obj29);
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean34 = same32.matches((java.lang.Object) ' ');
        java.lang.String str35 = same32.toString();
        java.lang.Class<?> wildcardClass36 = same32.getClass();
        boolean boolean37 = same30.matches((java.lang.Object) wildcardClass36);
        boolean boolean38 = same23.matches((java.lang.Object) wildcardClass36);
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass36);
        org.mockito.internal.matchers.Same same40 = new org.mockito.internal.matchers.Same((java.lang.Object) same39);
        java.lang.String str41 = same40.toString();
        org.mockito.internal.matchers.Same same43 = new org.mockito.internal.matchers.Same((java.lang.Object) 100);
        java.lang.String str44 = same43.toString();
        boolean boolean45 = same40.matches((java.lang.Object) str44);
        java.lang.String str46 = same40.toString();
        same40._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description48 = null;
        // The following exception was thrown during execution in test generation
        try {
            same19.describeMismatch((java.lang.Object) same40, description48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(' ')" + "'", str9, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "same(' ')" + "'", str24, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "same(' ')" + "'", str35, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "same(same(class org.mockito.internal.matchers.Same))" + "'", str41, "same(same(class org.mockito.internal.matchers.Same))");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "same(100)" + "'", str44, "same(100)");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "same(same(class org.mockito.internal.matchers.Same))" + "'", str46, "same(same(class org.mockito.internal.matchers.Same))");
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean6 = same1.matches((java.lang.Object) same5);
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str9 = same8.toString();
        boolean boolean11 = same8.matches((java.lang.Object) (byte) -1);
        boolean boolean13 = same8.matches((java.lang.Object) (short) 10);
        boolean boolean14 = same1.matches((java.lang.Object) same8);
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str16 = same15.toString();
        java.lang.String str17 = same15.toString();
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same15);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) same18);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(' ')" + "'", str9, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "same(same(' '))" + "'", str16, "same(same(' '))");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "same(same(' '))" + "'", str17, "same(same(' '))");
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        boolean boolean5 = same1.matches((java.lang.Object) 10.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str7 = same1.toString();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean11 = same9.matches((java.lang.Object) ' ');
        boolean boolean13 = same9.matches((java.lang.Object) 10.0f);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean15 = same1.matches((java.lang.Object) same9);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean18 = same9.matches((java.lang.Object) same17);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean18);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) 'a');
        boolean boolean22 = same19.matches((java.lang.Object) same21);
        java.lang.String str23 = same21.toString();
        same21._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(' ')" + "'", str7, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "same('a')" + "'", str23, "same('a')");
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        boolean boolean5 = same1.matches((java.lang.Object) 10.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str7 = same1.toString();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean11 = same9.matches((java.lang.Object) ' ');
        boolean boolean13 = same9.matches((java.lang.Object) 10.0f);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean15 = same1.matches((java.lang.Object) same9);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean18 = same9.matches((java.lang.Object) same17);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) same17);
        org.hamcrest.Description description20 = null;
        // The following exception was thrown during execution in test generation
        try {
            same19.describeTo(description20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(' ')" + "'", str7, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 100.0d);
        java.lang.String str2 = same1.toString();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean6 = same4.matches((java.lang.Object) ' ');
        boolean boolean8 = same4.matches((java.lang.Object) 10.0f);
        same4._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str10 = same4.toString();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean14 = same12.matches((java.lang.Object) ' ');
        boolean boolean16 = same12.matches((java.lang.Object) 10.0f);
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean18 = same4.matches((java.lang.Object) same12);
        boolean boolean19 = same1.matches((java.lang.Object) same4);
        org.hamcrest.Description description20 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(100.0)" + "'", str2, "same(100.0)");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(' ')" + "'", str10, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean5 = same3.matches((java.lang.Object) (-1.0d));
        java.lang.String str6 = same3.toString();
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean8 = same1.matches((java.lang.Object) same3);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean11 = same3.matches((java.lang.Object) 0);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean15 = same13.matches((java.lang.Object) (-1.0d));
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str18 = same17.toString();
        boolean boolean20 = same17.matches((java.lang.Object) (byte) -1);
        boolean boolean22 = same17.matches((java.lang.Object) (short) 10);
        java.lang.Object obj23 = new java.lang.Object();
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same(obj23);
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean28 = same26.matches((java.lang.Object) ' ');
        java.lang.String str29 = same26.toString();
        java.lang.Class<?> wildcardClass30 = same26.getClass();
        boolean boolean31 = same24.matches((java.lang.Object) wildcardClass30);
        boolean boolean32 = same17.matches((java.lang.Object) wildcardClass30);
        boolean boolean33 = same13.matches((java.lang.Object) boolean32);
        java.lang.String str34 = same13.toString();
        boolean boolean36 = same13.matches((java.lang.Object) (short) 0);
        same13._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean38 = same3.matches((java.lang.Object) same13);
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same((java.lang.Object) same3);
        java.lang.String str40 = same39.toString();
        java.lang.String str41 = same39.toString();
        org.mockito.internal.matchers.Same same42 = new org.mockito.internal.matchers.Same((java.lang.Object) same39);
        org.mockito.internal.matchers.Same same43 = new org.mockito.internal.matchers.Same((java.lang.Object) same42);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(0)" + "'", str6, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "same(' ')" + "'", str18, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "same(' ')" + "'", str29, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "same(0)" + "'", str34, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "same(same(0))" + "'", str40, "same(same(0))");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "same(same(0))" + "'", str41, "same(same(0))");
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0d));
        java.lang.String str4 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) same8);
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        java.lang.String str2 = same1.toString();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean6 = same4.matches((java.lang.Object) ' ');
        boolean boolean8 = same4.matches((java.lang.Object) 10.0f);
        same4._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str10 = same4.toString();
        boolean boolean11 = same1.matches((java.lang.Object) same4);
        same4._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass13 = same4.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(0)" + "'", str2, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(' ')" + "'", str10, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        org.mockito.internal.matchers.Same same2 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str3 = same1.toString();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean7 = same5.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean10 = same5.matches((java.lang.Object) same9);
        boolean boolean12 = same9.matches((java.lang.Object) 1);
        boolean boolean14 = same9.matches((java.lang.Object) 10.0f);
        boolean boolean16 = same9.matches((java.lang.Object) 10);
        java.lang.String str17 = same9.toString();
        java.lang.String str18 = same9.toString();
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean20 = same1.matches((java.lang.Object) same9);
        java.lang.Class<?> wildcardClass21 = same9.getClass();
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) same9);
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) same22);
        java.lang.Class<?> wildcardClass24 = same22.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "same(0)" + "'", str3, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "same(' ')" + "'", str17, "same(' ')");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "same(' ')" + "'", str18, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean5 = same3.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean8 = same3.matches((java.lang.Object) same7);
        boolean boolean10 = same7.matches((java.lang.Object) 1);
        boolean boolean12 = same7.matches((java.lang.Object) 10.0f);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str15 = same14.toString();
        boolean boolean17 = same14.matches((java.lang.Object) 1L);
        boolean boolean18 = same7.matches((java.lang.Object) boolean17);
        java.lang.String str19 = same7.toString();
        boolean boolean20 = same1.matches((java.lang.Object) str19);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str25 = same24.toString();
        boolean boolean27 = same24.matches((java.lang.Object) (byte) -1);
        boolean boolean29 = same24.matches((java.lang.Object) (short) 10);
        java.lang.Object obj30 = new java.lang.Object();
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same(obj30);
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean35 = same33.matches((java.lang.Object) ' ');
        java.lang.String str36 = same33.toString();
        java.lang.Class<?> wildcardClass37 = same33.getClass();
        boolean boolean38 = same31.matches((java.lang.Object) wildcardClass37);
        boolean boolean39 = same24.matches((java.lang.Object) wildcardClass37);
        org.mockito.internal.matchers.Same same40 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass37);
        org.mockito.internal.matchers.Same same41 = new org.mockito.internal.matchers.Same((java.lang.Object) same40);
        boolean boolean42 = same1.matches((java.lang.Object) same40);
        org.mockito.internal.matchers.Same same43 = new org.mockito.internal.matchers.Same((java.lang.Object) same40);
        java.lang.Object obj44 = null;
        boolean boolean45 = same43.matches(obj44);
        org.mockito.internal.matchers.Same same46 = new org.mockito.internal.matchers.Same(obj44);
        org.mockito.internal.matchers.Same same48 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same50 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean52 = same50.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same54 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean55 = same50.matches((java.lang.Object) same54);
        boolean boolean57 = same54.matches((java.lang.Object) 1);
        boolean boolean59 = same54.matches((java.lang.Object) 10.0f);
        org.mockito.internal.matchers.Same same61 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str62 = same61.toString();
        boolean boolean64 = same61.matches((java.lang.Object) 1L);
        boolean boolean65 = same54.matches((java.lang.Object) boolean64);
        java.lang.String str66 = same54.toString();
        boolean boolean67 = same48.matches((java.lang.Object) str66);
        org.mockito.internal.matchers.Same same68 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean67);
        java.lang.String str69 = same68.toString();
        boolean boolean70 = same46.matches((java.lang.Object) same68);
        org.mockito.internal.matchers.Same same71 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean70);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(' ')" + "'", str15, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "same(' ')" + "'", str19, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "same(' ')" + "'", str25, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "same(' ')" + "'", str36, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "same(' ')" + "'", str62, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "same(' ')" + "'", str66, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "same(false)" + "'", str69, "same(false)");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean6 = same1.matches((java.lang.Object) same5);
        boolean boolean8 = same5.matches((java.lang.Object) 1);
        boolean boolean10 = same5.matches((java.lang.Object) 10.0f);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str13 = same12.toString();
        boolean boolean15 = same12.matches((java.lang.Object) 1L);
        boolean boolean16 = same5.matches((java.lang.Object) boolean15);
        java.lang.String str17 = same5.toString();
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same5);
        java.lang.String str19 = same18.toString();
        same18._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str21 = same18.toString();
        org.hamcrest.Description description22 = null;
        // The following exception was thrown during execution in test generation
        try {
            same18.describeTo(description22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(' ')" + "'", str13, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "same(' ')" + "'", str17, "same(' ')");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "same(same(' '))" + "'", str19, "same(same(' '))");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "same(same(' '))" + "'", str21, "same(same(' '))");
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str5 = same4.toString();
        boolean boolean7 = same4.matches((java.lang.Object) (byte) -1);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        java.lang.Class<?> wildcardClass9 = same1.getClass();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass9);
        java.lang.String str11 = same10.toString();
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        same13._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean16 = same13.matches((java.lang.Object) (short) 100);
        java.lang.Object obj17 = new java.lang.Object();
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same(obj17);
        boolean boolean19 = same13.matches((java.lang.Object) same18);
        same18._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same18._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean22 = same10.matches((java.lang.Object) same18);
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) same18);
        java.lang.String str24 = same18.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(' ')" + "'", str5, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str11, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        boolean boolean3 = same1.matches((java.lang.Object) (short) -1);
        java.lang.String str4 = same1.toString();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.Class<?> wildcardClass6 = same1.getClass();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.Class<?> wildcardClass8 = same7.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0d));
        java.lang.String str4 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.Object obj7 = new java.lang.Object();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same(obj7);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean12 = same10.matches((java.lang.Object) ' ');
        java.lang.String str13 = same10.toString();
        java.lang.Class<?> wildcardClass14 = same10.getClass();
        boolean boolean15 = same8.matches((java.lang.Object) wildcardClass14);
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean15);
        boolean boolean17 = same1.matches((java.lang.Object) boolean15);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same19._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str23 = same22.toString();
        boolean boolean25 = same22.matches((java.lang.Object) (byte) -1);
        boolean boolean26 = same19.matches((java.lang.Object) boolean25);
        java.lang.Class<?> wildcardClass27 = same19.getClass();
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass27);
        java.lang.String str29 = same28.toString();
        same28._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) same28);
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) same31);
        boolean boolean33 = same1.matches((java.lang.Object) same31);
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) same31);
        org.mockito.internal.matchers.Same same36 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same36._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str40 = same39.toString();
        boolean boolean42 = same39.matches((java.lang.Object) (byte) -1);
        boolean boolean43 = same36.matches((java.lang.Object) boolean42);
        java.lang.Class<?> wildcardClass44 = same36.getClass();
        org.mockito.internal.matchers.Same same45 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass44);
        org.mockito.internal.matchers.Same same46 = new org.mockito.internal.matchers.Same((java.lang.Object) same45);
        org.mockito.internal.matchers.Same same48 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str49 = same48.toString();
        boolean boolean51 = same48.matches((java.lang.Object) (byte) -1);
        boolean boolean53 = same48.matches((java.lang.Object) (short) 10);
        java.lang.Object obj54 = new java.lang.Object();
        org.mockito.internal.matchers.Same same55 = new org.mockito.internal.matchers.Same(obj54);
        org.mockito.internal.matchers.Same same57 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean59 = same57.matches((java.lang.Object) ' ');
        java.lang.String str60 = same57.toString();
        java.lang.Class<?> wildcardClass61 = same57.getClass();
        boolean boolean62 = same55.matches((java.lang.Object) wildcardClass61);
        boolean boolean63 = same48.matches((java.lang.Object) wildcardClass61);
        org.mockito.internal.matchers.Same same64 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass61);
        boolean boolean65 = same46.matches((java.lang.Object) same64);
        java.lang.String str66 = same46.toString();
        boolean boolean67 = same31.matches((java.lang.Object) same46);
        org.mockito.internal.matchers.Same same69 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 1);
        org.mockito.internal.matchers.Same same71 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same71._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same74 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str75 = same74.toString();
        boolean boolean77 = same74.matches((java.lang.Object) (byte) -1);
        boolean boolean78 = same71.matches((java.lang.Object) boolean77);
        java.lang.Class<?> wildcardClass79 = same71.getClass();
        org.mockito.internal.matchers.Same same80 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass79);
        java.lang.String str81 = same80.toString();
        java.lang.String str82 = same80.toString();
        java.lang.Class<?> wildcardClass83 = same80.getClass();
        boolean boolean84 = same69.matches((java.lang.Object) wildcardClass83);
        java.lang.String str85 = same69.toString();
        org.mockito.internal.matchers.Same same87 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same87._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same90 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str91 = same90.toString();
        boolean boolean93 = same90.matches((java.lang.Object) (byte) -1);
        boolean boolean94 = same87.matches((java.lang.Object) boolean93);
        boolean boolean95 = same69.matches((java.lang.Object) boolean93);
        boolean boolean96 = same31.matches((java.lang.Object) boolean93);
        org.mockito.internal.matchers.Same same97 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean96);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(' ')" + "'", str13, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "same(' ')" + "'", str23, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str29, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "same(' ')" + "'", str40, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "same(' ')" + "'", str49, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "same(' ')" + "'", str60, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "same(same(class org.mockito.internal.matchers.Same))" + "'", str66, "same(same(class org.mockito.internal.matchers.Same))");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "same(' ')" + "'", str75, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str81, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str82, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "same(1)" + "'", str85, "same(1)");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "same(' ')" + "'", str91, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        boolean boolean5 = same1.matches((java.lang.Object) 10.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str7 = same1.toString();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean11 = same9.matches((java.lang.Object) ' ');
        boolean boolean13 = same9.matches((java.lang.Object) 10.0f);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean15 = same1.matches((java.lang.Object) same9);
        java.lang.String str16 = same1.toString();
        boolean boolean18 = same1.matches((java.lang.Object) "same(same(1.0))");
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean22 = same20.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str25 = same24.toString();
        boolean boolean27 = same24.matches((java.lang.Object) (byte) -1);
        boolean boolean28 = same20.matches((java.lang.Object) (byte) -1);
        same20._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same20._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) same20);
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) same20);
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) 1L);
        java.lang.String str35 = same34.toString();
        boolean boolean36 = same32.matches((java.lang.Object) same34);
        same34._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean38 = same1.matches((java.lang.Object) same34);
        same34._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same34._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(' ')" + "'", str7, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "same(' ')" + "'", str16, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "same(' ')" + "'", str25, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "same(1)" + "'", str35, "same(1)");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        java.lang.String str4 = same1.toString();
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) str4);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        java.lang.String str8 = same7.toString();
        same7._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str10 = same7.toString();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean15 = same12.matches((java.lang.Object) (short) 100);
        java.lang.Object obj16 = new java.lang.Object();
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same(obj16);
        boolean boolean18 = same12.matches((java.lang.Object) same17);
        same17._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same21._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        boolean boolean25 = same21.matches((java.lang.Object) (short) -1);
        same21._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean27 = same17.matches((java.lang.Object) same21);
        java.lang.String str28 = same21.toString();
        boolean boolean29 = same7.matches((java.lang.Object) same21);
        boolean boolean30 = same5.matches((java.lang.Object) boolean29);
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean30);
        same31._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str33 = same31.toString();
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean37 = same35.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean40 = same35.matches((java.lang.Object) same39);
        org.mockito.internal.matchers.Same same42 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str43 = same42.toString();
        boolean boolean45 = same42.matches((java.lang.Object) (byte) -1);
        boolean boolean47 = same42.matches((java.lang.Object) (short) 10);
        boolean boolean48 = same35.matches((java.lang.Object) same42);
        java.lang.String str49 = same35.toString();
        java.lang.Class<?> wildcardClass50 = same35.getClass();
        org.mockito.internal.matchers.Same same51 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass50);
        org.mockito.internal.matchers.Same same52 = new org.mockito.internal.matchers.Same((java.lang.Object) same51);
        same52._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same55 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same55._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same58 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str59 = same58.toString();
        boolean boolean61 = same58.matches((java.lang.Object) (byte) -1);
        boolean boolean62 = same55.matches((java.lang.Object) boolean61);
        java.lang.Class<?> wildcardClass63 = same55.getClass();
        org.mockito.internal.matchers.Same same64 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass63);
        java.lang.Class<?> wildcardClass65 = same64.getClass();
        boolean boolean66 = same52.matches((java.lang.Object) same64);
        java.lang.Class<?> wildcardClass67 = same52.getClass();
        org.hamcrest.Description description68 = null;
        // The following exception was thrown during execution in test generation
        try {
            same31.describeMismatch((java.lang.Object) wildcardClass67, description68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(' ')" + "'", str4, "same(' ')");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(1.0)" + "'", str8, "same(1.0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(1.0)" + "'", str10, "same(1.0)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "same(' ')" + "'", str28, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "same(false)" + "'", str33, "same(false)");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "same(' ')" + "'", str43, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "same(' ')" + "'", str49, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "same(' ')" + "'", str59, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str5 = same4.toString();
        boolean boolean7 = same4.matches((java.lang.Object) (byte) -1);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        java.lang.Class<?> wildcardClass9 = same1.getClass();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass9);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str14 = same13.toString();
        boolean boolean16 = same13.matches((java.lang.Object) (byte) -1);
        boolean boolean18 = same13.matches((java.lang.Object) (short) 10);
        java.lang.Object obj19 = new java.lang.Object();
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same(obj19);
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean24 = same22.matches((java.lang.Object) ' ');
        java.lang.String str25 = same22.toString();
        java.lang.Class<?> wildcardClass26 = same22.getClass();
        boolean boolean27 = same20.matches((java.lang.Object) wildcardClass26);
        boolean boolean28 = same13.matches((java.lang.Object) wildcardClass26);
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass26);
        boolean boolean30 = same11.matches((java.lang.Object) same29);
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) same29);
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) same31);
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean36 = same34.matches((java.lang.Object) ' ');
        boolean boolean38 = same34.matches((java.lang.Object) 10.0f);
        same34._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str40 = same34.toString();
        org.mockito.internal.matchers.Same same42 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean44 = same42.matches((java.lang.Object) ' ');
        boolean boolean46 = same42.matches((java.lang.Object) 10.0f);
        same42._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean48 = same34.matches((java.lang.Object) same42);
        java.lang.String str49 = same34.toString();
        org.mockito.internal.matchers.Same same51 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean53 = same51.matches((java.lang.Object) (-1.0d));
        java.lang.String str54 = same51.toString();
        same51._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same56 = new org.mockito.internal.matchers.Same((java.lang.Object) same51);
        boolean boolean57 = same34.matches((java.lang.Object) same56);
        org.mockito.internal.matchers.Same same58 = new org.mockito.internal.matchers.Same((java.lang.Object) same34);
        org.mockito.internal.matchers.Same same59 = new org.mockito.internal.matchers.Same((java.lang.Object) same34);
        java.lang.String str60 = same34.toString();
        boolean boolean61 = same32.matches((java.lang.Object) same34);
        java.lang.Class<?> wildcardClass62 = same32.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(' ')" + "'", str5, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(' ')" + "'", str14, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "same(' ')" + "'", str25, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "same(' ')" + "'", str40, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "same(' ')" + "'", str49, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "same(0)" + "'", str54, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "same(' ')" + "'", str60, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        java.lang.String str2 = same1.toString();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same4._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str8 = same7.toString();
        boolean boolean10 = same7.matches((java.lang.Object) (byte) -1);
        boolean boolean11 = same4.matches((java.lang.Object) boolean10);
        java.lang.Class<?> wildcardClass12 = same4.getClass();
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass12);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) same13);
        java.lang.Object obj15 = new java.lang.Object();
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same(obj15);
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean18 = same13.matches((java.lang.Object) same16);
        java.lang.String str19 = same16.toString();
        boolean boolean20 = same1.matches((java.lang.Object) str19);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description22 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(-1)" + "'", str2, "same(-1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(' ')" + "'", str8, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean6 = same1.matches((java.lang.Object) same5);
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str9 = same8.toString();
        boolean boolean11 = same8.matches((java.lang.Object) (byte) -1);
        boolean boolean13 = same8.matches((java.lang.Object) (short) 10);
        boolean boolean14 = same1.matches((java.lang.Object) same8);
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) same8);
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str19 = same16.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(' ')" + "'", str9, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "same(same(' '))" + "'", str19, "same(same(' '))");
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str6 = same5.toString();
        boolean boolean8 = same5.matches((java.lang.Object) (byte) -1);
        boolean boolean9 = same1.matches((java.lang.Object) (byte) -1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str13 = same1.toString();
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) same15);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) same16);
        boolean boolean18 = same1.matches((java.lang.Object) same17);
        java.lang.String str19 = same17.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(' ')" + "'", str6, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(' ')" + "'", str13, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "same(same(same(1.0)))" + "'", str19, "same(same(same(1.0)))");
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean6 = same1.matches((java.lang.Object) same5);
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str9 = same8.toString();
        boolean boolean11 = same8.matches((java.lang.Object) (byte) -1);
        boolean boolean13 = same8.matches((java.lang.Object) (short) 10);
        boolean boolean14 = same1.matches((java.lang.Object) same8);
        java.lang.String str15 = same8.toString();
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean19 = same17.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean22 = same17.matches((java.lang.Object) same21);
        boolean boolean24 = same21.matches((java.lang.Object) 1);
        boolean boolean26 = same21.matches((java.lang.Object) 10.0f);
        boolean boolean28 = same21.matches((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass29 = same21.getClass();
        boolean boolean30 = same8.matches((java.lang.Object) wildcardClass29);
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str33 = same32.toString();
        boolean boolean35 = same32.matches((java.lang.Object) (byte) -1);
        boolean boolean37 = same32.matches((java.lang.Object) (short) 10);
        java.lang.Object obj38 = new java.lang.Object();
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same(obj38);
        org.mockito.internal.matchers.Same same41 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean43 = same41.matches((java.lang.Object) ' ');
        java.lang.String str44 = same41.toString();
        java.lang.Class<?> wildcardClass45 = same41.getClass();
        boolean boolean46 = same39.matches((java.lang.Object) wildcardClass45);
        boolean boolean47 = same32.matches((java.lang.Object) wildcardClass45);
        java.lang.String str48 = same32.toString();
        boolean boolean50 = same32.matches((java.lang.Object) "same(same(class org.mockito.internal.matchers.Same))");
        java.lang.String str51 = same32.toString();
        boolean boolean52 = same8.matches((java.lang.Object) str51);
        org.mockito.internal.matchers.Same same53 = new org.mockito.internal.matchers.Same((java.lang.Object) same8);
        java.lang.Class<?> wildcardClass54 = same53.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(' ')" + "'", str9, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(' ')" + "'", str15, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "same(' ')" + "'", str33, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "same(' ')" + "'", str44, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "same(' ')" + "'", str48, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "same(' ')" + "'", str51, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean6 = same1.matches((java.lang.Object) same5);
        boolean boolean8 = same5.matches((java.lang.Object) 1);
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean8);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean8);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean19 = same16.matches((java.lang.Object) (short) 100);
        java.lang.Object obj20 = new java.lang.Object();
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same(obj20);
        boolean boolean22 = same16.matches((java.lang.Object) same21);
        same21._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass24 = same21.getClass();
        boolean boolean25 = same12.matches((java.lang.Object) wildcardClass24);
        java.lang.String str26 = same12.toString();
        boolean boolean27 = same10.matches((java.lang.Object) str26);
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        java.lang.String str30 = same29.toString();
        same29._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str32 = same29.toString();
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean36 = same34.matches((java.lang.Object) ' ');
        boolean boolean38 = same34.matches((java.lang.Object) 10.0f);
        boolean boolean39 = same29.matches((java.lang.Object) 10.0f);
        same29._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same29._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str42 = same29.toString();
        boolean boolean43 = same10.matches((java.lang.Object) str42);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "same(1.0)" + "'", str26, "same(1.0)");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "same(1.0)" + "'", str30, "same(1.0)");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "same(1.0)" + "'", str32, "same(1.0)");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "same(1.0)" + "'", str42, "same(1.0)");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean5 = same3.matches((java.lang.Object) (-1.0d));
        java.lang.String str6 = same3.toString();
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean8 = same1.matches((java.lang.Object) same3);
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str10 = same1.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(0)" + "'", str6, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(' ')" + "'", str10, "same(' ')");
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0d));
        java.lang.String str4 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.String str7 = same1.toString();
        java.lang.String str8 = same1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(0)" + "'", str7, "same(0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(0)" + "'", str8, "same(0)");
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str5 = same4.toString();
        boolean boolean7 = same4.matches((java.lang.Object) (byte) -1);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        java.lang.Class<?> wildcardClass9 = same1.getClass();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass9);
        java.lang.String str11 = same10.toString();
        java.lang.String str12 = same10.toString();
        java.lang.Class<?> wildcardClass13 = same10.getClass();
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass13);
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) same14);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same17._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str21 = same20.toString();
        boolean boolean23 = same20.matches((java.lang.Object) (byte) -1);
        boolean boolean24 = same17.matches((java.lang.Object) boolean23);
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean24);
        java.lang.String str26 = same25.toString();
        boolean boolean27 = same15.matches((java.lang.Object) same25);
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean31 = same29.matches((java.lang.Object) (-1.0d));
        java.lang.String str32 = same29.toString();
        same29._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) same29);
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same((java.lang.Object) same29);
        same29._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean37 = same15.matches((java.lang.Object) same29);
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same39._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same42 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str43 = same42.toString();
        boolean boolean45 = same42.matches((java.lang.Object) (byte) -1);
        boolean boolean46 = same39.matches((java.lang.Object) boolean45);
        java.lang.Class<?> wildcardClass47 = same39.getClass();
        org.mockito.internal.matchers.Same same48 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass47);
        org.mockito.internal.matchers.Same same49 = new org.mockito.internal.matchers.Same((java.lang.Object) same48);
        org.mockito.internal.matchers.Same same51 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str52 = same51.toString();
        boolean boolean54 = same51.matches((java.lang.Object) (byte) -1);
        boolean boolean56 = same51.matches((java.lang.Object) (short) 10);
        java.lang.Object obj57 = new java.lang.Object();
        org.mockito.internal.matchers.Same same58 = new org.mockito.internal.matchers.Same(obj57);
        org.mockito.internal.matchers.Same same60 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean62 = same60.matches((java.lang.Object) ' ');
        java.lang.String str63 = same60.toString();
        java.lang.Class<?> wildcardClass64 = same60.getClass();
        boolean boolean65 = same58.matches((java.lang.Object) wildcardClass64);
        boolean boolean66 = same51.matches((java.lang.Object) wildcardClass64);
        org.mockito.internal.matchers.Same same67 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass64);
        boolean boolean68 = same49.matches((java.lang.Object) same67);
        org.mockito.internal.matchers.Same same69 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean68);
        boolean boolean70 = same15.matches((java.lang.Object) boolean68);
        org.mockito.internal.matchers.Same same72 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean74 = same72.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same76 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str77 = same76.toString();
        boolean boolean79 = same76.matches((java.lang.Object) (byte) -1);
        boolean boolean80 = same72.matches((java.lang.Object) (byte) -1);
        same72._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same72._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same83 = new org.mockito.internal.matchers.Same((java.lang.Object) same72);
        org.mockito.internal.matchers.Same same84 = new org.mockito.internal.matchers.Same((java.lang.Object) same72);
        org.mockito.internal.matchers.Same same86 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        same86._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str88 = same86.toString();
        same86._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same86._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean91 = same72.matches((java.lang.Object) same86);
        boolean boolean92 = same15.matches((java.lang.Object) same72);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(' ')" + "'", str5, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str11, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str12, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "same(' ')" + "'", str21, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "same(false)" + "'", str26, "same(false)");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "same(0)" + "'", str32, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "same(' ')" + "'", str43, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "same(' ')" + "'", str52, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "same(' ')" + "'", str63, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "same(' ')" + "'", str77, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "same(1.0)" + "'", str88, "same(1.0)");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        boolean boolean6 = same1.matches((java.lang.Object) same5);
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) false);
        boolean boolean9 = same1.matches((java.lang.Object) false);
        java.lang.String str10 = same1.toString();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean14 = same12.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean17 = same12.matches((java.lang.Object) same16);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str20 = same19.toString();
        boolean boolean22 = same19.matches((java.lang.Object) (byte) -1);
        boolean boolean24 = same19.matches((java.lang.Object) (short) 10);
        boolean boolean25 = same12.matches((java.lang.Object) same19);
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) same12);
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same29._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        boolean boolean33 = same29.matches((java.lang.Object) (short) -1);
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        java.lang.String str35 = same34.toString();
        boolean boolean36 = same12.matches((java.lang.Object) same34);
        same34._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same34._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean39 = same1.matches((java.lang.Object) same34);
        same34._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same41 = new org.mockito.internal.matchers.Same((java.lang.Object) same34);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(' ')" + "'", str10, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "same(' ')" + "'", str20, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "same(-1)" + "'", str35, "same(-1)");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0d));
        java.lang.String str4 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same6);
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) same6);
        same8._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str10 = same8.toString();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean14 = same12.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean17 = same12.matches((java.lang.Object) same16);
        boolean boolean19 = same16.matches((java.lang.Object) 1);
        boolean boolean21 = same16.matches((java.lang.Object) '4');
        java.lang.String str22 = same16.toString();
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean25 = same8.matches((java.lang.Object) same16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(0)" + "'", str4, "same(0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(same(same(0)))" + "'", str10, "same(same(same(0)))");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "same(' ')" + "'", str22, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean5 = same3.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean8 = same3.matches((java.lang.Object) same7);
        boolean boolean10 = same7.matches((java.lang.Object) 1);
        boolean boolean12 = same7.matches((java.lang.Object) 10.0f);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str15 = same14.toString();
        boolean boolean17 = same14.matches((java.lang.Object) 1L);
        boolean boolean18 = same7.matches((java.lang.Object) boolean17);
        java.lang.String str19 = same7.toString();
        boolean boolean20 = same1.matches((java.lang.Object) str19);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str23 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str25 = same1.toString();
        java.lang.String str26 = same1.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(' ')" + "'", str15, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "same(' ')" + "'", str19, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "same(' ')" + "'", str23, "same(' ')");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "same(' ')" + "'", str25, "same(' ')");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "same(' ')" + "'", str26, "same(' ')");
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 100.0f);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        boolean boolean7 = same3.matches((java.lang.Object) (short) -1);
        java.lang.String str8 = same3.toString();
        java.lang.String str9 = same3.toString();
        boolean boolean10 = same1.matches((java.lang.Object) str9);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same12._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str16 = same15.toString();
        boolean boolean18 = same15.matches((java.lang.Object) (byte) -1);
        boolean boolean19 = same12.matches((java.lang.Object) boolean18);
        java.lang.Class<?> wildcardClass20 = same12.getClass();
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass20);
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) same21);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str25 = same24.toString();
        boolean boolean27 = same24.matches((java.lang.Object) (byte) -1);
        boolean boolean29 = same24.matches((java.lang.Object) (short) 10);
        java.lang.Object obj30 = new java.lang.Object();
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same(obj30);
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean35 = same33.matches((java.lang.Object) ' ');
        java.lang.String str36 = same33.toString();
        java.lang.Class<?> wildcardClass37 = same33.getClass();
        boolean boolean38 = same31.matches((java.lang.Object) wildcardClass37);
        boolean boolean39 = same24.matches((java.lang.Object) wildcardClass37);
        org.mockito.internal.matchers.Same same40 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass37);
        boolean boolean41 = same22.matches((java.lang.Object) same40);
        org.mockito.internal.matchers.Same same42 = new org.mockito.internal.matchers.Same((java.lang.Object) same40);
        org.mockito.internal.matchers.Same same43 = new org.mockito.internal.matchers.Same((java.lang.Object) same42);
        boolean boolean44 = same1.matches((java.lang.Object) same43);
        java.lang.Object obj45 = new java.lang.Object();
        org.mockito.internal.matchers.Same same46 = new org.mockito.internal.matchers.Same(obj45);
        boolean boolean48 = same46.matches((java.lang.Object) 100);
        java.lang.String str49 = same46.toString();
        java.lang.String str50 = same46.toString();
        org.mockito.internal.matchers.Same same52 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        org.mockito.internal.matchers.Same same53 = new org.mockito.internal.matchers.Same((java.lang.Object) same52);
        same53._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean55 = same46.matches((java.lang.Object) same53);
        org.mockito.internal.matchers.Same same56 = new org.mockito.internal.matchers.Same((java.lang.Object) same46);
        same56._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same56._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same59 = new org.mockito.internal.matchers.Same((java.lang.Object) same56);
        org.mockito.internal.matchers.Same same61 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean63 = same61.matches((java.lang.Object) (-1.0d));
        org.mockito.internal.matchers.Same same65 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same65._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same68 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str69 = same68.toString();
        boolean boolean71 = same68.matches((java.lang.Object) (byte) -1);
        boolean boolean72 = same65.matches((java.lang.Object) boolean71);
        java.lang.Object obj73 = new java.lang.Object();
        org.mockito.internal.matchers.Same same74 = new org.mockito.internal.matchers.Same(obj73);
        boolean boolean75 = same65.matches(obj73);
        boolean boolean76 = same61.matches(obj73);
        boolean boolean77 = same56.matches((java.lang.Object) same61);
        same61._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean79 = same1.matches((java.lang.Object) same61);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(' ')" + "'", str8, "same(' ')");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(' ')" + "'", str9, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "same(' ')" + "'", str16, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "same(' ')" + "'", str25, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "same(' ')" + "'", str36, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "same(' ')" + "'", str69, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        org.mockito.internal.matchers.Same same2 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        boolean boolean5 = same1.matches((java.lang.Object) 10.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str7 = same1.toString();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean11 = same9.matches((java.lang.Object) ' ');
        boolean boolean13 = same9.matches((java.lang.Object) 10.0f);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean15 = same1.matches((java.lang.Object) same9);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean18 = same9.matches((java.lang.Object) same17);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) same17);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean23 = same21.matches((java.lang.Object) (-1.0d));
        java.lang.String str24 = same21.toString();
        same21._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) same21);
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean30 = same28.matches((java.lang.Object) (-1.0d));
        java.lang.String str31 = same28.toString();
        same28._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) same28);
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) same28);
        boolean boolean35 = same26.matches((java.lang.Object) same28);
        org.mockito.internal.matchers.Same same37 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean39 = same37.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same41 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str42 = same41.toString();
        boolean boolean44 = same41.matches((java.lang.Object) (byte) -1);
        boolean boolean45 = same37.matches((java.lang.Object) (byte) -1);
        same37._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same37._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same48 = new org.mockito.internal.matchers.Same((java.lang.Object) same37);
        java.lang.String str49 = same37.toString();
        org.mockito.internal.matchers.Same same51 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        org.mockito.internal.matchers.Same same52 = new org.mockito.internal.matchers.Same((java.lang.Object) same51);
        org.mockito.internal.matchers.Same same53 = new org.mockito.internal.matchers.Same((java.lang.Object) same52);
        boolean boolean54 = same37.matches((java.lang.Object) same53);
        same37._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean56 = same26.matches((java.lang.Object) same37);
        boolean boolean57 = same19.matches((java.lang.Object) same26);
        same19._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same60 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str61 = same60.toString();
        boolean boolean63 = same60.matches((java.lang.Object) (byte) -1);
        boolean boolean65 = same60.matches((java.lang.Object) (short) 10);
        java.lang.Object obj66 = new java.lang.Object();
        org.mockito.internal.matchers.Same same67 = new org.mockito.internal.matchers.Same(obj66);
        org.mockito.internal.matchers.Same same69 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean71 = same69.matches((java.lang.Object) ' ');
        java.lang.String str72 = same69.toString();
        java.lang.Class<?> wildcardClass73 = same69.getClass();
        boolean boolean74 = same67.matches((java.lang.Object) wildcardClass73);
        boolean boolean75 = same60.matches((java.lang.Object) wildcardClass73);
        org.mockito.internal.matchers.Same same76 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass73);
        org.mockito.internal.matchers.Same same77 = new org.mockito.internal.matchers.Same((java.lang.Object) same76);
        java.lang.String str78 = same77.toString();
        org.mockito.internal.matchers.Same same80 = new org.mockito.internal.matchers.Same((java.lang.Object) 100);
        java.lang.String str81 = same80.toString();
        boolean boolean82 = same77.matches((java.lang.Object) str81);
        java.lang.String str83 = same77.toString();
        same77._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same77._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean86 = same19.matches((java.lang.Object) same77);
        same19._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(' ')" + "'", str7, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "same(0)" + "'", str24, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "same(0)" + "'", str31, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "same(' ')" + "'", str42, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "same(' ')" + "'", str49, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "same(' ')" + "'", str61, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "same(' ')" + "'", str72, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "same(same(class org.mockito.internal.matchers.Same))" + "'", str78, "same(same(class org.mockito.internal.matchers.Same))");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "same(100)" + "'", str81, "same(100)");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "same(same(class org.mockito.internal.matchers.Same))" + "'", str83, "same(same(class org.mockito.internal.matchers.Same))");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str6 = same5.toString();
        boolean boolean8 = same5.matches((java.lang.Object) (byte) -1);
        boolean boolean9 = same1.matches((java.lang.Object) (byte) -1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same16._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str20 = same19.toString();
        boolean boolean22 = same19.matches((java.lang.Object) (byte) -1);
        boolean boolean23 = same16.matches((java.lang.Object) boolean22);
        java.lang.Class<?> wildcardClass24 = same16.getClass();
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass24);
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) same25);
        java.lang.String str27 = same26.toString();
        org.hamcrest.Description description28 = null;
        // The following exception was thrown during execution in test generation
        try {
            same14.describeMismatch((java.lang.Object) same26, description28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(' ')" + "'", str6, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "same(' ')" + "'", str20, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "same(same(class org.mockito.internal.matchers.Same))" + "'", str27, "same(same(class org.mockito.internal.matchers.Same))");
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        java.lang.String str4 = same1.toString();
        org.mockito.internal.matchers.Same same6 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        same6._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean9 = same6.matches((java.lang.Object) (short) 100);
        java.lang.Object obj10 = new java.lang.Object();
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same(obj10);
        boolean boolean12 = same6.matches((java.lang.Object) same11);
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean15 = same1.matches((java.lang.Object) same11);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str17 = same1.toString();
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        java.lang.Object obj19 = new java.lang.Object();
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same(obj19);
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean24 = same22.matches((java.lang.Object) ' ');
        java.lang.String str25 = same22.toString();
        java.lang.Class<?> wildcardClass26 = same22.getClass();
        boolean boolean27 = same20.matches((java.lang.Object) wildcardClass26);
        java.lang.String str28 = same20.toString();
        java.lang.String str29 = same20.toString();
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) same20);
        java.lang.Class<?> wildcardClass31 = same20.getClass();
        org.hamcrest.Description description32 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeMismatch((java.lang.Object) same20, description32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "same(' ')" + "'", str4, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "same(' ')" + "'", str17, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "same(' ')" + "'", str25, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        org.mockito.internal.matchers.Same same2 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same4._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        boolean boolean8 = same4.matches((java.lang.Object) (short) -1);
        java.lang.String str9 = same4.toString();
        java.lang.Class<?> wildcardClass10 = same4.getClass();
        boolean boolean11 = same2.matches((java.lang.Object) wildcardClass10);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean11);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(' ')" + "'", str9, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str5 = same4.toString();
        boolean boolean7 = same4.matches((java.lang.Object) (byte) -1);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        java.lang.Class<?> wildcardClass9 = same1.getClass();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass9);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str14 = same13.toString();
        boolean boolean16 = same13.matches((java.lang.Object) (byte) -1);
        boolean boolean18 = same13.matches((java.lang.Object) (short) 10);
        java.lang.Object obj19 = new java.lang.Object();
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same(obj19);
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean24 = same22.matches((java.lang.Object) ' ');
        java.lang.String str25 = same22.toString();
        java.lang.Class<?> wildcardClass26 = same22.getClass();
        boolean boolean27 = same20.matches((java.lang.Object) wildcardClass26);
        boolean boolean28 = same13.matches((java.lang.Object) wildcardClass26);
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass26);
        boolean boolean30 = same11.matches((java.lang.Object) same29);
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean34 = same32.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same36 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean37 = same32.matches((java.lang.Object) same36);
        boolean boolean39 = same36.matches((java.lang.Object) 1);
        boolean boolean41 = same36.matches((java.lang.Object) '4');
        org.mockito.internal.matchers.Same same42 = new org.mockito.internal.matchers.Same((java.lang.Object) '4');
        boolean boolean43 = same11.matches((java.lang.Object) '4');
        org.mockito.internal.matchers.Same same44 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean43);
        same44._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str46 = same44.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(' ')" + "'", str5, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(' ')" + "'", str14, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "same(' ')" + "'", str25, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "same(false)" + "'", str46, "same(false)");
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        java.lang.Object obj2 = new java.lang.Object();
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same(obj2);
        boolean boolean5 = same3.matches((java.lang.Object) 100);
        boolean boolean6 = same1.matches((java.lang.Object) 100);
        java.lang.String str7 = same1.toString();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean12 = same10.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str15 = same14.toString();
        boolean boolean17 = same14.matches((java.lang.Object) (byte) -1);
        boolean boolean18 = same10.matches((java.lang.Object) (byte) -1);
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        java.lang.String str22 = same10.toString();
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) same24);
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) same25);
        boolean boolean27 = same10.matches((java.lang.Object) same26);
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean34 = same32.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same36 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean37 = same32.matches((java.lang.Object) same36);
        boolean boolean39 = same36.matches((java.lang.Object) 1);
        boolean boolean41 = same36.matches((java.lang.Object) 10.0f);
        org.mockito.internal.matchers.Same same43 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str44 = same43.toString();
        boolean boolean46 = same43.matches((java.lang.Object) 1L);
        boolean boolean47 = same36.matches((java.lang.Object) boolean46);
        java.lang.String str48 = same36.toString();
        boolean boolean49 = same30.matches((java.lang.Object) str48);
        java.lang.String str50 = same30.toString();
        boolean boolean51 = same10.matches((java.lang.Object) same30);
        same30._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean53 = same8.matches((java.lang.Object) same30);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(0)" + "'", str7, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(' ')" + "'", str15, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "same(' ')" + "'", str22, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "same(' ')" + "'", str44, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "same(' ')" + "'", str48, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "same(' ')" + "'", str50, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        boolean boolean3 = same1.matches((java.lang.Object) 100);
        java.lang.String str4 = same1.toString();
        java.lang.String str5 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) same7);
        java.lang.Class<?> wildcardClass9 = same7.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean3 = same1.matches((java.lang.Object) (-1.0d));
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same5._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str9 = same8.toString();
        boolean boolean11 = same8.matches((java.lang.Object) (byte) -1);
        boolean boolean12 = same5.matches((java.lang.Object) boolean11);
        java.lang.Object obj13 = new java.lang.Object();
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same(obj13);
        boolean boolean15 = same5.matches(obj13);
        boolean boolean16 = same1.matches(obj13);
        java.lang.String str17 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass19 = same1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(' ')" + "'", str9, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "same(0)" + "'", str17, "same(0)");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        boolean boolean5 = same1.matches((java.lang.Object) 10.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str7 = same1.toString();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean11 = same9.matches((java.lang.Object) ' ');
        boolean boolean13 = same9.matches((java.lang.Object) 10.0f);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean15 = same1.matches((java.lang.Object) same9);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean18 = same9.matches((java.lang.Object) same17);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) same17);
        java.lang.String str20 = same17.toString();
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) same17);
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean25 = same23.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean28 = same23.matches((java.lang.Object) same27);
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str31 = same30.toString();
        boolean boolean33 = same30.matches((java.lang.Object) (byte) -1);
        boolean boolean35 = same30.matches((java.lang.Object) (short) 10);
        boolean boolean36 = same23.matches((java.lang.Object) same30);
        java.lang.String str37 = same23.toString();
        org.mockito.internal.matchers.Same same38 = new org.mockito.internal.matchers.Same((java.lang.Object) same23);
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same((java.lang.Object) same23);
        java.lang.String str40 = same39.toString();
        org.mockito.internal.matchers.Same same42 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean44 = same42.matches((java.lang.Object) (-1.0d));
        java.lang.String str45 = same42.toString();
        same42._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same47 = new org.mockito.internal.matchers.Same((java.lang.Object) same42);
        org.mockito.internal.matchers.Same same48 = new org.mockito.internal.matchers.Same((java.lang.Object) same47);
        same48._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same50 = new org.mockito.internal.matchers.Same((java.lang.Object) same48);
        org.mockito.internal.matchers.Same same51 = new org.mockito.internal.matchers.Same((java.lang.Object) same48);
        boolean boolean52 = same39.matches((java.lang.Object) same48);
        boolean boolean53 = same17.matches((java.lang.Object) same39);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(' ')" + "'", str7, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "same(' ')" + "'", str20, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "same(' ')" + "'", str31, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "same(' ')" + "'", str37, "same(' ')");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "same(same(' '))" + "'", str40, "same(same(' '))");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "same(0)" + "'", str45, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean5 = same3.matches((java.lang.Object) (-1.0d));
        java.lang.String str6 = same3.toString();
        same3._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean8 = same1.matches((java.lang.Object) same3);
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean8);
        org.mockito.internal.matchers.Same same11 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean13 = same11.matches((java.lang.Object) (-1.0d));
        java.lang.String str14 = same11.toString();
        same11._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) same11);
        java.lang.Object obj17 = new java.lang.Object();
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same(obj17);
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean22 = same20.matches((java.lang.Object) ' ');
        java.lang.String str23 = same20.toString();
        java.lang.Class<?> wildcardClass24 = same20.getClass();
        boolean boolean25 = same18.matches((java.lang.Object) wildcardClass24);
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean25);
        boolean boolean27 = same11.matches((java.lang.Object) boolean25);
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same29._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str33 = same32.toString();
        boolean boolean35 = same32.matches((java.lang.Object) (byte) -1);
        boolean boolean36 = same29.matches((java.lang.Object) boolean35);
        java.lang.Class<?> wildcardClass37 = same29.getClass();
        org.mockito.internal.matchers.Same same38 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass37);
        java.lang.String str39 = same38.toString();
        same38._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same41 = new org.mockito.internal.matchers.Same((java.lang.Object) same38);
        org.mockito.internal.matchers.Same same42 = new org.mockito.internal.matchers.Same((java.lang.Object) same41);
        boolean boolean43 = same11.matches((java.lang.Object) same41);
        boolean boolean44 = same9.matches((java.lang.Object) same41);
        org.mockito.internal.matchers.Same same46 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same46._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same49 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str50 = same49.toString();
        boolean boolean52 = same49.matches((java.lang.Object) (byte) -1);
        boolean boolean53 = same46.matches((java.lang.Object) boolean52);
        java.lang.Class<?> wildcardClass54 = same46.getClass();
        org.mockito.internal.matchers.Same same55 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass54);
        java.lang.String str56 = same55.toString();
        java.lang.String str57 = same55.toString();
        java.lang.Class<?> wildcardClass58 = same55.getClass();
        org.mockito.internal.matchers.Same same59 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass58);
        org.mockito.internal.matchers.Same same60 = new org.mockito.internal.matchers.Same((java.lang.Object) same59);
        org.mockito.internal.matchers.Same same62 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same62._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same65 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str66 = same65.toString();
        boolean boolean68 = same65.matches((java.lang.Object) (byte) -1);
        boolean boolean69 = same62.matches((java.lang.Object) boolean68);
        org.mockito.internal.matchers.Same same70 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean69);
        java.lang.String str71 = same70.toString();
        boolean boolean72 = same60.matches((java.lang.Object) same70);
        org.mockito.internal.matchers.Same same74 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean76 = same74.matches((java.lang.Object) (-1.0d));
        java.lang.String str77 = same74.toString();
        same74._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same79 = new org.mockito.internal.matchers.Same((java.lang.Object) same74);
        org.mockito.internal.matchers.Same same80 = new org.mockito.internal.matchers.Same((java.lang.Object) same74);
        same74._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean82 = same60.matches((java.lang.Object) same74);
        java.lang.Class<?> wildcardClass83 = same60.getClass();
        boolean boolean84 = same41.matches((java.lang.Object) wildcardClass83);
        java.lang.String str85 = same41.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(0)" + "'", str6, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(0)" + "'", str14, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "same(' ')" + "'", str23, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "same(' ')" + "'", str33, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str39, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "same(' ')" + "'", str50, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str56, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str57, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "same(' ')" + "'", str66, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "same(false)" + "'", str71, "same(false)");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "same(0)" + "'", str77, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "same(same(class org.mockito.internal.matchers.Same))" + "'", str85, "same(same(class org.mockito.internal.matchers.Same))");
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean6 = same1.matches((java.lang.Object) same5);
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str9 = same8.toString();
        boolean boolean11 = same8.matches((java.lang.Object) (byte) -1);
        boolean boolean13 = same8.matches((java.lang.Object) (short) 10);
        boolean boolean14 = same1.matches((java.lang.Object) same8);
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.hamcrest.Description description17 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "same(' ')" + "'", str9, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean5 = same3.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same7 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean8 = same3.matches((java.lang.Object) same7);
        boolean boolean10 = same7.matches((java.lang.Object) 1);
        boolean boolean12 = same7.matches((java.lang.Object) 10.0f);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str15 = same14.toString();
        boolean boolean17 = same14.matches((java.lang.Object) 1L);
        boolean boolean18 = same7.matches((java.lang.Object) boolean17);
        java.lang.String str19 = same7.toString();
        boolean boolean20 = same1.matches((java.lang.Object) str19);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str25 = same24.toString();
        boolean boolean27 = same24.matches((java.lang.Object) (byte) -1);
        boolean boolean29 = same24.matches((java.lang.Object) (short) 10);
        java.lang.Object obj30 = new java.lang.Object();
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same(obj30);
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean35 = same33.matches((java.lang.Object) ' ');
        java.lang.String str36 = same33.toString();
        java.lang.Class<?> wildcardClass37 = same33.getClass();
        boolean boolean38 = same31.matches((java.lang.Object) wildcardClass37);
        boolean boolean39 = same24.matches((java.lang.Object) wildcardClass37);
        org.mockito.internal.matchers.Same same40 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass37);
        org.mockito.internal.matchers.Same same41 = new org.mockito.internal.matchers.Same((java.lang.Object) same40);
        boolean boolean42 = same1.matches((java.lang.Object) same40);
        org.mockito.internal.matchers.Same same44 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean46 = same44.matches((java.lang.Object) ' ');
        boolean boolean48 = same44.matches((java.lang.Object) 10.0f);
        same44._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str50 = same44.toString();
        org.mockito.internal.matchers.Same same52 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        org.mockito.internal.matchers.Same same53 = new org.mockito.internal.matchers.Same((java.lang.Object) same52);
        org.mockito.internal.matchers.Same same55 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean57 = same55.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same59 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean60 = same55.matches((java.lang.Object) same59);
        boolean boolean62 = same59.matches((java.lang.Object) 1);
        boolean boolean64 = same59.matches((java.lang.Object) 10.0f);
        boolean boolean66 = same59.matches((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass67 = same59.getClass();
        boolean boolean68 = same53.matches((java.lang.Object) wildcardClass67);
        boolean boolean69 = same44.matches((java.lang.Object) wildcardClass67);
        boolean boolean70 = same40.matches((java.lang.Object) wildcardClass67);
        org.mockito.internal.matchers.Same same71 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass67);
        org.mockito.internal.matchers.Same same72 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass67);
        org.mockito.internal.matchers.Same same73 = new org.mockito.internal.matchers.Same((java.lang.Object) same72);
        org.mockito.internal.matchers.Same same74 = new org.mockito.internal.matchers.Same((java.lang.Object) same73);
        org.mockito.internal.matchers.Same same75 = new org.mockito.internal.matchers.Same((java.lang.Object) same74);
        org.hamcrest.Description description76 = null;
        // The following exception was thrown during execution in test generation
        try {
            same74.describeTo(description76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(' ')" + "'", str15, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "same(' ')" + "'", str19, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "same(' ')" + "'", str25, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "same(' ')" + "'", str36, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "same(' ')" + "'", str50, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        boolean boolean5 = same1.matches((java.lang.Object) 10.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str7 = same1.toString();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean11 = same9.matches((java.lang.Object) ' ');
        boolean boolean13 = same9.matches((java.lang.Object) 10.0f);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean15 = same1.matches((java.lang.Object) same9);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean18 = same9.matches((java.lang.Object) same17);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) same17);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        java.lang.Object obj22 = new java.lang.Object();
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same(obj22);
        boolean boolean25 = same23.matches((java.lang.Object) 100);
        boolean boolean26 = same21.matches((java.lang.Object) 100);
        java.lang.String str27 = same21.toString();
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) str27);
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean32 = same30.matches((java.lang.Object) ' ');
        boolean boolean34 = same30.matches((java.lang.Object) 10.0f);
        same30._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str36 = same30.toString();
        org.mockito.internal.matchers.Same same38 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean40 = same38.matches((java.lang.Object) ' ');
        boolean boolean42 = same38.matches((java.lang.Object) 10.0f);
        same38._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean44 = same30.matches((java.lang.Object) same38);
        java.lang.Class<?> wildcardClass45 = same38.getClass();
        boolean boolean46 = same28.matches((java.lang.Object) wildcardClass45);
        boolean boolean47 = same19.matches((java.lang.Object) wildcardClass45);
        java.lang.Class<?> wildcardClass48 = same19.getClass();
        org.mockito.internal.matchers.Same same49 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass48);
        org.mockito.internal.matchers.Same same51 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same51._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same54 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str55 = same54.toString();
        boolean boolean57 = same54.matches((java.lang.Object) (byte) -1);
        boolean boolean58 = same51.matches((java.lang.Object) boolean57);
        java.lang.Class<?> wildcardClass59 = same51.getClass();
        org.mockito.internal.matchers.Same same60 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass59);
        java.lang.String str61 = same60.toString();
        java.lang.String str62 = same60.toString();
        java.lang.Class<?> wildcardClass63 = same60.getClass();
        org.mockito.internal.matchers.Same same64 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass63);
        same64._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Object obj66 = null;
        boolean boolean67 = same64.matches(obj66);
        boolean boolean68 = same49.matches((java.lang.Object) boolean67);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(' ')" + "'", str7, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "same(0)" + "'", str27, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "same(' ')" + "'", str36, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "same(' ')" + "'", str55, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str61, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str62, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str5 = same4.toString();
        boolean boolean7 = same4.matches((java.lang.Object) (byte) -1);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        java.lang.Class<?> wildcardClass9 = same1.getClass();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass9);
        java.lang.String str11 = same10.toString();
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        org.mockito.internal.matchers.Same same16 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean20 = same18.matches((java.lang.Object) ' ');
        boolean boolean22 = same18.matches((java.lang.Object) 10.0f);
        same18._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str24 = same18.toString();
        boolean boolean25 = same16.matches((java.lang.Object) same18);
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        java.lang.String str28 = same27.toString();
        same27._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str30 = same27.toString();
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean34 = same32.matches((java.lang.Object) ' ');
        boolean boolean36 = same32.matches((java.lang.Object) 10.0f);
        boolean boolean37 = same27.matches((java.lang.Object) 10.0f);
        same27._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same((java.lang.Object) same27);
        org.mockito.internal.matchers.Same same40 = new org.mockito.internal.matchers.Same((java.lang.Object) same39);
        java.lang.Class<?> wildcardClass41 = same40.getClass();
        boolean boolean42 = same18.matches((java.lang.Object) same40);
        org.mockito.internal.matchers.Same same44 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        same44._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str46 = same44.toString();
        same44._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str48 = same44.toString();
        boolean boolean49 = same40.matches((java.lang.Object) same44);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(' ')" + "'", str5, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str11, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "same(' ')" + "'", str24, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "same(1.0)" + "'", str28, "same(1.0)");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "same(1.0)" + "'", str30, "same(1.0)");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "same(1.0)" + "'", str46, "same(1.0)");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "same(1.0)" + "'", str48, "same(1.0)");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str5 = same4.toString();
        boolean boolean7 = same4.matches((java.lang.Object) (byte) -1);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        java.lang.Class<?> wildcardClass9 = same1.getClass();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass9);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        boolean boolean14 = same12.matches((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass15 = same12.getClass();
        boolean boolean16 = same10.matches((java.lang.Object) same12);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) same12);
        java.lang.Object obj18 = null;
        boolean boolean19 = same17.matches(obj18);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) same21);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean26 = same24.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same28 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean29 = same24.matches((java.lang.Object) same28);
        boolean boolean31 = same28.matches((java.lang.Object) 1);
        boolean boolean33 = same28.matches((java.lang.Object) 10.0f);
        boolean boolean35 = same28.matches((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass36 = same28.getClass();
        boolean boolean37 = same22.matches((java.lang.Object) wildcardClass36);
        org.mockito.internal.matchers.Same same38 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass36);
        boolean boolean39 = same17.matches((java.lang.Object) same38);
        org.mockito.internal.matchers.Same same40 = new org.mockito.internal.matchers.Same((java.lang.Object) same17);
        java.lang.String str41 = same17.toString();
        org.mockito.internal.matchers.Same same42 = new org.mockito.internal.matchers.Same((java.lang.Object) same17);
        same17._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(' ')" + "'", str5, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "same(same(-1))" + "'", str41, "same(same(-1))");
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        boolean boolean5 = same1.matches((java.lang.Object) 10.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str7 = same1.toString();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean11 = same9.matches((java.lang.Object) ' ');
        boolean boolean13 = same9.matches((java.lang.Object) 10.0f);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean15 = same1.matches((java.lang.Object) same9);
        java.lang.String str16 = same1.toString();
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean20 = same18.matches((java.lang.Object) (-1.0d));
        java.lang.String str21 = same18.toString();
        same18._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) same18);
        boolean boolean24 = same1.matches((java.lang.Object) same23);
        org.mockito.internal.matchers.Same same26 = new org.mockito.internal.matchers.Same((java.lang.Object) 1L);
        java.lang.String str27 = same26.toString();
        same26._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same26._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same26._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        same32._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean35 = same32.matches((java.lang.Object) (short) 100);
        java.lang.Object obj36 = new java.lang.Object();
        org.mockito.internal.matchers.Same same37 = new org.mockito.internal.matchers.Same(obj36);
        boolean boolean38 = same32.matches((java.lang.Object) same37);
        boolean boolean39 = same26.matches((java.lang.Object) same37);
        boolean boolean40 = same1.matches((java.lang.Object) same26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(' ')" + "'", str7, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "same(' ')" + "'", str16, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "same(0)" + "'", str21, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "same(1)" + "'", str27, "same(1)");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str5 = same4.toString();
        boolean boolean7 = same4.matches((java.lang.Object) (byte) -1);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        java.lang.Class<?> wildcardClass9 = same1.getClass();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass9);
        java.lang.String str11 = same10.toString();
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) same14);
        java.lang.String str16 = same14.toString();
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same18._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str22 = same21.toString();
        boolean boolean24 = same21.matches((java.lang.Object) (byte) -1);
        boolean boolean25 = same18.matches((java.lang.Object) boolean24);
        java.lang.Class<?> wildcardClass26 = same18.getClass();
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass26);
        java.lang.String str28 = same27.toString();
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        same30._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean33 = same30.matches((java.lang.Object) (short) 100);
        java.lang.Object obj34 = new java.lang.Object();
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same(obj34);
        boolean boolean36 = same30.matches((java.lang.Object) same35);
        same35._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same35._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean39 = same27.matches((java.lang.Object) same35);
        org.mockito.internal.matchers.Same same40 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean39);
        org.mockito.internal.matchers.Same same41 = new org.mockito.internal.matchers.Same((java.lang.Object) same40);
        boolean boolean42 = same14.matches((java.lang.Object) same40);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(' ')" + "'", str5, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str11, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "same(same(class org.mockito.internal.matchers.Same))" + "'", str16, "same(same(class org.mockito.internal.matchers.Same))");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "same(' ')" + "'", str22, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str28, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1.0f));
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
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str2 = same1.toString();
        boolean boolean4 = same1.matches((java.lang.Object) (byte) -1);
        boolean boolean6 = same1.matches((java.lang.Object) (short) 10);
        java.lang.Object obj7 = new java.lang.Object();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same(obj7);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean12 = same10.matches((java.lang.Object) ' ');
        java.lang.String str13 = same10.toString();
        java.lang.Class<?> wildcardClass14 = same10.getClass();
        boolean boolean15 = same8.matches((java.lang.Object) wildcardClass14);
        boolean boolean16 = same1.matches((java.lang.Object) wildcardClass14);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass14);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same17);
        boolean boolean20 = same18.matches((java.lang.Object) (short) 1);
        same18._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) same18);
        java.lang.String str23 = same22.toString();
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) "same(same(\"same(0)\"))");
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str28 = same27.toString();
        boolean boolean30 = same27.matches((java.lang.Object) (byte) -1);
        boolean boolean32 = same27.matches((java.lang.Object) (short) 10);
        java.lang.Object obj33 = new java.lang.Object();
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same(obj33);
        org.mockito.internal.matchers.Same same36 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean38 = same36.matches((java.lang.Object) ' ');
        java.lang.String str39 = same36.toString();
        java.lang.Class<?> wildcardClass40 = same36.getClass();
        boolean boolean41 = same34.matches((java.lang.Object) wildcardClass40);
        boolean boolean42 = same27.matches((java.lang.Object) wildcardClass40);
        org.mockito.internal.matchers.Same same43 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass40);
        java.lang.String str44 = same43.toString();
        same43._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same43._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same47 = new org.mockito.internal.matchers.Same((java.lang.Object) same43);
        org.mockito.internal.matchers.Same same48 = new org.mockito.internal.matchers.Same((java.lang.Object) same43);
        boolean boolean49 = same25.matches((java.lang.Object) same48);
        org.mockito.internal.matchers.Same same51 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean53 = same51.matches((java.lang.Object) ' ');
        boolean boolean55 = same51.matches((java.lang.Object) 10.0f);
        same51._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str57 = same51.toString();
        org.mockito.internal.matchers.Same same59 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean61 = same59.matches((java.lang.Object) ' ');
        boolean boolean63 = same59.matches((java.lang.Object) 10.0f);
        same59._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean65 = same51.matches((java.lang.Object) same59);
        org.mockito.internal.matchers.Same same67 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean68 = same59.matches((java.lang.Object) same67);
        org.mockito.internal.matchers.Same same70 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str71 = same70.toString();
        boolean boolean73 = same70.matches((java.lang.Object) (byte) -1);
        boolean boolean75 = same70.matches((java.lang.Object) (short) 10);
        java.lang.Object obj76 = new java.lang.Object();
        org.mockito.internal.matchers.Same same77 = new org.mockito.internal.matchers.Same(obj76);
        org.mockito.internal.matchers.Same same79 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean81 = same79.matches((java.lang.Object) ' ');
        java.lang.String str82 = same79.toString();
        java.lang.Class<?> wildcardClass83 = same79.getClass();
        boolean boolean84 = same77.matches((java.lang.Object) wildcardClass83);
        boolean boolean85 = same70.matches((java.lang.Object) wildcardClass83);
        org.mockito.internal.matchers.Same same86 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass83);
        java.lang.String str87 = same86.toString();
        boolean boolean89 = same86.matches((java.lang.Object) (-1.0f));
        org.mockito.internal.matchers.Same same90 = new org.mockito.internal.matchers.Same((java.lang.Object) same86);
        boolean boolean91 = same59.matches((java.lang.Object) same90);
        same90._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Class<?> wildcardClass93 = same90.getClass();
        boolean boolean94 = same48.matches((java.lang.Object) wildcardClass93);
        org.hamcrest.Description description95 = null;
        // The following exception was thrown during execution in test generation
        try {
            same22.describeMismatch((java.lang.Object) same48, description95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(' ')" + "'", str2, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(' ')" + "'", str13, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "same(same(same(class org.mockito.internal.matchers.Same)))" + "'", str23, "same(same(same(class org.mockito.internal.matchers.Same)))");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "same(' ')" + "'", str28, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "same(' ')" + "'", str39, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str44, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "same(' ')" + "'", str57, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "same(' ')" + "'", str71, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "same(' ')" + "'", str82, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str87, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(wildcardClass93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str5 = same4.toString();
        boolean boolean7 = same4.matches((java.lang.Object) (byte) -1);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        java.lang.Class<?> wildcardClass9 = same1.getClass();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass9);
        java.lang.String str11 = same10.toString();
        same10._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) same10);
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) same14);
        org.hamcrest.Description description16 = null;
        // The following exception was thrown during execution in test generation
        try {
            same14.describeTo(description16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(' ')" + "'", str5, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str11, "same(class org.mockito.internal.matchers.Same)");
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        boolean boolean5 = same1.matches((java.lang.Object) 10.0f);
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str7 = same1.toString();
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean11 = same9.matches((java.lang.Object) ' ');
        boolean boolean13 = same9.matches((java.lang.Object) 10.0f);
        same9._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean15 = same1.matches((java.lang.Object) same9);
        java.lang.String str16 = same1.toString();
        boolean boolean18 = same1.matches((java.lang.Object) "same(same(1.0))");
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean22 = same20.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str25 = same24.toString();
        boolean boolean27 = same24.matches((java.lang.Object) (byte) -1);
        boolean boolean28 = same20.matches((java.lang.Object) (byte) -1);
        same20._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same20._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) same20);
        org.mockito.internal.matchers.Same same32 = new org.mockito.internal.matchers.Same((java.lang.Object) same20);
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) 1L);
        java.lang.String str35 = same34.toString();
        boolean boolean36 = same32.matches((java.lang.Object) same34);
        same34._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean38 = same1.matches((java.lang.Object) same34);
        java.lang.String str39 = same1.toString();
        org.mockito.internal.matchers.Same same41 = new org.mockito.internal.matchers.Same((java.lang.Object) false);
        org.mockito.internal.matchers.Same same43 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) 0);
        boolean boolean45 = same43.matches((java.lang.Object) (-1.0d));
        java.lang.String str46 = same43.toString();
        boolean boolean47 = same41.matches((java.lang.Object) str46);
        java.lang.String str48 = same41.toString();
        org.mockito.internal.matchers.Same same50 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        same50._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same53 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same53._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same56 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str57 = same56.toString();
        boolean boolean59 = same56.matches((java.lang.Object) (byte) -1);
        boolean boolean60 = same53.matches((java.lang.Object) boolean59);
        java.lang.Class<?> wildcardClass61 = same53.getClass();
        org.mockito.internal.matchers.Same same62 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass61);
        java.lang.String str63 = same62.toString();
        same62._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same65 = new org.mockito.internal.matchers.Same((java.lang.Object) same62);
        org.mockito.internal.matchers.Same same66 = new org.mockito.internal.matchers.Same((java.lang.Object) same65);
        boolean boolean67 = same50.matches((java.lang.Object) same66);
        java.lang.String str68 = same50.toString();
        boolean boolean69 = same41.matches((java.lang.Object) same50);
        same50._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean71 = same1.matches((java.lang.Object) same50);
        java.lang.String str72 = same50.toString();
        org.hamcrest.Description description73 = null;
        // The following exception was thrown during execution in test generation
        try {
            same50.describeTo(description73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(' ')" + "'", str7, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "same(' ')" + "'", str16, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "same(' ')" + "'", str25, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "same(1)" + "'", str35, "same(1)");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "same(' ')" + "'", str39, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "same(0)" + "'", str46, "same(0)");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "same(false)" + "'", str48, "same(false)");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "same(' ')" + "'", str57, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str63, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "same(10)" + "'", str68, "same(10)");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "same(10)" + "'", str72, "same(10)");
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) (-1L));
        org.mockito.internal.matchers.Same same2 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean6 = same4.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean9 = same4.matches((java.lang.Object) same8);
        boolean boolean11 = same8.matches((java.lang.Object) 1);
        boolean boolean13 = same8.matches((java.lang.Object) '4');
        java.lang.String str14 = same8.toString();
        java.lang.String str15 = same8.toString();
        java.lang.String str16 = same8.toString();
        boolean boolean17 = same2.matches((java.lang.Object) same8);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same8);
        same18._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "same(' ')" + "'", str14, "same(' ')");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(' ')" + "'", str15, "same(' ')");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "same(' ')" + "'", str16, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str2 = same1.toString();
        boolean boolean4 = same1.matches((java.lang.Object) (byte) -1);
        boolean boolean6 = same1.matches((java.lang.Object) (short) 10);
        java.lang.Object obj7 = new java.lang.Object();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same(obj7);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean12 = same10.matches((java.lang.Object) ' ');
        java.lang.String str13 = same10.toString();
        java.lang.Class<?> wildcardClass14 = same10.getClass();
        boolean boolean15 = same8.matches((java.lang.Object) wildcardClass14);
        boolean boolean16 = same1.matches((java.lang.Object) wildcardClass14);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass14);
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same((java.lang.Object) same17);
        boolean boolean20 = same18.matches((java.lang.Object) (short) 1);
        same18._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same22 = new org.mockito.internal.matchers.Same((java.lang.Object) same18);
        org.mockito.internal.matchers.Same same24 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        same24._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str26 = same24.toString();
        same24._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean28 = same22.matches((java.lang.Object) same24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(' ')" + "'", str2, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(' ')" + "'", str13, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "same(1.0)" + "'", str26, "same(1.0)");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str5 = same4.toString();
        boolean boolean7 = same4.matches((java.lang.Object) (byte) -1);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        java.lang.Class<?> wildcardClass9 = same1.getClass();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass9);
        java.lang.String str11 = same10.toString();
        java.lang.String str12 = same10.toString();
        java.lang.Class<?> wildcardClass13 = same10.getClass();
        org.mockito.internal.matchers.Same same14 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass13);
        org.mockito.internal.matchers.Same same15 = new org.mockito.internal.matchers.Same((java.lang.Object) same14);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same17._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same20 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str21 = same20.toString();
        boolean boolean23 = same20.matches((java.lang.Object) (byte) -1);
        boolean boolean24 = same17.matches((java.lang.Object) boolean23);
        org.mockito.internal.matchers.Same same25 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean24);
        java.lang.String str26 = same25.toString();
        boolean boolean27 = same15.matches((java.lang.Object) same25);
        org.mockito.internal.matchers.Same same29 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean31 = same29.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean34 = same29.matches((java.lang.Object) same33);
        boolean boolean36 = same33.matches((java.lang.Object) 1);
        boolean boolean38 = same33.matches((java.lang.Object) 10.0f);
        boolean boolean40 = same33.matches((java.lang.Object) 10);
        java.lang.String str41 = same33.toString();
        org.mockito.internal.matchers.Same same43 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean45 = same43.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same47 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean48 = same43.matches((java.lang.Object) same47);
        boolean boolean50 = same47.matches((java.lang.Object) 1);
        boolean boolean52 = same47.matches((java.lang.Object) 10.0f);
        boolean boolean54 = same47.matches((java.lang.Object) 10);
        boolean boolean55 = same33.matches((java.lang.Object) boolean54);
        same33._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same57 = new org.mockito.internal.matchers.Same((java.lang.Object) same33);
        boolean boolean58 = same15.matches((java.lang.Object) same57);
        org.mockito.internal.matchers.Same same59 = new org.mockito.internal.matchers.Same((java.lang.Object) same15);
        org.mockito.internal.matchers.Same same60 = new org.mockito.internal.matchers.Same((java.lang.Object) same15);
        org.mockito.internal.matchers.Same same62 = new org.mockito.internal.matchers.Same((java.lang.Object) 0);
        org.mockito.internal.matchers.Same same63 = new org.mockito.internal.matchers.Same((java.lang.Object) same62);
        org.mockito.internal.matchers.Same same65 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same65._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same68 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        boolean boolean69 = same65.matches((java.lang.Object) (short) -1);
        java.lang.String str70 = same65.toString();
        java.lang.Class<?> wildcardClass71 = same65.getClass();
        boolean boolean72 = same63.matches((java.lang.Object) wildcardClass71);
        org.mockito.internal.matchers.Same same74 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean76 = same74.matches((java.lang.Object) ' ');
        boolean boolean77 = same63.matches((java.lang.Object) same74);
        java.lang.Class<?> wildcardClass78 = same74.getClass();
        org.mockito.internal.matchers.Same same79 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass78);
        same79._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean81 = same15.matches((java.lang.Object) same79);
        same15._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.Object obj83 = null;
        boolean boolean84 = same15.matches(obj83);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(' ')" + "'", str5, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str11, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str12, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "same(' ')" + "'", str21, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "same(false)" + "'", str26, "same(false)");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "same(' ')" + "'", str41, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "same(' ')" + "'", str70, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str5 = same4.toString();
        boolean boolean7 = same4.matches((java.lang.Object) (byte) -1);
        boolean boolean8 = same1.matches((java.lang.Object) boolean7);
        java.lang.Class<?> wildcardClass9 = same1.getClass();
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass9);
        java.lang.String str11 = same10.toString();
        org.mockito.internal.matchers.Same same13 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        same13._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean16 = same13.matches((java.lang.Object) (short) 100);
        java.lang.Object obj17 = new java.lang.Object();
        org.mockito.internal.matchers.Same same18 = new org.mockito.internal.matchers.Same(obj17);
        boolean boolean19 = same13.matches((java.lang.Object) same18);
        same18._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same18._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean22 = same10.matches((java.lang.Object) same18);
        java.lang.String str23 = same10.toString();
        java.lang.String str24 = same10.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "same(' ')" + "'", str5, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str11, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str23, "same(class org.mockito.internal.matchers.Same)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "same(class org.mockito.internal.matchers.Same)" + "'", str24, "same(class org.mockito.internal.matchers.Same)");
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same(obj0);
        org.mockito.internal.matchers.Same same3 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean5 = same3.matches((java.lang.Object) ' ');
        java.lang.String str6 = same3.toString();
        java.lang.Class<?> wildcardClass7 = same3.getClass();
        boolean boolean8 = same1.matches((java.lang.Object) wildcardClass7);
        java.lang.String str9 = same1.toString();
        java.lang.String str10 = same1.toString();
        java.lang.String str11 = same1.toString();
        java.lang.String str12 = same1.toString();
        org.hamcrest.Description description13 = null;
        // The following exception was thrown during execution in test generation
        try {
            same1.describeTo(description13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(' ')" + "'", str6, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same4 = new org.mockito.internal.matchers.Same((java.lang.Object) (short) -1);
        boolean boolean5 = same1.matches((java.lang.Object) (short) -1);
        java.lang.String str6 = same1.toString();
        java.lang.String str7 = same1.toString();
        java.lang.String str8 = same1.toString();
        same1._dont_implement_Matcher___instead_extend_BaseMatcher_();
        java.lang.String str10 = same1.toString();
        boolean boolean12 = same1.matches((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass13 = same1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(' ')" + "'", str6, "same(' ')");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "same(' ')" + "'", str7, "same(' ')");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "same(' ')" + "'", str8, "same(' ')");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "same(' ')" + "'", str10, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str6 = same5.toString();
        boolean boolean8 = same5.matches((java.lang.Object) (byte) -1);
        boolean boolean9 = same1.matches((java.lang.Object) (byte) -1);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) same1);
        org.mockito.internal.matchers.Same same12 = new org.mockito.internal.matchers.Same((java.lang.Object) 100);
        java.lang.String str13 = same12.toString();
        boolean boolean14 = same1.matches((java.lang.Object) same12);
        org.hamcrest.Description description15 = null;
        // The following exception was thrown during execution in test generation
        try {
            same12.describeTo(description15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "same(' ')" + "'", str6, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(100)" + "'", str13, "same(100)");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean3 = same1.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same5 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean7 = same5.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same9 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean10 = same5.matches((java.lang.Object) same9);
        boolean boolean12 = same9.matches((java.lang.Object) 1);
        boolean boolean14 = same9.matches((java.lang.Object) 10.0f);
        java.lang.String str15 = same9.toString();
        java.lang.Class<?> wildcardClass16 = same9.getClass();
        boolean boolean17 = same1.matches((java.lang.Object) same9);
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean21 = same19.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same23 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str24 = same23.toString();
        boolean boolean26 = same23.matches((java.lang.Object) (byte) -1);
        boolean boolean27 = same19.matches((java.lang.Object) (byte) -1);
        same19._dont_implement_Matcher___instead_extend_BaseMatcher_();
        same19._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same30 = new org.mockito.internal.matchers.Same((java.lang.Object) same19);
        java.lang.String str31 = same19.toString();
        org.mockito.internal.matchers.Same same33 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        org.mockito.internal.matchers.Same same34 = new org.mockito.internal.matchers.Same((java.lang.Object) same33);
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same((java.lang.Object) same34);
        boolean boolean36 = same19.matches((java.lang.Object) same35);
        same19._dont_implement_Matcher___instead_extend_BaseMatcher_();
        org.mockito.internal.matchers.Same same39 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same41 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean43 = same41.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same45 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean46 = same41.matches((java.lang.Object) same45);
        boolean boolean48 = same45.matches((java.lang.Object) 1);
        boolean boolean50 = same45.matches((java.lang.Object) 10.0f);
        org.mockito.internal.matchers.Same same52 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str53 = same52.toString();
        boolean boolean55 = same52.matches((java.lang.Object) 1L);
        boolean boolean56 = same45.matches((java.lang.Object) boolean55);
        java.lang.String str57 = same45.toString();
        boolean boolean58 = same39.matches((java.lang.Object) str57);
        java.lang.String str59 = same39.toString();
        boolean boolean60 = same19.matches((java.lang.Object) same39);
        java.lang.String str61 = same19.toString();
        boolean boolean62 = same9.matches((java.lang.Object) same19);
        org.mockito.internal.matchers.Same same63 = new org.mockito.internal.matchers.Same((java.lang.Object) same19);
        org.mockito.internal.matchers.Same same65 = new org.mockito.internal.matchers.Same((java.lang.Object) (byte) 10);
        java.lang.String str66 = same65.toString();
        java.lang.String str67 = same65.toString();
        java.lang.Class<?> wildcardClass68 = same65.getClass();
        org.mockito.internal.matchers.Same same69 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass68);
        boolean boolean70 = same19.matches((java.lang.Object) same69);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "same(' ')" + "'", str15, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "same(' ')" + "'", str24, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "same(' ')" + "'", str31, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "same(' ')" + "'", str53, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "same(' ')" + "'", str57, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "same(' ')" + "'", str59, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "same(' ')" + "'", str61, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "same(10)" + "'", str66, "same(10)");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "same(10)" + "'", str67, "same(10)");
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.mockito.internal.matchers.Same same1 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str2 = same1.toString();
        boolean boolean4 = same1.matches((java.lang.Object) (byte) -1);
        boolean boolean6 = same1.matches((java.lang.Object) (short) 10);
        java.lang.Object obj7 = new java.lang.Object();
        org.mockito.internal.matchers.Same same8 = new org.mockito.internal.matchers.Same(obj7);
        org.mockito.internal.matchers.Same same10 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean12 = same10.matches((java.lang.Object) ' ');
        java.lang.String str13 = same10.toString();
        java.lang.Class<?> wildcardClass14 = same10.getClass();
        boolean boolean15 = same8.matches((java.lang.Object) wildcardClass14);
        boolean boolean16 = same1.matches((java.lang.Object) wildcardClass14);
        org.mockito.internal.matchers.Same same17 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass14);
        java.lang.Object obj18 = new java.lang.Object();
        org.mockito.internal.matchers.Same same19 = new org.mockito.internal.matchers.Same(obj18);
        org.mockito.internal.matchers.Same same21 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean23 = same21.matches((java.lang.Object) ' ');
        java.lang.String str24 = same21.toString();
        java.lang.Class<?> wildcardClass25 = same21.getClass();
        boolean boolean26 = same19.matches((java.lang.Object) wildcardClass25);
        org.mockito.internal.matchers.Same same27 = new org.mockito.internal.matchers.Same((java.lang.Object) boolean26);
        same27._dont_implement_Matcher___instead_extend_BaseMatcher_();
        boolean boolean29 = same17.matches((java.lang.Object) same27);
        org.mockito.internal.matchers.Same same31 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean33 = same31.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same35 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        java.lang.String str36 = same35.toString();
        boolean boolean38 = same35.matches((java.lang.Object) (byte) -1);
        boolean boolean39 = same31.matches((java.lang.Object) (byte) -1);
        org.mockito.internal.matchers.Same same40 = new org.mockito.internal.matchers.Same((java.lang.Object) same31);
        org.mockito.internal.matchers.Same same42 = new org.mockito.internal.matchers.Same((java.lang.Object) 1.0d);
        org.mockito.internal.matchers.Same same43 = new org.mockito.internal.matchers.Same((java.lang.Object) same42);
        org.mockito.internal.matchers.Same same45 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean47 = same45.matches((java.lang.Object) ' ');
        org.mockito.internal.matchers.Same same49 = new org.mockito.internal.matchers.Same((java.lang.Object) ' ');
        boolean boolean50 = same45.matches((java.lang.Object) same49);
        boolean boolean52 = same49.matches((java.lang.Object) 1);
        boolean boolean54 = same49.matches((java.lang.Object) 10.0f);
        boolean boolean56 = same49.matches((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass57 = same49.getClass();
        boolean boolean58 = same43.matches((java.lang.Object) wildcardClass57);
        org.mockito.internal.matchers.Same same59 = new org.mockito.internal.matchers.Same((java.lang.Object) wildcardClass57);
        boolean boolean60 = same31.matches((java.lang.Object) wildcardClass57);
        boolean boolean61 = same17.matches((java.lang.Object) same31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "same(' ')" + "'", str2, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "same(' ')" + "'", str13, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "same(' ')" + "'", str24, "same(' ')");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "same(' ')" + "'", str36, "same(' ')");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }
}

