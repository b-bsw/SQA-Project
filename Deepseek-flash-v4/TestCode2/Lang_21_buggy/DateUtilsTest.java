import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

import org.junit.Test;

public class DateUtilsTest {

    private Calendar newCalendar(int year, int month, int date,
                                 int hour, int minute, int second, int millis) {
        Calendar c = Calendar.getInstance();
        c.clear();
        c.set(year, month, date, hour, minute, second);
        c.set(Calendar.MILLISECOND, millis);
        return c;
    }

    @Test
    public void testConstructor() {
        assertNotNull(new DateUtils());
    }

    @Test
    public void testIsSameDay() {
        Calendar c1 = newCalendar(2020, Calendar.JUNE, 15, 1, 2, 3, 4);
        Calendar c2 = newCalendar(2020, Calendar.JUNE, 15, 23, 59, 59, 999);

        assertTrue(DateUtils.isSameDay(c1.getTime(), c2.getTime()));

        c2.add(Calendar.DATE, 1);
        assertFalse(DateUtils.isSameDay(c1.getTime(), c2.getTime()));
    }

    @Test
    public void testIsSameInstant() {
        assertTrue(DateUtils.isSameInstant(new Date(12345L), new Date(12345L)));
        assertTrue(DateUtils.isSameInstant(new Date(12345L), new Date(12345L)));
        assertFalse(DateUtils.isSameInstant(new Date(12345L), new Date(54321L)));
    }

    @Test
    public void testIsSameLocalTime() {
        Calendar c1 = newCalendar(2020, Calendar.JUNE, 15, 10, 20, 30, 40);
        Calendar c2 = newCalendar(2020, Calendar.JUNE, 15, 10, 20, 30, 40);

        assertTrue(DateUtils.isSameLocalTime(c1, c2));

        c2.add(Calendar.HOUR_OF_DAY, 1);
        assertFalse(DateUtils.isSameLocalTime(c1, c2));
    }

    @Test
    public void testParseDate() throws Exception {
        Date date = DateUtils.parseDate("2020-06-15", "yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.setTime(date);

        assertEquals(2020, c.get(Calendar.YEAR));
        assertEquals(Calendar.JUNE, c.get(Calendar.MONTH));
        assertEquals(15, c.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testParseDateStrictlyRejectsInvalidDate() {
        try {
            DateUtils.parseDateStrictly("2021-02-29", "yyyy-MM-dd");
            fail("Expected ParseException");
        } catch (ParseException e) {
            // expected
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDateNull() throws Exception {
        DateUtils.parseDate(null, "yyyy-MM-dd");
    }

    @Test
    public void testAddDays() throws Exception {
        Date original = DateUtils.parseDate(
                "2020-01-31 23:59:59.999",
                "yyyy-MM-dd HH:mm:ss.SSS");

        Calendar expected = Calendar.getInstance();
        expected.setTime(original);
        expected.add(Calendar.DAY_OF_MONTH, 1);

        Date result = DateUtils.addDays(original, 1);
        assertEquals(expected.getTime().getTime(), result.getTime());
    }

    @Test
    public void testSetSeconds() {
        Calendar base = newCalendar(2020, Calendar.JUNE, 15, 10, 20, 30, 40);
        Calendar expected = newCalendar(2020, Calendar.JUNE, 15, 10, 20, 0, 40);

        Date result = DateUtils.setSeconds(base.getTime(), 0);
        assertEquals(expected.getTime().getTime(), result.getTime());
    }

    @Test
    public void testToCalendar() {
        Date date = new Date(123456789L);
        Calendar calendar = DateUtils.toCalendar(date);

        assertNotNull(calendar);
        assertEquals(date.getTime(), calendar.getTime().getTime());
    }

    @Test
    public void testTruncateToHour() {
        Calendar cal = newCalendar(2020, Calendar.JUNE, 15, 12, 34, 56, 789);
        Calendar expected = newCalendar(2020, Calendar.JUNE, 15, 12, 0, 0, 0);

        Date truncated = DateUtils.truncate(cal.getTime(), Calendar.HOUR_OF_DAY);
        assertEquals(expected.getTime().getTime(), truncated.getTime());
    }

    @Test
    public void testTruncateToDate() {
        Calendar cal = newCalendar(2020, Calendar.JUNE, 15, 12, 34, 56, 789);
        Calendar expected = newCalendar(2020, Calendar.JUNE, 15, 0, 0, 0, 0);

        Date truncated = DateUtils.truncate(cal.getTime(), Calendar.DATE);
        assertEquals(expected.getTime().getTime(), truncated.getTime());
    }

    @Test
    public void testTruncatedEquals() {
        Calendar c1 = newCalendar(2020, Calendar.JUNE, 15, 8, 0, 0, 0);
        Calendar c2 = newCalendar(2020, Calendar.JUNE, 15, 22, 0, 0, 0);

        assertTrue(DateUtils.truncatedEquals(c1, c2, Calendar.DATE));
        assertEquals(0, DateUtils.truncatedCompareTo(c1, c2, Calendar.DATE));
    }

    @Test
    public void testGetFragmentMethods() {
        Calendar cal = newCalendar(2020, Calendar.JUNE, 15, 6, 7, 8, 9);

        assertEquals(9L, DateUtils.getFragmentInMilliseconds(cal, Calendar.SECOND));
        assertEquals(8L, DateUtils.getFragmentInSeconds(cal, Calendar.MINUTE));
        assertEquals(7L, DateUtils.getFragmentInMinutes(cal, Calendar.HOUR_OF_DAY));
        assertEquals(15L, DateUtils.getFragmentInDays(cal, Calendar.MONTH));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFragmentNullCalendar() {
        DateUtils.getFragmentInDays((Calendar) null, Calendar.YEAR);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFragmentInvalidFragment() {
        DateUtils.getFragmentInDays(Calendar.getInstance(), 999);
    }

    @Test
    public void testIterator() {
        Calendar cal = newCalendar(2020, Calendar.JUNE, 15, 0, 0, 0, 0);
        Iterator<Calendar> iterator = DateUtils.iterator(cal, DateUtils.RANGE_WEEK_SUNDAY);

        assertNotNull(iterator);
        assertTrue(iterator.hasNext());
        assertNotNull(iterator.next());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIteratorNullDate() {
        DateUtils.iterator((Date) null, DateUtils.RANGE_WEEK_SUNDAY);
    }
}