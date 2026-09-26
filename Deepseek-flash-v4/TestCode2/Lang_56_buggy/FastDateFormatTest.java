package org.apache.commons.lang.time;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;

public class FastDateFormatTest {

    private static final TimeZone GMT = TimeZone.getTimeZone("GMT");
    private static final Locale US = Locale.US;

    @Test
    public void testGetInstanceDefaults() {
        FastDateFormat format = FastDateFormat.getInstance();
        assertNotNull(format);
        assertNotNull(format.getPattern());
        assertEquals(Locale.getDefault(), format.getLocale());
        assertEquals(TimeZone.getDefault(), format.getTimeZone());
        assertFalse(format.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetInstanceWithPatternTimeZoneAndLocale() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd", GMT, US);
        assertEquals("yyyy-MM-dd", format.getPattern());
        assertEquals(GMT, format.getTimeZone());
        assertEquals(US, format.getLocale());
        assertTrue(format.getTimeZoneOverridesCalendar());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstanceNullPattern() {
        FastDateFormat.getInstance(null);
    }

    @Test
    public void testFormatDateLongAndStringBuffer() {
        FastDateFormat format = FastDateFormat.getInstance("dd/MM/yyyy HH:mm:ss", GMT, US);
        String expected = "01/01/1970 00:00:00";
        assertEquals(expected, format.format(new Date(0L)));
        assertEquals(expected, format.format(0L));
        StringBuffer buf = new StringBuffer();
        assertSame(buf, format.format(0L, buf));
        assertEquals(expected, buf.toString());
    }

    @Test
    public void testFormatCalendarForcesTimeZone() {
        FastDateFormat format = FastDateFormat.getInstance("dd/MM/yyyy HH:mm:ss", GMT, US);
        Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("America/New_York"));
        calendar.setTimeInMillis(0L);
        assertEquals("01/01/1970 00:00:00", format.format(calendar));
    }

    @Test
    public void testFormatCalendarUsesCalendarTimeZoneWhenNotForced() {
        FastDateFormat format = FastDateFormat.getInstance("dd/MM/yyyy HH:mm:ss", null, US);
        Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("America/New_York"));
        calendar.setTimeInMillis(0L);
        assertEquals("31/12/1969 19:00:00", format.format(calendar));
    }

    @Test
    public void testFormatObjectAcceptsLongAndRejectsInvalid() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy", GMT, US);
        StringBuffer buf = new StringBuffer();
        assertSame(buf, format.format(new Long(0L), buf, new FieldPosition(0)));
        assertEquals("1970", buf.toString());
        try {
            format.format(new Object(), new StringBuffer(), new FieldPosition(0));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
        try {
            format.format((Object) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("<null>"));
        }
    }

    @Test
    public void testParseObjectIsUnsupported() {
        FastDateFormat format = FastDateFormat.getInstance("yyyy", GMT, US);
        ParsePosition pos = new ParsePosition(3);
        assertNull(format.parseObject("abc", pos));
        assertEquals(0, pos.getIndex());
        assertEquals(0, pos.getErrorIndex());
    }

    @Test
    public void testFormatEmptyPattern() {
        FastDateFormat format = FastDateFormat.getInstance("", GMT, US);
        assertEquals("", format.format(new Date(0L)));
        assertEquals(0, format.getMaxLengthEstimate());
    }

    @Test
    public void testFormatTextAndNumberFields() {
        FastDateFormat format = FastDateFormat.getInstance("EEE, MMM d, yyyy HH:mm:ss.SSS", GMT, US);
        assertEquals("Thu, Jan 1, 1970 00:00:00.000", format.format(new Date(0L)));
    }

    @Test
    public void testMonthNameLengthBranches() {
        FastDateFormat longMonth = FastDateFormat.getInstance("MMMM yyyy", GMT, US);
        assertEquals("January 1970", longMonth.format(new Date(0L)));
        FastDateFormat shortMonth = FastDateFormat.getInstance("MMM yyyy", GMT, US);
        assertEquals("Jan 1970", shortMonth.format(new Date(0L)));
    }

    @Test
    public void testTwoDigitYearAndSingleDigitMonth() {
        FastDateFormat year = FastDateFormat.getInstance("yy", GMT, US);
        assertEquals("70", year.format(new Date(0L)));
        FastDateFormat month = FastDateFormat.getInstance("M", GMT, US);
        assertEquals("1", month.format(new Date(0L)));
    }

    @Test
    public void testLiteralCharactersAndString() {
        FastDateFormat charLiteral = FastDateFormat.getInstance("yyyy'T'MM", GMT, US);
        assertEquals("1970T01", charLiteral.format(new Date(0L)));
        FastDateFormat stringLiteral = FastDateFormat.getInstance("yyyy'--'MM", GMT, US);
        assertEquals("1970--01", stringLiteral.format(new Date(0L)));
    }

    @Test
    public void testTwelveHourFieldMidnight() {
        FastDateFormat format = FastDateFormat.getInstance("hh:mm a", GMT, US);
        assertEquals("12:00 AM", format.format(new Date(0L)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalPatternComponent() {
        FastDateFormat.getInstance("q", GMT, US);
    }

    @Test
    public void testStyleInstanceMethods() {
        FastDateFormat date = FastDateFormat.getDateInstance(FastDateFormat.SHORT, GMT, US);
        assertNotNull(date);
        assertEquals(US, date.getLocale());
        assertTrue(date.getTimeZoneOverridesCalendar());

        FastDateFormat time = FastDateFormat.getTimeInstance(FastDateFormat.MEDIUM, GMT, US);
        assertNotNull(time);
        assertEquals(US, time.getLocale());

        FastDateFormat dateTime = FastDateFormat.getDateTimeInstance(
                FastDateFormat.SHORT, FastDateFormat.MEDIUM, GMT, US);
        assertNotNull(dateTime);
        assertEquals(US, dateTime.getLocale());
    }

    @Test
    public void testEqualsHashCodeAndToString() {
        FastDateFormat a = FastDateFormat.getInstance("yyyy", GMT, US);
        FastDateFormat b = FastDateFormat.getInstance("yyyy", GMT, US);
        FastDateFormat c = FastDateFormat.getInstance("yy", GMT, US);
        assertTrue(a.equals(b));
        assertFalse(a.equals(c));
        assertFalse(a.equals(null));
        assertFalse(a.equals("yyyy"));
        assertEquals(a.hashCode(), b.hashCode());
        assertEquals("FastDateFormat[yyyy]", a.toString());
    }
}