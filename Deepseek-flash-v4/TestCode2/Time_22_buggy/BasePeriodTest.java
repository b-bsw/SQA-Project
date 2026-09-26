package org.joda.time.base;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePeriod;
import org.junit.Test;

public class BasePeriodTest {

    private static class TestBasePeriod extends BasePeriod {

        TestBasePeriod(PeriodType type) {
            this(0, 0, 0, 0, 0, 0, 0, 0, type);
        }

        TestBasePeriod(int years, int months, int weeks, int days,
                       int hours, int minutes, int seconds, int millis,
                       PeriodType type) {
            super(years, months, weeks, days, hours, minutes, seconds, millis, type);
        }

        @Override
        public PeriodType checkPeriodType(PeriodType type) {
            return super.checkPeriodType(type);
        }

        @Override
        public void setPeriod(ReadablePeriod period) {
            super.setPeriod(period);
        }

        @Override
        public void setPeriod(int years, int months, int weeks, int days,
                              int hours, int minutes, int seconds, int millis) {
            super.setPeriod(years, months, weeks, days, hours, minutes, seconds, millis);
        }

        @Override
        public void setField(DurationFieldType field, int value) {
            super.setField(field, value);
        }

        @Override
        public void addField(DurationFieldType field, int value) {
            super.addField(field, value);
        }

        @Override
        public void mergePeriod(ReadablePeriod period) {
            super.mergePeriod(period);
        }

        @Override
        public void addPeriod(ReadablePeriod period) {
            super.addPeriod(period);
        }

        @Override
        public void setValue(int index, int value) {
            super.setValue(index, value);
        }

        @Override
        public void setValues(int[] values) {
            super.setValues(values);
        }
    }

    private static int fieldIndex(TestBasePeriod period, DurationFieldType field) {
        int index = period.getPeriodType().indexOf(field);
        assertTrue("Field not supported: " + field, index >= 0);
        return index;
    }

    private static int fieldValue(TestBasePeriod period, DurationFieldType field) {
        return period.getValue(fieldIndex(period, field));
    }

    @Test
    public void testConstructorAndGetters() {
        TestBasePeriod period = new TestBasePeriod(PeriodType.standard());

        assertSame(PeriodType.standard(), period.getPeriodType());
        assertEquals(PeriodType.standard().size(), period.size());

        assertEquals(DurationFieldType.days(),
                period.getFieldType(fieldIndex(period, DurationFieldType.days())));
        assertEquals(0, period.getValue(fieldIndex(period, DurationFieldType.years())));
    }

    @Test
    public void testCheckPeriodType() {
        TestBasePeriod period = new TestBasePeriod(PeriodType.standard());
        assertNotNull(period.checkPeriodType(null));
        assertSame(PeriodType.standard(), period.checkPeriodType(PeriodType.standard()));
    }

    @Test
    public void testSetPeriodWithIntArguments() {
        TestBasePeriod period = new TestBasePeriod(PeriodType.standard());
        period.setPeriod(1, 2, 3, 4, 5, 6, 7, 8);

        assertEquals(1, fieldValue(period, DurationFieldType.years()));
        assertEquals(2, fieldValue(period, DurationFieldType.months()));
        assertEquals(3, fieldValue(period, DurationFieldType.weeks()));
        assertEquals(4, fieldValue(period, DurationFieldType.days()));
        assertEquals(5, fieldValue(period, DurationFieldType.hours()));
        assertEquals(6, fieldValue(period, DurationFieldType.minutes()));
        assertEquals(7, fieldValue(period, DurationFieldType.seconds()));
        assertEquals(8, fieldValue(period, DurationFieldType.millis()));
    }

    @Test
    public void testSetPeriodFromReadablePeriodAndNull() {
        TestBasePeriod period = new TestBasePeriod(PeriodType.standard());
        period.setValue(fieldIndex(period, DurationFieldType.months()), 7);

        period.setPeriod(Period.months(3));
        assertEquals(3, fieldValue(period, DurationFieldType.months()));
        assertEquals(0, fieldValue(period, DurationFieldType.years()));

        period.setPeriod((ReadablePeriod) null);
        assertEquals(0, fieldValue(period, DurationFieldType.months()));
    }

