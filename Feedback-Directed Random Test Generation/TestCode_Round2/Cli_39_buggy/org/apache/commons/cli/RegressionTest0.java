package org.apache.commons.cli;

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File[] fileArray1 = org.apache.commons.cli.TypeHandler.createFiles("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not yet implemented");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.cli.TypeHandler.createClass("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to find the class: hi!");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class java.lang.Class (java.lang.Float and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.cli.TypeHandler.createNumber("");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: For input string: \"\"");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.cli.TypeHandler.createClass("");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to find the class: ");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL1 = org.apache.commons.cli.TypeHandler.createURL("");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to parse the URL: ");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = org.apache.commons.cli.TypeHandler.createDate("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not yet implemented");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL1 = org.apache.commons.cli.TypeHandler.createURL("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to parse the URL: hi!");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = org.apache.commons.cli.TypeHandler.createDate("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not yet implemented");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Character cannot be cast to class java.lang.Class (java.lang.Character and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.cli.TypeHandler.createNumber("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: For input string: \"hi!\"");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = org.apache.commons.cli.TypeHandler.createObject("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to find the class: hi!");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File[] fileArray1 = org.apache.commons.cli.TypeHandler.createFiles("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Not yet implemented");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class java.lang.Class (java.lang.Double and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Character cannot be cast to class java.lang.Class (java.lang.Character and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = org.apache.commons.cli.TypeHandler.createObject("");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.cli.ParseException; message: Unable to find the class: ");
        } catch (org.apache.commons.cli.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class java.lang.Class (java.lang.Double and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class java.lang.Class (java.lang.Long and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class java.lang.Class (java.lang.Long and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class java.lang.Class (java.lang.Long and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class java.lang.Class (java.lang.Byte and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class java.lang.Class (java.lang.Float and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.io.File file2 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass3 = file2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) file2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.io.File cannot be cast to class java.lang.Class (java.io.File and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Class (java.lang.Integer and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class java.lang.Class (java.lang.Long and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.io.File file2 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) file2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.io.File cannot be cast to class java.lang.Class (java.io.File and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "hi!");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Class (java.lang.Integer and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Class (java.lang.Integer and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.cli.TypeHandler typeHandler1 = new org.apache.commons.cli.TypeHandler();
        java.lang.Class<?> wildcardClass2 = typeHandler1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) typeHandler1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.cli.TypeHandler cannot be cast to class java.lang.Class (org.apache.commons.cli.TypeHandler is in unnamed module of loader 'app'; java.lang.Class is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class java.lang.Class (java.lang.Double and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.io.File file3 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass4 = file3.getClass();
        java.lang.Object obj5 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "hi!");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class java.lang.Class (java.lang.Float and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Character cannot be cast to class java.lang.Class (java.lang.Character and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Short cannot be cast to class java.lang.Class (java.lang.Short and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Short cannot be cast to class java.lang.Class (java.lang.Short and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Boolean cannot be cast to class java.lang.Class (java.lang.Boolean and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.io.File file3 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass4 = file3.getClass();
        java.lang.Object obj5 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Character cannot be cast to class java.lang.Class (java.lang.Character and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.Object obj1 = null;
        java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("", obj1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.io.File file3 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass4 = file3.getClass();
        java.lang.Object obj5 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.io.File cannot be cast to class java.lang.Class (java.io.File and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Short cannot be cast to class java.lang.Class (java.lang.Short and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.Object obj1 = null;
        java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class java.lang.Class (java.lang.Double and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class java.lang.Class (java.lang.Double and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class java.lang.Class (java.lang.Byte and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Character cannot be cast to class java.lang.Class (java.lang.Character and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.cli.TypeHandler typeHandler2 = new org.apache.commons.cli.TypeHandler();
        java.lang.Class<?> wildcardClass3 = typeHandler2.getClass();
        java.lang.Object obj4 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class java.lang.Class (java.lang.Long and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class java.lang.Class (java.lang.Float and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class java.lang.Class (java.lang.Double and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Character cannot be cast to class java.lang.Class (java.lang.Character and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.io.File file4 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass5 = file4.getClass();
        java.lang.Object obj6 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.cli.TypeHandler.createValue("", obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.io.File cannot be cast to class java.lang.Class (java.io.File and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "hi!");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.io.File file2 = org.apache.commons.cli.TypeHandler.createFile("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Class (java.lang.Integer and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.io.File file3 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass4 = file3.getClass();
        java.lang.Object obj5 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.cli.TypeHandler.createValue("", obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.io.File cannot be cast to class java.lang.Class (java.io.File and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.cli.TypeHandler typeHandler3 = new org.apache.commons.cli.TypeHandler();
        java.lang.Class<?> wildcardClass4 = typeHandler3.getClass();
        java.lang.Object obj5 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass4);
        java.lang.Object obj6 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.io.File file2 = org.apache.commons.cli.TypeHandler.createFile("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class java.lang.Class (java.lang.Long and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Short cannot be cast to class java.lang.Class (java.lang.Short and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Object cannot be cast to class java.lang.Class (java.lang.Object and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.io.File file4 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass5 = file4.getClass();
        java.lang.Object obj6 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.io.File cannot be cast to class java.lang.Class (java.io.File and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.io.File file3 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass4 = file3.getClass();
        java.lang.Object obj5 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass4);
        java.lang.Object obj6 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "hi!");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class java.lang.Class (java.lang.Byte and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.cli.TypeHandler typeHandler1 = new org.apache.commons.cli.TypeHandler();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) typeHandler1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.cli.TypeHandler cannot be cast to class java.lang.Class (org.apache.commons.cli.TypeHandler is in unnamed module of loader 'app'; java.lang.Class is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Character cannot be cast to class java.lang.Class (java.lang.Character and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class java.lang.Class (java.lang.Double and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Boolean cannot be cast to class java.lang.Class (java.lang.Boolean and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class java.lang.Class (java.lang.Byte and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.io.File file3 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass4 = file3.getClass();
        java.lang.Object obj5 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "hi!");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.cli.TypeHandler.createValue("", obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Object cannot be cast to class java.lang.Class (java.lang.Object and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.io.File file3 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass4 = file3.getClass();
        java.lang.Object obj5 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.cli.TypeHandler.createValue("", obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.io.File cannot be cast to class java.lang.Class (java.io.File and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.io.File file3 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass4 = file3.getClass();
        java.lang.Object obj5 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.io.File cannot be cast to class java.lang.Class (java.io.File and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.io.File file4 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass5 = file4.getClass();
        java.lang.Object obj6 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass5);
        java.lang.Object obj7 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "hi!");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.io.File file3 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass4 = file3.getClass();
        java.lang.Object obj5 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj7 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class java.lang.Class (java.lang.Byte and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class java.lang.Class (java.lang.Long and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class java.lang.Class (java.lang.Float and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.io.File file4 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass5 = file4.getClass();
        java.lang.Object obj6 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "hi!");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class java.lang.Class (java.lang.Byte and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.io.File file4 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass5 = file4.getClass();
        java.lang.Object obj6 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.cli.TypeHandler.createValue("", obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.io.File cannot be cast to class java.lang.Class (java.io.File and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "hi!");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class java.lang.Class (java.lang.Float and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.io.File file4 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass5 = file4.getClass();
        java.lang.Object obj6 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass5);
        java.lang.Object obj7 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass5);
        java.lang.Object obj8 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "hi!");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass7 = file6.getClass();
        java.lang.Object obj8 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass7);
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass7);
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "hi!");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.io.File file4 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass5 = file4.getClass();
        java.lang.Object obj6 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "hi!");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.io.File file4 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass5 = file4.getClass();
        java.lang.Object obj6 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("", obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.io.File cannot be cast to class java.lang.Class (java.io.File and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class java.lang.Class (java.lang.Byte and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.io.File file3 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass4 = file3.getClass();
        java.lang.Object obj5 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.io.File cannot be cast to class java.lang.Class (java.io.File and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.io.File file5 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass6 = file5.getClass();
        java.lang.Object obj7 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Object obj9 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertNull("file5.getParent() == null", file5.getParent());
        org.junit.Assert.assertEquals(file5.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class java.lang.Class (java.lang.Byte and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.io.File file4 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass5 = file4.getClass();
        java.lang.Object obj6 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.io.File file2 = org.apache.commons.cli.TypeHandler.createFile("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) file2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.io.File cannot be cast to class java.lang.Class (java.io.File and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class java.lang.Class (java.lang.Double and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class java.lang.Class (java.lang.Float and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class java.lang.Class (java.lang.Long and java.lang.Class are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.io.File file4 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass5 = file4.getClass();
        java.lang.Object obj6 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("", obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.io.File file4 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass5 = file4.getClass();
        java.lang.Object obj6 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNull("file4.getParent() == null", file4.getParent());
        org.junit.Assert.assertEquals(file4.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "hi!");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.io.File file5 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass6 = file5.getClass();
        java.lang.Object obj7 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Object obj9 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass8);
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertNull("file5.getParent() == null", file5.getParent());
        org.junit.Assert.assertEquals(file5.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "hi!");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "hi!");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }
}

