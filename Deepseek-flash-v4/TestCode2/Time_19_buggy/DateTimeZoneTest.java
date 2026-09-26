package org.joda.time;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.Set;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Test;

public class DateTimeZoneTest {

    private static final long HOUR = 3600_000L;
    private static final long MINUTE = 60_000L;

    private final DateTimeZone.Provider originalProvider = DateTimeZone.getProvider();

    @After
    public void tearDown() {
        DateTimeZone.setProvider(originalProvider);
    }

    @Test
    public void testGetDefault() {
        assertNotNull(DateTimeZone.getDefault());
    }

    @Test
    public void testSetDefault() {
        DateTimeZone original = DateTimeZone.getDefault();
        try {
            DateTimeZone.setDefault(DateTimeZone.UTC);
            assertSame(DateTimeZone.UTC, DateTimeZone.getDefault());
        } finally {
            DateTimeZone.setDefault(original);
        }
    }

    @Test
    public void testSetDefault_Null() {
        try {
            DateTimeZone.setDefault(null);
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testForID() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("+00:00"));

        DateTimeZone zone = DateTimeZone.forID("+01:30");
        assertEquals("+01:30", zone.getID());
        assertEquals(90L * MINUTE, zone.getOffset(0L));
        assertTrue(zone.isFixed());
    }

