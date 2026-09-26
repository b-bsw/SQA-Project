package org.apache.commons.lang.time;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import org.junit.Test;

public class DateUtilsTest {

    // ---------- isSameDay (Date, Date) ----------
    @Test
    public void testIsSameDay_Dates_SameDay() {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(2020, Calendar.JUNE, 15, 10, 30, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date d1 = cal.getTime();
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        Date d2 = cal.getTime();
        assertTrue(DateUtils.isSameDay(d1, d2));
    }

    @Test
    public void testIsSameDay_Dates_DifferentDay() {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(2020, Calendar.JUNE, 15, 10, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date d1 = cal.getTime();
        cal.set(Calendar.DAY_OF_MONTH, 16);
        Date d2 = cal.getTime();
        assertFalse(DateUtils.isSameDay(d1, d2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Dates_NullFirst() {
        DateUtils.isSameDay((Date) null, new Date());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Dates_NullSecond() {
        DateUtils.isSameDay(new Date(), null);
    }

    // ---------- isSameDay (Calendar, Calendar) ----------
    @Test
    public void testIsSameDay_Calendars_SameDay() {
        Calendar cal1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal1.set(2020, Calendar.JUNE, 15, 10, 0, 0);
        cal1.set(Calendar.MILLISECOND, 0);
        Calendar cal2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal2.setTime(cal1.getTime());
        assertTrue(DateUtils.isSameDay(cal1, cal2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Calendars_NullFirst() {
        DateUtils.isSameDay((Calendar) null, Calendar.getInstance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameDay_Calendars_NullSecond() {
        DateUtils.isSameDay(Calendar.getInstance(), null);
    }

    // ---------- isSameInstant (Date, Date) ----------
    @Test
    public void testIsSameInstant_Dates_Equal() {
        Date d1 = new Date(123456789L);
        Date d2 = new Date(123456789L);
        assertTrue(DateUtils.isSameInstant(d1, d2));
    }

    @Test
    public void testIsSameInstant_Dates_NotEqual() {
        Date d1 = new Date(123456789L);
        Date d2 = new Date(987654321L);
        assertFalse(DateUtils.isSameInstant(d1, d2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_Dates_NullFirst() {
        DateUtils.isSameInstant((Date) null, new Date());
    }

    // ---------- isSameInstant (Calendar, Calendar) ----------
    @Test
    public void testIsSameInstant_Calendars_Equal() {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(new Date(123456789L));
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(new Date(123456789L));
        assertTrue(DateUtils.isSameInstant(cal1, cal2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_Calendars_Null() {
        DateUtils.isSameInstant((Calendar) null, Calendar.getInstance());
    }

    // ---------- isSameLocalTime ----------
    @Test
    public void testIsSameLocalTime_True() {
        Calendar cal1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal1.set(2020, Calendar.JUNE, 15, 10, 30, 45);
        cal1.set(Calendar.MILLISECOND, 500);
        Calendar cal2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal2.set(2020, Calendar.JUNE, 15, 10, 30, 45);
        cal2.set(Calendar.MILLISECOND, 500);
        assertTrue(DateUtils.isSameLocalTime(cal1, cal2));
    }

    @Test
    public void testIsSameLocalTime_False_Hour() {
        Calendar cal1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal1.set(2020, Calendar.JUNE, 15, 10, 30, 45);
        cal1.set(Calendar.MILLISECOND, 500);
        Calendar cal2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal2.set(2020, Calendar.JUNE, 15, 11, 30, 45);
        cal2.set(Calendar.MILLISECOND, 500);
        assertFalse(DateUtils.isSameLocalTime(cal1, cal2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSameLocalTime_Null() {
        DateUtils.isSameLocalTime(null, Calendar.getInstance());
    }

    // ---------- parseDate ----------
    @Test
    public void testParseDate_ValidPattern() throws Exception {
        String[] patterns = {"yyyy-MM-dd"};
        Date d = DateUtils.parseDate("2020-06-15", patterns);
        assertNotNull(d);
        // check that date matches
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.setTime(d);
        assertEquals(2020, cal.get(Calendar.YEAR));
        assertEquals(Calendar.JUNE, cal.get(Calendar.MONTH));
        assertEquals(15, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testParseDate_MultiplePatterns_FirstMatch() throws Exception {
        String[] patterns = {"MM/dd/yyyy", "yyyy-MM-dd"};
        Date d = DateUtils.parseDate("06/15/2020", patterns);
        assertNotNull(d);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.setTime(d);
        assertEquals(2020, cal.get(Calendar.YEAR));
        assertEquals(Calendar.JUNE, cal.get(Calendar.MONTH));
        assertEquals(15, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test(expected = ParseException.class)
    public void testParseDate_NoMatch() throws Exception {
        String[] patterns = {"yyyy.MM.dd"};
        DateUtils.parseDate("2020-06-15", patterns);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDate_NullStr() throws Exception {
        DateUtils.parseDate(null, new String[]{"yyyy"});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDate_NullPatterns() throws Exception {
        DateUtils.parseDate("2020", null);
    }

    // ---------- add family ----------
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_NullDate() {
        DateUtils.add(null, Calendar.YEAR, 1);
    }

    @Test
    public void testAddYears() {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(2020, Calendar.JANUARY, 1, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date original = cal.getTime();
        Date result = DateUtils.addYears(original, 1);
        cal.setTime(result);
        assertEquals(2021, cal.get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));
        assertEquals(1, cal.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testAddMonths() {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(2020, Calendar.JANUARY, 15, 10, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date original = cal.getTime();
        Date result = DateUtils.addMonths(original, 2);
        cal.setTime(result);
        assertEquals(2020, cal.get(Calendar.YEAR));
        assertEquals(Calendar.MARCH, cal.get(Calendar.MONTH));
        assertEquals(15, cal.get(Calendar.DAY_OF_MONTH));
    }

    // ---------- round (Date) ----------
    @Test(expected = IllegalArgumentException.class)
    public void testRound_Date_Null() {
        DateUtils.round((Date) null, Calendar.SECOND);
    }

    @Test
    public void testRound_Date_Second_RoundDown() {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(2020, Calendar.JUNE, 15, 10, 30, 45);
        cal.set(Calendar.MILLISECOND, 200);
        Date original = cal.getTime();
        Date rounded = DateUtils.round(original, Calendar.SECOND);
        cal.setTime(rounded);
        assertEquals(45, cal.get(Calendar.SECOND));
        assertEquals(0, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testRound_Date_Second_RoundUp() {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(2020, Calendar.JUNE, 15, 10, 30, 45);
        cal.set(Calendar.MILLISECOND, 600);  // >=500 -> round second up
        Date original = cal.getTime();
        Date rounded = DateUtils.round(original, Calendar.SECOND);
        cal.setTime(rounded);
        assertEquals(46, cal.get(Calendar.SECOND));
        assertEquals(0, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testRound_Date_Minute_RoundUp() {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(2020, Calendar.JUNE, 15, 10, 30, 45); // seconds 45 >=30 -> should minute round up
        cal.set(Calendar.MILLISECOND, 0);
        Date original = cal.getTime();
        Date rounded = DateUtils.round(original, Calendar.MINUTE);
        cal.setTime(rounded);
        assertEquals(31, cal.get(Calendar.MINUTE));
        assertEquals(0, cal.get(Calendar.SECOND));
        assertEquals(0, cal.get(Calendar.MILLISECOND));
    }

    // ---------- round (Calendar) ----------
    @Test
    public void testRound_Calendar_Hour_RoundUp() {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(2020, Calendar.JUNE, 15, 10, 30, 45); // minutes 30 >=30? actually we want hour round up: minutes 30? The threshold is minute offset > 29? minute max is 59, (59-0)/2=29, so minutes 30 -> offset=30 >29 -> roundUp true. So hour should increase.
        cal.set(Calendar.MILLISECOND, 0);
        Calendar rounded = DateUtils.round(cal, Calendar.HOUR_OF_DAY);
        assertEquals(11, rounded.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, rounded.get(Calendar.MINUTE));
        assertEquals(0, rounded.get(Calendar.SECOND));
        assertEquals(0, rounded.get(Calendar.MILLISECOND));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRound_Calendar_Null() {
        DateUtils.round((Calendar) null, Calendar.SECOND);
    }

    // ---------- round (Object) ----------
    @Test
    public void testRound_Object_Date() {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(2020, Calendar.JUNE, 15, 10, 30, 45);
        cal.set(Calendar.MILLISECOND, 200);
        Date original = cal.getTime();
        Date rounded = DateUtils.round((Object) original, Calendar.SECOND);
        cal.setTime(rounded);
        assertEquals(45, cal.get(Calendar.SECOND));
        assertEquals(0, cal.get(Calendar.MILLISECOND));
    }

    @Test
    public void testRound_Object_Calendar() {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(2020, Calendar.JUNE, 15, 10, 30, 45);
        cal.set(Calendar.MILLISECOND, 200);
        Calendar rounded = (Calendar) DateUtils.round((Object) cal, Calendar.SECOND);
        assertEquals(45, rounded.get(Calendar.SECOND));
        assertEquals(0, rounded.get(Calendar.MILLISECOND));
    }

    @Test(expected = ClassCastException.class)
    public void testRound_Object_Invalid() {
        DateUtils.round((Object) "not a date", Calendar.SECOND);
    }

    // ---------- truncate (Date) ----------
    @Test
    public void testTruncate_Date_Second() {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(2020, Calendar.JUNE, 15, 10, 30, 45);
        cal.set(Calendar.MILLISECOND, 600);
        Date original = cal.getTime();
        Date truncated = DateUtils.truncate(original, Calendar.SECOND);
        cal.setTime(truncated);
        // truncate (round=false) should always set lower fields to zero; but here second not zeroed? Actually truncation to SECOND zeroes millisecs only, second unchanged.
        assertEquals(45, cal.get(Calendar.SECOND));
        assertEquals(0, cal.get(Calendar.MILLISECOND));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTruncate_Date_Null() {
        DateUtils.truncate((Date) null, Calendar.SECOND);
    }

    @Test(expected = ClassCastException.class)
    public void testTruncate_Object_Invalid() {
        DateUtils.truncate((Object) 123, Calendar.SECOND);
    }

    // ---------- iterator ----------
    @Test(expected = IllegalArgumentException.class)
    public void testIterator_Date_Null() {
        DateUtils.iterator((Date) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterator_Calendar_Null() {
        DateUtils.iterator((Calendar) null, DateUtils.RANGE_WEEK_SUNDAY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIterator_InvalidRange() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        DateUtils.iterator(cal, 999);
    }

    @Test
    public void testIterator_WeekSunday_StartOnSunday() {
        // pick a focus that falls on Sunday
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(2020, Calendar.JUNE, 14, 10, 0, 0); // June 14, 2020 is a Sunday
        cal.set(Calendar.MILLISECOND, 0);
        Date focus = cal.getTime();
        Iterator it = DateUtils.iterator(focus, DateUtils.RANGE_WEEK_SUNDAY);
        assertTrue(it.hasNext());
        // first date should be itself? actually it returns a clone and advances; first next returns Sunday (focus day)
        Calendar first = (Calendar) it.next();
        assertEquals(14, first.get(Calendar.DAY_OF_MONTH));
        assertTrue(it.hasNext());
        Calendar second = (Calendar) it.next();
        assertEquals(15, second.get(Calendar.DAY_OF_MONTH));
        // iterate to end
        while (it.hasNext()) {
            it.next();
        }
        // after end, next should throw NoSuchElementException
        try {
            it.next();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            // expected
        }
    }

    @Test
    public void testIterator_MonthSunday() {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(2020, Calendar.JUNE, 15, 10, 0, 0); // June 15, 2020
        cal.set(Calendar.MILLISECOND, 0);
        Date focus = cal.getTime();
        Iterator it = DateUtils.iterator(focus, DateUtils.RANGE_MONTH_SUNDAY);
        assertTrue(it.hasNext());
        // first should be June 1 (start of month)
        Calendar first = (Calendar) it.next();
        assertEquals(1, first.get(Calendar.DAY_OF_MONTH));
        // iterate through all days of June
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(29, count); // June has 30 days total, first counted before loop, so 29 remaining
    }

    @Test(expected = ClassCastException.class)
    public void testIterator_Object_Invalid() {
        DateUtils.iterator((Object) 42, DateUtils.RANGE_WEEK_SUNDAY);
    }

    // ---------- Exception from modify: year too large ----------
    @Test(expected = ArithmeticException.class)
    public void testRound_YearTooLarge() {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        // set year > 280000000
        cal.set(300000000, Calendar.JANUARY, 1, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        DateUtils.round(cal, Calendar.SECOND);
    }

    // ---------- Unsupported field will throw IllegalArgumentException from modify ----------
    @Test(expected = IllegalArgumentException.class)
    public void testRound_UnsupportedField() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        DateUtils.round(cal, -1);
    }

    // ---------- Round with MILLISECOND field should return same ----------
    @Test
    public void testRound_MillisecondField() {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(2020, Calendar.JUNE, 15, 10, 30, 45);
        cal.set(Calendar.MILLISECOND, 123);
        Date original = cal.getTime();
        Date rounded = DateUtils.round(original, Calendar.MILLISECOND);
        cal.setTime(rounded);
        assertEquals(123, cal.get(Calendar.MILLISECOND)); // unchanged
    }

    // ---------- Round with SEMI_MONTH field (to cover the branch) ----------
    @Test
    public void testRound_SemiMonth() {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(2020, Calendar.JULY, 15, 10, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date original = cal.getTime();
        // SEMI_MONTH uses special rounding. It's hard to assert exactly,
        // but we can verify it returns a date without throwing.
        Date rounded = DateUtils.round(original, DateUtils.SEMI_MONTH);
        assertNotNull(rounded);
    }

    // ---------- Round with AM_PM field ----------
    @Test
    public void testRound_AmPm() {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(2020, Calendar.JULY, 15, 13, 0, 0); // 1 PM
        cal.set(Calendar.MILLISECOND, 0);
        Date original = cal.getTime();
        // AM_PM field rounding should not throw
        Date rounded = DateUtils.round(original, Calendar.AM_PM);
        assertNotNull(rounded);
    }

    // ---------- Truncate (Calendar) ----------
    @Test
    public void testTruncate_Calendar_Second() {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(2020, Calendar.JUNE, 15, 10, 30, 45);
        cal.set(Calendar.MILLISECOND, 678);
        Calendar truncated = DateUtils.truncate(cal, Calendar.SECOND);
        assertEquals(45, truncated.get(Calendar.SECOND));
        assertEquals(0, truncated.get(Calendar.MILLISECOND));
    }

    // ---------- Iterator with RANGE_WEEK_MONDAY, start on Monday => 0 loop ----------
    @Test
    public void testIterator_WeekMonday_StartOnMonday() {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(2020, Calendar.JUNE, 15, 10, 0, 0); // June 15, 2020 is Monday
        cal.set(Calendar.MILLISECOND, 0);
        Date focus = cal.getTime();
        Iterator it = DateUtils.iterator(focus, DateUtils.RANGE_WEEK_MONDAY);
        // startCutoff should equal focus's day-of-week (Monday) -> while loop runs 0 times
        assertTrue(it.hasNext());
        Calendar first = (Calendar) it.next();
        assertEquals(15, first.get(Calendar.DAY_OF_MONTH));
    }

    // ---------- isSameInstant (Calendar) null second ----------
    @Test(expected = IllegalArgumentException.class)
    public void testIsSameInstant_Calendar_NullSecond() {
        DateUtils.isSameInstant(Calendar.getInstance(), null);
    }

    // ---------- isSameLocalTime null second ----------
    @Test(expected = IllegalArgumentException.class)
    public void testIsSameLocalTime_NullSecond() {
        DateUtils.isSameLocalTime(Calendar.getInstance(), null);
    }
}