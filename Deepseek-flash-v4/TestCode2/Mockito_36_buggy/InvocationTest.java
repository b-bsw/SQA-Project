package org.mockito.internal.invocation;

import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.invocation.realmethod.RealMethod;
import org.mockito.internal.reporting.PrintSettings;

import java.io.IOException;

import static org.junit.Assert.*;

public class InvocationTest {

    private MockitoMethod mockitoMethod;
    private RealMethod realMethod;
    private Object mock;

    @Before
    public void setUp() {
        mockitoMethod = new MockitoMethod() {
            @Override
            public boolean isVarArgs() { return false; }
            @Override
            public Class<?>[] getExceptionTypes() { return new Class<?>[0]; }
            @Override
            public Class<?> getReturnType() { return String.class; }
            @Override
            public String getName() { return "foo"; }
        };
        realMethod = new RealMethod() {
            @Override
            public Object invoke(Object target, Object[] arguments) throws Throwable {
                return "realResult";
            }
        };
        mock = new Object();
    }

    private Invocation createInvocation(Object[] args) {
        return new Invocation(mock, mockitoMethod, args, 1, realMethod);
    }

    // --- expandVarArgs ---
    @Test
    public void testExpandVarArgsWithArrayArgument() {
        mockitoMethod = new MockitoMethod() {
            @Override public boolean isVarArgs() { return true; }
            @Override public Class<?>[] getExceptionTypes() { return new Class<?>[0]; }
            @Override public Class<?> getReturnType() { return String.class; }
            @Override public String getName() { return "foo"; }
        };
        Object[] args = new Object[] {1, new Object[]{"a", "b"}};
        Invocation inv = new Invocation(mock, mockitoMethod, args, 1, realMethod);
        Object[] expanded = inv.getArguments();
        assertEquals(3, expanded.length);
        assertEquals(1, expanded[0]);
        assertEquals("a", expanded[1]);
        assertEquals("b", expanded[2]);
    }

    @Test
    public void testExpandVarArgsWithNullArrayElement() {
        mockitoMethod = new MockitoMethod() {
            @Override public boolean isVarArgs() { return true; }
            @Override public Class<?>[] getExceptionTypes() { return new Class<?>[0]; }
            @Override public Class<?> getReturnType() { return String.class; }
            @Override public String getName() { return "foo"; }
        };
        Object[] args = new Object[] {"prefix", null};
        Invocation inv = new Invocation(mock, mockitoMethod, args, 1, realMethod);
        Object[] expanded = inv.getArguments();
        assertEquals(2, expanded.length);
        assertEquals("prefix", expanded[0]);
        assertNull(expanded[1]);
    }

    @Test
    public void testNoExpansionForNonVarArgs() {
        Object[] args = new Object[] {"a", new Object[]{"b"}};
        Invocation inv = createInvocation(args);
        assertArrayEquals(args, inv.getArguments());
    }

    @Test
    public void testNullArgsReturnsEmptyArray() {
        Invocation inv = createInvocation(null);
        assertNotNull(inv.getArguments());
        assertEquals(0, inv.getArguments().length);
    }

    @Test
    public void testEmptyArgumentsArray() {
        Invocation inv = createInvocation(new Object[]{});
        assertEquals(0, inv.getArguments().length);
    }

    // --- getters ---
    @Test
    public void testGetters() {
        Object[] args = new Object[]{"arg1", 2};
        Invocation inv = createInvocation(args);
        assertEquals(mock, inv.getMock());
        assertEquals(mockitoMethod, inv.getMethod());
        assertArrayEquals(args, inv.getArguments());
        assertFalse(inv.isVerified());
        assertFalse(inv.isVerifiedInOrder());
        assertEquals(1, inv.getSequenceNumber().intValue());
        assertNotNull(inv.getLocation());
        assertEquals(2, inv.getArgumentsCount());
        assertArrayEquals(args, inv.getRawArguments());
    }

    // --- equals ---
    @Test
    public void testEqualsSameContent() {
        Invocation inv1 = createInvocation(new Object[]{"x", 1});
        Invocation inv2 = createInvocation(new Object[]{"x", 1});
        assertEquals(inv1, inv2);
    }

    @Test
    public void testEqualsDifferentArguments() {
        Invocation inv1 = createInvocation(new Object[]{"x", 1});
        Invocation inv2 = createInvocation(new Object[]{"y", 1});
        assertNotEquals(inv1, inv2);
    }

    @Test
    public void testEqualsWithNull() {
        Invocation inv = createInvocation(new Object[]{"x"});
        assertNotEquals(inv, null);
    }

