package org.joda.time.base;

import static org.junit.Assert.*;

import org.joda.time.DurationFieldType;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.junit.Test;

public class BaseSingleFieldPeriodTest {

    private static final long MILLIS_PER_DAY = 24L * 60L * 60L * 1000L;
    private static final long MILLIS_PER_HOUR = 60L * 60L * 1000L;

    private static class TestPeriod extends BaseSingleFieldPeriod {
        private final DurationFieldType fieldType;
        private final PeriodType periodType;

        TestPeriod(int value) {
            this(value, DurationFieldType.days(), PeriodType.days());
        }

        TestPeriod(int value, DurationFieldType fieldType, PeriodType periodType) {
            super(value);
            this.fieldType = fieldType;
            this.periodType = periodType;
        }

        @Override
        public DurationFieldType getFieldType() {
            return fieldType;
        }

        @Override
        public PeriodType getPeriodType() {
            return periodType;
        }
    }

    @Test
    public void testValueAndFieldType() {
        TestPeriod period = new TestPeriod(7);
        assertEquals(7, period.getValue());
        assertEquals(7, period.getValue(0));
        assertSame(DurationFieldType.days(), period.getFieldType());
        assertSame(DurationFieldType.days(), period.getFieldType(0));
        assertSame(PeriodType.days(), period.getPeriodType());
        assertEquals(1, period.size());
    }

    @Test
    public void testSetValue() {
        TestPeriod period = new TestPeriod(1);
        period.setValue(42);
        assertEquals(42, period.getValue());
        assertEquals(42, period.getValue(0));
    }

    @Test
    public void testGetFieldTypeIndexValidation() {
        TestPeriod period = new TestPeriod(4);
        try {
            period.getFieldType(1);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertEquals("1", e.getMessage());
        }
        try {
            period.getFieldType(-1);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertEquals("-1", e.getMessage());
        }
    }

    @Test
    public void testGetByTypeAndSupported() {
        TestPeriod hours = new TestPeriod(3, DurationFieldType.hours(), PeriodType.hours());
        assertEquals(3, hours.get(DurationFieldType.hours()));
        assertEquals(0, hours.get(DurationFieldType.days()));
        assertEquals(0, hours.get(null));
        assertTrue(hours.isSupported(DurationFieldType.hours()));
        assertFalse(hours.isSupported(DurationFieldType.days()));
        assertFalse(hours.isSupported(null));
    }

    @Test
    public void testToPeriodAndMutablePeriod() {
        TestPeriod period = new TestPeriod(3);
        Period converted = period.toPeriod();
        assertEquals(3, converted.getDays());
        MutablePeriod mutable = period.toMutablePeriod();
        assertEquals(3, mutable.getDays());
    }

    @Test
    public void testEqualsAndHashCode() {
        TestPeriod p1 = new TestPeriod(4);
        TestPeriod p2 = new TestPeriod(4);
        TestPeriod p3 = new TestPeriod(5);
        TestPeriod hours = new TestPeriod(4, DurationFieldType.hours(), PeriodType.hours());

        assertTrue(p1.equals(p1));
        assertTrue(p1.equals(p2));
        assertFalse(p1.equals(p3));
        assertFalse(p1.equals(hours));
        assertFalse(p1.equals(null));
        assertFalse(p1.equals("not a period"));
        assertEquals(p1.hashCode(), p2.hashCode());
    }

    @Test
    public void testCompareTo() {
        TestPeriod period = new TestPeriod(5);
        TestPeriod smaller = new TestPeriod(4);
        TestPeriod larger = new TestPeriod(6);
        assertTrue(period.compareTo(smaller) > 0);
        assertTrue(period.compareTo(larger) < 0);
        assertEquals(0, period.compareTo(new TestPeriod(5)));
    }

    @Test
    public void testCompareToNullAndClassCast() {
        TestPeriod period = new TestPeriod(1);
        try {
            period.compareTo(null);
            fail();
        } catch (NullPointerException e) {
        }

        BaseSingleFieldPeriod other = new BaseSingleFieldPeriod(1) {
            @Override
            public DurationFieldType getFieldType() {
                return DurationFieldType.days();
            }

            @Override
            public PeriodType getPeriodType() {
                return PeriodType.days();
            }
        };
        try {
            period.compareTo(other);
            fail();
        } catch (ClassCastException e) {
        }
    }

    @Test
    public void testBetweenInstant() {
        Instant start = new Instant(0L);
        Instant end = new Instant(2 * MILLIS_PER_DAY);
        assertEquals(2, BaseSingleFieldPeriod.between(start, end, DurationFieldType.days()));
        assertEquals(0, BaseSingleFieldPeriod.between(start, start, DurationFieldType.days()));
    }

    @Test
    public void testBetweenInstantNullThrows() {
        Instant now = new Instant(0L);
        try {
            BaseSingleFieldPeriod.between(null, now, DurationFieldType.days());
            fail();
        } catch (IllegalArgumentException e) {
        }
        try {
            BaseSingleFieldPeriod.between(now, null, DurationFieldType.days());
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testBetweenPartial() {
        LocalDate start = new LocalDate(2000, 1, 1);
        LocalDate end = new LocalDate(2000, 1, 3);
        TestPeriod zero = new TestPeriod(0);
        assertEquals(2, BaseSingleFieldPeriod.between(start, end, zero));
    }

    @Test
    public void testBetweenPartialNullThrows() {
        LocalDate date = new LocalDate(2000, 1, 1);
        TestPeriod zero = new TestPeriod(0);
        try {
            BaseSingleFieldPeriod.between(null, date, zero);
            fail();
        } catch (IllegalArgumentException e) {
        }
        try {
            BaseSingleFieldPeriod.between(date, null, zero);
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testStandardPeriodIn() {
        TestPeriod days = new TestPeriod(5);
        assertEquals(5, BaseSingleFieldPeriod.standardPeriodIn(days, MILLIS_PER_DAY));

        Period mixed = new Period(0, 0, 0, 1, 2, 0, 0, 0);
        assertEquals(26, BaseSingleFieldPeriod.standardPeriodIn(mixed, MILLIS_PER_HOUR));

        assertEquals(0, BaseSingleFieldPeriod.standardPeriodIn(null, MILLIS_PER_DAY));
    }

    @Test
    public void testStandardPeriodInImpreciseThrows() {
        Period months = new Period(0, 1, 0, 0, 0, 0, 0, 0);
        try {
            BaseSingleFieldPeriod.standardPeriodIn(months, MILLIS_PER_DAY);
            fail();
        } catch (IllegalArgumentException e) {
        }
    }
}