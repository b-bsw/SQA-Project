package org.joda.time;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

public class PartialTest {

    private Partial empty;
    private Partial year;
    private Partial ymd;

    @Before
    public void setUp() {
        empty = new Partial();
        year = new Partial(DateTimeFieldType.year(), 1970);
        ymd = new Partial(
                new DateTimeFieldType[]{
                        DateTimeFieldType.year(),
                        DateTimeFieldType.monthOfYear(),
                        DateTimeFieldType.dayOfMonth()
                },
                new int[]{1970, 1, 1});
    }

    @Test
    public void testEmptyConstructor() {
        assertEquals(0, empty.size());
        assertEquals(0, empty.getFieldTypes().length);
        assertEquals(0, empty.getValues().length);
        assertEquals(DateTimeZone.UTC, empty.getChronology().getZone());
    }

    @Test
    public void testConstructorWithTypeAndValue() {
        assertEquals(1, year.size());
        assertEquals(DateTimeFieldType.year(), year.getFieldType(0));
        assertEquals(1970, year.getValue(0));
    }

    @Test
    public void testConstructorWithArrays() {
        Partial p = new Partial(
                new DateTimeFieldType[]{
                        DateTimeFieldType.year(),
                        DateTimeFieldType.monthOfYear()
                },
                new int[]{2000, 12});

        assertEquals(2, p.size());
        assertEquals(2000, p.getValue(0));
        assertEquals(12, p.getValue(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorRejectsNullType() {
        new Partial((DateTimeFieldType) null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorRejectsNullTypeArray() {
        new Partial((DateTimeFieldType[]) null, new int[]{1});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorRejectsNullValues() {
        new Partial(new DateTimeFieldType[]{DateTimeFieldType.year()}, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorRejectsNullValueInTypes() {
        new Partial(
                new DateTimeFieldType[]{DateTimeFieldType.year(), null},
                new int[]{2000, 1});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorRejectsMismatchedLengths() {
        new Partial(
                new DateTimeFieldType[]{DateTimeFieldType.year()},
                new int[]{2000, 1});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorRejectsWrongOrder() {
        new Partial(
                new DateTimeFieldType[]{
                        DateTimeFieldType.monthOfYear(),
                        DateTimeFieldType.year()
                },
                new int[]{1, 2000});
    }

    @Test
    public void testGetFieldTypesReturnsCopy() {
        DateTimeFieldType[] types = ymd.getFieldTypes();
        types[0] = DateTimeFieldType.hourOfDay();

        assertEquals(DateTimeFieldType.year(), ymd.getFieldType(0));
    }

    @Test
    public void testGetValuesReturnsCopy() {
        int[] values = ymd.getValues();
        values[0] = 9999;

        assertEquals(1970, ymd.getValue(0));
    }

    @Test
    public void testWithSameValueReturnsThis() {
        assertSame(year, year.with(DateTimeFieldType.year(), 1970));
    }

    @Test
    public void testWithReplacesExistingValue() {
        Partial updated = year.with(DateTimeFieldType.year(), 1980);

        assertEquals(1980, updated.getValue(0));
        assertEquals(1, updated.size());
    }

    @Test
    public void testWithAddsNewField() {
        Partial updated = year.with(DateTimeFieldType.monthOfYear(), 6);

        assertEquals(2, updated.size());
        assertEquals(DateTimeFieldType.monthOfYear(), updated.getFieldType(1));
        assertEquals(6, updated.getValue(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithRejectsNullFieldType() {
        year.with((DateTimeFieldType) null, 1);
    }

    @Test
    public void testWithoutRemovesField() {
        Partial updated = ymd.without(DateTimeFieldType.monthOfYear());

        assertEquals(2, updated.size());
        assertEquals(DateTimeFieldType.year(), updated.getFieldType(0));
        assertEquals(DateTimeFieldType.dayOfMonth(), updated.getFieldType(1));
    }

    @Test
    public void testWithoutMissingFieldReturnsThis() {
        assertSame(ymd, ymd.without(DateTimeFieldType.hourOfDay()));
    }

    @Test
    public void testIsMatchReadablePartial() {
        Partial same = new Partial(DateTimeFieldType.year(), 1970);
        Partial different = new Partial(DateTimeFieldType.year(), 2000);

        assertTrue(year.isMatch(same));
        assertFalse(year.isMatch(different));
    }

    @Test
    public void testIsMatchReadableInstant() {
        DateTime dateTime = new DateTime(2004, 6, 9, 10, 20, 30, DateTimeZone.UTC);

        Partial date = new Partial(
                new DateTimeFieldType[]{
                        DateTimeFieldType.year(),
                        DateTimeFieldType.monthOfYear(),
                        DateTimeFieldType.dayOfMonth()
                },
                new int[]{2004, 6, 9});

        assertTrue(date.isMatch((ReadableInstant) dateTime));
        assertFalse(year.isMatch((ReadableInstant) dateTime));
    }

    @Test
    public void testWithFieldAdded() {
        Partial result = year.withFieldAdded(DurationFieldType.years(), 1);

        assertEquals(1971, result.getValue(0));
    }

    @Test
    public void testWithFieldAddedZero() {
        assertSame(year, year.withFieldAdded(DurationFieldType.years(), 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAddedRejectsMissingField() {
        year.withFieldAdded(DurationFieldType.months(), 1);
    }

    @Test
    public void testWithFieldAddWrapped() {
        Partial result = ymd.withFieldAddWrapped(DurationFieldType.days(), 1);

        assertEquals(2, result.getValue(2));
    }

    @Test
    public void testWithPeriodAdded() {
        Partial result = ymd.withPeriodAdded(Period.months(1), 1);

        assertEquals(1970, result.getValue(0));
        assertEquals(2, result.getValue(1));
        assertEquals(1, result.getValue(2));
    }

    @Test
    public void testPlusAndMinus() {
        assertEquals(1971, year.plus(Period.years(1)).getValue(0));
        assertEquals(1969, year.minus(Period.years(1)).getValue(0));
    }

    @Test
    public void testPlusNullPeriodReturnsThis() {
        assertSame(year, year.plus((ReadablePeriod) null));
        assertSame(year, year.minus((ReadablePeriod) null));
    }

    @Test
    public void testWithChronologyRetainFields() {
        Partial result = year.withChronologyRetainFields(year.getChronology());

        assertEquals(1970, result.getValue(0));
        assertEquals(DateTimeZone.UTC, result.getChronology().getZone());
    }

    @Test
    public void testToStringPattern() {
        assertEquals("1970", year.toString("yyyy"));
        assertEquals("1970-01-01", ymd.toString("yyyy-MM-dd"));
    }

    @Test
    public void testMutatorDoesNotChangeOriginal() {
        Partial updated = year.with(DateTimeFieldType.year(), 2000);
        updated.withFieldAdded(DurationFieldType.years(), 10);

        assertEquals(1970, year.getValue(0));
        assertEquals(2000, updated.getValue(0));
    }
}