    @Test
    public void testSetFieldAndAddField() {
        TestBasePeriod period = new TestBasePeriod(PeriodType.standard());
        int daysIndex = fieldIndex(period, DurationFieldType.days());

        period.setValue(daysIndex, 2);
        period.setField(DurationFieldType.days(), 5);
        assertEquals(5, fieldValue(period, DurationFieldType.days()));

        period.addField(DurationFieldType.days(), 4);
        assertEquals(9, fieldValue(period, DurationFieldType.days()));

        period.addField(DurationFieldType.days(), -20);
        assertEquals(-11, fieldValue(period, DurationFieldType.days()));
    }

    @Test
    public void testUnsupportedFieldsThrow() {
        TestBasePeriod period = new TestBasePeriod(PeriodType.time());

        try {
            period.setField(DurationFieldType.months(), 1);
            fail("Expected IllegalArgumentException for unsupported field");
        } catch (IllegalArgumentException expected) {
            // expected
        }

        try {
            period.addField(DurationFieldType.months(), 1);
            fail("Expected IllegalArgumentException for unsupported field");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testAddFieldOverflowDoesNotChangeValue() {
        TestBasePeriod period = new TestBasePeriod(PeriodType.standard());
        int secondsIndex = fieldIndex(period, DurationFieldType.seconds());

        period.setValue(secondsIndex, Integer.MAX_VALUE);

        try {
            period.addField(DurationFieldType.seconds(), 1);
            fail("Expected ArithmeticException for overflow");
        } catch (ArithmeticException expected) {
            // expected
        }

        assertEquals(Integer.MAX_VALUE, period.getValue(secondsIndex));
    }

    @Test
    public void testMergePeriod() {
        TestBasePeriod period = new TestBasePeriod(PeriodType.standard());
        period.setValue(fieldIndex(period, DurationFieldType.years()), 10);

        period.mergePeriod(Period.months(4));

        assertEquals(10, fieldValue(period, DurationFieldType.years()));
        assertEquals(4, fieldValue(period, DurationFieldType.months()));

        period.mergePeriod(null);
        assertEquals(4, fieldValue(period, DurationFieldType.months()));
    }

    @Test
    public void testAddPeriod() {
        TestBasePeriod period = new TestBasePeriod(PeriodType.standard());

        period.addPeriod(Period.days(2));
        assertEquals(2, fieldValue(period, DurationFieldType.days()));

        period.addPeriod(Period.days(3));
        assertEquals(5, fieldValue(period, DurationFieldType.days()));

        period.addPeriod(null);
        assertEquals(5, fieldValue(period, DurationFieldType.days()));
    }

    @Test
    public void testSetValueAndSetValues() {
        TestBasePeriod period = new TestBasePeriod(PeriodType.standard());
        int[] values = new int[period.size()];

        values[0] = 3;
        period.setValues(values);

        assertEquals(3, period.getValue(0));

        values[0] = 9;
        assertEquals(9, period.getValue(0));

        period.setValue(0, 7);
        assertEquals(7, period.getValue(0));
    }

    @Test
    public void testToDurationFrom() {
        TestBasePeriod period = new TestBasePeriod(PeriodType.standard());
        period.setPeriod(0, 0, 0, 0, 1, 0, 0, 0);

        DateTime start = new DateTime(2020, 1, 1, 12, 0, 0, 0, DateTimeZone.UTC);
        assertEquals(3600_000L, period.toDurationFrom(start).getMillis());
    }

    @Test
    public void testToDurationTo() {
        TestBasePeriod period = new TestBasePeriod(PeriodType.standard());
        period.setPeriod(0, 0, 0, 0, 1, 0, 0, 0);

        DateTime end = new DateTime(2020, 1, 1, 13, 0, 0, 0, DateTimeZone.UTC);
        assertEquals(3600_000L, period.toDurationTo(end).getMillis());
    }
}