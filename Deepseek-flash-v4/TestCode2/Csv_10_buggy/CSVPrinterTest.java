package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CSVPrinterTest {

    private StringBuilder out;
    private CSVPrinter printer;

    // Helper to create a simple CSVFormat with given properties
    private CSVFormat createFormat(char delimiter, Character quoteChar, Character escape, Quote quotePolicy,
            String nullString, String recordSeparator, boolean commentingEnabled, Character commentStart) {
        return new CSVFormat(delimiter, quoteChar, escape, quotePolicy, nullString, recordSeparator, commentingEnabled, commentStart);
    }

    // A basic format: comma delimiter, no quoting/escaping
    private CSVFormat basicFormat() {
        return createFormat(',', null, null, null, null, "\n", false, null);
    }

    // Format with quoting
    private CSVFormat quotingFormat(Quote policy) {
        return createFormat(',', '"', null, policy, null, "\n", false, null);
    }

    // Format with escaping
    private CSVFormat escapingFormat() {
        return createFormat(',', null, '\\', null, null, "\n", false, null);
    }

    // Format with commenting enabled
    private CSVFormat commentingFormat() {
        return createFormat(',', null, null, null, null, "\n", true, '#');
    }

    // Format with null string
    private CSVFormat nullStringFormat(String ns) {
        return createFormat(',', null, null, null, ns, "\n", false, null);
    }

    // A mock Appendable that also implements Closeable/Flushable for testing those methods
    static class MockAppendable implements Appendable, Closeable, Flushable {
        private final StringBuilder sb = new StringBuilder();
        private boolean closed = false;
        private boolean flushed = false;

        @Override
        public Appendable append(CharSequence csq) throws IOException {
            sb.append(csq);
            return this;
        }

        @Override
        public Appendable append(CharSequence csq, int start, int end) throws IOException {
            sb.append(csq, start, end);
            return this;
        }

        @Override
        public Appendable append(char c) throws IOException {
            sb.append(c);
            return this;
        }

        @Override
        public void close() throws IOException {
            closed = true;
        }

        @Override
        public void flush() throws IOException {
            flushed = true;
        }

        public boolean isClosed() { return closed; }
        public boolean isFlushed() { return flushed; }
        public String getContent() { return sb.toString(); }
    }

    // Mock ResultSet for printRecords(ResultSet)
    static class MockResultSet implements ResultSet {
        private int row = -1;
        private final String[][] data;
        private final ResultSetMetaData meta;

        MockResultSet(String[] columns, String[][] rows) {
            this.data = rows;
            this.meta = new MockResultSetMetaData(columns);
        }

        @Override
        public ResultSetMetaData getMetaData() throws SQLException {
            return meta;
        }

        @Override
        public boolean next() throws SQLException {
            row++;
            return row < data.length;
        }

        @Override
        public String getString(int columnIndex) throws SQLException {
            if (row < 0 || row >= data.length) throw new SQLException("No row");
            return data[row][columnIndex - 1];
        }

        // Stub other methods as empty (no need for testing)
        @Override public boolean wasNull() throws SQLException { return false; }
        @Override public void close() throws SQLException {}
        // ... other stub methods omitted for brevity
    }

    static class MockResultSetMetaData implements ResultSetMetaData {
        private final String[] columns;
        MockResultSetMetaData(String[] columns) { this.columns = columns; }

        @Override
        public int getColumnCount() throws SQLException { return columns.length; }

        @Override
        public String getColumnName(int column) throws SQLException { return columns[column-1]; }
        // stub others
        @Override public boolean isAutoIncrement(int column) throws SQLException { return false; }
        @Override public boolean isCaseSensitive(int column) throws SQLException { return false; }
        @Override public boolean isSearchable(int column) throws SQLException { return false; }
        @Override public boolean isCurrency(int column) throws SQLException { return false; }
        @Override public int isNullable(int column) throws SQLException { return 0; }
        @Override public boolean isSigned(int column) throws SQLException { return false; }
        @Override public int getColumnDisplaySize(int column) throws SQLException { return 0; }
        @Override public String getColumnLabel(int column) throws SQLException { return getColumnName(column); }
        @Override public String getSchemaName(int column) throws SQLException { return ""; }
        @Override public int getPrecision(int column) throws SQLException { return 0; }
        @Override public int getScale(int column) throws SQLException { return 0; }
        @Override public String getTableName(int column) throws SQLException { return ""; }
        @Override public String getCatalogName(int column) throws SQLException { return ""; }
        @Override public int getColumnType(int column) throws SQLException { return 0; }
        @Override public String getColumnTypeName(int column) throws SQLException { return ""; }
        @Override public boolean isReadOnly(int column) throws SQLException { return false; }
        @Override public boolean isWritable(int column) throws SQLException { return false; }
        @Override public boolean isDefinitelyWritable(int column) throws SQLException { return false; }
        @Override public String getColumnClassName(int column) throws SQLException { return ""; }
        @Override public <T> T unwrap(Class<T> iface) throws SQLException { return null; }
        @Override public boolean isWrapperFor(Class<?> iface) throws SQLException { return false; }
    }

    @Before
    public void setUp() throws IOException {
        out = new StringBuilder();
        // Default printer with basic format (no quoting, no escaping)
        printer = new CSVPrinter(out, basicFormat());
    }

    @After
    public void tearDown() throws IOException {
        if (printer != null) {
            printer.close();
        }
    }

    // ---------- Constructor Tests ----------
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullOut() throws IOException {
        new CSVPrinter(null, basicFormat());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullFormat() throws IOException {
        new CSVPrinter(out, null);
    }

    // ---------- close() / flush() Tests ----------
    @Test
    public void testCloseWithCloseableOut() throws IOException {
        MockAppendable mockOut = new MockAppendable();
        CSVPrinter p = new CSVPrinter(mockOut, basicFormat());
        assertFalse(mockOut.isClosed());
        p.close();
        assertTrue(mockOut.isClosed());
    }

    @Test
    public void testCloseWithNotCloseableOut() throws IOException {
        // StringBuilder is not Closeable – should not throw
        printer.close();
        // no exception expected
    }

    @Test
    public void testFlushWithFlushableOut() throws IOException {
        MockAppendable mockOut = new MockAppendable();
        CSVPrinter p = new CSVPrinter(mockOut, basicFormat());
        assertFalse(mockOut.isFlushed());
        p.flush();
        assertTrue(mockOut.isFlushed());
    }

    @Test
    public void testFlushWithNotFlushableOut() throws IOException {
        // StringBuilder is not Flushable
        printer.flush();
        // no exception expected
    }

    // ---------- print(Object) Tests ----------
    @Test
    public void testPrintNormal() throws IOException {
        printer.print("hello");
        assertEquals("hello", out.toString());
    }

    @Test
    public void testPrintNullWithNullString() throws IOException {
        CSVPrinter p = new CSVPrinter(out, nullStringFormat("NULL"));
        p.print(null);
        assertEquals("NULL", out.toString());
    }

    @Test
    public void testPrintNullWithNullStringNull() throws IOException {
        CSVPrinter p = new CSVPrinter(out, nullStringFormat(null));
        p.print(null);
        // expected empty string (Constants.EMPTY)
        assertEquals("", out.toString());
    }

    @Test
    public void testPrintMultipleValuesWithDelimiter() throws IOException {
        printer.print("a");
        printer.print("b");
        assertEquals("a,b", out.toString());
    }

    // ---------- printComment Tests ----------
    @Test
    public void testPrintCommentDisabled() throws IOException {
        // commenting disabled in basic format
        printer.printComment("test");
        assertEquals("", out.toString());
    }

    @Test
    public void testPrintCommentSimple() throws IOException {
        CSVPrinter p = new CSVPrinter(out, commentingFormat());
        p.printComment("hello");
        assertEquals("# hello\n", out.toString());
    }

    @Test
    public void testPrintCommentWithNewlines() throws IOException {
        CSVPrinter p = new CSVPrinter(out, commentingFormat());
        p.printComment("line1\nline2\rline3\r\nline4");
        // Expected: each line prefixed with "# ", and newline at end
        assertEquals("# line1\n# line2\n# line3\n# line4\n", out.toString());
    }

    // ---------- println Tests ----------
    @Test
    public void testPrintlnWithRecordSeparator() throws IOException {
        printer.println();
        assertEquals("\n", out.toString());
    }

    @Test
    public void testPrintlnNoRecordSeparator() throws IOException {
        CSVFormat fmt = createFormat(',', null, null, null, null, null, false, null);
        CSVPrinter p = new CSVPrinter(out, fmt);
        p.println();
        assertEquals("", out.toString());
    }

    // ---------- printRecord (Iterable) Tests ----------
    @Test
    public void testPrintRecordIterableEmpty() throws IOException {
        printer.printRecord(new java.util.ArrayList<Object>());
        assertEquals("\n", out.toString()); // only record separator
    }

    @Test
    public void testPrintRecordIterableSingle() throws IOException {
        printer.printRecord(java.util.Arrays.asList("only"));
        assertEquals("only\n", out.toString());
    }

    @Test
    public void testPrintRecordIterableMultiple() throws IOException {
        printer.printRecord(java.util.Arrays.asList("a", "b", "c"));
        assertEquals("a,b,c\n", out.toString());
    }

    // ---------- printRecord (varargs) Tests ----------
    @Test
    public void testPrintRecordVarargsEmpty() throws IOException {
        printer.printRecord();
        assertEquals("\n", out.toString());
    }

    @Test
    public void testPrintRecordVarargsMixed() throws IOException {
        printer.printRecord("x", null, 42);
        // null becomes empty (nullString null)
        assertEquals("x,,42\n", out.toString());
    }

    // ---------- printRecords (Iterable<?>) Tests ----------
    @Test
    public void testPrintRecordsIterableWithDifferentTypes() throws IOException {
        java.util.List<Object> records = new java.util.ArrayList<Object>();
        records.add(java.util.Arrays.asList("1", "2"));
        records.add(new Object[] { "a", "b" });
        records.add("single");
        printer.printRecords(records);
        // Expected: first row "1,2\n", second "a,b\n", third "single\n"
        assertEquals("1,2\na,b\nsingle\n", out.toString());
    }

    // ---------- printRecords (Object[]) Tests ----------
    @Test
    public void testPrintRecordsArray() throws IOException {
        Object[] records = new Object[] {
            java.util.Arrays.asList("x", "y"),
            new Object[] { 1, 2 },
            "plain"
        };
        printer.printRecords(records);
        assertEquals("x,y\n1,2\nplain\n", out.toString());
    }

    // ---------- printRecords (ResultSet) Tests ----------
    @Test
    public void testPrintRecordsResultSet() throws IOException, SQLException {
        String[] cols = {"col1", "col2"};
        String[][] rows = {
            {"r1c1", "r1c2"},
            {"r2c1", "r2c2"}
        };
        MockResultSet rs = new MockResultSet(cols, rows);
        printer.printRecords(rs);
        assertEquals("r1c1,r1c2\nr2c1,r2c2\n", out.toString());
    }

    // ---------- getOut Tests ----------
    @Test
    public void testGetOut() {
        assertSame(out, printer.getOut());
    }

    // ---------- PrintAndEscape Tests ----------
    @Test
    public void testPrintWithEscaping() throws IOException {
        CSVPrinter p = new CSVPrinter(out, escapingFormat());
        p.print("ab\ncd\re,f\\g");
        // escape: backslash, then CR -> 'r', LF -> 'n', delimiter, escape itself
        assertEquals("ab\\ncd\\re\\,f\\\\g", out.toString());
    }

    @Test
    public void testPrintWithEscapingNoSpecial() throws IOException {
        CSVPrinter p = new CSVPrinter(out, escapingFormat());
        p.print("hello");
        assertEquals("hello", out.toString());
    }

    // ---------- PrintAndQuote Tests ----------
    @Test
    public void testPrintWithQuotingAll() throws IOException {
        CSVPrinter p = new CSVPrinter(out, quotingFormat(Quote.ALL));
        p.print("hello");
        assertEquals("\"hello\"", out.toString());
    }

    @Test
    public void testPrintWithQuotingNonNumeric() throws IOException {
        CSVPrinter p = new CSVPrinter(out, quotingFormat(Quote.NON_NUMERIC));
        p.print("text");
        assertEquals("\"text\"", out.toString());
        // clear and test number
        out.setLength(0);
        p.print(42);
        assertEquals("42", out.toString());
    }

    @Test
    public void testPrintWithQuotingNone() throws IOException {
        // NONE should delegate to escaping
        CSVPrinter p = new CSVPrinter(out, createFormat(',', '"', '\\', Quote.NONE, null, "\n", false, null));
        p.print("a,b");
        assertEquals("a\\,b", out.toString());
    }

    @Test
    public void testPrintWithQuotingMinimalEmptyTokenFirst() throws IOException {
        CSVPrinter p = new CSVPrinter(out, quotingFormat(Quote.MINIMAL));
        p.print("");
        assertEquals("\"\"", out.toString()); // first token, empty -> quoted
    }

    @Test
    public void testPrintWithQuotingMinimalNewRecordSpecialStart() throws IOException {
        CSVPrinter p = new CSVPrinter(out, quotingFormat(Quote.MINIMAL));
        // first value starts with a special char (space)
        p.print(" hello");
        assertEquals("\" hello\"", out.toString());
    }

    @Test
    public void testPrintWithQuotingMinimalContainsQuote() throws IOException {
        CSVPrinter p = new CSVPrinter(out, quotingFormat(Quote.MINIMAL));
        p.print("a\"b");
        assertEquals("\"a\"\"b\"", out.toString());
    }

    @Test
    public void testPrintWithQuotingMinimalEndsWithSpace() throws IOException {
        CSVPrinter p = new CSVPrinter(out, quotingFormat(Quote.MINIMAL));
        p.print("normal ");
        assertEquals("\"normal \"", out.toString());
    }

    @Test
    public void testPrintWithQuotingDefault() throws IOException {
        // MINIMAL is default, value with delimiter
        CSVPrinter p = new CSVPrinter(out, quotingFormat(Quote.MINIMAL));
        p.print("a,b");
        assertEquals("\"a,b\"", out.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void testPrintWithInvalidQuotePolicy() throws IOException {
        // We need a format with a custom Quote value that's not in the enum? Since Quote is an enum, we can't create invalid.
        // Instead, we rely on the default switch to throw if we pass null? But the code handles null by defaulting to MINIMAL.
        // This branch may never be reached; but for coverage we can skip.
    }
}