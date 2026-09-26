package org.joda.time;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class LocalDateTest {

    private DateTimeZone originalDateTimeZone;

    @Before
    public void setUp() {
        originalDateTimeZone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(DateTimeZone.UTC);
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(originalDateTimeZone);
    }

    @Test
    public void testConstructorsAndParse() {
        LocalDate d = new LocalDate(2005, 4, 8);

        assertNotNull(LocalDate.now());
        assertNotNull(LocalDate.now(DateTimeZone.UTC));
        assertNotNull(LocalDate.now(ISOChronology.getInstanceUTC()));

        assertEquals(d, LocalDate.parse("2005-04-08"));

        DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy/MM/dd");
        assertEquals(d, LocalDate.parse("2005/04/08", fmt));
    }

    @Test
    public void testFromCalendarAndDateFields() {
        LocalDate d = new LocalDate(2005, 4, 8);

        GregorianCalendar cal = new GregorianCalendar(2005, Calendar.APRIL, 8);
        assertEquals(d, LocalDate.fromCalendarFields(cal));
        assertEquals(d, LocalDate.fromDateFields(cal.getTime()));

        try {
            LocalDate.fromCalendarFields(null);
            fail();
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            LocalDate.fromDateFields(null);
            fail();
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testBasicGetters() {
        LocalDate d = new LocalDate(2005, 4, 8);

        assertEquals(3, d.size());
        assertEquals(2005, d.getValue(0));
        assertEquals(4, d.getValue(1));
        assertEquals(8, d.getValue(2));

        assertEquals(DateTimeFieldType.year(), d.getField(0).getType());
        assertEquals(DateTimeFieldType.monthOfYear(), d.getField(1).getType());
        assertEquals(DateTimeFieldType.dayOfMonth(), d.getField(2).getType());

        assertEquals(2005, d.get(DateTimeFieldType.year()));
        assertEquals(4, d.get(DateTimeFieldType.monthOfYear()));
        assertEquals(8, d.get(DateTimeFieldType.dayOfMonth()));

        assertEquals(2005, d.getYear());
        assertEquals(4, d.getMonthOfYear());
        assertEquals(8, d.getDayOfMonth());
        assertEquals(98, d.getDayOfYear());
        assertEquals(5, d.getDayOfWeek());
        assertEquals(1, d.getEra());
    }

    @Test
    public void testIsSupportedAndUnsupported() {
        LocalDate d = new LocalDate(2005, 4, 8);

        assertTrue(d.isSupported(DateTimeFieldType.year()));
        assertFalse(d.isSupported(DateTimeFieldType.hourOfDay()));
        assertFalse(d.isSupported((DateTimeFieldType) null));

        assertTrue(d.isSupported(DurationFieldType.days()));
        assertFalse(d.isSupported(DurationFieldType.hours()));
        assertFalse(d.isSupported((DurationFieldType) null));

        try {
            d.get(DateTimeFieldType.hourOfDay());
            fail();
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            d.get(null);
            fail();
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testWithFieldsAndWithField() {
        LocalDate d = new LocalDate(2005, 4, 8);

        assertEquals(new LocalDate(2006, 5, 9),
                d.withFields(new LocalDate(2006, 5, 9)));

        assertEquals(new LocalDate(2006, 4, 8),
                d.withField(DateTimeFieldType.year(), 2006));

        assertEquals(new LocalDate(2005, 4, 30), d.withDayOfMonth(30));
        assertEquals(new LocalDate(2005, 5, 8), d.withMonthOfYear(5));
        assertEquals(new LocalDate(2006, 4, 8), d.withYear(2006));

        assertEquals(new LocalDate(2005, 4, 4), d.withDayOfWeek(1));
        assertEquals(new LocalDate(2005, 4, 10), d.withDayOfYear(100));
    }

    @Test
    public void testWithInvalidField() {
        LocalDate d = new LocalDate(2005, 4, 8);

        try {
            d.withField(null, 2006);
            fail();
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            d.withDayOfMonth(31);
            fail();
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            d.withMonthOfYear(13);
            fail();
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            new LocalDate(2005, 2, 29);
            fail();
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testPlusAndMinus() {
        LocalDate d = new LocalDate(2005, 4, 8);

        assertSame(d, d.plusYears(0));
        assertSame(d, d.plusMonths(0));
        assertSame(d, d.plusWeeks(0));
        assertSame(d, d.plusDays(0));

        assertEquals(new LocalDate(2006, 4, 8), d.plusYears(1));
        assertEquals(new LocalDate(2005, 5, 8), d.plusMonths(1));
        assertEquals(new LocalDate(2005, 4, 15), d.plusWeeks(1));
        assertEquals(new LocalDate(2005, 4, 9), d.plusDays(1));

        assertEquals(new LocalDate(2004, 4, 8), d.minusYears(1));
        assertEquals(new LocalDate(2005, 3, 8), d.minusMonths(1));
        assertEquals(new LocalDate(2005, 4, 1), d.minusWeeks(1));
        assertEquals(new LocalDate(2005, 4, 7), d.minusDays(1));

        assertEquals(new LocalDate(2005, 4, 10), d.plus(Period.days(2)));
        assertEquals(new LocalDate(2005, 4, 1), d.minus(Period.days(7)));
    }

    @Test
    public void testLeapYearAdjustment() {
        assertEquals(new LocalDate(2005, 2, 28),
                new LocalDate(2004, 2, 29).plusYears(1));

        assertEquals(new LocalDate(2003, 2, 28),
                new LocalDate(2004, 2, 29).minusYears(1));

        assertEquals(new LocalDate(2005, 2, 28),
                new LocalDate(2005, 1, 31).withMonthOfYear(2));
    }

    @Test
    public void testProperty() {
        LocalDate d = new LocalDate(2005, 4, 8);

        LocalDate.Property year = d.year();
        LocalDate.Property month = d.monthOfYear();
        LocalDate.Property day = d.dayOfMonth();

        assertEquals(2005, year.get());
        assertEquals(4, month.get());
        assertEquals(8, day.get());

        assertEquals(new LocalDate(2006, 4, 8), year.addToCopy(1));
        assertEquals(new LocalDate(2005, 5, 8), month.addToCopy(1));
        assertEquals(new LocalDate(2005, 4, 9), day.addToCopy(1));
        assertEquals(new LocalDate(2005, 4, 9), day.addWrapFieldToCopy(1));
        assertEquals(new LocalDate(2005, 4, 1), day.setCopy(1));

        assertEquals(2005, d.property(DateTimeFieldType.year()).get());
    }

    @Test
    public void testToString() {
        LocalDate d = new LocalDate(2005, 4, 8);

        assertEquals("2005-04-08", d.toString());
        assertEquals("2005/04/08", d.toString("yyyy/MM/dd"));

        assertEquals(d.toString(), d.toString((String) null));
    }

    @Test
    public void testConversions() {
        LocalDate d = new LocalDate(2005, 4, 8);

        DateTime expectedMidnight =
                new DateTime(2005, 4, 8, 0, 0, 0, 0, DateTimeZone.UTC);

        assertEquals(expectedMidnight, d.toDateTimeAtStartOfDay(DateTimeZone.UTC));
        assertEquals(expectedMidnight.toDate(), d.toDate());

        assertEquals(new DateTime(2005, 4, 8, 10, 30, 0, 0, DateTimeZone.UTC),
                d.toDateTime(new LocalTime(10, 30), DateTimeZone.UTC));

        assertEquals(new LocalDateTime(2005, 4, 8, 10, 30, 0, 0),
                d.toLocalDateTime(new LocalTime(10, 30)));

        assertEquals(new LocalDateTime(2005, 4, 8, 0, 0, 0, 0),
                d.toLocalDateTime((LocalTime) null));
    }

    @Test
    public void testToInterval() {
        LocalDate d = new LocalDate(2005, 4, 8);

        Interval interval = d.toInterval(DateTimeZone.UTC);

        assertEquals(d.toDateTimeAtStartOfDay(DateTimeZone.UTC),
                interval.getStart());

        assertEquals(d.plusDays(1).toDateTimeAtStartOfDay(DateTimeZone.UTC),
                interval.getEnd());
    }

    @Test
    public void testEqualsHashCodeCompareTo() {
        LocalDate d = new LocalDate(2005, 4, 8);

        assertEquals(d, new LocalDate(2005, 4, 8));
        assertEquals(d.hashCode(), new LocalDate(2005, 4, 8).hashCode());

        assertFalse(d.equals(new LocalDate(2005, 4, 9)));
        assertFalse(d.equals(""));

        assertEquals(0, d.compareTo(new LocalDate(2005, 4, 8)));
        assertTrue(d.compareTo(new LocalDate(2005, 4, 9)) < 0);
        assertTrue(d.compareTo(new LocalDate(2005, 4, 7)) > 0);
    }
}