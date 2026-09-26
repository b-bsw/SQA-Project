package org.apache.commons.lang3.time;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Before;
import org.junit.Test;

public class FastDateParserTest {

    private static final TimeZone GMT = TimeZone.getTimeZone("GMT");
    private static final Locale US = Locale.US;

    private FastDateParser parser;

    @Before
    public void setUp() {
        parser = new FastDateParser("yyyy-MM-dd", GMT, US);
    }

    // Normal parse
    @Test
    public void testParseNormalDate() throws ParseException {
        Date date = parser.parse("2024-01-15");
        Calendar cal = Calendar.getInstance(GMT, US);
        cal.setTime(date);
        assertEquals(2024, cal.get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));
        assertEquals(15, cal.get(Calendar.DAY_OF_MONTH));
    }

    // Parse with ParsePosition
    @Test
    public void testParseWithParsePosition() {
        ParsePosition pos = new ParsePosition(0);
        Date date = parser.parse("2024-01-15", pos);
        assertNotNull(date);
        Calendar cal = Calendar.getInstance(GMT, US);
        cal.setTime(date);
        assertEquals(2024, cal.get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));
        assertEquals(15, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(10, pos.getIndex()); // length of "2024-01-15"
    }

    // parseObject returns Date
    @Test
    public void testParseObject() throws ParseException {
        Object obj = parser.parseObject("2024-01-15");
        assertTrue(obj instanceof Date);
        Calendar cal = Calendar.getInstance(GMT, US);
        cal.setTime((Date) obj);
        assertEquals(2024, cal.get(Calendar.YEAR));
    }

    // parse failure -> ParseException
    @Test(expected = ParseException.class)
    public void testParseFailure() throws ParseException {
        parser.parse("2024/01/15"); // separator mismatch
    }

    // Japanese Imperial locale special message
    @Test
    public void testParseJapaneseImperial() {
        FastDateParser jpParser = new FastDateParser("yyyy-MM-dd", GMT, FastDateParser.JAPANESE_IMPERIAL);
        try {
            jpParser.parse("1867-12-31"); // before 1868
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("does not support dates before 1868 AD"));
        }
    }

    // parse with ParsePosition that already at end
    @Test
    public void testParseWithPositionAtEnd() {
        ParsePosition pos = new ParsePosition(10);
        assertNull(parser.parse("2024-01-15", pos));
    }

    // Invalid pattern (no pattern letters)
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPattern() {
        new FastDateParser("'quoted'", GMT, US);
    }

    // equals and hashCode
    @Test
    public void testEqualsAndHashCode() {
        FastDateParser same = new FastDateParser("yyyy-MM-dd", GMT, US);
        FastDateParser diffPattern = new FastDateParser("dd/MM/yyyy", GMT, US);
        FastDateParser diffTz = new FastDateParser("yyyy-MM-dd", TimeZone.getTimeZone("PST"), US);
        FastDateParser diffLocale = new FastDateParser("yyyy-MM-dd", GMT, Locale.FRANCE);

        assertEquals(parser, same);
        assertEquals(parser.hashCode(), same.hashCode());

        assertNotEquals(parser, diffPattern);
        assertNotEquals(parser, diffTz);
        assertNotEquals(parser, diffLocale);
        assertNotEquals(parser, null);
        assertNotEquals(parser, new Object());
    }

    // toString
    @Test
    public void testToString() {
        String expected = "FastDateParser[yyyy-MM-dd,en_US,GMT]";
        // locale display may differ; we check contains key parts
        String str = parser.toString();
        assertTrue(str.contains("yyyy-MM-dd"));
        assertTrue(str.contains("GMT"));
        assertTrue(str.contains("en_US") || str.contains("English"));
    }

    // getters
    @Test
    public void testGetters() {
        assertEquals("yyyy-MM-dd", parser.getPattern());
        assertEquals(GMT, parser.getTimeZone());
        assertEquals(US, parser.getLocale());
    }

    // adjustYear (package-private, accessible)
    @Test
    public void testAdjustYear() {
        // parser's thisYear is 2024 (or current year)
        // trial = twoDigitYear + (thisYear - thisYear%100)
        // if trial < thisYear+20 -> return trial else trial-100
        // e.g., twoDigitYear = 23 -> trial = 2023, return 2023
        // twoDigitYear = 99 -> trial = 2099, >= 2044? false -> return 2099? wait 2099+20=2119? condition trial < thisYear+20
        // thisYear=2024 -> thisYear+20=2044, trial=2099 ->2099>=2044 -> return 2099-100=1999

        // Since adjustYear is package-private, we can call it directly
        int thisYear = Calendar.getInstance(GMT, US).get(Calendar.YEAR);
        int centuryBase = thisYear - (thisYear % 100);

        // test cases
        // case 1: twoDigitYear = 23 -> trial=centuryBase+23, expected = trial (if trial < thisYear+20)
        int trial1 = centuryBase + 23;
        int expected1 = (trial1 < thisYear + 20) ? trial1 : trial1 - 100;
        assertEquals(expected1, parser.adjustYear(23));

        // case 2: twoDigitYear = 99 -> trial=centuryBase+99
        int trial2 = centuryBase + 99;
        int expected2 = (trial2 < thisYear + 20) ? trial2 : trial2 - 100;
        assertEquals(expected2, parser.adjustYear(99));

        // case 3: twoDigitYear = 0 -> trial=centuryBase+0
        int trial3 = centuryBase;
        int expected3 = (trial3 < thisYear + 20) ? trial3 : trial3 - 100;
        assertEquals(expected3, parser.adjustYear(0));
    }

    // isNextNumber (package-private) – we test through parse behavior
    // but we can access directly
    @Test
    public void testIsNextNumber() {
        // For pattern "yyyy-MM-dd", after first field 'yyyy', nextStrategy is for '-'? Actually '-'
        // is CopyQuotedStrategy => isNumber returns false if first char is quote? In CopyQuotedStrategy isNumber checks
        // first char – if '\'' then char at 1; for '-' it is not digit => false
        // We can create a parser where nextStrategy is number: e.g., "ddMM" has 'd' then 'M'? Actually after 'dd' next is 'MM'
        // but 'M' with length>=3 is TEXT_MONTH_STRATEGY (isNumber false), with length<3 is NUMBER_MONTH_STRATEGY (isNumber true).
        // So use "ddMMyy" – after 'dd' (number) next is 'MM' (number, because length<3) -> isNextNumber should be true
        FastDateParser p = new FastDateParser("ddMMyy", GMT, US);
        assertTrue(p.isNextNumber());
    }

    // getFieldWidth (package-private)
    @Test
    public void testGetFieldWidth() {
        FastDateParser p = new FastDateParser("yy", GMT, US);
        assertEquals(2, p.getFieldWidth());
    }

    // Parse with abbreviated year (2-digit)
    @Test
    public void testParseAbbreviatedYear() throws ParseException {
        FastDateParser p = new FastDateParser("yy-MM-dd", GMT, US);
        Date date = p.parse("23-01-15");
        Calendar cal = Calendar.getInstance(GMT, US);
        cal.setTime(date);
        int expectedYear;
        int thisYear = Calendar.getInstance(GMT, US).get(Calendar.YEAR);
        int trial = 23 + thisYear - (thisYear % 100);
        if (trial < thisYear + 20) {
            expectedYear = trial;
        } else {
            expectedYear = trial - 100;
        }
        assertEquals(expectedYear, cal.get(Calendar.YEAR));
    }

    // Parse with time zone symbol (e.g., z)
    @Test
    public void testParseTimeZone() throws ParseException {
        FastDateParser p = new FastDateParser("yyyy-MM-dd z", GMT, US);
        Date date = p.parse("2024-01-15 GMT");
        assertNotNull(date);
    }

    // Parse with AM/PM
    @Test
    public void testParseAmPm() throws ParseException {
        FastDateParser p = new FastDateParser("hh:mm a", GMT, US);
        Date date = p.parse("02:30 PM");
        Calendar cal = Calendar.getInstance(GMT, US);
        cal.setTime(date);
        assertEquals(14, cal.get(Calendar.HOUR_OF_DAY)); // 2 PM -> 14
        assertEquals(30, cal.get(Calendar.MINUTE));
    }

    // Parse with month text
    @Test
    public void testParseMonthText() throws ParseException {
        FastDateParser p = new FastDateParser("MMMM d, yyyy", GMT, US);
        Date date = p.parse("January 15, 2024");
        Calendar cal = Calendar.getInstance(GMT, US);
        cal.setTime(date);
        assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));
        assertEquals(15, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(2024, cal.get(Calendar.YEAR));
    }

    // Parse with quoted literal
    @Test
    public void testParseQuotedLiteral() throws ParseException {
        FastDateParser p = new FastDateParser("yyyy' year' MM' month' dd' day'", GMT, US);
        Date date = p.parse("2024 year 01 month 15 day");
        Calendar cal = Calendar.getInstance(GMT, US);
        cal.setTime(date);
        assertEquals(2024, cal.get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));
        assertEquals(15, cal.get(Calendar.DAY_OF_MONTH));
    }

    // Parse with different locale (French)
    @Test
    public void testParseWithLocale() throws ParseException {
        FastDateParser p = new FastDateParser("MMMM yyyy", GMT, Locale.FRANCE);
        Date date = p.parse("janvier 2024");
        Calendar cal = Calendar.getInstance(GMT, Locale.FRANCE);
        cal.setTime(date);
        assertEquals(Calendar.JANUARY, cal.get(Calendar.MONTH));
        assertEquals(2024, cal.get(Calendar.YEAR));
    }

    // Edge: empty string (should throw ParseException)
    @Test(expected = ParseException.class)
    public void testParseEmptyString() throws ParseException {
        parser.parse("");
    }

    // Edge: string longer than pattern after parse position
    @Test
    public void testParsePartialMatch() {
        ParsePosition pos = new ParsePosition(0);
        Date date = parser.parse("2024-01-15 extra", pos);
        assertNotNull(date);
        assertEquals(10, pos.getIndex()); // only matched first 10 chars
    }
}