    @Test
    public void testForID_Invalid() {
        try {
            DateTimeZone.forID("No_Such_Zone");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testForOffsetHours() {
        assertEquals(0L, DateTimeZone.forOffsetHours(0).getOffset(0L));
        assertEquals(2L * HOUR, DateTimeZone.forOffsetHours(2).getOffset(0L));
        assertEquals(-2L * HOUR, DateTimeZone.forOffsetHours(-2).getOffset(0L));
    }

    @Test
    public void testForOffsetHoursMinutes() {
        assertEquals(90L * MINUTE, DateTimeZone.forOffsetHoursMinutes(1, 30).getOffset(0L));
        assertEquals(-90L * MINUTE, DateTimeZone.forOffsetHoursMinutes(-1, 30).getOffset(0L));
        assertEquals(5L * HOUR + 45L * MINUTE, DateTimeZone.forOffsetHoursMinutes(5, 45).getOffset(0L));
    }

    @Test
    public void testForOffsetHoursMinutes_Invalid() {
        try {
            DateTimeZone.forOffsetHoursMinutes(0, 60);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            DateTimeZone.forOffsetHoursMinutes(0, -1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            DateTimeZone.forOffsetHoursMinutes(Integer.MAX_VALUE, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testForOffsetMillis() {
        int positive = (int) (5L * HOUR + 30L * MINUTE);
        assertEquals(positive, DateTimeZone.forOffsetMillis(positive).getOffset(0L));

        int negative = (int) (-5L * HOUR);
        assertEquals(negative, DateTimeZone.forOffsetMillis(negative).getOffset(0L));
    }

    @Test
    public void testForTimeZone() {
        DateTimeZone zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("America/New_York"));
        assertNotNull(zone);
        assertEquals("America/New_York", zone.getID());
    }

    @Test
    public void testAvailableIDs() {
        assertNotNull(DateTimeZone.getAvailableIDs());
        assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
    }

    @Test
    public void testSetProvider_Valid() {
        assertTrue(DateTimeZone.getProvider() instanceof DateTimeZone.Provider);
        DateTimeZone.setProvider(new UTCProvider());
        assertTrue(DateTimeZone.getProvider() instanceof UTCProvider);
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test
    public void testSetProvider_Null() {
        DateTimeZone.setProvider(null);
        assertNotNull(DateTimeZone.getProvider());
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_Invalid() {
        DateTimeZone.setProvider(new InvalidProvider());
    }

    @Test
    public void testUTCInstance() {
        assertEquals("UTC", DateTimeZone.UTC.getID());
        assertTrue(DateTimeZone.UTC.isFixed());
        assertEquals(0, DateTimeZone.UTC.getOffset(0L));
        assertEquals(0, DateTimeZone.UTC.getStandardOffset(0L));
        assertTrue(DateTimeZone.UTC.isStandardOffset(0L));
        assertFalse(DateTimeZone.UTC.isLocalDateTimeGap(new LocalDateTime(2000, 1, 1, 0, 0)));

        assertEquals(0L, DateTimeZone.UTC.convertUTCToLocal(0L));
        assertEquals(0L, DateTimeZone.UTC.convertLocalToUTC(0L, false));
        assertEquals(0L, DateTimeZone.UTC.convertLocalToUTC(0L, true));
        assertEquals(0L, DateTimeZone.UTC.convertLocalToUTC(0L, false, 0L));
        assertEquals(0L, DateTimeZone.UTC.getOffsetFromLocal(0L));

        assertEquals(0L, DateTimeZone.UTC.adjustOffset(0L, true));
        assertEquals(0L, DateTimeZone.UTC.adjustOffset(0L, false));
    }

    @Test
    public void testGetOffset_NullReadableInstant() {
        assertEquals(0, DateTimeZone.UTC.getOffset((ReadableInstant) null));
    }

    @Test
    public void testGetMillisKeepLocal() {
        assertEquals(123456L, DateTimeZone.UTC.getMillisKeepLocal(DateTimeZone.UTC, 123456L));

        DateTimeZone original = DateTimeZone.getDefault();
        try {
            DateTimeZone.setDefault(DateTimeZone.UTC);
            assertEquals(123456L, DateTimeZone.UTC.getMillisKeepLocal(null, 123456L));
        } finally {
            DateTimeZone.setDefault(original);
        }
    }

    @Test
    public void testFixedOffsetZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);

        assertTrue(zone.isFixed());
        assertEquals("+02:00", zone.getID());
        assertEquals(2L * HOUR, zone.getOffset(0L));
        assertEquals(2L * HOUR, zone.getStandardOffset(0L));
        assertTrue(zone.isStandardOffset(0L));
        assertFalse(zone.isLocalDateTimeGap(new LocalDateTime(2000, 1, 1, 0, 0)));

        assertEquals(2L * HOUR, zone.convertUTCToLocal(0L));
        assertEquals(-2L * HOUR, zone.convertLocalToUTC(0L, false));
        assertEquals(2L * HOUR, zone.getOffsetFromLocal(0L));
        assertEquals(123L, zone.adjustOffset(123L, true));
        assertEquals("+02:00", zone.getName(0L));
        assertEquals("+02:00", zone.getShortName(0L));
    }

    @Test
    public void testNamedZoneOffsets() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");

        assertFalse(zone.isFixed());
        assertEquals("America/New_York", zone.getID());

        long jan = new DateTime(2000, 1, 1, 0, 0, DateTimeZone.UTC).getMillis();
        long jul = new DateTime(2000, 7, 1, 0, 0, DateTimeZone.UTC).getMillis();

        assertEquals(-5L * HOUR, zone.getOffset(jan));
        assertEquals(-4L * HOUR, zone.getOffset(jul));
        assertEquals(-5L * HOUR, zone.getStandardOffset(jan));
        assertEquals(-5L * HOUR, zone.getStandardOffset(jul));

        assertTrue(zone.isStandardOffset(jan));
        assertFalse(zone.isStandardOffset(jul));
    }

    @Test
    public void testIsLocalDateTimeGap() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");

        assertFalse(zone.isLocalDateTimeGap(new LocalDateTime(2000, 1, 1, 0, 0)));
        assertTrue(zone.isLocalDateTimeGap(new LocalDateTime(2000, 4, 2, 2, 30)));
    }

    @Test
    public void testToTimeZone() {
        assertEquals("UTC", DateTimeZone.UTC.toTimeZone().getID());

        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        assertEquals("America/New_York", zone.toTimeZone().getID());
    }

    private static class UTCProvider implements DateTimeZone.Provider {
        @Override
        public DateTimeZone getZone(String id) {
            return "UTC".equals(id) ? DateTimeZone.UTC : null;
        }

        @Override
        public Set<String> getAvailableIDs() {
            return Collections.singleton("UTC");
        }
    }

    private static class InvalidProvider implements DateTimeZone.Provider {
        @Override
        public DateTimeZone getZone(String id) {
            return null;
        }

        @Override
        public Set<String> getAvailableIDs() {
            return null;
        }
    }
}