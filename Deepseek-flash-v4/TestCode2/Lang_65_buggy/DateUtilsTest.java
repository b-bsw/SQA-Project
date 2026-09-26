package org.apache.commons.lang.time;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.TimeZone;

public class DateUtilsTest {

    private TimeZone originalTimeZone;
    private Date date1;
    private Date date2;
    private Calendar cal1;
    private Calendar cal2;

    @Before
    public void setUp() {
        originalTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("GMT"));

        date1 = date(2020, Calendar.JANUARY, 15, 10, 30, 45, 500);
        date2 = date(2020, Calendar.JANUARY, 15, 12, 0, 0, 0);
        cal1 = Calendar.getInstance();
        cal1.setTime(date1);
        cal2 = Calendar.getInstance();
        cal2.setTime(date2);
    }

    @After
    public void tearDown() {
        TimeZone.setDefault(originalTimeZone);
    }

    private Date date(int year, int month, int day, int hour, int minute, int second, int millis) {
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(year, month, day, hour, minute, second);
        cal.set(Calendar.MILLISECOND, millis);
        return cal.getTime();
    }

    @Test
    public void testIsSameDayDate() {
        assertTrue(DateUtils.isSameDay(date1, date2));
        assertFalse(DateUtils.isSameDay(date1, date(2020, Calendar.JANUARY, 16, 0, 0, 0, 0)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDayDateNull() {
        DateUtils.isSameDay(null, date1);
    }

    @Test
    public void testIsSameDayCalendar() {
        Calendar sameDay = Calendar.getInstance();
        sameDay.setTime(date2);
        assertTrue(DateUtils.isSameDay(cal1, sameDay));

        sameDay.add(Calendar.DAY_OF_MONTH, 1);
        assertFalse(DateUtils.isSameDay(cal1, sameDay));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDayCalendarNull() {
        DateUtils.isSameDay(cal1, null);
    }

    @Test
    public void testIsSameInstantDate() {
        assertTrue(DateUtils.isSameInstant(new Date(1000L), new Date(1000L)));
        assertFalse(DateUtils.isSameInstant(new Date(1000L), new Date(2000L)));
    }

    @Test
    public void testIsSameInstantCalendar() {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTimeInMillis(1000L);
        c2.setTimeInMillis(1000L);
        assertTrue(DateUtils.isSameInstant(c1, c2));

        c2.setTimeInMillis(2000L);
        assertFalse(DateUtils.isSameInstant(c1, c2));
    }

    @Test
    public void testIsSameLocalTime() {
        Calendar c1 = Calendar.getInstance();
        c1.clear();
        c1.set(2020, Calendar.JANUARY, 15, 10, 30, 45);
        c1.set(Calendar.MILLISECOND, 500);

        Calendar c2 = (Calendar) c1.clone();
        assertTrue(DateUtils.isSameLocalTime(c1, c2));

        c2.add(Calendar.HOUR_OF_DAY, 1);
        assertFalse(DateUtils.isSameLocalTime(c1, c2));
    }

    @Test
    public void testParseDateValid() throws Exception {
        Date expected = date(2020, Calendar.JANUARY, 15, 0, 0, 0, 0);
        Date actual = DateUtils.parseDate("2020-01-15", new String[]{"yyyy-MM-dd"});
        assertEquals(expected, actual);
    }

    @Test
    public void testParseDateWithMultiplePatterns() throws Exception {
        String[] patterns = {"MM/dd/yyyy", "yyyy-MM-dd"};
        Date expected = date(2020, Calendar.JANUARY, 15, 0, 0, 0, 0);
        assertEquals(expected, DateUtils.parseDate("01/15/2020", patterns));
    }

    @Test(expected = ParseException.class)
    public void testParseDateInvalid() throws Exception {
        DateUtils.parseDate("invalid", new String[]{"yyyy-MM-dd"});
    }

    @Test(expected = ParseException.class)
    public void testParseDateZeroPatterns() throws Exception {
        DateUtils.parseDate("2020-01-15", new String[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDateNullString() throws Exception {
        DateUtils.parseDate(null, new String[]{"yyyy-MM-dd"});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDateNullPatterns() throws Exception {
        DateUtils.parseDate("2020-01-15", null);
    }

    @Test
    public void testAddMethods() {
        assertEquals(date(2021, Calendar.JANUARY, 15, 10, 30, 45, 500),
                DateUtils.addYears(date1, 1));
        assertEquals(date(2020, Calendar.FEBRUARY, 15, 10, 30, 45, 500),
                DateUtils.addMonths(date1, 1));
        assertEquals(date(2020, Calendar.JANUARY, 22, 10, 30, 45, 500),
                DateUtils.addWeeks(date1, 1));
        assertEquals(date(2020, Calendar.JANUARY, 16, 10, 30, 45, 500),
                DateUtils.addDays(date1, 1));
        assertEquals(date(2020, Calendar.JANUARY, 15, 11, 30, 45, 500),
                DateUtils.addHours(date1, 1));
        assertEquals(date(2020, Calendar.JANUARY, 15, 11, 0, 45, 500),
                DateUtils.addMinutes(date1, 30));
        assertEquals(date(2020, Calendar.JANUARY, 15, 10, 31, 0, 500),
                DateUtils.addSeconds(date1, 15));
        assertEquals(date(2020, Calendar.JANUARY, 15, 10, 30, 46, 0),
                DateUtils.addMilliseconds(date1, 500));
    }

    @Test
    public void testAddWithField() {
        assertEquals(date(2020, Calendar.MARCH, 15, 10, 30, 45, 500),
                DateUtils.add(date1, Calendar.MONTH, 2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNullDate() {
        DateUtils.add(null, Calendar.YEAR, 1);
    }

    @Test
    public void testTruncateDate() {
        assertEquals(date(2020, Calendar.JANUARY, 1, 0, 0, 0, 0),
                DateUtils.truncate(date1, Calendar.YEAR));
        assertEquals(date(2020, Calendar.JANUARY, 15, 0, 0, 0, 0),
                DateUtils.truncate(date1, Calendar.DATE));
        assertEquals(date(2020, Calendar.JANUARY, 15, 10, 0, 0, 0),
                DateUtils.truncate(date1, Calendar.HOUR_OF_DAY));
        assertEquals(date(2020, Calendar.JANUARY, 15, 10, 30, 0, 0),
                DateUtils.truncate(date1, Calendar.MINUTE));
        assertEquals(date(2020, Calendar.JANUARY, 15, 10, 30, 45, 0),
                DateUtils.truncate(date1, Calendar.SECOND));
    }

    @Test
    public void testTruncateCalendar() {
        Calendar truncated = DateUtils.truncate(cal1, Calendar.DATE);
        assertEquals(date(2020, Calendar.JANUARY, 15, 0, 0, 0, 0), truncated.getTime());
    }

    @Test
    public void testTruncateObject() {
        Date d = DateUtils.truncate((Object) date1, Calendar.DATE);
        assertEquals(date(2020, Calendar.JANUARY, 15, 0, 0, 0, 0), d);

        Calendar c = DateUtils.truncate((Object) cal1, Calendar.MONTH);
        assertEquals(date(2020, Calendar.JANUARY, 1, 0, 0, 0, 0), c.getTime());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTruncateInvalidField() {
        DateUtils.truncate(date1, 999999);
    }

    @Test(expected = ClassCastException.class)
    public void testTruncateInvalidObject() {
        DateUtils.truncate(new Object(), Calendar.YEAR);
    }

    @Test(expected = ClassCastException.class)
    public void testTruncateNullObject() {
        DateUtils.truncate((Object) null, Calendar.YEAR);
    }

    @Test
    public void testRoundDate() {
        assertEquals(date(2020, Calendar.JANUARY, 1, 0, 0, 0, 0),
                DateUtils.round(date1, Calendar.YEAR));
        assertEquals(date(2020, Calendar.JANUARY, 15, 0, 0, 0, 0),
                DateUtils.round(date1, Calendar.DATE));

        Date evening = date(2020, Calendar.JANUARY, 15, 18, 0, 0, 0);
        assertEquals(date(2020, Calendar.JANUARY, 16, 0, 0, 0, 0),
                DateUtils.round(evening, Calendar.DATE));
    }

    @Test
    public void testRoundCalendar() {
        Calendar rounded = DateUtils.round(cal1, Calendar.YEAR);
        assertEquals(date(2020, Calendar.JANUARY, 1, 0, 0, 0, 0), rounded.getTime());
    }

    @Test
    public void testRoundObject() {
        Date d = DateUtils.round((Object) date1, Calendar.YEAR);
        assertEquals(date(2020, Calendar.JANUARY, 1, 0, 0, 0, 0), d);

        Calendar c = DateUtils.round((Object) cal1, Calendar.YEAR);
        assertEquals(date(2020, Calendar.JANUARY, 1, 0, 0, 0, 0), c.getTime());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundInvalidField() {
        DateUtils.round(date1, 999999);
    }

    @Test(expected = ClassCastException.class)
    public void testRoundInvalidObject() {
        DateUtils.round(new Object(), Calendar.YEAR);
    }

    @Test(expected = ClassCastException.class)
    public void testRoundNullObject() {
        DateUtils.round((Object) null, Calendar.YEAR);
    }

    @Test
    public void testIteratorWeekSunday() {
        Iterator it = DateUtils.iterator(date1, DateUtils.RANGE_WEEK_SUNDAY);
        assertNotNull(it);
        assertTrue(it.hasNext());

        Calendar first = (Calendar) it.next();
        assertEquals(date(2020, Calendar.JANUARY, 12, 0, 0, 0, 0), first.getTime());

        int count = 1;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(7, count);
        assertFalse(it.hasNext());

        try {
            it.next();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            // expected
        }
    }

    @Test
    public void testIteratorCalendar() {
        Iterator it = DateUtils.iterator(cal1, DateUtils.RANGE_WEEK_SUNDAY);
        assertTrue(it.hasNext());

        Calendar first = (Calendar) it.next();
        assertEquals(date(2020, Calendar.JANUARY, 12, 0, 0, 0, 0), first.getTime());
    }

    @Test
    public void testIteratorRemoveThrows() {
        Iterator it = DateUtils.iterator(date1, DateUtils.RANGE_WEEK_SUNDAY);
        try {
            it.remove();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIteratorInvalidRangeStyle() {
        DateUtils.iterator(date1, 999);
    }

    @Test(expected = ClassCastException.class)
    public void testIteratorInvalidObject() {
        DateUtils.iterator(new Object(), DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = ClassCastException.class)
    public void testIteratorNullObject() {
        DateUtils.iterator((Object) null, DateUtils.RANGE_WEEK_SUNDAY);
    }
}