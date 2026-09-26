package org.joda.time;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class PeriodTest {

    private Period period;

    @Before
    public void setUp() {
        period = new Period(1, 2, 3, 4, 5, 6, 7, 8);
    }

    @Test
    public void testParse() {
        Period p = Period.parse("P1Y2M3W4DT5H6M7.008S");
        assertEquals(1, p.getYears());
        assertEquals(2, p.getMonths());
        assertEquals(3, p.getWeeks());
        assertEquals(4, p.getDays());
        assertEquals(5, p.getHours());
        assertEquals(6, p.getMinutes());
        assertEquals(7, p.getSeconds());
        assertEquals(8, p.getMillis());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseEmptyString() {
        Period.parse("");
    }

    @Test
    public void testStaticFactories() {
        assertEquals(1, Period.years(1).getYears());
        assertEquals(2, Period.months(2).getMonths());
        assertEquals(3, Period.weeks(3).getWeeks());
        assertEquals(4, Period.days(4).getDays());
        assertEquals(5, Period.hours(5).getHours());
        assertEquals(6, Period.minutes(6).getMinutes());
        assertEquals(7, Period.seconds(7).getSeconds());
        assertEquals(8, Period.millis(8).getMillis());
    }

    @Test
    public void testConstructors() {
        Period p1 = new Period(1, 2, 3, 4);
        assertEquals(1, p1.getHours());
        assertEquals(2, p1.getMinutes());
        assertEquals(3, p1.getSeconds());
        assertEquals(4, p1.getMillis());

        assertEquals(1, period.getYears());
        assertEquals(2, period.getMonths());
        assertEquals(3, period.getWeeks());
        assertEquals(4, period.getDays());
        assertEquals(5, period.getHours());
        assertEquals(6, period.getMinutes());
        assertEquals(7, period.getSeconds());
        assertEquals(8, period.getMillis());

        Period fromDuration = new Period(90000L);
        assertEquals(90000L, fromDuration.toStandardDuration().getMillis());
    }

    @Test
    public void testGettersAndToPeriod() {
        assertSame(period, period.toPeriod());
        assertEquals(1, period.getYears());
        assertEquals(2, period.getMonths());
        assertEquals(3, period.getWeeks());
        assertEquals(4, period.getDays());
        assertEquals(5, period.getHours());
        assertEquals(6, period.getMinutes());
        assertEquals(7, period.getSeconds());
        assertEquals(8, period.getMillis());
    }

    @Test
    public void testWithPeriodType() {
        assertSame(period, period.withPeriodType(PeriodType.standard()));
        assertSame(period, period.withPeriodType(null));

        Period timePeriod = new Period(0, 0, 0, 0, 5, 6, 7, 8, PeriodType.time());
        Period converted = timePeriod.withPeriodType(PeriodType.standard());
        assertNotSame(timePeriod, converted);
        assertEquals(5, converted.getHours());
        assertEquals(6, converted.getMinutes());
        assertEquals(7, converted.getSeconds());
        assertEquals(8, converted.getMillis());
    }

    @Test
    public void testWithFields() {
        Period p = Period.days(2);
        assertSame(p, p.withFields(null));

        Period merged = new Period().withFields(Period.days(3).plusHours(4));
        assertEquals(3, merged.getDays());
        assertEquals(4, merged.getHours());
    }

    @Test
    public void testWithField() {
        Period p = new Period();
        assertEquals(5, p.withField(DurationFieldType.DAYS_TYPE, 5).getDays());

        try {
            p.withField(null, 1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testWithFieldAdded() {
        Period p = Period.days(1);
        assertSame(p, p.withFieldAdded(DurationFieldType.DAYS_TYPE, 0));
        assertEquals(6, p.withFieldAdded(DurationFieldType.DAYS_TYPE, 5).getDays());

        try {
            p.withFieldAdded(null, 1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testWithFieldMethods() {
        Period p = new Period()
                .withYears(1)
                .withMonths(2)
                .withWeeks(3)
                .withDays(4)
                .withHours(5)
                .withMinutes(6)
                .withSeconds(7)
                .withMillis(8);
        assertEquals(1, p.getYears());
        assertEquals(2, p.getMonths());
        assertEquals(3, p.getWeeks());
        assertEquals(4, p.getDays());
        assertEquals(5, p.getHours());
        assertEquals(6, p.getMinutes());
        assertEquals(7, p.getSeconds());
        assertEquals(8, p.getMillis());
    }

    @Test
    public void testPlusMinusReadablePeriod() {
        Period p = Period.days(5);
        assertSame(p, p.plus(null));
        assertSame(p, p.minus(null));

        Period sum = new Period().plus(Period.days(2).plusHours(3));
        assertEquals(2, sum.getDays());
        assertEquals(3, sum.getHours());

        Period diff = Period.days(5).minus(Period.days(2));
        assertEquals(3, diff.getDays());
    }

    @Test
    public void testPlusAndNoOpPlusMethods() {
        Period p = Period.ZERO
                .plusYears(1)
                .plusMonths(2)
                .plusWeeks(3)
                .plusDays(4)
                .plusHours(5)
                .plusMinutes(6)
                .plusSeconds(7)
                .plusMillis(8);
        assertEquals(1, p.getYears());
        assertEquals(2, p.getMonths());
        assertEquals(3, p.getWeeks());
        assertEquals(4, p.getDays());
        assertEquals(5, p.getHours());
        assertEquals(6, p.getMinutes());
        assertEquals(7, p.getSeconds());
        assertEquals(8, p.getMillis());

        Period q = Period.days(1);
        assertSame(q, q.plusYears(0));
        assertSame(q, q.plusMonths(0));
        assertSame(q, q.plusWeeks(0));
        assertSame(q, q.plusDays(0));
        assertSame(q, q.plusHours(0));
        assertSame(q, q.plusMinutes(0));
        assertSame(q, q.plusSeconds(0));
        assertSame(q, q.plusMillis(0));
    }

    @Test
    public void testMinusMethods() {
        Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8)
                .minusYears(1)
                .minusMonths(2)
                .minusWeeks(3)
                .minusDays(4)
                .minusHours(5)
                .minusMinutes(6)
                .minusSeconds(7)
                .minusMillis(8);
        assertEquals(0, p.getYears());
        assertEquals(0, p.getMonths());
        assertEquals(0, p.getWeeks());
        assertEquals(0, p.getDays());
        assertEquals(0, p.getHours());
        assertEquals(0, p.getMinutes());
        assertEquals(0, p.getSeconds());
        assertEquals(0, p.getMillis());
    }

    @Test
    public void testMultipliedByAndNegated() {
        assertSame(Period.ZERO, Period.ZERO.multipliedBy(10));
        Period p = Period.days(2);
        assertSame(p, p.multipliedBy(1));
        assertEquals(6, Period.days(2).multipliedBy(3).getDays());
        assertEquals(0, Period.days(3).multipliedBy(0).getDays());
        assertEquals(-2, Period.days(2).negated().getDays());
    }

    @Test
    public void testToStandardConversions() {
        assertEquals(3, Period.days(21).toStandardWeeks().getWeeks());
        assertEquals(14, Period.weeks(2).toStandardDays().getDays());
        assertEquals(26, Period.days(1).plusHours(2).toStandardHours().getHours());
        assertEquals(90, Period.hours(1).plusMinutes(30).toStandardMinutes().getMinutes());
        assertEquals(75, Period.minutes(1).plusSeconds(15).toStandardSeconds().getSeconds());
        assertEquals(5500L, Period.seconds(5).plusMillis(500).toStandardDuration().getMillis());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testConversionRejectsMonths() {
        new Period(0, 1, 0, 0, 0, 0, 0, 0).toStandardWeeks();
    }

    @Test
    public void testNormalizedStandard() {
        Period p = new Period(0, 15, 0, 0, 0, 0, 0, 0).normalizedStandard();
        assertEquals(1, p.getYears());
        assertEquals(3, p.getMonths());

        Period q = Period.days(2).plusHours(12).normalizedStandard();
        assertEquals(2, q.getDays());
        assertEquals(12, q.getHours());
    }

    @Test
    public void testFieldDifference() {
        Period p = Period.fieldDifference(new LocalDate(2000, 1, 1), new LocalDate(2005, 3, 1));
        assertEquals(5, p.getYears());
        assertEquals(2, p.getMonths());

        try {
            Period.fieldDifference(null, new LocalDate(2000, 1, 1));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }

        try {
            Period.fieldDifference(new LocalDate(2000, 1, 1), new LocalTime(10, 0));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }
}