package com.google.javascript.jscomp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import com.google.common.base.Predicate;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.junit.Test;

public class FlowSensitiveInlineVariablesTest {

    @Test
    public void testSideEffectPredicateRejectsNull() throws Exception {
        assertFalse(getSideEffectPredicate().apply(null));
    }

    @Test
    public void testSideEffectPredicateTreatsLeafAsSideEffectFree() throws Exception {
        Node leaf = new Node(Token.NAME);
        assertFalse(getSideEffectPredicate().apply(leaf));
    }

    @Test
    public void testSideEffectPredicateRecursesThroughChildren() throws Exception {
        Node child = new Node(Token.NAME);
        Node parent = new Node(Token.ADD, child);
        assertFalse(getSideEffectPredicate().apply(parent));
    }

    @Test
    public void testProcessWithNullCompilerThrowsNullPointerException() throws Throwable {
        Object pass = createPass(null);
        try {
            invokeProcess(pass, null, null);
            fail("Expected NullPointerException");
        } catch (NullPointerException expected) {
            // expected
        }
    }

    @Test
    public void testEnterScopeWithNullTraversalThrowsNullPointerException() throws Throwable {
        Object pass = createPass(new Compiler());
        try {
            invokeEnterScope(pass, null);
            fail("Expected NullPointerException");
        } catch (NullPointerException expected) {
            // expected
        }
    }

    @Test
    public void testExitScopeAndVisitAreSafeNoOpHandlers() throws Throwable {
        Object pass = createPass(new Compiler());
        invokeExitScope(pass, null);
        invokeVisit(pass, null, null, null);
    }

    private static Predicate<Node> getSideEffectPredicate() throws Exception {
        Field field = null;
        for (Field candidate : FlowSensitiveInlineVariables.class.getDeclaredFields()) {
            if (Predicate.class.isAssignableFrom(candidate.getType())) {
                field = candidate;
                break;
            }
        }
        if (field == null) {
            throw new AssertionError("Unable to find SIDE_EFFECT_PREDICATE field");
        }
        field.setAccessible(true);
        @SuppressWarnings("unchecked")
        Predicate<Node> predicate = (Predicate<Node>) field.get(null);
        return predicate;
    }

    private static Object createPass(Object compiler) throws Exception {
        Constructor<?> ctor =
                FlowSensitiveInlineVariables.class.getDeclaredConstructor(AbstractCompiler.class);
        ctor.setAccessible(true);
        return ctor.newInstance(new Object[] {compiler});
    }

    private static void invokeProcess(Object pass, Node externs, Node root) throws Throwable {
        Method method = pass.getClass().getMethod("process", Node.class, Node.class);
        method.setAccessible(true);
        try {
            method.invoke(pass, new Object[] {externs, root});
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }

    private static void invokeEnterScope(Object pass, NodeTraversal t) throws Throwable {
        Method method = pass.getClass().getMethod("enterScope", NodeTraversal.class);
        method.setAccessible(true);
        try {
            method.invoke(pass, new Object[] {t});
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }

    private static void invokeExitScope(Object pass, NodeTraversal t) throws Throwable {
        Method method = pass.getClass().getMethod("exitScope", NodeTraversal.class);
        method.setAccessible(true);
        try {
            method.invoke(pass, new Object[] {t});
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }

    private static void invokeVisit(Object pass, NodeTraversal t, Node n, Node parent)
            throws Throwable {
        Method method =
                pass.getClass().getMethod("visit", NodeTraversal.class, Node.class, Node.class);
        method.setAccessible(true);
        try {
            method.invoke(pass, new Object[] {t, n, parent});
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }
}