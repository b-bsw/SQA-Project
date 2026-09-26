package org.apache.commons.csv;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class CSVParserTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParseStringNullString() throws IOException {
        CSVParser.parse((String) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseStringNullFormat() throws IOException {
        CSVParser.parse("a,b", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullReader() throws IOException {
        new CSVParser(null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullFormat() throws IOException {
        new CSVParser(new StringReader(""), null);
    }

    @Test
    public void testGetRecordsEmpty() throws IOException {
        CSVParser parser = new CSVParser(new StringReader(""), CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertTrue("Records should be empty", records.isEmpty());
    }

    @Test
    public void testGetRecordsSimple() throws IOException {
        String input = "a,b,c\n1,2,3\n4,5,6";
        CSVParser parser = CSVParser.parse(input, CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertEquals("Should have 2 records", 2, records.size());
        assertEquals("First record first value", "1", records.get(0).get(0));
        assertEquals("Second record third value", "6", records.get(1).get(2));
    }

    @Test
    public void testGetRecordsWithHeader() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("col1", "col2");
        String input = "a,b\n1,2";
        CSVParser parser = CSVParser.parse(input, format);
        Map<String, Integer> headerMap = parser.getHeaderMap();
        assertNotNull("Header map should not be null", headerMap);
        assertEquals("col1 index", Integer.valueOf(0), headerMap.get("col1"));
        assertEquals("col2 index", Integer.valueOf(1), headerMap.get("col2"));
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        CSVRecord rec = records.get(0);
        assertEquals("1", rec.get("col1"));
        assertEquals("2", rec.get("col2"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRecordsDuplicateHeader() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("a", "a");
        CSVParser.parse("1,2", format);
    }

    @Test
    public void testGetRecordsEmptyHeaderIgnore() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeader("", "a").withIgnoreEmptyHeaders(true);
        CSVParser parser = CSVParser.parse("x,y", format);
        Map<String, Integer> headerMap = parser.getHeaderMap();
        assertNotNull(headerMap);
        assertTrue(headerMap.containsKey(""));
        assertTrue(headerMap.containsKey("a"));
        assertEquals(Integer.valueOf(0), headerMap.get(""));
        assertEquals(Integer.valueOf(1), headerMap.get("a"));
    }

    @Test
    public void testGetRecordsWithNullString() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        String input = "hello,NULL,world";
        CSVParser parser = CSVParser.parse(input, format);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        CSVRecord rec = records.get(0);
        assertEquals("hello", rec.get(0));
        assertNull("Second field should be null", rec.get(1));
        assertEquals("world", rec.get(2));
    }

    @Test
    public void testIterator() throws IOException {
        String input = "x,y\n1,2\n3,4";
        CSVParser parser = CSVParser.parse(input, CSVFormat.DEFAULT);
        Iterator<CSVRecord> it = parser.iterator();
        assertTrue("hasNext should be true", it.hasNext());
        CSVRecord rec1 = it.next();
        assertEquals("1", rec1.get(0));
        assertTrue(it.hasNext());
        CSVRecord rec2 = it.next();
        assertEquals("3", rec2.get(0));
        assertFalse("No more records", it.hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void testIteratorAfterClose() throws IOException {
        String input = "a";
        CSVParser parser = CSVParser.parse(input, CSVFormat.DEFAULT);
        parser.close();
        Iterator<CSVRecord> it = parser.iterator();
        assertFalse("hasNext should be false after close", it.hasNext());
        it.next(); // should throw NoSuchElementException
    }

    @Test
    public void testCloseIsClosed() throws IOException {
        CSVParser parser = CSVParser.parse("a,b", CSVFormat.DEFAULT);
        assertFalse("Not closed initially", parser.isClosed());
        parser.close();
        assertTrue("Closed after close", parser.isClosed());
    }

    @Test
    public void testGetCurrentLineNumber() throws IOException {
        String input = "a,b\nc,d\ne,f";
        CSVParser parser = CSVParser.parse(input, CSVFormat.DEFAULT);
        parser.getRecords(); // parse all
        assertEquals("Line number should be 3", 3, parser.getCurrentLineNumber());
    }

    @Test
    public void testGetRecordNumber() throws IOException {
        String input = "a,b\n1,2\n3,4";
        CSVParser parser = CSVParser.parse(input, CSVFormat.DEFAULT);
        parser.getRecords();
        assertEquals("Record number should be 2", 2, parser.getRecordNumber());
    }

    @Test
    public void testGetRecordsCollection() throws IOException {
        String input = "x\ny\nz";
        CSVParser parser = CSVParser.parse(input, CSVFormat.DEFAULT);
        ArrayList<CSVRecord> list = new ArrayList<>();
        ArrayList<CSVRecord> result = parser.getRecords(list);
        assertSame("Should return the same collection", list, result);
        assertEquals(3, list.size());
    }

    @Test
    public void testNextRecordComment() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        String input = "# this is a comment\nval1,val2";
        CSVParser parser = CSVParser.parse(input, format);
        CSVRecord rec = parser.nextRecord();
        assertNotNull(rec);
        assertEquals("comment", "# this is a comment", rec.getComment());
        assertEquals("val1", rec.get(0));
        assertEquals("val2", rec.get(1));
    }

    @Test(expected = IOException.class)
    public void testNextRecordInvalid() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT;
        String input = "a,\"b";
        CSVParser parser = CSVParser.parse(input, format);
        parser.getRecords();
    }

    @Test
    public void testGetHeaderMapNull() throws IOException {
        CSVParser parser = CSVParser.parse("a,b", CSVFormat.DEFAULT);
        assertNull("Header map should be null when format has no header", parser.getHeaderMap());
    }
}