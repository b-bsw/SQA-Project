package org.joda.time.format;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.ISOChronology;
import org.junit.Test;

public class DateTimeFormatterTest {

    private static final class StubPrinter implements DateTimePrinter {
        private final String text;

        private StubPrinter(String text) {
            this.text = text;
        }

        @Override
        public int estimatePrintedLength() {
            return text.length();
        }

        @Override
        public void printTo(StringBuffer buf, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) {
            buf.append(text);
        }

        @Override
        public void printTo(Writer out, long instant, Chronology chrono,
                int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {
            out.write(text);
        }

        @Override
        public void printTo(StringBuffer buf, ReadablePartial partial, Locale locale) {
            buf.append(text);
        }

        @Override
        public void printTo(Writer out, ReadablePartial partial, Locale locale) throws IOException {
            out.write(text);
        }
    }

    private static final class StubParser implements DateTimeParser {
        private final int result;
        private Integer offsetToSet;
        private DateTimeZone zoneToSet;

        private StubParser(int result) {
            this.result = result;
        }

        @Override
        public int estimateParsedLength() {
            return result < 0 ? 0 : result;
        }

        @Override
        public int parseInto(DateTimeParserBucket bucket, String text, int position) {
            if (offsetToSet != null) {
                bucket.setOffset(offsetToSet);
            }
            if (zoneToSet != null) {
                bucket.setZone(zoneToSet);
            }
            return result;
        }
    }

    @Test
    public void testPrinterAndParserAccessors() {
        StubPrinter printer = new StubPrinter("x");
        StubParser parser = new StubParser(0);
        DateTimeFormatter formatter = new DateTimeFormatter(printer, parser);

        assertTrue(formatter.isPrinter());
        assertTrue(formatter.isParser());
        assertSame(printer, formatter.getPrinter());
        assertSame(parser, formatter.getParser());
    }

    @Test
    public void testPrintFromReadableInstant() {
        DateTimeFormatter formatter = new DateTimeFormatter(new StubPrinter("abc"), null);
        assertEquals("abc", formatter.print(new DateTime(0L, DateTimeZone.UTC)));
    }

    @Test
    public void testPrintFromLong() {
        DateTimeFormatter formatter = new DateTimeFormatter(new StubPrinter("abc"), null);
        assertEquals("abc", formatter.print(0L));
    }

    @Test
    public void testPrintFromReadablePartial() {
        DateTimeFormatter formatter = new DateTimeFormatter(new StubPrinter("abc"), null);
        assertEquals("abc", formatter.print(new LocalDate(2020, 1, 1)));
    }

