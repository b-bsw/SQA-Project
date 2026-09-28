package org.jsoup.nodes;

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.Class<?> wildcardClass1 = attributes0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.String str0 = org.jsoup.nodes.Attributes.dataPrefix;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "data-" + "'", str0, "data-");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.Class<?> wildcardClass7 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attribute attribute1 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.Class<?> wildcardClass5 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attribute attribute2 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str2 = attributes0.getIgnoreCase("hi!");
        java.lang.Class<?> wildcardClass3 = attributes0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        java.lang.Class<?> wildcardClass4 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        int int4 = attributes0.size();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        java.lang.String str7 = attributes5.getIgnoreCase("hi!");
        org.jsoup.nodes.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes5.put(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList3 = attributes0.asList();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(attributeList3);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        org.jsoup.nodes.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        boolean boolean7 = attributes5.hasKey("");
        attributes5.remove("hi!");
        boolean boolean11 = attributes5.hasKeyIgnoreCase("hi!");
        boolean boolean13 = attributes5.equals((java.lang.Object) 100L);
        attributes0.addAll(attributes5);
        // The following exception was thrown during execution in test generation
        try {
            attributes0.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        attributes0.removeIgnoreCase("data-");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        boolean boolean7 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        attributes8.removeIgnoreCase("hi!");
        boolean boolean12 = attributes8.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes8.clone();
        attributes0.addAll(attributes8);
        attributes0.remove("data-");
        attributes0.put("data-", true);
        org.jsoup.nodes.Attribute attribute20 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList3 = attributes0.asList();
        java.lang.Class<?> wildcardClass4 = attributeList3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(attributeList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        java.lang.Class<?> wildcardClass5 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        java.lang.String str10 = attributes0.html();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        attributes0.html(appendable11, outputSettings12);
        org.jsoup.nodes.Attribute attribute14 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        java.lang.String str7 = attributes5.getIgnoreCase("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = attributes5.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        attributes0.put("data-", false);
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", "data-");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        java.lang.String str10 = attributes0.html();
        java.lang.String str11 = attributes0.html();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        // The following exception was thrown during execution in test generation
        try {
            attributes5.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        org.jsoup.nodes.Attribute attribute10 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList3 = attributes0.asList();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(attributeList3);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        boolean boolean7 = attributes5.hasKeyIgnoreCase("");
        // The following exception was thrown during execution in test generation
        try {
            attributes5.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList3 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList6 = attributes0.asList();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(attributeList3);
        org.junit.Assert.assertNotNull(attributeList6);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attribute attribute2 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes0.dataset();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        attributes0.html(appendable11, outputSettings12);
        java.lang.String str15 = attributes0.get("hi!");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        java.lang.String str13 = attributes0.get("data-");
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.html(appendable14, outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        java.lang.String str7 = attributes5.getIgnoreCase("hi!");
        java.lang.String str9 = attributes5.get("data-");
        // The following exception was thrown during execution in test generation
        try {
            attributes5.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str2 = attributes0.get("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        boolean boolean6 = attributes4.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes4.dataset();
        boolean boolean9 = attributes4.hasKey("data-");
        boolean boolean11 = attributes4.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        attributes12.removeIgnoreCase("hi!");
        boolean boolean16 = attributes12.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes17 = attributes12.clone();
        attributes4.addAll(attributes12);
        attributes4.remove("data-");
        attributes0.addAll(attributes4);
        java.lang.Object obj22 = null;
        boolean boolean23 = attributes0.equals(obj22);
        org.jsoup.nodes.Attribute attribute24 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes0.dataset();
        attributes0.remove("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes0.dataset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        boolean boolean7 = attributes5.hasKeyIgnoreCase("");
        java.lang.String str8 = attributes5.toString();
        attributes5.put("hi!", false);
        org.jsoup.nodes.Attribute attribute12 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes5.put(attribute12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        boolean boolean7 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        attributes8.removeIgnoreCase("hi!");
        boolean boolean12 = attributes8.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes8.clone();
        attributes0.addAll(attributes8);
        attributes0.remove("data-");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = attributes0.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        attributes7.html(appendable8, outputSettings9);
        // The following exception was thrown during execution in test generation
        try {
            attributes7.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        int int6 = attributes0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        boolean boolean4 = attributes2.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes2.dataset();
        boolean boolean7 = attributes2.hasKey("data-");
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.removeIgnoreCase("hi!");
        boolean boolean14 = attributes10.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes15 = attributes10.clone();
        attributes2.addAll(attributes10);
        attributes2.remove("data-");
        boolean boolean19 = attributes0.equals((java.lang.Object) attributes2);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes2.iterator();
        java.lang.Class<?> wildcardClass21 = attributeItor20.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        attributes0.removeIgnoreCase("data-");
        java.lang.String str7 = attributes0.html();
        org.jsoup.nodes.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        java.lang.String str10 = attributes0.html();
        java.lang.String str11 = attributes0.html();
        attributes0.remove("data-");
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        attributes14.removeIgnoreCase("hi!");
        boolean boolean18 = attributes14.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes14.iterator();
        boolean boolean21 = attributes14.hasKeyIgnoreCase("data-");
        attributes0.addAll(attributes14);
        org.jsoup.nodes.Attribute attribute23 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributeItor19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator11 = attributes0.spliterator();
        java.lang.String str13 = attributes0.getIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        attributes14.removeIgnoreCase("hi!");
        boolean boolean18 = attributes14.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes14.iterator();
        boolean boolean20 = attributes0.equals((java.lang.Object) attributeItor19);
        attributes0.put(" hi!=\"data-\" data-=\"hi!\"", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeSpliterator11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributeItor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = attributes0.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        java.lang.Class<?> wildcardClass7 = attributes0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes7 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.addAll(attributes7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeItor6);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        attributes0.html(appendable7, outputSettings8);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator10 = attributes0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator10);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        int int11 = attributes0.size();
        java.lang.String str12 = attributes0.html();
        org.jsoup.nodes.Attribute attribute13 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        attributes0.html(appendable7, outputSettings8);
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        boolean boolean12 = attributes10.hasKey("");
        attributes10.remove("hi!");
        boolean boolean16 = attributes10.hasKeyIgnoreCase("hi!");
        boolean boolean18 = attributes10.equals((java.lang.Object) 100L);
        java.lang.String str20 = attributes10.get("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator21 = attributes10.spliterator();
        boolean boolean23 = attributes10.hasKeyIgnoreCase("hi!");
        attributes0.addAll(attributes10);
        java.lang.Class<?> wildcardClass25 = attributes10.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributeSpliterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        boolean boolean6 = attributes4.hasKey("");
        attributes4.remove("hi!");
        boolean boolean10 = attributes4.hasKeyIgnoreCase("hi!");
        boolean boolean12 = attributes4.hasKey("");
        attributes4.put("hi!", "data-");
        attributes4.put("data-", "hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList19 = attributes4.asList();
        boolean boolean20 = attributes0.equals((java.lang.Object) attributes4);
        org.jsoup.nodes.Attribute attribute21 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        attributes0.put("data-", true);
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.html(appendable14, outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        org.jsoup.nodes.Attribute attribute12 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        boolean boolean11 = attributes9.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = attributes9.dataset();
        boolean boolean14 = attributes9.hasKey("data-");
        boolean boolean16 = attributes9.hasKeyIgnoreCase("");
        attributes7.addAll(attributes9);
        boolean boolean18 = attributes0.equals((java.lang.Object) attributes9);
        org.jsoup.nodes.Attributes attributes19 = attributes9.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = attributes19.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        boolean boolean7 = attributes0.hasKey("hi!");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str2 = attributes0.get("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        java.lang.Class<?> wildcardClass4 = strMap3.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator11 = attributes0.spliterator();
        java.lang.String str13 = attributes0.getIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        attributes14.removeIgnoreCase("hi!");
        boolean boolean18 = attributes14.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes14.iterator();
        boolean boolean20 = attributes0.equals((java.lang.Object) attributeItor19);
        org.jsoup.nodes.Attribute attribute21 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeSpliterator11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributeItor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        int int10 = attributes0.size();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(attributeItor11);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        boolean boolean6 = attributes4.hasKey("");
        attributes4.remove("hi!");
        boolean boolean10 = attributes4.hasKeyIgnoreCase("hi!");
        boolean boolean12 = attributes4.hasKey("");
        attributes4.put("hi!", "data-");
        attributes4.put("data-", "hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList19 = attributes4.asList();
        boolean boolean20 = attributes0.equals((java.lang.Object) attributes4);
        java.lang.Class<?> wildcardClass21 = attributes4.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        int int6 = attributes0.size();
        java.lang.String str7 = attributes0.html();
        org.jsoup.nodes.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        attributes0.removeIgnoreCase("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes0.dataset();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", " hi!=\"data-\" data-=\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList3 = attributes0.asList();
        java.lang.Class<?> wildcardClass4 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(attributeList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        boolean boolean7 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        attributes8.removeIgnoreCase("hi!");
        boolean boolean12 = attributes8.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes8.clone();
        attributes0.addAll(attributes8);
        attributes0.remove("data-");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.html(appendable12, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("hi!");
        java.lang.String str9 = attributes0.toString();
        java.lang.Class<?> wildcardClass10 = attributes0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        attributes0.put("data-", false);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes0.dataset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator11 = attributes0.spliterator();
        boolean boolean13 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList14 = attributes0.asList();
        java.lang.Class<?> wildcardClass15 = attributeList14.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributeList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        // The following exception was thrown during execution in test generation
        try {
            attributes7.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        org.jsoup.nodes.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.lang.Class<?> wildcardClass4 = attributes0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        int int10 = attributes0.size();
        attributes0.remove("data-");
        java.lang.String str13 = attributes0.html();
        org.jsoup.nodes.Attribute attribute14 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str2 = attributes0.getIgnoreCase("hi!");
        boolean boolean4 = attributes0.equals((java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        int int11 = attributes0.size();
        java.lang.String str13 = attributes0.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes14 = attributes0.clone();
        boolean boolean16 = attributes0.hasKeyIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        org.jsoup.nodes.Attribute attribute17 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        boolean boolean4 = attributes2.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes2.dataset();
        boolean boolean7 = attributes2.hasKey("data-");
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.removeIgnoreCase("hi!");
        boolean boolean14 = attributes10.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes15 = attributes10.clone();
        attributes2.addAll(attributes10);
        attributes2.remove("data-");
        boolean boolean19 = attributes0.equals((java.lang.Object) attributes2);
        java.util.List<org.jsoup.nodes.Attribute> attributeList20 = attributes0.asList();
        java.lang.Class<?> wildcardClass21 = attributes0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(attributeList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes4 = attributes0.clone();
        attributes4.put(" hi!=\"data-\" data-=\"hi!\"", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributes4);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        java.lang.String str13 = attributes0.get("data-");
        int int14 = attributes0.size();
        org.jsoup.nodes.Attribute attribute15 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        boolean boolean7 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        attributes8.removeIgnoreCase("hi!");
        boolean boolean12 = attributes8.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes8.clone();
        attributes0.addAll(attributes8);
        attributes0.remove("data-");
        attributes0.put("data-", true);
        java.lang.Class<?> wildcardClass20 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        attributes0.remove("hi!");
        attributes0.put("hi!", "data-");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        java.lang.String str13 = attributes0.get("data-");
        java.lang.Class<?> wildcardClass14 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        boolean boolean4 = attributes2.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes2.dataset();
        boolean boolean7 = attributes2.hasKey("data-");
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.removeIgnoreCase("hi!");
        boolean boolean14 = attributes10.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes15 = attributes10.clone();
        attributes2.addAll(attributes10);
        attributes2.remove("data-");
        boolean boolean19 = attributes0.equals((java.lang.Object) attributes2);
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        attributes0.html(appendable20, outputSettings21);
        org.jsoup.nodes.Attribute attribute23 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        attributes0.removeIgnoreCase("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes0.dataset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = attributes0.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        org.jsoup.nodes.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        java.lang.String str10 = attributes0.html();
        java.lang.String str11 = attributes0.html();
        attributes0.remove("data-");
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        attributes14.removeIgnoreCase("hi!");
        boolean boolean18 = attributes14.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes14.iterator();
        boolean boolean21 = attributes14.hasKeyIgnoreCase("data-");
        attributes0.addAll(attributes14);
        int int23 = attributes0.size();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributeItor19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        int int10 = attributes0.size();
        java.lang.String str12 = attributes0.get("hi!");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        boolean boolean6 = attributes4.hasKey("");
        attributes4.remove("hi!");
        boolean boolean10 = attributes4.hasKeyIgnoreCase("hi!");
        boolean boolean12 = attributes4.hasKey("");
        attributes4.put("hi!", "data-");
        attributes4.put("data-", "hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList19 = attributes4.asList();
        boolean boolean20 = attributes0.equals((java.lang.Object) attributes4);
        attributes4.removeIgnoreCase("data-");
        org.jsoup.nodes.Attribute attribute23 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes4.put(attribute23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        java.lang.String str10 = attributes0.html();
        java.lang.String str11 = attributes0.html();
        attributes0.remove("data-");
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        attributes14.removeIgnoreCase("hi!");
        boolean boolean18 = attributes14.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes14.iterator();
        boolean boolean21 = attributes14.hasKeyIgnoreCase("data-");
        attributes0.addAll(attributes14);
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = attributes23.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator25 = attributes23.spliterator();
        java.lang.String str26 = attributes23.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList27 = attributes23.asList();
        attributes23.removeIgnoreCase("hi!");
        boolean boolean31 = attributes23.hasKey("hi!");
        java.lang.String str32 = attributes23.toString();
        boolean boolean33 = attributes14.equals((java.lang.Object) attributes23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = attributes14.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributeItor19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(attributeSpliterator25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(attributeList27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        int int4 = attributes0.size();
        attributes0.put("data-", true);
        // The following exception was thrown during execution in test generation
        try {
            attributes0.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        int int4 = attributes0.size();
        attributes0.put("data-", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = attributes0.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        attributes0.put("hi!", "data-");
        java.util.List<org.jsoup.nodes.Attribute> attributeList9 = attributes0.asList();
        java.lang.String str11 = attributes0.getIgnoreCase("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator12 = attributes0.spliterator();
        boolean boolean14 = attributes0.equals((java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            attributes0.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributeSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeItor7);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        boolean boolean7 = attributes5.hasKey("");
        attributes5.remove("hi!");
        boolean boolean11 = attributes5.hasKeyIgnoreCase("hi!");
        boolean boolean13 = attributes5.equals((java.lang.Object) 100L);
        attributes0.addAll(attributes5);
        java.lang.Class<?> wildcardClass15 = attributes5.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.equals((java.lang.Object) (short) -1);
        attributes0.removeIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        attributes0.put(" hi!=\"data-\" data-=\"hi!\"", "");
        org.jsoup.nodes.Attributes attributes11 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.addAll(attributes11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes0.dataset();
        attributes0.remove(" data-");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = attributes0.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        boolean boolean4 = attributes2.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes2.dataset();
        boolean boolean7 = attributes2.hasKey("data-");
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.removeIgnoreCase("hi!");
        boolean boolean14 = attributes10.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes15 = attributes10.clone();
        attributes2.addAll(attributes10);
        attributes2.remove("data-");
        boolean boolean19 = attributes0.equals((java.lang.Object) attributes2);
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        boolean boolean22 = attributes20.hasKey("");
        attributes20.remove("hi!");
        boolean boolean26 = attributes20.hasKeyIgnoreCase("hi!");
        boolean boolean28 = attributes20.hasKey("");
        boolean boolean30 = attributes20.hasKey("hi!");
        boolean boolean31 = attributes2.equals((java.lang.Object) boolean30);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = attributes2.dataset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = attributes2.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strMap32);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        boolean boolean7 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        attributes8.removeIgnoreCase("hi!");
        boolean boolean12 = attributes8.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes8.clone();
        attributes0.addAll(attributes8);
        java.lang.String str15 = attributes0.html();
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        attributes0.html(appendable16, outputSettings17);
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        boolean boolean21 = attributes19.hasKey("");
        attributes19.remove("hi!");
        boolean boolean25 = attributes19.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = attributes26.dataset();
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        boolean boolean30 = attributes28.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = attributes28.dataset();
        boolean boolean33 = attributes28.hasKey("data-");
        boolean boolean35 = attributes28.hasKeyIgnoreCase("");
        attributes26.addAll(attributes28);
        boolean boolean37 = attributes19.equals((java.lang.Object) attributes28);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator38 = attributes19.spliterator();
        attributes0.addAll(attributes19);
        java.util.List<org.jsoup.nodes.Attribute> attributeList40 = attributes0.asList();
        org.jsoup.nodes.Attribute attribute41 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator38);
        org.junit.Assert.assertNotNull(attributeList40);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        boolean boolean4 = attributes2.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes2.dataset();
        boolean boolean7 = attributes2.hasKey("data-");
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.removeIgnoreCase("hi!");
        boolean boolean14 = attributes10.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes15 = attributes10.clone();
        attributes2.addAll(attributes10);
        attributes2.remove("data-");
        boolean boolean19 = attributes0.equals((java.lang.Object) attributes2);
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        boolean boolean22 = attributes20.hasKey("");
        attributes20.remove("hi!");
        boolean boolean26 = attributes20.hasKeyIgnoreCase("hi!");
        boolean boolean28 = attributes20.hasKey("");
        boolean boolean30 = attributes20.hasKey("hi!");
        boolean boolean31 = attributes2.equals((java.lang.Object) boolean30);
        org.jsoup.nodes.Attribute attribute32 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes2.put(attribute32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        boolean boolean4 = attributes2.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes2.dataset();
        boolean boolean7 = attributes2.hasKey("data-");
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.removeIgnoreCase("hi!");
        boolean boolean14 = attributes10.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes15 = attributes10.clone();
        attributes2.addAll(attributes10);
        attributes2.remove("data-");
        boolean boolean19 = attributes0.equals((java.lang.Object) attributes2);
        java.util.List<org.jsoup.nodes.Attribute> attributeList20 = attributes0.asList();
        boolean boolean22 = attributes0.hasKey("");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(attributeList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator11 = attributes0.spliterator();
        boolean boolean13 = attributes0.hasKeyIgnoreCase("hi!");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        attributes0.html(appendable11, outputSettings12);
        java.lang.String str14 = attributes0.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator15 = attributes0.spliterator();
        java.lang.Class<?> wildcardClass16 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributeSpliterator15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        boolean boolean4 = attributes2.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes2.dataset();
        boolean boolean7 = attributes2.hasKey("data-");
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        attributes0.addAll(attributes2);
        org.jsoup.nodes.Attribute attribute11 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        boolean boolean6 = attributes4.hasKey("");
        attributes4.remove("hi!");
        boolean boolean10 = attributes4.hasKeyIgnoreCase("hi!");
        boolean boolean12 = attributes4.hasKey("");
        attributes4.put("hi!", "data-");
        attributes4.put("data-", "hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList19 = attributes4.asList();
        boolean boolean20 = attributes0.equals((java.lang.Object) attributes4);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor21 = attributes4.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributeItor21);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        java.lang.String str13 = attributes0.get("data-");
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        attributes14.removeIgnoreCase("hi!");
        boolean boolean18 = attributes14.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes19 = attributes14.clone();
        java.lang.String str21 = attributes19.getIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor22 = attributes19.iterator();
        int int23 = attributes19.size();
        attributes0.addAll(attributes19);
        java.lang.String str26 = attributes19.getIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        java.lang.Class<?> wildcardClass27 = attributes19.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributeItor22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        boolean boolean11 = attributes9.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = attributes9.dataset();
        boolean boolean14 = attributes9.hasKey("data-");
        boolean boolean16 = attributes9.hasKeyIgnoreCase("");
        attributes7.addAll(attributes9);
        boolean boolean18 = attributes0.equals((java.lang.Object) attributes9);
        org.jsoup.nodes.Attributes attributes19 = attributes9.clone();
        attributes9.removeIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator22 = attributes9.spliterator();
        org.jsoup.nodes.Attribute attribute23 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes9.put(attribute23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributeSpliterator22);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.equals((java.lang.Object) (short) -1);
        attributes0.removeIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        java.lang.Class<?> wildcardClass8 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        int int11 = attributes0.size();
        java.lang.Class<?> wildcardClass12 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("hi!");
        java.lang.String str9 = attributes0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = attributes0.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        org.jsoup.nodes.Attribute attribute9 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        boolean boolean7 = attributes5.hasKeyIgnoreCase("");
        attributes5.put(" data-", true);
        org.jsoup.nodes.Attributes attributes11 = attributes5.clone();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        boolean boolean14 = attributes12.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes12.dataset();
        boolean boolean17 = attributes12.hasKey("data-");
        boolean boolean19 = attributes12.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        attributes20.removeIgnoreCase("hi!");
        boolean boolean24 = attributes20.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes25 = attributes20.clone();
        attributes12.addAll(attributes20);
        attributes12.remove("data-");
        attributes12.put("data-", true);
        attributes11.addAll(attributes12);
        org.jsoup.nodes.Attributes attributes33 = attributes11.clone();
        org.jsoup.nodes.Attribute attribute34 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes33.put(attribute34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(attributes33);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        int int10 = attributes0.size();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        attributes12.removeIgnoreCase("hi!");
        boolean boolean16 = attributes12.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes17 = attributes12.clone();
        java.lang.String str19 = attributes17.getIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes20 = attributes17.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList21 = attributes20.asList();
        boolean boolean22 = attributes0.equals((java.lang.Object) attributeList21);
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(attributeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        boolean boolean10 = attributes8.hasKey("");
        attributes8.remove("hi!");
        boolean boolean14 = attributes8.hasKeyIgnoreCase("hi!");
        boolean boolean16 = attributes8.equals((java.lang.Object) 100L);
        java.lang.String str18 = attributes8.get("hi!");
        attributes8.put("data-", true);
        boolean boolean22 = attributes0.equals((java.lang.Object) true);
        boolean boolean24 = attributes0.hasKey("data-");
        int int25 = attributes0.size();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor26 = attributes0.iterator();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(attributeItor26);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        int int11 = attributes0.size();
        java.lang.String str12 = attributes0.html();
        java.lang.Class<?> wildcardClass13 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator11 = attributes0.spliterator();
        java.lang.String str13 = attributes0.getIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        attributes14.removeIgnoreCase("hi!");
        boolean boolean18 = attributes14.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes14.iterator();
        boolean boolean20 = attributes0.equals((java.lang.Object) attributeItor19);
        java.lang.Class<?> wildcardClass21 = attributeItor19.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeSpliterator11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributeItor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        boolean boolean7 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        attributes8.removeIgnoreCase("hi!");
        boolean boolean12 = attributes8.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes8.clone();
        attributes0.addAll(attributes8);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes8.iterator();
        // The following exception was thrown during execution in test generation
        try {
            attributes8.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributeItor15);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        java.lang.String str7 = attributes5.getIgnoreCase("hi!");
        java.lang.String str9 = attributes5.get("data-");
        int int10 = attributes5.size();
        attributes5.removeIgnoreCase("hi!");
        org.jsoup.nodes.Attribute attribute13 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes5.put(attribute13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes0.iterator();
        org.jsoup.nodes.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertNotNull(attributeItor7);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        boolean boolean7 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        boolean boolean10 = attributes8.hasKey("");
        attributes8.remove("hi!");
        boolean boolean14 = attributes8.hasKeyIgnoreCase("hi!");
        boolean boolean16 = attributes8.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes8.iterator();
        java.lang.String str18 = attributes8.html();
        java.lang.String str19 = attributes8.html();
        attributes8.remove("data-");
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        attributes22.removeIgnoreCase("hi!");
        boolean boolean26 = attributes22.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor27 = attributes22.iterator();
        boolean boolean29 = attributes22.hasKeyIgnoreCase("data-");
        attributes8.addAll(attributes22);
        attributes0.addAll(attributes8);
        // The following exception was thrown during execution in test generation
        try {
            attributes8.put("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(attributeItor27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        attributes0.removeIgnoreCase("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes0.dataset();
        int int10 = attributes0.size();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("hi!");
        int int9 = attributes0.size();
        java.lang.String str10 = attributes0.toString();
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        boolean boolean13 = attributes11.hasKey("");
        attributes11.remove("hi!");
        boolean boolean17 = attributes11.hasKeyIgnoreCase("hi!");
        boolean boolean19 = attributes11.equals((java.lang.Object) 100L);
        java.lang.String str21 = attributes11.get("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator22 = attributes11.spliterator();
        boolean boolean24 = attributes11.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes25 = attributes11.clone();
        attributes0.addAll(attributes11);
        java.lang.String str27 = attributes0.toString();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributeSpliterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        boolean boolean7 = attributes5.hasKeyIgnoreCase("");
        java.lang.String str8 = attributes5.toString();
        java.lang.String str9 = attributes5.toString();
        java.lang.String str10 = attributes5.html();
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        boolean boolean13 = attributes11.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes11.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes11.dataset();
        attributes11.remove("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = attributes11.dataset();
        boolean boolean19 = attributes5.equals((java.lang.Object) strMap18);
        org.jsoup.nodes.Attributes attributes20 = attributes5.clone();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = attributes5.dataset();
        java.util.List<org.jsoup.nodes.Attribute> attributeList22 = attributes5.asList();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator23 = attributeList22.spliterator();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(attributeList22);
        org.junit.Assert.assertNotNull(attributeSpliterator23);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        int int11 = attributes0.size();
        java.lang.String str13 = attributes0.getIgnoreCase("data-");
        java.lang.Class<?> wildcardClass14 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        boolean boolean10 = attributes8.hasKey("");
        attributes8.remove("hi!");
        boolean boolean14 = attributes8.hasKeyIgnoreCase("hi!");
        boolean boolean16 = attributes8.equals((java.lang.Object) 100L);
        java.lang.String str18 = attributes8.get("hi!");
        attributes8.put("data-", true);
        boolean boolean22 = attributes0.equals((java.lang.Object) true);
        boolean boolean24 = attributes0.hasKey("data-");
        java.util.List<org.jsoup.nodes.Attribute> attributeList25 = attributes0.asList();
        java.lang.Class<?> wildcardClass26 = attributes0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributeList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        int int4 = attributes0.size();
        attributes0.put("data-", true);
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        boolean boolean10 = attributes8.hasKey("");
        attributes8.remove("hi!");
        boolean boolean14 = attributes8.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes15.dataset();
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        boolean boolean19 = attributes17.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = attributes17.dataset();
        boolean boolean22 = attributes17.hasKey("data-");
        boolean boolean24 = attributes17.hasKeyIgnoreCase("");
        attributes15.addAll(attributes17);
        boolean boolean26 = attributes8.equals((java.lang.Object) attributes17);
        org.jsoup.nodes.Attributes attributes27 = attributes17.clone();
        attributes0.addAll(attributes17);
        java.util.List<org.jsoup.nodes.Attribute> attributeList29 = attributes0.asList();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(attributeList29);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.String str8 = attributes0.get("data-");
        attributes0.put(" data-", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributeItor12);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        org.jsoup.nodes.Attributes attributes3 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.addAll(attributes3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.remove("hi!");
        java.lang.String str11 = attributes0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        java.lang.String str10 = attributes0.html();
        java.lang.String str11 = attributes0.html();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        attributes0.html(appendable12, outputSettings13);
        java.util.List<org.jsoup.nodes.Attribute> attributeList15 = attributes0.asList();
        attributes0.removeIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        java.lang.String str19 = attributes0.get("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributeList15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        attributes0.put("hi!", "data-");
        java.util.List<org.jsoup.nodes.Attribute> attributeList9 = attributes0.asList();
        java.lang.String str11 = attributes0.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes12 = attributes0.clone();
        int int13 = attributes0.size();
        java.lang.String str14 = attributes0.toString();
        org.jsoup.nodes.Attribute attribute15 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " hi!=\"data-\"" + "'", str14, " hi!=\"data-\"");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor4 = attributes0.iterator();
        org.jsoup.nodes.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeItor4);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        attributes0.put("data-", "hi!");
        java.lang.String str15 = attributes0.html();
        boolean boolean17 = attributes0.hasKeyIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        boolean boolean19 = attributes0.hasKeyIgnoreCase("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes0.iterator();
        java.lang.Appendable appendable21 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.html(appendable21, outputSettings22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " hi!=\"data-\" data-=\"hi!\"" + "'", str15, " hi!=\"data-\" data-=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributeItor20);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        boolean boolean6 = attributes4.hasKey("");
        attributes4.remove("hi!");
        boolean boolean10 = attributes4.hasKeyIgnoreCase("hi!");
        boolean boolean12 = attributes4.hasKey("");
        attributes4.put("hi!", "data-");
        attributes4.put("data-", "hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList19 = attributes4.asList();
        boolean boolean20 = attributes0.equals((java.lang.Object) attributes4);
        attributes4.removeIgnoreCase("data-");
        boolean boolean24 = attributes4.hasKey(" data-");
        org.jsoup.nodes.Attributes attributes25 = new org.jsoup.nodes.Attributes();
        boolean boolean27 = attributes25.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList28 = attributes25.asList();
        java.lang.String str30 = attributes25.getIgnoreCase(" data-");
        boolean boolean31 = attributes4.equals((java.lang.Object) str30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(attributeList28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        attributes0.put("data-", true);
        org.jsoup.nodes.Attribute attribute14 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        attributes0.html(appendable7, outputSettings8);
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        boolean boolean12 = attributes10.hasKey("");
        attributes10.remove("hi!");
        boolean boolean16 = attributes10.hasKeyIgnoreCase("hi!");
        boolean boolean18 = attributes10.equals((java.lang.Object) 100L);
        java.lang.String str20 = attributes10.get("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator21 = attributes10.spliterator();
        boolean boolean23 = attributes10.hasKeyIgnoreCase("hi!");
        attributes0.addAll(attributes10);
        java.lang.String str25 = attributes10.html();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributeSpliterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        int int3 = attributes0.size();
        attributes0.removeIgnoreCase(" hi!=\"data-\"");
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        boolean boolean7 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        attributes8.removeIgnoreCase("hi!");
        boolean boolean12 = attributes8.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes8.clone();
        attributes0.addAll(attributes8);
        java.lang.String str15 = attributes0.html();
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        attributes0.html(appendable16, outputSettings17);
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        boolean boolean21 = attributes19.hasKey("");
        attributes19.remove("hi!");
        boolean boolean25 = attributes19.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = attributes26.dataset();
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        boolean boolean30 = attributes28.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = attributes28.dataset();
        boolean boolean33 = attributes28.hasKey("data-");
        boolean boolean35 = attributes28.hasKeyIgnoreCase("");
        attributes26.addAll(attributes28);
        boolean boolean37 = attributes19.equals((java.lang.Object) attributes28);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator38 = attributes19.spliterator();
        attributes0.addAll(attributes19);
        org.jsoup.nodes.Attribute attribute40 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes19.put(attribute40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator38);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList3 = attributes0.asList();
        org.jsoup.nodes.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeList3);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        java.lang.String str10 = attributes0.html();
        org.jsoup.nodes.Attribute attribute11 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        boolean boolean4 = attributes2.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes2.dataset();
        boolean boolean7 = attributes2.hasKey("data-");
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        attributes0.addAll(attributes2);
        int int11 = attributes2.size();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        boolean boolean14 = attributes12.hasKey("");
        attributes12.remove("hi!");
        boolean boolean18 = attributes12.hasKeyIgnoreCase("hi!");
        attributes2.addAll(attributes12);
        // The following exception was thrown during execution in test generation
        try {
            attributes2.put("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        boolean boolean6 = attributes4.hasKey("");
        attributes4.remove("hi!");
        boolean boolean10 = attributes4.hasKeyIgnoreCase("hi!");
        boolean boolean12 = attributes4.hasKey("");
        attributes4.put("hi!", "data-");
        attributes4.put("data-", "hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList19 = attributes4.asList();
        boolean boolean20 = attributes0.equals((java.lang.Object) attributes4);
        boolean boolean22 = attributes0.hasKeyIgnoreCase(" data-");
        java.lang.Class<?> wildcardClass23 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes0.dataset();
        attributes0.remove("hi!");
        java.lang.Class<?> wildcardClass7 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        boolean boolean7 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        attributes8.removeIgnoreCase("hi!");
        boolean boolean12 = attributes8.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes8.clone();
        attributes0.addAll(attributes8);
        java.lang.String str15 = attributes0.html();
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        attributes0.html(appendable16, outputSettings17);
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        boolean boolean21 = attributes19.hasKey("");
        attributes19.remove("hi!");
        boolean boolean25 = attributes19.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = attributes26.dataset();
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        boolean boolean30 = attributes28.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = attributes28.dataset();
        boolean boolean33 = attributes28.hasKey("data-");
        boolean boolean35 = attributes28.hasKeyIgnoreCase("");
        attributes26.addAll(attributes28);
        boolean boolean37 = attributes19.equals((java.lang.Object) attributes28);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator38 = attributes19.spliterator();
        attributes0.addAll(attributes19);
        // The following exception was thrown during execution in test generation
        try {
            attributes19.put("", " hi!=\"data-\" data-=\"data-\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator38);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        boolean boolean4 = attributes2.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes2.dataset();
        boolean boolean7 = attributes2.hasKey("data-");
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.removeIgnoreCase("hi!");
        boolean boolean14 = attributes10.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes15 = attributes10.clone();
        attributes2.addAll(attributes10);
        attributes2.remove("data-");
        boolean boolean19 = attributes0.equals((java.lang.Object) attributes2);
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        boolean boolean22 = attributes20.hasKey("");
        attributes20.remove("hi!");
        boolean boolean26 = attributes20.hasKeyIgnoreCase("hi!");
        boolean boolean28 = attributes20.hasKey("");
        boolean boolean30 = attributes20.hasKey("hi!");
        boolean boolean31 = attributes2.equals((java.lang.Object) boolean30);
        java.lang.String str32 = attributes2.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor33 = attributes2.iterator();
        java.lang.Class<?> wildcardClass34 = attributeItor33.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(attributeItor33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes0.iterator();
        java.lang.Class<?> wildcardClass7 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        attributes0.put("data-", false);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        boolean boolean7 = attributes5.hasKeyIgnoreCase("");
        java.lang.String str8 = attributes5.toString();
        attributes5.put("hi!", false);
        org.jsoup.nodes.Attributes attributes12 = attributes5.clone();
        java.lang.String str13 = attributes5.html();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = attributes5.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        int int6 = attributes0.size();
        org.jsoup.nodes.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        java.lang.String str7 = attributes5.getIgnoreCase("hi!");
        java.lang.String str9 = attributes5.get("data-");
        java.lang.String str10 = attributes5.html();
        int int11 = attributes5.size();
        java.lang.String str12 = attributes5.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList3 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList6 = attributes0.asList();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator7 = attributeList6.spliterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(attributeList3);
        org.junit.Assert.assertNotNull(attributeList6);
        org.junit.Assert.assertNotNull(attributeSpliterator7);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        attributes0.put("hi!", "data-");
        java.util.List<org.jsoup.nodes.Attribute> attributeList9 = attributes0.asList();
        java.lang.String str11 = attributes0.getIgnoreCase("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator12 = attributes0.spliterator();
        boolean boolean14 = attributes0.equals((java.lang.Object) '#');
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.html(appendable15, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributeSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes0.dataset();
        java.lang.Class<?> wildcardClass8 = strMap7.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        attributes0.put("data-", "hi!");
        java.lang.String str15 = attributes0.html();
        boolean boolean17 = attributes0.hasKeyIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator18 = attributes0.spliterator();
        java.lang.Class<?> wildcardClass19 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " hi!=\"data-\" data-=\"hi!\"" + "'", str15, " hi!=\"data-\" data-=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        boolean boolean4 = attributes2.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes2.dataset();
        boolean boolean7 = attributes2.hasKey("data-");
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.removeIgnoreCase("hi!");
        boolean boolean14 = attributes10.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes15 = attributes10.clone();
        attributes2.addAll(attributes10);
        attributes2.remove("data-");
        boolean boolean19 = attributes0.equals((java.lang.Object) attributes2);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            attributes2.put("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(attributeItor20);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor10 = attributes0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertNotNull(attributeItor10);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes0.iterator();
        boolean boolean9 = attributes0.equals((java.lang.Object) "");
        attributes0.remove(" data-");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        boolean boolean15 = attributes13.hasKey("");
        attributes13.remove("hi!");
        boolean boolean19 = attributes13.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes13.iterator();
        boolean boolean22 = attributes13.equals((java.lang.Object) "");
        attributes13.remove(" data-");
        java.lang.Class<?> wildcardClass25 = attributes13.getClass();
        boolean boolean26 = attributes0.equals((java.lang.Object) wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes0.iterator();
        attributes0.remove(" hi!=\"data-\" data-=\"hi!\"");
        java.util.List<org.jsoup.nodes.Attribute> attributeList6 = attributes0.asList();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertNotNull(attributeList6);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        int int2 = attributes0.size();
        attributes0.put(" hi!=\"data-\"", " hi!=\"data-\" data-=\"data-\"");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes0.dataset();
        attributes0.remove("data-");
        org.jsoup.nodes.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        int int11 = attributes0.size();
        java.lang.String str13 = attributes0.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes14 = attributes0.clone();
        attributes0.put("hi!", "data-");
        boolean boolean19 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attribute attribute20 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes0.asList();
        java.lang.Class<?> wildcardClass8 = attributeList7.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("hi!");
        int int9 = attributes0.size();
        java.lang.String str10 = attributes0.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator11 = attributes0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeSpliterator11);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        boolean boolean7 = attributes0.hasKeyIgnoreCase("");
        boolean boolean9 = attributes0.hasKey("hi!");
        attributes0.put("hi!", " data-");
        java.lang.Class<?> wildcardClass13 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str2 = attributes0.get("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        boolean boolean6 = attributes4.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes4.dataset();
        boolean boolean9 = attributes4.hasKey("data-");
        boolean boolean11 = attributes4.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        attributes12.removeIgnoreCase("hi!");
        boolean boolean16 = attributes12.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes17 = attributes12.clone();
        attributes4.addAll(attributes12);
        attributes4.remove("data-");
        attributes0.addAll(attributes4);
        java.lang.Object obj22 = null;
        boolean boolean23 = attributes0.equals(obj22);
        boolean boolean25 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor26 = attributes0.iterator();
        java.lang.Class<?> wildcardClass27 = attributeItor26.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributeItor26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator11 = attributes0.spliterator();
        org.jsoup.nodes.Attribute attribute12 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeSpliterator11);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        attributes0.put("data-", true);
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.html(appendable11, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        attributes0.put(" hi!=\"data-\" data-=\"hi!\"", false);
        java.lang.Class<?> wildcardClass15 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        attributes0.removeIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        boolean boolean6 = attributes4.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes4.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes4.dataset();
        attributes4.remove("hi!");
        java.lang.String str12 = attributes4.getIgnoreCase("hi!");
        attributes4.removeIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        boolean boolean15 = attributes0.equals((java.lang.Object) attributes4);
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        boolean boolean18 = attributes16.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList19 = attributes16.asList();
        int int20 = attributes16.size();
        boolean boolean21 = attributes4.equals((java.lang.Object) int20);
        int int22 = attributes4.size();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributeList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        java.lang.String str7 = attributes5.getIgnoreCase("hi!");
        java.lang.String str9 = attributes5.get("data-");
        int int10 = attributes5.size();
        attributes5.removeIgnoreCase("hi!");
        attributes5.put("hi!", true);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator16 = attributes5.spliterator();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes5.html(appendable17, outputSettings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator16);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.String str8 = attributes0.get("data-");
        attributes0.put(" data-", false);
        org.jsoup.nodes.Attribute attribute12 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        attributes0.put("data-", "hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList15 = attributes0.asList();
        java.lang.Class<?> wildcardClass16 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes0.iterator();
        boolean boolean5 = attributes0.hasKeyIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        org.jsoup.nodes.Attributes attributes6 = attributes0.clone();
        // The following exception was thrown during execution in test generation
        try {
            attributes6.put("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        attributes0.put("hi!", "data-");
        java.util.List<org.jsoup.nodes.Attribute> attributeList9 = attributes0.asList();
        attributes0.remove("data-");
        org.jsoup.nodes.Attributes attributes12 = attributes0.clone();
        java.lang.Class<?> wildcardClass13 = attributes12.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeList9);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        attributes0.removeIgnoreCase("data-");
        java.lang.String str7 = attributes0.html();
        boolean boolean9 = attributes0.hasKey(" data-");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = attributes0.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        int int11 = attributes0.size();
        java.lang.String str12 = attributes0.html();
        java.lang.String str13 = attributes0.html();
        boolean boolean15 = attributes0.hasKeyIgnoreCase(" data-");
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        attributes0.html(appendable16, outputSettings17);
        boolean boolean20 = attributes0.hasKeyIgnoreCase("");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        attributes0.removeIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        boolean boolean7 = attributes0.hasKeyIgnoreCase("");
        boolean boolean9 = attributes0.hasKey("hi!");
        attributes0.put("hi!", " data-");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        int int4 = attributes0.size();
        attributes0.put("data-", true);
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        boolean boolean10 = attributes8.hasKey("");
        attributes8.remove("hi!");
        boolean boolean14 = attributes8.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes15.dataset();
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        boolean boolean19 = attributes17.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = attributes17.dataset();
        boolean boolean22 = attributes17.hasKey("data-");
        boolean boolean24 = attributes17.hasKeyIgnoreCase("");
        attributes15.addAll(attributes17);
        boolean boolean26 = attributes8.equals((java.lang.Object) attributes17);
        org.jsoup.nodes.Attributes attributes27 = attributes17.clone();
        attributes0.addAll(attributes17);
        java.util.List<org.jsoup.nodes.Attribute> attributeList29 = attributes0.asList();
        org.jsoup.nodes.Attribute attribute30 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(attributeList29);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        attributes0.removeIgnoreCase("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes0.dataset();
        java.lang.Class<?> wildcardClass10 = strMap9.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes0.iterator();
        java.lang.String str8 = attributes0.html();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        boolean boolean7 = attributes5.hasKeyIgnoreCase("");
        java.lang.String str8 = attributes5.toString();
        java.lang.String str9 = attributes5.toString();
        java.lang.String str10 = attributes5.html();
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        boolean boolean13 = attributes11.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes11.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes11.dataset();
        attributes11.remove("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = attributes11.dataset();
        boolean boolean19 = attributes5.equals((java.lang.Object) strMap18);
        org.jsoup.nodes.Attributes attributes20 = attributes5.clone();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator21 = attributes20.spliterator();
        org.jsoup.nodes.Attribute attribute22 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes20.put(attribute22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(attributeSpliterator21);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        attributes0.put("data-", "hi!");
        java.lang.String str16 = attributes0.getIgnoreCase("data-");
        attributes0.put("data-", "data-");
        org.jsoup.nodes.Attributes attributes20 = attributes0.clone();
        java.lang.Class<?> wildcardClass21 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        attributes0.remove("hi!");
        boolean boolean8 = attributes0.hasKeyIgnoreCase(" hi!=\"data-\"");
        org.jsoup.nodes.Attribute attribute9 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        attributes0.html(appendable11, outputSettings12);
        attributes0.remove(" hi!=\"data-\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        attributes0.put("hi!", "data-");
        java.util.List<org.jsoup.nodes.Attribute> attributeList9 = attributes0.asList();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeList9);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        boolean boolean7 = attributes0.hasKeyIgnoreCase("data-");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes0.iterator();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributeItor8);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.String str8 = attributes0.get("data-");
        attributes0.put(" data-", false);
        int int12 = attributes0.size();
        java.lang.Class<?> wildcardClass13 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        boolean boolean11 = attributes9.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = attributes9.dataset();
        boolean boolean14 = attributes9.hasKey("data-");
        boolean boolean16 = attributes9.hasKeyIgnoreCase("");
        attributes7.addAll(attributes9);
        boolean boolean18 = attributes0.equals((java.lang.Object) attributes9);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes0.iterator();
        java.lang.Class<?> wildcardClass20 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributeItor19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        boolean boolean11 = attributes9.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = attributes9.dataset();
        boolean boolean14 = attributes9.hasKey("data-");
        boolean boolean16 = attributes9.hasKeyIgnoreCase("");
        attributes7.addAll(attributes9);
        boolean boolean18 = attributes0.equals((java.lang.Object) attributes9);
        java.lang.String str20 = attributes0.getIgnoreCase(" data-");
        java.lang.Class<?> wildcardClass21 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        int int4 = attributes0.size();
        attributes0.put("data-", true);
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        boolean boolean10 = attributes8.hasKey("");
        attributes8.remove("hi!");
        boolean boolean14 = attributes8.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes15.dataset();
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        boolean boolean19 = attributes17.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = attributes17.dataset();
        boolean boolean22 = attributes17.hasKey("data-");
        boolean boolean24 = attributes17.hasKeyIgnoreCase("");
        attributes15.addAll(attributes17);
        boolean boolean26 = attributes8.equals((java.lang.Object) attributes17);
        org.jsoup.nodes.Attributes attributes27 = attributes17.clone();
        attributes0.addAll(attributes17);
        java.lang.String str29 = attributes0.toString();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + " data-" + "'", str29, " data-");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str2 = attributes0.get("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        boolean boolean6 = attributes4.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes4.dataset();
        boolean boolean9 = attributes4.hasKey("data-");
        boolean boolean11 = attributes4.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        attributes12.removeIgnoreCase("hi!");
        boolean boolean16 = attributes12.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes17 = attributes12.clone();
        attributes4.addAll(attributes12);
        attributes4.remove("data-");
        attributes0.addAll(attributes4);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = attributes0.dataset();
        attributes0.remove("data-");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator11 = attributes0.spliterator();
        boolean boolean13 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList14 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        boolean boolean17 = attributes15.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = attributes15.dataset();
        boolean boolean20 = attributes15.hasKey("data-");
        attributes15.put("hi!", "data-");
        java.util.List<org.jsoup.nodes.Attribute> attributeList24 = attributes15.asList();
        attributes15.remove("data-");
        org.jsoup.nodes.Attributes attributes27 = attributes15.clone();
        attributes0.addAll(attributes27);
        org.jsoup.nodes.Attribute attribute29 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributeList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributeList24);
        org.junit.Assert.assertNotNull(attributes27);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        boolean boolean6 = attributes4.hasKey("");
        attributes4.remove("hi!");
        boolean boolean10 = attributes4.hasKeyIgnoreCase("hi!");
        boolean boolean12 = attributes4.hasKey("");
        attributes4.put("hi!", "data-");
        attributes4.put("data-", "hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList19 = attributes4.asList();
        boolean boolean20 = attributes0.equals((java.lang.Object) attributes4);
        attributes4.put("hi!", true);
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        boolean boolean26 = attributes24.hasKey("");
        attributes24.remove("hi!");
        boolean boolean30 = attributes24.hasKeyIgnoreCase("hi!");
        boolean boolean32 = attributes24.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor33 = attributes24.iterator();
        java.lang.String str34 = attributes24.html();
        java.lang.String str35 = attributes24.html();
        java.lang.Appendable appendable36 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = null;
        attributes24.html(appendable36, outputSettings37);
        boolean boolean40 = attributes24.hasKeyIgnoreCase("hi!");
        attributes4.addAll(attributes24);
        org.jsoup.nodes.Attribute attribute42 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes4.put(attribute42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(attributeItor33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        attributes0.put("hi!", "data-");
        java.util.List<org.jsoup.nodes.Attribute> attributeList9 = attributes0.asList();
        attributes0.remove("data-");
        org.jsoup.nodes.Attributes attributes12 = attributes0.clone();
        java.lang.String str14 = attributes12.get(" data-");
        // The following exception was thrown during execution in test generation
        try {
            attributes12.put("", " hi!=\"data-\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeList9);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        attributes0.html(appendable11, outputSettings12);
        java.lang.String str15 = attributes0.get("hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList16 = attributes0.asList();
        org.jsoup.nodes.Attribute attribute17 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributeList16);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        int int10 = attributes0.size();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", " hi!=\"data-\" data-=\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        attributes5.removeIgnoreCase("hi!");
        boolean boolean9 = attributes5.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor10 = attributes5.iterator();
        boolean boolean12 = attributes5.hasKeyIgnoreCase("data-");
        boolean boolean13 = attributes0.equals((java.lang.Object) boolean12);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributeItor10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes0.iterator();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes0.spliterator();
        java.lang.Class<?> wildcardClass9 = attributeSpliterator8.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.equals((java.lang.Object) (short) -1);
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        attributes0.html(appendable6, outputSettings7);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator9 = attributes0.spliterator();
        boolean boolean11 = attributes0.hasKeyIgnoreCase(" hi!=\"data-\" data-=\"data-\"");
        org.jsoup.nodes.Attribute attribute12 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        int int10 = attributes0.size();
        java.lang.String str12 = attributes0.get("hi!");
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        boolean boolean15 = attributes13.hasKey("");
        attributes13.remove("hi!");
        boolean boolean19 = attributes13.hasKeyIgnoreCase("hi!");
        boolean boolean21 = attributes13.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor22 = attributes13.iterator();
        java.lang.String str23 = attributes13.html();
        java.lang.String str24 = attributes13.html();
        attributes13.remove("data-");
        org.jsoup.nodes.Attributes attributes27 = new org.jsoup.nodes.Attributes();
        attributes27.removeIgnoreCase("hi!");
        boolean boolean31 = attributes27.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor32 = attributes27.iterator();
        boolean boolean34 = attributes27.hasKeyIgnoreCase("data-");
        attributes13.addAll(attributes27);
        org.jsoup.nodes.Attributes attributes36 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap37 = attributes36.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator38 = attributes36.spliterator();
        java.lang.String str39 = attributes36.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList40 = attributes36.asList();
        boolean boolean42 = attributes36.hasKeyIgnoreCase("");
        java.lang.Appendable appendable43 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = null;
        attributes36.html(appendable43, outputSettings44);
        boolean boolean46 = attributes13.equals((java.lang.Object) appendable43);
        boolean boolean48 = attributes13.hasKeyIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        boolean boolean49 = attributes0.equals((java.lang.Object) boolean48);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributeItor22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(attributeItor32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(attributeSpliterator38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(attributeList40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        java.lang.String str10 = attributes0.html();
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        boolean boolean13 = attributes11.hasKey("");
        attributes11.remove("hi!");
        boolean boolean17 = attributes11.hasKeyIgnoreCase("hi!");
        boolean boolean19 = attributes11.hasKey("");
        attributes11.put("hi!", "data-");
        attributes11.put("data-", "hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList26 = attributes11.asList();
        java.lang.String str28 = attributes11.getIgnoreCase("hi!");
        java.lang.String str30 = attributes11.get("data-");
        attributes0.addAll(attributes11);
        java.lang.Appendable appendable32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.html(appendable32, outputSettings33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributeList26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "data-" + "'", str28, "data-");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        boolean boolean10 = attributes8.hasKey("");
        attributes8.remove("hi!");
        boolean boolean14 = attributes8.hasKeyIgnoreCase("hi!");
        boolean boolean16 = attributes8.equals((java.lang.Object) 100L);
        java.lang.String str18 = attributes8.get("hi!");
        attributes8.put("data-", true);
        boolean boolean22 = attributes0.equals((java.lang.Object) true);
        boolean boolean24 = attributes0.hasKey("data-");
        int int25 = attributes0.size();
        attributes0.removeIgnoreCase("data-");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor28 = attributes0.iterator();
        java.lang.Class<?> wildcardClass29 = attributes0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(attributeItor28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes0.dataset();
        attributes0.remove("hi!");
        attributes0.put(" data-", false);
        java.lang.String str11 = attributes0.getIgnoreCase(" hi!=\"data-\"");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        boolean boolean14 = attributes12.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes12.dataset();
        boolean boolean17 = attributes12.hasKey("data-");
        boolean boolean19 = attributes12.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        attributes20.removeIgnoreCase("hi!");
        boolean boolean24 = attributes20.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes25 = attributes20.clone();
        attributes12.addAll(attributes20);
        java.lang.String str27 = attributes12.html();
        java.lang.Appendable appendable28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        attributes12.html(appendable28, outputSettings29);
        org.jsoup.nodes.Attributes attributes31 = new org.jsoup.nodes.Attributes();
        boolean boolean33 = attributes31.hasKey("");
        attributes31.remove("hi!");
        boolean boolean37 = attributes31.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes38 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap39 = attributes38.dataset();
        org.jsoup.nodes.Attributes attributes40 = new org.jsoup.nodes.Attributes();
        boolean boolean42 = attributes40.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap43 = attributes40.dataset();
        boolean boolean45 = attributes40.hasKey("data-");
        boolean boolean47 = attributes40.hasKeyIgnoreCase("");
        attributes38.addAll(attributes40);
        boolean boolean49 = attributes31.equals((java.lang.Object) attributes40);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator50 = attributes31.spliterator();
        attributes12.addAll(attributes31);
        java.util.List<org.jsoup.nodes.Attribute> attributeList52 = attributes12.asList();
        attributes0.addAll(attributes12);
        org.jsoup.nodes.Attributes attributes54 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap55 = attributes54.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator56 = attributes54.spliterator();
        java.lang.String str57 = attributes54.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList58 = attributes54.asList();
        boolean boolean60 = attributes54.hasKeyIgnoreCase("");
        attributes54.removeIgnoreCase("hi!");
        boolean boolean63 = attributes12.equals((java.lang.Object) attributes54);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor64 = attributes12.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator50);
        org.junit.Assert.assertNotNull(attributeList52);
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertNotNull(attributeSpliterator56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(attributeList58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(attributeItor64);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        boolean boolean11 = attributes9.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = attributes9.dataset();
        boolean boolean14 = attributes9.hasKey("data-");
        boolean boolean16 = attributes9.hasKeyIgnoreCase("");
        attributes7.addAll(attributes9);
        boolean boolean18 = attributes0.equals((java.lang.Object) attributes9);
        org.jsoup.nodes.Attributes attributes19 = attributes9.clone();
        attributes9.removeIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        attributes9.html(appendable22, outputSettings23);
        java.lang.String str25 = attributes9.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        boolean boolean4 = attributes2.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes2.dataset();
        boolean boolean7 = attributes2.hasKey("data-");
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.removeIgnoreCase("hi!");
        boolean boolean14 = attributes10.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes15 = attributes10.clone();
        attributes2.addAll(attributes10);
        attributes2.remove("data-");
        boolean boolean19 = attributes0.equals((java.lang.Object) attributes2);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = attributes2.dataset();
        java.lang.String str22 = attributes2.getIgnoreCase(" hi!=\"data-\"");
        org.jsoup.nodes.Attribute attribute23 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes2.put(attribute23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        java.lang.String str7 = attributes5.getIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes8 = attributes5.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList9 = attributes5.asList();
        attributes5.put("data-", false);
        java.lang.String str14 = attributes5.getIgnoreCase(" data-");
        org.jsoup.nodes.Attributes attributes15 = attributes5.clone();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes5.dataset();
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        boolean boolean19 = attributes17.hasKey("");
        attributes17.remove("hi!");
        boolean boolean23 = attributes17.hasKeyIgnoreCase("hi!");
        boolean boolean25 = attributes17.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor26 = attributes17.iterator();
        java.lang.String str27 = attributes17.html();
        java.lang.String str28 = attributes17.html();
        java.lang.Appendable appendable29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = null;
        attributes17.html(appendable29, outputSettings30);
        boolean boolean33 = attributes17.hasKeyIgnoreCase("hi!");
        boolean boolean34 = attributes5.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(attributeList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributeItor26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator11 = attributes0.spliterator();
        java.lang.String str13 = attributes0.getIgnoreCase("data-");
        java.util.List<org.jsoup.nodes.Attribute> attributeList14 = attributes0.asList();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator15 = attributeList14.spliterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeSpliterator11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributeList14);
        org.junit.Assert.assertNotNull(attributeSpliterator15);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        boolean boolean4 = attributes2.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes2.dataset();
        boolean boolean7 = attributes2.hasKey("data-");
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.removeIgnoreCase("hi!");
        boolean boolean14 = attributes10.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes15 = attributes10.clone();
        attributes2.addAll(attributes10);
        attributes2.remove("data-");
        boolean boolean19 = attributes0.equals((java.lang.Object) attributes2);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes2.iterator();
        attributes2.remove("hi!");
        java.lang.String str23 = attributes2.html();
        java.lang.Class<?> wildcardClass24 = attributes2.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        attributes0.html(appendable7, outputSettings8);
        int int10 = attributes0.size();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes0.iterator();
        boolean boolean9 = attributes0.equals((java.lang.Object) "");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes10.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator12 = attributes10.spliterator();
        java.lang.String str13 = attributes10.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList14 = attributes10.asList();
        attributes10.removeIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes10.iterator();
        java.lang.String str18 = attributes10.html();
        boolean boolean20 = attributes10.hasKeyIgnoreCase("");
        boolean boolean21 = attributes0.equals((java.lang.Object) "");
        org.jsoup.nodes.Attribute attribute22 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(attributeSpliterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributeList14);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        attributes0.put("data-", true);
        java.util.List<org.jsoup.nodes.Attribute> attributeList11 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes12 = attributes0.clone();
        org.jsoup.nodes.Attribute attribute13 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes12.put(attribute13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributeList11);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        boolean boolean4 = attributes2.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes2.dataset();
        boolean boolean7 = attributes2.hasKey("data-");
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        attributes0.addAll(attributes2);
        int int11 = attributes2.size();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        boolean boolean14 = attributes12.hasKey("");
        attributes12.remove("hi!");
        boolean boolean18 = attributes12.hasKeyIgnoreCase("hi!");
        attributes2.addAll(attributes12);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = attributes12.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = attributes12.dataset();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        int int11 = attributes0.size();
        java.lang.String str13 = attributes0.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes14 = attributes0.clone();
        attributes0.put("hi!", "data-");
        java.lang.String str19 = attributes0.get("data-");
        java.lang.Class<?> wildcardClass20 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        attributes0.put("data-", "hi!");
        java.lang.String str16 = attributes0.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        boolean boolean19 = attributes17.hasKey("");
        attributes17.remove("hi!");
        attributes17.remove("hi!");
        boolean boolean24 = attributes0.equals((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        boolean boolean7 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        attributes8.removeIgnoreCase("hi!");
        boolean boolean12 = attributes8.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes8.clone();
        attributes0.addAll(attributes8);
        attributes0.remove("data-");
        attributes0.put("data-", true);
        boolean boolean21 = attributes0.hasKeyIgnoreCase("");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator22 = attributes0.spliterator();
        java.util.Map<java.lang.String, java.lang.String> strMap23 = attributes0.dataset();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator22);
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        int int11 = attributes0.size();
        java.lang.String str13 = attributes0.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes14 = attributes0.clone();
        attributes0.put("hi!", "data-");
        boolean boolean19 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.String str20 = attributes0.toString();
        boolean boolean22 = attributes0.equals((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " hi!=\"data-\"" + "'", str20, " hi!=\"data-\"");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        int int11 = attributes0.size();
        java.lang.String str13 = attributes0.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes14 = attributes0.clone();
        attributes0.put("hi!", "data-");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes0.iterator();
        java.lang.String str20 = attributes0.getIgnoreCase(" data-");
        java.lang.String str22 = attributes0.get(" hi!=\"data-\" data-=\"hi!\"");
        java.lang.Class<?> wildcardClass23 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(attributeItor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        attributes0.html(appendable11, outputSettings12);
        java.lang.String str14 = attributes0.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator15 = attributes0.spliterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes0.iterator();
        attributes0.put("data-", true);
        boolean boolean21 = attributes0.hasKeyIgnoreCase("data-");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor22 = attributes0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributeSpliterator15);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(attributeItor22);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        attributes0.removeIgnoreCase("data-");
        java.lang.String str7 = attributes0.html();
        java.lang.Class<?> wildcardClass8 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        int int11 = attributes0.size();
        java.lang.String str13 = attributes0.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes14 = attributes0.clone();
        attributes0.put("hi!", "data-");
        boolean boolean19 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean21 = attributes0.hasKeyIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        boolean boolean7 = attributes5.hasKeyIgnoreCase("");
        java.lang.String str8 = attributes5.toString();
        java.lang.String str9 = attributes5.toString();
        boolean boolean11 = attributes5.hasKey("hi!");
        int int12 = attributes5.size();
        boolean boolean14 = attributes5.hasKeyIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        org.jsoup.nodes.Attribute attribute15 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes5.put(attribute15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes7.iterator();
        // The following exception was thrown during execution in test generation
        try {
            attributes7.put("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(attributeItor9);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        attributes0.removeIgnoreCase("hi!");
        org.jsoup.nodes.Attribute attribute9 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes0.iterator();
        java.lang.String str8 = attributes0.html();
        boolean boolean10 = attributes0.hasKeyIgnoreCase("");
        java.lang.String str12 = attributes0.getIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        boolean boolean14 = attributes0.hasKey(" hi!=\"data-\" data-=\"data-\"");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.String str7 = attributes0.toString();
        java.lang.String str8 = attributes0.html();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        int int2 = attributes0.size();
        java.lang.Class<?> wildcardClass3 = attributes0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        int int6 = attributes0.size();
        java.lang.String str7 = attributes0.html();
        attributes0.put("data-", "");
        attributes0.remove("hi!");
        attributes0.remove(" data-");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        boolean boolean4 = attributes2.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes2.dataset();
        boolean boolean7 = attributes2.hasKey("data-");
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        attributes0.addAll(attributes2);
        int int11 = attributes2.size();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        boolean boolean14 = attributes12.hasKey("");
        attributes12.remove("hi!");
        boolean boolean18 = attributes12.hasKeyIgnoreCase("hi!");
        attributes2.addAll(attributes12);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = attributes12.dataset();
        java.lang.Class<?> wildcardClass21 = attributes12.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        attributes0.put("data-", "hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList15 = attributes0.asList();
        java.lang.String str17 = attributes0.getIgnoreCase("hi!");
        java.lang.String str19 = attributes0.get("data-");
        org.jsoup.nodes.Attribute attribute20 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "data-" + "'", str17, "data-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str2 = attributes0.get("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.lang.String str6 = attributes4.get("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes4.dataset();
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        boolean boolean10 = attributes8.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes8.dataset();
        boolean boolean13 = attributes8.hasKey("data-");
        boolean boolean15 = attributes8.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        attributes16.removeIgnoreCase("hi!");
        boolean boolean20 = attributes16.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes21 = attributes16.clone();
        attributes8.addAll(attributes16);
        attributes8.remove("data-");
        attributes4.addAll(attributes8);
        java.lang.String str27 = attributes8.getIgnoreCase("hi!");
        boolean boolean28 = attributes0.equals((java.lang.Object) attributes8);
        org.jsoup.nodes.Attributes attributes29 = attributes8.clone();
        java.lang.String str30 = attributes29.html();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator7 = attributes0.spliterator();
        java.lang.Class<?> wildcardClass8 = attributeSpliterator7.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(attributeSpliterator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        int int10 = attributes0.size();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes0.iterator();
        org.jsoup.nodes.Attribute attribute13 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertNotNull(attributeItor12);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        attributes0.removeIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        boolean boolean6 = attributes4.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes4.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes4.dataset();
        attributes4.remove("hi!");
        java.lang.String str12 = attributes4.getIgnoreCase("hi!");
        attributes4.removeIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        boolean boolean15 = attributes0.equals((java.lang.Object) attributes4);
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        boolean boolean18 = attributes16.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList19 = attributes16.asList();
        int int20 = attributes16.size();
        boolean boolean21 = attributes4.equals((java.lang.Object) int20);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = attributes4.dataset();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor23 = attributes4.iterator();
        attributes4.put("hi!", " hi!=\"data-\" data-=\"data-\"");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributeList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(attributeItor23);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        boolean boolean7 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        attributes8.removeIgnoreCase("hi!");
        boolean boolean12 = attributes8.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes8.clone();
        attributes0.addAll(attributes8);
        java.lang.String str15 = attributes0.html();
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        attributes0.html(appendable16, outputSettings17);
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        boolean boolean21 = attributes19.hasKey("");
        attributes19.remove("hi!");
        boolean boolean25 = attributes19.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = attributes26.dataset();
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        boolean boolean30 = attributes28.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = attributes28.dataset();
        boolean boolean33 = attributes28.hasKey("data-");
        boolean boolean35 = attributes28.hasKeyIgnoreCase("");
        attributes26.addAll(attributes28);
        boolean boolean37 = attributes19.equals((java.lang.Object) attributes28);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator38 = attributes19.spliterator();
        attributes0.addAll(attributes19);
        java.lang.String str41 = attributes0.get("data-");
        java.util.Map<java.lang.String, java.lang.String> strMap42 = attributes0.dataset();
        java.lang.Class<?> wildcardClass43 = strMap42.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        int int6 = attributes0.size();
        java.lang.String str7 = attributes0.html();
        attributes0.put("data-", "");
        attributes0.remove("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes0.dataset();
        org.jsoup.nodes.Attribute attribute14 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        boolean boolean12 = attributes10.hasKey("");
        attributes10.remove("hi!");
        boolean boolean16 = attributes10.hasKeyIgnoreCase("hi!");
        boolean boolean18 = attributes10.hasKey("");
        attributes10.put("hi!", "data-");
        java.lang.String str23 = attributes10.get("data-");
        boolean boolean24 = attributes0.equals((java.lang.Object) "data-");
        org.jsoup.nodes.Attribute attribute25 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        attributes0.html(appendable11, outputSettings12);
        java.lang.String str14 = attributes0.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator15 = attributes0.spliterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes0.iterator();
        attributes0.put("data-", true);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes0.iterator();
        java.lang.Class<?> wildcardClass21 = attributeItor20.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributeSpliterator15);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        java.lang.String str10 = attributes0.html();
        java.lang.String str11 = attributes0.html();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        attributes0.html(appendable12, outputSettings13);
        boolean boolean16 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        attributes17.removeIgnoreCase("hi!");
        boolean boolean21 = attributes17.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes22 = attributes17.clone();
        boolean boolean24 = attributes22.hasKeyIgnoreCase("");
        java.lang.String str25 = attributes22.toString();
        attributes22.put("hi!", false);
        org.jsoup.nodes.Attributes attributes29 = attributes22.clone();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = attributes29.dataset();
        attributes0.addAll(attributes29);
        org.jsoup.nodes.Attribute attribute32 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(strMap30);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        attributes0.put("data-", true);
        java.util.List<org.jsoup.nodes.Attribute> attributeList11 = attributes0.asList();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributeList11);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        int int11 = attributes0.size();
        java.lang.String str13 = attributes0.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes14 = attributes0.clone();
        attributes0.put("hi!", "data-");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes0.iterator();
        java.lang.String str20 = attributes0.getIgnoreCase(" data-");
        java.lang.String str22 = attributes0.get(" hi!=\"data-\" data-=\"hi!\"");
        org.jsoup.nodes.Attributes attributes23 = attributes0.clone();
        java.lang.String str24 = attributes23.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(attributeItor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " hi!=\"data-\"" + "'", str24, " hi!=\"data-\"");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        attributes0.put("data-", "hi!");
        java.lang.String str15 = attributes0.html();
        boolean boolean17 = attributes0.hasKeyIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator18 = attributes0.spliterator();
        java.util.List<org.jsoup.nodes.Attribute> attributeList19 = attributes0.asList();
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.html(appendable20, outputSettings21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " hi!=\"data-\" data-=\"hi!\"" + "'", str15, " hi!=\"data-\" data-=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator18);
        org.junit.Assert.assertNotNull(attributeList19);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        boolean boolean7 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        boolean boolean10 = attributes8.hasKey("");
        attributes8.remove("hi!");
        boolean boolean14 = attributes8.hasKeyIgnoreCase("hi!");
        boolean boolean16 = attributes8.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes8.iterator();
        attributes8.put("data-", false);
        java.util.Map<java.lang.String, java.lang.String> strMap21 = attributes8.dataset();
        boolean boolean22 = attributes0.equals((java.lang.Object) strMap21);
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = attributes0.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertNotNull(attributeItor3);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        int int2 = attributes0.size();
        int int3 = attributes0.size();
        java.lang.Class<?> wildcardClass4 = attributes0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        attributes0.removeIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        boolean boolean6 = attributes4.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes4.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes4.dataset();
        attributes4.remove("hi!");
        java.lang.String str12 = attributes4.getIgnoreCase("hi!");
        attributes4.removeIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        boolean boolean15 = attributes0.equals((java.lang.Object) attributes4);
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        boolean boolean7 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        attributes8.removeIgnoreCase("hi!");
        boolean boolean12 = attributes8.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes8.clone();
        attributes0.addAll(attributes8);
        attributes0.remove("data-");
        attributes0.put("data-", true);
        boolean boolean21 = attributes0.hasKeyIgnoreCase("");
        boolean boolean23 = attributes0.hasKeyIgnoreCase(" data-");
        java.lang.String str25 = attributes0.get("data-");
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        attributes26.removeIgnoreCase("hi!");
        boolean boolean30 = attributes26.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes31 = attributes26.clone();
        boolean boolean33 = attributes31.hasKeyIgnoreCase("");
        java.lang.String str34 = attributes31.toString();
        java.lang.String str35 = attributes31.toString();
        java.lang.String str36 = attributes31.html();
        attributes0.addAll(attributes31);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator38 = attributes0.spliterator();
        java.lang.String str39 = attributes0.html();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(attributeSpliterator38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + " data-" + "'", str39, " data-");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        java.lang.String str9 = attributes7.get("data-");
        java.lang.String str10 = attributes7.html();
        org.jsoup.nodes.Attribute attribute11 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes7.put(attribute11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.util.List<org.jsoup.nodes.Attribute> attributeList3 = attributes0.asList();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator4 = attributeList3.spliterator();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertNotNull(attributeList3);
        org.junit.Assert.assertNotNull(attributeSpliterator4);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        java.lang.String str10 = attributes0.html();
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        boolean boolean13 = attributes11.hasKey("");
        attributes11.remove("hi!");
        boolean boolean17 = attributes11.hasKeyIgnoreCase("hi!");
        boolean boolean19 = attributes11.hasKey("");
        attributes11.put("hi!", "data-");
        attributes11.put("data-", "hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList26 = attributes11.asList();
        java.lang.String str28 = attributes11.getIgnoreCase("hi!");
        java.lang.String str30 = attributes11.get("data-");
        attributes0.addAll(attributes11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = attributes11.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributeList26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "data-" + "'", str28, "data-");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        boolean boolean4 = attributes2.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes2.dataset();
        boolean boolean7 = attributes2.hasKey("data-");
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.removeIgnoreCase("hi!");
        boolean boolean14 = attributes10.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes15 = attributes10.clone();
        attributes2.addAll(attributes10);
        attributes2.remove("data-");
        boolean boolean19 = attributes0.equals((java.lang.Object) attributes2);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = attributes2.dataset();
        java.lang.String str22 = attributes2.getIgnoreCase(" hi!=\"data-\"");
        java.lang.String str23 = attributes2.toString();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        java.lang.String str7 = attributes5.getIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes5.iterator();
        int int9 = attributes5.size();
        attributes5.removeIgnoreCase("data-");
        attributes5.remove(" hi!=\"data-\" data-=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributeItor8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        attributes0.html(appendable7, outputSettings8);
        org.jsoup.nodes.Attribute attribute10 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        int int10 = attributes0.size();
        attributes0.remove("data-");
        org.jsoup.nodes.Attribute attribute13 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        boolean boolean7 = attributes5.hasKeyIgnoreCase("");
        java.lang.String str8 = attributes5.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator9 = attributes5.spliterator();
        attributes5.removeIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes12 = attributes5.clone();
        java.lang.Class<?> wildcardClass13 = attributes12.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributeSpliterator9);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList3 = attributes0.asList();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = attributes0.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeList3);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        java.lang.String str7 = attributes5.getIgnoreCase("hi!");
        java.lang.String str9 = attributes5.get("data-");
        int int10 = attributes5.size();
        java.lang.String str12 = attributes5.get(" hi!=\"data-\" data-=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        java.lang.String str7 = attributes5.getIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes5.iterator();
        int int9 = attributes5.size();
        attributes5.removeIgnoreCase("data-");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = attributes5.dataset();
        java.lang.Class<?> wildcardClass13 = attributes5.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributeItor8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        boolean boolean7 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        boolean boolean10 = attributes8.hasKey("");
        attributes8.remove("hi!");
        boolean boolean14 = attributes8.hasKeyIgnoreCase("hi!");
        boolean boolean16 = attributes8.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes8.iterator();
        attributes8.put("data-", false);
        java.util.Map<java.lang.String, java.lang.String> strMap21 = attributes8.dataset();
        boolean boolean22 = attributes0.equals((java.lang.Object) strMap21);
        java.lang.Class<?> wildcardClass23 = strMap21.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        boolean boolean7 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        attributes8.removeIgnoreCase("hi!");
        boolean boolean12 = attributes8.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes8.clone();
        attributes0.addAll(attributes8);
        attributes0.put(" data-", false);
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        attributes0.html(appendable7, outputSettings8);
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        boolean boolean12 = attributes10.hasKey("");
        attributes10.remove("hi!");
        boolean boolean16 = attributes10.hasKeyIgnoreCase("hi!");
        boolean boolean18 = attributes10.equals((java.lang.Object) 100L);
        java.lang.String str20 = attributes10.get("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator21 = attributes10.spliterator();
        boolean boolean23 = attributes10.hasKeyIgnoreCase("hi!");
        attributes0.addAll(attributes10);
        java.lang.String str26 = attributes10.getIgnoreCase("data-");
        boolean boolean28 = attributes10.hasKey("");
        org.jsoup.nodes.Attribute attribute29 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes10.put(attribute29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributeSpliterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        attributes0.remove("hi!");
        java.lang.Class<?> wildcardClass7 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor4 = attributes0.iterator();
        attributes0.put(" hi!=\"data-\" data-=\"data-\"", " hi!=\"data-\"");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes0.spliterator();
        int int9 = attributes0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = attributes0.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeItor4);
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes0.iterator();
        int int7 = attributes0.size();
        java.lang.Class<?> wildcardClass8 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        java.lang.String str10 = attributes0.html();
        java.lang.String str11 = attributes0.html();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        attributes0.html(appendable12, outputSettings13);
        boolean boolean16 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes0.iterator();
        java.lang.Class<?> wildcardClass18 = attributeItor17.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator11 = attributes0.spliterator();
        boolean boolean13 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator14 = attributes0.spliterator();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes0.dataset();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", "data-");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        boolean boolean4 = attributes2.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes2.dataset();
        boolean boolean7 = attributes2.hasKey("data-");
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.removeIgnoreCase("hi!");
        boolean boolean14 = attributes10.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes15 = attributes10.clone();
        attributes2.addAll(attributes10);
        attributes2.remove("data-");
        boolean boolean19 = attributes0.equals((java.lang.Object) attributes2);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = attributes2.dataset();
        attributes2.remove(" hi!=\"data-\"");
        // The following exception was thrown during execution in test generation
        try {
            attributes2.put("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        int int4 = attributes0.size();
        attributes0.put("data-", true);
        org.jsoup.nodes.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        boolean boolean4 = attributes2.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes2.dataset();
        boolean boolean7 = attributes2.hasKey("data-");
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        attributes0.addAll(attributes2);
        int int11 = attributes2.size();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        boolean boolean14 = attributes12.hasKey("");
        attributes12.remove("hi!");
        boolean boolean18 = attributes12.hasKeyIgnoreCase("hi!");
        attributes2.addAll(attributes12);
        java.lang.String str20 = attributes12.toString();
        attributes12.removeIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        attributes23.removeIgnoreCase("hi!");
        boolean boolean27 = attributes23.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes28 = attributes23.clone();
        boolean boolean30 = attributes28.hasKeyIgnoreCase("");
        java.lang.String str31 = attributes28.toString();
        java.lang.String str32 = attributes28.toString();
        java.lang.String str33 = attributes28.html();
        org.jsoup.nodes.Attributes attributes34 = new org.jsoup.nodes.Attributes();
        boolean boolean36 = attributes34.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap37 = attributes34.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap38 = attributes34.dataset();
        attributes34.remove("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap41 = attributes34.dataset();
        boolean boolean42 = attributes28.equals((java.lang.Object) strMap41);
        org.jsoup.nodes.Attributes attributes43 = attributes28.clone();
        org.jsoup.nodes.Attributes attributes44 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap45 = attributes44.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator46 = attributes44.spliterator();
        java.lang.String str47 = attributes44.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList48 = attributes44.asList();
        boolean boolean49 = attributes28.equals((java.lang.Object) attributes44);
        attributes12.addAll(attributes28);
        org.jsoup.nodes.Attribute attribute51 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes12.put(attribute51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNotNull(attributeSpliterator46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(attributeList48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        boolean boolean7 = attributes0.hasKey("hi!");
        java.lang.String str8 = attributes0.toString();
        org.jsoup.nodes.Attributes attributes9 = attributes0.clone();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = attributes0.dataset();
        org.jsoup.nodes.Attribute attribute11 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        java.lang.String str10 = attributes0.html();
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        boolean boolean13 = attributes11.hasKey("");
        attributes11.remove("hi!");
        boolean boolean17 = attributes11.hasKeyIgnoreCase("hi!");
        boolean boolean19 = attributes11.hasKey("");
        attributes11.put("hi!", "data-");
        attributes11.put("data-", "hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList26 = attributes11.asList();
        java.lang.String str28 = attributes11.getIgnoreCase("hi!");
        java.lang.String str30 = attributes11.get("data-");
        attributes0.addAll(attributes11);
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributeList26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "data-" + "'", str28, "data-");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        java.lang.String str13 = attributes0.get("data-");
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        attributes14.removeIgnoreCase("hi!");
        boolean boolean18 = attributes14.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes19 = attributes14.clone();
        java.lang.String str21 = attributes19.getIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor22 = attributes19.iterator();
        int int23 = attributes19.size();
        attributes0.addAll(attributes19);
        java.lang.String str26 = attributes19.get(" hi!=\"data-\" data-=\"hi!\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = attributes19.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributeItor22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        int int11 = attributes0.size();
        java.lang.String str12 = attributes0.html();
        java.lang.String str13 = attributes0.html();
        boolean boolean15 = attributes0.hasKeyIgnoreCase(" data-");
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        attributes0.html(appendable16, outputSettings17);
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator10 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        java.lang.String str13 = attributes11.get("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes11.dataset();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        boolean boolean17 = attributes15.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = attributes15.dataset();
        boolean boolean20 = attributes15.hasKey("data-");
        boolean boolean22 = attributes15.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        attributes23.removeIgnoreCase("hi!");
        boolean boolean27 = attributes23.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes28 = attributes23.clone();
        attributes15.addAll(attributes23);
        attributes15.remove("data-");
        attributes11.addAll(attributes15);
        attributes15.put(" hi!=\"data-\" data-=\"data-\"", "");
        attributes0.addAll(attributes15);
        org.jsoup.nodes.Attributes attributes37 = new org.jsoup.nodes.Attributes();
        attributes37.removeIgnoreCase("hi!");
        boolean boolean41 = attributes37.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes42 = attributes37.clone();
        java.lang.String str44 = attributes42.getIgnoreCase("hi!");
        java.lang.String str46 = attributes42.get("data-");
        int int47 = attributes42.size();
        attributes42.removeIgnoreCase("hi!");
        attributes42.put(" hi!=\"data-\"", " hi!=\"data-\"");
        attributes15.addAll(attributes42);
        attributes42.put(" data-", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertNotNull(attributeSpliterator10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.equals((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList6 = attributes0.asList();
        attributes0.put(" hi!=\"data-\"", true);
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeList6);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        attributes0.put("data-", true);
        java.lang.String str11 = attributes0.html();
        attributes0.removeIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        boolean boolean15 = attributes0.hasKeyIgnoreCase(" data-");
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.html(appendable16, outputSettings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " data-" + "'", str11, " data-");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        boolean boolean7 = attributes5.hasKeyIgnoreCase("");
        attributes5.put(" data-", true);
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = attributes11.dataset();
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        boolean boolean15 = attributes13.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes13.dataset();
        boolean boolean18 = attributes13.hasKey("data-");
        boolean boolean20 = attributes13.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        attributes21.removeIgnoreCase("hi!");
        boolean boolean25 = attributes21.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes26 = attributes21.clone();
        attributes13.addAll(attributes21);
        attributes13.remove("data-");
        boolean boolean30 = attributes11.equals((java.lang.Object) attributes13);
        java.lang.Appendable appendable31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        attributes11.html(appendable31, outputSettings32);
        org.jsoup.nodes.Attributes attributes34 = attributes11.clone();
        boolean boolean35 = attributes5.equals((java.lang.Object) attributes34);
        attributes5.removeIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        boolean boolean39 = attributes5.hasKeyIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        boolean boolean41 = attributes5.hasKey(" hi!=\"data-\" data-=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        boolean boolean9 = attributes7.hasKey("");
        attributes7.remove("hi!");
        boolean boolean13 = attributes7.hasKeyIgnoreCase("hi!");
        boolean boolean15 = attributes7.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes7.iterator();
        int int17 = attributes7.size();
        attributes7.remove("data-");
        attributes0.addAll(attributes7);
        attributes0.put(" hi!=\"data-\" data-=\"data-\"", false);
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        boolean boolean26 = attributes24.hasKey("");
        attributes24.remove("hi!");
        boolean boolean30 = attributes24.hasKeyIgnoreCase("hi!");
        boolean boolean32 = attributes24.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor33 = attributes24.iterator();
        java.lang.String str34 = attributes24.html();
        java.lang.String str35 = attributes24.html();
        attributes0.addAll(attributes24);
        java.lang.Class<?> wildcardClass37 = attributes24.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(attributeItor33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        attributes0.put("data-", "hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList15 = attributes0.asList();
        java.lang.String str17 = attributes0.getIgnoreCase("hi!");
        java.lang.String str19 = attributes0.get("data-");
        attributes0.remove("data-");
        java.lang.String str23 = attributes0.getIgnoreCase(" data-");
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.html(appendable24, outputSettings25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "data-" + "'", str17, "data-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        java.lang.String str8 = attributes0.get("data-");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        boolean boolean4 = attributes2.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes2.dataset();
        boolean boolean7 = attributes2.hasKey("data-");
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.removeIgnoreCase("hi!");
        boolean boolean14 = attributes10.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes15 = attributes10.clone();
        attributes2.addAll(attributes10);
        attributes2.remove("data-");
        boolean boolean19 = attributes0.equals((java.lang.Object) attributes2);
        java.util.List<org.jsoup.nodes.Attribute> attributeList20 = attributes0.asList();
        java.lang.String str21 = attributes0.toString();
        java.lang.String str22 = attributes0.html();
        java.lang.Class<?> wildcardClass23 = attributes0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(attributeList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        attributes0.put("hi!", "data-");
        java.util.List<org.jsoup.nodes.Attribute> attributeList9 = attributes0.asList();
        attributes0.remove("data-");
        org.jsoup.nodes.Attributes attributes12 = attributes0.clone();
        java.lang.String str14 = attributes12.get(" hi!=\"data-\" data-=\"data-\"");
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes12.html(appendable15, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeList9);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        boolean boolean7 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        attributes8.removeIgnoreCase("hi!");
        boolean boolean12 = attributes8.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes8.clone();
        attributes0.addAll(attributes8);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes8.iterator();
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        attributes8.html(appendable16, outputSettings17);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = attributes8.dataset();
        attributes8.put(" hi!=\"data-\" data-=\"data-\"", " hi!=\"data-\" data-=\"data-\"=\"data-\"");
        java.util.List<org.jsoup.nodes.Attribute> attributeList23 = attributes8.asList();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributeItor15);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(attributeList23);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        attributes0.html(appendable11, outputSettings12);
        java.lang.String str15 = attributes0.get("hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList16 = attributes0.asList();
        java.lang.Class<?> wildcardClass17 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributeList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes0.dataset();
        attributes0.remove("hi!");
        attributes0.put(" data-", false);
        java.lang.String str11 = attributes0.getIgnoreCase(" hi!=\"data-\"");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        boolean boolean14 = attributes12.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes12.dataset();
        boolean boolean17 = attributes12.hasKey("data-");
        boolean boolean19 = attributes12.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        attributes20.removeIgnoreCase("hi!");
        boolean boolean24 = attributes20.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes25 = attributes20.clone();
        attributes12.addAll(attributes20);
        java.lang.String str27 = attributes12.html();
        java.lang.Appendable appendable28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        attributes12.html(appendable28, outputSettings29);
        org.jsoup.nodes.Attributes attributes31 = new org.jsoup.nodes.Attributes();
        boolean boolean33 = attributes31.hasKey("");
        attributes31.remove("hi!");
        boolean boolean37 = attributes31.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes38 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap39 = attributes38.dataset();
        org.jsoup.nodes.Attributes attributes40 = new org.jsoup.nodes.Attributes();
        boolean boolean42 = attributes40.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap43 = attributes40.dataset();
        boolean boolean45 = attributes40.hasKey("data-");
        boolean boolean47 = attributes40.hasKeyIgnoreCase("");
        attributes38.addAll(attributes40);
        boolean boolean49 = attributes31.equals((java.lang.Object) attributes40);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator50 = attributes31.spliterator();
        attributes12.addAll(attributes31);
        java.util.List<org.jsoup.nodes.Attribute> attributeList52 = attributes12.asList();
        attributes0.addAll(attributes12);
        boolean boolean55 = attributes0.hasKey(" hi!=\"data-\" data-=\"hi!\"");
        boolean boolean57 = attributes0.hasKeyIgnoreCase(" data-");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator50);
        org.junit.Assert.assertNotNull(attributeList52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        boolean boolean11 = attributes9.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = attributes9.dataset();
        boolean boolean14 = attributes9.hasKey("data-");
        boolean boolean16 = attributes9.hasKeyIgnoreCase("");
        attributes7.addAll(attributes9);
        boolean boolean18 = attributes0.equals((java.lang.Object) attributes9);
        org.jsoup.nodes.Attributes attributes19 = attributes9.clone();
        attributes9.removeIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator22 = attributes9.spliterator();
        boolean boolean24 = attributes9.hasKeyIgnoreCase(" data-");
        attributes9.put(" hi!=\"data-\" data-=\"hi!\"", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributeSpliterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        attributes0.put("data-", "hi!");
        java.lang.String str15 = attributes0.html();
        boolean boolean17 = attributes0.hasKeyIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        boolean boolean19 = attributes0.hasKeyIgnoreCase("");
        boolean boolean21 = attributes0.hasKey("");
        attributes0.put("data-", "hi!");
        org.jsoup.nodes.Attribute attribute25 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " hi!=\"data-\" data-=\"hi!\"" + "'", str15, " hi!=\"data-\" data-=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        int int11 = attributes0.size();
        java.lang.String str13 = attributes0.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes14 = attributes0.clone();
        boolean boolean16 = attributes14.hasKeyIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        java.lang.Class<?> wildcardClass17 = attributes14.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        boolean boolean7 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        attributes8.removeIgnoreCase("hi!");
        boolean boolean12 = attributes8.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes8.clone();
        attributes0.addAll(attributes8);
        attributes0.remove("data-");
        attributes0.put("data-", true);
        boolean boolean21 = attributes0.hasKeyIgnoreCase("");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator22 = attributes0.spliterator();
        java.lang.Class<?> wildcardClass23 = attributeSpliterator22.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        java.lang.String str10 = attributes0.html();
        java.lang.String str11 = attributes0.html();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        attributes0.html(appendable12, outputSettings13);
        boolean boolean16 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean18 = attributes0.hasKeyIgnoreCase("data-");
        java.lang.Class<?> wildcardClass19 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.equals((java.lang.Object) (short) -1);
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        attributes0.html(appendable6, outputSettings7);
        int int9 = attributes0.size();
        int int10 = attributes0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator11 = attributes0.spliterator();
        boolean boolean13 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList14 = attributes0.asList();
        boolean boolean16 = attributes0.equals((java.lang.Object) (-1L));
        org.jsoup.nodes.Attributes attributes17 = attributes0.clone();
        org.jsoup.nodes.Attribute attribute18 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributeList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        attributes0.put("data-", "hi!");
        java.lang.String str15 = attributes0.html();
        boolean boolean17 = attributes0.hasKeyIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        java.lang.String str18 = attributes0.toString();
        org.jsoup.nodes.Attribute attribute19 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " hi!=\"data-\" data-=\"hi!\"" + "'", str15, " hi!=\"data-\" data-=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " hi!=\"data-\" data-=\"hi!\"" + "'", str18, " hi!=\"data-\" data-=\"hi!\"");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        attributes0.put("data-", "hi!");
        java.lang.String str16 = attributes0.getIgnoreCase("data-");
        attributes0.put("data-", "data-");
        org.jsoup.nodes.Attributes attributes20 = attributes0.clone();
        org.jsoup.nodes.Attribute attribute21 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes20.put(attribute21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList3 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList6 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        boolean boolean9 = attributes7.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = attributes7.dataset();
        boolean boolean12 = attributes7.hasKey("data-");
        boolean boolean14 = attributes7.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        attributes15.removeIgnoreCase("hi!");
        boolean boolean19 = attributes15.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes20 = attributes15.clone();
        attributes7.addAll(attributes15);
        java.lang.String str22 = attributes7.html();
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        attributes7.html(appendable23, outputSettings24);
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        boolean boolean28 = attributes26.hasKey("");
        attributes26.remove("hi!");
        boolean boolean32 = attributes26.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes33 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap34 = attributes33.dataset();
        org.jsoup.nodes.Attributes attributes35 = new org.jsoup.nodes.Attributes();
        boolean boolean37 = attributes35.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap38 = attributes35.dataset();
        boolean boolean40 = attributes35.hasKey("data-");
        boolean boolean42 = attributes35.hasKeyIgnoreCase("");
        attributes33.addAll(attributes35);
        boolean boolean44 = attributes26.equals((java.lang.Object) attributes35);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator45 = attributes26.spliterator();
        attributes7.addAll(attributes26);
        java.lang.String str48 = attributes7.get("data-");
        attributes0.addAll(attributes7);
        java.lang.String str50 = attributes7.html();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(attributeList3);
        org.junit.Assert.assertNotNull(attributeList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        java.lang.String str10 = attributes0.html();
        java.lang.String str11 = attributes0.html();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        attributes0.html(appendable12, outputSettings13);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes0.iterator();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes0.dataset();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributeItor15);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        int int11 = attributes0.size();
        boolean boolean13 = attributes0.hasKeyIgnoreCase(" hi!=\"data-\" data-=\"data-\"");
        attributes0.remove(" data-=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        boolean boolean7 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        attributes8.removeIgnoreCase("hi!");
        boolean boolean12 = attributes8.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes8.clone();
        attributes0.addAll(attributes8);
        // The following exception was thrown during execution in test generation
        try {
            attributes8.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        boolean boolean7 = attributes5.hasKeyIgnoreCase("");
        attributes5.put(" data-", true);
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = attributes11.dataset();
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        boolean boolean15 = attributes13.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes13.dataset();
        boolean boolean18 = attributes13.hasKey("data-");
        boolean boolean20 = attributes13.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        attributes21.removeIgnoreCase("hi!");
        boolean boolean25 = attributes21.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes26 = attributes21.clone();
        attributes13.addAll(attributes21);
        attributes13.remove("data-");
        boolean boolean30 = attributes11.equals((java.lang.Object) attributes13);
        java.lang.Appendable appendable31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        attributes11.html(appendable31, outputSettings32);
        org.jsoup.nodes.Attributes attributes34 = attributes11.clone();
        boolean boolean35 = attributes5.equals((java.lang.Object) attributes34);
        attributes5.removeIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        // The following exception was thrown during execution in test generation
        try {
            attributes5.put("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        java.lang.String str7 = attributes0.html();
        attributes0.put(" data-=\"hi!\"", " hi!=\"data-\" data-=\"data-\"");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        java.lang.String str4 = attributes0.toString();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator10 = attributes0.spliterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertNotNull(attributeSpliterator10);
        org.junit.Assert.assertNotNull(attributeItor11);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        boolean boolean6 = attributes4.hasKey("");
        attributes4.remove("hi!");
        boolean boolean10 = attributes4.hasKeyIgnoreCase("hi!");
        boolean boolean12 = attributes4.hasKey("");
        attributes4.put("hi!", "data-");
        attributes4.put("data-", "hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList19 = attributes4.asList();
        boolean boolean20 = attributes0.equals((java.lang.Object) attributes4);
        boolean boolean22 = attributes4.hasKey("");
        org.jsoup.nodes.Attributes attributes23 = attributes4.clone();
        java.lang.Class<?> wildcardClass24 = attributes23.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        boolean boolean10 = attributes8.hasKey("");
        attributes8.remove("hi!");
        boolean boolean14 = attributes8.hasKeyIgnoreCase("hi!");
        boolean boolean16 = attributes8.equals((java.lang.Object) 100L);
        java.lang.String str18 = attributes8.get("hi!");
        attributes8.put("data-", true);
        boolean boolean22 = attributes0.equals((java.lang.Object) true);
        boolean boolean24 = attributes0.hasKey("data-");
        int int25 = attributes0.size();
        attributes0.removeIgnoreCase("data-");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor28 = attributes0.iterator();
        attributes0.put(" hi!=\"data-\" data-=\"data-\"", false);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(attributeItor28);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        java.lang.String str10 = attributes0.html();
        java.lang.String str11 = attributes0.html();
        attributes0.remove("data-");
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        attributes14.removeIgnoreCase("hi!");
        boolean boolean18 = attributes14.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes14.iterator();
        boolean boolean21 = attributes14.hasKeyIgnoreCase("data-");
        attributes0.addAll(attributes14);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator23 = attributes0.spliterator();
        attributes0.put(" hi!=\"data-\" data-=\"data-\"", " data-");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor27 = attributes0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributeItor19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator23);
        org.junit.Assert.assertNotNull(attributeItor27);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        boolean boolean9 = attributes7.hasKey("");
        attributes7.remove("hi!");
        boolean boolean13 = attributes7.hasKeyIgnoreCase("hi!");
        boolean boolean15 = attributes7.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes7.iterator();
        int int17 = attributes7.size();
        attributes7.remove("data-");
        attributes0.addAll(attributes7);
        attributes0.put(" hi!=\"data-\" data-=\"data-\"", false);
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        boolean boolean26 = attributes24.hasKey("");
        attributes24.remove("hi!");
        boolean boolean30 = attributes24.hasKeyIgnoreCase("hi!");
        boolean boolean32 = attributes24.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor33 = attributes24.iterator();
        java.lang.String str34 = attributes24.html();
        java.lang.String str35 = attributes24.html();
        attributes0.addAll(attributes24);
        boolean boolean38 = attributes0.hasKeyIgnoreCase(" data-=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(attributeItor33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        attributes0.removeIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        boolean boolean6 = attributes4.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes4.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes4.dataset();
        attributes4.remove("hi!");
        java.lang.String str12 = attributes4.getIgnoreCase("hi!");
        attributes4.removeIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        boolean boolean15 = attributes0.equals((java.lang.Object) attributes4);
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        boolean boolean18 = attributes16.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList19 = attributes16.asList();
        int int20 = attributes16.size();
        boolean boolean21 = attributes4.equals((java.lang.Object) int20);
        java.lang.String str23 = attributes4.getIgnoreCase(" hi!=\"data-\" data-=\"data-\"");
        // The following exception was thrown during execution in test generation
        try {
            attributes4.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributeList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        attributes0.put("data-", "hi!");
        java.lang.String str15 = attributes0.html();
        boolean boolean17 = attributes0.hasKeyIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        java.lang.String str18 = attributes0.toString();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " hi!=\"data-\" data-=\"hi!\"" + "'", str15, " hi!=\"data-\" data-=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " hi!=\"data-\" data-=\"hi!\"" + "'", str18, " hi!=\"data-\" data-=\"hi!\"");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        boolean boolean4 = attributes2.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes2.dataset();
        boolean boolean7 = attributes2.hasKey("data-");
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.removeIgnoreCase("hi!");
        boolean boolean14 = attributes10.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes15 = attributes10.clone();
        attributes2.addAll(attributes10);
        attributes2.remove("data-");
        boolean boolean19 = attributes0.equals((java.lang.Object) attributes2);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = attributes2.dataset();
        java.lang.String str22 = attributes2.getIgnoreCase(" hi!=\"data-\"");
        attributes2.put(" data-", true);
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        boolean boolean28 = attributes26.hasKey("");
        attributes26.remove("hi!");
        boolean boolean32 = attributes26.hasKeyIgnoreCase("hi!");
        java.lang.String str33 = attributes26.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor34 = attributes26.iterator();
        boolean boolean35 = attributes2.equals((java.lang.Object) attributes26);
        java.lang.String str36 = attributes26.html();
        java.util.Map<java.lang.String, java.lang.String> strMap37 = attributes26.dataset();
        org.jsoup.nodes.Attributes attributes38 = attributes26.clone();
        org.jsoup.nodes.Attribute attribute39 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes26.put(attribute39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(attributeItor34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(attributes38);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        attributes0.put("data-", "hi!");
        java.lang.String str15 = attributes0.html();
        boolean boolean17 = attributes0.hasKeyIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator18 = attributes0.spliterator();
        java.lang.String str19 = attributes0.toString();
        java.util.List<org.jsoup.nodes.Attribute> attributeList20 = attributes0.asList();
        org.jsoup.nodes.Attribute attribute21 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " hi!=\"data-\" data-=\"hi!\"" + "'", str15, " hi!=\"data-\" data-=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " hi!=\"data-\" data-=\"hi!\"" + "'", str19, " hi!=\"data-\" data-=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeList20);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.equals((java.lang.Object) (short) -1);
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        attributes0.html(appendable6, outputSettings7);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator9 = attributes0.spliterator();
        boolean boolean11 = attributes0.hasKey(" hi!=\"data-\" data-=\"hi!\"");
        java.lang.Class<?> wildcardClass12 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        attributes0.put("data-", true);
        java.util.List<org.jsoup.nodes.Attribute> attributeList11 = attributes0.asList();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = attributes0.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributeList11);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        int int2 = attributes0.size();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes0.iterator();
        java.lang.Class<?> wildcardClass4 = attributeItor3.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.String str8 = attributes0.get("data-");
        attributes0.put(" data-", false);
        int int12 = attributes0.size();
        java.lang.String str13 = attributes0.html();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", " hi!=\"data-\" data-=\"data-\"=\"data-\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        java.lang.String str13 = attributes0.get("data-");
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        attributes14.removeIgnoreCase("hi!");
        boolean boolean18 = attributes14.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes19 = attributes14.clone();
        java.lang.String str21 = attributes19.getIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor22 = attributes19.iterator();
        int int23 = attributes19.size();
        attributes0.addAll(attributes19);
        java.util.List<org.jsoup.nodes.Attribute> attributeList25 = attributes0.asList();
        java.lang.Class<?> wildcardClass26 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributeItor22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(attributeList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        int int10 = attributes0.size();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        attributes13.removeIgnoreCase("hi!");
        boolean boolean17 = attributes13.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes18 = attributes13.clone();
        boolean boolean20 = attributes18.hasKeyIgnoreCase("");
        attributes18.put(" data-", true);
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = attributes24.dataset();
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        boolean boolean28 = attributes26.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap29 = attributes26.dataset();
        boolean boolean31 = attributes26.hasKey("data-");
        boolean boolean33 = attributes26.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes34 = new org.jsoup.nodes.Attributes();
        attributes34.removeIgnoreCase("hi!");
        boolean boolean38 = attributes34.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes39 = attributes34.clone();
        attributes26.addAll(attributes34);
        attributes26.remove("data-");
        boolean boolean43 = attributes24.equals((java.lang.Object) attributes26);
        java.lang.Appendable appendable44 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = null;
        attributes24.html(appendable44, outputSettings45);
        org.jsoup.nodes.Attributes attributes47 = attributes24.clone();
        boolean boolean48 = attributes18.equals((java.lang.Object) attributes47);
        attributes18.removeIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        boolean boolean52 = attributes18.hasKeyIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        attributes0.addAll(attributes18);
        boolean boolean55 = attributes0.hasKey(" data-");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        boolean boolean7 = attributes5.hasKeyIgnoreCase("");
        java.lang.String str8 = attributes5.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = attributes5.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        boolean boolean7 = attributes5.hasKeyIgnoreCase("");
        attributes5.put(" data-", true);
        org.jsoup.nodes.Attributes attributes11 = attributes5.clone();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        boolean boolean14 = attributes12.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes12.dataset();
        boolean boolean17 = attributes12.hasKey("data-");
        boolean boolean19 = attributes12.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        attributes20.removeIgnoreCase("hi!");
        boolean boolean24 = attributes20.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes25 = attributes20.clone();
        attributes12.addAll(attributes20);
        attributes12.remove("data-");
        attributes12.put("data-", true);
        attributes11.addAll(attributes12);
        org.jsoup.nodes.Attributes attributes33 = attributes11.clone();
        attributes33.remove(" data-");
        java.lang.Appendable appendable36 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes33.html(appendable36, outputSettings37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(attributes33);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        attributes0.put("data-", "hi!");
        java.lang.String str16 = attributes0.getIgnoreCase("data-");
        attributes0.put("data-", "data-");
        org.jsoup.nodes.Attributes attributes20 = attributes0.clone();
        org.jsoup.nodes.Attributes attributes21 = attributes0.clone();
        java.lang.String str22 = attributes21.toString();
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        boolean boolean25 = attributes23.hasKey("");
        attributes23.remove("hi!");
        boolean boolean29 = attributes23.hasKeyIgnoreCase("hi!");
        boolean boolean31 = attributes23.hasKey("");
        attributes23.put("hi!", "data-");
        java.lang.String str36 = attributes23.get("data-");
        org.jsoup.nodes.Attributes attributes37 = new org.jsoup.nodes.Attributes();
        attributes37.removeIgnoreCase("hi!");
        boolean boolean41 = attributes37.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes42 = attributes37.clone();
        java.lang.String str44 = attributes42.getIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor45 = attributes42.iterator();
        int int46 = attributes42.size();
        attributes23.addAll(attributes42);
        boolean boolean48 = attributes21.equals((java.lang.Object) attributes23);
        org.jsoup.nodes.Attribute attribute49 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes21.put(attribute49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " hi!=\"data-\" data-=\"data-\"" + "'", str22, " hi!=\"data-\" data-=\"data-\"");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(attributeItor45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        int int2 = attributes0.size();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor4 = attributes0.iterator();
        java.lang.Class<?> wildcardClass5 = attributeItor4.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertNotNull(attributeItor4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        attributes0.put("hi!", "data-");
        java.util.List<org.jsoup.nodes.Attribute> attributeList9 = attributes0.asList();
        java.lang.String str11 = attributes0.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes12 = attributes0.clone();
        attributes0.put("hi!", true);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes0.iterator();
        int int17 = attributes0.size();
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.html(appendable18, outputSettings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes0.dataset();
        attributes0.remove("hi!");
        attributes0.put(" data-", false);
        org.jsoup.nodes.Attribute attribute10 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        java.lang.String str11 = attributes0.html();
        org.jsoup.nodes.Attribute attribute12 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        attributes0.put("data-", "hi!");
        java.lang.String str15 = attributes0.html();
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        boolean boolean18 = attributes16.hasKey("");
        attributes16.remove("hi!");
        boolean boolean22 = attributes16.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = attributes23.dataset();
        org.jsoup.nodes.Attributes attributes25 = new org.jsoup.nodes.Attributes();
        boolean boolean27 = attributes25.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap28 = attributes25.dataset();
        boolean boolean30 = attributes25.hasKey("data-");
        boolean boolean32 = attributes25.hasKeyIgnoreCase("");
        attributes23.addAll(attributes25);
        boolean boolean34 = attributes16.equals((java.lang.Object) attributes25);
        org.jsoup.nodes.Attributes attributes35 = attributes25.clone();
        attributes25.removeIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator38 = attributes25.spliterator();
        java.util.List<org.jsoup.nodes.Attribute> attributeList39 = attributes25.asList();
        boolean boolean40 = attributes0.equals((java.lang.Object) attributeList39);
        java.lang.Appendable appendable41 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.html(appendable41, outputSettings42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " hi!=\"data-\" data-=\"hi!\"" + "'", str15, " hi!=\"data-\" data-=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(attributeSpliterator38);
        org.junit.Assert.assertNotNull(attributeList39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes0.iterator();
        attributes0.remove(" hi!=\"data-\" data-=\"hi!\"");
        java.util.List<org.jsoup.nodes.Attribute> attributeList6 = attributes0.asList();
        attributes0.removeIgnoreCase("data-");
        java.util.List<org.jsoup.nodes.Attribute> attributeList9 = attributes0.asList();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertNotNull(attributeList6);
        org.junit.Assert.assertNotNull(attributeList9);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        attributes0.html(appendable11, outputSettings12);
        java.lang.String str14 = attributes0.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator15 = attributes0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", " data-=\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributeSpliterator15);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        attributes0.put("hi!", "data-");
        java.util.List<org.jsoup.nodes.Attribute> attributeList9 = attributes0.asList();
        java.lang.String str11 = attributes0.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes12 = attributes0.clone();
        java.lang.String str13 = attributes0.html();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " hi!=\"data-\"" + "'", str13, " hi!=\"data-\"");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        attributes0.html(appendable4, outputSettings5);
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        boolean boolean9 = attributes7.hasKey("");
        attributes7.remove("hi!");
        boolean boolean13 = attributes7.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes14.dataset();
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        boolean boolean18 = attributes16.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = attributes16.dataset();
        boolean boolean21 = attributes16.hasKey("data-");
        boolean boolean23 = attributes16.hasKeyIgnoreCase("");
        attributes14.addAll(attributes16);
        boolean boolean25 = attributes7.equals((java.lang.Object) attributes16);
        org.jsoup.nodes.Attributes attributes26 = attributes16.clone();
        attributes26.put(" data-", false);
        org.jsoup.nodes.Attributes attributes30 = new org.jsoup.nodes.Attributes();
        java.lang.String str32 = attributes30.get("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap33 = attributes30.dataset();
        org.jsoup.nodes.Attributes attributes34 = new org.jsoup.nodes.Attributes();
        boolean boolean36 = attributes34.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap37 = attributes34.dataset();
        boolean boolean39 = attributes34.hasKey("data-");
        boolean boolean41 = attributes34.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        attributes42.removeIgnoreCase("hi!");
        boolean boolean46 = attributes42.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes47 = attributes42.clone();
        attributes34.addAll(attributes42);
        attributes34.remove("data-");
        attributes30.addAll(attributes34);
        java.util.Map<java.lang.String, java.lang.String> strMap52 = attributes30.dataset();
        boolean boolean53 = attributes26.equals((java.lang.Object) strMap52);
        boolean boolean54 = attributes0.equals((java.lang.Object) boolean53);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        java.lang.String str7 = attributes5.getIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes5.iterator();
        int int9 = attributes5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = attributes5.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributeItor8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        int int6 = attributes0.size();
        java.lang.String str7 = attributes0.html();
        attributes0.put(" hi!=\"data-\" data-=\"data-\"", "data-");
        java.lang.String str11 = attributes0.toString();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", " hi!=\"data-\"=\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " hi!=\"data-\" data-=\"data-\"=\"data-\"" + "'", str11, " hi!=\"data-\" data-=\"data-\"=\"data-\"");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        boolean boolean7 = attributes5.hasKeyIgnoreCase("");
        java.lang.String str8 = attributes5.toString();
        java.lang.String str9 = attributes5.toString();
        java.lang.String str10 = attributes5.html();
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        boolean boolean13 = attributes11.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes11.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes11.dataset();
        attributes11.remove("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = attributes11.dataset();
        boolean boolean19 = attributes5.equals((java.lang.Object) strMap18);
        org.jsoup.nodes.Attributes attributes20 = attributes5.clone();
        attributes20.remove("data-");
        java.lang.String str23 = attributes20.html();
        attributes20.remove("hi!");
        // The following exception was thrown during execution in test generation
        try {
            attributes20.put("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        java.lang.String str7 = attributes5.getIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes8 = attributes5.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList9 = attributes5.asList();
        org.jsoup.nodes.Attributes attributes10 = attributes5.clone();
        // The following exception was thrown during execution in test generation
        try {
            attributes10.put("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(attributeList9);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        attributes0.put("hi!", "data-");
        java.util.List<org.jsoup.nodes.Attribute> attributeList9 = attributes0.asList();
        java.lang.String str11 = attributes0.getIgnoreCase("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator12 = attributes0.spliterator();
        boolean boolean14 = attributes0.equals((java.lang.Object) '#');
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        attributes15.removeIgnoreCase("hi!");
        boolean boolean19 = attributes15.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes20 = attributes15.clone();
        boolean boolean22 = attributes20.hasKeyIgnoreCase("");
        attributes20.put(" data-", true);
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = attributes26.dataset();
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        boolean boolean30 = attributes28.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = attributes28.dataset();
        boolean boolean33 = attributes28.hasKey("data-");
        boolean boolean35 = attributes28.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes36 = new org.jsoup.nodes.Attributes();
        attributes36.removeIgnoreCase("hi!");
        boolean boolean40 = attributes36.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes41 = attributes36.clone();
        attributes28.addAll(attributes36);
        attributes28.remove("data-");
        boolean boolean45 = attributes26.equals((java.lang.Object) attributes28);
        java.lang.Appendable appendable46 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = null;
        attributes26.html(appendable46, outputSettings47);
        org.jsoup.nodes.Attributes attributes49 = attributes26.clone();
        boolean boolean50 = attributes20.equals((java.lang.Object) attributes49);
        attributes0.addAll(attributes20);
        attributes20.removeIgnoreCase(" hi!=\"data-\" data-=\"data-\"=\"data-\"");
        boolean boolean55 = attributes20.hasKeyIgnoreCase("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributeSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str2 = attributes0.get("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        attributes0.removeIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        boolean boolean6 = attributes4.hasKey("");
        attributes4.remove("hi!");
        boolean boolean10 = attributes4.hasKeyIgnoreCase("hi!");
        boolean boolean12 = attributes4.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes4.iterator();
        java.lang.String str14 = attributes4.html();
        java.lang.String str15 = attributes4.html();
        attributes4.remove("data-");
        attributes0.addAll(attributes4);
        org.jsoup.nodes.Attribute attribute19 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        attributes0.put("data-", "hi!");
        java.lang.String str16 = attributes0.getIgnoreCase("data-");
        attributes0.put("data-", "data-");
        org.jsoup.nodes.Attributes attributes20 = attributes0.clone();
        org.jsoup.nodes.Attributes attributes21 = attributes0.clone();
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        boolean boolean24 = attributes22.hasKey("");
        attributes22.remove("hi!");
        attributes22.remove("hi!");
        attributes21.addAll(attributes22);
        java.lang.String str30 = attributes22.toString();
        org.jsoup.nodes.Attributes attributes31 = new org.jsoup.nodes.Attributes();
        boolean boolean33 = attributes31.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap34 = attributes31.dataset();
        org.jsoup.nodes.Attributes attributes35 = new org.jsoup.nodes.Attributes();
        boolean boolean37 = attributes35.hasKey("");
        attributes35.remove("hi!");
        boolean boolean41 = attributes35.hasKeyIgnoreCase("hi!");
        boolean boolean43 = attributes35.hasKey("");
        attributes35.put("hi!", "data-");
        attributes35.put("data-", "hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList50 = attributes35.asList();
        boolean boolean51 = attributes31.equals((java.lang.Object) attributes35);
        boolean boolean53 = attributes31.hasKeyIgnoreCase(" data-");
        java.lang.String str54 = attributes31.toString();
        attributes22.addAll(attributes31);
        boolean boolean57 = attributes22.hasKeyIgnoreCase(" data-");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(attributeList50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        attributes0.put("data-", "hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList15 = attributes0.asList();
        java.lang.String str17 = attributes0.getIgnoreCase("hi!");
        java.lang.String str19 = attributes0.get("data-");
        attributes0.remove("data-");
        java.lang.String str23 = attributes0.getIgnoreCase(" data-");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "data-" + "'", str17, "data-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        boolean boolean7 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        attributes8.removeIgnoreCase("hi!");
        boolean boolean12 = attributes8.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes8.clone();
        attributes0.addAll(attributes8);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes8.iterator();
        org.jsoup.nodes.Attribute attribute16 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes8.put(attribute16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributeItor15);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        boolean boolean7 = attributes5.hasKeyIgnoreCase("");
        java.lang.String str8 = attributes5.toString();
        java.lang.String str9 = attributes5.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator10 = attributes5.spliterator();
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = attributes11.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator13 = attributes11.spliterator();
        java.lang.String str14 = attributes11.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList15 = attributes11.asList();
        attributes11.removeIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes11.iterator();
        boolean boolean19 = attributes5.equals((java.lang.Object) attributes11);
        org.jsoup.nodes.Attribute attribute20 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes11.put(attribute20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributeSpliterator10);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(attributeSpliterator13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributeList15);
        org.junit.Assert.assertNotNull(attributeItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        int int3 = attributes0.size();
        attributes0.put(" hi!=\"data-\" data-=\"data-\"", false);
        java.lang.String str7 = attributes0.toString();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        int int2 = attributes0.size();
        java.util.List<org.jsoup.nodes.Attribute> attributeList3 = attributes0.asList();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator4 = attributeList3.spliterator();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(attributeList3);
        org.junit.Assert.assertNotNull(attributeSpliterator4);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        attributes0.put("hi!", "data-");
        java.util.List<org.jsoup.nodes.Attribute> attributeList9 = attributes0.asList();
        java.lang.String str11 = attributes0.getIgnoreCase("data-");
        java.lang.String str12 = attributes0.html();
        boolean boolean14 = attributes0.hasKey(" data-=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " hi!=\"data-\"" + "'", str12, " hi!=\"data-\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        boolean boolean4 = attributes2.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes2.dataset();
        boolean boolean7 = attributes2.hasKey("data-");
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.removeIgnoreCase("hi!");
        boolean boolean14 = attributes10.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes15 = attributes10.clone();
        attributes2.addAll(attributes10);
        attributes2.remove("data-");
        boolean boolean19 = attributes0.equals((java.lang.Object) attributes2);
        java.lang.String str20 = attributes2.html();
        java.lang.Class<?> wildcardClass21 = attributes2.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.Class<?> wildcardClass3 = attributes0.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes0.dataset();
        attributes0.remove("hi!");
        attributes0.put(" data-", false);
        java.lang.String str11 = attributes0.getIgnoreCase(" hi!=\"data-\"");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        boolean boolean14 = attributes12.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes12.dataset();
        boolean boolean17 = attributes12.hasKey("data-");
        boolean boolean19 = attributes12.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        attributes20.removeIgnoreCase("hi!");
        boolean boolean24 = attributes20.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes25 = attributes20.clone();
        attributes12.addAll(attributes20);
        java.lang.String str27 = attributes12.html();
        java.lang.Appendable appendable28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        attributes12.html(appendable28, outputSettings29);
        org.jsoup.nodes.Attributes attributes31 = new org.jsoup.nodes.Attributes();
        boolean boolean33 = attributes31.hasKey("");
        attributes31.remove("hi!");
        boolean boolean37 = attributes31.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes38 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap39 = attributes38.dataset();
        org.jsoup.nodes.Attributes attributes40 = new org.jsoup.nodes.Attributes();
        boolean boolean42 = attributes40.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap43 = attributes40.dataset();
        boolean boolean45 = attributes40.hasKey("data-");
        boolean boolean47 = attributes40.hasKeyIgnoreCase("");
        attributes38.addAll(attributes40);
        boolean boolean49 = attributes31.equals((java.lang.Object) attributes40);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator50 = attributes31.spliterator();
        attributes12.addAll(attributes31);
        java.util.List<org.jsoup.nodes.Attribute> attributeList52 = attributes12.asList();
        attributes0.addAll(attributes12);
        org.jsoup.nodes.Attributes attributes54 = new org.jsoup.nodes.Attributes();
        boolean boolean56 = attributes54.hasKey("");
        attributes54.remove("hi!");
        boolean boolean60 = attributes54.hasKeyIgnoreCase("hi!");
        boolean boolean62 = attributes54.equals((java.lang.Object) 100L);
        java.lang.String str64 = attributes54.get("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator65 = attributes54.spliterator();
        java.lang.String str67 = attributes54.getIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes68 = new org.jsoup.nodes.Attributes();
        attributes68.removeIgnoreCase("hi!");
        boolean boolean72 = attributes68.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor73 = attributes68.iterator();
        boolean boolean74 = attributes54.equals((java.lang.Object) attributeItor73);
        boolean boolean75 = attributes12.equals((java.lang.Object) attributes54);
        java.lang.String str77 = attributes54.get(" hi!=\"data-\" data-=\"hi!\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str79 = attributes54.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator50);
        org.junit.Assert.assertNotNull(attributeList52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(attributeSpliterator65);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(attributeItor73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator11 = attributes0.spliterator();
        boolean boolean13 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator14 = attributes0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", " hi!=\"data-\" data-=\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator14);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes0.dataset();
        attributes0.remove("hi!");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        int int11 = attributes0.size();
        java.lang.String str13 = attributes0.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes14 = attributes0.clone();
        attributes0.put("hi!", "data-");
        boolean boolean19 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.String str20 = attributes0.toString();
        org.jsoup.nodes.Attribute attribute21 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " hi!=\"data-\"" + "'", str20, " hi!=\"data-\"");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        int int11 = attributes0.size();
        java.lang.String str13 = attributes0.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes14 = attributes0.clone();
        attributes0.put("hi!", "data-");
        boolean boolean19 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.String str20 = attributes0.toString();
        int int21 = attributes0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " hi!=\"data-\"" + "'", str20, " hi!=\"data-\"");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        java.lang.String str9 = attributes7.get("data-");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor10 = attributes7.iterator();
        java.lang.Class<?> wildcardClass11 = attributes7.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributeItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes0.dataset();
        attributes0.remove("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes0.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes0.dataset();
        java.util.List<org.jsoup.nodes.Attribute> attributeList9 = attributes0.asList();
        java.util.List<org.jsoup.nodes.Attribute> attributeList10 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes11 = attributes0.clone();
        attributes0.remove("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(attributeList9);
        org.junit.Assert.assertNotNull(attributeList10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        java.lang.String str5 = attributes0.getIgnoreCase(" hi!=\"data-\"");
        boolean boolean7 = attributes0.hasKey(" hi!=\"data-\" data-=\"data-\"");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        attributes8.removeIgnoreCase("hi!");
        boolean boolean12 = attributes8.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes8.clone();
        boolean boolean15 = attributes13.hasKeyIgnoreCase("");
        attributes13.put(" data-", true);
        org.jsoup.nodes.Attributes attributes19 = attributes13.clone();
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        boolean boolean22 = attributes20.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = attributes20.dataset();
        boolean boolean25 = attributes20.hasKey("data-");
        boolean boolean27 = attributes20.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        attributes28.removeIgnoreCase("hi!");
        boolean boolean32 = attributes28.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes33 = attributes28.clone();
        attributes20.addAll(attributes28);
        attributes20.remove("data-");
        attributes20.put("data-", true);
        attributes19.addAll(attributes20);
        org.jsoup.nodes.Attributes attributes41 = attributes19.clone();
        boolean boolean43 = attributes19.hasKeyIgnoreCase("");
        java.lang.String str44 = attributes19.toString();
        attributes0.addAll(attributes19);
        org.jsoup.nodes.Attribute attribute46 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes19.put(attribute46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + " data-" + "'", str44, " data-");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        boolean boolean4 = attributes2.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes2.dataset();
        boolean boolean7 = attributes2.hasKey("data-");
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.removeIgnoreCase("hi!");
        boolean boolean14 = attributes10.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes15 = attributes10.clone();
        attributes2.addAll(attributes10);
        attributes2.remove("data-");
        boolean boolean19 = attributes0.equals((java.lang.Object) attributes2);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = attributes2.dataset();
        java.lang.String str22 = attributes2.getIgnoreCase(" hi!=\"data-\"");
        attributes2.put(" data-", true);
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        boolean boolean28 = attributes26.hasKey("");
        attributes26.remove("hi!");
        boolean boolean32 = attributes26.hasKeyIgnoreCase("hi!");
        java.lang.String str33 = attributes26.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor34 = attributes26.iterator();
        boolean boolean35 = attributes2.equals((java.lang.Object) attributes26);
        java.lang.String str36 = attributes26.html();
        java.util.Map<java.lang.String, java.lang.String> strMap37 = attributes26.dataset();
        boolean boolean39 = attributes26.hasKey(" hi!=\"data-\"");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(attributeItor34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        int int4 = attributes0.size();
        java.util.List<org.jsoup.nodes.Attribute> attributeList5 = attributes0.asList();
        java.lang.Object obj6 = null;
        boolean boolean7 = attributes0.equals(obj6);
        org.jsoup.nodes.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        boolean boolean4 = attributes2.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes2.dataset();
        boolean boolean7 = attributes2.hasKey("data-");
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.removeIgnoreCase("hi!");
        boolean boolean14 = attributes10.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes15 = attributes10.clone();
        attributes2.addAll(attributes10);
        attributes2.remove("data-");
        boolean boolean19 = attributes0.equals((java.lang.Object) attributes2);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes2.iterator();
        boolean boolean22 = attributes2.hasKeyIgnoreCase(" data-=\"hi!\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = attributes2.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        boolean boolean7 = attributes5.hasKeyIgnoreCase("");
        java.lang.String str8 = attributes5.toString();
        java.lang.String str9 = attributes5.toString();
        boolean boolean11 = attributes5.hasKey("hi!");
        java.lang.String str12 = attributes5.toString();
        attributes5.removeIgnoreCase(" hi!=\"data-\" data-=\"data-\"=\"data-\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        int int11 = attributes0.size();
        java.lang.String str13 = attributes0.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes14 = attributes0.clone();
        attributes0.put("hi!", "data-");
        java.lang.String str19 = attributes0.get("data-");
        boolean boolean21 = attributes0.hasKeyIgnoreCase(" data-");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        boolean boolean11 = attributes9.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = attributes9.dataset();
        boolean boolean14 = attributes9.hasKey("data-");
        boolean boolean16 = attributes9.hasKeyIgnoreCase("");
        attributes7.addAll(attributes9);
        boolean boolean18 = attributes0.equals((java.lang.Object) attributes9);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = attributes0.dataset();
        org.jsoup.nodes.Attribute attribute20 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        boolean boolean4 = attributes2.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes2.dataset();
        boolean boolean7 = attributes2.hasKey("data-");
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.removeIgnoreCase("hi!");
        boolean boolean14 = attributes10.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes15 = attributes10.clone();
        attributes2.addAll(attributes10);
        attributes2.remove("data-");
        boolean boolean19 = attributes0.equals((java.lang.Object) attributes2);
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        boolean boolean22 = attributes20.hasKey("");
        attributes20.remove("hi!");
        boolean boolean26 = attributes20.hasKeyIgnoreCase("hi!");
        boolean boolean28 = attributes20.hasKey("");
        boolean boolean30 = attributes20.hasKey("hi!");
        boolean boolean31 = attributes2.equals((java.lang.Object) boolean30);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = attributes2.dataset();
        attributes2.removeIgnoreCase(" data-");
        java.lang.String str36 = attributes2.get(" hi!=\"data-\" data-=\"data-\"");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes0.iterator();
        attributes0.remove(" hi!=\"data-\"=\"\"");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertNotNull(attributeItor7);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        attributes7.put(" data-", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = attributes7.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes0.iterator();
        java.lang.String str8 = attributes0.html();
        boolean boolean10 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        boolean boolean13 = attributes11.hasKey("");
        attributes11.remove("hi!");
        boolean boolean17 = attributes11.hasKeyIgnoreCase("hi!");
        boolean boolean19 = attributes11.equals((java.lang.Object) 100L);
        java.lang.String str21 = attributes11.get("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator22 = attributes11.spliterator();
        boolean boolean24 = attributes11.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes25 = attributes11.clone();
        attributes0.addAll(attributes25);
        // The following exception was thrown during execution in test generation
        try {
            attributes25.put("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributeSpliterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributes25);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        java.lang.String str7 = attributes5.getIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes5.iterator();
        int int9 = attributes5.size();
        attributes5.removeIgnoreCase("data-");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = attributes5.dataset();
        boolean boolean14 = attributes5.hasKey(" data-=\"hi!\"");
        java.lang.String str16 = attributes5.getIgnoreCase(" data-=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributeItor8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes0.iterator();
        java.lang.String str8 = attributes0.html();
        int int9 = attributes0.size();
        java.lang.Class<?> wildcardClass10 = attributes0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        boolean boolean6 = attributes4.hasKey("");
        attributes4.remove("hi!");
        boolean boolean10 = attributes4.hasKeyIgnoreCase("hi!");
        boolean boolean12 = attributes4.hasKey("");
        attributes4.put("hi!", "data-");
        attributes4.put("data-", "hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList19 = attributes4.asList();
        boolean boolean20 = attributes0.equals((java.lang.Object) attributes4);
        attributes4.put("hi!", true);
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        boolean boolean26 = attributes24.hasKey("");
        attributes24.remove("hi!");
        boolean boolean30 = attributes24.hasKeyIgnoreCase("hi!");
        boolean boolean32 = attributes24.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor33 = attributes24.iterator();
        java.lang.String str34 = attributes24.html();
        java.lang.String str35 = attributes24.html();
        java.lang.Appendable appendable36 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = null;
        attributes24.html(appendable36, outputSettings37);
        boolean boolean40 = attributes24.hasKeyIgnoreCase("hi!");
        attributes4.addAll(attributes24);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator42 = attributes24.spliterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor43 = attributes24.iterator();
        attributes24.removeIgnoreCase(" hi!=\"data-\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(attributeItor33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator42);
        org.junit.Assert.assertNotNull(attributeItor43);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        boolean boolean11 = attributes9.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = attributes9.dataset();
        boolean boolean14 = attributes9.hasKey("data-");
        boolean boolean16 = attributes9.hasKeyIgnoreCase("");
        attributes7.addAll(attributes9);
        boolean boolean18 = attributes0.equals((java.lang.Object) attributes9);
        org.jsoup.nodes.Attributes attributes19 = attributes9.clone();
        org.jsoup.nodes.Attributes attributes20 = attributes9.clone();
        java.lang.String str21 = attributes20.html();
        attributes20.put(" hi!=\"data-\" data-=\"data-\"=\"data-\"", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes0.dataset();
        attributes0.remove("hi!");
        attributes0.put(" data-", "hi!");
        java.lang.String str10 = attributes0.toString();
        int int11 = attributes0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = attributes0.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " data-=\"hi!\"" + "'", str10, " data-=\"hi!\"");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator10 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        java.lang.String str13 = attributes11.get("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes11.dataset();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        boolean boolean17 = attributes15.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = attributes15.dataset();
        boolean boolean20 = attributes15.hasKey("data-");
        boolean boolean22 = attributes15.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        attributes23.removeIgnoreCase("hi!");
        boolean boolean27 = attributes23.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes28 = attributes23.clone();
        attributes15.addAll(attributes23);
        attributes15.remove("data-");
        attributes11.addAll(attributes15);
        attributes15.put(" hi!=\"data-\" data-=\"data-\"", "");
        attributes0.addAll(attributes15);
        java.lang.Class<?> wildcardClass37 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertNotNull(attributeSpliterator10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes0.dataset();
        attributes0.remove("hi!");
        java.lang.String str8 = attributes0.getIgnoreCase("hi!");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("hi!");
        int int9 = attributes0.size();
        int int10 = attributes0.size();
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        boolean boolean13 = attributes11.hasKey("");
        attributes11.remove("hi!");
        boolean boolean17 = attributes11.hasKeyIgnoreCase("hi!");
        boolean boolean19 = attributes11.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes11.iterator();
        java.lang.String str21 = attributes11.html();
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        boolean boolean24 = attributes22.hasKey("");
        attributes22.remove("hi!");
        boolean boolean28 = attributes22.hasKeyIgnoreCase("hi!");
        boolean boolean30 = attributes22.hasKey("");
        attributes22.put("hi!", "data-");
        attributes22.put("data-", "hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList37 = attributes22.asList();
        java.lang.String str39 = attributes22.getIgnoreCase("hi!");
        java.lang.String str41 = attributes22.get("data-");
        attributes11.addAll(attributes22);
        attributes0.addAll(attributes22);
        java.lang.String str45 = attributes22.getIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        java.lang.String str47 = attributes22.getIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        java.lang.Class<?> wildcardClass48 = attributes22.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(attributeList37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "data-" + "'", str39, "data-");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        java.lang.String str5 = attributes0.getIgnoreCase(" hi!=\"data-\"");
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.lang.String str8 = attributes6.getIgnoreCase("hi!");
        boolean boolean9 = attributes0.equals((java.lang.Object) str8);
        attributes0.removeIgnoreCase(" hi!=\"data-\" data-=\"data-\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        java.lang.String str9 = attributes7.get("data-");
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        attributes7.html(appendable10, outputSettings11);
        java.util.List<org.jsoup.nodes.Attribute> attributeList13 = attributes7.asList();
        attributes7.removeIgnoreCase(" hi!=\"data-\" data-=\"data-\"=\"data-\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = attributes7.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributeList13);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        java.lang.String str7 = attributes5.getIgnoreCase("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes5.spliterator();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributeSpliterator8);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        attributes0.put("data-", "hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList15 = attributes0.asList();
        java.lang.String str17 = attributes0.getIgnoreCase("hi!");
        java.lang.String str19 = attributes0.get("data-");
        attributes0.remove("data-");
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.html(appendable22, outputSettings23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "data-" + "'", str17, "data-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        int int3 = attributes0.size();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        java.lang.Class<?> wildcardClass5 = attributeList4.getClass();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        boolean boolean10 = attributes8.hasKey("");
        attributes8.remove("hi!");
        boolean boolean14 = attributes8.hasKeyIgnoreCase("hi!");
        boolean boolean16 = attributes8.equals((java.lang.Object) 100L);
        java.lang.String str18 = attributes8.get("hi!");
        attributes8.put("data-", true);
        boolean boolean22 = attributes0.equals((java.lang.Object) true);
        int int23 = attributes0.size();
        org.jsoup.nodes.Attribute attribute24 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes0.dataset();
        org.jsoup.nodes.Attribute attribute10 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        attributes0.removeIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        boolean boolean6 = attributes4.hasKey("");
        attributes4.remove("hi!");
        boolean boolean10 = attributes4.hasKeyIgnoreCase("hi!");
        boolean boolean12 = attributes4.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes4.iterator();
        java.lang.String str14 = attributes4.html();
        java.lang.String str15 = attributes4.html();
        attributes4.remove("data-");
        attributes0.addAll(attributes4);
        org.jsoup.nodes.Attributes attributes19 = attributes0.clone();
        org.jsoup.nodes.Attribute attribute20 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes19.put(attribute20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.equals((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList6 = attributes0.asList();
        attributes0.put(" hi!=\"data-\"", true);
        int int10 = attributes0.size();
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = attributes11.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator13 = attributes11.spliterator();
        java.lang.String str14 = attributes11.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList15 = attributes11.asList();
        attributes11.removeIgnoreCase("hi!");
        boolean boolean19 = attributes11.hasKey("hi!");
        int int20 = attributes11.size();
        java.lang.String str21 = attributes11.toString();
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        boolean boolean24 = attributes22.hasKey("");
        attributes22.remove("hi!");
        boolean boolean28 = attributes22.hasKeyIgnoreCase("hi!");
        boolean boolean30 = attributes22.equals((java.lang.Object) 100L);
        java.lang.String str32 = attributes22.get("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator33 = attributes22.spliterator();
        boolean boolean35 = attributes22.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes36 = attributes22.clone();
        attributes11.addAll(attributes22);
        java.util.Map<java.lang.String, java.lang.String> strMap38 = attributes22.dataset();
        boolean boolean39 = attributes0.equals((java.lang.Object) attributes22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeList6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(attributeSpliterator13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributeList15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(attributeSpliterator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        attributes0.html(appendable7, outputSettings8);
        attributes0.removeIgnoreCase(" data-");
        java.lang.Class<?> wildcardClass12 = attributes0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        boolean boolean9 = attributes7.hasKey(" hi!=\"data-\" data-=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("hi!");
        int int9 = attributes0.size();
        java.lang.String str10 = attributes0.toString();
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        boolean boolean13 = attributes11.hasKey("");
        attributes11.remove("hi!");
        boolean boolean17 = attributes11.hasKeyIgnoreCase("hi!");
        boolean boolean19 = attributes11.equals((java.lang.Object) 100L);
        java.lang.String str21 = attributes11.get("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator22 = attributes11.spliterator();
        boolean boolean24 = attributes11.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes25 = attributes11.clone();
        attributes0.addAll(attributes11);
        attributes11.removeIgnoreCase(" data-");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor29 = attributes11.iterator();
        // The following exception was thrown during execution in test generation
        try {
            attributes11.put("", " data-=\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributeSpliterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(attributeItor29);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        int int10 = attributes0.size();
        attributes0.remove("data-");
        java.lang.String str14 = attributes0.getIgnoreCase(" hi!=\"data-\"");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        boolean boolean6 = attributes4.hasKey("");
        attributes4.remove("hi!");
        boolean boolean10 = attributes4.hasKeyIgnoreCase("hi!");
        boolean boolean12 = attributes4.hasKey("");
        attributes4.put("hi!", "data-");
        attributes4.put("data-", "hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList19 = attributes4.asList();
        boolean boolean20 = attributes0.equals((java.lang.Object) attributes4);
        boolean boolean22 = attributes4.hasKey("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = attributes4.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        java.lang.String str10 = attributes0.html();
        java.lang.String str11 = attributes0.html();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        attributes0.html(appendable12, outputSettings13);
        boolean boolean16 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes0.iterator();
        int int18 = attributes0.size();
        java.lang.String str19 = attributes0.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes0.iterator();
        boolean boolean22 = attributes0.hasKey(" hi!=\"data-\" data-=\"hi!\"");
        java.util.List<org.jsoup.nodes.Attribute> attributeList23 = attributes0.asList();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributeList23);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        boolean boolean7 = attributes5.hasKeyIgnoreCase("");
        attributes5.put(" data-", true);
        org.jsoup.nodes.Attributes attributes11 = attributes5.clone();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        boolean boolean14 = attributes12.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes12.dataset();
        boolean boolean17 = attributes12.hasKey("data-");
        boolean boolean19 = attributes12.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        attributes20.removeIgnoreCase("hi!");
        boolean boolean24 = attributes20.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes25 = attributes20.clone();
        attributes12.addAll(attributes20);
        attributes12.remove("data-");
        attributes12.put("data-", true);
        attributes11.addAll(attributes12);
        org.jsoup.nodes.Attributes attributes33 = attributes11.clone();
        attributes33.remove(" data-");
        java.lang.String str36 = attributes33.html();
        java.lang.Appendable appendable37 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes33.html(appendable37, outputSettings38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + " data-" + "'", str36, " data-");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        boolean boolean4 = attributes2.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes2.dataset();
        boolean boolean7 = attributes2.hasKey("data-");
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        attributes0.addAll(attributes2);
        org.jsoup.nodes.Attributes attributes11 = attributes0.clone();
        int int12 = attributes0.size();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        boolean boolean7 = attributes5.hasKeyIgnoreCase("");
        java.lang.String str8 = attributes5.toString();
        java.lang.String str9 = attributes5.toString();
        java.lang.String str10 = attributes5.html();
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        boolean boolean13 = attributes11.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes11.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes11.dataset();
        attributes11.remove("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = attributes11.dataset();
        boolean boolean19 = attributes5.equals((java.lang.Object) strMap18);
        java.lang.String str21 = attributes5.get(" hi!=\"data-\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        boolean boolean11 = attributes9.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = attributes9.dataset();
        boolean boolean14 = attributes9.hasKey("data-");
        boolean boolean16 = attributes9.hasKeyIgnoreCase("");
        attributes7.addAll(attributes9);
        boolean boolean18 = attributes0.equals((java.lang.Object) attributes9);
        org.jsoup.nodes.Attributes attributes19 = attributes9.clone();
        java.lang.String str21 = attributes9.get(" hi!=\"data-\" data-=\"hi!\"");
        attributes9.put("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            attributes9.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes0.iterator();
        java.lang.String str8 = attributes0.html();
        boolean boolean10 = attributes0.hasKeyIgnoreCase("");
        attributes0.remove(" hi!=\"data-\" data-=\"data-\"");
        boolean boolean14 = attributes0.hasKeyIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        attributes0.html(appendable7, outputSettings8);
        attributes0.removeIgnoreCase(" data-");
        java.lang.String str13 = attributes0.get(" hi!=\"data-\"=\"\"");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        attributes0.html(appendable7, outputSettings8);
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        boolean boolean12 = attributes10.hasKey("");
        attributes10.remove("hi!");
        boolean boolean16 = attributes10.hasKeyIgnoreCase("hi!");
        boolean boolean18 = attributes10.equals((java.lang.Object) 100L);
        java.lang.String str20 = attributes10.get("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator21 = attributes10.spliterator();
        boolean boolean23 = attributes10.hasKeyIgnoreCase("hi!");
        attributes0.addAll(attributes10);
        java.lang.String str26 = attributes10.getIgnoreCase("data-");
        java.lang.String str27 = attributes10.html();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributeSpliterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str2 = attributes0.get("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        boolean boolean6 = attributes4.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes4.dataset();
        boolean boolean9 = attributes4.hasKey("data-");
        boolean boolean11 = attributes4.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        attributes12.removeIgnoreCase("hi!");
        boolean boolean16 = attributes12.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes17 = attributes12.clone();
        attributes4.addAll(attributes12);
        attributes4.remove("data-");
        attributes0.addAll(attributes4);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor22 = attributes0.iterator();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator23 = attributes0.spliterator();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(attributeItor22);
        org.junit.Assert.assertNotNull(attributeSpliterator23);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        attributes0.put("data-", "hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList15 = attributes0.asList();
        org.jsoup.nodes.Attribute attribute16 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeList15);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        attributes0.html(appendable11, outputSettings12);
        java.lang.String str15 = attributes0.get("hi!");
        attributes0.put(" hi!=\"data-\" data-=\"hi!\"", "data-");
        org.jsoup.nodes.Attributes attributes19 = attributes0.clone();
        attributes0.remove(" data-");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        boolean boolean7 = attributes0.hasKey("hi!");
        java.lang.String str8 = attributes0.toString();
        java.lang.String str9 = attributes0.html();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes0.iterator();
        boolean boolean5 = attributes0.hasKeyIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        org.jsoup.nodes.Attributes attributes6 = attributes0.clone();
        java.lang.String str8 = attributes6.getIgnoreCase(" data-=\"hi!\"");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        attributes0.put("data-", "hi!");
        boolean boolean16 = attributes0.hasKeyIgnoreCase("data-");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        boolean boolean20 = attributes18.hasKey("");
        attributes18.remove("hi!");
        boolean boolean24 = attributes18.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes25 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = attributes25.dataset();
        org.jsoup.nodes.Attributes attributes27 = new org.jsoup.nodes.Attributes();
        boolean boolean29 = attributes27.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = attributes27.dataset();
        boolean boolean32 = attributes27.hasKey("data-");
        boolean boolean34 = attributes27.hasKeyIgnoreCase("");
        attributes25.addAll(attributes27);
        boolean boolean36 = attributes18.equals((java.lang.Object) attributes27);
        org.jsoup.nodes.Attributes attributes37 = attributes27.clone();
        attributes27.removeIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        attributes0.addAll(attributes27);
        // The following exception was thrown during execution in test generation
        try {
            attributes27.put("", " hi!=\"data-\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(attributes37);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        int int6 = attributes0.size();
        java.lang.String str7 = attributes0.html();
        boolean boolean9 = attributes0.hasKeyIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        java.lang.String str11 = attributes0.getIgnoreCase(" data-=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        boolean boolean4 = attributes2.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes2.dataset();
        boolean boolean7 = attributes2.hasKey("data-");
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.removeIgnoreCase("hi!");
        boolean boolean14 = attributes10.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes15 = attributes10.clone();
        attributes2.addAll(attributes10);
        attributes2.remove("data-");
        boolean boolean19 = attributes0.equals((java.lang.Object) attributes2);
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        attributes0.html(appendable20, outputSettings21);
        org.jsoup.nodes.Attributes attributes23 = attributes0.clone();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator24 = attributes23.spliterator();
        java.lang.Class<?> wildcardClass25 = attributes23.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(attributeSpliterator24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        boolean boolean4 = attributes2.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes2.dataset();
        boolean boolean7 = attributes2.hasKey("data-");
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.removeIgnoreCase("hi!");
        boolean boolean14 = attributes10.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes15 = attributes10.clone();
        attributes2.addAll(attributes10);
        attributes2.remove("data-");
        boolean boolean19 = attributes0.equals((java.lang.Object) attributes2);
        java.util.List<org.jsoup.nodes.Attribute> attributeList20 = attributes0.asList();
        boolean boolean22 = attributes0.hasKey("");
        attributes0.put(" hi!=\"data-\"=\"\"", " hi!=\"data-\"=\"\"");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(attributeList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        boolean boolean4 = attributes2.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes2.dataset();
        boolean boolean7 = attributes2.hasKey("data-");
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.removeIgnoreCase("hi!");
        boolean boolean14 = attributes10.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes15 = attributes10.clone();
        attributes2.addAll(attributes10);
        attributes2.remove("data-");
        boolean boolean19 = attributes0.equals((java.lang.Object) attributes2);
        org.jsoup.nodes.Attribute attribute20 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        attributes0.put("hi!", "data-");
        java.util.List<org.jsoup.nodes.Attribute> attributeList9 = attributes0.asList();
        java.lang.String str11 = attributes0.getIgnoreCase("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator12 = attributes0.spliterator();
        boolean boolean14 = attributes0.equals((java.lang.Object) '#');
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        attributes15.removeIgnoreCase("hi!");
        boolean boolean19 = attributes15.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes20 = attributes15.clone();
        boolean boolean22 = attributes20.hasKeyIgnoreCase("");
        attributes20.put(" data-", true);
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = attributes26.dataset();
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        boolean boolean30 = attributes28.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = attributes28.dataset();
        boolean boolean33 = attributes28.hasKey("data-");
        boolean boolean35 = attributes28.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes36 = new org.jsoup.nodes.Attributes();
        attributes36.removeIgnoreCase("hi!");
        boolean boolean40 = attributes36.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes41 = attributes36.clone();
        attributes28.addAll(attributes36);
        attributes28.remove("data-");
        boolean boolean45 = attributes26.equals((java.lang.Object) attributes28);
        java.lang.Appendable appendable46 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = null;
        attributes26.html(appendable46, outputSettings47);
        org.jsoup.nodes.Attributes attributes49 = attributes26.clone();
        boolean boolean50 = attributes20.equals((java.lang.Object) attributes49);
        attributes0.addAll(attributes20);
        attributes20.removeIgnoreCase(" hi!=\"data-\" data-=\"data-\"=\"data-\"");
        boolean boolean55 = attributes20.hasKeyIgnoreCase("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributeSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        attributes0.removeIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        boolean boolean6 = attributes4.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes4.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes4.dataset();
        attributes4.remove("hi!");
        java.lang.String str12 = attributes4.getIgnoreCase("hi!");
        attributes4.removeIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        boolean boolean15 = attributes0.equals((java.lang.Object) attributes4);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = attributes4.dataset();
        attributes4.put(" hi!=\"data-\" data-=\"hi!\"", true);
        java.lang.Class<?> wildcardClass20 = attributes4.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        boolean boolean7 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        attributes8.removeIgnoreCase("hi!");
        boolean boolean12 = attributes8.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes8.clone();
        attributes0.addAll(attributes8);
        attributes0.remove("data-");
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        boolean boolean19 = attributes17.hasKey("");
        attributes17.remove("hi!");
        boolean boolean23 = attributes17.hasKeyIgnoreCase("hi!");
        boolean boolean25 = attributes17.hasKey("");
        attributes17.put("hi!", "data-");
        attributes17.put("data-", "hi!");
        java.lang.String str32 = attributes17.html();
        org.jsoup.nodes.Attributes attributes33 = new org.jsoup.nodes.Attributes();
        boolean boolean35 = attributes33.hasKey("");
        attributes33.remove("hi!");
        boolean boolean39 = attributes33.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes40 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap41 = attributes40.dataset();
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        boolean boolean44 = attributes42.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap45 = attributes42.dataset();
        boolean boolean47 = attributes42.hasKey("data-");
        boolean boolean49 = attributes42.hasKeyIgnoreCase("");
        attributes40.addAll(attributes42);
        boolean boolean51 = attributes33.equals((java.lang.Object) attributes42);
        org.jsoup.nodes.Attributes attributes52 = attributes42.clone();
        attributes42.removeIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator55 = attributes42.spliterator();
        java.util.List<org.jsoup.nodes.Attribute> attributeList56 = attributes42.asList();
        boolean boolean57 = attributes17.equals((java.lang.Object) attributeList56);
        boolean boolean58 = attributes0.equals((java.lang.Object) boolean57);
        int int59 = attributes0.size();
        attributes0.remove(" data-");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + " hi!=\"data-\" data-=\"hi!\"" + "'", str32, " hi!=\"data-\" data-=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(attributes52);
        org.junit.Assert.assertNotNull(attributeSpliterator55);
        org.junit.Assert.assertNotNull(attributeList56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = null;
        attributes0.html(appendable4, outputSettings5);
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        attributes0.html(appendable7, outputSettings8);
        attributes0.remove(" hi!=\"data-\" data-=\"hi!\"");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        boolean boolean7 = attributes5.hasKeyIgnoreCase("");
        attributes5.put(" data-", true);
        org.jsoup.nodes.Attributes attributes11 = attributes5.clone();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        boolean boolean14 = attributes12.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes12.dataset();
        boolean boolean17 = attributes12.hasKey("data-");
        boolean boolean19 = attributes12.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        attributes20.removeIgnoreCase("hi!");
        boolean boolean24 = attributes20.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes25 = attributes20.clone();
        attributes12.addAll(attributes20);
        attributes12.remove("data-");
        attributes12.put("data-", true);
        attributes11.addAll(attributes12);
        org.jsoup.nodes.Attributes attributes33 = attributes11.clone();
        attributes33.remove(" data-");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = attributes33.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(attributes33);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        attributes0.html(appendable11, outputSettings12);
        java.lang.String str14 = attributes0.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator15 = attributes0.spliterator();
        attributes0.put("data-", "data-");
        java.util.List<org.jsoup.nodes.Attribute> attributeList19 = attributes0.asList();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator20 = attributeList19.spliterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributeSpliterator15);
        org.junit.Assert.assertNotNull(attributeList19);
        org.junit.Assert.assertNotNull(attributeSpliterator20);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        boolean boolean4 = attributes2.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes2.dataset();
        boolean boolean7 = attributes2.hasKey("data-");
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.removeIgnoreCase("hi!");
        boolean boolean14 = attributes10.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes15 = attributes10.clone();
        attributes2.addAll(attributes10);
        attributes2.remove("data-");
        boolean boolean19 = attributes0.equals((java.lang.Object) attributes2);
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        boolean boolean22 = attributes20.hasKey("");
        attributes20.remove("hi!");
        boolean boolean26 = attributes20.hasKeyIgnoreCase("hi!");
        boolean boolean28 = attributes20.hasKey("");
        boolean boolean30 = attributes20.hasKey("hi!");
        boolean boolean31 = attributes2.equals((java.lang.Object) boolean30);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = attributes2.dataset();
        // The following exception was thrown during execution in test generation
        try {
            attributes2.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strMap32);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes0.dataset();
        attributes0.remove("hi!");
        attributes0.put(" data-", false);
        java.lang.String str11 = attributes0.getIgnoreCase(" hi!=\"data-\"");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        boolean boolean14 = attributes12.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes12.dataset();
        boolean boolean17 = attributes12.hasKey("data-");
        boolean boolean19 = attributes12.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        attributes20.removeIgnoreCase("hi!");
        boolean boolean24 = attributes20.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes25 = attributes20.clone();
        attributes12.addAll(attributes20);
        java.lang.String str27 = attributes12.html();
        java.lang.Appendable appendable28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        attributes12.html(appendable28, outputSettings29);
        org.jsoup.nodes.Attributes attributes31 = new org.jsoup.nodes.Attributes();
        boolean boolean33 = attributes31.hasKey("");
        attributes31.remove("hi!");
        boolean boolean37 = attributes31.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes38 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap39 = attributes38.dataset();
        org.jsoup.nodes.Attributes attributes40 = new org.jsoup.nodes.Attributes();
        boolean boolean42 = attributes40.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap43 = attributes40.dataset();
        boolean boolean45 = attributes40.hasKey("data-");
        boolean boolean47 = attributes40.hasKeyIgnoreCase("");
        attributes38.addAll(attributes40);
        boolean boolean49 = attributes31.equals((java.lang.Object) attributes40);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator50 = attributes31.spliterator();
        attributes12.addAll(attributes31);
        java.util.List<org.jsoup.nodes.Attribute> attributeList52 = attributes12.asList();
        attributes0.addAll(attributes12);
        org.jsoup.nodes.Attributes attributes54 = new org.jsoup.nodes.Attributes();
        boolean boolean56 = attributes54.hasKey("");
        attributes54.remove("hi!");
        boolean boolean60 = attributes54.hasKeyIgnoreCase("hi!");
        boolean boolean62 = attributes54.equals((java.lang.Object) 100L);
        java.lang.String str64 = attributes54.get("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator65 = attributes54.spliterator();
        java.lang.String str67 = attributes54.getIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes68 = new org.jsoup.nodes.Attributes();
        attributes68.removeIgnoreCase("hi!");
        boolean boolean72 = attributes68.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor73 = attributes68.iterator();
        boolean boolean74 = attributes54.equals((java.lang.Object) attributeItor73);
        boolean boolean75 = attributes12.equals((java.lang.Object) attributes54);
        java.lang.String str77 = attributes54.get(" hi!=\"data-\" data-=\"hi!\"");
        org.jsoup.nodes.Attribute attribute78 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes54.put(attribute78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator50);
        org.junit.Assert.assertNotNull(attributeList52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(attributeSpliterator65);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(attributeItor73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("hi!");
        int int9 = attributes0.size();
        int int10 = attributes0.size();
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        boolean boolean13 = attributes11.hasKey("");
        attributes11.remove("hi!");
        boolean boolean17 = attributes11.hasKeyIgnoreCase("hi!");
        boolean boolean19 = attributes11.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes11.iterator();
        java.lang.String str21 = attributes11.html();
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        boolean boolean24 = attributes22.hasKey("");
        attributes22.remove("hi!");
        boolean boolean28 = attributes22.hasKeyIgnoreCase("hi!");
        boolean boolean30 = attributes22.hasKey("");
        attributes22.put("hi!", "data-");
        attributes22.put("data-", "hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList37 = attributes22.asList();
        java.lang.String str39 = attributes22.getIgnoreCase("hi!");
        java.lang.String str41 = attributes22.get("data-");
        attributes11.addAll(attributes22);
        attributes0.addAll(attributes22);
        java.lang.Class<?> wildcardClass44 = attributes0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(attributeList37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "data-" + "'", str39, "data-");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        java.lang.String str13 = attributes0.get("data-");
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        attributes14.removeIgnoreCase("hi!");
        boolean boolean18 = attributes14.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes19 = attributes14.clone();
        java.lang.String str21 = attributes19.getIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor22 = attributes19.iterator();
        int int23 = attributes19.size();
        attributes0.addAll(attributes19);
        org.jsoup.nodes.Attributes attributes25 = attributes19.clone();
        boolean boolean27 = attributes25.hasKey(" data-");
        attributes25.put(" hi!=\"data-\" data-=\"data-\"", " hi!=\"data-\" data-=\"data-\"=\"data-\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributeItor22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator5 = attributes0.spliterator();
        java.lang.Class<?> wildcardClass6 = attributeSpliterator5.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        attributes0.html(appendable11, outputSettings12);
        java.lang.String str14 = attributes0.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator15 = attributes0.spliterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes0.iterator();
        attributes0.put("data-", true);
        boolean boolean21 = attributes0.hasKeyIgnoreCase("data-");
        java.lang.String str23 = attributes0.get("hi!");
        attributes0.remove(" hi!=\"data-\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributeSpliterator15);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        boolean boolean7 = attributes5.hasKeyIgnoreCase("");
        java.lang.String str8 = attributes5.toString();
        attributes5.put("hi!", false);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = attributes5.dataset();
        attributes5.put(" hi!=\"data-\" data-=\"data-\"=\"data-\"", "hi!");
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        attributes16.removeIgnoreCase("hi!");
        boolean boolean20 = attributes16.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes21 = attributes16.clone();
        boolean boolean23 = attributes21.hasKeyIgnoreCase("");
        attributes21.put(" data-", true);
        org.jsoup.nodes.Attributes attributes27 = attributes21.clone();
        java.lang.String str28 = attributes21.html();
        boolean boolean29 = attributes5.equals((java.lang.Object) str28);
        attributes5.remove(" data-=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " data-" + "'", str28, " data-");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        attributes0.put("data-", "hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList15 = attributes0.asList();
        java.lang.String str17 = attributes0.getIgnoreCase("hi!");
        int int18 = attributes0.size();
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        boolean boolean21 = attributes19.hasKey("");
        attributes19.remove("hi!");
        attributes19.remove("hi!");
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        attributes19.html(appendable26, outputSettings27);
        boolean boolean30 = attributes19.hasKeyIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        attributes0.addAll(attributes19);
        java.lang.Appendable appendable32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.html(appendable32, outputSettings33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "data-" + "'", str17, "data-");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        java.lang.String str9 = attributes7.get("data-");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor10 = attributes7.iterator();
        attributes7.removeIgnoreCase(" data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator13 = attributes7.spliterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes7.iterator();
        org.jsoup.nodes.Attribute attribute15 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes7.put(attribute15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributeItor10);
        org.junit.Assert.assertNotNull(attributeSpliterator13);
        org.junit.Assert.assertNotNull(attributeItor14);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        boolean boolean7 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        attributes8.removeIgnoreCase("hi!");
        boolean boolean12 = attributes8.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes8.clone();
        attributes0.addAll(attributes8);
        attributes0.remove("data-");
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        boolean boolean19 = attributes17.hasKey("");
        attributes17.remove("hi!");
        boolean boolean23 = attributes17.hasKeyIgnoreCase("hi!");
        boolean boolean25 = attributes17.hasKey("");
        attributes17.put("hi!", "data-");
        attributes17.put("data-", "hi!");
        java.lang.String str32 = attributes17.html();
        org.jsoup.nodes.Attributes attributes33 = new org.jsoup.nodes.Attributes();
        boolean boolean35 = attributes33.hasKey("");
        attributes33.remove("hi!");
        boolean boolean39 = attributes33.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes40 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap41 = attributes40.dataset();
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        boolean boolean44 = attributes42.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap45 = attributes42.dataset();
        boolean boolean47 = attributes42.hasKey("data-");
        boolean boolean49 = attributes42.hasKeyIgnoreCase("");
        attributes40.addAll(attributes42);
        boolean boolean51 = attributes33.equals((java.lang.Object) attributes42);
        org.jsoup.nodes.Attributes attributes52 = attributes42.clone();
        attributes42.removeIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator55 = attributes42.spliterator();
        java.util.List<org.jsoup.nodes.Attribute> attributeList56 = attributes42.asList();
        boolean boolean57 = attributes17.equals((java.lang.Object) attributeList56);
        boolean boolean58 = attributes0.equals((java.lang.Object) boolean57);
        int int59 = attributes0.size();
        java.util.List<org.jsoup.nodes.Attribute> attributeList60 = attributes0.asList();
        java.util.List<org.jsoup.nodes.Attribute> attributeList61 = attributes0.asList();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + " hi!=\"data-\" data-=\"hi!\"" + "'", str32, " hi!=\"data-\" data-=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(attributes52);
        org.junit.Assert.assertNotNull(attributeSpliterator55);
        org.junit.Assert.assertNotNull(attributeList56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(attributeList60);
        org.junit.Assert.assertNotNull(attributeList61);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        boolean boolean7 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        attributes8.removeIgnoreCase("hi!");
        boolean boolean12 = attributes8.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes8.clone();
        attributes0.addAll(attributes8);
        attributes0.remove("data-");
        attributes0.put("data-", true);
        boolean boolean21 = attributes0.hasKeyIgnoreCase("");
        boolean boolean23 = attributes0.hasKeyIgnoreCase(" data-");
        java.lang.String str25 = attributes0.get("data-");
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        attributes26.removeIgnoreCase("hi!");
        boolean boolean30 = attributes26.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes31 = attributes26.clone();
        boolean boolean33 = attributes31.hasKeyIgnoreCase("");
        java.lang.String str34 = attributes31.toString();
        java.lang.String str35 = attributes31.toString();
        java.lang.String str36 = attributes31.html();
        attributes0.addAll(attributes31);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator38 = attributes0.spliterator();
        org.jsoup.nodes.Attribute attribute39 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(attributeSpliterator38);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes7.dataset();
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        boolean boolean11 = attributes9.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = attributes9.dataset();
        boolean boolean14 = attributes9.hasKey("data-");
        boolean boolean16 = attributes9.hasKeyIgnoreCase("");
        attributes7.addAll(attributes9);
        boolean boolean18 = attributes0.equals((java.lang.Object) attributes9);
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        boolean boolean21 = attributes19.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = attributes19.dataset();
        boolean boolean24 = attributes19.hasKey("data-");
        boolean boolean26 = attributes19.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes27 = new org.jsoup.nodes.Attributes();
        attributes27.removeIgnoreCase("hi!");
        boolean boolean31 = attributes27.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes32 = attributes27.clone();
        attributes19.addAll(attributes27);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor34 = attributes27.iterator();
        boolean boolean35 = attributes9.equals((java.lang.Object) attributeItor34);
        java.lang.String str36 = attributes9.toString();
        boolean boolean38 = attributes9.hasKeyIgnoreCase("data-");
        boolean boolean40 = attributes9.hasKey(" data-");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(attributeItor34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        int int6 = attributes0.size();
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes0.asList();
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        java.lang.String str10 = attributes8.getIgnoreCase("hi!");
        boolean boolean12 = attributes8.equals((java.lang.Object) 100.0d);
        org.jsoup.nodes.Attributes attributes13 = attributes8.clone();
        org.jsoup.nodes.Attributes attributes14 = attributes8.clone();
        boolean boolean15 = attributes0.equals((java.lang.Object) attributes14);
        int int16 = attributes14.size();
        attributes14.put(" hi!=\"data-\"=\"\"", " hi!=\"data-\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributeList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        java.lang.String str9 = attributes7.get("data-");
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        attributes7.html(appendable10, outputSettings11);
        attributes7.put(" hi!=\"data-\"", true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        attributes0.removeIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        boolean boolean6 = attributes4.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes4.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes4.dataset();
        attributes4.remove("hi!");
        java.lang.String str12 = attributes4.getIgnoreCase("hi!");
        attributes4.removeIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        boolean boolean15 = attributes0.equals((java.lang.Object) attributes4);
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        boolean boolean18 = attributes16.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList19 = attributes16.asList();
        int int20 = attributes16.size();
        boolean boolean21 = attributes4.equals((java.lang.Object) int20);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = attributes4.dataset();
        org.jsoup.nodes.Attribute attribute23 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes4.put(attribute23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributeList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        boolean boolean4 = attributes2.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes2.dataset();
        boolean boolean7 = attributes2.hasKey("data-");
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.removeIgnoreCase("hi!");
        boolean boolean14 = attributes10.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes15 = attributes10.clone();
        attributes2.addAll(attributes10);
        attributes2.remove("data-");
        boolean boolean19 = attributes0.equals((java.lang.Object) attributes2);
        java.util.List<org.jsoup.nodes.Attribute> attributeList20 = attributes0.asList();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator21 = attributeList20.spliterator();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(attributeList20);
        org.junit.Assert.assertNotNull(attributeSpliterator21);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        boolean boolean4 = attributes2.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes2.dataset();
        boolean boolean7 = attributes2.hasKey("data-");
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.removeIgnoreCase("hi!");
        boolean boolean14 = attributes10.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes15 = attributes10.clone();
        attributes2.addAll(attributes10);
        attributes2.remove("data-");
        boolean boolean19 = attributes0.equals((java.lang.Object) attributes2);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = attributes2.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(attributeItor20);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        attributes0.put("data-", true);
        java.lang.String str11 = attributes0.html();
        attributes0.removeIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        java.lang.Class<?> wildcardClass14 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " data-" + "'", str11, " data-");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        attributes0.html(appendable7, outputSettings8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        attributes0.put("data-", "hi!");
        java.lang.String str15 = attributes0.html();
        boolean boolean17 = attributes0.hasKeyIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        attributes0.removeIgnoreCase(" hi!=\"data-\" data-=\"data-\"=\"data-\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " hi!=\"data-\" data-=\"hi!\"" + "'", str15, " hi!=\"data-\" data-=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes0.iterator();
        java.lang.String str8 = attributes0.html();
        boolean boolean10 = attributes0.hasKeyIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        org.jsoup.nodes.Attributes attributes11 = attributes0.clone();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = attributes0.dataset();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        attributes0.put("data-", "hi!");
        java.lang.String str15 = attributes0.html();
        boolean boolean17 = attributes0.hasKeyIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator18 = attributes0.spliterator();
        java.lang.String str19 = attributes0.toString();
        boolean boolean21 = attributes0.hasKey(" hi!=\"data-\"");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor22 = attributes0.iterator();
        java.lang.Class<?> wildcardClass23 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " hi!=\"data-\" data-=\"hi!\"" + "'", str15, " hi!=\"data-\" data-=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " hi!=\"data-\" data-=\"hi!\"" + "'", str19, " hi!=\"data-\" data-=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributeItor22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        boolean boolean7 = attributes0.hasKey("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        boolean boolean7 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        attributes8.removeIgnoreCase("hi!");
        boolean boolean12 = attributes8.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes8.clone();
        attributes0.addAll(attributes8);
        attributes0.put(" data-", false);
        java.lang.String str18 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = attributes0.dataset();
        java.lang.String str20 = attributes0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("hi!");
        java.lang.String str9 = attributes0.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator10 = attributes0.spliterator();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributeSpliterator10);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes0.dataset();
        attributes0.remove("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes0.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes0.dataset();
        java.util.List<org.jsoup.nodes.Attribute> attributeList9 = attributes0.asList();
        java.util.List<org.jsoup.nodes.Attribute> attributeList10 = attributes0.asList();
        int int11 = attributes0.size();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(attributeList9);
        org.junit.Assert.assertNotNull(attributeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributeItor12);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        java.lang.String str8 = attributes0.get("data-");
        attributes0.put(" data-", false);
        int int12 = attributes0.size();
        java.lang.String str13 = attributes0.html();
        boolean boolean15 = attributes0.hasKeyIgnoreCase(" data-");
        java.lang.Class<?> wildcardClass16 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        boolean boolean7 = attributes5.hasKeyIgnoreCase("");
        attributes5.put(" data-", true);
        org.jsoup.nodes.Attributes attributes11 = attributes5.clone();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        boolean boolean14 = attributes12.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes12.dataset();
        boolean boolean17 = attributes12.hasKey("data-");
        boolean boolean19 = attributes12.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        attributes20.removeIgnoreCase("hi!");
        boolean boolean24 = attributes20.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes25 = attributes20.clone();
        attributes12.addAll(attributes20);
        attributes12.remove("data-");
        attributes12.put("data-", true);
        attributes11.addAll(attributes12);
        org.jsoup.nodes.Attributes attributes33 = attributes11.clone();
        org.jsoup.nodes.Attributes attributes34 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = attributes34.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator36 = attributes34.spliterator();
        java.lang.String str37 = attributes34.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList38 = attributes34.asList();
        attributes34.removeIgnoreCase("hi!");
        boolean boolean42 = attributes34.hasKey("hi!");
        boolean boolean43 = attributes11.equals((java.lang.Object) boolean42);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(attributeSpliterator36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(attributeList38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        attributes0.removeIgnoreCase("data-");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes9 = attributes0.clone();
        java.lang.String str10 = attributes0.html();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes0.dataset();
        org.jsoup.nodes.Attribute attribute12 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(attributeItor8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("hi!");
        java.lang.String str9 = attributes0.toString();
        java.lang.String str11 = attributes0.getIgnoreCase(" hi!=\"data-\" data-=\"data-\"=\"data-\"");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        java.lang.String str10 = attributes0.html();
        java.lang.String str11 = attributes0.html();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        attributes0.html(appendable12, outputSettings13);
        java.util.List<org.jsoup.nodes.Attribute> attributeList15 = attributes0.asList();
        attributes0.removeIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        boolean boolean20 = attributes18.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = attributes18.dataset();
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        boolean boolean24 = attributes22.hasKey("");
        attributes22.remove("hi!");
        boolean boolean28 = attributes22.hasKeyIgnoreCase("hi!");
        boolean boolean30 = attributes22.hasKey("");
        attributes22.put("hi!", "data-");
        attributes22.put("data-", "hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList37 = attributes22.asList();
        boolean boolean38 = attributes18.equals((java.lang.Object) attributes22);
        attributes22.removeIgnoreCase("data-");
        attributes0.addAll(attributes22);
        java.lang.String str42 = attributes22.toString();
        // The following exception was thrown during execution in test generation
        try {
            attributes22.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributeList15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(attributeList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + " hi!=\"data-\"" + "'", str42, " hi!=\"data-\"");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        attributes0.put("data-", "hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList15 = attributes0.asList();
        java.lang.String str17 = attributes0.getIgnoreCase("hi!");
        java.lang.String str19 = attributes0.get("data-");
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = attributes20.dataset();
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        boolean boolean24 = attributes22.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap25 = attributes22.dataset();
        boolean boolean27 = attributes22.hasKey("data-");
        boolean boolean29 = attributes22.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes30 = new org.jsoup.nodes.Attributes();
        attributes30.removeIgnoreCase("hi!");
        boolean boolean34 = attributes30.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes35 = attributes30.clone();
        attributes22.addAll(attributes30);
        attributes22.remove("data-");
        boolean boolean39 = attributes20.equals((java.lang.Object) attributes22);
        org.jsoup.nodes.Attributes attributes40 = new org.jsoup.nodes.Attributes();
        boolean boolean42 = attributes40.hasKey("");
        attributes40.remove("hi!");
        boolean boolean46 = attributes40.hasKeyIgnoreCase("hi!");
        boolean boolean48 = attributes40.equals((java.lang.Object) 100L);
        java.lang.String str50 = attributes40.get("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator51 = attributes40.spliterator();
        boolean boolean53 = attributes40.hasKeyIgnoreCase("hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList54 = attributes40.asList();
        boolean boolean55 = attributes20.equals((java.lang.Object) attributes40);
        java.util.List<org.jsoup.nodes.Attribute> attributeList56 = attributes40.asList();
        attributes40.removeIgnoreCase(" hi!=\"data-\" data-=\"data-\"=\"data-\"");
        attributes0.addAll(attributes40);
        attributes40.put("hi!", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "data-" + "'", str17, "data-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(attributeSpliterator51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(attributeList54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(attributeList56);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator11 = attributes0.spliterator();
        boolean boolean13 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes0.iterator();
        boolean boolean16 = attributes0.hasKey(" hi!=\"data-\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes0.dataset();
        attributes0.put(" data-", "");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        boolean boolean14 = attributes12.hasKey("");
        attributes12.remove("hi!");
        boolean boolean18 = attributes12.hasKeyIgnoreCase("hi!");
        boolean boolean20 = attributes12.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor21 = attributes12.iterator();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator22 = attributes12.spliterator();
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.lang.String str25 = attributes23.get("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = attributes23.dataset();
        org.jsoup.nodes.Attributes attributes27 = new org.jsoup.nodes.Attributes();
        boolean boolean29 = attributes27.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = attributes27.dataset();
        boolean boolean32 = attributes27.hasKey("data-");
        boolean boolean34 = attributes27.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes35 = new org.jsoup.nodes.Attributes();
        attributes35.removeIgnoreCase("hi!");
        boolean boolean39 = attributes35.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes40 = attributes35.clone();
        attributes27.addAll(attributes35);
        attributes27.remove("data-");
        attributes23.addAll(attributes27);
        attributes27.put(" hi!=\"data-\" data-=\"data-\"", "");
        attributes12.addAll(attributes27);
        attributes0.addAll(attributes12);
        boolean boolean51 = attributes0.hasKeyIgnoreCase("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributeItor21);
        org.junit.Assert.assertNotNull(attributeSpliterator22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        attributes0.put("hi!", "data-");
        boolean boolean10 = attributes0.hasKey(" hi!=\"data-\" data-=\"hi!\" hi!=\"data-\" data-=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str2 = attributes0.get("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.lang.String str6 = attributes4.get("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes4.dataset();
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        boolean boolean10 = attributes8.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = attributes8.dataset();
        boolean boolean13 = attributes8.hasKey("data-");
        boolean boolean15 = attributes8.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        attributes16.removeIgnoreCase("hi!");
        boolean boolean20 = attributes16.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes21 = attributes16.clone();
        attributes8.addAll(attributes16);
        attributes8.remove("data-");
        attributes4.addAll(attributes8);
        java.lang.String str27 = attributes8.getIgnoreCase("hi!");
        boolean boolean28 = attributes0.equals((java.lang.Object) attributes8);
        org.jsoup.nodes.Attributes attributes29 = attributes8.clone();
        // The following exception was thrown during execution in test generation
        try {
            attributes29.put("", " hi!=\"data-\" data-=\"data-\"=\"data-\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(attributes29);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator11 = attributes0.spliterator();
        java.lang.String str13 = attributes0.getIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        attributes14.removeIgnoreCase("hi!");
        boolean boolean18 = attributes14.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes14.iterator();
        boolean boolean20 = attributes0.equals((java.lang.Object) attributeItor19);
        attributes0.put(" data-", " data-");
        attributes0.put(" data-=\"hi!\"", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeSpliterator11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributeItor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator11 = attributes0.spliterator();
        java.lang.String str13 = attributes0.getIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        attributes14.removeIgnoreCase("hi!");
        boolean boolean18 = attributes14.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes14.iterator();
        boolean boolean20 = attributes0.equals((java.lang.Object) attributeItor19);
        attributes0.put(" data-", " data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator24 = attributes0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = attributes0.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeSpliterator11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributeItor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator24);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        attributes0.put("hi!", "data-");
        java.util.List<org.jsoup.nodes.Attribute> attributeList9 = attributes0.asList();
        java.lang.Class<?> wildcardClass10 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes0.iterator();
        java.lang.String str8 = attributes0.html();
        boolean boolean10 = attributes0.hasKeyIgnoreCase("");
        java.lang.String str12 = attributes0.getIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes0.iterator();
        java.lang.String str15 = attributes0.getIgnoreCase("hi!");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        boolean boolean6 = attributes0.hasKeyIgnoreCase("");
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        attributes0.html(appendable7, outputSettings8);
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        boolean boolean12 = attributes10.hasKey("");
        attributes10.remove("hi!");
        boolean boolean16 = attributes10.hasKeyIgnoreCase("hi!");
        boolean boolean18 = attributes10.equals((java.lang.Object) 100L);
        java.lang.String str20 = attributes10.get("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator21 = attributes10.spliterator();
        boolean boolean23 = attributes10.hasKeyIgnoreCase("hi!");
        attributes0.addAll(attributes10);
        java.lang.String str26 = attributes10.getIgnoreCase("data-");
        java.lang.String str28 = attributes10.get(" hi!=\"data-\" data-=\"hi!\"");
        // The following exception was thrown during execution in test generation
        try {
            attributes10.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributeSpliterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        attributes0.html(appendable11, outputSettings12);
        java.lang.String str15 = attributes0.get("hi!");
        attributes0.put(" hi!=\"data-\" data-=\"hi!\"", "data-");
        java.lang.Class<?> wildcardClass19 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("hi!");
        int int9 = attributes0.size();
        java.lang.String str10 = attributes0.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator11 = attributes0.spliterator();
        java.lang.Class<?> wildcardClass12 = attributeSpliterator11.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeSpliterator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        java.lang.String str5 = attributes0.getIgnoreCase(" hi!=\"data-\"");
        java.lang.Class<?> wildcardClass6 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        int int10 = attributes0.size();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes0.iterator();
        boolean boolean14 = attributes0.hasKeyIgnoreCase(" data-=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        int int6 = attributes0.size();
        java.lang.String str7 = attributes0.html();
        attributes0.put("data-", true);
        java.lang.String str11 = attributes0.html();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " data-" + "'", str11, " data-");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList3 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator6 = attributes0.spliterator();
        java.lang.Class<?> wildcardClass7 = attributeSpliterator6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(attributeList3);
        org.junit.Assert.assertNotNull(attributeSpliterator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        boolean boolean7 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        attributes8.removeIgnoreCase("hi!");
        boolean boolean12 = attributes8.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes8.clone();
        attributes0.addAll(attributes8);
        attributes0.remove("data-");
        attributes0.put("data-", true);
        boolean boolean21 = attributes0.hasKeyIgnoreCase("");
        attributes0.put("hi!", " hi!=\"data-\" data-=\"data-\"");
        java.util.Map<java.lang.String, java.lang.String> strMap25 = attributes0.dataset();
        int int26 = attributes0.size();
        java.util.List<org.jsoup.nodes.Attribute> attributeList27 = attributes0.asList();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(attributeList27);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        int int10 = attributes0.size();
        attributes0.remove("data-");
        java.lang.String str13 = attributes0.html();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = attributes0.getIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributeItor14);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        boolean boolean4 = attributes2.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes2.dataset();
        boolean boolean7 = attributes2.hasKey("data-");
        boolean boolean9 = attributes2.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        attributes10.removeIgnoreCase("hi!");
        boolean boolean14 = attributes10.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes15 = attributes10.clone();
        attributes2.addAll(attributes10);
        attributes2.remove("data-");
        boolean boolean19 = attributes0.equals((java.lang.Object) attributes2);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes2.iterator();
        attributes2.remove("hi!");
        java.lang.String str23 = attributes2.html();
        java.lang.String str25 = attributes2.getIgnoreCase("data-");
        java.lang.Class<?> wildcardClass26 = attributes2.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator11 = attributes0.spliterator();
        boolean boolean13 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.List<org.jsoup.nodes.Attribute> attributeList14 = attributes0.asList();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator15 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = attributes16.dataset();
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        boolean boolean20 = attributes18.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = attributes18.dataset();
        boolean boolean23 = attributes18.hasKey("data-");
        boolean boolean25 = attributes18.hasKeyIgnoreCase("");
        attributes16.addAll(attributes18);
        int int27 = attributes18.size();
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        boolean boolean30 = attributes28.hasKey("");
        attributes28.remove("hi!");
        boolean boolean34 = attributes28.hasKeyIgnoreCase("hi!");
        attributes18.addAll(attributes28);
        attributes28.put(" data-", false);
        attributes0.addAll(attributes28);
        java.lang.Class<?> wildcardClass40 = attributes28.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributeList14);
        org.junit.Assert.assertNotNull(attributeSpliterator15);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.equals((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Attribute> attributeList6 = attributes0.asList();
        java.lang.String str8 = attributes0.getIgnoreCase(" hi!=\"data-\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        attributes0.put("hi!", "data-");
        java.util.List<org.jsoup.nodes.Attribute> attributeList9 = attributes0.asList();
        java.lang.String str11 = attributes0.getIgnoreCase("data-");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator12 = attributes0.spliterator();
        boolean boolean14 = attributes0.equals((java.lang.Object) '#');
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        attributes15.removeIgnoreCase("hi!");
        boolean boolean19 = attributes15.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes20 = attributes15.clone();
        boolean boolean22 = attributes20.hasKeyIgnoreCase("");
        attributes20.put(" data-", true);
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = attributes26.dataset();
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        boolean boolean30 = attributes28.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = attributes28.dataset();
        boolean boolean33 = attributes28.hasKey("data-");
        boolean boolean35 = attributes28.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes36 = new org.jsoup.nodes.Attributes();
        attributes36.removeIgnoreCase("hi!");
        boolean boolean40 = attributes36.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes41 = attributes36.clone();
        attributes28.addAll(attributes36);
        attributes28.remove("data-");
        boolean boolean45 = attributes26.equals((java.lang.Object) attributes28);
        java.lang.Appendable appendable46 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = null;
        attributes26.html(appendable46, outputSettings47);
        org.jsoup.nodes.Attributes attributes49 = attributes26.clone();
        boolean boolean50 = attributes20.equals((java.lang.Object) attributes49);
        attributes0.addAll(attributes20);
        // The following exception was thrown during execution in test generation
        try {
            attributes20.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributeSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        attributes0.removeIgnoreCase("data-");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes9 = attributes0.clone();
        java.util.List<org.jsoup.nodes.Attribute> attributeList10 = attributes0.asList();
        java.lang.String str11 = attributes0.html();
        attributes0.put(" data-=\"hi!\"", true);
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        boolean boolean17 = attributes15.hasKey("");
        attributes15.remove("hi!");
        boolean boolean21 = attributes15.hasKeyIgnoreCase("hi!");
        java.lang.String str22 = attributes15.toString();
        java.lang.String str23 = attributes15.html();
        attributes15.remove(" hi!=\"data-\" data-=\"hi!\" hi!=\"data-\" data-=\"hi!\"");
        attributes0.addAll(attributes15);
        // The following exception was thrown during execution in test generation
        try {
            attributes15.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(attributeItor8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        attributes0.put("data-", "hi!");
        java.lang.String str16 = attributes0.getIgnoreCase("data-");
        attributes0.put("data-", "data-");
        org.jsoup.nodes.Attributes attributes20 = attributes0.clone();
        org.jsoup.nodes.Attributes attributes21 = attributes0.clone();
        int int22 = attributes21.size();
        org.jsoup.nodes.Attribute attribute23 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes21.put(attribute23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        java.lang.String str10 = attributes0.html();
        java.lang.String str11 = attributes0.html();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        attributes0.html(appendable12, outputSettings13);
        boolean boolean16 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes0.iterator();
        int int18 = attributes0.size();
        java.lang.String str19 = attributes0.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes0.iterator();
        boolean boolean22 = attributes0.hasKey(" hi!=\"data-\" data-=\"hi!\"");
        org.jsoup.nodes.Attribute attribute23 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        boolean boolean7 = attributes5.hasKeyIgnoreCase("");
        attributes5.put(" data-", true);
        org.jsoup.nodes.Attributes attributes11 = attributes5.clone();
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        boolean boolean14 = attributes12.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes12.dataset();
        boolean boolean17 = attributes12.hasKey("data-");
        boolean boolean19 = attributes12.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        attributes20.removeIgnoreCase("hi!");
        boolean boolean24 = attributes20.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes25 = attributes20.clone();
        attributes12.addAll(attributes20);
        attributes12.remove("data-");
        attributes12.put("data-", true);
        attributes11.addAll(attributes12);
        org.jsoup.nodes.Attributes attributes33 = attributes11.clone();
        attributes33.remove(" data-");
        boolean boolean37 = attributes33.hasKey("hi!");
        java.lang.String str38 = attributes33.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + " data-" + "'", str38, " data-");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        int int3 = attributes0.size();
        org.jsoup.nodes.Attributes attributes4 = attributes0.clone();
        attributes0.remove("hi!");
        java.lang.Object obj7 = null;
        boolean boolean8 = attributes0.equals(obj7);
        attributes0.put(" hi!=\"data-\" data-=\"hi!\"", " hi!=\"data-\" data-=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        boolean boolean7 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        attributes8.removeIgnoreCase("hi!");
        boolean boolean12 = attributes8.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes8.clone();
        attributes0.addAll(attributes8);
        java.lang.String str15 = attributes0.html();
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes0.iterator();
        attributes0.put("data-", false);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes0.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes0.dataset();
        java.lang.String str16 = attributes0.get(" data-=\"hi!\"");
        boolean boolean18 = attributes0.hasKey(" hi!=\"data-\" data-=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        boolean boolean7 = attributes0.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        attributes8.removeIgnoreCase("hi!");
        boolean boolean12 = attributes8.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes8.clone();
        attributes0.addAll(attributes8);
        java.lang.String str16 = attributes0.getIgnoreCase("hi!");
        boolean boolean18 = attributes0.hasKeyIgnoreCase(" hi!=\"data-\" data-=\"data-\"=\"data-\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        int int11 = attributes0.size();
        java.lang.String str13 = attributes0.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes14 = attributes0.clone();
        boolean boolean16 = attributes0.hasKeyIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        org.jsoup.nodes.Attributes attributes17 = attributes0.clone();
        // The following exception was thrown during execution in test generation
        try {
            attributes17.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator11 = attributes0.spliterator();
        java.lang.String str13 = attributes0.getIgnoreCase("data-");
        org.jsoup.nodes.Attribute attribute14 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(attributeSpliterator11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        java.lang.String str3 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList4 = attributes0.asList();
        attributes0.removeIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes0.iterator();
        java.lang.String str8 = attributes0.html();
        boolean boolean10 = attributes0.hasKeyIgnoreCase("");
        java.lang.String str12 = attributes0.getIgnoreCase(" hi!=\"data-\" data-=\"hi!\"");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.removeIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeList4);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes0.dataset();
        attributes0.remove("hi!");
        attributes0.put(" data-", "hi!");
        java.lang.String str10 = attributes0.toString();
        boolean boolean12 = attributes0.hasKeyIgnoreCase("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " data-=\"hi!\"" + "'", str10, " data-=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        boolean boolean5 = attributes0.hasKey("data-");
        attributes0.put("hi!", "data-");
        java.util.List<org.jsoup.nodes.Attribute> attributeList9 = attributes0.asList();
        java.lang.String str11 = attributes0.getIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes12 = attributes0.clone();
        int int13 = attributes0.size();
        attributes0.put(" hi!=\"data-\" data-=\"hi!\"", " hi!=\"data-\" data-=\"hi!\"");
        java.lang.Class<?> wildcardClass17 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.equals((java.lang.Object) 100L);
        java.lang.String str10 = attributes0.get("hi!");
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        attributes0.html(appendable11, outputSettings12);
        java.lang.String str14 = attributes0.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator15 = attributes0.spliterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes0.iterator();
        attributes0.put("data-", true);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes0.iterator();
        java.lang.String str22 = attributes0.getIgnoreCase(" hi!=\"data-\"=\"\"");
        java.lang.Class<?> wildcardClass23 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributeSpliterator15);
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        attributes0.put("data-", "hi!");
        java.lang.String str16 = attributes0.getIgnoreCase("data-");
        attributes0.removeIgnoreCase(" data-");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes0.iterator();
        java.lang.Class<?> wildcardClass20 = attributeItor19.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(attributeItor19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        attributes0.put("data-", "hi!");
        java.lang.String str16 = attributes0.getIgnoreCase("data-");
        attributes0.put("data-", "data-");
        org.jsoup.nodes.Attributes attributes20 = attributes0.clone();
        org.jsoup.nodes.Attributes attributes21 = attributes0.clone();
        java.lang.String str22 = attributes21.toString();
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator24 = attributes23.spliterator();
        java.lang.String str25 = attributes23.toString();
        java.lang.String str26 = attributes23.html();
        attributes21.addAll(attributes23);
        boolean boolean29 = attributes23.hasKey(" hi!=\"data-\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " hi!=\"data-\" data-=\"data-\"" + "'", str22, " hi!=\"data-\" data-=\"data-\"");
        org.junit.Assert.assertNotNull(attributeSpliterator24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        attributes0.remove("hi!");
        boolean boolean6 = attributes0.hasKeyIgnoreCase("hi!");
        boolean boolean8 = attributes0.hasKey("");
        attributes0.put("hi!", "data-");
        attributes0.put("data-", "hi!");
        java.lang.String str16 = attributes0.getIgnoreCase("data-");
        attributes0.put("data-", "data-");
        org.jsoup.nodes.Attributes attributes20 = attributes0.clone();
        org.jsoup.nodes.Attributes attributes21 = attributes0.clone();
        java.lang.String str22 = attributes21.toString();
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        boolean boolean25 = attributes23.hasKey("");
        attributes23.remove("hi!");
        boolean boolean29 = attributes23.hasKeyIgnoreCase("hi!");
        boolean boolean31 = attributes23.hasKey("");
        attributes23.put("hi!", "data-");
        java.lang.String str36 = attributes23.get("data-");
        org.jsoup.nodes.Attributes attributes37 = new org.jsoup.nodes.Attributes();
        attributes37.removeIgnoreCase("hi!");
        boolean boolean41 = attributes37.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes42 = attributes37.clone();
        java.lang.String str44 = attributes42.getIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor45 = attributes42.iterator();
        int int46 = attributes42.size();
        attributes23.addAll(attributes42);
        boolean boolean48 = attributes21.equals((java.lang.Object) attributes23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str50 = attributes23.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " hi!=\"data-\" data-=\"data-\"" + "'", str22, " hi!=\"data-\" data-=\"data-\"");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(attributeItor45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        java.lang.String str7 = attributes5.getIgnoreCase("hi!");
        java.lang.String str9 = attributes5.get("data-");
        int int10 = attributes5.size();
        attributes5.removeIgnoreCase("hi!");
        attributes5.put("hi!", true);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator16 = attributes5.spliterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes5.iterator();
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        attributes18.removeIgnoreCase("hi!");
        boolean boolean22 = attributes18.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor23 = attributes18.iterator();
        int int24 = attributes18.size();
        org.jsoup.nodes.Attributes attributes25 = new org.jsoup.nodes.Attributes();
        boolean boolean27 = attributes25.hasKey("");
        attributes25.remove("hi!");
        boolean boolean31 = attributes25.hasKeyIgnoreCase("hi!");
        boolean boolean33 = attributes25.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor34 = attributes25.iterator();
        int int35 = attributes25.size();
        attributes25.remove("data-");
        attributes18.addAll(attributes25);
        attributes18.put(" hi!=\"data-\" data-=\"data-\"", false);
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        boolean boolean44 = attributes42.hasKey("");
        attributes42.remove("hi!");
        boolean boolean48 = attributes42.hasKeyIgnoreCase("hi!");
        boolean boolean50 = attributes42.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor51 = attributes42.iterator();
        java.lang.String str52 = attributes42.html();
        java.lang.String str53 = attributes42.html();
        attributes18.addAll(attributes42);
        attributes5.addAll(attributes42);
        java.lang.Appendable appendable56 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings57 = null;
        attributes42.html(appendable56, outputSettings57);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(attributeSpliterator16);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributeItor23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(attributeItor34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(attributeItor51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList3 = attributes0.asList();
        int int4 = attributes0.size();
        attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes8.dataset();
        int int10 = attributes8.size();
        boolean boolean11 = attributes0.equals((java.lang.Object) attributes8);
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        attributes0.html(appendable12, outputSettings13);
        attributes0.put("data-", true);
        java.lang.Class<?> wildcardClass18 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(attributeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes0.dataset();
        attributes0.remove("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes0.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes0.dataset();
        java.util.List<org.jsoup.nodes.Attribute> attributeList9 = attributes0.asList();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator10 = attributes0.spliterator();
        boolean boolean12 = attributes0.hasKeyIgnoreCase("");
        boolean boolean14 = attributes0.hasKey("data-");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(attributeList9);
        org.junit.Assert.assertNotNull(attributeSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = attributes0.dataset();
        java.lang.Class<?> wildcardClass9 = attributes0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        int int6 = attributes0.size();
        java.lang.String str7 = attributes0.html();
        attributes0.put("data-", "");
        attributes0.remove("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes0.dataset();
        int int14 = attributes0.size();
        boolean boolean16 = attributes0.hasKey(" data-");
        int int17 = attributes0.size();
        org.jsoup.nodes.Attribute attribute18 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes2 = attributes0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = attributes2.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributes2);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        boolean boolean7 = attributes0.hasKey("hi!");
        java.lang.String str8 = attributes0.toString();
        org.jsoup.nodes.Attributes attributes9 = attributes0.clone();
        boolean boolean11 = attributes9.hasKey(" hi!=\"data-\" data-=\"data-\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str2 = attributes0.get("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        boolean boolean6 = attributes4.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes4.dataset();
        boolean boolean9 = attributes4.hasKey("data-");
        boolean boolean11 = attributes4.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        attributes12.removeIgnoreCase("hi!");
        boolean boolean16 = attributes12.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes17 = attributes12.clone();
        attributes4.addAll(attributes12);
        attributes4.remove("data-");
        attributes0.addAll(attributes4);
        java.lang.String str22 = attributes0.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator23 = attributes0.spliterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes0.iterator();
        java.lang.Class<?> wildcardClass25 = attributes0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributeSpliterator23);
        org.junit.Assert.assertNotNull(attributeItor24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator2 = attributes0.spliterator();
        int int3 = attributes0.size();
        java.lang.String str4 = attributes0.toString();
        java.util.List<org.jsoup.nodes.Attribute> attributeList5 = attributes0.asList();
        java.util.List<org.jsoup.nodes.Attribute> attributeList6 = attributes0.asList();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
        org.junit.Assert.assertNotNull(attributeSpliterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributeList5);
        org.junit.Assert.assertNotNull(attributeList6);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        boolean boolean7 = attributes5.hasKeyIgnoreCase("");
        java.lang.String str8 = attributes5.toString();
        java.lang.String str9 = attributes5.toString();
        java.lang.String str10 = attributes5.html();
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        boolean boolean13 = attributes11.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = attributes11.dataset();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = attributes11.dataset();
        attributes11.remove("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = attributes11.dataset();
        boolean boolean19 = attributes5.equals((java.lang.Object) strMap18);
        org.jsoup.nodes.Attributes attributes20 = attributes5.clone();
        attributes20.remove("data-");
        org.jsoup.nodes.Attributes attributes23 = attributes20.clone();
        java.lang.Class<?> wildcardClass24 = attributes23.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.lang.String str2 = attributes0.get("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = attributes0.dataset();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        boolean boolean6 = attributes4.hasKey("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes4.dataset();
        boolean boolean9 = attributes4.hasKey("data-");
        boolean boolean11 = attributes4.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        attributes12.removeIgnoreCase("hi!");
        boolean boolean16 = attributes12.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes17 = attributes12.clone();
        attributes4.addAll(attributes12);
        attributes4.remove("data-");
        attributes0.addAll(attributes4);
        java.lang.Object obj22 = null;
        boolean boolean23 = attributes0.equals(obj22);
        boolean boolean25 = attributes0.hasKey("");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor26 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes27 = new org.jsoup.nodes.Attributes();
        java.lang.String str29 = attributes27.getIgnoreCase("hi!");
        boolean boolean31 = attributes27.equals((java.lang.Object) 100.0d);
        org.jsoup.nodes.Attributes attributes32 = attributes27.clone();
        org.jsoup.nodes.Attributes attributes33 = attributes27.clone();
        java.lang.String str34 = attributes33.toString();
        boolean boolean35 = attributes0.equals((java.lang.Object) str34);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator36 = attributes0.spliterator();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributeItor26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator36);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        boolean boolean2 = attributes0.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList3 = attributes0.asList();
        int int4 = attributes0.size();
        attributes0.put("hi!", false);
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = attributes8.dataset();
        int int10 = attributes8.size();
        boolean boolean11 = attributes0.equals((java.lang.Object) attributes8);
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        attributes0.html(appendable12, outputSettings13);
        attributes0.put("data-", true);
        boolean boolean19 = attributes0.hasKey(" hi!=\"data-\" data-=\"hi!\" hi!=\"data-\" data-=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(attributeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        java.lang.String str7 = attributes5.getIgnoreCase("hi!");
        java.lang.String str9 = attributes5.get("data-");
        java.lang.String str10 = attributes5.html();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        attributes5.html(appendable11, outputSettings12);
        java.lang.String str14 = attributes5.html();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        int int6 = attributes0.size();
        org.jsoup.nodes.Attributes attributes7 = attributes0.clone();
        attributes0.put("data-", true);
        java.lang.String str11 = attributes0.toString();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.html(appendable12, outputSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " data-" + "'", str11, " data-");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        attributes0.removeIgnoreCase("hi!");
        boolean boolean4 = attributes0.hasKeyIgnoreCase("hi!");
        org.jsoup.nodes.Attributes attributes5 = attributes0.clone();
        boolean boolean7 = attributes5.hasKeyIgnoreCase("");
        java.lang.String str8 = attributes5.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator9 = attributes5.spliterator();
        attributes5.removeIgnoreCase("data-");
        org.jsoup.nodes.Attributes attributes12 = attributes5.clone();
        org.jsoup.nodes.Attributes attributes13 = attributes5.clone();
        java.lang.Class<?> wildcardClass14 = attributes5.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributeSpliterator9);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }
}

