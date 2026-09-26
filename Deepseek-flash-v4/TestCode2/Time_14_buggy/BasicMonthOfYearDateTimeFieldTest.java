package org.joda.time.chrono;

import org.joda.time.DateTimeFieldType;
import org.joda.time.Partial;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class BasicMonthOfYearDateTimeFieldTest {

    private BasicChronology chronology;
    private BasicMonthOfYearDateTimeField field;

    @Before
    public void setUp() {
        // Use UTC to avoid time-zone / DST complications.
        chronology = GregorianChronology.getInstanceUTC();
        field = new BasicMonthOfYearDateTimeField(chronology, 2);
    }

    private long millis(int year, int month, int day) {
        return chronology.getDateTimeMillis(year, month, day, 0, 0, 0, 0);
    }

    private long millis(int year, int month, int day,
                        int hour, int minute, int second, int milli) {
        return chronology.getDateTimeMillis(
                year, month, day, hour, minute, second, milli);
    }

    @Test
    public void testIsLenient() {
        assertFalse(field.isLenient());
    }

    @Test
    public void testGet() {
        assertEquals(2, field.get(millis(2004, 2, 29)));
        assertEquals(12, field.get(millis(2004, 12, 25)));
    }

    @Test
    public void testAddZero() {
        long instant = millis(2004, 2, 29);
        assertEquals(instant, field.add(instant, 0));
        assertEquals(instant, field.add(instant, 0L));
    }

    @Test
    public void testAddCoercesToEndOfFebruaryNonLeap() {
        long start = millis(2003, 1, 31);
        assertEquals(millis(2003, 2, 28), field.add(start, 1));
    }

    @Test
    public void testAddCoercesToEndOfFebruaryLeap() {
        long start = millis(2004, 1, 31);
        assertEquals(millis(2004, 2, 29), field.add(start, 1));
    }

    @Test
    public void testAddNegativeAcrossYear() {
        long start = millis(2004, 1, 31);
        assertEquals(millis(2003, 12, 31), field.add(start, -1));
    }

    @Test
    public void testAddNegativeMultipleOfTwelveMonths() {
        long start = millis(2004, 1, 31);
        assertEquals(millis(2002, 1, 31), field.add(start, -24));
    }

    @Test
    public void testAddLongDelegatesWithinIntRange() {
        long start = millis(2004, 1, 31);
        assertEquals(field.add(start, 1), field.add(start, 1L));
    }

    @Test
    public void testAddWrapField() {
        long start = millis(2004, 12, 31);
        assertEquals(millis(2004, 1, 31), field.addWrapField(start, 1));
    }

    @Test
    public void testSet() {
        long start = millis(2004, 1, 31);

        assertEquals(millis(2004, 2, 29), field.set(start, 2));
        assertEquals(millis(2003, 2, 28), field.set(millis(2003, 1, 31), 2));
    }

    @Test
    public void testSetRejectsInvalidMonth() {
        long instant = millis(2004, 1, 31);

        try {
            field.set(instant, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }

        try {
            field.set(instant, 13);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testIsLeap() {
        assertTrue(field.isLeap(millis(2004, 2, 29)));
        assertFalse(field.isLeap(millis(2003, 2, 28)));
        assertFalse(field.isLeap(millis(2004, 3, 1)));
    }

    @Test
    public void testGetLeapAmount() {
        assertEquals(1, field.getLeapAmount(millis(2004, 2, 29)));
        assertEquals(0, field.getLeapAmount(millis(2004, 3, 1)));
    }

    @Test
    public void testGetRangeDurationField() {
        assertNotNull(field.getRangeDurationField());
    }

    @Test
    public void testGetLeapDurationField() {
        assertNotNull(field.getLeapDurationField());
    }

    @Test
    public void testMinimumAndMaximum() {
        assertEquals(1, field.getMinimumValue());
        assertEquals(12, field.getMaximumValue());
    }

    @Test
    public void testRoundFloor() {
        long instant = millis(2004, 2, 25, 14, 30, 0, 0);
        assertEquals(millis(2004, 2, 1), field.roundFloor(instant));
    }

    @Test
    public void testRemainder() {
        long instant = millis(2004, 2, 25, 14, 30, 0, 0);
        long floor = field.roundFloor(instant);
        assertEquals(instant - floor, field.remainder(instant));
    }

    @Test
    public void testGetDifference() {
        long jan15 = millis(2003, 1, 15);
        long apr15 = millis(2003, 4, 15);

        assertEquals(3L, field.getDifferenceAsLong(apr15, jan15));
        assertEquals(-3L, field.getDifferenceAsLong(jan15, apr15));
    }

    @Test
    public void testGetDifferenceWithEndOfMonthAdjustment() {
        long jan31 = millis(2003, 1, 31);
        long feb28 = millis(2003, 2, 28);

        assertEquals(1L, field.getDifferenceAsLong(feb28, jan31));
        assertEquals(-1L, field.getDifferenceAsLong(jan31, feb28));
    }

    @Test
    public void testAddReadablePartial() {
        DateTimeFieldType[] types = new DateTimeFieldType[]{
                DateTimeFieldType.year(),
                DateTimeFieldType.monthOfYear(),
                DateTimeFieldType.dayOfMonth()
        };

        int[] values = new int[]{2004, 2, 29};
        Partial partial = new Partial(types, values, chronology);

        int[] result = field.add(partial, 1, values, 48);
        assertArrayEquals(new int[]{2008, 2, 29}, result);
    }

    @Test
    public void testAddReadablePartialZero() {
        DateTimeFieldType[] types = new DateTimeFieldType[]{
                DateTimeFieldType.year(),
                DateTimeFieldType.monthOfYear(),
                DateTimeFieldType.dayOfMonth()
        };

        int[] values = new int[]{2004, 2, 29};
        Partial partial = new Partial(types, values, chronology);

        assertArrayEquals(values, field.add(partial, 1, values, 0));
    }
}