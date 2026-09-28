package org.apache.commons.collections;

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
        java.util.Properties properties0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties1 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("", "");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.Class<?> wildcardClass4 = extendedProperties0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader1 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = extendedProperties0.getInt("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        // The following exception was thrown during execution in test generation
        try {
            float float5 = extendedProperties0.getFloat("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Class<?> wildcardClass5 = extendedProperties0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.lang.String str0 = org.apache.commons.collections.ExtendedProperties.END_TOKEN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "}" + "'", str0, "}");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        extendedProperties0.setInclude("hi!");
        // The following exception was thrown during execution in test generation
        try {
            float float8 = extendedProperties0.getFloat("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.commons.collections.ExtendedProperties.include = "";
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        // The following exception was thrown during execution in test generation
        try {
            float float7 = extendedProperties0.getFloat("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.addProperty("hi!", obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        extendedProperties0.setInclude("hi!");
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream7, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.lang.String str0 = org.apache.commons.collections.ExtendedProperties.include;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hi!" + "'", str0, "hi!");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        // The following exception was thrown during execution in test generation
        try {
            float float7 = extendedProperties0.getFloat("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj7 = extendedProperties5.getProperty("");
        java.util.List list9 = extendedProperties5.getList("hi!");
        extendedProperties0.addProperty("", (java.lang.Object) list9);
        // The following exception was thrown during execution in test generation
        try {
            float float12 = extendedProperties0.getFloat("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        extendedProperties8.setProperty("}", (java.lang.Object) "}");
        // The following exception was thrown during execution in test generation
        try {
            double double13 = extendedProperties8.getDouble("}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"}\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        extendedProperties8.setProperty("}", (java.lang.Object) "}");
        // The following exception was thrown during execution in test generation
        try {
            float float13 = extendedProperties8.getFloat("}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"}\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        // The following exception was thrown during execution in test generation
        try {
            float float6 = extendedProperties0.getFloat("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str4 = extendedProperties0.interpolate("}");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = extendedProperties0.getInt("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            byte byte7 = extendedProperties0.getByte("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi! doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = extendedProperties8.getInt("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = extendedProperties0.subset("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = extendedProperties5.fileSeparator;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(extendedProperties5);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.lang.String str0 = org.apache.commons.collections.ExtendedProperties.START_TOKEN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "${" + "'", str0, "${");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        extendedProperties0.file = "";
        // The following exception was thrown during execution in test generation
        try {
            float float7 = extendedProperties0.getFloat("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte byte7 = extendedProperties0.getByte("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/ doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator10 = extendedProperties0.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list14 = extendedProperties12.getList("");
        java.lang.String str16 = extendedProperties12.testBoolean("");
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.addProperty("", (java.lang.Object) str16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        extendedProperties0.setInclude("hi!");
        java.util.List list8 = extendedProperties0.getList("hi!");
        java.lang.String str9 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = extendedProperties0.subset("/");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = extendedProperties0.getBoolean("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(extendedProperties11);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        java.io.InputStream inputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties8.load(inputStream9, "}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        java.util.Properties properties6 = null;
        java.util.Properties properties7 = extendedProperties0.getProperties("", properties6);
        int int10 = extendedProperties0.getInt("hi!", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            float float12 = extendedProperties0.getFloat("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        int int5 = extendedProperties0.getInt("hi!", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            float float7 = extendedProperties0.getFloat("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("}", "${");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: } (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        java.util.Properties properties6 = null;
        java.util.Properties properties7 = extendedProperties0.getProperties("", properties6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties7);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        int int6 = extendedProperties0.getInt("/", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            float float8 = extendedProperties0.getFloat("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.commons.collections.ExtendedProperties.include = "}";
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.commons.collections.ExtendedProperties.include = "/";
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        org.apache.commons.collections.ExtendedProperties extendedProperties4 = new org.apache.commons.collections.ExtendedProperties();
        short short7 = extendedProperties4.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj11 = extendedProperties9.getProperty("");
        java.util.List list13 = extendedProperties9.getList("hi!");
        extendedProperties4.addProperty("", (java.lang.Object) list13);
        java.lang.String str15 = extendedProperties0.interpolateHelper("", list13);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = extendedProperties0.getDouble("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        extendedProperties0.setInclude("hi!");
        java.util.List list8 = extendedProperties0.getList("hi!");
        java.lang.String str9 = extendedProperties0.getInclude();
        float float12 = extendedProperties0.getFloat("/", (float) 100L);
        java.lang.Class<?> wildcardClass13 = extendedProperties0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("/", "");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: / (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        short short7 = extendedProperties0.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj11 = extendedProperties9.getProperty("");
        long long14 = extendedProperties9.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList15 = extendedProperties9.keysAsListed;
        java.util.Vector vector17 = extendedProperties9.getVector("");
        java.util.Vector vector18 = extendedProperties0.getVector("}", vector17);
        // The following exception was thrown during execution in test generation
        try {
            short short20 = extendedProperties0.getShort("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(arrayList15);
        org.junit.Assert.assertNotNull(vector17);
        org.junit.Assert.assertNotNull(vector18);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        short short10 = extendedProperties0.getShort("", (short) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        short short14 = extendedProperties11.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = extendedProperties11.subset("");
        long long19 = extendedProperties11.getLong("/", (long) (short) 0);
        extendedProperties0.combine(extendedProperties11);
        // The following exception was thrown during execution in test generation
        try {
            short short22 = extendedProperties0.getShort("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertNull(extendedProperties16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = extendedProperties0.getInt("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.lang.String str4 = extendedProperties0.testBoolean("");
        double double7 = extendedProperties0.getDouble("/", (double) 10L);
        java.lang.String str9 = extendedProperties0.getString("");
        // The following exception was thrown during execution in test generation
        try {
            short short11 = extendedProperties0.getShort("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        long long3 = extendedProperties0.getLong("hi!", (long) 1);
        java.lang.Boolean boolean6 = extendedProperties0.getBoolean("", (java.lang.Boolean) false);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = extendedProperties0.getInt("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        // The following exception was thrown during execution in test generation
        try {
            long long6 = extendedProperties0.getLong("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list10 = extendedProperties8.getList("");
        double double13 = extendedProperties8.getDouble("hi!", 100.0d);
        extendedProperties0.setProperty("", (java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray16 = extendedProperties0.getStringArray("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: '' doesn't map to a String/List object");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        java.util.Properties properties6 = null;
        java.util.Properties properties7 = extendedProperties0.getProperties("", properties6);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj11 = extendedProperties9.getProperty("");
        java.util.List list13 = extendedProperties9.getList("hi!");
        extendedProperties9.setInclude("hi!");
        java.util.List list17 = extendedProperties9.getList("hi!");
        java.lang.String str18 = extendedProperties9.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = extendedProperties9.subset("/");
        java.util.ArrayList arrayList21 = extendedProperties9.keysAsListed;
        java.util.List list22 = extendedProperties0.getList("", (java.util.List) arrayList21);
        java.io.InputStream inputStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(extendedProperties20);
        org.junit.Assert.assertNotNull(arrayList21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties("${");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ${ (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = reader0.transferTo(writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        extendedProperties0.file = "/";
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = extendedProperties0.getBoolean("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        extendedProperties8.setProperty("}", (java.lang.Object) "}");
        java.lang.Long long14 = extendedProperties8.getLong("/", (java.lang.Long) 1L);
        // The following exception was thrown during execution in test generation
        try {
            float float16 = extendedProperties8.getFloat("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.Object obj7 = extendedProperties0.getProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = extendedProperties0.getBoolean("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = extendedProperties0.getInt("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.lang.String str7 = extendedProperties0.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list11 = extendedProperties9.getList("");
        java.lang.String str13 = extendedProperties9.testBoolean("");
        double double16 = extendedProperties9.getDouble("/", (double) 10L);
        java.util.List list18 = extendedProperties9.getList("");
        java.lang.String str19 = extendedProperties0.interpolateHelper("${", list18);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = extendedProperties0.getInt("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "${" + "'", str19, "${");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = extendedProperties0.subset("");
        long long8 = extendedProperties0.getLong("/", (long) (short) 0);
        float float11 = extendedProperties0.getFloat("/", 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            byte byte13 = extendedProperties0.getByte("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(extendedProperties5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        java.lang.Object obj9 = extendedProperties0.getProperty("${");
        short short12 = extendedProperties0.getShort("}", (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            short short14 = extendedProperties0.getShort("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) -1 + "'", short12 == (short) -1);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        extendedProperties8.display();
        int int12 = extendedProperties8.getInteger("${", (int) (byte) 10);
        java.lang.String[] strArray14 = extendedProperties8.getStringArray("/");
        java.lang.Class<?> wildcardClass15 = strArray14.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        byte byte6 = extendedProperties0.getByte("", (byte) 1);
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        short short10 = extendedProperties0.getShort("", (short) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        short short14 = extendedProperties11.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = extendedProperties11.subset("");
        long long19 = extendedProperties11.getLong("/", (long) (short) 0);
        extendedProperties0.combine(extendedProperties11);
        java.lang.Class<?> wildcardClass21 = extendedProperties11.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertNull(extendedProperties16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties("/");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: / (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        long long3 = extendedProperties0.getLong("hi!", (long) 1);
        long long6 = extendedProperties0.getLong("/", (long) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double8 = extendedProperties0.getDouble("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        java.lang.String str5 = extendedProperties0.getInclude();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = extendedProperties0.getDouble("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        extendedProperties8.display();
        int int12 = extendedProperties8.getInteger("${", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = extendedProperties8.getLong("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.ready();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        extendedProperties0.setInclude("hi!");
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream7, "/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = extendedProperties0.subset("");
        long long8 = extendedProperties0.getLong("/", (long) (short) 0);
        extendedProperties0.setInclude("${");
        // The following exception was thrown during execution in test generation
        try {
            double double12 = extendedProperties0.getDouble("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(extendedProperties5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj11 = extendedProperties9.getProperty("");
        java.util.List list13 = extendedProperties9.getList("hi!");
        short short16 = extendedProperties9.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj20 = extendedProperties18.getProperty("");
        long long23 = extendedProperties18.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList24 = extendedProperties18.keysAsListed;
        java.util.Vector vector26 = extendedProperties18.getVector("");
        java.util.Vector vector27 = extendedProperties9.getVector("}", vector26);
        java.lang.String str28 = extendedProperties0.interpolateHelper("", (java.util.List) vector27);
        java.io.InputStream inputStream29 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream29, "/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 10 + "'", short16 == (short) 10);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertNotNull(arrayList24);
        org.junit.Assert.assertNotNull(vector26);
        org.junit.Assert.assertNotNull(vector27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        java.util.Properties properties6 = null;
        java.util.Properties properties7 = extendedProperties0.getProperties("", properties6);
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        int int11 = extendedProperties8.getInteger("", 32);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = extendedProperties8.getDouble("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        java.lang.Class<?> wildcardClass2 = propertiesTokenizer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.lang.String str0 = org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer.DELIMITER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "," + "'", str0, ",");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        byte byte6 = extendedProperties0.getByte("", (byte) 1);
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream7, ",");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj7 = extendedProperties5.getProperty("");
        java.util.List list9 = extendedProperties5.getList("hi!");
        extendedProperties0.addProperty("", (java.lang.Object) list9);
        java.lang.String str11 = extendedProperties0.getInclude();
        extendedProperties0.isInitialized = true;
        extendedProperties0.fileSeparator = "${";
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(list9);
// flaky "1) test0075(org.apache.commons.collections.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "${" + "'", str11, "${");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = extendedProperties0.subset("");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = extendedProperties5.getInteger("${", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(extendedProperties5);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        int int10 = extendedProperties0.getInt("${", (int) (byte) 100);
        java.lang.String str11 = extendedProperties0.file;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = extendedProperties0.getBoolean("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj7 = extendedProperties5.getProperty("");
        java.util.List list9 = extendedProperties5.getList("hi!");
        extendedProperties0.addProperty("", (java.lang.Object) list9);
        float float13 = extendedProperties0.getFloat("hi!", (float) (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.util.Properties properties4 = extendedProperties0.getProperties("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = extendedProperties0.getBoolean("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties4);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.io.Reader reader5 = java.io.Reader.nullReader();
        char[] charArray6 = new char[] {};
        int int7 = reader5.read(charArray6);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader8 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader5);
        char[] charArray15 = new char[] { 'a', ' ', '#', ' ', '#', ' ' };
        int int16 = reader5.read(charArray15);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = propertiesReader3.read(charArray15, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { 'a', ' ', '#', ' ', '#', ' ' });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.io.OutputStream outputStream6 = null;
        extendedProperties0.save(outputStream6, "${");
        extendedProperties0.display();
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj13 = extendedProperties11.getProperty("");
        java.util.List list15 = extendedProperties11.getList("hi!");
        extendedProperties11.setInclude("hi!");
        java.util.List list19 = extendedProperties11.getList("hi!");
        java.lang.String str20 = extendedProperties0.interpolateHelper("hi!", list19);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = extendedProperties0.getInteger(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        int int10 = extendedProperties0.getInt("${", (int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = extendedProperties0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        boolean boolean12 = extendedProperties0.getBoolean("/", true);
        boolean boolean13 = extendedProperties0.isInitialized;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = extendedProperties0.getBoolean("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        char[] charArray6 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int9 = propertiesReader3.read(charArray6, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        char[] charArray7 = new char[] { 'a', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            int int10 = propertiesReader3.read(charArray7, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '4', '#' });
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        extendedProperties8.setProperty("}", (java.lang.Object) "}");
        java.lang.Long long14 = extendedProperties8.getLong("/", (java.lang.Long) 1L);
        byte byte17 = extendedProperties8.getByte("hi!", (byte) 100);
        java.lang.Class<?> wildcardClass18 = extendedProperties8.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 100 + "'", byte17 == (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        boolean boolean5 = propertiesReader3.ready();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        boolean boolean6 = propertiesReader3.markSupported();
        int int7 = propertiesReader3.getLineNumber();
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = propertiesReader3.transferTo(writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("}", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: } (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader3.setLineNumber((int) (short) 10);
        int int6 = propertiesReader3.getLineNumber();
        // The following exception was thrown during execution in test generation
        try {
            propertiesReader3.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream not marked");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        extendedProperties0.setInclude("hi!");
        java.util.List list8 = extendedProperties0.getList("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int10 = extendedProperties0.getInteger(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str4 = extendedProperties0.interpolate("}");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.util.Properties properties8 = extendedProperties0.getProperties(",");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = extendedProperties0.getBoolean("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(properties8);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        java.lang.Object obj9 = extendedProperties0.getProperty("${");
        java.lang.Boolean boolean12 = extendedProperties0.getBoolean("/", (java.lang.Boolean) false);
        java.io.InputStream inputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream13, "}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader3.setLineNumber((int) (short) 10);
        int int6 = propertiesReader3.getLineNumber();
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = propertiesReader3.transferTo(writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        // The following exception was thrown during execution in test generation
        try {
            byte byte9 = extendedProperties0.getByte(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ', doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = extendedProperties0.subset("${");
        // The following exception was thrown during execution in test generation
        try {
            double double9 = extendedProperties7.getDouble("${");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(extendedProperties7);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.lang.String str7 = extendedProperties0.fileSeparator;
        java.io.OutputStream outputStream8 = null;
        extendedProperties0.save(outputStream8, "");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = extendedProperties0.getInteger("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.lang.String str4 = extendedProperties0.testBoolean("");
        // The following exception was thrown during execution in test generation
        try {
            double double6 = extendedProperties0.getDouble(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.lang.Class<?> wildcardClass2 = extendedProperties0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        extendedProperties8.display();
        int int12 = extendedProperties8.getInteger("${", (int) (byte) 10);
        java.lang.String[] strArray14 = extendedProperties8.getStringArray("/");
        java.io.InputStream inputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties8.load(inputStream15, "/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        boolean boolean12 = extendedProperties0.getBoolean("/", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj15 = extendedProperties13.getProperty("");
        java.lang.String str16 = extendedProperties13.file;
        extendedProperties13.file = "";
        extendedProperties13.setProperty("/", (java.lang.Object) false);
        extendedProperties0.combine(extendedProperties13);
        java.lang.String str25 = extendedProperties13.getString("}", "hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj29 = extendedProperties27.getProperty("");
        java.lang.String str30 = extendedProperties27.file;
        java.lang.String str32 = extendedProperties27.testBoolean("hi!");
        java.lang.String str33 = extendedProperties27.file;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties13.setProperty("/", (java.lang.Object) str33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        java.lang.Object obj9 = extendedProperties0.getProperty("${");
        java.lang.String str10 = extendedProperties0.file;
        java.io.InputStream inputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream11, "/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        // The following exception was thrown during execution in test generation
        try {
            propertiesReader3.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream not marked");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        int int7 = propertiesReader3.read();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = propertiesReader3.skip((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: skip() value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("");
        java.lang.String str3 = propertiesTokenizer1.nextToken("${");
        java.lang.String str5 = propertiesTokenizer1.nextToken("");
        java.lang.Class<?> wildcardClass6 = propertiesTokenizer1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.util.Properties properties4 = extendedProperties0.getProperties("");
        java.lang.String str6 = extendedProperties0.testBoolean("hi!");
        java.lang.Boolean boolean9 = extendedProperties0.getBoolean("", (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            short short11 = extendedProperties0.getShort("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("${");
        java.lang.String str3 = propertiesTokenizer1.nextToken("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "${" + "'", str3, "${");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        java.util.Vector vector10 = extendedProperties8.getVector("}");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = extendedProperties8.getInteger("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertNotNull(vector10);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties("}");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: } (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator10 = extendedProperties0.getKeys();
        java.lang.String str13 = extendedProperties0.getString("hi!", "");
        java.lang.String str14 = extendedProperties0.file;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = extendedProperties0.getDouble("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("}");
        int int2 = propertiesTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor3 = propertiesTokenizer1.asIterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(objItor3);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = extendedProperties0.subset("");
        long long8 = extendedProperties0.getLong("/", (long) (short) 0);
        extendedProperties0.setInclude("${");
        java.lang.Boolean boolean13 = extendedProperties0.getBoolean(",", (java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(extendedProperties5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.lang.Double double8 = extendedProperties0.getDouble("}", (java.lang.Double) 1.0d);
        java.io.InputStream inputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        boolean boolean12 = extendedProperties0.getBoolean("/", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj15 = extendedProperties13.getProperty("");
        java.lang.String str16 = extendedProperties13.file;
        extendedProperties13.file = "";
        extendedProperties13.setProperty("/", (java.lang.Object) false);
        extendedProperties0.combine(extendedProperties13);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = extendedProperties0.getInteger("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.util.Properties properties4 = extendedProperties0.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties4);
        java.lang.String str7 = extendedProperties5.testBoolean("${");
        java.io.InputStream inputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties5.load(inputStream8, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(extendedProperties5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader3.setLineNumber((int) (short) 10);
        boolean boolean6 = propertiesReader3.ready();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        boolean boolean6 = propertiesReader3.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            propertiesReader3.mark((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Read-ahead limit < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        extendedProperties8.display();
        int int12 = extendedProperties8.getInteger("${", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            float float14 = extendedProperties8.getFloat("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.lang.String str6 = propertiesReader3.readProperty();
        boolean boolean7 = propertiesReader3.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            propertiesReader3.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream not marked");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        boolean boolean6 = propertiesReader3.markSupported();
        int int7 = propertiesReader3.getLineNumber();
        char[] charArray8 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int11 = propertiesReader3.read(charArray8, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader3.setLineNumber((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            propertiesReader3.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream not marked");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        boolean boolean12 = extendedProperties0.getBoolean("/", true);
        boolean boolean13 = extendedProperties0.isInitialized;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = extendedProperties0.getBoolean("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        int int5 = propertiesReader3.getLineNumber();
        int int6 = propertiesReader3.read();
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = propertiesReader3.transferTo(writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Vector vector8 = extendedProperties0.getVector("");
        java.lang.String[] strArray10 = extendedProperties0.getStringArray("hi!");
        java.util.Vector vector12 = null;
        java.util.Vector vector13 = extendedProperties0.getVector("/", vector12);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = extendedProperties0.getInteger("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(vector13);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        extendedProperties8.setProperty("}", (java.lang.Object) "}");
        java.lang.Short short14 = extendedProperties8.getShort("hi!", (java.lang.Short) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = extendedProperties8.getDouble("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 100 + "'", short14 == (short) 100);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        int int5 = propertiesReader3.getLineNumber();
        propertiesReader3.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = propertiesReader3.readLine();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.io.OutputStream outputStream2 = null;
        extendedProperties0.save(outputStream2, "hi!");
        java.lang.String str7 = extendedProperties0.getString("", "/");
        // The following exception was thrown during execution in test generation
        try {
            long long9 = extendedProperties0.getLong("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Vector vector8 = extendedProperties0.getVector("");
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj12 = extendedProperties10.getProperty("");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        short short17 = extendedProperties14.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj21 = extendedProperties19.getProperty("");
        java.util.List list23 = extendedProperties19.getList("hi!");
        extendedProperties14.addProperty("", (java.lang.Object) list23);
        java.lang.String str25 = extendedProperties10.interpolateHelper("", list23);
        java.util.List list26 = extendedProperties0.getList("/", list23);
        boolean boolean29 = extendedProperties0.getBoolean("", true);
        // The following exception was thrown during execution in test generation
        try {
            float float31 = extendedProperties0.getFloat("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = propertiesReader3.transferTo(writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strStream6);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj7 = extendedProperties5.getProperty("");
        java.util.List list9 = extendedProperties5.getList("hi!");
        extendedProperties0.addProperty("", (java.lang.Object) list9);
        java.lang.String str11 = extendedProperties0.getInclude();
        extendedProperties0.isInitialized = true;
        java.lang.Long long16 = extendedProperties0.getLong("hi!", (java.lang.Long) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            int int18 = extendedProperties0.getInteger("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(list9);
// flaky "2) test0130(org.apache.commons.collections.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.file = "}";
        java.util.Iterator iterator5 = extendedProperties0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = extendedProperties0.getInt(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator10 = extendedProperties0.getKeys();
        java.lang.Byte byte13 = extendedProperties0.getByte("", (java.lang.Byte) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list17 = extendedProperties15.getList("");
        extendedProperties15.setInclude("hi!");
        extendedProperties15.setInclude("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj25 = extendedProperties23.getProperty("");
        java.util.List list27 = extendedProperties23.getList("hi!");
        short short30 = extendedProperties23.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj34 = extendedProperties32.getProperty("");
        long long37 = extendedProperties32.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList38 = extendedProperties32.keysAsListed;
        java.util.Vector vector40 = extendedProperties32.getVector("");
        java.util.Vector vector41 = extendedProperties23.getVector("}", vector40);
        java.util.Vector vector42 = extendedProperties15.getVector("}", vector41);
        java.util.Vector vector43 = extendedProperties0.getVector("/", vector41);
        java.io.InputStream inputStream44 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 10 + "'", short30 == (short) 10);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 100L + "'", long37 == 100L);
        org.junit.Assert.assertNotNull(arrayList38);
        org.junit.Assert.assertNotNull(vector40);
        org.junit.Assert.assertNotNull(vector41);
        org.junit.Assert.assertNotNull(vector42);
        org.junit.Assert.assertNotNull(vector43);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        extendedProperties0.setInclude("hi!");
        java.lang.String str8 = extendedProperties0.testBoolean("");
        java.lang.String str11 = extendedProperties0.getString("hi!", "/");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = extendedProperties0.getInteger("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/" + "'", str11, "/");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        int int5 = propertiesReader3.getLineNumber();
        propertiesReader3.close();
        // The following exception was thrown during execution in test generation
        try {
            propertiesReader3.mark(32);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        short short7 = extendedProperties0.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj11 = extendedProperties9.getProperty("");
        long long14 = extendedProperties9.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList15 = extendedProperties9.keysAsListed;
        java.util.Vector vector17 = extendedProperties9.getVector("");
        java.util.Vector vector18 = extendedProperties0.getVector("}", vector17);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = extendedProperties0.getDouble("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(arrayList15);
        org.junit.Assert.assertNotNull(vector17);
        org.junit.Assert.assertNotNull(vector18);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str4 = extendedProperties0.interpolate("}");
        java.lang.String str5 = extendedProperties0.file;
        java.io.InputStream inputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream6, "/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        java.util.Properties properties6 = null;
        java.util.Properties properties7 = extendedProperties0.getProperties("", properties6);
        int int10 = extendedProperties0.getInt("hi!", (int) (short) -1);
        int int13 = extendedProperties0.getInt("${", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = extendedProperties0.getInt("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        extendedProperties8.setProperty("}", (java.lang.Object) "}");
        java.lang.Long long14 = extendedProperties8.getLong("/", (java.lang.Long) 1L);
        boolean boolean17 = extendedProperties8.getBoolean("", true);
        java.lang.Double double20 = extendedProperties8.getDouble("hi!", (java.lang.Double) (-1.0d));
        java.io.InputStream inputStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties8.load(inputStream21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("");
        java.lang.String str3 = propertiesTokenizer1.nextToken("${");
        boolean boolean4 = propertiesTokenizer1.hasMoreTokens();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties(",", "/");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: , (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        java.util.Properties properties6 = null;
        java.util.Properties properties7 = extendedProperties0.getProperties("", properties6);
        java.lang.String[] strArray9 = extendedProperties0.getStringArray("${");
        java.lang.Integer int12 = extendedProperties0.getInteger(",", (java.lang.Integer) (-1));
        java.io.OutputStream outputStream13 = null;
        extendedProperties0.save(outputStream13, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte byte17 = extendedProperties0.getByte("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${ doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        boolean boolean12 = extendedProperties0.getBoolean("/", true);
        boolean boolean13 = extendedProperties0.isInitialized;
        java.lang.Long long16 = extendedProperties0.getLong("/", (java.lang.Long) 10L);
        java.util.ArrayList arrayList17 = extendedProperties0.keysAsListed;
        long long20 = extendedProperties0.getLong("/", 100L);
        // The following exception was thrown during execution in test generation
        try {
            float float22 = extendedProperties0.getFloat(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(arrayList17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str4 = extendedProperties0.basePath;
        java.io.InputStream inputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream5, "${");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        java.util.Properties properties6 = null;
        java.util.Properties properties7 = extendedProperties0.getProperties("", properties6);
        int int10 = extendedProperties0.getInt("hi!", (int) (short) -1);
        int int13 = extendedProperties0.getInt("${", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte byte15 = extendedProperties0.getByte(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ', doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        int int5 = propertiesReader3.getLineNumber();
        int int6 = propertiesReader3.read();
        java.lang.String str7 = propertiesReader3.readProperty();
        // The following exception was thrown during execution in test generation
        try {
            propertiesReader3.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream not marked");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        boolean boolean12 = extendedProperties0.getBoolean("/", true);
        boolean boolean13 = extendedProperties0.isInitialized;
        java.lang.String[] strArray15 = extendedProperties0.getStringArray("}");
        // The following exception was thrown during execution in test generation
        try {
            float float17 = extendedProperties0.getFloat(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        extendedProperties0.setInclude("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = extendedProperties0.subset("");
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(extendedProperties8);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator10 = extendedProperties0.getKeys();
        java.lang.String str13 = extendedProperties0.getString("hi!", "");
        java.lang.String str14 = extendedProperties0.file;
        boolean boolean15 = extendedProperties0.isInitialized;
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Vector vector8 = extendedProperties0.getVector("");
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj12 = extendedProperties10.getProperty("");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        short short17 = extendedProperties14.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj21 = extendedProperties19.getProperty("");
        java.util.List list23 = extendedProperties19.getList("hi!");
        extendedProperties14.addProperty("", (java.lang.Object) list23);
        java.lang.String str25 = extendedProperties10.interpolateHelper("", list23);
        java.util.List list26 = extendedProperties0.getList("/", list23);
        boolean boolean29 = extendedProperties0.getBoolean("", true);
        // The following exception was thrown during execution in test generation
        try {
            float float31 = extendedProperties0.getFloat("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        boolean boolean6 = propertiesReader3.markSupported();
        int int7 = propertiesReader3.getLineNumber();
        boolean boolean8 = propertiesReader3.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            propertiesReader3.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream not marked");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list10 = extendedProperties8.getList("");
        double double13 = extendedProperties8.getDouble("hi!", 100.0d);
        extendedProperties0.setProperty("", (java.lang.Object) 100.0d);
        float float17 = extendedProperties0.getFloat("${", 0.0f);
        java.lang.String str18 = extendedProperties0.basePath;
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.lang.String str6 = propertiesReader3.readLine();
        boolean boolean7 = propertiesReader3.ready();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        short short8 = extendedProperties0.getShort("", (short) (byte) 10);
        java.io.InputStream inputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream9, "/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.lang.String str7 = extendedProperties0.fileSeparator;
        java.lang.Float float10 = extendedProperties0.getFloat("hi!", (java.lang.Float) (-1.0f));
        java.lang.Class<?> wildcardClass11 = extendedProperties0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator10 = extendedProperties0.getKeys();
        java.lang.Byte byte13 = extendedProperties0.getByte("", (java.lang.Byte) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list17 = extendedProperties15.getList("");
        extendedProperties15.setInclude("hi!");
        extendedProperties15.setInclude("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj25 = extendedProperties23.getProperty("");
        java.util.List list27 = extendedProperties23.getList("hi!");
        short short30 = extendedProperties23.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj34 = extendedProperties32.getProperty("");
        long long37 = extendedProperties32.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList38 = extendedProperties32.keysAsListed;
        java.util.Vector vector40 = extendedProperties32.getVector("");
        java.util.Vector vector41 = extendedProperties23.getVector("}", vector40);
        java.util.Vector vector42 = extendedProperties15.getVector("}", vector41);
        java.util.Vector vector43 = extendedProperties0.getVector("/", vector41);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = extendedProperties0.getBoolean("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 10 + "'", short30 == (short) 10);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 100L + "'", long37 == 100L);
        org.junit.Assert.assertNotNull(arrayList38);
        org.junit.Assert.assertNotNull(vector40);
        org.junit.Assert.assertNotNull(vector41);
        org.junit.Assert.assertNotNull(vector42);
        org.junit.Assert.assertNotNull(vector43);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.lang.String str6 = propertiesReader3.readProperty();
        boolean boolean7 = propertiesReader3.ready();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        boolean boolean12 = extendedProperties0.getBoolean("/", true);
        boolean boolean13 = extendedProperties0.isInitialized;
        java.lang.String[] strArray15 = extendedProperties0.getStringArray("}");
        java.io.InputStream inputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream16, "${");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader3.setLineNumber((int) (short) 10);
        int int6 = propertiesReader3.getLineNumber();
        char[] charArray10 = new char[] { ' ', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            int int13 = propertiesReader3.read(charArray10, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ', 'a', '#' });
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Vector vector8 = extendedProperties0.getVector("");
        extendedProperties0.display();
        java.lang.Class<?> wildcardClass10 = extendedProperties0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader5 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        // The following exception was thrown during execution in test generation
        try {
            propertiesReader3.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream not marked");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        char[] charArray8 = new char[] { '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            int int11 = propertiesReader3.read(charArray8, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', 'a' });
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        // The following exception was thrown during execution in test generation
        try {
            double double8 = extendedProperties0.getDouble("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        long long3 = extendedProperties0.getLong("hi!", (long) 1);
        java.lang.Boolean boolean6 = extendedProperties0.getBoolean("", (java.lang.Boolean) false);
        int int9 = extendedProperties0.getInt("", 52);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.Object obj7 = extendedProperties0.getProperty("hi!");
        boolean boolean8 = extendedProperties0.isInitialized();
        java.lang.Object obj10 = extendedProperties0.getProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = extendedProperties0.getInteger("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.io.OutputStream outputStream6 = null;
        extendedProperties0.save(outputStream6, "${");
        java.lang.String str9 = extendedProperties0.getInclude();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        java.lang.String str7 = propertiesReader3.readProperty();
        int int8 = propertiesReader3.read();
        boolean boolean9 = propertiesReader3.ready();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        extendedProperties0.file = "/";
        boolean boolean6 = extendedProperties0.isInitialized;
        java.lang.String str9 = extendedProperties0.getString("${", "");
        // The following exception was thrown during execution in test generation
        try {
            short short11 = extendedProperties0.getShort("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.lang.String str6 = propertiesReader3.readProperty();
        boolean boolean7 = propertiesReader3.markSupported();
        java.lang.String str8 = propertiesReader3.readLine();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader9 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        boolean boolean10 = propertiesReader9.ready();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        propertiesReader3.setLineNumber((-1));
        boolean boolean7 = propertiesReader3.ready();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        extendedProperties8.setProperty("}", (java.lang.Object) "}");
        java.lang.Long long14 = extendedProperties8.getLong("/", (java.lang.Long) 1L);
        boolean boolean17 = extendedProperties8.getBoolean("", true);
        java.lang.String str18 = extendedProperties8.basePath;
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        java.io.OutputStream outputStream8 = null;
        extendedProperties0.save(outputStream8, ",");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = extendedProperties0.getInteger("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.lang.String str6 = propertiesReader3.readProperty();
        boolean boolean7 = propertiesReader3.markSupported();
        java.io.Reader reader8 = java.io.Reader.nullReader();
        char[] charArray9 = new char[] {};
        int int10 = reader8.read(charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = propertiesReader3.read(charArray9, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader5 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        int int6 = propertiesReader5.getLineNumber();
        boolean boolean7 = propertiesReader5.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            propertiesReader5.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream not marked");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.String str6 = extendedProperties0.basePath;
        java.lang.String str7 = extendedProperties0.fileSeparator;
        java.lang.Boolean boolean10 = extendedProperties0.getBoolean("", (java.lang.Boolean) true);
        java.lang.String str11 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj15 = extendedProperties13.getProperty("");
        java.lang.String str16 = extendedProperties13.file;
        java.lang.String str18 = extendedProperties13.testBoolean("hi!");
        java.util.Properties properties20 = extendedProperties13.getProperties("/");
        java.util.Properties properties21 = extendedProperties0.getProperties(",", properties20);
        java.io.OutputStream outputStream22 = null;
        extendedProperties0.save(outputStream22, "/");
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str4 = extendedProperties0.interpolate("}");
        java.lang.String str6 = extendedProperties0.interpolate("");
        double double9 = extendedProperties0.getDouble("/", (double) 1.0f);
        extendedProperties0.display();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = extendedProperties0.subset("${");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNull(extendedProperties12);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        extendedProperties0.setInclude("hi!");
        java.lang.String str8 = extendedProperties0.testBoolean("");
        extendedProperties0.display();
        java.io.InputStream inputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader5 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = propertiesReader5.transferTo(writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.String str6 = extendedProperties0.basePath;
        byte byte9 = extendedProperties0.getByte("", (byte) 10);
        java.lang.Double double12 = extendedProperties0.getDouble("hi!", (java.lang.Double) 52.0d);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = extendedProperties0.getLong("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        short short8 = extendedProperties0.getShort("", (short) (byte) 10);
        java.lang.String str9 = extendedProperties0.file;
        java.lang.String[] strArray11 = extendedProperties0.getStringArray("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj15 = extendedProperties13.getProperty("");
        long long18 = extendedProperties13.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList19 = extendedProperties13.keysAsListed;
        java.lang.String str20 = extendedProperties13.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list24 = extendedProperties22.getList("");
        java.lang.String str26 = extendedProperties22.testBoolean("");
        double double29 = extendedProperties22.getDouble("/", (double) 10L);
        java.util.List list31 = extendedProperties22.getList("");
        java.lang.String str32 = extendedProperties13.interpolateHelper("${", list31);
        java.lang.String str33 = extendedProperties0.interpolateHelper("${", list31);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = extendedProperties0.getInt("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(arrayList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/" + "'", str20, "/");
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "${" + "'", str32, "${");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "${" + "'", str33, "${");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list10 = extendedProperties8.getList("");
        double double13 = extendedProperties8.getDouble("hi!", 100.0d);
        extendedProperties0.setProperty("", (java.lang.Object) 100.0d);
        float float17 = extendedProperties0.getFloat("${", 0.0f);
        java.lang.String str19 = extendedProperties0.testBoolean(",");
        java.io.InputStream inputStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream20, "/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.lang.String str7 = extendedProperties0.fileSeparator;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = extendedProperties0.getInt(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        long long3 = extendedProperties0.getLong("hi!", (long) 1);
        long long6 = extendedProperties0.getLong("/", (long) '4');
        java.lang.String[] strArray8 = extendedProperties0.getStringArray("");
        extendedProperties0.basePath = "";
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        extendedProperties0.file = "";
        extendedProperties0.setProperty("/", (java.lang.Object) false);
        java.lang.String str9 = extendedProperties0.fileSeparator;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int12 = extendedProperties0.getInteger("/", (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: '/' doesn't map to a Integer object");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.commons.collections.ExtendedProperties.include = "${";
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.util.Properties properties4 = extendedProperties0.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties4);
        java.lang.Integer int8 = extendedProperties5.getInteger("hi!", (java.lang.Integer) 52);
        java.io.InputStream inputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties5.load(inputStream9, ",");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(extendedProperties5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        short short7 = extendedProperties0.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj11 = extendedProperties9.getProperty("");
        long long14 = extendedProperties9.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList15 = extendedProperties9.keysAsListed;
        java.util.Vector vector17 = extendedProperties9.getVector("");
        java.util.Vector vector18 = extendedProperties0.getVector("}", vector17);
        java.lang.Class<?> wildcardClass19 = extendedProperties0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(arrayList15);
        org.junit.Assert.assertNotNull(vector17);
        org.junit.Assert.assertNotNull(vector18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        short short10 = extendedProperties0.getShort("", (short) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        short short14 = extendedProperties11.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = extendedProperties11.subset("");
        long long19 = extendedProperties11.getLong("/", (long) (short) 0);
        extendedProperties0.combine(extendedProperties11);
        byte byte23 = extendedProperties0.getByte("${", (byte) 0);
        java.io.InputStream inputStream24 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertNull(extendedProperties16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 0 + "'", byte23 == (byte) 0);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        byte byte12 = extendedProperties0.getByte("}", (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list16 = extendedProperties14.getList("");
        extendedProperties14.setInclude("hi!");
        extendedProperties14.setInclude("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj24 = extendedProperties22.getProperty("");
        java.util.List list26 = extendedProperties22.getList("hi!");
        short short29 = extendedProperties22.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj33 = extendedProperties31.getProperty("");
        long long36 = extendedProperties31.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList37 = extendedProperties31.keysAsListed;
        java.util.Vector vector39 = extendedProperties31.getVector("");
        java.util.Vector vector40 = extendedProperties22.getVector("}", vector39);
        java.util.Vector vector41 = extendedProperties14.getVector("}", vector40);
        java.util.Vector vector42 = extendedProperties0.getVector("/", vector40);
        org.apache.commons.collections.ExtendedProperties extendedProperties43 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj45 = extendedProperties43.getProperty("");
        long long48 = extendedProperties43.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList49 = extendedProperties43.keysAsListed;
        extendedProperties0.keysAsListed = arrayList49;
        // The following exception was thrown during execution in test generation
        try {
            int int52 = extendedProperties0.getInt("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 10 + "'", short29 == (short) 10);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 100L + "'", long36 == 100L);
        org.junit.Assert.assertNotNull(arrayList37);
        org.junit.Assert.assertNotNull(vector39);
        org.junit.Assert.assertNotNull(vector40);
        org.junit.Assert.assertNotNull(vector41);
        org.junit.Assert.assertNotNull(vector42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 100L + "'", long48 == 100L);
        org.junit.Assert.assertNotNull(arrayList49);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        propertiesReader3.setLineNumber((-1));
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = propertiesReader3.transferTo(writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.lang.String str6 = propertiesReader3.readProperty();
        boolean boolean7 = propertiesReader3.markSupported();
        java.lang.String str8 = propertiesReader3.readLine();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader9 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        propertiesReader3.mark((int) (byte) 10);
        java.io.Reader reader12 = java.io.Reader.nullReader();
        char[] charArray13 = new char[] {};
        int int14 = reader12.read(charArray13);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader15 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader12);
        char[] charArray22 = new char[] { 'a', ' ', '#', ' ', '#', ' ' };
        int int23 = reader12.read(charArray22);
        int int24 = propertiesReader3.read(charArray22);
        char[] charArray25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = propertiesReader3.read(charArray25, 97, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(reader12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { 'a', ' ', '#', ' ', '#', ' ' });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        int int5 = extendedProperties0.getInt("hi!", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = extendedProperties0.getBoolean("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = extendedProperties0.subset("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj10 = extendedProperties8.getProperty("");
        long long13 = extendedProperties8.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList14 = extendedProperties8.keysAsListed;
        boolean boolean17 = extendedProperties8.getBoolean("", false);
        boolean boolean20 = extendedProperties8.getBoolean("/", true);
        boolean boolean21 = extendedProperties8.isInitialized;
        java.lang.Long long24 = extendedProperties8.getLong("/", (java.lang.Long) 10L);
        java.util.ArrayList arrayList25 = extendedProperties8.keysAsListed;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties7.keysAsListed = arrayList25;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(extendedProperties7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(arrayList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertNotNull(arrayList25);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        extendedProperties0.setInclude("hi!");
        java.lang.String str8 = extendedProperties0.testBoolean("");
        extendedProperties0.display();
        // The following exception was thrown during execution in test generation
        try {
            float float11 = extendedProperties0.getFloat("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.commons.collections.ExtendedProperties.include = ",";
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.lang.String str6 = propertiesReader3.readProperty();
        boolean boolean7 = propertiesReader3.markSupported();
        java.nio.CharBuffer charBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = propertiesReader3.read(charBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.String str6 = extendedProperties0.basePath;
        java.lang.Class<?> wildcardClass7 = extendedProperties0.getClass();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.String str8 = extendedProperties0.getString("hi!", "hi!");
        int int11 = extendedProperties0.getInt("hi!", (int) (short) 1);
        java.lang.Object obj13 = extendedProperties0.getProperty("/");
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list10 = extendedProperties8.getList("");
        double double13 = extendedProperties8.getDouble("hi!", 100.0d);
        extendedProperties0.setProperty("", (java.lang.Object) 100.0d);
        extendedProperties0.setInclude("/");
        // The following exception was thrown during execution in test generation
        try {
            long long18 = extendedProperties0.getLong("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties1 = new org.apache.commons.collections.ExtendedProperties(",");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: , (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("", "}");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj11 = extendedProperties9.getProperty("");
        java.util.List list13 = extendedProperties9.getList("hi!");
        short short16 = extendedProperties9.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj20 = extendedProperties18.getProperty("");
        long long23 = extendedProperties18.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList24 = extendedProperties18.keysAsListed;
        java.util.Vector vector26 = extendedProperties18.getVector("");
        java.util.Vector vector27 = extendedProperties9.getVector("}", vector26);
        java.lang.String str28 = extendedProperties0.interpolateHelper("", (java.util.List) vector27);
        java.lang.Double double31 = extendedProperties0.getDouble("${", (java.lang.Double) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            byte byte33 = extendedProperties0.getByte("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '} doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 10 + "'", short16 == (short) 10);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertNotNull(arrayList24);
        org.junit.Assert.assertNotNull(vector26);
        org.junit.Assert.assertNotNull(vector27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str7 = extendedProperties0.getString("hi!", "");
        java.lang.String str8 = extendedProperties0.file;
        java.lang.Double double11 = extendedProperties0.getDouble("", (java.lang.Double) (-1.0d));
        java.lang.Class<?> wildcardClass12 = extendedProperties0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        byte byte12 = extendedProperties0.getByte("}", (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list16 = extendedProperties14.getList("");
        extendedProperties14.setInclude("hi!");
        extendedProperties14.setInclude("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj24 = extendedProperties22.getProperty("");
        java.util.List list26 = extendedProperties22.getList("hi!");
        short short29 = extendedProperties22.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj33 = extendedProperties31.getProperty("");
        long long36 = extendedProperties31.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList37 = extendedProperties31.keysAsListed;
        java.util.Vector vector39 = extendedProperties31.getVector("");
        java.util.Vector vector40 = extendedProperties22.getVector("}", vector39);
        java.util.Vector vector41 = extendedProperties14.getVector("}", vector40);
        java.util.Vector vector42 = extendedProperties0.getVector("/", vector40);
        org.apache.commons.collections.ExtendedProperties extendedProperties43 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj45 = extendedProperties43.getProperty("");
        long long48 = extendedProperties43.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList49 = extendedProperties43.keysAsListed;
        extendedProperties0.keysAsListed = arrayList49;
        java.io.InputStream inputStream51 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream51, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 10 + "'", short29 == (short) 10);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 100L + "'", long36 == 100L);
        org.junit.Assert.assertNotNull(arrayList37);
        org.junit.Assert.assertNotNull(vector39);
        org.junit.Assert.assertNotNull(vector40);
        org.junit.Assert.assertNotNull(vector41);
        org.junit.Assert.assertNotNull(vector42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 100L + "'", long48 == 100L);
        org.junit.Assert.assertNotNull(arrayList49);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        int int5 = propertiesReader3.getLineNumber();
        int int6 = propertiesReader3.read();
        java.lang.String str7 = propertiesReader3.readProperty();
        java.nio.CharBuffer charBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = propertiesReader3.read(charBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        short short10 = extendedProperties0.getShort("", (short) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        short short14 = extendedProperties11.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = extendedProperties11.subset("");
        long long19 = extendedProperties11.getLong("/", (long) (short) 0);
        extendedProperties0.combine(extendedProperties11);
        int int23 = extendedProperties11.getInteger(",", 52);
        java.lang.String str25 = extendedProperties11.testBoolean("${");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertNull(extendedProperties16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        short short7 = extendedProperties0.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj11 = extendedProperties9.getProperty("");
        long long14 = extendedProperties9.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList15 = extendedProperties9.keysAsListed;
        java.util.Vector vector17 = extendedProperties9.getVector("");
        java.util.Vector vector18 = extendedProperties0.getVector("}", vector17);
        boolean boolean19 = extendedProperties0.isInitialized;
        // The following exception was thrown during execution in test generation
        try {
            float float21 = extendedProperties0.getFloat("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(arrayList15);
        org.junit.Assert.assertNotNull(vector17);
        org.junit.Assert.assertNotNull(vector18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.util.Properties properties4 = extendedProperties0.getProperties("");
        java.lang.String str6 = extendedProperties0.testBoolean("hi!");
        extendedProperties0.clearProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte byte10 = extendedProperties0.getByte("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '} doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.lang.String str7 = extendedProperties0.fileSeparator;
        java.lang.Float float10 = extendedProperties0.getFloat("hi!", (java.lang.Float) (-1.0f));
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = extendedProperties0.subset("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertNull(extendedProperties12);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator10 = extendedProperties0.getKeys();
        java.lang.Byte byte13 = extendedProperties0.getByte("", (java.lang.Byte) (byte) 0);
        extendedProperties0.isInitialized = false;
        java.lang.Class<?> wildcardClass16 = extendedProperties0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        java.lang.String str5 = extendedProperties0.getInclude();
        extendedProperties0.clearProperty("${");
        extendedProperties0.isInitialized = false;
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = extendedProperties0.subset("/");
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(extendedProperties11);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        int int10 = extendedProperties0.getInt("${", (int) (byte) 100);
        java.lang.String str11 = extendedProperties0.file;
        java.util.Properties properties13 = extendedProperties0.getProperties("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties13);
        int int17 = extendedProperties14.getInt("/", 52);
        java.io.OutputStream outputStream18 = null;
        extendedProperties14.save(outputStream18, "/");
        extendedProperties14.fileSeparator = "/";
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(extendedProperties14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.lang.String str6 = propertiesReader3.readProperty();
        boolean boolean7 = propertiesReader3.markSupported();
        java.lang.String str8 = propertiesReader3.readLine();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader9 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        propertiesReader3.mark((int) (byte) 10);
        java.io.Reader reader12 = java.io.Reader.nullReader();
        char[] charArray13 = new char[] {};
        int int14 = reader12.read(charArray13);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader15 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader12);
        char[] charArray22 = new char[] { 'a', ' ', '#', ' ', '#', ' ' };
        int int23 = reader12.read(charArray22);
        int int24 = propertiesReader3.read(charArray22);
        // The following exception was thrown during execution in test generation
        try {
            propertiesReader3.mark((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Read-ahead limit < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(reader12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { 'a', ' ', '#', ' ', '#', ' ' });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator10 = extendedProperties0.getKeys();
        java.lang.String str13 = extendedProperties0.getString("hi!", "");
        java.lang.String str14 = extendedProperties0.file;
        java.util.Properties properties16 = extendedProperties0.getProperties("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = extendedProperties0.getInt("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str4 = extendedProperties0.interpolate("}");
        java.lang.String str6 = extendedProperties0.interpolate("");
        double double9 = extendedProperties0.getDouble("/", (double) 1.0f);
        java.lang.Long long12 = extendedProperties0.getLong("/", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = extendedProperties0.subset("/");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = extendedProperties14.getProperty(",");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(extendedProperties14);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.lang.String str11 = extendedProperties0.interpolate("hi!");
        java.lang.String str13 = extendedProperties0.interpolate("}");
        java.lang.String str14 = extendedProperties0.file;
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list18 = extendedProperties16.getList("");
        extendedProperties16.setInclude("hi!");
        extendedProperties16.setInclude("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj26 = extendedProperties24.getProperty("");
        java.util.List list28 = extendedProperties24.getList("hi!");
        short short31 = extendedProperties24.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj35 = extendedProperties33.getProperty("");
        long long38 = extendedProperties33.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList39 = extendedProperties33.keysAsListed;
        java.util.Vector vector41 = extendedProperties33.getVector("");
        java.util.Vector vector42 = extendedProperties24.getVector("}", vector41);
        java.util.Vector vector43 = extendedProperties16.getVector("}", vector42);
        java.util.List list44 = extendedProperties0.getList("hi!", (java.util.List) vector43);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean46 = extendedProperties0.getBoolean("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}" + "'", str13, "}");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 10 + "'", short31 == (short) 10);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 100L + "'", long38 == 100L);
        org.junit.Assert.assertNotNull(arrayList39);
        org.junit.Assert.assertNotNull(vector41);
        org.junit.Assert.assertNotNull(vector42);
        org.junit.Assert.assertNotNull(vector43);
        org.junit.Assert.assertNotNull(list44);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.lang.String str4 = extendedProperties0.testBoolean("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list8 = extendedProperties6.getList("");
        java.lang.String str10 = extendedProperties6.testBoolean("");
        double double13 = extendedProperties6.getDouble("/", (double) 10L);
        java.lang.String str15 = extendedProperties6.getString("");
        java.lang.String str17 = extendedProperties6.interpolate("}");
        java.lang.Object obj19 = extendedProperties6.getProperty("${");
        extendedProperties0.addProperty(",", (java.lang.Object) "${");
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "}" + "'", str17, "}");
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = extendedProperties0.subset("${");
        extendedProperties0.basePath = "${";
        java.lang.String str10 = extendedProperties0.fileSeparator;
        java.lang.String str11 = extendedProperties0.basePath;
        java.lang.Integer int14 = extendedProperties0.getInteger("hi!", (java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(extendedProperties7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/" + "'", str10, "/");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "${" + "'", str11, "${");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = extendedProperties0.subset("${");
        java.lang.String str8 = extendedProperties0.basePath;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = extendedProperties0.getBoolean("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(extendedProperties7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("${");
        java.util.Iterator<java.lang.Object> objItor2 = propertiesTokenizer1.asIterator();
        boolean boolean3 = propertiesTokenizer1.hasMoreTokens();
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        long long3 = extendedProperties0.getLong("hi!", (long) 1);
        java.lang.Boolean boolean6 = extendedProperties0.getBoolean("", (java.lang.Boolean) false);
        java.lang.String str8 = extendedProperties0.interpolate(",");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        int int5 = propertiesReader3.getLineNumber();
        int int6 = propertiesReader3.read();
        boolean boolean7 = propertiesReader3.ready();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.lang.String str4 = extendedProperties0.testBoolean("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = extendedProperties0.subset("${");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean9 = extendedProperties6.getBoolean("", (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(extendedProperties6);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.io.OutputStream outputStream6 = null;
        extendedProperties0.save(outputStream6, "${");
        extendedProperties0.setInclude("");
        // The following exception was thrown during execution in test generation
        try {
            short short12 = extendedProperties0.getShort("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        boolean boolean6 = propertiesReader3.ready();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader5 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        java.io.Reader reader6 = java.io.Reader.nullReader();
        char[] charArray7 = new char[] {};
        int int8 = reader6.read(charArray7);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader9 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader6);
        char[] charArray16 = new char[] { 'a', ' ', '#', ' ', '#', ' ' };
        int int17 = reader6.read(charArray16);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = propertiesReader5.read(charArray16, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(reader6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { 'a', ' ', '#', ' ', '#', ' ' });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator10 = extendedProperties0.getKeys();
        java.lang.Integer int13 = extendedProperties0.getInteger(",", (java.lang.Integer) 0);
        float float16 = extendedProperties0.getFloat("", (float) '4');
        extendedProperties0.basePath = ",";
        java.lang.String str20 = extendedProperties0.testBoolean("}");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 52.0f + "'", float16 == 52.0f);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        java.util.List list5 = extendedProperties0.getList("");
        // The following exception was thrown during execution in test generation
        try {
            long long7 = extendedProperties0.getLong("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("", "/");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        int int10 = extendedProperties0.getInt("${", (int) (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj13 = extendedProperties11.getProperty("");
        java.util.List list15 = extendedProperties11.getList("hi!");
        java.lang.String str17 = extendedProperties11.interpolate("");
        java.lang.Short short20 = extendedProperties11.getShort("", (java.lang.Short) (short) -1);
        extendedProperties0.combine(extendedProperties11);
        // The following exception was thrown during execution in test generation
        try {
            short short23 = extendedProperties0.getShort("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) -1 + "'", short20 == (short) -1);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.lang.String str6 = propertiesReader3.readProperty();
        java.io.Reader reader7 = java.io.Reader.nullReader();
        char[] charArray8 = new char[] {};
        int int9 = reader7.read(charArray8);
        int int10 = propertiesReader3.read(charArray8);
        java.nio.CharBuffer charBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = propertiesReader3.read(charBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator10 = extendedProperties0.getKeys();
        java.lang.Integer int13 = extendedProperties0.getInteger(",", (java.lang.Integer) 0);
        float float16 = extendedProperties0.getFloat("", (float) '4');
        extendedProperties0.basePath = ",";
        java.io.InputStream inputStream19 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 52.0f + "'", float16 == 52.0f);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.basePath = ",";
        extendedProperties0.basePath = "";
        // The following exception was thrown during execution in test generation
        try {
            double double6 = extendedProperties0.getDouble("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = extendedProperties0.subset("${");
        double double10 = extendedProperties0.getDouble("}", (double) (short) 100);
        java.lang.Short short13 = extendedProperties0.getShort(",", (java.lang.Short) (short) 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(extendedProperties7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("");
        java.lang.String str3 = propertiesTokenizer1.nextToken("${");
        java.util.Iterator<java.lang.Object> objItor4 = propertiesTokenizer1.asIterator();
        boolean boolean5 = propertiesTokenizer1.hasMoreTokens();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.io.OutputStream outputStream2 = null;
        extendedProperties0.save(outputStream2, "hi!");
        java.io.InputStream inputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.lang.String str6 = propertiesReader3.readProperty();
        boolean boolean7 = propertiesReader3.markSupported();
        boolean boolean8 = propertiesReader3.ready();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list10 = extendedProperties8.getList("");
        double double13 = extendedProperties8.getDouble("hi!", 100.0d);
        extendedProperties0.setProperty("", (java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float17 = extendedProperties0.getFloat("", (java.lang.Float) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: '' doesn't map to a Float object");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Vector vector8 = extendedProperties0.getVector("");
        extendedProperties0.display();
        java.lang.Double double12 = extendedProperties0.getDouble("", (java.lang.Double) 10.0d);
        java.lang.String str13 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list16 = extendedProperties14.getList("");
        java.lang.String str18 = extendedProperties14.getString("}");
        extendedProperties0.combine(extendedProperties14);
        java.io.InputStream inputStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties14.load(inputStream20, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
// flaky "3) test0238(org.apache.commons.collections.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        java.io.OutputStream outputStream8 = null;
        extendedProperties0.save(outputStream8, ",");
        // The following exception was thrown during execution in test generation
        try {
            long long12 = extendedProperties0.getLong("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        java.util.stream.Stream<java.lang.String> strStream4 = propertiesReader3.lines();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strStream4);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.basePath = ",";
        extendedProperties0.basePath = "";
        long long7 = extendedProperties0.getLong("", (long) ' ');
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator10 = extendedProperties0.getKeys();
        java.lang.Byte byte13 = extendedProperties0.getByte("", (java.lang.Byte) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list17 = extendedProperties15.getList("");
        extendedProperties15.setInclude("hi!");
        extendedProperties15.setInclude("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj25 = extendedProperties23.getProperty("");
        java.util.List list27 = extendedProperties23.getList("hi!");
        short short30 = extendedProperties23.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties32 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj34 = extendedProperties32.getProperty("");
        long long37 = extendedProperties32.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList38 = extendedProperties32.keysAsListed;
        java.util.Vector vector40 = extendedProperties32.getVector("");
        java.util.Vector vector41 = extendedProperties23.getVector("}", vector40);
        java.util.Vector vector42 = extendedProperties15.getVector("}", vector41);
        java.util.Vector vector43 = extendedProperties0.getVector("/", vector41);
        java.util.Iterator iterator44 = extendedProperties0.getKeys();
        java.lang.Object obj46 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.addProperty("hi!", obj46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 10 + "'", short30 == (short) 10);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 100L + "'", long37 == 100L);
        org.junit.Assert.assertNotNull(arrayList38);
        org.junit.Assert.assertNotNull(vector40);
        org.junit.Assert.assertNotNull(vector41);
        org.junit.Assert.assertNotNull(vector42);
        org.junit.Assert.assertNotNull(vector43);
        org.junit.Assert.assertNotNull(iterator44);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.util.Properties properties4 = extendedProperties0.getProperties("");
        java.io.OutputStream outputStream5 = null;
        extendedProperties0.save(outputStream5, ",");
        java.util.Iterator iterator9 = extendedProperties0.getKeys("");
        // The following exception was thrown during execution in test generation
        try {
            float float11 = extendedProperties0.getFloat(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = extendedProperties0.subset("${");
        java.lang.String str8 = extendedProperties0.basePath;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = extendedProperties0.getDouble(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(extendedProperties7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        propertiesReader3.mark(10);
        boolean boolean9 = propertiesReader3.markSupported();
        java.nio.CharBuffer charBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = propertiesReader3.read(charBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        extendedProperties8.display();
        int int12 = extendedProperties8.getInteger("${", (int) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj16 = extendedProperties14.getProperty("");
        java.util.List list18 = extendedProperties14.getList("hi!");
        java.lang.String str20 = extendedProperties14.interpolate("");
        java.lang.Short short23 = extendedProperties14.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator24 = extendedProperties14.getKeys();
        java.lang.Byte byte27 = extendedProperties14.getByte("", (java.lang.Byte) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list31 = extendedProperties29.getList("");
        extendedProperties29.setInclude("hi!");
        extendedProperties29.setInclude("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties37 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj39 = extendedProperties37.getProperty("");
        java.util.List list41 = extendedProperties37.getList("hi!");
        short short44 = extendedProperties37.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties46 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj48 = extendedProperties46.getProperty("");
        long long51 = extendedProperties46.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList52 = extendedProperties46.keysAsListed;
        java.util.Vector vector54 = extendedProperties46.getVector("");
        java.util.Vector vector55 = extendedProperties37.getVector("}", vector54);
        java.util.Vector vector56 = extendedProperties29.getVector("}", vector55);
        java.util.Vector vector57 = extendedProperties14.getVector("/", vector55);
        java.util.List list58 = extendedProperties8.getList("${", (java.util.List) vector57);
        // The following exception was thrown during execution in test generation
        try {
            float float60 = extendedProperties8.getFloat("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) -1 + "'", short23 == (short) -1);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 0 + "'", byte27 == (byte) 0);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + short44 + "' != '" + (short) 10 + "'", short44 == (short) 10);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 100L + "'", long51 == 100L);
        org.junit.Assert.assertNotNull(arrayList52);
        org.junit.Assert.assertNotNull(vector54);
        org.junit.Assert.assertNotNull(vector55);
        org.junit.Assert.assertNotNull(vector56);
        org.junit.Assert.assertNotNull(vector57);
        org.junit.Assert.assertNotNull(list58);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        java.io.Reader reader9 = java.io.Reader.nullReader();
        char[] charArray10 = new char[] {};
        int int11 = reader9.read(charArray10);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader12 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader9);
        boolean boolean13 = propertiesReader12.markSupported();
        java.lang.String str14 = propertiesReader12.readLine();
        java.lang.String str15 = propertiesReader12.readProperty();
        extendedProperties0.setProperty("${", (java.lang.Object) propertiesReader12);
        java.io.InputStream inputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        extendedProperties0.setInclude("hi!");
        java.lang.String str7 = extendedProperties0.basePath;
        java.io.InputStream inputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream8, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        extendedProperties0.setInclude("hi!");
        java.lang.String str7 = extendedProperties0.basePath;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = extendedProperties0.getDouble("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        extendedProperties8.display();
        int int12 = extendedProperties8.getInteger("${", (int) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj16 = extendedProperties14.getProperty("");
        java.util.List list18 = extendedProperties14.getList("hi!");
        java.lang.String str20 = extendedProperties14.interpolate("");
        java.lang.Short short23 = extendedProperties14.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator24 = extendedProperties14.getKeys();
        java.lang.Byte byte27 = extendedProperties14.getByte("", (java.lang.Byte) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list31 = extendedProperties29.getList("");
        extendedProperties29.setInclude("hi!");
        extendedProperties29.setInclude("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties37 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj39 = extendedProperties37.getProperty("");
        java.util.List list41 = extendedProperties37.getList("hi!");
        short short44 = extendedProperties37.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties46 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj48 = extendedProperties46.getProperty("");
        long long51 = extendedProperties46.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList52 = extendedProperties46.keysAsListed;
        java.util.Vector vector54 = extendedProperties46.getVector("");
        java.util.Vector vector55 = extendedProperties37.getVector("}", vector54);
        java.util.Vector vector56 = extendedProperties29.getVector("}", vector55);
        java.util.Vector vector57 = extendedProperties14.getVector("/", vector55);
        java.util.List list58 = extendedProperties8.getList("${", (java.util.List) vector57);
        java.lang.Class<?> wildcardClass59 = vector57.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) -1 + "'", short23 == (short) -1);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 0 + "'", byte27 == (byte) 0);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + short44 + "' != '" + (short) 10 + "'", short44 == (short) 10);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 100L + "'", long51 == 100L);
        org.junit.Assert.assertNotNull(arrayList52);
        org.junit.Assert.assertNotNull(vector54);
        org.junit.Assert.assertNotNull(vector55);
        org.junit.Assert.assertNotNull(vector56);
        org.junit.Assert.assertNotNull(vector57);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator10 = extendedProperties0.getKeys();
        java.lang.Byte byte13 = extendedProperties0.getByte("", (java.lang.Byte) (byte) 0);
        extendedProperties0.isInitialized = false;
        java.io.OutputStream outputStream16 = null;
        extendedProperties0.save(outputStream16, "hi!");
        java.lang.String[] strArray20 = extendedProperties0.getStringArray("}");
        java.util.Iterator iterator21 = extendedProperties0.getKeys();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.lang.String str4 = extendedProperties0.testBoolean("");
        // The following exception was thrown during execution in test generation
        try {
            double double6 = extendedProperties0.getDouble("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.lang.String str11 = extendedProperties0.interpolate("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = extendedProperties0.getInteger("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("${", "");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ${ (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Vector vector8 = extendedProperties0.getVector("");
        java.lang.String[] strArray10 = extendedProperties0.getStringArray("hi!");
        // The following exception was thrown during execution in test generation
        try {
            float float12 = extendedProperties0.getFloat("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("}", "/");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: } (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.io.InputStream inputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream3, "/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        short short10 = extendedProperties0.getShort("", (short) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        short short14 = extendedProperties11.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = extendedProperties11.subset("");
        long long19 = extendedProperties11.getLong("/", (long) (short) 0);
        extendedProperties0.combine(extendedProperties11);
        int int23 = extendedProperties11.getInteger(",", 52);
        extendedProperties11.display();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertNull(extendedProperties16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.lang.String str11 = extendedProperties0.interpolate("hi!");
        java.lang.String str13 = extendedProperties0.interpolate("}");
        java.lang.String str14 = extendedProperties0.basePath;
        byte byte17 = extendedProperties0.getByte("/", (byte) 0);
        long long20 = extendedProperties0.getLong("${", (long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = extendedProperties0.getInt("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}" + "'", str13, "}");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj7 = extendedProperties5.getProperty("");
        java.util.List list9 = extendedProperties5.getList("hi!");
        extendedProperties0.addProperty("", (java.lang.Object) list9);
        java.lang.String str11 = extendedProperties0.getInclude();
        extendedProperties0.isInitialized = true;
        java.lang.Long long16 = extendedProperties0.getLong("hi!", (java.lang.Long) (-1L));
        byte byte19 = extendedProperties0.getByte(",", (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = extendedProperties0.getBoolean("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: '' doesn't map to a Boolean object");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 10 + "'", byte19 == (byte) 10);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Vector vector8 = extendedProperties0.getVector("");
        java.io.OutputStream outputStream9 = null;
        extendedProperties0.save(outputStream9, "${");
        java.lang.String str12 = extendedProperties0.basePath;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = extendedProperties0.getBoolean("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        extendedProperties0.setInclude("hi!");
        java.lang.String str8 = extendedProperties0.testBoolean("hi!");
        java.lang.Class<?> wildcardClass9 = extendedProperties0.getClass();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        java.util.Properties properties6 = null;
        java.util.Properties properties7 = extendedProperties0.getProperties("", properties6);
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj10 = extendedProperties8.getProperty("");
        java.util.List list12 = extendedProperties8.getList("hi!");
        java.lang.Long long15 = extendedProperties8.getLong("}", (java.lang.Long) (-1L));
        int int18 = extendedProperties8.getInt("${", (int) (byte) 100);
        extendedProperties8.isInitialized = false;
        extendedProperties0.combine(extendedProperties8);
        java.lang.String str23 = extendedProperties0.getString("}");
        extendedProperties0.setInclude("${");
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        int int12 = extendedProperties9.getInt("hi!", (int) (byte) 100);
        boolean boolean15 = extendedProperties9.getBoolean(",", true);
        extendedProperties9.file = ",";
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertNotNull(extendedProperties9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str4 = extendedProperties0.interpolate("}");
        java.lang.String str6 = extendedProperties0.interpolate("");
        double double9 = extendedProperties0.getDouble("/", (double) 1.0f);
        java.lang.Long long12 = extendedProperties0.getLong("/", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = extendedProperties0.subset("/");
        java.lang.String str17 = extendedProperties0.getString("hi!", "${");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(extendedProperties14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "${" + "'", str17, "${");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        java.io.Reader reader9 = java.io.Reader.nullReader();
        char[] charArray10 = new char[] {};
        int int11 = reader9.read(charArray10);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader12 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader9);
        boolean boolean13 = propertiesReader12.markSupported();
        java.lang.String str14 = propertiesReader12.readLine();
        java.lang.String str15 = propertiesReader12.readProperty();
        extendedProperties0.setProperty("${", (java.lang.Object) propertiesReader12);
        java.io.Reader reader17 = java.io.Reader.nullReader();
        char[] charArray18 = new char[] {};
        int int19 = reader17.read(charArray18);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = propertiesReader12.read(charArray18, (int) (byte) 1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(reader17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        boolean boolean2 = propertiesTokenizer1.hasMoreElements();
        boolean boolean3 = propertiesTokenizer1.hasMoreTokens();
        int int4 = propertiesTokenizer1.countTokens();
        boolean boolean5 = propertiesTokenizer1.hasMoreTokens();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Vector vector8 = extendedProperties0.getVector("");
        java.io.OutputStream outputStream9 = null;
        extendedProperties0.save(outputStream9, "${");
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj14 = extendedProperties12.getProperty("");
        java.util.List list16 = extendedProperties12.getList("hi!");
        extendedProperties12.setInclude("hi!");
        java.util.List list20 = extendedProperties12.getList("hi!");
        java.lang.String str21 = extendedProperties12.getInclude();
        float float24 = extendedProperties12.getFloat("/", (float) 100L);
        extendedProperties0.combine(extendedProperties12);
        java.lang.Boolean boolean28 = extendedProperties12.getBoolean(",", (java.lang.Boolean) false);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 100.0f + "'", float24 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        java.util.Properties properties6 = null;
        java.util.Properties properties7 = extendedProperties0.getProperties("", properties6);
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        int int11 = extendedProperties8.getInteger("", 32);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = extendedProperties8.getBoolean("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = extendedProperties0.subset("");
        long long8 = extendedProperties0.getLong("/", (long) (short) 0);
        int int11 = extendedProperties0.getInteger("hi!", 97);
        java.io.InputStream inputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream12, "/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(extendedProperties5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str4 = extendedProperties0.interpolate("}");
        java.lang.String str6 = extendedProperties0.interpolate("");
        double double9 = extendedProperties0.getDouble("/", (double) 1.0f);
        java.lang.Long long12 = extendedProperties0.getLong("/", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = extendedProperties0.subset("/");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int17 = extendedProperties14.getInteger(",", (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(extendedProperties14);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        boolean boolean12 = extendedProperties0.getBoolean("/", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj15 = extendedProperties13.getProperty("");
        java.lang.String str16 = extendedProperties13.file;
        extendedProperties13.file = "";
        extendedProperties13.setProperty("/", (java.lang.Object) false);
        extendedProperties0.combine(extendedProperties13);
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list26 = extendedProperties24.getList("");
        java.util.Properties properties28 = extendedProperties24.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties28);
        extendedProperties13.setProperty("${", (java.lang.Object) properties28);
        int int33 = extendedProperties13.getInt("}", (int) (short) 1);
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj37 = extendedProperties35.getProperty("");
        java.util.List list39 = extendedProperties35.getList("hi!");
        java.lang.String str41 = extendedProperties35.interpolate("");
        java.lang.Short short44 = extendedProperties35.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator45 = extendedProperties35.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties47 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj49 = extendedProperties47.getProperty("");
        java.lang.String str50 = extendedProperties47.file;
        java.lang.String str52 = extendedProperties47.testBoolean("hi!");
        java.util.Properties properties54 = extendedProperties47.getProperties("/");
        java.util.Properties properties55 = extendedProperties35.getProperties("", properties54);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Properties properties56 = extendedProperties13.getProperties("/", properties54);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: '/' doesn't map to a String/List object");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNotNull(extendedProperties29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + short44 + "' != '" + (short) -1 + "'", short44 == (short) -1);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(properties54);
        org.junit.Assert.assertNotNull(properties55);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        int int5 = propertiesReader3.getLineNumber();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        // The following exception was thrown during execution in test generation
        try {
            propertiesReader3.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream not marked");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strStream6);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        int int5 = propertiesReader3.getLineNumber();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        propertiesReader3.mark(97);
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = propertiesReader3.transferTo(writer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strStream6);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator10 = extendedProperties0.getKeys();
        java.lang.Byte byte13 = extendedProperties0.getByte("", (java.lang.Byte) (byte) 0);
        extendedProperties0.isInitialized = false;
        java.io.OutputStream outputStream16 = null;
        extendedProperties0.save(outputStream16, "hi!");
        java.lang.String[] strArray20 = extendedProperties0.getStringArray("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj24 = extendedProperties22.getProperty("");
        java.util.List list26 = extendedProperties22.getList("hi!");
        java.lang.String str28 = extendedProperties22.interpolate("");
        java.lang.Short short31 = extendedProperties22.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator32 = extendedProperties22.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj36 = extendedProperties34.getProperty("");
        java.lang.String str37 = extendedProperties34.file;
        java.lang.String str39 = extendedProperties34.testBoolean("hi!");
        java.util.Properties properties41 = extendedProperties34.getProperties("/");
        java.util.Properties properties42 = extendedProperties22.getProperties("", properties41);
        java.util.Properties properties43 = extendedProperties0.getProperties("", properties42);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = extendedProperties0.getInteger("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) -1 + "'", short31 == (short) -1);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertNotNull(properties43);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator10 = extendedProperties0.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj14 = extendedProperties12.getProperty("");
        java.lang.String str15 = extendedProperties12.file;
        java.lang.String str17 = extendedProperties12.testBoolean("hi!");
        java.util.Properties properties19 = extendedProperties12.getProperties("/");
        java.util.Properties properties20 = extendedProperties0.getProperties("", properties19);
        java.lang.Short short23 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 1);
        java.lang.String str25 = extendedProperties0.interpolate("/");
        // The following exception was thrown during execution in test generation
        try {
            int int27 = extendedProperties0.getInteger("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 1 + "'", short23 == (short) 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "/" + "'", str25, "/");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        java.io.InputStream inputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream8, "${");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("/", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: / (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.lang.String str6 = propertiesReader3.readLine();
        java.util.stream.Stream<java.lang.String> strStream7 = propertiesReader3.lines();
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = propertiesReader3.transferTo(writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strStream7);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        java.lang.Object obj9 = extendedProperties0.getProperty("${");
        float float12 = extendedProperties0.getFloat(",", (float) (byte) -1);
        java.lang.String str14 = extendedProperties0.testBoolean("/");
        java.lang.String str15 = extendedProperties0.basePath;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = extendedProperties0.getInt("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        int int4 = propertiesReader3.getLineNumber();
        java.nio.CharBuffer charBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = propertiesReader3.read(charBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        propertiesReader3.mark(10);
        boolean boolean9 = propertiesReader3.markSupported();
        int int10 = propertiesReader3.read();
        boolean boolean11 = propertiesReader3.ready();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        extendedProperties8.setProperty("}", (java.lang.Object) "}");
        java.lang.Short short14 = extendedProperties8.getShort("hi!", (java.lang.Short) (short) 100);
        java.io.OutputStream outputStream15 = null;
        extendedProperties8.save(outputStream15, "");
        java.lang.Float float20 = extendedProperties8.getFloat(",", (java.lang.Float) 1.0f);
        extendedProperties8.file = "hi!";
        java.lang.String str24 = extendedProperties8.getString("${");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 100 + "'", short14 == (short) 100);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        boolean boolean12 = extendedProperties0.getBoolean("/", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj15 = extendedProperties13.getProperty("");
        java.lang.String str16 = extendedProperties13.file;
        extendedProperties13.file = "";
        extendedProperties13.setProperty("/", (java.lang.Object) false);
        extendedProperties0.combine(extendedProperties13);
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list26 = extendedProperties24.getList("");
        java.util.Properties properties28 = extendedProperties24.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties28);
        extendedProperties13.setProperty("${", (java.lang.Object) properties28);
        int int33 = extendedProperties13.getInt("}", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = extendedProperties13.getInt("${");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: '${' doesn't map to a Integer object");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNotNull(extendedProperties29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        extendedProperties0.file = "/";
        boolean boolean6 = extendedProperties0.isInitialized;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = extendedProperties0.getDouble("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str4 = extendedProperties0.interpolate("}");
        java.lang.String str6 = extendedProperties0.interpolate("");
        double double9 = extendedProperties0.getDouble("/", (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            byte byte11 = extendedProperties0.getByte("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${ doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.lang.String str6 = propertiesReader3.readProperty();
        boolean boolean7 = propertiesReader3.markSupported();
        java.lang.String str8 = propertiesReader3.readLine();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader9 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = propertiesReader9.transferTo(writer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.lang.String str6 = propertiesReader3.readProperty();
        boolean boolean7 = propertiesReader3.markSupported();
        java.lang.String str8 = propertiesReader3.readLine();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader9 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        propertiesReader3.mark((int) (byte) 10);
        long long13 = propertiesReader3.skip(1L);
        java.io.Writer writer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = propertiesReader3.transferTo(writer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        boolean boolean10 = extendedProperties0.isInitialized();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        int int7 = propertiesReader3.read();
        boolean boolean8 = propertiesReader3.ready();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Vector vector8 = extendedProperties0.getVector("");
        java.lang.String[] strArray10 = extendedProperties0.getStringArray("hi!");
        java.util.Vector vector12 = null;
        java.util.Vector vector13 = extendedProperties0.getVector("/", vector12);
        java.lang.String str16 = extendedProperties0.getString("/", "${");
        // The following exception was thrown during execution in test generation
        try {
            double double18 = extendedProperties0.getDouble("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(vector13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "${" + "'", str16, "${");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj7 = extendedProperties5.getProperty("");
        java.util.List list9 = extendedProperties5.getList("hi!");
        extendedProperties0.addProperty("", (java.lang.Object) list9);
        java.lang.String str11 = extendedProperties0.getInclude();
        extendedProperties0.isInitialized = true;
        java.lang.String str14 = extendedProperties0.getInclude();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        extendedProperties0.basePath = ",";
        java.lang.String[] strArray4 = extendedProperties0.getStringArray("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj8 = extendedProperties6.getProperty("");
        java.lang.String str9 = extendedProperties6.file;
        java.lang.String str11 = extendedProperties6.testBoolean("hi!");
        java.util.Properties properties13 = extendedProperties6.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties13);
        extendedProperties14.display();
        int int18 = extendedProperties14.getInteger("${", (int) (byte) 10);
        java.lang.String[] strArray20 = extendedProperties14.getStringArray("/");
        int int23 = extendedProperties14.getInt(",", (int) (byte) 10);
        extendedProperties0.addProperty("/", (java.lang.Object) extendedProperties14);
        // The following exception was thrown during execution in test generation
        try {
            short short26 = extendedProperties0.getShort("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(extendedProperties14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        int int5 = propertiesReader3.getLineNumber();
        int int6 = propertiesReader3.read();
        java.lang.String str7 = propertiesReader3.readProperty();
        java.util.stream.Stream<java.lang.String> strStream8 = propertiesReader3.lines();
        java.io.Reader reader9 = java.io.Reader.nullReader();
        char[] charArray10 = new char[] {};
        int int11 = reader9.read(charArray10);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader12 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader9);
        boolean boolean13 = propertiesReader12.markSupported();
        java.lang.String str14 = propertiesReader12.readLine();
        java.lang.String str15 = propertiesReader12.readProperty();
        java.io.Reader reader16 = java.io.Reader.nullReader();
        char[] charArray17 = new char[] {};
        int int18 = reader16.read(charArray17);
        int int19 = propertiesReader12.read(charArray17);
        int int20 = propertiesReader3.read(charArray17);
        boolean boolean21 = propertiesReader3.ready();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.String str6 = extendedProperties0.basePath;
        java.lang.String str7 = extendedProperties0.fileSeparator;
        java.lang.Boolean boolean10 = extendedProperties0.getBoolean("", (java.lang.Boolean) true);
        java.lang.String str11 = extendedProperties0.fileSeparator;
        java.util.Vector vector13 = extendedProperties0.getVector("}");
        java.lang.String str15 = extendedProperties0.interpolate(",");
        java.lang.String str16 = extendedProperties0.file;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = extendedProperties0.getInteger("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/" + "'", str11, "/");
        org.junit.Assert.assertNotNull(vector13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "," + "'", str15, ",");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.util.Properties properties4 = extendedProperties0.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties4);
        java.lang.String str7 = extendedProperties5.testBoolean("${");
        java.lang.Short short10 = extendedProperties5.getShort("}", (java.lang.Short) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = extendedProperties5.getDouble("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(extendedProperties5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        byte byte12 = extendedProperties0.getByte("}", (byte) 0);
        extendedProperties0.setInclude("${");
        java.io.Reader reader16 = java.io.Reader.nullReader();
        char[] charArray17 = new char[] {};
        int int18 = reader16.read(charArray17);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader19 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader16);
        extendedProperties0.addProperty("hi!", (java.lang.Object) reader16);
        java.io.InputStream inputStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream21, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str4 = extendedProperties0.interpolate("}");
        java.lang.String str6 = extendedProperties0.interpolate("");
        double double9 = extendedProperties0.getDouble("/", (double) 1.0f);
        java.lang.Long long12 = extendedProperties0.getLong("/", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = extendedProperties0.subset("/");
        float float17 = extendedProperties0.getFloat(",", (float) 1L);
        java.lang.Integer int20 = extendedProperties0.getInteger("", (java.lang.Integer) 0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(extendedProperties14);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        java.lang.String str9 = extendedProperties8.file;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = extendedProperties8.getLong(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties(",", "${");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: , (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        short short7 = extendedProperties0.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj11 = extendedProperties9.getProperty("");
        long long14 = extendedProperties9.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList15 = extendedProperties9.keysAsListed;
        java.util.Vector vector17 = extendedProperties9.getVector("");
        java.util.Vector vector18 = extendedProperties0.getVector("}", vector17);
        extendedProperties0.setInclude("}");
        // The following exception was thrown during execution in test generation
        try {
            double double22 = extendedProperties0.getDouble("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(arrayList15);
        org.junit.Assert.assertNotNull(vector17);
        org.junit.Assert.assertNotNull(vector18);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        extendedProperties0.setInclude("hi!");
        java.lang.String str8 = extendedProperties0.testBoolean("hi!");
        float float11 = extendedProperties0.getFloat("${", (float) 0);
        java.lang.String str12 = extendedProperties0.fileSeparator;
        extendedProperties0.fileSeparator = "/";
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/" + "'", str12, "/");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        propertiesReader3.mark(10);
        long long10 = propertiesReader3.skip((long) '#');
        propertiesReader3.setLineNumber(0);
        java.lang.Class<?> wildcardClass13 = propertiesReader3.getClass();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        int int7 = propertiesReader3.read();
        boolean boolean8 = propertiesReader3.markSupported();
        java.io.Reader reader9 = java.io.Reader.nullReader();
        char[] charArray10 = new char[] {};
        int int11 = reader9.read(charArray10);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader12 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader9);
        boolean boolean13 = propertiesReader12.markSupported();
        propertiesReader12.setLineNumber((-1));
        java.io.Reader reader16 = java.io.Reader.nullReader();
        char[] charArray17 = new char[] {};
        int int18 = reader16.read(charArray17);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader19 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader16);
        boolean boolean20 = propertiesReader19.markSupported();
        java.lang.String str21 = propertiesReader19.readLine();
        java.lang.String str22 = propertiesReader19.readLine();
        java.util.stream.Stream<java.lang.String> strStream23 = propertiesReader19.lines();
        java.io.Reader reader24 = java.io.Reader.nullReader();
        char[] charArray25 = new char[] {};
        int int26 = reader24.read(charArray25);
        int int27 = propertiesReader19.read(charArray25);
        int int28 = propertiesReader12.read(charArray25);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = propertiesReader3.read(charArray25, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strStream23);
        org.junit.Assert.assertNotNull(reader24);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        int int5 = propertiesReader3.getLineNumber();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        propertiesReader3.mark(97);
        java.lang.String str9 = propertiesReader3.readLine();
        java.lang.String str10 = propertiesReader3.readProperty();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        int int10 = extendedProperties0.getInt("${", (int) (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj13 = extendedProperties11.getProperty("");
        java.util.List list15 = extendedProperties11.getList("hi!");
        java.lang.String str17 = extendedProperties11.interpolate("");
        java.lang.Short short20 = extendedProperties11.getShort("", (java.lang.Short) (short) -1);
        extendedProperties0.combine(extendedProperties11);
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = extendedProperties0.subset("");
        java.lang.String[] strArray25 = extendedProperties0.getStringArray("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = extendedProperties0.subset(",");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = extendedProperties27.getString("}", ",");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) -1 + "'", short20 == (short) -1);
        org.junit.Assert.assertNull(extendedProperties23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
        org.junit.Assert.assertNull(extendedProperties27);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Vector vector8 = extendedProperties0.getVector("");
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj12 = extendedProperties10.getProperty("");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        short short17 = extendedProperties14.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj21 = extendedProperties19.getProperty("");
        java.util.List list23 = extendedProperties19.getList("hi!");
        extendedProperties14.addProperty("", (java.lang.Object) list23);
        java.lang.String str25 = extendedProperties10.interpolateHelper("", list23);
        java.util.List list26 = extendedProperties0.getList("/", list23);
        java.lang.Float float29 = extendedProperties0.getFloat("}", (java.lang.Float) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            byte byte31 = extendedProperties0.getByte("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${ doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 10.0f + "'", float29 == 10.0f);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list10 = extendedProperties8.getList("");
        double double13 = extendedProperties8.getDouble("hi!", 100.0d);
        extendedProperties0.setProperty("", (java.lang.Object) 100.0d);
        extendedProperties0.setInclude("/");
        java.io.OutputStream outputStream17 = null;
        extendedProperties0.save(outputStream17, "}");
        java.util.Iterator iterator21 = extendedProperties0.getKeys(",");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        int int12 = extendedProperties9.getInt("hi!", (int) (byte) 100);
        boolean boolean15 = extendedProperties9.getBoolean(",", true);
        java.lang.Object obj17 = extendedProperties9.getProperty("/");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertNotNull(extendedProperties9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.lang.String str6 = propertiesReader3.readProperty();
        boolean boolean7 = propertiesReader3.markSupported();
        java.lang.String str8 = propertiesReader3.readLine();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader9 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        propertiesReader3.mark((int) (byte) 10);
        java.util.stream.Stream<java.lang.String> strStream12 = propertiesReader3.lines();
        java.nio.CharBuffer charBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = propertiesReader3.read(charBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strStream12);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.String str6 = extendedProperties0.basePath;
        java.util.Vector vector8 = extendedProperties0.getVector("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list12 = extendedProperties10.getList("");
        extendedProperties10.setInclude("hi!");
        java.util.Properties properties16 = null;
        java.util.Properties properties17 = extendedProperties10.getProperties("", properties16);
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj21 = extendedProperties19.getProperty("");
        java.util.List list23 = extendedProperties19.getList("hi!");
        extendedProperties19.setInclude("hi!");
        java.util.List list27 = extendedProperties19.getList("hi!");
        java.lang.String str28 = extendedProperties19.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = extendedProperties19.subset("/");
        java.util.ArrayList arrayList31 = extendedProperties19.keysAsListed;
        java.util.List list32 = extendedProperties10.getList("", (java.util.List) arrayList31);
        java.util.List list33 = extendedProperties0.getList("/", list32);
        java.lang.String str34 = extendedProperties0.file;
        // The following exception was thrown during execution in test generation
        try {
            int int36 = extendedProperties0.getInteger("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNull(extendedProperties30);
        org.junit.Assert.assertNotNull(arrayList31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        java.lang.Object obj9 = extendedProperties0.getProperty("${");
        java.lang.Long long12 = extendedProperties0.getLong("}", (java.lang.Long) 10L);
        // The following exception was thrown during execution in test generation
        try {
            short short14 = extendedProperties0.getShort("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        short short7 = extendedProperties0.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj11 = extendedProperties9.getProperty("");
        long long14 = extendedProperties9.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList15 = extendedProperties9.keysAsListed;
        java.util.Vector vector17 = extendedProperties9.getVector("");
        java.util.Vector vector18 = extendedProperties0.getVector("}", vector17);
        // The following exception was thrown during execution in test generation
        try {
            short short20 = extendedProperties0.getShort("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(arrayList15);
        org.junit.Assert.assertNotNull(vector17);
        org.junit.Assert.assertNotNull(vector18);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.lang.String str11 = extendedProperties0.interpolate("hi!");
        java.lang.String str13 = extendedProperties0.interpolate("}");
        java.lang.String str14 = extendedProperties0.basePath;
        byte byte17 = extendedProperties0.getByte("/", (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte byte19 = extendedProperties0.getByte(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ', doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}" + "'", str13, "}");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.commons.collections.ExtendedProperties.include = "hi!";
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream7, ",");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.lang.String str4 = extendedProperties0.testBoolean("");
        org.apache.commons.collections.ExtendedProperties extendedProperties6 = extendedProperties0.subset("${");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = extendedProperties0.getBoolean(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(extendedProperties6);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        extendedProperties0.setInclude("hi!");
        java.util.List list8 = extendedProperties0.getList("hi!");
        java.lang.String str9 = extendedProperties0.getInclude();
        // The following exception was thrown during execution in test generation
        try {
            float float11 = extendedProperties0.getFloat("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.lang.String str11 = extendedProperties0.interpolate("hi!");
        java.lang.String str13 = extendedProperties0.interpolate("}");
        java.lang.String str14 = extendedProperties0.file;
        extendedProperties0.isInitialized = true;
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}" + "'", str13, "}");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.io.OutputStream outputStream6 = null;
        extendedProperties0.save(outputStream6, "${");
        extendedProperties0.display();
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj13 = extendedProperties11.getProperty("");
        java.lang.String str15 = extendedProperties11.interpolate("}");
        java.lang.String str17 = extendedProperties11.interpolate("");
        extendedProperties0.addProperty("/", (java.lang.Object) extendedProperties11);
        java.lang.String str20 = extendedProperties11.interpolate("");
        boolean boolean23 = extendedProperties11.getBoolean("", false);
        double double26 = extendedProperties11.getDouble(",", (double) 100.0f);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "}" + "'", str15, "}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list10 = extendedProperties8.getList("");
        double double13 = extendedProperties8.getDouble("hi!", 100.0d);
        extendedProperties0.setProperty("", (java.lang.Object) 100.0d);
        extendedProperties0.fileSeparator = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            int int18 = extendedProperties0.getInteger("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Vector vector8 = extendedProperties0.getVector("");
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj12 = extendedProperties10.getProperty("");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        short short17 = extendedProperties14.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj21 = extendedProperties19.getProperty("");
        java.util.List list23 = extendedProperties19.getList("hi!");
        extendedProperties14.addProperty("", (java.lang.Object) list23);
        java.lang.String str25 = extendedProperties10.interpolateHelper("", list23);
        java.util.List list26 = extendedProperties0.getList("/", list23);
        java.lang.Float float29 = extendedProperties0.getFloat("}", (java.lang.Float) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = extendedProperties0.getInt(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 10.0f + "'", float29 == 10.0f);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.String str8 = extendedProperties0.getString("${", "}");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = extendedProperties0.getBoolean("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "}" + "'", str8, "}");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        java.lang.String str5 = extendedProperties0.getInclude();
        java.lang.Double double8 = extendedProperties0.getDouble("hi!", (java.lang.Double) 100.0d);
        java.lang.String str10 = extendedProperties0.testBoolean(",");
        java.lang.String str12 = extendedProperties0.getString("");
        java.lang.Byte byte15 = extendedProperties0.getByte(",", (java.lang.Byte) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            short short17 = extendedProperties0.getShort("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        int int2 = propertiesTokenizer1.countTokens();
        boolean boolean3 = propertiesTokenizer1.hasMoreTokens();
        java.lang.String str5 = propertiesTokenizer1.nextToken("/");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        java.util.stream.Stream<java.lang.String> strStream7 = propertiesReader3.lines();
        boolean boolean8 = propertiesReader3.markSupported();
        int int9 = propertiesReader3.getLineNumber();
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = propertiesReader3.transferTo(writer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertNotNull(strStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        java.util.List list5 = extendedProperties0.getList("");
        java.lang.Class<?> wildcardClass6 = list5.getClass();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.lang.String str8 = extendedProperties0.interpolate("${");
        // The following exception was thrown during execution in test generation
        try {
            long long10 = extendedProperties0.getLong("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "${" + "'", str8, "${");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        boolean boolean12 = extendedProperties0.getBoolean("/", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj16 = extendedProperties14.getProperty("");
        java.lang.String str17 = extendedProperties14.file;
        extendedProperties14.file = "";
        extendedProperties14.setProperty("/", (java.lang.Object) false);
        java.lang.String str23 = extendedProperties14.fileSeparator;
        extendedProperties0.setProperty(",", (java.lang.Object) str23);
        boolean boolean25 = extendedProperties0.isInitialized();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "/" + "'", str23, "/");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.lang.String str4 = extendedProperties0.testBoolean("");
        double double7 = extendedProperties0.getDouble("/", (double) 10L);
        java.lang.String str9 = extendedProperties0.getString("");
        // The following exception was thrown during execution in test generation
        try {
            float float11 = extendedProperties0.getFloat("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.String str6 = extendedProperties0.basePath;
        java.lang.String str7 = extendedProperties0.fileSeparator;
        java.lang.Boolean boolean10 = extendedProperties0.getBoolean("", (java.lang.Boolean) true);
        java.lang.String str11 = extendedProperties0.fileSeparator;
        java.util.Vector vector13 = extendedProperties0.getVector("}");
        java.lang.String str15 = extendedProperties0.interpolate(",");
        java.lang.String str16 = extendedProperties0.file;
        java.util.Iterator iterator17 = extendedProperties0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = extendedProperties0.getDouble("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/" + "'", str11, "/");
        org.junit.Assert.assertNotNull(vector13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "," + "'", str15, ",");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("${", "}");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ${ (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = extendedProperties0.subset("${");
        double double10 = extendedProperties0.getDouble("}", (double) (short) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj14 = extendedProperties12.getProperty("");
        java.lang.String str15 = extendedProperties12.file;
        java.lang.String str17 = extendedProperties12.testBoolean("hi!");
        java.util.Properties properties19 = extendedProperties12.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties19);
        extendedProperties20.display();
        int int24 = extendedProperties20.getInteger("${", (int) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj28 = extendedProperties26.getProperty("");
        java.util.List list30 = extendedProperties26.getList("hi!");
        java.lang.String str32 = extendedProperties26.interpolate("");
        java.lang.Short short35 = extendedProperties26.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator36 = extendedProperties26.getKeys();
        java.lang.Byte byte39 = extendedProperties26.getByte("", (java.lang.Byte) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties41 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list43 = extendedProperties41.getList("");
        extendedProperties41.setInclude("hi!");
        extendedProperties41.setInclude("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties49 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj51 = extendedProperties49.getProperty("");
        java.util.List list53 = extendedProperties49.getList("hi!");
        short short56 = extendedProperties49.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties58 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj60 = extendedProperties58.getProperty("");
        long long63 = extendedProperties58.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList64 = extendedProperties58.keysAsListed;
        java.util.Vector vector66 = extendedProperties58.getVector("");
        java.util.Vector vector67 = extendedProperties49.getVector("}", vector66);
        java.util.Vector vector68 = extendedProperties41.getVector("}", vector67);
        java.util.Vector vector69 = extendedProperties26.getVector("/", vector67);
        java.util.List list70 = extendedProperties20.getList("${", (java.util.List) vector69);
        java.util.List list71 = extendedProperties0.getList("", (java.util.List) vector69);
        // The following exception was thrown during execution in test generation
        try {
            byte byte73 = extendedProperties0.getByte(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ', doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(extendedProperties7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNotNull(extendedProperties20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + short35 + "' != '" + (short) -1 + "'", short35 == (short) -1);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 0 + "'", byte39 == (byte) 0);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertTrue("'" + short56 + "' != '" + (short) 10 + "'", short56 == (short) 10);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 100L + "'", long63 == 100L);
        org.junit.Assert.assertNotNull(arrayList64);
        org.junit.Assert.assertNotNull(vector66);
        org.junit.Assert.assertNotNull(vector67);
        org.junit.Assert.assertNotNull(vector68);
        org.junit.Assert.assertNotNull(vector69);
        org.junit.Assert.assertNotNull(list70);
        org.junit.Assert.assertNotNull(list71);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        int int5 = extendedProperties0.getInt("", (int) ' ');
        long long8 = extendedProperties0.getLong("${", (long) (short) 0);
        java.util.Properties properties10 = null;
        java.util.Properties properties11 = extendedProperties0.getProperties("}", properties10);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = extendedProperties0.getInt("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("hi!", ",");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = extendedProperties0.subset("");
        int int8 = extendedProperties0.getInteger("${", 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(extendedProperties5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Vector vector8 = extendedProperties0.getVector("");
        extendedProperties0.display();
        java.lang.Double double12 = extendedProperties0.getDouble("", (java.lang.Double) 10.0d);
        java.util.Iterator iterator13 = extendedProperties0.getKeys();
        extendedProperties0.display();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = extendedProperties0.getInt("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.lang.String str6 = propertiesReader3.readProperty();
        java.lang.Class<?> wildcardClass7 = propertiesReader3.getClass();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Vector vector8 = extendedProperties0.getVector("");
        java.lang.String[] strArray10 = extendedProperties0.getStringArray("hi!");
        java.util.Vector vector12 = null;
        java.util.Vector vector13 = extendedProperties0.getVector("/", vector12);
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list17 = extendedProperties15.getList("");
        double double20 = extendedProperties15.getDouble("hi!", 100.0d);
        java.lang.String str23 = extendedProperties15.getString("${", "}");
        extendedProperties0.setProperty(",", (java.lang.Object) "}");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(vector13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "}" + "'", str23, "}");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("/");
        java.lang.Object obj2 = propertiesTokenizer1.nextElement();
        java.lang.String str4 = propertiesTokenizer1.nextToken("${");
        java.util.Iterator<java.lang.Object> objItor5 = propertiesTokenizer1.asIterator();
        java.lang.Object obj6 = propertiesTokenizer1.nextElement();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "/" + "'", obj2, "/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "" + "'", obj6, "");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        boolean boolean12 = extendedProperties0.getBoolean("/", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj15 = extendedProperties13.getProperty("");
        java.lang.String str16 = extendedProperties13.file;
        extendedProperties13.file = "";
        extendedProperties13.setProperty("/", (java.lang.Object) false);
        extendedProperties0.combine(extendedProperties13);
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list26 = extendedProperties24.getList("");
        java.util.Properties properties28 = extendedProperties24.getProperties("");
        java.lang.String str30 = extendedProperties24.testBoolean("hi!");
        extendedProperties24.clearProperty("hi!");
        extendedProperties13.setProperty("${", (java.lang.Object) extendedProperties24);
        // The following exception was thrown during execution in test generation
        try {
            float float35 = extendedProperties24.getFloat("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        short short10 = extendedProperties0.getShort("", (short) -1);
        float float13 = extendedProperties0.getFloat(",", 10.0f);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator10 = extendedProperties0.getKeys();
        java.lang.Byte byte13 = extendedProperties0.getByte("", (java.lang.Byte) (byte) 0);
        extendedProperties0.isInitialized = false;
        java.io.OutputStream outputStream16 = null;
        extendedProperties0.save(outputStream16, "hi!");
        java.lang.String[] strArray20 = extendedProperties0.getStringArray("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj24 = extendedProperties22.getProperty("");
        java.util.List list26 = extendedProperties22.getList("hi!");
        java.lang.String str28 = extendedProperties22.interpolate("");
        java.lang.Short short31 = extendedProperties22.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator32 = extendedProperties22.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties34 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj36 = extendedProperties34.getProperty("");
        java.lang.String str37 = extendedProperties34.file;
        java.lang.String str39 = extendedProperties34.testBoolean("hi!");
        java.util.Properties properties41 = extendedProperties34.getProperties("/");
        java.util.Properties properties42 = extendedProperties22.getProperties("", properties41);
        java.util.Properties properties43 = extendedProperties0.getProperties("", properties42);
        java.lang.Class<?> wildcardClass44 = extendedProperties0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) -1 + "'", short31 == (short) -1);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj7 = extendedProperties5.getProperty("");
        java.util.List list9 = extendedProperties5.getList("hi!");
        extendedProperties0.addProperty("", (java.lang.Object) list9);
        java.lang.String str11 = extendedProperties0.getInclude();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = extendedProperties0.getInt(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        extendedProperties0.file = "/";
        double double8 = extendedProperties0.getDouble("${", (double) 10L);
        java.lang.String str9 = extendedProperties0.basePath;
        java.lang.String str10 = extendedProperties0.fileSeparator;
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/" + "'", str10, "/");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        extendedProperties0.setInclude("hi!");
        java.util.List list8 = extendedProperties0.getList("hi!");
        java.lang.String str9 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = extendedProperties0.subset("/");
        java.util.ArrayList arrayList12 = extendedProperties0.keysAsListed;
        java.lang.Boolean boolean15 = extendedProperties0.getBoolean("", (java.lang.Boolean) false);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(extendedProperties11);
        org.junit.Assert.assertNotNull(arrayList12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        int int10 = extendedProperties0.getInt("${", (int) (byte) 100);
        java.lang.String str11 = extendedProperties0.file;
        java.util.Properties properties13 = extendedProperties0.getProperties("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties13);
        int int17 = extendedProperties14.getInt("/", 52);
        java.io.OutputStream outputStream18 = null;
        extendedProperties14.save(outputStream18, "/");
        byte byte23 = extendedProperties14.getByte("hi!", (byte) -1);
        java.lang.Short short26 = extendedProperties14.getShort(",", (java.lang.Short) (short) 1);
        java.lang.Byte byte29 = extendedProperties14.getByte("/", (java.lang.Byte) (byte) -1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(extendedProperties14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) -1 + "'", byte23 == (byte) -1);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 1 + "'", short26 == (short) 1);
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) -1 + "'", byte29 == (byte) -1);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Vector vector8 = extendedProperties0.getVector("");
        extendedProperties0.display();
        java.lang.Double double12 = extendedProperties0.getDouble("", (java.lang.Double) 10.0d);
        java.lang.Boolean boolean15 = extendedProperties0.getBoolean("${", (java.lang.Boolean) false);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = extendedProperties0.getInteger("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader3.setLineNumber((int) (short) 10);
        java.io.Reader reader6 = java.io.Reader.nullReader();
        char[] charArray7 = new char[] {};
        int int8 = reader6.read(charArray7);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader9 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader6);
        propertiesReader9.setLineNumber((int) (short) 10);
        int int12 = propertiesReader9.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader13 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader9);
        propertiesReader13.setLineNumber((int) (short) 1);
        java.lang.String str16 = propertiesReader13.readProperty();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader17 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader13);
        long long19 = propertiesReader13.skip((long) 1);
        java.io.Reader reader20 = java.io.Reader.nullReader();
        char[] charArray21 = new char[] {};
        int int22 = reader20.read(charArray21);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader23 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader20);
        boolean boolean24 = propertiesReader23.markSupported();
        java.lang.String str25 = propertiesReader23.readLine();
        boolean boolean26 = propertiesReader23.markSupported();
        java.io.Reader reader27 = java.io.Reader.nullReader();
        char[] charArray28 = new char[] {};
        int int29 = reader27.read(charArray28);
        int int30 = propertiesReader23.read(charArray28);
        int int31 = propertiesReader13.read(charArray28);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = propertiesReader3.read(charArray28, 52, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(reader6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(reader20);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(reader27);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader3.setLineNumber((int) (short) 10);
        int int6 = propertiesReader3.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader7 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        propertiesReader7.setLineNumber((int) (short) 1);
        java.nio.CharBuffer charBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = propertiesReader7.read(charBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        int int5 = extendedProperties0.getInt("hi!", (int) (short) 1);
        java.io.InputStream inputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream6, "/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Vector vector8 = extendedProperties0.getVector("");
        extendedProperties0.display();
        java.lang.Double double12 = extendedProperties0.getDouble("", (java.lang.Double) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            byte byte14 = extendedProperties0.getByte("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/ doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        int int5 = propertiesReader3.getLineNumber();
        int int6 = propertiesReader3.read();
        propertiesReader3.mark(0);
        int int9 = propertiesReader3.read();
        int int10 = propertiesReader3.read();
        boolean boolean11 = propertiesReader3.markSupported();
        java.io.Reader reader12 = java.io.Reader.nullReader();
        char[] charArray13 = new char[] {};
        int int14 = reader12.read(charArray13);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader15 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader12);
        boolean boolean16 = propertiesReader15.markSupported();
        java.lang.String str17 = propertiesReader15.readLine();
        java.lang.String str18 = propertiesReader15.readProperty();
        boolean boolean19 = propertiesReader15.markSupported();
        java.lang.String str20 = propertiesReader15.readLine();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader21 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader15);
        long long23 = propertiesReader21.skip((long) (byte) 100);
        java.io.Reader reader24 = java.io.Reader.nullReader();
        char[] charArray25 = new char[] {};
        int int26 = reader24.read(charArray25);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader27 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader24);
        char[] charArray34 = new char[] { 'a', ' ', '#', ' ', '#', ' ' };
        int int35 = reader24.read(charArray34);
        int int36 = propertiesReader21.read(charArray34);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = propertiesReader3.read(charArray34, (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(reader12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(reader24);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { 'a', ' ', '#', ' ', '#', ' ' });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.util.Iterator iterator3 = extendedProperties0.getKeys();
        boolean boolean6 = extendedProperties0.getBoolean("hi!", false);
        java.lang.String str8 = extendedProperties0.interpolate(",");
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = extendedProperties0.subset("");
        long long8 = extendedProperties0.getLong("/", (long) (short) 0);
        float float11 = extendedProperties0.getFloat("/", 10.0f);
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list15 = extendedProperties13.getList("");
        extendedProperties13.setInclude("hi!");
        java.lang.String str18 = extendedProperties13.getInclude();
        java.lang.Double double21 = extendedProperties13.getDouble("hi!", (java.lang.Double) 100.0d);
        java.lang.Long long24 = extendedProperties13.getLong("}", (java.lang.Long) 97L);
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj28 = extendedProperties26.getProperty("");
        java.util.List list30 = extendedProperties26.getList("hi!");
        java.lang.String str32 = extendedProperties26.interpolate("");
        java.lang.Short short35 = extendedProperties26.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator36 = extendedProperties26.getKeys();
        java.lang.Byte byte39 = extendedProperties26.getByte("", (java.lang.Byte) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties41 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list43 = extendedProperties41.getList("");
        extendedProperties41.setInclude("hi!");
        extendedProperties41.setInclude("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties49 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj51 = extendedProperties49.getProperty("");
        java.util.List list53 = extendedProperties49.getList("hi!");
        short short56 = extendedProperties49.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties58 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj60 = extendedProperties58.getProperty("");
        long long63 = extendedProperties58.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList64 = extendedProperties58.keysAsListed;
        java.util.Vector vector66 = extendedProperties58.getVector("");
        java.util.Vector vector67 = extendedProperties49.getVector("}", vector66);
        java.util.Vector vector68 = extendedProperties41.getVector("}", vector67);
        java.util.Vector vector69 = extendedProperties26.getVector("/", vector67);
        java.util.List list70 = extendedProperties13.getList("hi!", (java.util.List) vector69);
        java.lang.String str71 = extendedProperties0.interpolateHelper("hi!", (java.util.List) vector69);
        // The following exception was thrown during execution in test generation
        try {
            short short73 = extendedProperties0.getShort("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(extendedProperties5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + short35 + "' != '" + (short) -1 + "'", short35 == (short) -1);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 0 + "'", byte39 == (byte) 0);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertTrue("'" + short56 + "' != '" + (short) 10 + "'", short56 == (short) 10);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 100L + "'", long63 == 100L);
        org.junit.Assert.assertNotNull(arrayList64);
        org.junit.Assert.assertNotNull(vector66);
        org.junit.Assert.assertNotNull(vector67);
        org.junit.Assert.assertNotNull(vector68);
        org.junit.Assert.assertNotNull(vector69);
        org.junit.Assert.assertNotNull(list70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.util.Properties properties4 = extendedProperties0.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties4);
        java.lang.String str7 = extendedProperties5.testBoolean("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list11 = extendedProperties9.getList("");
        java.lang.String str13 = extendedProperties9.testBoolean("");
        org.apache.commons.collections.ExtendedProperties extendedProperties15 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj17 = extendedProperties15.getProperty("");
        java.util.List list19 = extendedProperties15.getList("hi!");
        java.lang.String str21 = extendedProperties15.interpolate("");
        java.lang.Short short24 = extendedProperties15.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator25 = extendedProperties15.getKeys();
        java.lang.Byte byte28 = extendedProperties15.getByte("", (java.lang.Byte) (byte) 0);
        extendedProperties15.isInitialized = false;
        java.io.OutputStream outputStream31 = null;
        extendedProperties15.save(outputStream31, "hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties35 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list37 = extendedProperties35.getList("");
        extendedProperties35.setInclude("hi!");
        java.lang.String str40 = extendedProperties35.getInclude();
        java.lang.Double double43 = extendedProperties35.getDouble("hi!", (java.lang.Double) 100.0d);
        java.lang.Long long46 = extendedProperties35.getLong("}", (java.lang.Long) 97L);
        org.apache.commons.collections.ExtendedProperties extendedProperties48 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj50 = extendedProperties48.getProperty("");
        java.util.List list52 = extendedProperties48.getList("hi!");
        java.lang.String str54 = extendedProperties48.interpolate("");
        java.lang.Short short57 = extendedProperties48.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator58 = extendedProperties48.getKeys();
        java.lang.Byte byte61 = extendedProperties48.getByte("", (java.lang.Byte) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties63 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list65 = extendedProperties63.getList("");
        extendedProperties63.setInclude("hi!");
        extendedProperties63.setInclude("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties71 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj73 = extendedProperties71.getProperty("");
        java.util.List list75 = extendedProperties71.getList("hi!");
        short short78 = extendedProperties71.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties80 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj82 = extendedProperties80.getProperty("");
        long long85 = extendedProperties80.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList86 = extendedProperties80.keysAsListed;
        java.util.Vector vector88 = extendedProperties80.getVector("");
        java.util.Vector vector89 = extendedProperties71.getVector("}", vector88);
        java.util.Vector vector90 = extendedProperties63.getVector("}", vector89);
        java.util.Vector vector91 = extendedProperties48.getVector("/", vector89);
        java.util.List list92 = extendedProperties35.getList("hi!", (java.util.List) vector91);
        java.util.Vector vector93 = extendedProperties15.getVector("${", vector91);
        java.util.Vector vector94 = extendedProperties9.getVector("}", vector91);
        java.util.Vector vector95 = extendedProperties5.getVector("", vector91);
        double double98 = extendedProperties5.getDouble(",", (double) (-1.0f));
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(extendedProperties5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) -1 + "'", short24 == (short) -1);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) 0 + "'", byte28 == (byte) 0);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 100.0d + "'", double43 == 100.0d);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 97L + "'", long46 == 97L);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + short57 + "' != '" + (short) -1 + "'", short57 == (short) -1);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertTrue("'" + byte61 + "' != '" + (byte) 0 + "'", byte61 == (byte) 0);
        org.junit.Assert.assertNotNull(list65);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(list75);
        org.junit.Assert.assertTrue("'" + short78 + "' != '" + (short) 10 + "'", short78 == (short) 10);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 100L + "'", long85 == 100L);
        org.junit.Assert.assertNotNull(arrayList86);
        org.junit.Assert.assertNotNull(vector88);
        org.junit.Assert.assertNotNull(vector89);
        org.junit.Assert.assertNotNull(vector90);
        org.junit.Assert.assertNotNull(vector91);
        org.junit.Assert.assertNotNull(list92);
        org.junit.Assert.assertNotNull(vector93);
        org.junit.Assert.assertNotNull(vector94);
        org.junit.Assert.assertNotNull(vector95);
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + (-1.0d) + "'", double98 == (-1.0d));
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        extendedProperties0.file = "/";
        boolean boolean6 = extendedProperties0.isInitialized;
        java.lang.String str8 = extendedProperties0.interpolate("${");
        java.util.List list10 = extendedProperties0.getList("");
        java.lang.String[] strArray12 = extendedProperties0.getStringArray("/");
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "${" + "'", str8, "${");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties2 = new org.apache.commons.collections.ExtendedProperties("}", "}");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: } (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list10 = extendedProperties8.getList("");
        double double13 = extendedProperties8.getDouble("hi!", 100.0d);
        extendedProperties0.setProperty("", (java.lang.Object) 100.0d);
        extendedProperties0.setInclude("/");
        java.lang.String str17 = extendedProperties0.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj20 = extendedProperties18.getProperty("");
        long long23 = extendedProperties18.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList24 = extendedProperties18.keysAsListed;
        java.util.Vector vector26 = extendedProperties18.getVector("");
        extendedProperties18.display();
        java.lang.Double double30 = extendedProperties18.getDouble("", (java.lang.Double) 10.0d);
        extendedProperties0.combine(extendedProperties18);
        // The following exception was thrown during execution in test generation
        try {
            float float33 = extendedProperties18.getFloat("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/" + "'", str17, "/");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertNotNull(arrayList24);
        org.junit.Assert.assertNotNull(vector26);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        java.util.Properties properties6 = null;
        java.util.Properties properties7 = extendedProperties0.getProperties("", properties6);
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        int int11 = extendedProperties8.getInteger("", 32);
        short short14 = extendedProperties8.getShort("hi!", (short) -1);
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj18 = extendedProperties16.getProperty("");
        long long21 = extendedProperties16.getLong("", (long) (byte) 100);
        java.io.OutputStream outputStream22 = null;
        extendedProperties16.save(outputStream22, "${");
        extendedProperties16.display();
        java.util.Properties properties27 = extendedProperties16.getProperties("");
        java.util.Properties properties28 = extendedProperties8.getProperties("}", properties27);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNotNull(properties28);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.file = "}";
        java.lang.String str7 = extendedProperties0.getString("}", "hi!");
        java.lang.Double double10 = extendedProperties0.getDouble("hi!", (java.lang.Double) (-1.0d));
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj14 = extendedProperties12.getProperty("");
        long long17 = extendedProperties12.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList18 = extendedProperties12.keysAsListed;
        boolean boolean21 = extendedProperties12.getBoolean("", false);
        boolean boolean24 = extendedProperties12.getBoolean("/", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj28 = extendedProperties26.getProperty("");
        java.lang.String str29 = extendedProperties26.file;
        extendedProperties26.file = "";
        extendedProperties26.setProperty("/", (java.lang.Object) false);
        java.lang.String str35 = extendedProperties26.fileSeparator;
        extendedProperties12.setProperty(",", (java.lang.Object) str35);
        java.lang.Short short39 = extendedProperties12.getShort("", (java.lang.Short) (short) 1);
        java.lang.Byte byte42 = extendedProperties12.getByte("", (java.lang.Byte) (byte) 0);
        extendedProperties0.addProperty("/", (java.lang.Object) "");
        extendedProperties0.fileSeparator = "";
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(arrayList18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "/" + "'", str35, "/");
        org.junit.Assert.assertTrue("'" + short39 + "' != '" + (short) 1 + "'", short39 == (short) 1);
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) 0 + "'", byte42 == (byte) 0);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj7 = extendedProperties5.getProperty("");
        java.util.List list9 = extendedProperties5.getList("hi!");
        extendedProperties0.addProperty("", (java.lang.Object) list9);
        java.lang.String str11 = extendedProperties0.getInclude();
        extendedProperties0.isInitialized = true;
        java.util.Iterator iterator15 = extendedProperties0.getKeys("}");
        java.util.Iterator iterator16 = extendedProperties0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            byte byte18 = extendedProperties0.getByte(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ', doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        extendedProperties8.setProperty("}", (java.lang.Object) "}");
        java.lang.Long long14 = extendedProperties8.getLong("/", (java.lang.Long) 1L);
        boolean boolean17 = extendedProperties8.getBoolean("", true);
        java.lang.Double double20 = extendedProperties8.getDouble("hi!", (java.lang.Double) (-1.0d));
        java.lang.Long long23 = extendedProperties8.getLong("hi!", (java.lang.Long) 1L);
        java.lang.String str24 = extendedProperties8.basePath;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = extendedProperties8.getInteger("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list10 = extendedProperties8.getList("");
        double double13 = extendedProperties8.getDouble("hi!", 100.0d);
        extendedProperties0.setProperty("", (java.lang.Object) 100.0d);
        extendedProperties0.setInclude("/");
        java.lang.String str17 = extendedProperties0.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj20 = extendedProperties18.getProperty("");
        long long23 = extendedProperties18.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList24 = extendedProperties18.keysAsListed;
        java.util.Vector vector26 = extendedProperties18.getVector("");
        extendedProperties18.display();
        java.lang.Double double30 = extendedProperties18.getDouble("", (java.lang.Double) 10.0d);
        extendedProperties0.combine(extendedProperties18);
        double double34 = extendedProperties0.getDouble(",", (double) 1L);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/" + "'", str17, "/");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertNotNull(arrayList24);
        org.junit.Assert.assertNotNull(vector26);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        int int12 = extendedProperties9.getInt("hi!", (int) (byte) 100);
        java.io.InputStream inputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties9.load(inputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertNotNull(extendedProperties9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = extendedProperties0.subset("${");
        extendedProperties0.basePath = "${";
        java.util.ArrayList arrayList10 = extendedProperties0.keysAsListed;
        java.lang.Short short13 = extendedProperties0.getShort("}", (java.lang.Short) (short) 10);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(extendedProperties7);
        org.junit.Assert.assertNotNull(arrayList10);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.io.OutputStream outputStream6 = null;
        extendedProperties0.save(outputStream6, "${");
        extendedProperties0.display();
        java.util.Properties properties11 = extendedProperties0.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties11);
        java.lang.Short short15 = extendedProperties12.getShort("", (java.lang.Short) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = extendedProperties12.getLong("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNotNull(extendedProperties12);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.String str6 = extendedProperties0.basePath;
        java.lang.String str7 = extendedProperties0.fileSeparator;
        java.lang.Boolean boolean10 = extendedProperties0.getBoolean("", (java.lang.Boolean) true);
        java.lang.String str11 = extendedProperties0.fileSeparator;
        java.util.Vector vector13 = extendedProperties0.getVector("}");
        java.lang.String str15 = extendedProperties0.interpolate(",");
        java.lang.String str16 = extendedProperties0.file;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = extendedProperties0.getDouble("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/" + "'", str11, "/");
        org.junit.Assert.assertNotNull(vector13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "," + "'", str15, ",");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader5 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        int int6 = propertiesReader5.getLineNumber();
        boolean boolean7 = propertiesReader5.markSupported();
        boolean boolean8 = propertiesReader5.markSupported();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader9 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader5);
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = propertiesReader5.transferTo(writer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        int int5 = propertiesReader3.getLineNumber();
        java.lang.String str6 = propertiesReader3.readLine();
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = propertiesReader3.transferTo(writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.io.OutputStream outputStream6 = null;
        extendedProperties0.save(outputStream6, "${");
        extendedProperties0.display();
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj13 = extendedProperties11.getProperty("");
        java.util.List list15 = extendedProperties11.getList("hi!");
        extendedProperties11.setInclude("hi!");
        java.util.List list19 = extendedProperties11.getList("hi!");
        java.lang.String str20 = extendedProperties0.interpolateHelper("hi!", list19);
        java.io.OutputStream outputStream21 = null;
        extendedProperties0.save(outputStream21, "/");
        boolean boolean26 = extendedProperties0.getBoolean("${", false);
        long long29 = extendedProperties0.getLong("", (long) '#');
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 35L + "'", long29 == 35L);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.String str8 = extendedProperties0.getString("${", "}");
        java.lang.Float float11 = extendedProperties0.getFloat("/", (java.lang.Float) 100.0f);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "}" + "'", str8, "}");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        long long3 = extendedProperties0.getLong("hi!", (long) 1);
        long long6 = extendedProperties0.getLong("/", (long) '4');
        java.lang.Boolean boolean9 = extendedProperties0.getBoolean("}", (java.lang.Boolean) true);
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj12 = extendedProperties10.getProperty("");
        java.util.List list14 = extendedProperties10.getList("hi!");
        java.lang.String str16 = extendedProperties10.interpolate("");
        java.lang.Short short19 = extendedProperties10.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator20 = extendedProperties10.getKeys();
        java.lang.Byte byte23 = extendedProperties10.getByte("", (java.lang.Byte) (byte) 0);
        extendedProperties0.combine(extendedProperties10);
        java.lang.Long long27 = extendedProperties0.getLong("hi!", (java.lang.Long) 100L);
        short short30 = extendedProperties0.getShort("${", (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) -1 + "'", short19 == (short) -1);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 0 + "'", byte23 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 0 + "'", short30 == (short) 0);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.util.Properties properties4 = extendedProperties0.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties4);
        java.lang.Integer int8 = extendedProperties5.getInteger("hi!", (java.lang.Integer) 52);
        // The following exception was thrown during execution in test generation
        try {
            short short10 = extendedProperties5.getShort("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(extendedProperties5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator10 = extendedProperties0.getKeys();
        java.lang.Byte byte13 = extendedProperties0.getByte("", (java.lang.Byte) (byte) 0);
        extendedProperties0.isInitialized = false;
        java.io.OutputStream outputStream16 = null;
        extendedProperties0.save(outputStream16, "hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list22 = extendedProperties20.getList("");
        extendedProperties20.setInclude("hi!");
        java.lang.String str25 = extendedProperties20.getInclude();
        java.lang.Double double28 = extendedProperties20.getDouble("hi!", (java.lang.Double) 100.0d);
        java.lang.Long long31 = extendedProperties20.getLong("}", (java.lang.Long) 97L);
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj35 = extendedProperties33.getProperty("");
        java.util.List list37 = extendedProperties33.getList("hi!");
        java.lang.String str39 = extendedProperties33.interpolate("");
        java.lang.Short short42 = extendedProperties33.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator43 = extendedProperties33.getKeys();
        java.lang.Byte byte46 = extendedProperties33.getByte("", (java.lang.Byte) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties48 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list50 = extendedProperties48.getList("");
        extendedProperties48.setInclude("hi!");
        extendedProperties48.setInclude("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties56 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj58 = extendedProperties56.getProperty("");
        java.util.List list60 = extendedProperties56.getList("hi!");
        short short63 = extendedProperties56.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties65 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj67 = extendedProperties65.getProperty("");
        long long70 = extendedProperties65.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList71 = extendedProperties65.keysAsListed;
        java.util.Vector vector73 = extendedProperties65.getVector("");
        java.util.Vector vector74 = extendedProperties56.getVector("}", vector73);
        java.util.Vector vector75 = extendedProperties48.getVector("}", vector74);
        java.util.Vector vector76 = extendedProperties33.getVector("/", vector74);
        java.util.List list77 = extendedProperties20.getList("hi!", (java.util.List) vector76);
        java.util.Vector vector78 = extendedProperties0.getVector("${", vector76);
        // The following exception was thrown during execution in test generation
        try {
            int int80 = extendedProperties0.getInt("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 97L + "'", long31 == 97L);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + short42 + "' != '" + (short) -1 + "'", short42 == (short) -1);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertTrue("'" + byte46 + "' != '" + (byte) 0 + "'", byte46 == (byte) 0);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertTrue("'" + short63 + "' != '" + (short) 10 + "'", short63 == (short) 10);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 100L + "'", long70 == 100L);
        org.junit.Assert.assertNotNull(arrayList71);
        org.junit.Assert.assertNotNull(vector73);
        org.junit.Assert.assertNotNull(vector74);
        org.junit.Assert.assertNotNull(vector75);
        org.junit.Assert.assertNotNull(vector76);
        org.junit.Assert.assertNotNull(list77);
        org.junit.Assert.assertNotNull(vector78);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.util.Properties properties4 = extendedProperties0.getProperties("");
        java.io.OutputStream outputStream5 = null;
        extendedProperties0.save(outputStream5, ",");
        java.util.Iterator iterator9 = extendedProperties0.getKeys("");
        java.util.ArrayList arrayList10 = extendedProperties0.keysAsListed;
        // The following exception was thrown during execution in test generation
        try {
            float float12 = extendedProperties0.getFloat(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(arrayList10);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        boolean boolean12 = extendedProperties0.getBoolean("/", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj15 = extendedProperties13.getProperty("");
        java.lang.String str16 = extendedProperties13.file;
        extendedProperties13.file = "";
        extendedProperties13.setProperty("/", (java.lang.Object) false);
        extendedProperties0.combine(extendedProperties13);
        short short25 = extendedProperties13.getShort("", (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double27 = extendedProperties13.getDouble("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) -1 + "'", short25 == (short) -1);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        short short8 = extendedProperties0.getShort("", (short) (byte) 10);
        extendedProperties0.setProperty("}", (java.lang.Object) 1.0d);
        java.lang.Short short14 = extendedProperties0.getShort(",", (java.lang.Short) (short) -1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader3.setLineNumber((int) (short) 10);
        int int6 = propertiesReader3.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader7 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        int int8 = propertiesReader3.read();
        // The following exception was thrown during execution in test generation
        try {
            propertiesReader3.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream not marked");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        extendedProperties0.file = "";
        extendedProperties0.setProperty("/", (java.lang.Object) false);
        boolean boolean9 = extendedProperties0.isInitialized;
        java.util.Iterator iterator10 = extendedProperties0.getKeys();
        java.util.Iterator iterator11 = extendedProperties0.getKeys();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator10 = extendedProperties0.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj14 = extendedProperties12.getProperty("");
        java.lang.String str15 = extendedProperties12.file;
        java.lang.String str17 = extendedProperties12.testBoolean("hi!");
        java.util.Properties properties19 = extendedProperties12.getProperties("/");
        java.util.Properties properties20 = extendedProperties0.getProperties("", properties19);
        java.lang.Short short23 = extendedProperties0.getShort("hi!", (java.lang.Short) (short) 1);
        org.apache.commons.collections.ExtendedProperties extendedProperties25 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str26 = extendedProperties25.fileSeparator;
        extendedProperties0.setProperty("${", (java.lang.Object) extendedProperties25);
        // The following exception was thrown during execution in test generation
        try {
            short short29 = extendedProperties0.getShort("${");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: '${' doesn't map to a Short object");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 1 + "'", short23 == (short) 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "/" + "'", str26, "/");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.util.Properties properties4 = extendedProperties0.getProperties("");
        java.lang.String str6 = extendedProperties0.testBoolean("hi!");
        java.lang.Boolean boolean9 = extendedProperties0.getBoolean("", (java.lang.Boolean) true);
        extendedProperties0.setInclude("");
        java.util.ArrayList arrayList12 = extendedProperties0.keysAsListed;
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(arrayList12);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.String str6 = extendedProperties0.basePath;
        java.lang.String str7 = extendedProperties0.fileSeparator;
        java.lang.Boolean boolean10 = extendedProperties0.getBoolean("", (java.lang.Boolean) true);
        java.lang.String str11 = extendedProperties0.fileSeparator;
        java.util.Vector vector13 = extendedProperties0.getVector("}");
        java.util.ArrayList arrayList14 = extendedProperties0.keysAsListed;
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/" + "'", str11, "/");
        org.junit.Assert.assertNotNull(vector13);
        org.junit.Assert.assertNotNull(arrayList14);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str4 = extendedProperties0.interpolate("}");
        java.lang.String str6 = extendedProperties0.interpolate("");
        double double9 = extendedProperties0.getDouble("/", (double) 1.0f);
        java.lang.Long long12 = extendedProperties0.getLong("/", (java.lang.Long) 0L);
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = extendedProperties0.subset("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.ExtendedProperties extendedProperties16 = extendedProperties14.subset(",");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(extendedProperties14);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        propertiesReader3.mark(10);
        boolean boolean9 = propertiesReader3.markSupported();
        int int10 = propertiesReader3.read();
        java.lang.Class<?> wildcardClass11 = propertiesReader3.getClass();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.lang.String str7 = extendedProperties0.fileSeparator;
        int int10 = extendedProperties0.getInteger("/", (int) (short) 100);
        java.util.Vector vector12 = extendedProperties0.getVector("}");
        extendedProperties0.display();
        java.lang.Integer int16 = extendedProperties0.getInteger("/", (java.lang.Integer) 52);
        java.lang.String str18 = extendedProperties0.testBoolean("${");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(vector12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader3.setLineNumber((int) (short) 10);
        int int6 = propertiesReader3.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader7 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        java.lang.String str8 = propertiesReader3.readProperty();
        java.io.Reader reader9 = java.io.Reader.nullReader();
        char[] charArray10 = new char[] {};
        int int11 = reader9.read(charArray10);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader12 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader9);
        boolean boolean13 = propertiesReader12.markSupported();
        propertiesReader12.setLineNumber((-1));
        int int16 = propertiesReader12.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader17 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader12);
        java.io.Reader reader18 = java.io.Reader.nullReader();
        char[] charArray19 = new char[] {};
        int int20 = reader18.read(charArray19);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader21 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader18);
        boolean boolean22 = propertiesReader21.markSupported();
        propertiesReader21.setLineNumber((-1));
        java.io.Reader reader25 = java.io.Reader.nullReader();
        char[] charArray26 = new char[] {};
        int int27 = reader25.read(charArray26);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader28 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader25);
        boolean boolean29 = propertiesReader28.markSupported();
        java.lang.String str30 = propertiesReader28.readLine();
        java.lang.String str31 = propertiesReader28.readLine();
        java.util.stream.Stream<java.lang.String> strStream32 = propertiesReader28.lines();
        java.io.Reader reader33 = java.io.Reader.nullReader();
        char[] charArray34 = new char[] {};
        int int35 = reader33.read(charArray34);
        int int36 = propertiesReader28.read(charArray34);
        int int37 = propertiesReader21.read(charArray34);
        int int38 = propertiesReader17.read(charArray34);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = propertiesReader3.read(charArray34, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(reader18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(reader25);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(strStream32);
        org.junit.Assert.assertNotNull(reader33);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] {});
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Vector vector8 = extendedProperties0.getVector("");
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj12 = extendedProperties10.getProperty("");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        short short17 = extendedProperties14.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj21 = extendedProperties19.getProperty("");
        java.util.List list23 = extendedProperties19.getList("hi!");
        extendedProperties14.addProperty("", (java.lang.Object) list23);
        java.lang.String str25 = extendedProperties10.interpolateHelper("", list23);
        java.util.List list26 = extendedProperties0.getList("/", list23);
        extendedProperties0.fileSeparator = "${";
        org.apache.commons.collections.ExtendedProperties extendedProperties30 = extendedProperties0.subset("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties30.clearProperty("${");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNull(extendedProperties30);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        boolean boolean6 = propertiesReader3.markSupported();
        int int7 = propertiesReader3.getLineNumber();
        java.io.Reader reader8 = java.io.Reader.nullReader();
        char[] charArray9 = new char[] {};
        int int10 = reader8.read(charArray9);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader11 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader8);
        boolean boolean12 = propertiesReader11.markSupported();
        java.lang.String str13 = propertiesReader11.readLine();
        boolean boolean14 = propertiesReader11.markSupported();
        java.io.Reader reader15 = java.io.Reader.nullReader();
        char[] charArray16 = new char[] {};
        int int17 = reader15.read(charArray16);
        int int18 = propertiesReader11.read(charArray16);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = propertiesReader3.read(charArray16, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(reader15);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        int int7 = propertiesReader3.read();
        boolean boolean8 = propertiesReader3.markSupported();
        java.nio.CharBuffer charBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = propertiesReader3.read(charBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        int int5 = propertiesReader3.getLineNumber();
        propertiesReader3.close();
        boolean boolean7 = propertiesReader3.markSupported();
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = propertiesReader3.transferTo(writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.lang.String str4 = extendedProperties0.testBoolean("");
        double double7 = extendedProperties0.getDouble("/", (double) 10L);
        java.lang.String str9 = extendedProperties0.getString("");
        java.lang.String str11 = extendedProperties0.interpolate("}");
        java.lang.Object obj13 = extendedProperties0.getProperty("${");
        java.lang.Object obj15 = extendedProperties0.getProperty("${");
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "}" + "'", str11, "}");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str4 = extendedProperties0.interpolate("}");
        java.lang.String str6 = extendedProperties0.interpolate("");
        double double9 = extendedProperties0.getDouble("/", (double) 1.0f);
        java.lang.Class<?> wildcardClass10 = extendedProperties0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        extendedProperties0.clearProperty("");
        java.lang.String str7 = extendedProperties0.interpolate("}");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "}" + "'", str7, "}");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.lang.String str11 = extendedProperties0.interpolate("hi!");
        java.lang.String str13 = extendedProperties0.interpolate("}");
        java.lang.String str14 = extendedProperties0.basePath;
        byte byte17 = extendedProperties0.getByte("/", (byte) 0);
        long long20 = extendedProperties0.getLong("${", (long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double22 = extendedProperties0.getDouble("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "}" + "'", str13, "}");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        long long3 = extendedProperties0.getLong("hi!", (long) 1);
        long long6 = extendedProperties0.getLong("/", (long) '4');
        java.lang.String[] strArray8 = extendedProperties0.getStringArray("");
        // The following exception was thrown during execution in test generation
        try {
            int int10 = extendedProperties0.getInt("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator10 = extendedProperties0.getKeys();
        java.lang.Byte byte13 = extendedProperties0.getByte("", (java.lang.Byte) (byte) 0);
        extendedProperties0.isInitialized = false;
        java.lang.String str17 = extendedProperties0.getString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            float float19 = extendedProperties0.getFloat("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.lang.String str6 = propertiesReader3.readLine();
        java.nio.CharBuffer charBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = propertiesReader3.read(charBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader5 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        propertiesReader5.setLineNumber((int) '#');
        propertiesReader5.close();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader9 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader5);
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = propertiesReader9.transferTo(writer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        boolean boolean12 = extendedProperties0.getBoolean("/", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj15 = extendedProperties13.getProperty("");
        java.lang.String str16 = extendedProperties13.file;
        extendedProperties13.file = "";
        extendedProperties13.setProperty("/", (java.lang.Object) false);
        extendedProperties0.combine(extendedProperties13);
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list26 = extendedProperties24.getList("");
        java.util.Properties properties28 = extendedProperties24.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties28);
        extendedProperties13.setProperty("${", (java.lang.Object) properties28);
        // The following exception was thrown during execution in test generation
        try {
            byte byte32 = extendedProperties13.getByte("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNotNull(extendedProperties29);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str4 = extendedProperties0.interpolate("}");
        java.lang.String str6 = extendedProperties0.interpolate("");
        double double9 = extendedProperties0.getDouble("/", (double) 1.0f);
        extendedProperties0.display();
        java.lang.Class<?> wildcardClass11 = extendedProperties0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        int int6 = extendedProperties0.getInt("/", (int) (byte) 100);
        java.lang.String str7 = extendedProperties0.file;
        java.io.OutputStream outputStream8 = null;
        extendedProperties0.save(outputStream8, "");
        java.lang.Double double13 = extendedProperties0.getDouble("", (java.lang.Double) 32.0d);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        java.util.Iterator iterator11 = extendedProperties0.getKeys("${");
        java.lang.Double double14 = extendedProperties0.getDouble("hi!", (java.lang.Double) 0.0d);
        java.lang.Object obj16 = extendedProperties0.getProperty(",");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj7 = extendedProperties5.getProperty("");
        java.util.List list9 = extendedProperties5.getList("hi!");
        extendedProperties0.addProperty("", (java.lang.Object) list9);
        java.lang.String str11 = extendedProperties0.getInclude();
        java.lang.String str13 = extendedProperties0.interpolate("hi!");
        java.lang.Boolean boolean16 = extendedProperties0.getBoolean("/", (java.lang.Boolean) false);
        boolean boolean17 = extendedProperties0.isInitialized;
        java.lang.String str19 = extendedProperties0.testBoolean("${");
        java.lang.String str20 = extendedProperties0.basePath;
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(list9);
// flaky "4) test0405(org.apache.commons.collections.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "${" + "'", str11, "${");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        boolean boolean6 = propertiesReader3.markSupported();
        java.io.Reader reader7 = java.io.Reader.nullReader();
        char[] charArray8 = new char[] {};
        int int9 = reader7.read(charArray8);
        int int10 = propertiesReader3.read(charArray8);
        java.nio.CharBuffer charBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = propertiesReader3.read(charBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader3.setLineNumber((int) (short) 10);
        int int6 = propertiesReader3.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader7 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        propertiesReader7.setLineNumber((int) (short) 1);
        java.lang.String str10 = propertiesReader7.readProperty();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader11 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader7);
        long long13 = propertiesReader7.skip((long) 1);
        java.io.Writer writer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = propertiesReader7.transferTo(writer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        extendedProperties8.setProperty("}", (java.lang.Object) "}");
        java.lang.Long long14 = extendedProperties8.getLong("/", (java.lang.Long) 1L);
        byte byte17 = extendedProperties8.getByte("hi!", (byte) 100);
        byte byte20 = extendedProperties8.getByte("/", (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = extendedProperties8.getDouble("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 100 + "'", byte17 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) -1 + "'", byte20 == (byte) -1);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        boolean boolean12 = extendedProperties0.getBoolean("/", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj15 = extendedProperties13.getProperty("");
        java.lang.String str16 = extendedProperties13.file;
        extendedProperties13.file = "";
        extendedProperties13.setProperty("/", (java.lang.Object) false);
        extendedProperties0.combine(extendedProperties13);
        extendedProperties13.isInitialized = false;
        long long27 = extendedProperties13.getLong("}", 100L);
        // The following exception was thrown during execution in test generation
        try {
            short short29 = extendedProperties13.getShort("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader5 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        java.nio.CharBuffer charBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = propertiesReader3.read(charBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.lang.Short short9 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator10 = extendedProperties0.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj14 = extendedProperties12.getProperty("");
        java.lang.String str15 = extendedProperties12.file;
        java.lang.String str17 = extendedProperties12.testBoolean("hi!");
        java.util.Properties properties19 = extendedProperties12.getProperties("/");
        java.util.Properties properties20 = extendedProperties0.getProperties("", properties19);
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties19);
        // The following exception was thrown during execution in test generation
        try {
            byte byte23 = extendedProperties21.getByte("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${ doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNotNull(extendedProperties21);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader3.setLineNumber((int) (byte) 10);
        boolean boolean6 = propertiesReader3.ready();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.lang.String str4 = extendedProperties0.testBoolean("");
        double double7 = extendedProperties0.getDouble("/", (double) 10L);
        java.util.List list9 = extendedProperties0.getList("");
        java.util.List list11 = extendedProperties0.getList("hi!");
        extendedProperties0.basePath = "";
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        java.util.Vector vector10 = extendedProperties8.getVector("}");
        java.lang.String str11 = extendedProperties8.fileSeparator;
        java.lang.Boolean boolean14 = extendedProperties8.getBoolean("${", (java.lang.Boolean) false);
        java.util.List list16 = extendedProperties8.getList("");
        // The following exception was thrown during execution in test generation
        try {
            float float18 = extendedProperties8.getFloat("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertNotNull(vector10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/" + "'", str11, "/");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        java.lang.String str5 = extendedProperties0.getInclude();
        java.lang.Double double8 = extendedProperties0.getDouble("hi!", (java.lang.Double) 100.0d);
        java.lang.String str10 = extendedProperties0.testBoolean(",");
        extendedProperties0.isInitialized = false;
        java.lang.Long long15 = extendedProperties0.getLong("/", (java.lang.Long) 35L);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader5 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        int int6 = propertiesReader5.getLineNumber();
        boolean boolean7 = propertiesReader5.markSupported();
        java.io.Reader reader8 = java.io.Reader.nullReader();
        char[] charArray9 = new char[] {};
        int int10 = reader8.read(charArray9);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader11 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader8);
        boolean boolean12 = propertiesReader11.markSupported();
        propertiesReader11.setLineNumber((-1));
        java.io.Reader reader15 = java.io.Reader.nullReader();
        char[] charArray16 = new char[] {};
        int int17 = reader15.read(charArray16);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader18 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader15);
        boolean boolean19 = propertiesReader18.markSupported();
        java.lang.String str20 = propertiesReader18.readLine();
        java.lang.String str21 = propertiesReader18.readLine();
        java.util.stream.Stream<java.lang.String> strStream22 = propertiesReader18.lines();
        java.io.Reader reader23 = java.io.Reader.nullReader();
        char[] charArray24 = new char[] {};
        int int25 = reader23.read(charArray24);
        int int26 = propertiesReader18.read(charArray24);
        int int27 = propertiesReader11.read(charArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = propertiesReader5.read(charArray24, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(reader15);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strStream22);
        org.junit.Assert.assertNotNull(reader23);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.io.OutputStream outputStream6 = null;
        extendedProperties0.save(outputStream6, "${");
        extendedProperties0.display();
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj13 = extendedProperties11.getProperty("");
        java.util.List list15 = extendedProperties11.getList("hi!");
        extendedProperties11.setInclude("hi!");
        java.util.List list19 = extendedProperties11.getList("hi!");
        java.lang.String str20 = extendedProperties0.interpolateHelper("hi!", list19);
        // The following exception was thrown during execution in test generation
        try {
            short short22 = extendedProperties0.getShort("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        byte byte12 = extendedProperties0.getByte("}", (byte) 0);
        extendedProperties0.setInclude("${");
        java.io.Reader reader16 = java.io.Reader.nullReader();
        char[] charArray17 = new char[] {};
        int int18 = reader16.read(charArray17);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader19 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader16);
        extendedProperties0.addProperty("hi!", (java.lang.Object) reader16);
        extendedProperties0.file = ",";
        float float25 = extendedProperties0.getFloat("", (float) '4');
        short short28 = extendedProperties0.getShort("}", (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = extendedProperties0.getBoolean("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 52.0f + "'", float25 == 52.0f);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 1 + "'", short28 == (short) 1);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.io.OutputStream outputStream6 = null;
        extendedProperties0.save(outputStream6, "${");
        extendedProperties0.display();
        java.util.Properties properties11 = extendedProperties0.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties11);
        java.lang.Short short15 = extendedProperties12.getShort("", (java.lang.Short) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            float float17 = extendedProperties12.getFloat("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNotNull(extendedProperties12);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        boolean boolean4 = extendedProperties0.isInitialized;
        java.lang.String[] strArray6 = extendedProperties0.getStringArray("}");
        extendedProperties0.clearProperty("");
        java.io.InputStream inputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream9, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        extendedProperties8.setProperty("}", (java.lang.Object) "}");
        java.lang.Short short14 = extendedProperties8.getShort("hi!", (java.lang.Short) (short) 100);
        java.io.OutputStream outputStream15 = null;
        extendedProperties8.save(outputStream15, "");
        java.lang.Float float20 = extendedProperties8.getFloat(",", (java.lang.Float) 1.0f);
        extendedProperties8.file = "hi!";
        short short25 = extendedProperties8.getShort("${", (short) -1);
        java.io.InputStream inputStream26 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties8.load(inputStream26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 100 + "'", short14 == (short) 100);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) -1 + "'", short25 == (short) -1);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj7 = extendedProperties5.getProperty("");
        java.util.List list9 = extendedProperties5.getList("hi!");
        extendedProperties0.addProperty("", (java.lang.Object) list9);
        java.lang.String str11 = extendedProperties0.getInclude();
        java.lang.String str13 = extendedProperties0.interpolate("hi!");
        java.lang.Boolean boolean16 = extendedProperties0.getBoolean("/", (java.lang.Boolean) false);
        java.lang.String str17 = extendedProperties0.basePath;
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(list9);
// flaky "5) test0422(org.apache.commons.collections.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        short short7 = extendedProperties0.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj11 = extendedProperties9.getProperty("");
        long long14 = extendedProperties9.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList15 = extendedProperties9.keysAsListed;
        java.util.Vector vector17 = extendedProperties9.getVector("");
        java.util.Vector vector18 = extendedProperties0.getVector("}", vector17);
        extendedProperties0.setInclude("}");
        extendedProperties0.setInclude("/");
        // The following exception was thrown during execution in test generation
        try {
            double double24 = extendedProperties0.getDouble("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(arrayList15);
        org.junit.Assert.assertNotNull(vector17);
        org.junit.Assert.assertNotNull(vector18);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str4 = extendedProperties0.interpolate("}");
        java.lang.String str6 = extendedProperties0.interpolate("");
        java.util.Properties properties8 = extendedProperties0.getProperties(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties8);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = extendedProperties9.getLong(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNotNull(extendedProperties9);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        int int6 = extendedProperties0.getInt("/", (int) (byte) 100);
        java.lang.String str7 = extendedProperties0.file;
        java.io.OutputStream outputStream8 = null;
        extendedProperties0.save(outputStream8, "");
        java.lang.String str11 = extendedProperties0.getInclude();
        int int14 = extendedProperties0.getInteger("", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/" + "'", str11, "/");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        extendedProperties0.setInclude("hi!");
        java.util.List list8 = extendedProperties0.getList("hi!");
        java.lang.String str9 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = extendedProperties0.subset("/");
        java.lang.Long long14 = extendedProperties0.getLong("}", (java.lang.Long) 0L);
        int int17 = extendedProperties0.getInt("hi!", 100);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(extendedProperties11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Vector vector8 = extendedProperties0.getVector("");
        java.io.OutputStream outputStream9 = null;
        extendedProperties0.save(outputStream9, "${");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = extendedProperties0.getInt("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(vector8);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = extendedProperties0.subset("");
        long long8 = extendedProperties0.getLong("/", (long) (short) 0);
        float float11 = extendedProperties0.getFloat("/", 10.0f);
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list15 = extendedProperties13.getList("");
        extendedProperties13.setInclude("hi!");
        java.lang.String str18 = extendedProperties13.getInclude();
        java.lang.Double double21 = extendedProperties13.getDouble("hi!", (java.lang.Double) 100.0d);
        java.lang.Long long24 = extendedProperties13.getLong("}", (java.lang.Long) 97L);
        org.apache.commons.collections.ExtendedProperties extendedProperties26 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj28 = extendedProperties26.getProperty("");
        java.util.List list30 = extendedProperties26.getList("hi!");
        java.lang.String str32 = extendedProperties26.interpolate("");
        java.lang.Short short35 = extendedProperties26.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator36 = extendedProperties26.getKeys();
        java.lang.Byte byte39 = extendedProperties26.getByte("", (java.lang.Byte) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties41 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list43 = extendedProperties41.getList("");
        extendedProperties41.setInclude("hi!");
        extendedProperties41.setInclude("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties49 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj51 = extendedProperties49.getProperty("");
        java.util.List list53 = extendedProperties49.getList("hi!");
        short short56 = extendedProperties49.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties58 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj60 = extendedProperties58.getProperty("");
        long long63 = extendedProperties58.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList64 = extendedProperties58.keysAsListed;
        java.util.Vector vector66 = extendedProperties58.getVector("");
        java.util.Vector vector67 = extendedProperties49.getVector("}", vector66);
        java.util.Vector vector68 = extendedProperties41.getVector("}", vector67);
        java.util.Vector vector69 = extendedProperties26.getVector("/", vector67);
        java.util.List list70 = extendedProperties13.getList("hi!", (java.util.List) vector69);
        java.lang.String str71 = extendedProperties0.interpolateHelper("hi!", (java.util.List) vector69);
        java.lang.Byte byte74 = extendedProperties0.getByte("", (java.lang.Byte) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double76 = extendedProperties0.getDouble("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(extendedProperties5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + short35 + "' != '" + (short) -1 + "'", short35 == (short) -1);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 0 + "'", byte39 == (byte) 0);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertTrue("'" + short56 + "' != '" + (short) 10 + "'", short56 == (short) 10);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 100L + "'", long63 == 100L);
        org.junit.Assert.assertNotNull(arrayList64);
        org.junit.Assert.assertNotNull(vector66);
        org.junit.Assert.assertNotNull(vector67);
        org.junit.Assert.assertNotNull(vector68);
        org.junit.Assert.assertNotNull(vector69);
        org.junit.Assert.assertNotNull(list70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertTrue("'" + byte74 + "' != '" + (byte) 10 + "'", byte74 == (byte) 10);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str4 = extendedProperties0.interpolate("}");
        java.lang.String str6 = extendedProperties0.interpolate("");
        double double9 = extendedProperties0.getDouble("/", (double) 1.0f);
        extendedProperties0.display();
        java.lang.String str11 = extendedProperties0.getInclude();
        extendedProperties0.clearProperty("${");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str4 = extendedProperties0.interpolate("}");
        java.lang.String str6 = extendedProperties0.interpolate("");
        double double9 = extendedProperties0.getDouble("/", (double) 1.0f);
        extendedProperties0.display();
        java.lang.String str11 = extendedProperties0.getInclude();
        boolean boolean14 = extendedProperties0.getBoolean("/", false);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("hi!");
        java.lang.String str3 = propertiesTokenizer1.nextToken(",");
        java.lang.String str4 = propertiesTokenizer1.nextToken();
        java.lang.String str6 = propertiesTokenizer1.nextToken("");
        java.lang.String str8 = propertiesTokenizer1.nextToken("${");
        boolean boolean9 = propertiesTokenizer1.hasMoreTokens();
        boolean boolean10 = propertiesTokenizer1.hasMoreElements();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        java.util.Iterator iterator11 = extendedProperties0.getKeys("${");
        extendedProperties0.fileSeparator = "/";
        java.io.OutputStream outputStream14 = null;
        extendedProperties0.save(outputStream14, ",");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String[] strArray2 = extendedProperties0.getStringArray("hi!");
        extendedProperties0.isInitialized = false;
        // The following exception was thrown during execution in test generation
        try {
            float float6 = extendedProperties0.getFloat("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.lang.String str4 = extendedProperties0.testBoolean("");
        double double7 = extendedProperties0.getDouble("/", (double) 10L);
        java.io.InputStream inputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream8, "}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        short short7 = extendedProperties0.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj11 = extendedProperties9.getProperty("");
        long long14 = extendedProperties9.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList15 = extendedProperties9.keysAsListed;
        java.util.Vector vector17 = extendedProperties9.getVector("");
        java.util.Vector vector18 = extendedProperties0.getVector("}", vector17);
        extendedProperties0.setInclude("}");
        extendedProperties0.setInclude("/");
        java.lang.Short short25 = extendedProperties0.getShort("", (java.lang.Short) (short) -1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(arrayList15);
        org.junit.Assert.assertNotNull(vector17);
        org.junit.Assert.assertNotNull(vector18);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) -1 + "'", short25 == (short) -1);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        extendedProperties0.clearProperty("");
        java.lang.String str6 = extendedProperties0.file;
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer9 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("}");
        java.lang.Object obj10 = propertiesTokenizer9.nextElement();
        java.lang.Object obj11 = propertiesTokenizer9.nextElement();
        java.lang.String str12 = propertiesTokenizer9.nextToken();
        java.lang.String str13 = propertiesTokenizer9.nextToken();
        java.lang.String str14 = propertiesTokenizer9.nextToken();
        extendedProperties0.setProperty("${", (java.lang.Object) str14);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "}" + "'", obj10, "}");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "" + "'", obj11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.lang.String str6 = propertiesReader3.readProperty();
        boolean boolean7 = propertiesReader3.markSupported();
        java.lang.String str8 = propertiesReader3.readLine();
        propertiesReader3.setLineNumber((int) 'a');
        char[] charArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = propertiesReader3.read(charArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        extendedProperties0.setInclude("hi!");
        java.util.List list8 = extendedProperties0.getList("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties10 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj12 = extendedProperties10.getProperty("");
        java.util.List list14 = extendedProperties10.getList("hi!");
        java.lang.String str15 = extendedProperties0.interpolateHelper("}", list14);
        long long18 = extendedProperties0.getLong("", (long) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj22 = extendedProperties20.getProperty("");
        java.util.List list24 = extendedProperties20.getList("hi!");
        short short27 = extendedProperties20.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj31 = extendedProperties29.getProperty("");
        long long34 = extendedProperties29.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList35 = extendedProperties29.keysAsListed;
        java.util.Vector vector37 = extendedProperties29.getVector("");
        java.util.Vector vector38 = extendedProperties20.getVector("}", vector37);
        java.lang.String str39 = extendedProperties0.interpolateHelper("", (java.util.List) vector37);
        java.lang.Byte byte42 = extendedProperties0.getByte("/", (java.lang.Byte) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            short short44 = extendedProperties0.getShort("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "}" + "'", str15, "}");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 10 + "'", short27 == (short) 10);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 100L + "'", long34 == 100L);
        org.junit.Assert.assertNotNull(arrayList35);
        org.junit.Assert.assertNotNull(vector37);
        org.junit.Assert.assertNotNull(vector38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) 10 + "'", byte42 == (byte) 10);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.String str6 = extendedProperties0.basePath;
        java.lang.String str7 = extendedProperties0.fileSeparator;
        java.lang.Boolean boolean10 = extendedProperties0.getBoolean("", (java.lang.Boolean) true);
        java.lang.String str11 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj15 = extendedProperties13.getProperty("");
        java.lang.String str16 = extendedProperties13.file;
        java.lang.String str18 = extendedProperties13.testBoolean("hi!");
        java.util.Properties properties20 = extendedProperties13.getProperties("/");
        java.util.Properties properties21 = extendedProperties0.getProperties(",", properties20);
        extendedProperties0.clearProperty("hi!");
        java.lang.String str24 = extendedProperties0.fileSeparator;
        boolean boolean25 = extendedProperties0.isInitialized();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "/" + "'", str24, "/");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        short short8 = extendedProperties0.getShort("", (short) (byte) 10);
        java.lang.String str9 = extendedProperties0.file;
        extendedProperties0.file = "${";
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        extendedProperties8.display();
        int int12 = extendedProperties8.getInteger("${", (int) (byte) 10);
        java.util.List list14 = null;
        java.util.List list15 = extendedProperties8.getList("}", list14);
        extendedProperties8.setInclude("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Vector vector8 = extendedProperties0.getVector("");
        java.lang.String[] strArray10 = extendedProperties0.getStringArray("hi!");
        java.util.Vector vector12 = null;
        java.util.Vector vector13 = extendedProperties0.getVector("/", vector12);
        java.lang.Short short16 = extendedProperties0.getShort("${", (java.lang.Short) (short) 0);
        java.lang.Long long19 = extendedProperties0.getLong("}", (java.lang.Long) 52L);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = extendedProperties0.getBoolean("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(vector13);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        int int10 = extendedProperties0.getInt("${", (int) (byte) 100);
        java.lang.String str11 = extendedProperties0.file;
        java.util.Properties properties13 = extendedProperties0.getProperties("${");
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties13);
        int int17 = extendedProperties14.getInt("/", 52);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = extendedProperties14.getLong("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(extendedProperties14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        int int10 = extendedProperties0.getInt("${", (int) (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj13 = extendedProperties11.getProperty("");
        java.util.List list15 = extendedProperties11.getList("hi!");
        java.lang.String str17 = extendedProperties11.interpolate("");
        java.lang.Short short20 = extendedProperties11.getShort("", (java.lang.Short) (short) -1);
        extendedProperties0.combine(extendedProperties11);
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = extendedProperties0.subset("");
        java.lang.String[] strArray25 = extendedProperties0.getStringArray("}");
        org.apache.commons.collections.ExtendedProperties extendedProperties27 = extendedProperties0.subset(",");
        org.apache.commons.collections.ExtendedProperties extendedProperties29 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list31 = extendedProperties29.getList("");
        double double34 = extendedProperties29.getDouble("hi!", 100.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties36 = extendedProperties29.subset("${");
        java.lang.String str37 = extendedProperties29.basePath;
        org.apache.commons.collections.ExtendedProperties extendedProperties39 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj41 = extendedProperties39.getProperty("");
        java.util.List list43 = extendedProperties39.getList("hi!");
        java.lang.String str45 = extendedProperties39.interpolate("");
        java.lang.Short short48 = extendedProperties39.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator49 = extendedProperties39.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties51 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj53 = extendedProperties51.getProperty("");
        java.lang.String str54 = extendedProperties51.file;
        java.lang.String str56 = extendedProperties51.testBoolean("hi!");
        java.util.Properties properties58 = extendedProperties51.getProperties("/");
        java.util.Properties properties59 = extendedProperties39.getProperties("", properties58);
        java.util.Vector vector61 = extendedProperties39.getVector(",");
        java.lang.String str62 = extendedProperties29.interpolateHelper("${", (java.util.List) vector61);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Vector vector63 = extendedProperties27.getVector("hi!", vector61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) -1 + "'", short20 == (short) -1);
        org.junit.Assert.assertNull(extendedProperties23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
        org.junit.Assert.assertNull(extendedProperties27);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertNull(extendedProperties36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + short48 + "' != '" + (short) -1 + "'", short48 == (short) -1);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(properties58);
        org.junit.Assert.assertNotNull(properties59);
        org.junit.Assert.assertNotNull(vector61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "${" + "'", str62, "${");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        boolean boolean12 = extendedProperties0.getBoolean("/", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj15 = extendedProperties13.getProperty("");
        java.lang.String str16 = extendedProperties13.file;
        extendedProperties13.file = "";
        extendedProperties13.setProperty("/", (java.lang.Object) false);
        extendedProperties0.combine(extendedProperties13);
        java.lang.String str25 = extendedProperties13.getString("}", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int27 = extendedProperties13.getInt("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi!' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        java.io.Reader reader9 = java.io.Reader.nullReader();
        char[] charArray10 = new char[] {};
        int int11 = reader9.read(charArray10);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader12 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader9);
        boolean boolean13 = propertiesReader12.markSupported();
        java.lang.String str14 = propertiesReader12.readLine();
        java.lang.String str15 = propertiesReader12.readProperty();
        extendedProperties0.setProperty("${", (java.lang.Object) propertiesReader12);
        java.util.Iterator iterator17 = extendedProperties0.getKeys();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        boolean boolean6 = propertiesReader3.markSupported();
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = propertiesReader3.transferTo(writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("hi!");
        java.lang.String str3 = propertiesTokenizer1.nextToken(",");
        int int4 = propertiesTokenizer1.countTokens();
        java.util.Iterator<java.lang.Object> objItor5 = propertiesTokenizer1.asIterator();
        boolean boolean6 = propertiesTokenizer1.hasMoreElements();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.util.Vector vector3 = extendedProperties0.getVector("${");
        byte byte6 = extendedProperties0.getByte("${", (byte) -1);
        java.io.OutputStream outputStream7 = null;
        extendedProperties0.save(outputStream7, "/");
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj13 = extendedProperties11.getProperty("");
        java.util.List list15 = extendedProperties11.getList("hi!");
        java.lang.String str17 = extendedProperties11.interpolate("");
        java.lang.Short short20 = extendedProperties11.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator21 = extendedProperties11.getKeys();
        java.lang.Byte byte24 = extendedProperties11.getByte("", (java.lang.Byte) (byte) 0);
        extendedProperties11.isInitialized = false;
        java.io.OutputStream outputStream27 = null;
        extendedProperties11.save(outputStream27, "hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list33 = extendedProperties31.getList("");
        extendedProperties31.setInclude("hi!");
        java.lang.String str36 = extendedProperties31.getInclude();
        java.lang.Double double39 = extendedProperties31.getDouble("hi!", (java.lang.Double) 100.0d);
        java.lang.Long long42 = extendedProperties31.getLong("}", (java.lang.Long) 97L);
        org.apache.commons.collections.ExtendedProperties extendedProperties44 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj46 = extendedProperties44.getProperty("");
        java.util.List list48 = extendedProperties44.getList("hi!");
        java.lang.String str50 = extendedProperties44.interpolate("");
        java.lang.Short short53 = extendedProperties44.getShort("", (java.lang.Short) (short) -1);
        java.util.Iterator iterator54 = extendedProperties44.getKeys();
        java.lang.Byte byte57 = extendedProperties44.getByte("", (java.lang.Byte) (byte) 0);
        org.apache.commons.collections.ExtendedProperties extendedProperties59 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list61 = extendedProperties59.getList("");
        extendedProperties59.setInclude("hi!");
        extendedProperties59.setInclude("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties67 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj69 = extendedProperties67.getProperty("");
        java.util.List list71 = extendedProperties67.getList("hi!");
        short short74 = extendedProperties67.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties76 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj78 = extendedProperties76.getProperty("");
        long long81 = extendedProperties76.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList82 = extendedProperties76.keysAsListed;
        java.util.Vector vector84 = extendedProperties76.getVector("");
        java.util.Vector vector85 = extendedProperties67.getVector("}", vector84);
        java.util.Vector vector86 = extendedProperties59.getVector("}", vector85);
        java.util.Vector vector87 = extendedProperties44.getVector("/", vector85);
        java.util.List list88 = extendedProperties31.getList("hi!", (java.util.List) vector87);
        java.util.Vector vector89 = extendedProperties11.getVector("${", vector87);
        java.util.List list91 = extendedProperties11.getList("${");
        java.lang.String str92 = extendedProperties0.interpolateHelper("/", list91);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertNotNull(vector3);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) -1 + "'", short20 == (short) -1);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 0 + "'", byte24 == (byte) 0);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 97L + "'", long42 == 97L);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + short53 + "' != '" + (short) -1 + "'", short53 == (short) -1);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertTrue("'" + byte57 + "' != '" + (byte) 0 + "'", byte57 == (byte) 0);
        org.junit.Assert.assertNotNull(list61);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(list71);
        org.junit.Assert.assertTrue("'" + short74 + "' != '" + (short) 10 + "'", short74 == (short) 10);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 100L + "'", long81 == 100L);
        org.junit.Assert.assertNotNull(arrayList82);
        org.junit.Assert.assertNotNull(vector84);
        org.junit.Assert.assertNotNull(vector85);
        org.junit.Assert.assertNotNull(vector86);
        org.junit.Assert.assertNotNull(vector87);
        org.junit.Assert.assertNotNull(list88);
        org.junit.Assert.assertNotNull(vector89);
        org.junit.Assert.assertNotNull(list91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "/" + "'", str92, "/");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.lang.String str4 = extendedProperties0.testBoolean("");
        extendedProperties0.file = ",";
        java.util.Iterator iterator7 = extendedProperties0.getKeys();
        java.lang.String str8 = extendedProperties0.getInclude();
        long long11 = extendedProperties0.getLong("${", (long) (short) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = extendedProperties0.subset("${");
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNull(extendedProperties13);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.io.OutputStream outputStream6 = null;
        extendedProperties0.save(outputStream6, "${");
        extendedProperties0.display();
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj13 = extendedProperties11.getProperty("");
        java.util.List list15 = extendedProperties11.getList("hi!");
        extendedProperties11.setInclude("hi!");
        java.util.List list19 = extendedProperties11.getList("hi!");
        java.lang.String str20 = extendedProperties0.interpolateHelper("hi!", list19);
        java.io.OutputStream outputStream21 = null;
        extendedProperties0.save(outputStream21, "/");
        java.io.OutputStream outputStream24 = null;
        extendedProperties0.save(outputStream24, "");
        // The following exception was thrown during execution in test generation
        try {
            float float28 = extendedProperties0.getFloat("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.String str6 = extendedProperties0.basePath;
        java.lang.String str7 = extendedProperties0.fileSeparator;
        java.lang.Boolean boolean10 = extendedProperties0.getBoolean("", (java.lang.Boolean) true);
        java.lang.String str11 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties13 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj15 = extendedProperties13.getProperty("");
        java.lang.String str16 = extendedProperties13.file;
        java.lang.String str18 = extendedProperties13.testBoolean("hi!");
        java.util.Properties properties20 = extendedProperties13.getProperties("/");
        java.util.Properties properties21 = extendedProperties0.getProperties(",", properties20);
        java.lang.String str23 = extendedProperties0.interpolate("${");
        // The following exception was thrown during execution in test generation
        try {
            int int25 = extendedProperties0.getInt(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ',' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "${" + "'", str23, "${");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        extendedProperties8.setProperty("}", (java.lang.Object) "}");
        java.lang.Object obj13 = extendedProperties8.getProperty("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        extendedProperties0.setInclude("hi!");
        java.lang.String str8 = extendedProperties0.testBoolean("hi!");
        float float11 = extendedProperties0.getFloat("${", (float) 0);
        java.lang.String str12 = extendedProperties0.fileSeparator;
        java.lang.Class<?> wildcardClass13 = extendedProperties0.getClass();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/" + "'", str12, "/");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        extendedProperties8.setProperty("}", (java.lang.Object) "}");
        java.lang.Short short14 = extendedProperties8.getShort("hi!", (java.lang.Short) (short) 100);
        java.io.OutputStream outputStream15 = null;
        extendedProperties8.save(outputStream15, "");
        org.apache.commons.collections.ExtendedProperties extendedProperties19 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj21 = extendedProperties19.getProperty("");
        java.util.List list23 = extendedProperties19.getList("hi!");
        short short26 = extendedProperties19.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties28 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj30 = extendedProperties28.getProperty("");
        long long33 = extendedProperties28.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList34 = extendedProperties28.keysAsListed;
        java.util.Vector vector36 = extendedProperties28.getVector("");
        java.util.Vector vector37 = extendedProperties19.getVector("}", vector36);
        java.util.List list38 = extendedProperties8.getList("hi!", (java.util.List) vector36);
        java.lang.Class<?> wildcardClass39 = extendedProperties8.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 100 + "'", short14 == (short) 100);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 10 + "'", short26 == (short) 10);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
        org.junit.Assert.assertNotNull(arrayList34);
        org.junit.Assert.assertNotNull(vector36);
        org.junit.Assert.assertNotNull(vector37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.lang.String str4 = extendedProperties0.testBoolean("");
        double double7 = extendedProperties0.getDouble("/", (double) 10L);
        java.lang.String str9 = extendedProperties0.getString("");
        int int12 = extendedProperties0.getInteger("", (int) (byte) 10);
        extendedProperties0.display();
        java.lang.String str14 = extendedProperties0.file;
        java.io.InputStream inputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.load(inputStream15, "}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj11 = extendedProperties9.getProperty("");
        java.util.List list13 = extendedProperties9.getList("hi!");
        short short16 = extendedProperties9.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties18 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj20 = extendedProperties18.getProperty("");
        long long23 = extendedProperties18.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList24 = extendedProperties18.keysAsListed;
        java.util.Vector vector26 = extendedProperties18.getVector("");
        java.util.Vector vector27 = extendedProperties9.getVector("}", vector26);
        java.lang.String str28 = extendedProperties0.interpolateHelper("", (java.util.List) vector27);
        java.lang.Double double31 = extendedProperties0.getDouble("${", (java.lang.Double) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            byte byte33 = extendedProperties0.getByte(",");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ', doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 10 + "'", short16 == (short) 10);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertNotNull(arrayList24);
        org.junit.Assert.assertNotNull(vector26);
        org.junit.Assert.assertNotNull(vector27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        java.util.Iterator iterator11 = extendedProperties0.getKeys("${");
        java.lang.Double double14 = extendedProperties0.getDouble("hi!", (java.lang.Double) 0.0d);
        java.lang.Double double17 = extendedProperties0.getDouble("${", (java.lang.Double) 10.0d);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.Object obj7 = extendedProperties0.getProperty("hi!");
        boolean boolean8 = extendedProperties0.isInitialized();
        java.lang.Object obj10 = extendedProperties0.getProperty("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj14 = extendedProperties12.getProperty("");
        long long17 = extendedProperties12.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList18 = extendedProperties12.keysAsListed;
        java.lang.String str19 = extendedProperties12.fileSeparator;
        org.apache.commons.collections.ExtendedProperties extendedProperties21 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list23 = extendedProperties21.getList("");
        java.lang.String str25 = extendedProperties21.testBoolean("");
        double double28 = extendedProperties21.getDouble("/", (double) 10L);
        java.util.List list30 = extendedProperties21.getList("");
        java.lang.String str31 = extendedProperties12.interpolateHelper("${", list30);
        java.util.Iterator iterator32 = extendedProperties12.getKeys();
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj35 = extendedProperties33.getProperty("");
        long long38 = extendedProperties33.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList39 = extendedProperties33.keysAsListed;
        java.util.Vector vector41 = extendedProperties33.getVector("");
        extendedProperties33.display();
        java.lang.Double double45 = extendedProperties33.getDouble("", (java.lang.Double) 10.0d);
        java.lang.Boolean boolean48 = extendedProperties33.getBoolean("${", (java.lang.Boolean) false);
        extendedProperties12.combine(extendedProperties33);
        java.lang.Short short52 = extendedProperties33.getShort("/", (java.lang.Short) (short) 10);
        java.util.Properties properties54 = extendedProperties33.getProperties("${");
        java.util.Properties properties55 = extendedProperties0.getProperties("", properties54);
        org.apache.commons.collections.ExtendedProperties extendedProperties56 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties54);
        org.apache.commons.collections.ExtendedProperties extendedProperties57 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties54);
        // The following exception was thrown during execution in test generation
        try {
            int int59 = extendedProperties57.getInteger("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(arrayList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/" + "'", str19, "/");
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "${" + "'", str31, "${");
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 100L + "'", long38 == 100L);
        org.junit.Assert.assertNotNull(arrayList39);
        org.junit.Assert.assertNotNull(vector41);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + short52 + "' != '" + (short) 10 + "'", short52 == (short) 10);
        org.junit.Assert.assertNotNull(properties54);
        org.junit.Assert.assertNotNull(properties55);
        org.junit.Assert.assertNotNull(extendedProperties56);
        org.junit.Assert.assertNotNull(extendedProperties57);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        int int10 = extendedProperties0.getInt("${", (int) (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj13 = extendedProperties11.getProperty("");
        java.util.List list15 = extendedProperties11.getList("hi!");
        java.lang.String str17 = extendedProperties11.interpolate("");
        java.lang.Short short20 = extendedProperties11.getShort("", (java.lang.Short) (short) -1);
        extendedProperties0.combine(extendedProperties11);
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = extendedProperties0.subset("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = extendedProperties23.getInclude();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) -1 + "'", short20 == (short) -1);
        org.junit.Assert.assertNull(extendedProperties23);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        extendedProperties8.display();
        int int12 = extendedProperties8.getInteger("${", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            short short14 = extendedProperties8.getShort("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        int int5 = propertiesReader3.getLineNumber();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        long long8 = propertiesReader3.skip(0L);
        boolean boolean9 = propertiesReader3.ready();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        java.util.Properties properties6 = null;
        java.util.Properties properties7 = extendedProperties0.getProperties("", properties6);
        int int10 = extendedProperties0.getInt("hi!", (int) (short) -1);
        int int13 = extendedProperties0.getInt("${", (int) (short) 0);
        extendedProperties0.display();
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedProperties0.addProperty(",", obj16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("}");
        java.lang.Object obj2 = propertiesTokenizer1.nextElement();
        java.lang.Object obj3 = propertiesTokenizer1.nextElement();
        java.lang.String str4 = propertiesTokenizer1.nextToken();
        java.lang.String str5 = propertiesTokenizer1.nextToken();
        boolean boolean6 = propertiesTokenizer1.hasMoreElements();
        java.lang.String str8 = propertiesTokenizer1.nextToken("hi!");
        java.lang.String str10 = propertiesTokenizer1.nextToken(",");
        boolean boolean11 = propertiesTokenizer1.hasMoreElements();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "}" + "'", obj2, "}");
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "" + "'", obj3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("");
        int int2 = propertiesTokenizer1.countTokens();
        java.lang.Object obj3 = propertiesTokenizer1.nextElement();
        boolean boolean4 = propertiesTokenizer1.hasMoreTokens();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "" + "'", obj3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.String str6 = extendedProperties0.basePath;
        java.lang.String str7 = extendedProperties0.fileSeparator;
        java.lang.Boolean boolean10 = extendedProperties0.getBoolean("", (java.lang.Boolean) true);
        java.lang.String str11 = extendedProperties0.fileSeparator;
        java.util.Vector vector13 = extendedProperties0.getVector("}");
        // The following exception was thrown during execution in test generation
        try {
            int int15 = extendedProperties0.getInteger("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/" + "'", str11, "/");
        org.junit.Assert.assertNotNull(vector13);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.io.OutputStream outputStream6 = null;
        extendedProperties0.save(outputStream6, "${");
        extendedProperties0.display();
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj13 = extendedProperties11.getProperty("");
        java.util.List list15 = extendedProperties11.getList("hi!");
        extendedProperties11.setInclude("hi!");
        java.util.List list19 = extendedProperties11.getList("hi!");
        java.lang.String str20 = extendedProperties0.interpolateHelper("hi!", list19);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = extendedProperties0.getDouble("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.util.Properties properties4 = extendedProperties0.getProperties("");
        java.io.OutputStream outputStream5 = null;
        extendedProperties0.save(outputStream5, ",");
        java.util.Iterator iterator9 = extendedProperties0.getKeys("");
        java.util.ArrayList arrayList10 = extendedProperties0.keysAsListed;
        java.lang.Class<?> wildcardClass11 = extendedProperties0.getClass();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(arrayList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj10 = extendedProperties8.getProperty("");
        java.lang.String str11 = extendedProperties8.file;
        java.lang.String str13 = extendedProperties8.testBoolean("hi!");
        java.util.Properties properties15 = extendedProperties8.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties16 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties15);
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties15);
        int int20 = extendedProperties17.getInt("hi!", (int) (byte) 100);
        boolean boolean23 = extendedProperties17.getBoolean(",", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties24 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list26 = extendedProperties24.getList("");
        double double29 = extendedProperties24.getDouble("hi!", 100.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties31 = extendedProperties24.subset("${");
        extendedProperties24.basePath = "${";
        java.util.ArrayList arrayList34 = extendedProperties24.keysAsListed;
        extendedProperties17.keysAsListed = arrayList34;
        extendedProperties0.combine(extendedProperties17);
        java.io.Reader reader38 = java.io.Reader.nullReader();
        char[] charArray39 = new char[] {};
        int int40 = reader38.read(charArray39);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader41 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader38);
        propertiesReader41.setLineNumber((int) (byte) 10);
        java.util.stream.Stream<java.lang.String> strStream44 = propertiesReader41.lines();
        extendedProperties0.setProperty("/", (java.lang.Object) propertiesReader41);
        boolean boolean46 = propertiesReader41.ready();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertNotNull(extendedProperties16);
        org.junit.Assert.assertNotNull(extendedProperties17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertNull(extendedProperties31);
        org.junit.Assert.assertNotNull(arrayList34);
        org.junit.Assert.assertNotNull(reader38);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] {});
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(strStream44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        java.lang.Object obj9 = extendedProperties0.getProperty("${");
        float float12 = extendedProperties0.getFloat(",", (float) (byte) -1);
        java.lang.String str14 = extendedProperties0.testBoolean("/");
        java.lang.Long long17 = extendedProperties0.getLong("/", (java.lang.Long) 1L);
        int int20 = extendedProperties0.getInteger("/", (int) ' ');
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.String str1 = extendedProperties0.fileSeparator;
        java.io.OutputStream outputStream2 = null;
        extendedProperties0.save(outputStream2, "hi!");
        extendedProperties0.display();
        short short8 = extendedProperties0.getShort("${", (short) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj11 = extendedProperties9.getProperty("");
        long long14 = extendedProperties9.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList15 = extendedProperties9.keysAsListed;
        boolean boolean18 = extendedProperties9.getBoolean("", false);
        boolean boolean21 = extendedProperties9.getBoolean("/", true);
        org.apache.commons.collections.ExtendedProperties extendedProperties22 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj24 = extendedProperties22.getProperty("");
        java.lang.String str25 = extendedProperties22.file;
        extendedProperties22.file = "";
        extendedProperties22.setProperty("/", (java.lang.Object) false);
        extendedProperties9.combine(extendedProperties22);
        org.apache.commons.collections.ExtendedProperties extendedProperties33 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list35 = extendedProperties33.getList("");
        java.util.Properties properties37 = extendedProperties33.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties38 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties37);
        extendedProperties22.setProperty("${", (java.lang.Object) properties37);
        java.lang.String str42 = extendedProperties22.getString("", "}");
        org.apache.commons.collections.ExtendedProperties extendedProperties43 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj45 = extendedProperties43.getProperty("");
        java.util.List list47 = extendedProperties43.getList("hi!");
        extendedProperties43.setInclude("hi!");
        java.util.List list51 = extendedProperties43.getList("hi!");
        java.lang.String str52 = extendedProperties43.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties54 = extendedProperties43.subset("/");
        java.util.ArrayList arrayList55 = extendedProperties43.keysAsListed;
        extendedProperties22.keysAsListed = arrayList55;
        extendedProperties22.setInclude("hi!");
        java.util.ArrayList arrayList59 = extendedProperties22.keysAsListed;
        extendedProperties0.keysAsListed = arrayList59;
        extendedProperties0.display();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/" + "'", str1, "/");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(arrayList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertNotNull(extendedProperties38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "}" + "'", str42, "}");
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNull(extendedProperties54);
        org.junit.Assert.assertNotNull(arrayList55);
        org.junit.Assert.assertNotNull(arrayList59);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        java.util.Vector vector10 = extendedProperties8.getVector("}");
        extendedProperties8.setInclude("}");
        java.lang.Integer int15 = extendedProperties8.getInteger(",", (java.lang.Integer) 97);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertNotNull(vector10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.lang.String str6 = propertiesReader3.readProperty();
        boolean boolean7 = propertiesReader3.markSupported();
        java.lang.String str8 = propertiesReader3.readLine();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader9 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader10 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader9);
        propertiesReader10.mark(0);
        int int13 = propertiesReader10.read();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.lang.String str6 = propertiesReader3.readProperty();
        boolean boolean7 = propertiesReader3.markSupported();
        java.lang.String str8 = propertiesReader3.readLine();
        propertiesReader3.setLineNumber((int) 'a');
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = propertiesReader3.transferTo(writer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        propertiesReader3.setLineNumber((-1));
        int int7 = propertiesReader3.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader8 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        java.io.Reader reader9 = java.io.Reader.nullReader();
        char[] charArray10 = new char[] {};
        int int11 = reader9.read(charArray10);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader12 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader9);
        propertiesReader12.setLineNumber((int) (short) 10);
        int int15 = propertiesReader12.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader16 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader12);
        propertiesReader16.setLineNumber((int) (short) 1);
        java.lang.String str19 = propertiesReader16.readProperty();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader20 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader16);
        long long22 = propertiesReader20.skip((long) 97);
        propertiesReader20.setLineNumber(32);
        java.io.Reader reader25 = java.io.Reader.nullReader();
        char[] charArray26 = new char[] {};
        int int27 = reader25.read(charArray26);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader28 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader25);
        boolean boolean29 = propertiesReader28.markSupported();
        propertiesReader28.setLineNumber((-1));
        java.io.Reader reader32 = java.io.Reader.nullReader();
        char[] charArray33 = new char[] {};
        int int34 = reader32.read(charArray33);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader35 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader32);
        boolean boolean36 = propertiesReader35.markSupported();
        java.lang.String str37 = propertiesReader35.readLine();
        java.lang.String str38 = propertiesReader35.readLine();
        java.util.stream.Stream<java.lang.String> strStream39 = propertiesReader35.lines();
        java.io.Reader reader40 = java.io.Reader.nullReader();
        char[] charArray41 = new char[] {};
        int int42 = reader40.read(charArray41);
        int int43 = propertiesReader35.read(charArray41);
        int int44 = propertiesReader28.read(charArray41);
        int int45 = propertiesReader20.read(charArray41);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = propertiesReader8.read(charArray41, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(reader25);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(reader32);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(strStream39);
        org.junit.Assert.assertNotNull(reader40);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] {});
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        propertiesReader3.mark(10);
        long long10 = propertiesReader3.skip((long) '#');
        propertiesReader3.setLineNumber(0);
        java.io.Reader reader13 = java.io.Reader.nullReader();
        char[] charArray14 = new char[] {};
        int int15 = reader13.read(charArray14);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader16 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader13);
        propertiesReader16.setLineNumber((int) (short) 10);
        int int19 = propertiesReader16.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader20 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader16);
        propertiesReader20.setLineNumber((int) (short) 1);
        java.lang.String str23 = propertiesReader20.readProperty();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader24 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader20);
        long long26 = propertiesReader20.skip((long) 1);
        java.io.Reader reader27 = java.io.Reader.nullReader();
        char[] charArray28 = new char[] {};
        int int29 = reader27.read(charArray28);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader30 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader27);
        boolean boolean31 = propertiesReader30.markSupported();
        java.lang.String str32 = propertiesReader30.readLine();
        boolean boolean33 = propertiesReader30.markSupported();
        java.io.Reader reader34 = java.io.Reader.nullReader();
        char[] charArray35 = new char[] {};
        int int36 = reader34.read(charArray35);
        int int37 = propertiesReader30.read(charArray35);
        int int38 = propertiesReader20.read(charArray35);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = propertiesReader3.read(charArray35, (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(reader27);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(reader34);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] {});
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        org.apache.commons.collections.ExtendedProperties extendedProperties7 = extendedProperties0.subset("${");
        double double10 = extendedProperties0.getDouble("}", (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = extendedProperties0.getInteger("${");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '${' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(extendedProperties7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.lang.Double double8 = extendedProperties0.getDouble("}", (java.lang.Double) 1.0d);
        java.lang.String str10 = extendedProperties0.interpolate(",");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.io.OutputStream outputStream6 = null;
        extendedProperties0.save(outputStream6, "${");
        extendedProperties0.display();
        java.util.Properties properties11 = extendedProperties0.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties12 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties11);
        java.lang.Byte byte15 = extendedProperties12.getByte("${", (java.lang.Byte) (byte) 0);
        java.lang.String str16 = extendedProperties12.fileSeparator;
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNotNull(extendedProperties12);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/" + "'", str16, "/");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        int int10 = extendedProperties0.getInt("${", (int) (byte) 100);
        org.apache.commons.collections.ExtendedProperties extendedProperties11 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj13 = extendedProperties11.getProperty("");
        java.util.List list15 = extendedProperties11.getList("hi!");
        java.lang.String str17 = extendedProperties11.interpolate("");
        java.lang.Short short20 = extendedProperties11.getShort("", (java.lang.Short) (short) -1);
        extendedProperties0.combine(extendedProperties11);
        org.apache.commons.collections.ExtendedProperties extendedProperties23 = extendedProperties0.subset("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray25 = extendedProperties23.getStringArray("/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) -1 + "'", short20 == (short) -1);
        org.junit.Assert.assertNull(extendedProperties23);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        java.util.Properties properties6 = null;
        java.util.Properties properties7 = extendedProperties0.getProperties("", properties6);
        java.lang.String[] strArray9 = extendedProperties0.getStringArray("${");
        java.lang.Integer int12 = extendedProperties0.getInteger(",", (java.lang.Integer) (-1));
        java.lang.String str14 = extendedProperties0.getString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte byte16 = extendedProperties0.getByte("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: 'hi! doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader3.setLineNumber((int) (byte) 10);
        java.lang.String str6 = propertiesReader3.readProperty();
        int int7 = propertiesReader3.read();
        boolean boolean8 = propertiesReader3.markSupported();
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("}");
        java.lang.Object obj2 = propertiesTokenizer1.nextElement();
        java.lang.Object obj3 = propertiesTokenizer1.nextElement();
        java.lang.String str4 = propertiesTokenizer1.nextToken();
        java.lang.Object obj5 = propertiesTokenizer1.nextElement();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "}" + "'", obj2, "}");
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "" + "'", obj3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "" + "'", obj5, "");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        double double5 = extendedProperties0.getDouble("hi!", 100.0d);
        java.lang.Object obj7 = extendedProperties0.getProperty("hi!");
        boolean boolean8 = extendedProperties0.isInitialized();
        org.apache.commons.collections.ExtendedProperties extendedProperties9 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj11 = extendedProperties9.getProperty("");
        java.util.List list13 = extendedProperties9.getList("hi!");
        extendedProperties9.setInclude("hi!");
        java.util.List list17 = extendedProperties9.getList("hi!");
        java.lang.String str18 = extendedProperties9.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties20 = extendedProperties9.subset("/");
        java.util.ArrayList arrayList21 = extendedProperties9.keysAsListed;
        extendedProperties0.keysAsListed = arrayList21;
        java.lang.Class<?> wildcardClass23 = arrayList21.getClass();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(extendedProperties20);
        org.junit.Assert.assertNotNull(arrayList21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        propertiesReader3.mark(10);
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = propertiesReader3.transferTo(writer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strStream6);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str4 = extendedProperties0.interpolate("}");
        java.lang.String str5 = extendedProperties0.file;
        java.lang.String str6 = extendedProperties0.fileSeparator;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = extendedProperties0.getLong("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}" + "'", str4, "}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer propertiesTokenizer1 = new org.apache.commons.collections.ExtendedProperties.PropertiesTokenizer("}");
        java.lang.Object obj2 = propertiesTokenizer1.nextElement();
        java.lang.Object obj3 = propertiesTokenizer1.nextElement();
        java.lang.String str4 = propertiesTokenizer1.nextToken();
        java.lang.String str5 = propertiesTokenizer1.nextToken();
        boolean boolean6 = propertiesTokenizer1.hasMoreElements();
        java.lang.String str8 = propertiesTokenizer1.nextToken("hi!");
        boolean boolean9 = propertiesTokenizer1.hasMoreTokens();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "}" + "'", obj2, "}");
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "" + "'", obj3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader5 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        java.lang.String str6 = propertiesReader3.readProperty();
        // The following exception was thrown during execution in test generation
        try {
            propertiesReader3.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream not marked");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.lang.String str3 = extendedProperties0.file;
        java.lang.String str5 = extendedProperties0.testBoolean("hi!");
        java.util.Properties properties7 = extendedProperties0.getProperties("/");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties7);
        extendedProperties8.setProperty("}", (java.lang.Object) "}");
        java.lang.Long long14 = extendedProperties8.getLong("/", (java.lang.Long) 1L);
        java.lang.Long long17 = extendedProperties8.getLong("${", (java.lang.Long) 0L);
        java.util.Vector vector19 = extendedProperties8.getVector("");
        java.io.OutputStream outputStream20 = null;
        extendedProperties8.save(outputStream20, "}");
        // The following exception was thrown during execution in test generation
        try {
            int int24 = extendedProperties8.getInteger("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNotNull(extendedProperties8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(vector19);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        long long3 = extendedProperties0.getLong("hi!", (long) 1);
        long long6 = extendedProperties0.getLong("/", (long) '4');
        short short9 = extendedProperties0.getShort("/", (short) -1);
        java.lang.String str10 = extendedProperties0.fileSeparator;
        java.lang.String str12 = extendedProperties0.getString(",");
        java.util.Iterator iterator14 = extendedProperties0.getKeys("${");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/" + "'", str10, "/");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        java.util.List list4 = extendedProperties0.getList("hi!");
        java.lang.Long long7 = extendedProperties0.getLong("}", (java.lang.Long) (-1L));
        int int10 = extendedProperties0.getInt("${", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = extendedProperties0.getInt("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.io.OutputStream outputStream6 = null;
        extendedProperties0.save(outputStream6, "${");
        extendedProperties0.setInclude("");
        extendedProperties0.basePath = "}";
        // The following exception was thrown during execution in test generation
        try {
            double double14 = extendedProperties0.getDouble("}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '}' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        java.util.Properties properties4 = extendedProperties0.getProperties("");
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = org.apache.commons.collections.ExtendedProperties.convertProperties(properties4);
        java.util.Properties properties7 = extendedProperties5.getProperties("/");
        // The following exception was thrown during execution in test generation
        try {
            short short9 = extendedProperties5.getShort("/");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: '/' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(extendedProperties5);
        org.junit.Assert.assertNotNull(properties7);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        propertiesReader3.setLineNumber((int) (short) 10);
        int int6 = propertiesReader3.getLineNumber();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader7 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        propertiesReader7.setLineNumber((int) (short) 1);
        java.lang.String str10 = propertiesReader7.readProperty();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader11 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader7);
        propertiesReader11.mark((int) (short) 0);
        boolean boolean14 = propertiesReader11.markSupported();
        java.io.Writer writer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = propertiesReader11.transferTo(writer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        java.util.Vector vector8 = extendedProperties0.getVector("");
        extendedProperties0.display();
        java.lang.Double double12 = extendedProperties0.getDouble("", (java.lang.Double) 10.0d);
        java.lang.String str13 = extendedProperties0.getInclude();
        org.apache.commons.collections.ExtendedProperties extendedProperties14 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list16 = extendedProperties14.getList("");
        java.lang.String str18 = extendedProperties14.getString("}");
        extendedProperties0.combine(extendedProperties14);
        java.lang.String str20 = extendedProperties0.fileSeparator;
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(vector8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
// flaky "6) test0495(org.apache.commons.collections.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/" + "'", str20, "/");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        short short3 = extendedProperties0.getShort("", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties5 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj7 = extendedProperties5.getProperty("");
        java.util.List list9 = extendedProperties5.getList("hi!");
        extendedProperties0.addProperty("", (java.lang.Object) list9);
        java.lang.String str11 = extendedProperties0.getInclude();
        java.lang.String str13 = extendedProperties0.interpolate("hi!");
        java.lang.Boolean boolean16 = extendedProperties0.getBoolean("/", (java.lang.Boolean) false);
        extendedProperties0.isInitialized = false;
        java.lang.Long long21 = extendedProperties0.getLong("hi!", (java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(list9);
// flaky "7) test0496(org.apache.commons.collections.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj2 = extendedProperties0.getProperty("");
        long long5 = extendedProperties0.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList6 = extendedProperties0.keysAsListed;
        boolean boolean9 = extendedProperties0.getBoolean("", false);
        boolean boolean12 = extendedProperties0.getBoolean("/", true);
        extendedProperties0.basePath = ",";
        // The following exception was thrown during execution in test generation
        try {
            byte byte16 = extendedProperties0.getByte("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: ' doesn't map to an existing object");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        java.lang.String str5 = propertiesReader3.readLine();
        java.lang.String str6 = propertiesReader3.readProperty();
        boolean boolean7 = propertiesReader3.markSupported();
        java.lang.String str8 = propertiesReader3.readLine();
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader9 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader10 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader9);
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = propertiesReader10.transferTo(writer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.commons.collections.ExtendedProperties extendedProperties0 = new org.apache.commons.collections.ExtendedProperties();
        java.util.List list2 = extendedProperties0.getList("");
        extendedProperties0.setInclude("hi!");
        extendedProperties0.setInclude("hi!");
        org.apache.commons.collections.ExtendedProperties extendedProperties8 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj10 = extendedProperties8.getProperty("");
        java.util.List list12 = extendedProperties8.getList("hi!");
        short short15 = extendedProperties8.getShort("${", (short) (byte) 10);
        org.apache.commons.collections.ExtendedProperties extendedProperties17 = new org.apache.commons.collections.ExtendedProperties();
        java.lang.Object obj19 = extendedProperties17.getProperty("");
        long long22 = extendedProperties17.getLong("", (long) (byte) 100);
        java.util.ArrayList arrayList23 = extendedProperties17.keysAsListed;
        java.util.Vector vector25 = extendedProperties17.getVector("");
        java.util.Vector vector26 = extendedProperties8.getVector("}", vector25);
        java.util.Vector vector27 = extendedProperties0.getVector("}", vector26);
        boolean boolean28 = extendedProperties0.isInitialized;
        short short31 = extendedProperties0.getShort("", (short) (byte) -1);
        byte byte34 = extendedProperties0.getByte("", (byte) 0);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(arrayList23);
        org.junit.Assert.assertNotNull(vector25);
        org.junit.Assert.assertNotNull(vector26);
        org.junit.Assert.assertNotNull(vector27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) -1 + "'", short31 == (short) -1);
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) 0 + "'", byte34 == (byte) 0);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        int int2 = reader0.read(charArray1);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader3 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader(reader0);
        boolean boolean4 = propertiesReader3.markSupported();
        int int5 = propertiesReader3.getLineNumber();
        java.util.stream.Stream<java.lang.String> strStream6 = propertiesReader3.lines();
        long long8 = propertiesReader3.skip(0L);
        org.apache.commons.collections.ExtendedProperties.PropertiesReader propertiesReader9 = new org.apache.commons.collections.ExtendedProperties.PropertiesReader((java.io.Reader) propertiesReader3);
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = propertiesReader3.transferTo(writer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }
}
