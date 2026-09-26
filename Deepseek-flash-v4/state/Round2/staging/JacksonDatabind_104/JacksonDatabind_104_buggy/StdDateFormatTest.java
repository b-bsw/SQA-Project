package com.fasterxml.jackson.databind.util;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Before;
import org.junit.Test;

public class StdDateFormatTest {

    private StdDateFormat df;

    @Before
    public void setUp() {
        df = new StdDateFormat().withTimeZone(TimeZone.getTimeZone("UTC"));
    }

    private Date date(int year, int month, int day, int hour, int minute, int second, int millis) {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.set(year, month, day, hour, minute, second);
        cal.set(Calendar.MILLISECOND, millis);
        return cal.getTime();
    }

    private void assertDate(Date d, int year, int month, int day,
                            int hour, int minute, int second, int millis) {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.setTime(d);
        assertEquals(year, cal.get(Calendar.YEAR));
        assertEquals(month, cal.get(Calendar.MONTH));
        assertEquals(day, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(hour, cal.get(Calendar.HOUR_OF_DAY));
        assertEquals(minute, cal.get(Calendar.MINUTE));
        assertEquals(second, cal.get(Calendar.SECOND));
        assertEquals(millis, cal.get(Calendar.MILLISECOND));
    }

    // ==================== Fluent configuration methods ====================

    @Test
    public void testWithTimeZoneSameReturnsThis() {
        StdDateFormat original = new StdDateFormat().withTimeZone(TimeZone.getTimeZone("UTC"));
        assertSame(original, original.withTimeZone(TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void testWithTimeZoneNull() {
        StdDateFormat original = new StdDateFormat().withTimeZone(TimeZone.getTimeZone("UTC"));
        StdDateFormat changed = original.withTimeZone(null);
        assertNotSame(original, changed);
        assertNull(changed.getTimeZone());
    }

    @Test
    public void testWithLocaleDifferentReturnsNew() {
        StdDateFormat original = new StdDateFormat();
        StdDateFormat changed = original.withLocale(Locale.US);
        assertNotSame(original, changed);
        assertSame(changed, changed.withLocale(Locale.US));
    }

    @Test
    public void testWithLenientFalse() {
        StdDateFormat original = new StdDateFormat();
        StdDateFormat changed = original.withLenient(Boolean.FALSE);
        assertNotSame(original, changed);
        assertFalse(changed.isLenient());
        assertTrue(original.isLenient());
    }

    @Test
    public void testWithLenientTrue() {
        StdDateFormat original = new StdDateFormat();
        StdDateFormat changed = original.withLenient(Boolean.TRUE);
        assertNotSame(original, changed);
        assertTrue(changed.isLenient());
    }

    @Test
    public void testWithColonInTimeZone() {
        StdDateFormat original = new StdDateFormat();
        assertFalse(original.isColonIncludedInTimeZone());

        StdDateFormat changed = original.withColonInTimeZone(true);
        assertNotSame(original, changed);
        assertTrue(changed.isColonIncludedInTimeZone());

        assertSame(original, original.withColonInTimeZone(false));
    }

    @Test
    public void testClone() {
        StdDateFormat original = new StdDateFormat().withTimeZone(TimeZone.getTimeZone("UTC"));
        StdDateFormat copy = (StdDateFormat) original.clone();

        assertNotSame(original, copy);
        assertEquals(original.getTimeZone(), copy.getTimeZone());
        assertEquals(original.isLenient(), copy.isLenient());
        assertEquals(original.isColonIncludedInTimeZone(), copy.isColonIncludedInTimeZone());
    }

    @Test
    public void testEqualsAndHashCode() {
        StdDateFormat a = new StdDateFormat();
        StdDateFormat b = new StdDateFormat();

        assertTrue(a.equals(a));
        assertFalse(a.equals(b));
        assertFalse(a.equals(null));
        assertEquals(a.hashCode(), a.hashCode());
    }

    @Test
    public void testToString() {
        assertNotNull(new StdDateFormat().toString());
    }

    // ==================== format() ====================

    @Test
    public void testFormatUTCDate() {
        Date d = date(2007, Calendar.DECEMBER, 25, 10, 30, 0, 0);
        StringBuffer sb = df.format(d, new StringBuffer(), new FieldPosition(0));
        assertEquals("2007-12-25T10:30:00.000+0000", sb.toString());
    }

    @Test
    public void testFormatWithColonInTimeZone() {
        StdDateFormat colonDf = df.withColonInTimeZone(true);
        Date d = date(2007, Calendar.DECEMBER, 25, 10, 30, 0, 0);
        StringBuffer sb = colonDf.format(d, new StringBuffer(), new FieldPosition(0));
        assertEquals("2007-12-25T10:30:00.000+00:00", sb.toString());
    }

    @Test
    public void testFormatNonZeroTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("GMT+05:30");
        StdDateFormat tzDf = new StdDateFormat().withTimeZone(tz);

        Date d = date(2007, Calendar.DECEMBER, 25, 10, 30, 0, 0);
        StringBuffer sb = tzDf.format(d, new StringBuffer(), new FieldPosition(0));
        assertEquals("2007-12-25T16:00:00.000+0530", sb.toString());
    }

    // ==================== parse() ====================

    @Test
    public void testParsePlainDate() throws Exception {
        assertDate(df.parse("2012-10-31"),
                2012, Calendar.OCTOBER, 31, 0, 0, 0, 0);
    }

    @Test
    public void testParseDateTimeNoSeconds() throws Exception {
        assertDate(df.parse("2012-10-31T12:13"),
                2012, Calendar.OCTOBER, 31, 12, 13, 0, 0);
    }

    @Test
    public void testParseDateTimeWithSeconds() throws Exception {
        assertDate(df.parse("2012-10-31T12:13:14"),
                2012, Calendar.OCTOBER, 31, 12, 13, 14, 0);
    }

    @Test
    public void testParseDateTimeWithFraction() throws Exception {
        assertDate(df.parse("2012-10-31T12:13:14.123"),
                2012, Calendar.OCTOBER, 31, 12, 13, 14, 123);
    }

    @Test
    public void testParseDateTimeWithSingleFraction() throws Exception {
        assertDate(df.parse("2012-10-31T12:13:14.1"),
                2012, Calendar.OCTOBER, 31, 12, 13, 14, 100);
    }

    @Test
    public void testParseUTCDateTimeZ() throws Exception {
        assertDate(df.parse("2012-10-31T12:13:14.123Z"),
                2012, Calendar.OCTOBER, 31, 12, 13, 14, 123);
    }

    @Test
    public void testParseOffset() throws Exception {
        assertDate(df.parse("2012-10-31T12:13:14.123+0530"),
                2012, Calendar.OCTOBER, 31, 6, 43, 14, 123);
    }

    @Test
    public void testParseOffsetWithColon() throws Exception {
        assertDate(df.parse("2012-10-31T12:13:14.123+05:30"),
                2012, Calendar.OCTOBER, 31, 6, 43, 14, 123);
    }

    @Test
    public void testParseTimestamp() throws Exception {
        long ts = 1351641600000L;
        assertEquals(new Date(ts), df.parse(String.valueOf(ts)));
    }

    @Test
    public void testParseNegativeTimestamp() throws Exception {
        assertEquals(new Date(-1000L), df.parse("-1000"));
    }

    @Test
    public void testParseRfc1123() throws Exception {
        Date d = df.parse("Tue, 03 Jun 2008 14:00:00 GMT");
        assertDate(d, 2008, Calendar.JUNE, 3, 14, 0, 0, 0);
    }

    @Test(expected = ParseException.class)
    public void testParseInvalidString() throws Exception {
        df.parse("not-a-date");
    }

    @Test(expected = NullPointerException.class)
    public void testParseNull() throws Exception {
        df.parse(null);
    }
}