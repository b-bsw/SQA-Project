package org.apache.commons.lang.time;

import org.junit.Before;
import org.junit.Test;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import static org.junit.Assert.*;

public class FastDateFormatTest {

    private FastDateFormat fdf;
    private static final TimeZone UTC = TimeZone.getTimeZone("UTC");
    private static final Locale US = Locale.US;
    private Date sampleDate;

    @Before
    public void setUp() {
        fdf = FastDateFormat.getInstance("yyyy-MM-dd", UTC, US);
        Calendar cal = new GregorianCalendar(UTC, US);
        cal.set(2019, Calendar.JULY, 4, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        sampleDate = cal.getTime();
    }

    @Test
    public void testGetInstanceDefault() {
        assertNotNull(FastDateFormat.getInstance());
    }

    @Test
    public void testGetInstanceNullPattern() {
        try {
            FastDateFormat.getInstance((String) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetInstanceWithPattern() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy/MM/dd");
        assertEquals("yyyy/MM/dd", f.getPattern());
    }

    @Test
    public void testGetInstanceWithTimeZone() {
        FastDateFormat f = FastDateFormat.getInstance("HH:mm:ss", UTC);
        assertEquals(UTC, f.getTimeZone());
        assertTrue(f.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetInstanceWithLocale() {
        FastDateFormat f = FastDateFormat.getInstance("dd MMM yyyy", Locale.FRANCE);
        assertEquals(Locale.FRANCE, f.getLocale());
    }

    @Test
    public void testGetDateInstance() {
        FastDateFormat f = FastDateFormat.getDateInstance(FastDateFormat.SHORT, UTC, US);
        assertNotNull(f);
    }

    @Test
    public void testGetTimeInstance() {
        FastDateFormat f = FastDateFormat.getTimeInstance(FastDateFormat.MEDIUM, UTC, US);
        assertNotNull(f);
    }

    @Test
    public void testGetDateTimeInstance() {
        FastDateFormat f = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.MEDIUM, UTC, US);
        assertNotNull(f);
    }

    @Test
    public void testFormatDate() {
        String result = fdf.format(sampleDate);
        assertEquals("2019-07-04", result);
    }

    @Test
    public void testFormatCalendar() {
        Calendar cal = new GregorianCalendar(UTC, US);
        cal.setTime(sampleDate);
        String result = fdf.format(cal);
        assertEquals("2019-07-04", result);
    }

    @Test
    public void testFormatLong() {
        long millis = sampleDate.getTime();
        String result = fdf.format(millis);
        assertEquals("2019-07-04", result);
    }

    @Test
    public void testFormatObjectInvalidType() {
        try {
            fdf.format(new Object(), new StringBuffer(), null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testFormatObjectNull() {
        try {
            fdf.format(null, new StringBuffer(), null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testFormatBuffer() {
        StringBuffer buf = new StringBuffer();
        StringBuffer result = fdf.format(sampleDate, buf);
        assertSame(buf, result);
        assertEquals("2019-07-04", result.toString());
    }

    @Test
    public void testFormatCalendarWithForcedTimeZone() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss", TimeZone.getTimeZone("CST"), US);
        Calendar cal = new GregorianCalendar(UTC, US);
        cal.set(2019, Calendar.JULY, 4, 5, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        String result = f.format(cal);
        assertTrue(result.contains("2019-07-04 00:00:00") || result.contains("2019-07-04 01:00:00"));
    }

    @Test
    public void testParseObjectReturnsNull() {
        ParsePosition pos = new ParsePosition(0);
        Object result = fdf.parseObject("dummy", pos);
        assertNull(result);
        assertEquals(0, pos.getIndex());
        assertEquals(0, pos.getErrorIndex());
    }

    @Test
    public void testGetPattern() {
        assertEquals("yyyy-MM-dd", fdf.getPattern());
    }

    @Test
    public void testGetTimeZone() {
        assertEquals(UTC, fdf.getTimeZone());
    }

    @Test
    public void testGetTimeZoneOverridesCalendar() {
        assertTrue(fdf.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetLocale() {
        assertEquals(US, fdf.getLocale());
    }

    @Test
    public void testGetMaxLengthEstimate() {
        assertTrue(fdf.getMaxLengthEstimate() > 0);
    }

    @Test
    public void testEqualsSame() {
        FastDateFormat other = FastDateFormat.getInstance("yyyy-MM-dd", UTC, US);
        assertEquals(fdf, other);
    }

    @Test
    public void testEqualsDifferent() {
        FastDateFormat other = FastDateFormat.getInstance("yyyy/MM/dd", UTC, US);
        assertFalse(fdf.equals(other));
    }

    @Test
    public void testEqualsNotFastDateFormat() {
        assertFalse(fdf.equals("string"));
    }

    @Test
    public void testToString() {
        assertEquals("FastDateFormat[yyyy-MM-dd]", fdf.toString());
    }

    @Test
    public void testHashCode() {
        FastDateFormat same = FastDateFormat.getInstance("yyyy-MM-dd", UTC, US);
        assertEquals(fdf.hashCode(), same.hashCode());
    }

    @Test
    public void testFormatWithLiteralPattern() {
        FastDateFormat f = FastDateFormat.getInstance("'Date:'yyyy-MM-dd", UTC, US);
        String result = f.format(sampleDate);
        assertEquals("Date:2019-07-04", result);
    }

    @Test
    public void testFormatWithTwelveHour() {
        FastDateFormat f = FastDateFormat.getInstance("hh:mm a", UTC, US);
        Calendar cal = new GregorianCalendar(UTC, US);
        cal.set(2019, Calendar.JULY, 4, 23, 30, 0);
        String result = f.format(cal);
        assertTrue(result.equals("11:30 PM") || result.equals("11:30 pm"));
    }

    @Test
    public void testFormatWithTimeZoneNameShort() {
        FastDateFormat f = FastDateFormat.getInstance("z", UTC, US);
        String result = f.format(sampleDate);
        assertTrue(result.equals("UTC") || result.startsWith("GMT") || result.length() <= 4);
    }

    @Test
    public void testFormatWithTimeZoneNumberColon() {
        FastDateFormat f = FastDateFormat.getInstance("Z", UTC, US);
        String result = f.format(sampleDate);
        assertEquals("+0000", result);
    }

    @Test
    public void testFormatWithTwoDigitYear() {
        FastDateFormat f = FastDateFormat.getInstance("yy", UTC, US);
        String result = f.format(sampleDate);
        assertEquals("19", result);
    }

    @Test
    public void testFormatWithUnpaddedMonth() {
        FastDateFormat f = FastDateFormat.getInstance("M", UTC, US);
        Calendar cal = new GregorianCalendar(UTC, US);
        cal.set(2019, Calendar.OCTOBER, 15);
        String result = f.format(cal);
        assertEquals("10", result);
    }

    @Test
    public void testParsePatternInvalid() {
        try {
            FastDateFormat.getInstance("X", UTC, US);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }
}