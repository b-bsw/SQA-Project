package org.joda.time.field;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.joda.time.DateTimeField;
import org.joda.time.chrono.ISOChronology;
import org.junit.Test;

public class LenientDateTimeFieldTest {

    private DateTimeField getYearField() {
        return ISOChronology.getInstanceUTC().year();
    }

    @Test
    public void testGetInstanceNull() {
        assertNull(LenientDateTimeField.getInstance(null, ISOChronology.getInstanceUTC()));
    }

    @Test
    public void testGetInstanceAlreadyLenient() {
        DateTimeField field = LenientDateTimeField.getInstance(getYearField(), ISOChronology.getInstanceUTC());
        assertTrue(field instanceof LenientDateTimeField);
        assertTrue(field.isLenient());
        assertSame(field, LenientDateTimeField.getInstance(field, ISOChronology.getInstanceUTC()));
    }

    @Test
    public void testGetInstanceStrictUnwrapped() {
        DateTimeField strict = new StrictDateTimeField(getYearField());
        DateTimeField field = LenientDateTimeField.getInstance(strict, ISOChronology.getInstanceUTC());
        assertTrue(field instanceof LenientDateTimeField);
        assertTrue(field.isLenient());
        assertEquals(1971, field.get(field.set(0L, 1971)));
    }

    @Test
    public void testGetInstanceStrictWrappedLenient() {
        DateTimeField lenient = LenientDateTimeField.getInstance(getYearField(), ISOChronology.getInstanceUTC());
        DateTimeField strict = new StrictDateTimeField(lenient);
        assertSame(lenient, LenientDateTimeField.getInstance(strict, ISOChronology.getInstanceUTC()));
    }

    @Test
    public void testSetSameValue() {
        DateTimeField field = LenientDateTimeField.getInstance(getYearField(), ISOChronology.getInstanceUTC());
        assertEquals(0L, field.set(0L, 1970));
    }

    @Test
    public void testSetAddsOneYear() {
        DateTimeField field = LenientDateTimeField.getInstance(getYearField(), ISOChronology.getInstanceUTC());
        assertEquals(31536000000L, field.set(0L, 1971));
    }

    @Test
    public void testSetAddsMultipleYears() {
        DateTimeField field = LenientDateTimeField.getInstance(getYearField(), ISOChronology.getInstanceUTC());
        assertEquals(946684800000L, field.set(0L, 2000));
    }

    @Test(expected = NullPointerException.class)
    public void testSetNullBaseThrowsNPE() {
        DateTimeField field = LenientDateTimeField.getInstance(getYearField(), null);
        field.set(0L, 1971);
    }
}