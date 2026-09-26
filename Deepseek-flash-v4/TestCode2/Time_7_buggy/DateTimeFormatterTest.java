package org.joda.time.format;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.ISOChronology;

public class DateTimeFormatterTest {

    @Test
    public void testGettersAndDefaultValues() {
        DateTimeFormatter f = new DateTimeFormatter(null, null);
        assertFalse(f.isPrinter());
        assertFalse(f.isParser());
        assertNull(f.getPrinter());
        assertNull(f.getParser());
        assertNull(f.getLocale());
        assertFalse(f.isOffsetParsed());
        assertNull(f.getChronology());
        assertNull(f.getChronolgy());
        assertNull(f.getZone());
        assertNull(f.getPivotYear());
        assertEquals(2000, f.getDefaultYear());
    }

    @Test
    public void testWithMethodsReturnNewInstancesWhenChanged() {
        DateTimeFormatter f = new DateTimeFormatter(null, null);

        assertSame(f, f.withLocale(null));
        DateTimeFormatter l = f.withLocale(Locale.US);
        assertNotSame(f, l);
        assertEquals(Locale.US, l.getLocale());
        assertSame(l, l.withLocale(Locale.US));
        assertNotSame(l, l.withLocale(Locale.UK));

        assertSame(f, f.withChronology(null));
        Chronology isoUtc = ISOChronology.getInstanceUTC();
        DateTimeFormatter c = f.withChronology(isoUtc);
        assertNotSame(f, c);
        assertSame(isoUtc, c.getChronology());
        assertSame(c, c.withChronology(isoUtc));

        assertSame(f, f.withPivotYear(null));
        DateTimeFormatter p = f.withPivotYear(2015);
        assertNotSame(f, p);
        assertEquals(Integer.valueOf(2015), p.getPivotYear());
        assertSame(p, p.withPivotYear(2015));
        assertNotSame(p, p.withPivotYear(Integer.valueOf(2016)));

        DateTimeFormatter d = f.withDefaultYear(1984);
        assertNotSame(f, d);
        assertEquals(1984, d.getDefaultYear());
    }

    @Test
    public void testWithOffsetParsedAndZone() {
        DateTimeFormatter f = new DateTimeFormatter(null, null);

        DateTimeFormatter o = f.withOffsetParsed();
        assertNotSame(f, o);
        assertTrue(o.isOffsetParsed());
        assertNull(o.getZone());
        assertSame(o, o.withOffsetParsed());

        DateTimeFormatter z = f.withZone(DateTimeZone.UTC);
        assertNotSame(f, z);
        assertSame(DateTimeZone.UTC, z.getZone());
        assertFalse(z.isOffsetParsed());
        assertSame(z, z.withZone(DateTimeZone.UTC));

        DateTimeFormatter utc = f.withZoneUTC();
        assertSame(DateTimeZone.UTC, utc.getZone());
    }

    @Test
    public void testPrintMethods() throws Exception {
        DateTimeFormatter f = new DateTimeFormatter(new TestPrinter(), null);
        assertTrue(f.isPrinter());
        assertNotNull(f.getPrinter());
        assertFalse(f.isParser());
        assertNull(f.getParser());

        ReadableInstant instant = new DateTime(1234L, DateTimeZone.UTC);
        ReadablePartial partial = new LocalDate(2010, 1, 1);

        assertEquals("test", f.print(instant));
        assertEquals("test", f.print(1234L));
        assertEquals("test", f.print(partial));

        StringBuffer sb = new StringBuffer();
        f.printTo(sb, instant);
        assertEquals("test", sb.toString());

        StringBuffer sb2 = new StringBuffer();
        f.printTo(sb2, 1234L);
        assertEquals("test", sb2.toString());

        StringWriter sw = new StringWriter();
        f.printTo(sw, instant);
        assertEquals("test", sw.toString());

        StringWriter sw2 = new StringWriter();
        f.printTo(sw2, 1234L);
        assertEquals("test", sw2.toString());

        StringBuilder app = new StringBuilder();
        f.printTo(app, instant);
        assertEquals("test", app.toString());

        StringBuilder app2 = new StringBuilder();
        f.printTo(app2, 1234L);
        assertEquals("test", app2.toString());

        StringBuffer sb3 = new StringBuffer();
        f.printTo(sb3, partial);
        assertEquals("test", sb3.toString());

        StringWriter sw3 = new StringWriter();
        f.printTo(sw3, partial);
        assertEquals("test", sw3.toString());

        StringBuilder app3 = new StringBuilder();
        f.printTo(app3, partial);
        assertEquals("test", app3.toString());

        DateTimeFormatter chronoPrinter = new DateTimeFormatter(new TestPrinter(), null)
                .withChronology(ISOChronology.getInstanceUTC());
        assertEquals("test", chronoPrinter.print(0L));
    }

