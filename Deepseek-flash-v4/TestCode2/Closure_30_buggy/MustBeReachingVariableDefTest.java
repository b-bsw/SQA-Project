package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Collections;

import org.junit.Test;

public class MustBeReachingVariableDefTest {

    @Test(expected = NullPointerException.class)
    public void testConstructorRejectsNullArguments() {
        new MustBeReachingVariableDef(null, null, null);
    }

    @Test
    public void testEmptyMustDefsAreEqual() {
        MustBeReachingVariableDef.MustDef first = new MustBeReachingVariableDef.MustDef();
        MustBeReachingVariableDef.MustDef second = new MustBeReachingVariableDef.MustDef();
        assertTrue(first.equals(second));
        assertTrue(second.equals(first));
    }

    @Test
    public void testSameMustDefIsEqualToItself() {
        MustBeReachingVariableDef.MustDef def = new MustBeReachingVariableDef.MustDef();
        assertTrue(def.equals(def));
    }

    @Test
    public void testMustDefEqualsNullAndOtherType() {
        MustBeReachingVariableDef.MustDef def = new MustBeReachingVariableDef.MustDef();
        assertFalse(def.equals(null));
        assertFalse(def.equals(new Object()));
    }

    @Test
    public void testMustDefCopyConstructor() {
        MustBeReachingVariableDef.MustDef original = new MustBeReachingVariableDef.MustDef();
        MustBeReachingVariableDef.MustDef copy = new MustBeReachingVariableDef.MustDef(original);
        assertEquals(original, copy);
    }

    @Test
    public void testMustDefEmptyIteratorConstructor() {
        MustBeReachingVariableDef.MustDef def =
                new MustBeReachingVariableDef.MustDef(Collections.<Scope.Var>emptyIterator());
        assertEquals(new MustBeReachingVariableDef.MustDef(), def);
    }

    @Test(expected = NullPointerException.class)
    public void testMustDefIteratorWithNullVarThrowsNpe() {
        new MustBeReachingVariableDef.MustDef(
                Collections.<Scope.Var>singleton(null).iterator());
    }
}