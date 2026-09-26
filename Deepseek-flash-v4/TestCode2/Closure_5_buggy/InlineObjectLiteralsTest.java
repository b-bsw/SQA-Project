package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import com.google.common.base.Supplier;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/**
 * Tests for {@link InlineObjectLiterals}.
 */
public class InlineObjectLiteralsTest {

    private InlineObjectLiterals pass;
    private Supplier<String> safeNameSupplier;

    @Before
    public void setUp() {
        safeNameSupplier = new Supplier<String>() {
            private int nextId = 0;
            @Override
            public String get() {
                return "tmp" + (nextId++);
            }
        };
        pass = new InlineObjectLiterals(null, safeNameSupplier);
    }

    /** Helper to invoke a private instance method reflectively. */
    private Object invokePrivate(String methodName, Class<?>[] paramTypes, Object... args)
            throws Exception {
        Method method = InlineObjectLiterals.class.getDeclaredMethod(methodName, paramTypes);
        method.setAccessible(true);
        try {
            return method.invoke(pass, args);
        } catch (InvocationTargetException e) {
            // Unwrap the actual cause so tests can use assertThrows-like patterns.
            throw (Exception) e.getCause();
        }
    }

    @Test
    public void process_nullRoot_throwsNullPointerException() {
        try {
            pass.process(null, null);
            fail("Expected NullPointerException when root is null");
        } catch (NullPointerException expected) {
            // expected
        }
    }

    @Test
    public void isInlinableObject_emptyList_returnsFalse() throws Exception {
        @SuppressWarnings("unchecked")
        Boolean result = (Boolean) invokePrivate(
                "isInlinableObject",
                new Class<?>[] { List.class },
                Collections.emptyList());
        assertFalse(result);
    }

    @Test
    public void isVarOrAssignExprLhs_nameInsideVar_returnsTrue() throws Exception {
        Node name = IR.name("x");
        new Node(Token.VAR, name);  // name's parent becomes VAR

        Boolean result = (Boolean) invokePrivate(
                "isVarOrAssignExprLhs",
                new Class<?>[] { Node.class },
                name);
        assertTrue(result);
    }

    @Test
    public void isVarOrAssignExprLhs_nameInsideAssignExpr_returnsTrue() throws Exception {
        Node name = IR.name("x");
        Node objectLit = new Node(Token.OBJECTLIT);
        Node assign = new Node(Token.ASSIGN, name, objectLit);
        new Node(Token.EXPR_RESULT, assign);  // assign's parent becomes EXPR_RESULT

        Boolean result = (Boolean) invokePrivate(
                "isVarOrAssignExprLhs",
                new Class<?>[] { Node.class },
                name);
        assertTrue(result);
    }

    @Test
    public void isVarOrAssignExprLhs_nameInsideGetProp_returnsFalse() throws Exception {
        Node name = IR.name("x");
        IR.getprop(name, IR.string("a"));  // name's parent is GETPROP

        Boolean result = (Boolean) invokePrivate(
                "isVarOrAssignExprLhs",
                new Class<?>[] { Node.class },
                name);
        assertFalse(result);
    }

    @Test
    public void isVarOrAssignExprLhs_orphanName_throwsNullPointerException() throws Exception {
        Node name = IR.name("x");  // no parent
        try {
            invokePrivate("isVarOrAssignExprLhs", new Class<?>[] { Node.class }, name);
            fail("Expected NullPointerException when node has no parent");
        } catch (NullPointerException expected) {
            // expected
        }
    }
}