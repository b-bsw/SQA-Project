package org.joda.time;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DateTimeZoneTest {

    private DateTimeZone originalDefault;
    private DateTimeZone.Provider originalProvider;
    private DateTimeZone.NameProvider originalNameProvider;

    @Before
    public void setUp() {
        originalDefault = DateTimeZone.getDefault();
        originalProvider = DateTimeZone.getProvider();
        originalNameProvider = DateTimeZone.getNameProvider();
    }

    @After
    public void tearDown() {
        DateTimeZone.setNameProvider(originalNameProvider);
        DateTimeZone.setProvider(originalProvider);
        DateTimeZone.setDefault(originalDefault);
    }

    @Test
    public void testForID_NullUsesDefault() {
        assertSame(DateTimeZone.getDefault(), DateTimeZone.forID(null));
    }

    @Test
    public void testForID_UTC() {
        DateTimeZone zone = DateTimeZone.forID("UTC");
        assertNotNull(zone);
        assertEquals("UTC", zone.getID());
        assertEquals(0L, zone.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_EmptyStringThrows() {
        DateTimeZone.forID("");
    }

    @Test
    public void testForOffsetHours() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertNotNull(zone);
        assertTrue(zone.isFixed());
        assertEquals(7200000L, zone.getOffset(0L));
    }

    @Test
    public void testGetAvailableIDs_ContainsUTC() {
        assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
    }

    @Test
    public void testSetDefault() {
        DateTimeZone original = DateTimeZone.getDefault();
        try {
            DateTimeZone custom = DateTimeZone.forOffsetHours(9);
            DateTimeZone.setDefault(custom);
            assertSame(custom, DateTimeZone.getDefault());
        } finally {
            DateTimeZone.setDefault(original);
        }
    }

    @Test
    public void testProviderAndNameProviderAvailable() {
        assertNotNull(DateTimeZone.getProvider());
        assertNotNull(DateTimeZone.getNameProvider());
    }

    @Test
    public void testGetOffset_ReadableInstantNull() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        assertEquals(3600000, zone.getOffset((ReadableInstant) null));
    }

    @Test
    public void testGetOffsetFromLocal_FixedOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals(7200000, zone.getOffsetFromLocal(123L));
    }

    @Test
    public void testConvertUTCToLocal_FixedOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals(7200000L + 123L, zone.convertUTCToLocal(123L));
    }

    @Test
    public void testConvertLocalToUTC_FixedOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertEquals(0L, zone.convertLocalToUTC(7200000L, false));
    }

    @Test
    public void testGetMillisKeepLocal_SameZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        long instant = 123456789L;
        assertEquals(instant, zone.getMillisKeepLocal(zone, instant));
    }

    @Test
    public void testIsLocalDateTimeGap_FixedOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertFalse(zone.isLocalDateTimeGap(new LocalDateTime(2024, 3, 10, 2, 30)));
    }

    @Test
    public void testIsLocalDateTimeGap_NewYorkGap() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        assertTrue(zone.isLocalDateTimeGap(new LocalDateTime(2024, 3, 10, 2, 30)));
        assertFalse(zone.isLocalDateTimeGap(new LocalDateTime(2024, 11, 3, 1, 30)));
    }

    @Test
    public void testConvertLocalToUTC_StrictGapThrows() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        try {
            zone.convertLocalToUTC(1710037800000L, true);
            fail("Expected IllegalArgumentException for a gap");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testAdjustOffset_FixedOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        long instant = 42L;
        assertEquals(instant, zone.adjustOffset(instant, true));
        assertEquals(instant, zone.adjustOffset(instant, false));
    }

    @Test
    public void testGetNameAndShortName_UTC() {
        assertEquals("UTC", DateTimeZone.UTC.getName(0L));
        assertEquals("UTC", DateTimeZone.UTC.getShortName(0L));
    }

    @Test
    public void testToTimeZone() {
        assertEquals("UTC", DateTimeZone.UTC.toTimeZone().getID());
        assertEquals(3600000, DateTimeZone.forOffsetHours(1).toTimeZone().getRawOffset());
    }

    @Test
    public void testEqualsAndHashCode() {
        DateTimeZone zone1 = DateTimeZone.forOffsetHours(5);
        DateTimeZone zone2 = DateTimeZone.forOffsetHours(5);
        assertEquals(zone1, zone2);
        assertEquals(zone1.hashCode(), zone2.hashCode());
        assertFalse(zone1.equals(null));
        assertFalse(zone1.equals("not-a-datetimezone"));
    }

    @Test
    public void testToString_ReturnsID() {
        assertEquals("UTC", DateTimeZone.UTC.toString());
    }

    @Test
    public void testNewYork_OffsetsAtKnownInstants() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        assertNotNull(zone);
        assertFalse(zone.isFixed());

        // 1970-01-01 is standard time in New York.
        assertEquals(-18000000L, zone.getOffset(0L));

        // 2024-03-10T10:00Z is after the spring-forward transition.
        assertEquals(-14400000L, zone.getOffset(1710064800000L));

        assertTrue(zone.isStandardOffset(0L));
        assertFalse(zone.isStandardOffset(1710064800000L));
    }
}