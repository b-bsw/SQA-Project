package org.joda.time;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;

public class DateTimeZoneTest {

    private DateTimeZone originalDefault;
    private Provider originalProvider;
    private NameProvider originalNameProvider;

    @Before
    public void setUp() {
        originalDefault = DateTimeZone.getDefault();
        originalProvider = DateTimeZone.getProvider();
        originalNameProvider = DateTimeZone.getNameProvider();
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(originalDefault);
        if (originalProvider != null) {
            DateTimeZone.setProvider(originalProvider);
        }
        if (originalNameProvider != null) {
            DateTimeZone.setNameProvider(originalNameProvider);
        }
    }

    // Small fixed-offset zone used to test Provider/NameProvider hooks.
    private static final class FixedZone extends DateTimeZone {

        private final int offset;

        FixedZone(String id, int offset) {
            super(id);
            this.offset = offset;
        }

        @Override
        public String getNameKey(long instant) {
            return "FIXED";
        }

        @Override
        public int getOffset(long instant) {
            return offset;
        }

        @Override
        public int getStandardOffset(long instant) {
            return offset;
        }

        @Override
        public boolean isFixed() {
            return true;
        }

        @Override
        public long nextTransition(long instant) {
            return instant;
        }

        @Override
        public long previousTransition(long instant) {
            return instant;
        }

        @Override
        public boolean equals(Object object) {
            return this == object;
        }
    }

    private static final class TestProvider implements Provider {

        private final Set<String> ids = new HashSet<String>();
        private final DateTimeZone testZone;

        TestProvider() {
            ids.add("UTC");
            ids.add("Test/Zone");
            testZone = new FixedZone("Test/Zone", 3600000);
        }

        @Override
        public DateTimeZone getZone(String id) {
            if ("UTC".equals(id)) {
                return DateTimeZone.UTC;
            }
            if ("Test/Zone".equals(id)) {
                return testZone;
            }
            return null;
        }

        @Override
        public Set<String> getAvailableIDs() {
            return ids;
        }
    }

    private static final class TestNameProvider implements NameProvider {

        @Override
        public String getShortName(Locale locale, String id, String nameKey) {
            return "TST";
        }

        @Override
        public String getName(Locale locale, String id, String nameKey) {
            return "Test Name";
        }
    }

    @Test
    public void testUTCBasics() {
        assertEquals("UTC", DateTimeZone.UTC.getID());
        assertTrue(DateTimeZone.UTC.isFixed());
        assertEquals(0, DateTimeZone.UTC.getOffset(0L));
        assertEquals(0, DateTimeZone.UTC.getStandardOffset(0L));
        assertTrue(DateTimeZone.UTC.isStandardOffset(0L));
        assertEquals(DateTimeZone.UTC, DateTimeZone.UTC);
        assertFalse(DateTimeZone.UTC.equals(null));
        assertFalse(DateTimeZone.UTC.equals("UTC"));
    }

    @Test
    public void testDefaultAndForIDNull() {
        DateTimeZone original = DateTimeZone.getDefault();
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);

