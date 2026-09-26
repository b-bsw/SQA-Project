package org.joda.time;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DateTimeZoneTest {

    private DateTimeZone savedDefaultZone;
    private Provider savedProvider;

    @Before
    public void setUp() {
        savedDefaultZone = DateTimeZone.getDefault();
        savedProvider = DateTimeZone.getProvider();
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(savedDefaultZone);
        DateTimeZone.setProvider(savedProvider);
    }

    @Test
    public void testDefaultZoneIsReasonable() {
        assertNotNull(DateTimeZone.getDefault());
    }

    @Test
    public void testUTCConstants() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
        assertEquals("UTC", DateTimeZone.UTC.getID());
        assertEquals(0, DateTimeZone.UTC.getOffset(0L));
        assertEquals(0, DateTimeZone.UTC.getOffsetFromLocal(0L));
        assertEquals("UTC", DateTimeZone.UTC.toString());
        assertEquals(0L, DateTimeZone.UTC.convertUTCToLocal(0L));
        assertEquals(0L, DateTimeZone.UTC.convertLocalToUTC(0L, true));
        assertTrue(DateTimeZone.UTC.isFixed());
        assertTrue(DateTimeZone.UTC.isStandardOffset(0L));
    }

    @Test
    public void testForID() {
        assertSame(savedDefaultZone, DateTimeZone.forID(null));

        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("+00:00"));

        DateTimeZone plus = DateTimeZone.forID("+01:00");
        assertNotNull(plus);
        assertEquals("+01:00", plus.getID());
        assertEquals(3600000L, plus.getOffset(0L));

        DateTimeZone minus = DateTimeZone.forID("-02:30");
        assertNotNull(minus);
        assertEquals("-02:30", minus.getID());
        assertEquals(-(2 * 60 + 30) * 60 * 1000L, minus.getOffset(0L));

        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        assertNotNull(ny);
        assertEquals("America/New_York", ny.getID());
        assertFalse(ny.isFixed());
    }

    @Test
    public void testForIDInvalid() {
        try {
            DateTimeZone.forID("This/DoesNotExist");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testForOffsetHours() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHours(0));

        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals(2 * 60 * 60 * 1000L, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetHoursMinutes() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0));

        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(1, 30);
        assertEquals((60 + 30) * 60 * 1000L, zone.getOffset(0L));

        DateTimeZone negative = DateTimeZone.forOffsetHoursMinutes(-1, 30);
        assertEquals(-90 * 60 * 1000L, negative.getOffset(0L));
    }

    @Test
    public void testForOffsetHoursMinutesInvalidMinutes() {
        try {
            DateTimeZone.forOffsetHoursMinutes(1, -1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }

        try {
            DateTimeZone.forOffsetHoursMinutes(1, 60);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testForOffsetHoursMinutesOverflow() {
        try {
            DateTimeZone.forOffsetHoursMinutes(Integer.MAX_VALUE, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testForOffsetMillis() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));

        DateTimeZone zone = DateTimeZone.forOffsetMillis(3600000);
        assertEquals(3600000L, zone.getOffset(0L));

        DateTimeZone negative = DateTimeZone.forOffsetMillis(-7200000);
        assertEquals(-7200000L, negative.getOffset(0L));
    }

    @Test
    public void testForTimeZone() {
        DateTimeZone zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("America/New_York"));
        assertNotNull(zone);
        assertEquals("America/New_York", zone.getID());

        DateTimeZone custom = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+02:30"));
        assertNotNull(custom);
        assertEquals("+02:30", custom.getID());
    }

    @Test
    public void testGetOffsetWithReadableInstantNull() {
        assertEquals(0, DateTimeZone.UTC.getOffset((ReadableInstant) null));
    }

    @Test
    public void testConvertLocalToUTCForFixedZone() {
        DateTimeZone plusOne = DateTimeZone.forOffsetHours(1);

        assertEquals(0L, plusOne.convertUTCToLocal(0L));
        assertEquals(-3600000L, plusOne.convertLocalToUTC(0L, true));
        assertEquals(-3600000L, plusOne.convertLocalToUTC(0L, false));
    }

    @Test
    public void testGetOffsetFromLocalForFixedZone() {
        DateTimeZone plusOne = DateTimeZone.forOffsetHours(1);
        assertEquals(3600000L, plusOne.getOffsetFromLocal(0L));

        DateTimeZone minusTwo = DateTimeZone.forOffsetHours(-2);
        assertEquals(-7200000L, minusTwo.getOffsetFromLocal(0L));
    }

    @Test
    public void testGetOffsetForDSTZone() {
        DateTimeZone ny = DateTimeZone.forID("America/New_York");

        long july = new DateTime(2013, 7, 1, 12, 0, ny).getMillis();
        assertEquals(-4 * 60 * 60 * 1000L, ny.getOffset(july));

        long january = new DateTime(2013, 1, 1, 12, 0, ny).getMillis();
        assertEquals(-5 * 60 * 60 * 1000L, ny.getOffset(january));
    }

    @Test
    public void testGetAvailableIDs() {
        Set<String> ids = DateTimeZone.getAvailableIDs();
        assertNotNull(ids);
        assertTrue(ids.contains("UTC"));
        assertTrue(ids.contains("America/New_York"));
    }

    @Test
    public void testSetDefaultAndGetDefault() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        DateTimeZone.setDefault(zone);
        assertSame(zone, DateTimeZone.getDefault());

        DateTimeZone offsetZone = DateTimeZone.forOffsetHours(3);
        assertSame(offsetZone, DateTimeZone.forID(null));
    }

    @Test
    public void testSetDefaultNullRejected() {
        try {
            DateTimeZone.setDefault(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }
        assertSame(savedDefaultZone, DateTimeZone.getDefault());
    }

    @Test
    public void testSetProviderValid() {
        DateTimeZone.setProvider(new UTCProvider());
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test
    public void testSetProviderInvalidRejected() {
        Provider original = DateTimeZone.getProvider();

        Provider invalid = new Provider() {
            @Override
            public DateTimeZone getZone(String id) {
                return null;
            }

            @Override
            public Set<String> getAvailableIDs() {
                return Collections.<String>singleton("LON");
            }
        };

        try {
            DateTimeZone.setProvider(invalid);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }

        assertSame(original, DateTimeZone.getProvider());
    }

    @Test
    public void testGetNameForFixedOffsetZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        assertNotNull(zone.getName(0L));
        assertNotNull(zone.getShortName(0L));
    }

    @Test
    public void testGetNameWithLocale() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        assertNotNull(zone.getName(0L, Locale.ENGLISH));
        assertNotNull(zone.getShortName(0L, Locale.ENGLISH));
    }

    @Test
    public void testHashCodeUsesZoneId() {
        DateTimeZone plusOne = DateTimeZone.forOffsetHours(1);
        assertEquals(57 + plusOne.getID().hashCode(), plusOne.hashCode());
    }

    @Test
    public void testToStringUsesZoneId() {
        DateTimeZone plusOne = DateTimeZone.forOffsetHours(1);
        assertEquals("+01:00", plusOne.toString());
    }
}