package org.mockito.internal.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PrimitivesTest {

    @Test
    public void primitiveTypeOfReturnsPrimitiveClassForPrimitiveInput() {
        assertSame(int.class, Primitives.primitiveTypeOf(int.class));
        assertSame(boolean.class, Primitives.primitiveTypeOf(boolean.class));
    }

    @Test
    public void primitiveTypeOfMapsAllWrapperClassesToPrimitiveClasses() {
        assertSame(boolean.class, Primitives.primitiveTypeOf(Boolean.class));
        assertSame(char.class, Primitives.primitiveTypeOf(Character.class));
        assertSame(byte.class, Primitives.primitiveTypeOf(Byte.class));
        assertSame(short.class, Primitives.primitiveTypeOf(Short.class));
        assertSame(int.class, Primitives.primitiveTypeOf(Integer.class));
        assertSame(long.class, Primitives.primitiveTypeOf(Long.class));
        assertSame(float.class, Primitives.primitiveTypeOf(Float.class));
        assertSame(double.class, Primitives.primitiveTypeOf(Double.class));
    }

    @Test
    public void primitiveTypeOfReturnsNullForUnrelatedClass() {
        assertNull(Primitives.primitiveTypeOf(String.class));
    }

    @Test(expected = NullPointerException.class)
    public void primitiveTypeOfNullThrowsNullPointerException() {
        Primitives.primitiveTypeOf(null);
    }

    @Test
    public void isPrimitiveWrapperAcceptsWrapperClasses() {
        assertTrue(Primitives.isPrimitiveWrapper(Integer.class));
        assertTrue(Primitives.isPrimitiveWrapper(Boolean.class));
    }

    @Test
    public void isPrimitiveWrapperRejectsPrimitivesAndNonWrapperTypes() {
        assertFalse(Primitives.isPrimitiveWrapper(int.class));
        assertFalse(Primitives.isPrimitiveWrapper(String.class));
        assertFalse(Primitives.isPrimitiveWrapper(null));
    }

    @Test
    public void primitiveWrapperOfReturnsDefaultValuesForWrapperClasses() {
        Integer intDefault = Primitives.primitiveWrapperOf(Integer.class);
        Boolean booleanDefault = Primitives.primitiveWrapperOf(Boolean.class);
        Character charDefault = Primitives.primitiveWrapperOf(Character.class);
        Double doubleDefault = Primitives.primitiveWrapperOf(Double.class);
        assertEquals(Integer.valueOf(0), intDefault);
        assertEquals(Boolean.FALSE, booleanDefault);
        assertEquals(Character.valueOf('\u0000'), charDefault);
        assertEquals(Double.valueOf(0.0), doubleDefault);
    }

    @Test
    public void primitiveWrapperOfReturnsNullForNonWrapperTypes() {
        assertNull(Primitives.primitiveWrapperOf(int.class));
        assertNull(Primitives.primitiveWrapperOf(String.class));
        assertNull(Primitives.primitiveWrapperOf(null));
    }

    @Test
    public void primitiveValueOrNullForReturnsDefaultValuesForPrimitiveClasses() {
        Integer intDefault = Primitives.primitiveValueOrNullFor(int.class);
        Boolean booleanDefault = Primitives.primitiveValueOrNullFor(boolean.class);
        Double doubleDefault = Primitives.primitiveValueOrNullFor(double.class);
        assertEquals(Integer.valueOf(0), intDefault);
        assertEquals(Boolean.FALSE, booleanDefault);
        assertEquals(Double.valueOf(0.0), doubleDefault);
    }

    @Test
    public void primitiveValueOrNullForReturnsNullForNonPrimitiveClasses() {
        assertNull(Primitives.primitiveValueOrNullFor(Integer.class));
        assertNull(Primitives.primitiveValueOrNullFor(String.class));
        assertNull(Primitives.primitiveValueOrNullFor(null));
    }
}