        try {
            DateTimeZone.setDefault(zone);
            assertSame(zone, DateTimeZone.getDefault());
            assertSame(zone, DateTimeZone.forID(null));
        } finally {
            DateTimeZone.setDefault(original);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDefaultRejectsNull() {
        DateTimeZone.setDefault(null);
    }

    @Test
    public void testForID() {
        assertNotNull(DateTimeZone.forID("UTC"));
        assertEquals(0L, DateTimeZone.forID("+00:00").getOffset(0L));
        assertEquals(3600000L, DateTimeZone.forID("+01:00").getOffset(0L));

        try {
            DateTimeZone.forID("Not/AZone");
            fail("Expected IllegalArgumentException for unknown zone ID");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testForOffsetHoursMinutes() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        assertEquals(3600000L, zone.getOffset(0L));

        assertEquals(-3600000L, DateTimeZone.forOffsetHours(-1).getOffset(0L));

        assertEquals(
                19800000L,
                DateTimeZone.forOffsetHoursMinutes(5, 30).getOffset(0L));

        assertEquals(
                -19800000L,
                DateTimeZone.forOffsetHoursMinutes(-5, 30).getOffset(0L));

        assertEquals(
                3540000L,
                DateTimeZone.forOffsetHoursMinutes(0, 59).getOffset(0L));

        try {
            DateTimeZone.forOffsetHoursMinutes(0, 60);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }

        try {
            DateTimeZone.forOffsetHoursMinutes(0, -1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }

        try {
            DateTimeZone.forOffsetHoursMinutes(Integer.MAX_VALUE, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testForOffsetMillis() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(3600000);
        assertNotNull(zone);
        assertEquals(3600000L, zone.getOffset(0L));

        DateTimeZone zero = DateTimeZone.forOffsetMillis(0);
        assertNotNull(zero);
        assertEquals(0L, zero.getOffset(0L));
    }

    @Test
    public void testForTimeZone() {
        DateTimeZone zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC"));
        assertNotNull(zone);
        assertEquals(0L, zone.getOffset(0L));

        DateTimeZone newYork = DateTimeZone.forTimeZone(TimeZone.getTimeZone("America/New_York"));
        assertNotNull(newYork);
        assertEquals("America/New_York", newYork.getID());
    }

    @Test
    public void testProviderAndNameProvider() {
        TestProvider provider = new TestProvider();
        DateTimeZone.setProvider(provider);

        assertSame(provider, DateTimeZone.getProvider());
        assertTrue(DateTimeZone.getAvailableIDs().contains("Test/Zone"));

        DateTimeZone zone = DateTimeZone.forID("Test/Zone");
        assertNotNull(zone);
        assertEquals("Test/Zone", zone.getID());

        TestNameProvider names = new TestNameProvider();
        DateTimeZone.setNameProvider(names);
        assertSame(names, DateTimeZone.getNameProvider());

        assertEquals("Test Name", zone.getName(0L, Locale.ENGLISH));
        assertEquals("TST", zone.getShortName(0L, Locale.ENGLISH));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProviderRejectsMissingUTC() {
        DateTimeZone.setProvider(new Provider() {

            private final Set<String> ids = new HashSet<String>();

            {
                ids.add("Test");
            }

            @Override
            public DateTimeZone getZone(String id) {
                return null;
            }

            @Override
            public Set<String> getAvailableIDs() {
                return ids;
            }
        });
    }

    @Test
    public void testFixedZoneConversion() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);

        assertEquals(3600000L, zone.convertUTCToLocal(0L));
        assertEquals(-3600000L, zone.convertLocalToUTC(0L, false));
        assertEquals(-3600000L, zone.convertLocalToUTC(0L, true));
        assertEquals(3600000L, zone.getOffsetFromLocal(0L));
        assertTrue(zone.isStandardOffset(0L));
        assertTrue(zone.isFixed());

        assertEquals(
                3600000L,
                zone.getMillisKeepLocal(DateTimeZone.UTC, 0L));

        try {
            zone.getMillisKeepLocal(null, 0L);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testConvertUTCToLocalOverflow() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);

        try {
            zone.convertUTCToLocal(Long.MAX_VALUE);
            fail("Expected ArithmeticException for overflow");
        } catch (ArithmeticException expected) {
            // expected
        }
    }

    @Test
    public void testRoundTripAroundDSTTransitions() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");

        long t = zone.nextTransition(0L);
        if (t == 0L) {
            t = zone.nextTransition(1L);
        }

        long[] probes = {
                t - 86400000L,
                t - 1L,
                t,
                t + 1L,
                t + 86400000L
        };

        for (long instant : probes) {
            long local = zone.convertUTCToLocal(instant);
            long roundTrip = zone.convertLocalToUTC(local, false, instant);

            assertEquals("Round-trip failed for instant " + instant, instant, roundTrip);
        }
    }
}