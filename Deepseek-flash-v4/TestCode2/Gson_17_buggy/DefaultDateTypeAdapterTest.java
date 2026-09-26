package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

public class DefaultDateTypeAdapterTest {

    private static final long REF_TIME = 1514764800000L;
    private static final Date REF_DATE = new Date(REF_TIME);

    @Test
    public void testConstructorValidDateTypes() {
        new DefaultDateTypeAdapter(Date.class);
        new DefaultDateTypeAdapter(Timestamp.class);
        new DefaultDateTypeAdapter(java.sql.Date.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidDateType() {
        new DefaultDateTypeAdapter(String.class);
    }

    @Test
    public void testWriteNull() throws IOException {
        DateFormat enUs = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        enUs.setTimeZone(TimeZone.getTimeZone("UTC"));
        DateFormat local = new SimpleDateFormat("yyyy-MM-dd");
        local.setTimeZone(TimeZone.getTimeZone("UTC"));
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, enUs, local);
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, null);
        writer.flush();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testWriteDateWithPattern() throws IOException {
        DateFormat enUs = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        enUs.setTimeZone(TimeZone.getTimeZone("UTC"));
        DateFormat local = new SimpleDateFormat("yyyy-MM-dd");
        local.setTimeZone(TimeZone.getTimeZone("UTC"));
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, enUs, local);
        StringWriter sw = new StringWriter();
        JsonWriter writer = new JsonWriter(sw);
        adapter.write(writer, REF_DATE);
        writer.flush();
        assertEquals("\"2018-01-01\"", sw.toString());
    }

    @Test
    public void testReadDateWithPattern() throws IOException {
        DateFormat enUs = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        enUs.setTimeZone(TimeZone.getTimeZone("UTC"));
        DateFormat local = new SimpleDateFormat("yyyy-MM-dd");
        local.setTimeZone(TimeZone.getTimeZone("UTC"));
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, enUs, local);
        JsonReader reader = new JsonReader(new StringReader("\"2018-01-01\""));
        Date result = adapter.read(reader);
        assertNotNull(result);
        assertEquals(REF_TIME, result.getTime());
    }

    @Test
    public void testReadTimestampWithPattern() throws IOException {
        DateFormat enUs = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        enUs.setTimeZone(TimeZone.getTimeZone("UTC"));
        DateFormat local = new SimpleDateFormat("yyyy-MM-dd");
        local.setTimeZone(TimeZone.getTimeZone("UTC"));
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Timestamp.class, enUs, local);
        JsonReader reader = new JsonReader(new StringReader("\"2018-01-01\""));
        Date result = adapter.read(reader);
        assertNotNull(result);
        assertTrue(result instanceof Timestamp);
        assertEquals(REF_TIME, result.getTime());
    }

    @Test
    public void testReadSqlDateWithPattern() throws IOException {
        DateFormat enUs = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        enUs.setTimeZone(TimeZone.getTimeZone("UTC"));
        DateFormat local = new SimpleDateFormat("yyyy-MM-dd");
        local.setTimeZone(TimeZone.getTimeZone("UTC"));
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(java.sql.Date.class, enUs, local);
        JsonReader reader = new JsonReader(new StringReader("\"2018-01-01\""));
        Date result = adapter.read(reader);
        assertNotNull(result);
        assertTrue(result instanceof java.sql.Date);
        assertEquals(REF_TIME, result.getTime());
    }

    @Test
    public void testReadFallbackToEnUs() throws IOException {
        DateFormat local = new SimpleDateFormat("yy/MM/dd");
        local.setTimeZone(TimeZone.getTimeZone("UTC"));
        DateFormat enUs = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        enUs.setTimeZone(TimeZone.getTimeZone("UTC"));
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, enUs, local);
        JsonReader reader = new JsonReader(new StringReader("\"2018-01-01\""));
        Date result = adapter.read(reader);
        assertNotNull(result);
        assertEquals(REF_TIME, result.getTime());
    }

    @Test
    public void testReadFallbackToIso8601() throws IOException {
        DateFormat local = new SimpleDateFormat("yyyy/MM/dd");
        local.setTimeZone(TimeZone.getTimeZone("UTC"));
        DateFormat enUs = new SimpleDateFormat("yyyy/MM/dd", Locale.US);
        enUs.setTimeZone(TimeZone.getTimeZone("UTC"));
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, enUs, local);
        JsonReader reader = new JsonReader(new StringReader("\"2018-01-01T00:00:00Z\""));
        Date result = adapter.read(reader);
        assertNotNull(result);
        assertEquals(REF_TIME, result.getTime());
    }

    @Test(expected = JsonSyntaxException.class)
    public void testReadInvalidDateFormat() throws IOException {
        DateFormat local = new SimpleDateFormat("yyyy-MM-dd");
        local.setTimeZone(TimeZone.getTimeZone("UTC"));
        DateFormat enUs = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        enUs.setTimeZone(TimeZone.getTimeZone("UTC"));
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, enUs, local);
        JsonReader reader = new JsonReader(new StringReader("\"not-a-date\""));
        adapter.read(reader);
    }

    @Test(expected = JsonParseException.class)
    public void testReadNonStringToken() throws IOException {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
        JsonReader reader = new JsonReader(new StringReader("12345"));
        adapter.read(reader);
    }

    @Test
    public void testToString() {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
        String str = adapter.toString();
        assertNotNull(str);
        assertTrue(str.contains("DefaultDateTypeAdapter"));
        assertTrue(str.contains("SimpleDateFormat"));
    }
}