    @Test
    public void testEqualsWithDifferentClass() {
        Invocation inv = createInvocation(new Object[]{"x"});
        assertNotEquals(inv, new Object());
    }

    // --- toString ---
    @Test
    public void testToStringSimple() {
        Invocation inv = createInvocation(new Object[]{"arg"});
        String str = inv.toString();
        assertTrue(str.contains("foo"));
        assertTrue(str.contains("arg"));
        assertFalse(str.contains("\n"));
    }

    @Test
    public void testToStringMultilineWhenInvocationTooLong() {
        Invocation inv = createInvocation(new Object[]{"aVeryLongArgumentThatExceedsTheMaxLineLengthAndForcesMultiline"});
        String str = inv.toString();
        assertTrue(str.contains("\n"));
    }

    @Test
    public void testToStringWithMultilinePrintSetting() {
        Invocation inv = createInvocation(new Object[]{"arg"});
        PrintSettings settings = new PrintSettings();
        settings.setMultiline(true);
        String str = inv.toString(settings);
        assertTrue(str.contains("\n"));
    }

    // --- isValidException ---
    @Test
    public void testIsValidExceptionCompatible() {
        mockitoMethod = new MockitoMethod() {
            @Override public boolean isVarArgs() { return false; }
            @Override public Class<?>[] getExceptionTypes() { return new Class<?>[]{IOException.class}; }
            @Override public Class<?> getReturnType() { return String.class; }
            @Override public String getName() { return "foo"; }
        };
        Invocation inv = createInvocation(new Object[]{});
        assertTrue(inv.isValidException(new IOException()));
    }

    @Test
    public void testIsValidExceptionNotDeclared() {
        Invocation inv = createInvocation(new Object[]{});
        assertFalse(inv.isValidException(new RuntimeException()));
    }

    // --- isValidReturnType ---
    @Test
    public void testIsValidReturnTypePrimitive() {
        mockitoMethod = new MockitoMethod() {
            @Override public boolean isVarArgs() { return false; }
            @Override public Class<?>[] getExceptionTypes() { return new Class<?>[0]; }
            @Override public Class<?> getReturnType() { return int.class; }
            @Override public String getName() { return "foo"; }
        };
        Invocation inv = createInvocation(new Object[]{});
        assertTrue(inv.isValidReturnType(Integer.class));
        assertFalse(inv.isValidReturnType(Long.class));
    }

    @Test
    public void testIsValidReturnTypeNonPrimitive() {
        Invocation inv = createInvocation(new Object[]{});
        assertTrue(inv.isValidReturnType(String.class));
        assertTrue(inv.isValidReturnType(Object.class));
        assertFalse(inv.isValidReturnType(Integer.class));
    }

    // --- isVoid, returnsPrimitive, printMethodReturnType, getMethodName ---
    @Test
    public void testIsVoidAndNotPrimitive() {
        mockitoMethod = new MockitoMethod() {
            @Override public boolean isVarArgs() { return false; }
            @Override public Class<?>[] getExceptionTypes() { return new Class<?>[0]; }
            @Override public Class<?> getReturnType() { return void.class; }
            @Override public String getName() { return "foo"; }
        };
        Invocation inv = createInvocation(new Object[]{});
        assertTrue(inv.isVoid());
        assertFalse(inv.returnsPrimitive());
    }

    @Test
    public void testReturnsPrimitiveAndPrintMethodReturnType() {
        mockitoMethod = new MockitoMethod() {
            @Override public boolean isVarArgs() { return false; }
            @Override public Class<?>[] getExceptionTypes() { return new Class<?>[0]; }
            @Override public Class<?> getReturnType() { return boolean.class; }
            @Override public String getName() { return "foo"; }
        };
        Invocation inv = createInvocation(new Object[]{});
        assertTrue(inv.returnsPrimitive());
        assertEquals("boolean", inv.printMethodReturnType());
    }

    @Test
    public void testGetMethodName() {
        Invocation inv = createInvocation(new Object[]{});
        assertEquals("foo", inv.getMethodName());
    }

    // --- callRealMethod ---
    @Test
    public void testCallRealMethodInvokesRealMethod() throws Throwable {
        Invocation inv = createInvocation(new Object[]{"arg"});
        assertEquals("realResult", inv.callRealMethod());
    }

    // --- markVerified ---
    @Test
    public void testMarkVerifiedAndMarkVerifiedInOrder() {
        Invocation inv = createInvocation(new Object[]{});
        inv.markVerified();
        assertTrue(inv.isVerified());
        inv.markVerifiedInOrder();
        assertTrue(inv.isVerifiedInOrder());
        assertTrue(inv.isVerified());
    }
}