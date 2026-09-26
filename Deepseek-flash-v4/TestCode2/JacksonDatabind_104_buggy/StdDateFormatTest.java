import static org.junit.Assert.*;

import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
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

    private static Date utc(int year, int month, int day,
                            int hour, int minute, int second, int millis) {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.US);
        cal.clear();
        cal.set(year, month - 1, day, hour, minute, second);
        cal.set(Calendar.MILLISECOND, millis);
        return cal.getTime();
    }

    private static String format(StdDateFormat fmt, Date date) {
        return fmt.format(date, new StringBuffer(), new FieldPosition(0)).toString();
    }

    @Test
    public void testParseIso8601Zulu() throws Exception {
        Date expected = utc(2020, 1, 31, 12, 34, 56, 789);
        assertEquals(expected, df.parse("2020-01-31T12:34:56.789Z"));
    }

    @Test
    public void testParseIso8601WithOffset() throws Exception {
        Date expected = utc(2020, 1, 31, 10, 34, 56, 0);
        assertEquals(expected, df.parse("2020-01-31T12:34:56.000+02:00"));
    }

    @Test
    public void testParseDateOnly() throws Exception {
        Date expected = utc(2020, 1, 31, 0, 0, 0, 0);
        assertEquals(expected, df.parse("2020-01-31"));
    }

    @Test
    public void testParseRfc1123() throws Exception {
        Date expected = utc(2020, 1, 31, 12, 34, 56, 0);
        assertEquals(expected, df.parse("Fri, 31 Jan 2020 12:34:56 GMT"));
    }

    @Test
    public void testParseTimestamp() throws Exception {
        assertEquals(new Date(1600000000000L), df.parse("1600000000000"));
        assertEquals(new Date(0L), df.parse("0"));
        assertEquals(new Date(-1L), df.parse("-1"));
    }

    @Test(expected = ParseException.class)
    public void testParseInvalid() throws Exception {
        df.parse("not-a-date");
    }

    @Test
    public void testParseWithParsePosition() throws Exception {
        ParsePosition pos = new ParsePosition(0);
        Date parsed = df.parse("2020-01-31", pos);
        assertNotNull(parsed);
        assertTrue(pos.getIndex() > 0);
        assertEquals(-1, pos.getErrorIndex());

        pos = new ParsePosition(0);
        assertNull(df.parse("not-a-date", pos));
        assertTrue(pos.getErrorIndex() >= 0);
    }

    @Test(expected = NullPointerException.class)
    public void testParseNullRejected() throws Exception {
        df.parse((String) null);
    }

    @Test
    public void testParseEmptyRejected() {
        try {
            df.parse("   ");
            fail("Expected empty input to be rejected");
        } catch (ParseException e) {
            // expected
        } catch (RuntimeException e) {
            // Different JDK/parser versions may expose runtime exceptions here
        }
    }

    @Test
    public void testFormatUtc() {
        String out = format(df, new Date(0));
        assertEquals("1970-01-01T00:00:00.000+0000", out);
    }

    @Test
    public void testFormatWithPositiveOffset() {
        StdDateFormat f = new StdDateFormat()
                .withTimeZone(TimeZone.getTimeZone("GMT+05:30"))
                .withColonInTimeZone(true);

        String out = format(f, new Date(0));
        assertEquals("1970-01-01T05:30:00.000+05:30", out);
    }

    @Test
    public void testWithTimeZone() {
        TimeZone utc = TimeZone.getTimeZone("UTC");
        assertSame(df, df.withTimeZone(utc));

        TimeZone zone = TimeZone.getTimeZone("America/Los_Angeles");
        StdDateFormat changed = df.withTimeZone(zone);
        assertNotSame(df, changed);
        assertEquals(zone, changed.getTimeZone());
    }

    @Test
    public void testWithLocale() {
        StdDateFormat changed = df.withLocale(Locale.FRANCE);
        assertNotSame(df, changed);
    }

    @Test
    public void testWithLenient() {
        assertTrue(df.isLenient());

        StdDateFormat strict = df.withLenient(false);
        assertNotSame(df, strict);
        assertFalse(strict.isLenient());
    }

    @Test
    public void testSetTimeZoneAndLenient() {
        TimeZone zone = TimeZone.getTimeZone("GMT+03:00");
        df.setTimeZone(zone);
        assertEquals("GMT+03:00", df.getTimeZone().getID());

        df.setLenient(false);
        assertFalse(df.isLenient());

        df.setLenient(true);
        assertTrue(df.isLenient());
    }

    @Test
    public void testWithColonInTimeZone() {
        StdDateFormat changed = df.withColonInTimeZone(true);
        assertNotSame(df, changed);
        assertTrue(changed.isColonIncludedInTimeZone());
        assertFalse(df.isColonIncludedInTimeZone());
    }

    @Test
    public void testClone() throws Exception {
        StdDateFormat copy = (StdDateFormat) df.clone();
        assertNotSame(df, copy);
        assertEquals(df.getTimeZone(), copy.getTimeZone());
        assertEquals(df.isLenient(), copy.isLenient());
    }

    @Test
    public void testEqualsAndHashCode() {
        assertTrue(df.equals(df));
        assertFalse(df.equals(null));
        assertFalse(df.equals(""));
        assertEquals(System.identityHashCode(df), df.hashCode());
    }

    @Test
    public void testToString() {
        String text = df.toString();
        assertTrue(text.contains("timezone:"));
        assertTrue(text.contains("locale:"));
        assertTrue(text.contains("lenient:"));
    }
}