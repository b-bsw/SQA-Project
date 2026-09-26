package org.apache.commons.csv;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class CSVParserTest {

    private CSVParser parser;

    @Before
    public void setUp() {
        parser = null;
    }

    @After
    public void tearDown() throws IOException {
        if (parser != null) {
            parser.close();
        }
    }

    @Test
    public void testParseString() throws IOException {
        parser = CSVParser.parse("a,b\n1,2", CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("1", records.get(0).get(0));
        assertEquals("2", records.get(0).get(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseStringNullString() throws IOException {
        CSVParser.parse((String) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseStringNullFormat() throws IOException {
        CSVParser.parse("a,b", (CSVFormat) null);
    }

    @Test
    public void testParseFile() throws IOException {
        File temp = File.createTempFile("csv", ".tmp");
        temp.deleteOnExit();
        try (Writer w = new FileWriter(temp)) {
            w.write("x,y\n3,4");
        }
        parser = CSVParser.parse(temp, CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("3", records.get(0).get(0));
    }

    @Test
    public void testParseURL() throws IOException {
        File temp = File.createTempFile("csv", ".tmp");
        temp.deleteOnExit();
        try (Writer w = new FileWriter(temp)) {
            w.write("a\nb");
        }
        parser = CSVParser.parse(temp.toURI().toURL(), Charset.forName("UTF-8"), CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("b", records.get(0).get(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullReader() throws IOException {
        new CSVParser((Reader) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullFormat() throws IOException {
        new CSVParser(new StringReader("a"), (CSVFormat) null);
    }

    @Test
    public void testGetRecordsEmpty() throws IOException {
        parser = CSVParser.parse("", CSVFormat.DEFAULT);
        assertTrue(parser.getRecords().isEmpty());
    }

    @Test
    public void testGetRecordsMultiple() throws IOException {
        parser = CSVParser.parse("1,2\n3,4\n5,6", CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(3, records.size());
        assertEquals("6", records.get(2).get(1));
    }

    @Test
    public void testIterator() throws IOException {
        parser = CSVParser.parse("a\nb\nc", CSVFormat.DEFAULT);
        Iterator<CSVRecord> iter = parser.iterator();
        assertTrue(iter.hasNext());
        assertEquals("a", iter.next().get(0));
        assertTrue(iter.hasNext());
        assertEquals("b", iter.next().get(0));
        assertTrue(iter.hasNext());
        assertEquals("c", iter.next().get(0));
        assertFalse(iter.hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void testIteratorClosed() throws IOException {
        parser = CSVParser.parse("a\nb", CSVFormat.DEFAULT);
        parser.close();
        parser.iterator().next();
    }

    @Test
    public void testNextRecord() throws IOException {
        parser = CSVParser.parse("x,y", CSVFormat.DEFAULT);
        CSVRecord rec = parser.nextRecord();
        assertNotNull(rec);
        assertEquals("x", rec.get(0));
        assertNull(parser.nextRecord());
    }

    @Test
    public void testHeaderMapDefined() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("colA", "colB");
        parser = CSVParser.parse("1,2\n", format);
        Map<String, Integer> header = parser.getHeaderMap();
        assertEquals(2, header.size());
        assertEquals(Integer.valueOf(0), header.get("colA"));
        assertEquals(Integer.valueOf(1), header.get("colB"));
    }

    @Test
    public void testHeaderMapFromFirstLine() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader();
        parser = CSVParser.parse("h1,h2\nv1,v2", format);
        Map<String, Integer> header = parser.getHeaderMap();
        assertEquals(2, header.size());
        assertEquals(Integer.valueOf(0), header.get("h1"));
        assertEquals(1, parser.getRecords().size());
    }

    @Test
    public void testHeaderMapSkipHeader() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("A","B").withSkipHeaderRecord(true);
        parser = CSVParser.parse("skip1,skip2\nvalA,valB", format);
        Map<String, Integer> header = parser.getHeaderMap();
        assertEquals(2, header.size());
        assertEquals(Integer.valueOf(0), header.get("A"));
        assertEquals("valA", parser.getRecords().get(0).get("A"));
    }

    @Test
    public void testNullString() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        parser = CSVParser.parse("a,NULL\n1,2", format);
        List<CSVRecord> records = parser.getRecords();
        assertNull(records.get(0).get(1));
        assertEquals("2", records.get(1).get(1));
    }

    @Test(expected = IOException.class)
    public void testInvalidToken() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withQuote('"');
        parser = CSVParser.parse("a,\"unclosed", format);
        parser.getRecords();
    }

    @Test
    public void testCommentLine() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        parser = CSVParser.parse("# comment\na,b", format);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals("a", records.get(0).get(0));
    }

    @Test
    public void testIsClosed() throws IOException {
        parser = CSVParser.parse("a", CSVFormat.DEFAULT);
        assertFalse(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testGetCurrentLineNumber() throws IOException {
        parser = CSVParser.parse("a,b\nc,d", CSVFormat.DEFAULT);
        parser.nextRecord();
        assertTrue(parser.getCurrentLineNumber() > 0);
    }

    @Test
    public void testGetRecordNumber() throws IOException {
        parser = CSVParser.parse("a,b\nc,d", CSVFormat.DEFAULT);
        parser.nextRecord();
        assertEquals(1, parser.getRecordNumber());
        parser.nextRecord();
        assertEquals(2, parser.getRecordNumber());
    }
}