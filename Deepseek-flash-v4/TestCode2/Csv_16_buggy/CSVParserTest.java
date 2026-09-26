package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class CSVParserTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullReader() throws IOException {
        new CSVParser(null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullFormat() throws IOException {
        new CSVParser(new StringReader(""), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseNullString() throws IOException {
        CSVParser.parse((String) null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseNullFormat() throws IOException {
        CSVParser.parse("a,b", null);
    }

    @Test
    public void testGetRecordsSimple() throws IOException {
        String csv = "a,b,c\n1,2,3\n4,5,6";
        CSVParser parser = CSVParser.parse(csv, CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(2, records.size());
        assertEquals("1", records.get(0).get(0));
        assertEquals("2", records.get(0).get(1));
        assertEquals("6", records.get(1).get(2));
        parser.close();
    }

    @Test
    public void testGetRecordsEmpty() throws IOException {
        CSVParser parser = CSVParser.parse("", CSVFormat.DEFAULT);
        List<CSVRecord> records = parser.getRecords();
        assertTrue(records.isEmpty());
        parser.close();
    }

    @Test
    public void testHeaderMap() throws IOException {
        CSVFormat format = CSVFormat.RFC4180.withHeader("col1", "col2");
        String csv = "a,b\n1,2";
        CSVParser parser = CSVParser.parse(csv, format);
        Map<String, Integer> headerMap = parser.getHeaderMap();
        assertNotNull(headerMap);
        assertEquals(2, headerMap.size());
        assertTrue(headerMap.containsKey("col1"));
        assertTrue(headerMap.containsKey("col2"));
        assertEquals(Integer.valueOf(0), headerMap.get("col1"));
        assertEquals(Integer.valueOf(1), headerMap.get("col2"));
        parser.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDuplicateHeader() throws IOException {
        CSVFormat format = CSVFormat.RFC4180.withHeader("col", "col");
        CSVParser.parse("a,b", format);
    }

    @Test
    public void testHeaderMapNullWhenNoHeader() throws IOException {
        CSVParser parser = CSVParser.parse("a,b", CSVFormat.DEFAULT);
        assertNull(parser.getHeaderMap());
        parser.close();
    }

    @Test
    public void testIterator() throws IOException {
        String csv = "x,y\n1,2\n3,4";
        CSVParser parser = CSVParser.parse(csv, CSVFormat.DEFAULT);
        int count = 0;
        for (CSVRecord record : parser) {
            count++;
        }
        assertEquals(2, count);
        parser.close();
    }

    @Test(expected = NoSuchElementException.class)
    public void testIteratorNextAfterClose() throws IOException {
        CSVParser parser = CSVParser.parse("a,b", CSVFormat.DEFAULT);
        parser.close();
        parser.iterator().next();
    }

    @Test
    public void testNextRecordNullAtEnd() throws IOException {
        CSVParser parser = CSVParser.parse("a", CSVFormat.DEFAULT);
        assertNotNull(parser.nextRecord());
        assertNull(parser.nextRecord());
        parser.close();
    }

    @Test
    public void testIsClosed() throws IOException {
        CSVParser parser = CSVParser.parse("a", CSVFormat.DEFAULT);
        assertFalse(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testGetCurrentLineNumber() throws IOException {
        String csv = "a,b\nc,d";
        CSVParser parser = CSVParser.parse(csv, CSVFormat.DEFAULT);
        assertEquals(1, parser.getCurrentLineNumber());
        parser.nextRecord();
        assertEquals(1, parser.getCurrentLineNumber());
        parser.nextRecord();
        assertEquals(2, parser.getCurrentLineNumber());
        parser.close();
    }

    @Test
    public void testGetRecordNumber() throws IOException {
        String csv = "a\nb\nc";
        CSVParser parser = CSVParser.parse(csv, CSVFormat.DEFAULT);
        assertEquals(0, parser.getRecordNumber());
        parser.nextRecord();
        assertEquals(1, parser.getRecordNumber());
        parser.nextRecord();
        assertEquals(2, parser.getRecordNumber());
        parser.close();
    }

    @Test
    public void testGetFirstEndOfLine() throws IOException {
        String csv = "a\nb";
        CSVParser parser = CSVParser.parse(csv, CSVFormat.DEFAULT);
        parser.nextRecord();
        String eol = parser.getFirstEndOfLine();
        assertNotNull(eol);
        assertEquals("\n", eol);
        parser.close();
    }

    @Test(expected = IOException.class)
    public void testInvalidParse() throws IOException {
        CSVParser parser = CSVParser.parse("\"unterminated", CSVFormat.DEFAULT);
        parser.getRecords();
    }

    @Test
    public void testTrailingDelimiter() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter(true);
        String csv = "a,b,\n";
        CSVParser parser = CSVParser.parse(csv, format);
        List<CSVRecord> records = parser.getRecords();
        assertEquals(1, records.size());
        assertEquals(2, records.get(0).size());
        assertEquals("a", records.get(0).get(0));
        assertEquals("b", records.get(0).get(1));
        parser.close();
    }

    @Test
    public void testNullString() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        String csv = "a,NULL,c";
        CSVParser parser = CSVParser.parse(csv, format);
        CSVRecord record = parser.nextRecord();
        assertNotNull(record);
        assertEquals("a", record.get(0));
        assertNull(record.get(1));
        assertEquals("c", record.get(2));
        parser.close();
    }

    @Test
    public void testTrim() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withTrim(true);
        String csv = " a , b , c ";
        CSVParser parser = CSVParser.parse(csv, format);
        CSVRecord record = parser.nextRecord();
        assertEquals("a", record.get(0));
        assertEquals("b", record.get(1));
        assertEquals("c", record.get(2));
        parser.close();
    }
}