    @Test
    public void testPrintToWriterAndAppendable() throws Exception {
        DateTimeFormatter formatter = new DateTimeFormatter(new StubPrinter("abc"), null);

        StringWriter writer = new StringWriter();
        formatter.printTo(writer, new DateTime(0L, DateTimeZone.UTC));
        assertEquals("abc", writer.toString());

        writer = new StringWriter();
        formatter.printTo(writer, new LocalDate(2020, 1, 1));
        assertEquals("abc", writer.toString());

        StringBuilder builder = new StringBuilder();
        formatter.printTo((Appendable) builder, 0L);
        assertEquals("abc", builder.toString());

        builder = new StringBuilder();
        formatter.printTo(builder, new LocalDate(2020, 1, 1));
        assertEquals("abc", builder.toString());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testPrintMissingPrinterThrows() {
        DateTimeFormatter formatter = new DateTimeFormatter(null, new StubParser(0));
        formatter.print(new DateTime(0L, DateTimeZone.UTC));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintNullPartialThrows() {
        DateTimeFormatter formatter = new DateTimeFormatter(new StubPrinter("x"), null);
        formatter.print((ReadablePartial) null);
    }

    @Test
    public void testParseMillisSimple() {
        DateTimeFormatter formatter = new DateTimeFormatter(null, new StubParser(0));
        assertEquals(0L, formatter.parseMillis(""));
    }

    @Test
    public void testParseMillisRejectsIncompleteParse() {
        DateTimeFormatter formatter = new DateTimeFormatter(null, new StubParser(1));
        try {
            formatter.parseMillis("abc");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testParseIntoWithParsedOffset() {
        StubParser parser = new StubParser(0);
        parser.offsetToSet = 3600000;

        DateTimeFormatter formatter = new DateTimeFormatter(null, parser).withOffsetParsed();
        MutableDateTime instant = new MutableDateTime(0L, DateTimeZone.UTC);

        assertEquals(0, formatter.parseInto(instant, "", 0));
        assertEquals(DateTimeZone.forOffsetHours(1), instant.getChronology().getZone());
    }

    @Test
    public void testParseIntoWithParsedZone() {
        StubParser parser = new StubParser(0);
        parser.zoneToSet = DateTimeZone.forID("Europe/Paris");

        DateTimeFormatter formatter = new DateTimeFormatter(null, parser);
        MutableDateTime instant = new MutableDateTime(0L, DateTimeZone.UTC);

        formatter.parseInto(instant, "", 0);
        assertEquals(DateTimeZone.forID("Europe/Paris"), instant.getChronology().getZone());
    }

    @Test
    public void testParseIntoWithFormatterZoneOverridesParsedZone() {
        StubParser parser = new StubParser(0);
        parser.zoneToSet = DateTimeZone.forID("Europe/Paris");

        DateTimeFormatter formatter = new DateTimeFormatter(null, parser).withZone(DateTimeZone.UTC);
        MutableDateTime instant = new MutableDateTime(0L, DateTimeZone.forID("Europe/London"));

        formatter.parseInto(instant, "", 0);
        assertEquals(DateTimeZone.UTC, instant.getZone());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testParseMissingParserThrows() {
        DateTimeFormatter formatter = new DateTimeFormatter(new StubPrinter("x"), null);
        formatter.parseInto(new MutableDateTime(0L, DateTimeZone.UTC), "", 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseIntoNullInstantThrows() {
        DateTimeFormatter formatter = new DateTimeFormatter(null, new StubParser(0));
        formatter.parseInto(null, "x", 0);
    }

    @Test
    public void testWithLocale() {
        DateTimeFormatter formatter = new DateTimeFormatter(new StubPrinter("x"), new StubParser(0));

        assertSame(formatter, formatter.withLocale(null));

        DateTimeFormatter french = formatter.withLocale(Locale.FRENCH);
        assertNotSame(formatter, french);
        assertEquals(Locale.FRENCH, french.getLocale());
        assertSame(french, french.withLocale(Locale.FRENCH));
    }

    @Test
    public void testWithOffsetParsed() {
        DateTimeFormatter formatter = new DateTimeFormatter(null, new StubParser(0));

        DateTimeFormatter offsetParsed = formatter.withOffsetParsed();
        assertNotSame(formatter, offsetParsed);
        assertTrue(offsetParsed.isOffsetParsed());
        assertSame(offsetParsed, offsetParsed.withOffsetParsed());
    }

    @Test
    public void testWithChronology() {
        DateTimeFormatter formatter = new DateTimeFormatter(null, new StubParser(0));
        Chronology utc = ISOChronology.getInstanceUTC();

        DateTimeFormatter withChronology = formatter.withChronology(utc);
        assertNotSame(formatter, withChronology);
        assertSame(utc, withChronology.parseDateTime("").getChronology());
        assertSame(formatter, formatter.withChronology(null));
    }

    @Test
    public void testWithZoneUTCSetsZoneOnParse() {
        DateTimeFormatter formatter = new DateTimeFormatter(null, new StubParser(0)).withZoneUTC();
        assertEquals(DateTimeZone.UTC, formatter.parseDateTime("").getZone());
    }

    @Test
    public void testWithPivotYear() {
        DateTimeFormatter formatter = new DateTimeFormatter(null, new StubParser(0));

        assertSame(formatter, formatter.withPivotYear(null));

        DateTimeFormatter withPivot = formatter.withPivotYear(2020);
        assertNotSame(formatter, withPivot);
        assertEquals(Integer.valueOf(2020), withPivot.getPivotYear());
        assertSame(withPivot, withPivot.withPivotYear(2020));
    }

    @Test
    public void testWithDefaultYear() {
        DateTimeFormatter formatter = new DateTimeFormatter(null, new StubParser(0));

        DateTimeFormatter withYear = formatter.withDefaultYear(2021);
        assertNotSame(formatter, withYear);
        assertEquals(2021, withYear.getDefaultYear());
    }

    @Test
    public void testDefaults() {
        DateTimeFormatter formatter = new DateTimeFormatter(null, null);

        assertNull(formatter.getPrinter());
        assertNull(formatter.getParser());
        assertFalse(formatter.isPrinter());
        assertFalse(formatter.isParser());
        assertNull(formatter.getLocale());
        assertNull(formatter.getPivotYear());
        assertEquals(2000, formatter.getDefaultYear());
        assertFalse(formatter.isOffsetParsed());
    }
}