    @Test
    public void testPrintNullAndUnsupported() throws Exception {
        DateTimeFormatter noPrinter = new DateTimeFormatter(null, null);
        try {
            noPrinter.print(0L);
            fail("Printing without printer should fail");
        } catch (UnsupportedOperationException e) {
            // expected
        }
        try {
            noPrinter.printTo(new StringBuffer(), 0L);
            fail("Printing without printer should fail");
        } catch (UnsupportedOperationException e) {
            // expected
        }

        DateTimeFormatter fp = new DateTimeFormatter(new TestPrinter(), null);
        try {
            fp.printTo(new StringBuffer(), (ReadablePartial) null);
            fail("Null partial should fail");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            fp.printTo(new StringWriter(), (ReadablePartial) null);
            fail("Null partial should fail");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            fp.printTo(new StringBuilder(), (ReadablePartial) null);
            fail("Null partial should fail");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            fp.print((ReadablePartial) null);
            fail("Null partial should fail");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testPrintOverflowZoneAdjustment() {
        RecordingPrinter printer = new RecordingPrinter();
        DateTimeFormatter f = new DateTimeFormatter(printer, null)
                .withZone(DateTimeZone.forOffsetHours(1));

        StringBuffer overflowBuf = new StringBuffer();
        f.printTo(overflowBuf, Long.MAX_VALUE);
        assertEquals("test", overflowBuf.toString());
        assertEquals(0, printer.lastOffset);
        assertSame(DateTimeZone.UTC, printer.lastZone);

        printer.lastOffset = -1;
        printer.lastZone = null;
        StringBuffer normalBuf = new StringBuffer();
        f.printTo(normalBuf, 0L);
        assertEquals("test", normalBuf.toString());
        assertEquals(3600000, printer.lastOffset);
        assertEquals(DateTimeZone.forOffsetHours(1), printer.lastZone);
    }

    @Test
    public void testParseMillisSuccessAndFailures() {
        DateTimeFormatter ok = new DateTimeFormatter(null, new TestParser(3));
        assertTrue(ok.isParser());
        assertNotNull(ok.getParser());
        assertFalse(ok.isPrinter());
        assertNull(ok.getPrinter());
        assertEquals(0L, ok.parseMillis("abc"));

        DateTimeFormatter emptyOk = new DateTimeFormatter(null, new TestParser(0));
        assertEquals(0L, emptyOk.parseMillis(""));

        DateTimeFormatter incomplete = new DateTimeFormatter(null, new TestParser(0));
        try {
            incomplete.parseMillis("abc");
            fail("Incomplete parse should fail");
        } catch (IllegalArgumentException e) {
            // expected
        }

        DateTimeFormatter err = new DateTimeFormatter(null, new TestParser(-1));
        try {
            err.parseMillis("abc");
            fail("Negative parse result should fail");
        } catch (IllegalArgumentException e) {
            // expected
        }

        DateTimeFormatter noParser = new DateTimeFormatter(new TestPrinter(), null);
        try {
            noParser.parseMillis("abc");
            fail("Parsing without parser should fail");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testParseLocalDateAndTime() {
        DateTimeFormatter f = new DateTimeFormatter(null, new TestParser(4));

        assertEquals(new LocalDate(1970, 1, 1), f.parseLocalDate("abcd"));
        assertEquals(new LocalTime(0, 0), f.parseLocalTime("abcd"));
        assertEquals(new LocalDateTime(0L, DateTimeZone.UTC), f.parseLocalDateTime("abcd"));
    }

    @Test
    public void testParseDateTimeAndMutableDateTime() {
        DateTimeFormatter f = new DateTimeFormatter(null, new TestParser(4));

        DateTime dt = f.parseDateTime("abcd");
        assertEquals(0L, dt.getMillis());

        MutableDateTime mdt = f.parseMutableDateTime("abcd");
        assertEquals(0L, mdt.getMillis());

        DateTimeFormatter err = new DateTimeFormatter(null, new TestParser(-1));
        try {
            err.parseDateTime("abcd");
            fail("Parse error should fail");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            err.parseMutableDateTime("abcd");
            fail("Parse error should fail");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testParseIntoBasicAndNull() {
        DateTimeFormatter f = new DateTimeFormatter(null, new TestParser(4));

        MutableDateTime instant = new MutableDateTime(1000L, DateTimeZone.UTC);
        assertEquals(4, f.parseInto(instant, "abcd", 0));
        assertEquals(1000L, instant.getMillis());
        assertEquals(DateTimeZone.UTC, instant.getZone());

        try {
            f.parseInto(null, "abcd", 0);
            fail("Null instant should fail");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testParseIntoZoneBranches() {
        DateTimeFormatter offsetFmt = new DateTimeFormatter(null, new ZoneSettingParser(3600000, null))
                .withOffsetParsed();
        MutableDateTime offsetInstant = new MutableDateTime(0L, DateTimeZone.UTC);
        offsetFmt.parseInto(offsetInstant, "x", 0);
        assertEquals(DateTimeZone.forOffsetHours(1), offsetInstant.getZone());

        DateTimeFormatter zoneFmt = new DateTimeFormatter(null, new ZoneSettingParser(null, DateTimeZone.forOffsetHours(2)));
        MutableDateTime zoneInstant = new MutableDateTime(0L, DateTimeZone.UTC);
        zoneFmt.parseInto(zoneInstant, "x", 0);
        assertEquals(DateTimeZone.forOffsetHours(2), zoneInstant.getZone());

        DateTimeFormatter overrideFmt = zoneFmt.withZone(DateTimeZone.forOffsetHours(3));
        MutableDateTime overrideInstant = new MutableDateTime(0L, DateTimeZone.UTC);
        overrideFmt.parseInto(overrideInstant, "x", 0);
        assertEquals(DateTimeZone.forOffsetHours(3), overrideInstant.getZone());
    }

    @Test
    public void testParseDateTimeZoneBranches() {
        DateTimeFormatter offsetFmt = new DateTimeFormatter(null, new ZoneSettingParser(3600000, null))
                .withOffsetParsed();
        assertEquals(DateTimeZone.forOffsetHours(1), offsetFmt.parseDateTime("x").getZone());

        DateTimeFormatter zoneFmt = new DateTimeFormatter(null, new ZoneSettingParser(null, DateTimeZone.forOffsetHours(2)));
        assertEquals(DateTimeZone.forOffsetHours(2), zoneFmt.parseDateTime("x").getZone());

        DateTimeFormatter overrideFmt = zoneFmt.withZone(DateTimeZone.forOffsetHours(3));
        assertEquals(DateTimeZone.forOffsetHours(3), overrideFmt.parseDateTime("x").getZone());
    }

    private static class TestPrinter implements DateTimePrinter {
        @Override
        public int estimatePrintedLength() {
            return 4;
        }

        @Override
        public void printTo(StringBuffer buf, long instant, Chronology chrono,
                            int displayOffset, DateTimeZone displayZone, Locale locale) {
            buf.append("test");
        }

        @Override
        public void printTo(Writer out, long instant, Chronology chrono,
                            int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {
            out.write("test");
        }

        @Override
        public void printTo(StringBuffer buf, ReadablePartial partial, Locale locale) {
            buf.append("test");
        }

        @Override
        public void printTo(Writer out, ReadablePartial partial, Locale locale) throws IOException {
            out.write("test");
        }
    }

    private static class RecordingPrinter extends TestPrinter {
        int lastOffset;
        DateTimeZone lastZone;
        Chronology lastChronology;

        @Override
        public void printTo(StringBuffer buf, long instant, Chronology chrono,
                            int displayOffset, DateTimeZone displayZone, Locale locale) {
            lastOffset = displayOffset;
            lastZone = displayZone;
            lastChronology = chrono;
            super.printTo(buf, instant, chrono, displayOffset, displayZone, locale);
        }
    }

    private static class TestParser implements DateTimeParser {
        private final int result;

        TestParser(int result) {
            this.result = result;
        }

        @Override
        public int estimateParsedLength() {
            return 0;
        }

        @Override
        public int parseInto(DateTimeParserBucket bucket, String text, int position) {
            return result;
        }
    }

    private static class ZoneSettingParser implements DateTimeParser {
        private final Integer offset;
        private final DateTimeZone zone;

        ZoneSettingParser(Integer offset, DateTimeZone zone) {
            this.offset = offset;
            this.zone = zone;
        }

        @Override
        public int estimateParsedLength() {
            return 0;
        }

        @Override
        public int parseInto(DateTimeParserBucket bucket, String text, int position) {
            if (offset != null) {
                bucket.setOffset(offset);
            }
            if (zone != null) {
                bucket.setZone(zone);
            }
            return text.length();
        }
    }
}