package org.mockito.exceptions;

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) ' ', (int) (short) 1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(1, (int) (short) -1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) -1, (int) 'a');
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(10, (int) (short) 0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 1, (-1));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(100, (int) (byte) 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 0, 10);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((-1), (-1));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '4', (int) ' ');
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(10, (int) (short) 1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 100, (int) (byte) 10);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(10, (-1));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) ' ', 1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(1, (int) '#');
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) -1, (int) '4');
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '4', 1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(10, (int) (short) 10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(0, 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) -1, (int) (byte) 1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 1, 1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 100, (-1));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '4', 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(1, (int) (byte) -1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '#', (-1));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 0, (int) '#');
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) -1, (int) '4');
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 100, 10);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) -1, (int) '#');
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(0, (int) '#');
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(0, (int) (short) 0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 1, 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(1, (int) (short) 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '4', (int) '#');
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) -1, 1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 1, 100);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '4', (int) '4');
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '4', (int) (short) 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 1, (int) '4');
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 0, (int) '4');
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 10, 1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(100, 100);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(0, (int) ' ');
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(0, (-1));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) ' ', (int) '4');
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 10, 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '4', (int) (byte) 1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(100, (int) (byte) 10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '#', (int) (byte) 10);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) -1, (int) (byte) 100);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(1, (int) (byte) 10);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(0, (int) (byte) 0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(10, (int) (byte) 10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(0, (int) (short) 1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((-1), (int) 'a');
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(0, (int) (byte) 1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(1, (int) (short) 1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 1, (int) (short) 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) -1, (int) ' ');
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(100, (int) 'a');
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 0, 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(100, 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(10, 10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) ' ', 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 100, 1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '#', (int) (byte) 100);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) ' ', (int) (short) 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 0, (int) 'a');
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(0, (int) '4');
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '#', (int) 'a');
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '#', (int) '4');
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((-1), (int) (byte) 1);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '#', (int) ' ');
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '4', (int) 'a');
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 0, 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) 'a', (int) (byte) -1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) -1, (-1));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 100, 100);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 10, (int) '#');
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) 'a', 10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 0, (int) (short) 1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(100, (int) (byte) 1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(1, (int) '4');
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(10, (int) (byte) 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '#', (int) '#');
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(100, (int) (short) 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) ' ', (int) (short) 10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) -1, (int) (byte) 100);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 1, 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(1, (int) (byte) 1);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((-1), (int) (byte) 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(0, (int) 'a');
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 10, (int) '4');
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '#', (int) (byte) 1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(0, (int) (byte) 10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '4', 10);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '#', (int) (short) 100);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 10, 10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 100, (int) 'a');
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) ' ', 10);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(100, (int) (byte) -1);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) -1, 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(0, (int) (short) -1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 10, 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(100, (int) '#');
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 10, 1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 100, (int) (byte) 100);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((-1), (int) (byte) -1);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '4', (int) (byte) 10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '#', 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) -1, 10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 0, 100);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(0, 10);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) ' ', (int) 'a');
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) ' ', 100);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '4', (int) (short) 100);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(100, (int) (byte) 100);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 100, (-1));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) 'a', 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 10, (-1));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 100, 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) -1, 10);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((-1), (int) ' ');
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(0, (int) (short) 10);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) -1, (int) (short) 100);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) -1, (int) ' ');
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 100, 0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(10, 100);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) -1, (int) (short) 1);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 10, (int) (short) 100);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 0, (-1));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 1, (-1));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '4', (int) (short) 1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(0, (int) (short) 100);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(100, (int) (short) 10);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 0, (int) '4');
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) -1, (int) (byte) 10);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '4', (-1));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(1, (int) (byte) 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 10, (int) (short) 1);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 0, (int) ' ');
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 100, (int) '#');
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((-1), (int) (byte) 100);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) -1, (int) 'a');
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 100, (int) (short) 1);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 10, (int) '#');
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) ' ', (int) ' ');
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) 'a', (int) '4');
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '4', (int) (byte) -1);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(10, (int) (byte) 1);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((-1), (int) '4');
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 100, (int) '#');
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) 'a', (int) (short) 0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 100, 10);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 1, 10);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((-1), (int) '#');
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) ' ', (int) (byte) 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) ' ', (-1));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(1, 0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 1, (int) '4');
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) -1, (int) (byte) -1);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) ' ', (int) '#');
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 0, (int) ' ');
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) ' ', (int) (byte) 1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 1, (int) ' ');
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((-1), (int) (short) 1);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) 'a', (int) (short) 1);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 0, 10);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) ' ', (int) (short) -1);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(0, (int) (byte) 100);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) -1, 0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((-1), 0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 100, (int) (byte) 1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(10, (int) '#');
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) 'a', (int) (short) 100);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 0, (-1));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((-1), (int) (byte) 10);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(10, 1);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '4', 100);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(100, (int) (short) -1);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(0, 100);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 100, (int) ' ');
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 1, 1);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 10, 100);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '4', (int) (byte) 0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 100, 100);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(10, (int) '4');
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(10, (int) ' ');
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) 'a', 1);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 1, (int) '#');
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(1, (int) 'a');
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(1, (int) (byte) 100);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(10, 0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 0, 1);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(100, (int) (short) 100);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) 'a', (int) (short) 10);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) 'a', (int) ' ');
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(0, 1);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '4', (int) (short) -1);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(1, (-1));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(1, 1);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 1, (int) '#');
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '#', (int) (byte) 0);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 0, 100);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(1, 100);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(1, (int) ' ');
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 0, (int) '#');
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((-1), (int) (short) 0);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(100, (-1));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) 'a', (int) (byte) 100);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((-1), 100);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 100, (int) (short) -1);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((-1), (int) (short) 10);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) ' ', (int) (byte) -1);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((-1), 10);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) ' ', (int) (short) 100);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) 'a', (int) (byte) 0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((-1), (int) (short) 100);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 10, (int) (byte) 1);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) 'a', (int) (byte) 10);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 1, 10);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 10, 10);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 10, (int) (short) 100);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 0, 1);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(10, (int) (byte) 100);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 100, (int) (byte) 100);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) 'a', (int) '#');
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '#', (int) (byte) -1);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(100, (int) '4');
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) 'a', 100);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 0, (int) 'a');
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((-1), 1);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(1, 10);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 10, 100);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) -1, 1);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) -1, (int) (short) 10);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 10, (int) (short) -1);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(10, (int) (short) 100);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 10, (int) '4');
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 0, (int) (short) -1);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) -1, 100);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '#', (int) (short) 1);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '#', (int) (short) -1);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '#', 10);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 1, (int) (byte) -1);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '4', (int) (short) 10);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 10, (int) 'a');
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '4', (int) (byte) 100);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(0, (int) (byte) -1);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) 'a', (int) (byte) 1);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(10, (int) (short) -1);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '#', (int) (short) 10);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((-1), (int) (short) -1);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) ' ', (int) (byte) 10);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 1, (int) ' ');
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) -1, (int) (byte) 0);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) -1, (int) '#');
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 1, 100);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) 'a', (-1));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) ' ', (int) (byte) 100);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(100, 1);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(100, 10);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 1, (int) (short) -1);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(10, (int) (byte) -1);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 10, (int) ' ');
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '#', 100);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) 'a', (int) (short) -1);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(1, (int) (short) 10);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 100, (int) '4');
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 100, (int) ' ');
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) -1, 100);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(10, (int) 'a');
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '#', 1);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 1, (int) 'a');
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(100, (int) (short) 1);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 100, (int) 'a');
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '#', (int) (short) 0);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 100, (int) (byte) -1);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(1, (int) (short) 100);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 1, (int) 'a');
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(100, (int) ' ');
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 100, (int) (short) 100);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) -1, (-1));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 10, (int) ' ');
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 10, (int) (byte) 0);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 10, (-1));
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 0, (int) (byte) -1);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 10, (int) (byte) 0);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 100, (int) (byte) 0);
    }
}

