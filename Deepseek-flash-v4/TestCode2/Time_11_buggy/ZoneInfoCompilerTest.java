package org.joda.time.tz;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.StringReader;

import org.junit.Test;

public class ZoneInfoCompilerTest {

    @Test
    public void testParseYear() {
        assertEquals(Integer.MIN_VALUE, ZoneInfoCompiler.parseYear("minimum", 0));
        assertEquals(Integer.MIN_VALUE, ZoneInfoCompiler.parseYear("min", 0));
        assertEquals(Integer.MIN_VALUE, ZoneInfoCompiler.parseYear("MIN", 0));
        assertEquals(Integer.MAX_VALUE, ZoneInfoCompiler.parseYear("maximum", 0));
        assertEquals(Integer.MAX_VALUE, ZoneInfoCompiler.parseYear("MAX", 0));
        assertEquals(1975, ZoneInfoCompiler.parseYear("only", 1975));
        assertEquals(2015, ZoneInfoCompiler.parseYear("2015", 0));
    }

    @Test(expected = NumberFormatException.class)
    public void testParseYearInvalid() {
        ZoneInfoCompiler.parseYear("not-a-year", 0);
    }

    @Test
    public void testParseMonth() {
        assertEquals(1, ZoneInfoCompiler.parseMonth("Jan"));
        assertEquals(3, ZoneInfoCompiler.parseMonth("Mar"));
        assertEquals(12, ZoneInfoCompiler.parseMonth("Dec"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseMonthInvalid() {
        ZoneInfoCompiler.parseMonth("NotAMonth");
    }

    @Test
    public void testParseDayOfWeek() {
        assertEquals(1, ZoneInfoCompiler.parseDayOfWeek("Mon"));
        assertEquals(5, ZoneInfoCompiler.parseDayOfWeek("Fri"));
        assertEquals(7, ZoneInfoCompiler.parseDayOfWeek("Sun"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDayOfWeekInvalid() {
        ZoneInfoCompiler.parseDayOfWeek("NotADay");
    }

    @Test
    public void testParseOptional() {
        assertEquals("-", ZoneInfoCompiler.parseOptional("-"));
        assertEquals("s", ZoneInfoCompiler.parseOptional("s"));
        assertEquals("", ZoneInfoCompiler.parseOptional(""));
        assertEquals("u", ZoneInfoCompiler.parseOptional("u"));
    }

    @Test(expected = NullPointerException.class)
    public void testParseOptionalNull() {
        ZoneInfoCompiler.parseOptional(null);
    }

    @Test
    public void testParseTime() {
        assertEquals(0, ZoneInfoCompiler.parseTime("00:00:00"));
        assertEquals(3_600_000, ZoneInfoCompiler.parseTime("01:00:00"));
        assertEquals(9_000_000, ZoneInfoCompiler.parseTime("02:30:00"));
        assertEquals(-3_600_000, ZoneInfoCompiler.parseTime("-01:00:00"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseTimeInvalid() {
        ZoneInfoCompiler.parseTime("not-a-time");
    }

    @Test
    public void testParseDataFileHandlesBlankAndCommentLines() throws Exception {
        ZoneInfoCompiler compiler = new ZoneInfoCompiler();
        String data = "\n# comment\n\n# another comment\n";

        try (BufferedReader reader = new BufferedReader(new StringReader(data))) {
            compiler.parseDataFile(reader);
        }
    }

    @Test
    public void testParseDataFileHandlesUnknownLine() throws Exception {
        ZoneInfoCompiler compiler = new ZoneInfoCompiler();
        String data = "garbage\n";

        try (BufferedReader reader = new BufferedReader(new StringReader(data))) {
            compiler.parseDataFile(reader);
        }
    }

    @Test
    public void testMainNoArgs() throws Exception {
        ZoneInfoCompiler.main(new String[0]);
    }
}