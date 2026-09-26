package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.Closeable;
import java.io.Flushable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class CSVPrinterTest {

    private static class TestAppendable extends StringBuilder implements Closeable, Flushable {
        boolean closed;
        boolean flushed;

        public void close() {
            closed = true;
        }

        public void flush() {
            flushed = true;
        }
    }

    private CSVFormat rawFormat() {
        return CSVFormat.DEFAULT
                .withDelimiter(',')
                .withQuote((Character) null)
                .withEscape((Character) null)
                .withQuotePolicy(Quote.MINIMAL)
                .withCommentMarker((Character) null)
                .withNullString(null)
                .withRecordSeparator("\n");
    }

    @Test
    public void testConstructorRejectsNulls() throws Exception {
        try {
            new CSVPrinter((Appendable) null, rawFormat());
            fail("Expected NullPointerException");
        } catch (Exception expected) {
        }

        try {
            new CSVPrinter(new StringBuilder(), null);
            fail("Expected NullPointerException");
        } catch (Exception expected) {
        }
    }

    @Test
    public void testPrintRawValueAndDelimiter() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out, rawFormat());

        printer.print("a");
        printer.print("b");
        printer.println();
        printer.print("c");

        assertEquals("a,b\nc", out.toString());
    }

    @Test
    public void testPrintNullUsesEmptyAndNullString() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out, rawFormat());
        printer.print((Object) null);
        assertEquals("", out.toString());

        out.setLength(0);
        printer = new CSVPrinter(out, rawFormat().withNullString("NULL"));
        printer.print((Object) null);
        assertEquals("NULL", out.toString());
    }

    @Test
    public void testPrintEscapesDelimiterAndNewline() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out, rawFormat().withEscape('\\'));

        printer.print("a,b\nc");

        assertEquals("a\\,b\\nc", out.toString());
    }

    @Test
    public void testQuoting() throws Exception {
        StringBuilder out = new StringBuilder();

        CSVFormat all = CSVFormat.DEFAULT
                .withQuote('"')
                .withQuotePolicy(Quote.ALL);
        CSVPrinter printer = new CSVPrinter(out, all);
        printer.print("x");
        assertEquals("\"x\"", out.toString());

        out.setLength(0);
        CSVFormat minimal = CSVFormat.DEFAULT
                .withQuote('"')
                .withQuotePolicy(Quote.MINIMAL);
        printer = new CSVPrinter(out, minimal);
        printer.print("plain");
        assertEquals("plain", out.toString());

        out.setLength(0);
        printer = new CSVPrinter(out, minimal);
        printer.print("a,b");
        assertEquals("\"a,b\"", out.toString());

        out.setLength(0);
        printer = new CSVPrinter(out, minimal);
        printer.print("");
        assertEquals("\"\"", out.toString());

        out.setLength(0);
        CSVFormat nonNumeric = CSVFormat.DEFAULT
                .withQuote('"')
                .withQuotePolicy(Quote.NON_NUMERIC);
        printer = new CSVPrinter(out, nonNumeric);
        printer.print(12);
        assertEquals("12", out.toString());

        out.setLength(0);
        printer = new CSVPrinter(out, nonNumeric);
        printer.print("text");
        assertEquals("\"text\"", out.toString());
    }

    @Test
    public void testPrintComment() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVFormat commentFormat = CSVFormat.DEFAULT
                .withCommentMarker('#')
                .withRecordSeparator("\n");

        CSVPrinter printer = new CSVPrinter(out, commentFormat);
        printer.printComment("hello");
        assertEquals("# hello\n", out.toString());

        out.setLength(0);
        printer = new CSVPrinter(out, commentFormat);
        printer.printComment("a\nb");
        assertEquals("# a\n# b\n", out.toString());
    }

    @Test
    public void testPrintCommentDisabled() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVFormat noComments = CSVFormat.DEFAULT
                .withCommentMarker((Character) null);

        CSVPrinter printer = new CSVPrinter(out, noComments);
        printer.printComment("ignored");

        assertEquals("", out.toString());
    }

    @Test
    public void testPrintRecordIterableAndVarargs() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out, rawFormat());

        printer.printRecord(Arrays.asList("a", "b"));
        assertEquals("a,b\n", out.toString());

        out.setLength(0);
        printer = new CSVPrinter(out, rawFormat());
        printer.printRecord("a", "b");
        assertEquals("a,b\n", out.toString());

        out.setLength(0);
        printer = new CSVPrinter(out, rawFormat());
        printer.printRecord(Collections.emptyList());
        assertEquals("\n", out.toString());

        out.setLength(0);
        printer = new CSVPrinter(out, rawFormat());
        printer.printRecord("a", null);
        assertEquals("a,\n", out.toString());
    }

    @Test
    public void testPrintRecordsIterableAndArray() throws Exception {
        StringBuilder out = new StringBuilder();

        List<Object> records = new ArrayList<Object>();
        records.add(new Object[]{"a", "b"});
        records.add(Collections.singletonList((Object) "c"));
        records.add("d");

        CSVPrinter printer = new CSVPrinter(out, rawFormat());
        printer.printRecords(records);
        assertEquals("a,b\nc\nd\n", out.toString());

        out.setLength(0);
        Object[] recordArray = new Object[]{
                new Object[]{"a", "b"},
                Collections.singletonList((Object) "c"),
                "d"
        };
        printer = new CSVPrinter(out, rawFormat());
        printer.printRecords(recordArray);
        assertEquals("a,b\nc\nd\n", out.toString());
    }

    @Test
    public void testPrintRecordsResultSet() throws Exception {
        StringBuilder out = new StringBuilder();
        CSVPrinter printer = new CSVPrinter(out, rawFormat());

        printer.printRecords(resultSet(2, new String[][]{{"a", "b"}}));

        assertEquals("a,b\n", out.toString());
    }

    @Test
    public void testFlushCloseAndGetOut() throws Exception {
        TestAppendable out = new TestAppendable();
        CSVPrinter printer = new CSVPrinter(out, rawFormat());

        printer.flush();
        printer.close();

        assertTrue(out.flushed);
        assertTrue(out.closed);
        assertSame(out, printer.getOut());
    }

    private ResultSet resultSet(final int columns, final String[][] rows) {
        final int[] cursor = {0};

        ResultSetMetaData meta = (ResultSetMetaData) Proxy.newProxyInstance(
                ResultSetMetaData.class.getClassLoader(),
                new Class<?>[]{ResultSetMetaData.class},
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) {
                        if ("getColumnCount".equals(method.getName())) {
                            return columns;
                        }
                        return defaultValue(method.getReturnType());
                    }
                });

        return (ResultSet) Proxy.newProxyInstance(
                ResultSet.class.getClassLoader(),
                new Class<?>[]{ResultSet.class},
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) {
                        String name = method.getName();

                        if ("next".equals(name)) {
                            if (cursor[0] < rows.length) {
                                cursor[0]++;
                                return true;
                            }
                            return false;
                        }

                        if ("getString".equals(name)) {
                            int column = ((Number) args[0]).intValue() - 1;
                            return rows[cursor[0] - 1][column];
                        }

                        if ("getMetaData".equals(name)) {
                            return meta;
                        }

                        return defaultValue(method.getReturnType());
                    }
                });
    }

    private Object defaultValue(Class<?> type) {
        if (!type.isPrimitive()) {
            return null;
        }
        if (type == boolean.class) {
            return false;
        }
        if (type == int.class) {
            return 0;
        }
        if (type == long.class) {
            return 0L;
        }
        if (type == double.class) {
            return 0D;
        }
        if (type == float.class) {
            return 0F;
        }
        if (type == short.class) {
            return (short) 0;
        }
        if (type == byte.class) {
            return (byte) 0;
        }
        if (type == char.class) {
            return (char) 0;
        }
        return null;
    }
}